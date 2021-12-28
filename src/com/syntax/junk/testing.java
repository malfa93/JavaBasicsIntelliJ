package com.syntax.junk;

class testing {

    double total = 0;
    double avg = 0;
    int times =0;

    double avgElements(double[] arr){

        for(double art:arr){

            times++;
            total+=art;
        }

        avg=total/times;

        return avg;
    }



    public static void main(String[] args) {
        double[] a = {2,7,3,8,4};

        testing main = new testing();

        System.out.println(main.avgElements(a)); //should print 4.8
    }
}
