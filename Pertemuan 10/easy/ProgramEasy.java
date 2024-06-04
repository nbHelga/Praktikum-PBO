import java.util.*;

public class ProgramEasy{
    public static void main(String[] args) {
        List<IFIyer> koleksiBisaTerbang;
        koleksiBisaTerbang = new ArrayList<>();
        
        IFIyer superman = new Superman("superman");
        IFIyer superboy = new Superman("superboy");
        IFIyer supergirl = new Superman("supergirl");
        IFIyer merpati = new Bird();
        IFIyer eagle = new Bird();

        koleksiBisaTerbang.add(merpati);
        koleksiBisaTerbang.add(eagle);
        koleksiBisaTerbang.add(superman);
        koleksiBisaTerbang.add(supergirl);
        koleksiBisaTerbang.add(superboy);

        for(IFIyer bisaTerbang : koleksiBisaTerbang){
            if (bisaTerbang instanceof Superman){
                System.out.println("I'm " + ((Superman)bisaTerbang).getName());
                System.out.println("Bangsa :" + bisaTerbang.getClass().getSuperclass().getSimpleName());
                System.out.print("Makan: ");
                ((Animal) bisaTerbang).eat();
                System.out.println("");
            }else{
                System.out.println("I'm " + bisaTerbang.getClass().getSimpleName());
                System.out.println("Bisa terbang");
                System.out.print("Makan: ");
                ((Animal) bisaTerbang).eat();
                System.out.println("");
            }
        }
    }
}