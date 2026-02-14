package Recursion;
// must remembrable topic
// recursion will be helpful in : Bactracking, dynamic programming
// trees, merge and quick sort
public class basic {
    public static void main(String[] args) {
        // Recursion: function calling itself.
       Kritika(1);// arguements (1,2,3)Arguments wo actual values hoti hain jo hum method ko call karte time pass karte hain
       print(5);
    }
    public static void Kritika(int m ){// parameter like x(Parameters wo variables hote hain jo method ke brackets ke andar likhe jaate hain.)
        if(m==10) return;
        System.out.println("Gourav");
        Kritika(m+1);
    }
    public static void print(int n ){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }

}
