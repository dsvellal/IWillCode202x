public class DiffBetweenArrayElements
{
    public static void main(String[] args) {
        int[] number = {29, -1, 2, 96};
        for (int i = 0; i < number.length; ++i) {
            int diff = i == 0 ? 0 : number[i] - number[i - 1];
            if (diff<0) {
                diff=diff*-1;
                System.out.println(diff);
            } else {
                System.out.println(diff);   
            }
        }
    }
}
