/**
 * Created by USER on 2/13/2020.
 */
public class BigNumbers {

            public static void main(String[] args) {
                String first = "124578";
                String second = "121212";

                int[] numbersFirst = convertStringToIntArray(first);
                int[] numbersSecond = convertStringToIntArray(second);

                StringBuilder sumNumber = getSum(numbersFirst, numbersSecond);
                System.out.println(sumNumber);
            }

            private static StringBuilder getSum(int[] numbersFirst, int[] numbersSecond) {
                StringBuilder number;

                if (numbersFirst.length >= numbersSecond.length) {
                    number = getNumber(numbersFirst, numbersSecond);
                } else {
                    number = getNumber(numbersSecond, numbersFirst);
                }
                return number;
            }

            private static int[] convertStringToIntArray(String string) {
                char[] chars = string.toCharArray();
                int[] numbers = new int[chars.length];
                for (int i = 0; i < chars.length; i++) {
                    numbers[i] = Character.getNumericValue(chars[i]);
                }
                return numbers;
            }

            private static int[] addedZero(int newLength, int[] shortArray) {
                int[] arrayWithZeros = new int[newLength];

                int shortArrayIndex = 0;

                for (int i = 0; i < newLength; i++) {
                    if (i < newLength - shortArray.length) {
                        arrayWithZeros[i] = 0;
                    } else {
                        arrayWithZeros[i] = shortArray[shortArrayIndex];
                        shortArrayIndex++;
                    }
                }
                return arrayWithZeros;
            }

            private static StringBuilder getNumber(int[] longArray, int[] shortArray) {
                int pointNumber;
                StringBuilder number = new StringBuilder();

                int[] arrayWithZeros = addedZero(longArray.length, shortArray);

                int k = 0;
                for (int i = longArray.length - 1; i >= 0; i--) {
                    int sum = longArray[i] + arrayWithZeros[i] + k;

                    if (i == 0) {
                        if (sum > 9) {
                            pointNumber = sum % 10;
                            number.append(pointNumber);
                            number.append(sum / 10);
                        } else {
                            number.append(sum);
                        }
                    } else {
                        if (sum > 9) {
                            pointNumber = sum % 10;
                            k = 1;
                        } else {
                            pointNumber = sum;
                            k = 0;
                        }
                        number.append(pointNumber);
                    }
                }
                return number.reverse();
            }
        }