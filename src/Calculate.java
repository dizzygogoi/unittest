
public class Calculate {
    int sum(int a, int b){
        return a+b;
    }

    int diff(int a,int b){
        return a-b;
    }

    int multiply(int a,int b){
        return a*b;
    }

    int divide(int a,int b){
        if(b==0){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return a/b;
    }

}