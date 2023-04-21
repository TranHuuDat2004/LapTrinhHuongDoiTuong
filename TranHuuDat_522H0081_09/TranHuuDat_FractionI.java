public interface TranHuuDat_FractionI {
    public int getNumer(); //returns numerator part
    public int getDenom(); //returns denominator part
    public void setNumer(int numer); //sets new numerator
    public void setDenom(int denom); //sets new denominator
    public TranHuuDat_FractionI add(TranHuuDat_FractionI f); //returns this + f
    public TranHuuDat_FractionI minus(TranHuuDat_FractionI f); //returns this - f
    public TranHuuDat_FractionI times(TranHuuDat_FractionI f); //returns this * f
    public TranHuuDat_FractionI simplify(); //returns this simplified
    } 
