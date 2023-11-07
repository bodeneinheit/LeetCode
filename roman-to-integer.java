        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            if (currentChar == 'I') {
                result += 1;
            } else if (currentChar == 'V') {
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    result += 4;
                    i--;
                } else {
                    result += 5;
                }
            } else if (currentChar == 'X') {
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    result += 9;
                    i--;
                } else {
                    result += 10;
                }
            } else if (currentChar == 'L') {
                if (i > 0 && s.charAt(i - 1) == 'X') {
                    result += 40;
                    i--;
                } else {
                    result += 50;
                }
            } else if (currentChar == 'C') {
                if (i > 0 && s.charAt(i - 1) == 'X') {
                    result += 90;
                    i--;
                } else {
                    result += 100;
                }
            } else if (currentChar == 'D') {
                if (i > 0 && s.charAt(i - 1) == 'C') {
                    result += 400;
                    i--;
                } else {
                    result += 500;
                }
            } else if (currentChar == 'M') {
                if (i > 0 && s.charAt(i - 1) == 'C') {
                    result += 900;
                    i--;
                } else {
                    result += 1000;
                }
            }
        }
        return result;
    }