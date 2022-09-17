package session2;



public class TamGiac {
    int canh1;
    int canh2;
    int canh3;

    public boolean ktTamGiac(){
        return canh1+canh2 > canh3 && canh1+canh3 > canh2 && canh2+canh3 > canh1;
    }
    public int chuVi(){
        if (!ktTamGiac()) return 0;
        return canh1+canh2+canh3;
    }
    public double dienTich(){
        double cv2 = chuVi()/2.0;
        return Math.sqrt(cv2*(cv2-canh1)*(cv2-canh2)*(cv2-canh3));
    }
}
