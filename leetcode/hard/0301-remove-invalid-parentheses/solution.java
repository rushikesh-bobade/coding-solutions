class Solution {

    private Set<String> answers = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {
        int openToRemove = 0;
        int closeToRemove = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                openToRemove++;
            } else if (ch == ')') {
                if (openToRemove > 0) {
                    openToRemove--;
                } else {
                    closeToRemove++;
                }
            }
        }

        build(s, 0, 0, openToRemove, closeToRemove, new StringBuilder());

        return new ArrayList<>(answers);
    }

    private void build(String s, int index, int balance,
                       int removeOpen, int removeClose,
                       StringBuilder current) {

        if (balance < 0) {
            return;
        }

        if (index == s.length()) {
            if (balance == 0 && removeOpen == 0 && removeClose == 0) {
                answers.add(current.toString());
            }
            return;
        }

        char ch = s.charAt(index);

        if (ch == '(') {
            // Remove this '(' if we still have some unnecessary '(' left.
            if (removeOpen > 0) {
                build(s, index + 1, balance,
                        removeOpen - 1, removeClose, current);
            }

            // Keep it.
            current.append(ch);
            build(s, index + 1, balance + 1,
                    removeOpen, removeClose, current);
            current.deleteCharAt(current.length() - 1);

        } else if (ch == ')') {
            // Remove this ')' if required.
            if (removeClose > 0) {
                build(s, index + 1, balance,
                        removeOpen, removeClose - 1, current);
            }

            // A ')' can only be kept when there is an unmatched '('.
            if (balance > 0) {
                current.append(ch);
                build(s, index + 1, balance - 1,
                        removeOpen, removeClose, current);
                current.deleteCharAt(current.length() - 1);
            }

        } else {
            current.append(ch);
            build(s, index + 1, balance,
                    removeOpen, removeClose, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}