class Solution {
  public boolean isHappy(int n) {
		int sum=0;
		if (n==4) {
			return false;
		} else if (n==1) {
			return true;
		} else {
			while (n > 0) {
				int digit =n % 10;
				sum += digit * digit;
				n /= 10;
			}  
			return isHappy(sum);
		} 
  }
}
