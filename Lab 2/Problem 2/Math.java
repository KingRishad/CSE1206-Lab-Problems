package mathdemo;

/**
 *
 * @author The one who shall not be named
 */
public class Math {
    int value1;
    int value2;
    Math(){
        this.value1 = 0;
        this.value2 = 0;
    }
    Math(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }
    int addNumber(){
        return this.value1+this.value2;
    }
}
