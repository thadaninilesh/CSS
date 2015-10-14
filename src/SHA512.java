import java.security.MessageDigest;


public class SHA512 extends CSS{
	
	static String[] outputSHA512;
	static String error;
	
	static String[] SHA512enc(String input){
		String plain = input;
        if(plain.length()>=3){
            try {
                outputSHA512 = hash(plain);
            } catch (Exception ex) {
                error = "Error occured! Try again";
            }
        }
        else if(plain.length()==0){
            error = "Enter some text to encrypt!";
        }
        else {
            error = "Input string must be atleat 3 characters";
        }
		return outputSHA512;
	}
		
	public static String[] hash(String plain) throws Exception{
	       final MessageDigest sha = MessageDigest.getInstance("SHA-512");
	       sha.update(plain.getBytes());
	       return convertByteToHex(sha.digest());
	   }

	public static String[] convertByteToHex(byte data[]){
		   String t = null;
	       StringBuffer hexData = new StringBuffer();
	       String str[] = new String[data.length]; // interation
	       for (int byteIndex = 0; byteIndex < data.length; byteIndex++){
	    	   t = Integer.toString((data[byteIndex] & 0xff) + 0x100, 16).substring(1);
	           hexData.append(t);
	           str[byteIndex] = hexData.toString(); // interation
	       }
	       return str;
	   }
}