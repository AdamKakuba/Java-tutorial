public enum Computation {
    MULTIPLY{
        public double perform(double x, double y){
          return x*y;
        };
    },
    DIVIDE{
        public double perform(double x, double y){
            return x/y;
        };
    },
    ADD{
    public double perform(double x, double y){
      return x+y;
    };
    },
    SUBSTRACT{
        public double perform(double x, double y){
                return x-y;
                };
    };
    public abstract double perform(double x, double y);
}
