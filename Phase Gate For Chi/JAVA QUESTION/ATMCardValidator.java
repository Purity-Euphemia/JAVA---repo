public class ATMCardValidator {

	public static void main(String[] args) {
        int[] cardNumber = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4};
        ATMCard(cardNumber);
    }

    









public static void ATMCard(int[] array) {
        String issuer = "Unknown";
        boolean isValid;

      
        if (array[0] == 5 && array.length == 16) issuer = "Mastercard";
        else if (array[0] == 6 && array.length == 16) issuer = "Discover";
        else if (array[0] == 3 && array.length == 16) issuer = "America Express";
        else if (array[0] == 4 && array.length == 16) issuer = "Visa";

        
        int sum1 = 0;
        int sum2 = 0;

       
        for (int count = array.length - 2; count >= 0; count -= 2) {
            int product = array[count] * 2;
            if (product > 9) {
                product = (product / 10) + (product % 10);
            }
            sum1 += product;
        }

        
        for (int count = array.length - 1; count >= 0; count -= 2) {
            sum2 += array[count];
        }

        int total = sum1 + sum2;
        isValid = (total % 10 == 0);

      
        System.out.println("Issuer: " + issuer);
        System.out.println("Valid: " + isValid);
    }
}