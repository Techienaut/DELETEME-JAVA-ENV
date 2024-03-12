public class ValidIPAddress {
    public static boolean isValidIPAddress(String ipAddress) {
        String[] octets = ipAddress.split("\\.");
        if (octets.length != 4) {
            return false;
        }
        for (String octet : octets) {
            try {
                int value = Integer.parseInt(octet);
                if (value < 0 || value > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] addresses = {
            "1.2.3.4",
            "4.3.4.5",
            "2.4.5.2"
        };
        for (String address : addresses) {
            System.out.printf("%s is %s%n", address, isValidIPAddress(address) ? "valid" : "invalid");
        }
    }
}
