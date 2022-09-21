package year_2022.month_9.week_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Solution5 {
    private final String pattern = "/^(([1-9]?\\d|1\\d{2}|2([0-4]\\d)|25[0-5]).){3}([1-9]?\\d|1\\d{2}|2([0-4]\\d)|25[0-5])$";
    public int[] solution(String[] ip_addresses, String[] registered_list, String[] banned_list) {
        List<IP> ips = new ArrayList<>();

        for (String address: ip_addresses) {
            validate(address, ips, registered_list, banned_list);
        }
        return ips.stream()
                .mapToInt(ip -> ip.getOrder())
                .toArray();
    }

    private void validate(String address, List<IP> ips, String[] registered_list, String[] banned_list) {
        if (ipValidate(address)) {
            ips.add(IP.VALID_IP_ADDRESS);
            return;
        }
        if (checkBlockedIp(banned_list, address)) {
            ips.add(IP.BLOCKED_IP);
            return;
        }
        boolean isRegistered = checkRegistered(registered_list, address);

        if (isRegistered) {
            ips.add(IP.REGISTERED);
        } else {
            ips.add(IP.NOT_REGISTERED);
        }
    }

    private boolean checkRegistered(String[] registered_list, String address) {
        return contains(registered_list, address);
    }

    private boolean checkBlockedIp(String[] banned_list, String address) {
        return contains(banned_list, address);
    }

    private boolean contains(String[] arr, String target) {
        for (String string: arr) {
            if (string.equals(target)) {
                return true;
            }
        }
        return false;
    }

    private boolean ipValidate(String address) {
        return Pattern.matches(pattern, address);
    }


    public static void main(String[] args) {
        Solution5 s = new Solution5();
        String[] arr = new String[] {"123.023.123.123", "1.1.1.12", "119.123.45.39", "127.0.01"};
        int[] solution = s.solution(arr, new String[]{"119.123.45.39"}, new String[]{"1.1.1.12"});
        System.out.println(Arrays.toString(solution));

    }

    enum IP {
        REGISTERED(0),
        VALID_IP_ADDRESS(1),
        NOT_REGISTERED(2),
        BLOCKED_IP(3);

        int order;

        IP(int order) {
            this.order = order;
        }

        public int getOrder(){
            return order;
        }
    }
}
