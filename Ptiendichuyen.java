
package Ptiendichuyen;
class Hangsanxuat
{
 String tenhangssanxuat;
 String Quocgia;
}
abstract class Ptiendichuyen 
{
    private String loaiphuongtien;
    Hangsanxuat hangsanxuat;
    String laytensanxuat()
    {
    return hangsanxuat.tenhangssanxuat;
    }
    void batdau(){}
    void tangtoc(){}
    void dunglai(){}
    abstract double Layvantoc();
}
class maybay extends Ptiendichuyen
{
    String loainhienlieu;
    @Override
    double Layvantoc(){
        return 10;
    }
    void catcanh(){}
    void hacanh(){}
}
class Oto extends Ptiendichuyen
{
    String loainhienlieu;
@Override
double Layvantoc(){
    return 2;
}

}
class Xedap extends Ptiendichuyen
{
@Override 
double Layvantoc(){
    return 100;
}
}



 