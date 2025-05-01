package parte_basica;
public class Bitwise {
    public static void main(String[] args){
        // & -> é o and
        // ele compara bit a bit, por exemplo, se ele vai comparar o 10 em decimal com o 2 em decimal, essas são as etapas
        // 10(2) =  00001010
        // 2(2) =   00000010
        // 10 & 2 = 00000010

        // compara primeiro (0 and 0) -> 0
        // 1 and 1 -> 1
        // 1 and 0 -> 0
        // e por ai vai
        int t1 = 0;
        int t2 = 255;
        System.out.println(t1 ^ t2);

        // o | é o "or", funciona da mesma forma, comparando os bits, porém, como um or
        // o ^ é o xor, também funciona igual, porém, compara como um xor
    }
}
