

public class CryptoManager extends  {
	
	private static final char LOWER_BOUND = 32;
	private static final char UPPER_BOUND = 95;
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		{

		boolean flag=true;

		for(int i=0;i<plainText.length();i++)

			{

			if(!((int)plainText.charAt(i)>=LOWER_BOUND && (int)plainText.charAt(i)<=UPPER_BOUND)){ 
			flag=false;

			break;

			}

			}
			return flag;}
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {

		key=Wrap_around(key);


		String result="";

		for(int i=0;i<plainText.length();i++)

		{

		result+=Character.toString((char) ((int)plainText.charAt(i)+key));

		}

		return result;

		}


		public static String decryptCaesar (String encryptedText, int key) {


		key=Wrap_around(key);


		String orgn="";


		for(int i=0;i<encryptedText.length();i++)

		{

		orgn+=Character.toString((char) ((int)encryptedText.charAt(i)-key));

		}

		return orgn;

		}

		public static int Wrap_around(int keyb)

		{

		while(keyb>UPPER_BOUND)

		{

		keyb-=(UPPER_BOUND-LOWER_BOUND);

		}

		return keyb;

			}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {

		String result="";

		while(bellasoStr.length()<plainText.length())

		{

		bellasoStr+=bellasoStr.substring(0,(plainText.length()-bellasoStr.length()));

		}

		for(int i=0;i<plainText.length();i++)

		{

		char c=(char)Wrap_around((int)plainText.charAt(i)+(int)bellasoStr.charAt(i) );

		result+=Character.toString(c);

		}

		return result;

		}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	
	public static String decryptBellaso(String encryptedText, String bellasoStr) {

		String result="";

		while(bellasoStr.length()<encryptedText.length())

		{

		bellasoStr+=bellasoStr.substring(0,(encryptedText.length()-bellasoStr.length()));

		}

		for(int i=0;i<encryptedText.length();i++)

		{

		char c=(char)Wrap_around((int)encryptedText.charAt(i)-(int)bellasoStr.charAt(i) );

		result+=Character.toString(c);

		}


		return result;

		}
}