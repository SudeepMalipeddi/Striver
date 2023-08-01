public class recursions {
    int count = 0;
    void func1(){
        if(count == 3) return;
        System.out.println(count);
        count++;
        func1();
    }
    void func2(int i, int n){
        if(i > n) return;
        System.out.println("Muffinman");
        func2(i+1, n);
    }
    void number(int i,int n){
        if(i > n) return;
        System.out.println(i);
        number(i+1, n);
    }
    void num_rev(int i, int n){
        if(i == n) return;
        System.out.println(i);
        num_rev(i-1,n);
    }
    int sum(int i, int n,int sum){
        if(i>n) return sum;
        sum += i;
        return sum(i+1, n, sum);
    }
    int fact(int n){
        if(n == 1) return n;
        return n * fact(n-1);
    }
    void rev(int arr[],int n){
        int p1=0, p2=n-1,temp=0;
        while(p1<=p2){
            temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
    }
    public boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        while(start<=end){
            char first = s.charAt(start);
            char last = s.charAt(end);
            if(!Character.isLetterOrDigit(first)){
                start++;
            }
            else if(!Character.isLetterOrDigit(last)){
                end--;
            }
            else{
                if(Character.toLowerCase(first) != Character.toLowerCase(last)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        recursions r = new recursions();
        // r.func1();
        // r.func2(1, 4);
        // r.number(1, 5);
        // r.num_rev(5, 0);
        // System.out.print(r.sum(1, 5, 0));
        System.out.print(r.fact(5));
    }
}
