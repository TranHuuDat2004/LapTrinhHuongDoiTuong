class TranHuuDat_Fraction implements TranHuuDat_FractionI {    
    // Data members
    private int numer;
    private int denom;
    // Constructors
    public TranHuuDat_Fraction() { 
        this(1,1); 
    }
    public TranHuuDat_Fraction(int numer, int denom) { 
        setNumer(numer); 
        setDenom(denom);
    }

    // Accessors 
    public int getNumer() {
        return this.numer;
    } 
    public int getDenom() { 
        return this.denom;
    } 

    // Mutators
    public void setNumer(int numer) { 
        this.numer = numer;
    }
    public void setDenom(int denom) { 
        this.denom = denom;
    }
    // Returns greatest common divisor of a and b

    // private method as this is not accessible to clients
    private static int gcd(int a, int b) {
        int rem;
        while (b > 0) {
            rem = a%b;
            a = b;
            b = rem;
        }
        return a;
        }

        // Fill in the code for all the methods below
        public TranHuuDat_FractionI simplify() {
            int gcd = gcd(this.numer, this.denom);
            return new TranHuuDat_Fraction(this.numer / gcd, this.denom / gcd);
        }

        public TranHuuDat_FractionI add(TranHuuDat_FractionI f) {
            int numer = (this.numer * ((TranHuuDat_Fraction)f).getDenom()) + (((TranHuuDat_Fraction)f).getNumer() * this.denom);
            int denom = this.denom * ((TranHuuDat_Fraction)f).getDenom();
            return new TranHuuDat_Fraction(numer, denom).simplify();
        }

        public TranHuuDat_FractionI minus(TranHuuDat_FractionI f) {
            int numer = (this.numer * ((TranHuuDat_Fraction)f).getDenom()) - (((TranHuuDat_Fraction)f).getNumer() * this.denom);
            int denom = this.denom * ((TranHuuDat_Fraction)f).getDenom();
            return new TranHuuDat_Fraction(numer, denom).simplify();
        }

        public TranHuuDat_FractionI times(TranHuuDat_FractionI f) {
            int numer = this.numer * ((TranHuuDat_Fraction)f).getNumer();
            int denom = this.denom * ((TranHuuDat_Fraction)f).getDenom();
            return new TranHuuDat_Fraction(numer, denom).simplify();
        }

        // Overriding methods toString() and equals()
        public String toString() {
            if (denom == 1) {
                return numer + "";
            }
            return numer + "/" + denom;
        }

        public boolean equals(Object o) {
            if (o instanceof TranHuuDat_Fraction) {
                TranHuuDat_Fraction f = (TranHuuDat_Fraction) o;
                return this.numer == f.numer && this.denom == f.denom;
            }
        return false;
        }
}
