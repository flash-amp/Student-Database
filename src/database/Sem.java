/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.*;
/**
 *
 * @author Azeez
 */

class cat implements Serializable
{
    private double s1,s2,s3,s4,s5,s6;

    public cat(double s1, double s2, double s3, double s4, double s5, double s6) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
    }

    
    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public double getS3() {
        return s3;
    }

    public double getS4() {
        return s4;
    }

    public double getS5() {
        return s5;
    }

    public double getS6() {
        return s6;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public void setS4(double s4) {
        this.s4 = s4;
    }

    public void setS5(double s5) {
        this.s5 = s5;
    }

    public void setS6(double s6) {
        this.s6 = s6;
    }

}

class Assignment implements Serializable
{
        private double a1,a2,a3,a4,a5,a6;

    public Assignment(double a1, double a2, double a3, double a4, double a5, double a6) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public double getA3() {
        return a3;
    }

    public void setA3(double a3) {
        this.a3 = a3;
    }

    public double getA4() {
        return a4;
    }

    public void setA4(double a4) {
        this.a4 = a4;
    }

    public double getA5() {
        return a5;
    }

    public void setA5(double a5) {
        this.a5 = a5;
    }

    public double getA6() {
        return a6;
    }

    public void setA6(double a6) {
        this.a6 = a6;
    }

        
}

class Result implements Serializable
{   
    private String r1,r2,r3,r4,r5,r6,r7,r8;
    /*public String toString()
    {
        return r1+r2+r3+r4+r5+r6+r7+r8;
    }*/
    
    public String getR7() {
        return r7;
    }

    public void setR7(String r7) {
        this.r7 = r7;
    }

    public String getR8() {
        return r8;
    }

    public void setR8(String r8) {
        this.r8 = r8;
    }

    public String getR1() {
        return r1;
    }

    public void setR1(String r1) {
        this.r1 = r1;
    }

    public String getR2() {
        return r2;
    }

    public void setR2(String r2) {
        this.r2 = r2;
    }

    public String getR3() {
        return r3;
    }

    public void setR3(String r3) {
        this.r3 = r3;
    }

    public String getR4() {
        return r4;
    }

    public void setR4(String r4) {
        this.r4 = r4;
    }

    public String getR5() {
        return r5;
    }

    public void setR5(String r5) {
        this.r5 = r5;
    }

    public String getR6() {
        return r6;
    }

    public void setR6(String r6) {
        this.r6 = r6;
    }
    
}

class theory implements Serializable
{
    private double t1,t2,t3,t4,t5,t6,t7,t8;

    public theory(double t1, double t2, double t3, double t4, double t5, double t6, double t7, double t8) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        this.t6 = t6;
        this.t7 = t7;
        this.t8 = t8;
    }

    public double getT1() {
        return t1;
    }

    public void setT1(double t1) {
        this.t1 = t1;
    }

    public double getT2() {
        return t2;
    }

    public void setT2(double t2) {
        this.t2 = t2;
    }

    public double getT3() {
        return t3;
    }

    public void setT3(double t3) {
        this.t3 = t3;
    }

    public double getT4() {
        return t4;
    }

    public void setT4(double t4) {
        this.t4 = t4;
    }

    public double getT5() {
        return t5;
    }

    public void setT5(double t5) {
        this.t5 = t5;
    }

    public double getT6() {
        return t6;
    }

    public void setT6(double t6) {
        this.t6 = t6;
    }

    public double getT7() {
        return t7;
    }

    public void setT7(double t7) {
        this.t7 = t7;
    }

    public double getT8() {
        return t8;
    }

    public void setT8(double t8) {
        this.t8 = t8;
    }

    
}

class Internals implements Serializable
{
    private double i1,i2,i3,i4,i5,i6,i7,i8;

    public Internals(double i7, double i8) {
        this.i7 = i7;
        this.i8 = i8;
    }
    
   /* public String toString()
    {
        return ""+i1+i2+i3+i4+i5+i6+i7+i8;
    }*/
    
    public double getI7() {
        return i7;
    }

    public void setI7(double i7) {
        this.i7 = i7;
    }

    public double getI8() {
        return i8;
    }

    public void setI8(double i8) {
        this.i8 = i8;
    }

    public double getI1() 
    {
        return i1;
    }

    public void setI1(double i1) {
        this.i1 = i1;
    }

    public double getI2() {
        return i2;
    }

    public void setI2(double i2) 
    {
        this.i2 = i2;
    }

    public double getI3() 
    {
        return i3;
    }

    public void setI3(double i3) 
    {
        this.i3 = i3;
    }

    public double getI4() 
    {
        return i4;
    }

    public void setI4(double i4) 
    {
        this.i4 = i4;
    }

    public double getI5() {
        return i5;
    }

    public void setI5(double i5) {
        this.i5 = i5;
    }

    public double getI6() {
        return i6;
    }

    public void setI6(double i6) {
        this.i6 = i6;
    } 
}

class Sname implements Serializable
{  // private static final long serialVersionUID = 6529685098267757690L;
    String name,n1,n2,n3,n4,n5,n6,n7,n8;
    private double c1,c2,c3,c4,c5,c6,c7,c8;

    public Sname() {
    }

    public Sname(String name, String n1, String n2, String n3, String n4, String n5, String n6, String n7, String n8, double c1, double c2, double c3, double c4, double c5, double c6, double c7, double c8) {
        this.name=name;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
        this.n7 = n7;
        this.n8 = n8;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
        this.c6 = c6;
        this.c7 = c7;
        this.c8 = c8;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getC3() {
        return c3;
    }

    public void setC3(double c3) {
        this.c3 = c3;
    }

    public double getC4() {
        return c4;
    }

    public void setC4(double c4) {
        this.c4 = c4;
    }

    public double getC5() {
        return c5;
    }

    public void setC5(double c5) {
        this.c5 = c5;
    }

    public double getC6() {
        return c6;
    }

    public void setC6(double c6) {
        this.c6 = c6;
    }

    public double getC7() {
        return c7;
    }

    public void setC7(double c7) {
        this.c7 = c7;
    }

    public double getC8() {
        return c8;
    }

    public void setC8(double c8) {
        this.c8 = c8;
    }

   
    public String getN7() {
        return n7;
    }

    public void setN7(String n7) {
        this.n7 = n7;
    }

    public String getN8() {
        return n8;
    }

    public void setN8(String n8) {
        this.n8 = n8;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getN3() {
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3;
    }

    public String getN4() {
        return n4;
    }

    public void setN4(String n4) {
        this.n4 = n4;
    }

    public String getN5() {
        return n5;
    }

    public void setN5(String n5) {
        this.n5 = n5;
    }

    public String getN6() {
        return n6;
    }

    public void setN6(String n6) {
        this.n6 = n6;
    }
    
}


public class Sem implements Serializable
{ 
    private Result result = new Result();
    private cat cat1,cat2,cat3;
    private Assignment assignment;
    private theory th;
    private Internals internal;
    private Sname sname;
    private double GPA;

    /*public String toString()
    {
        return ""+result+cat1+cat2+cat3+assignment+th+internal+sname+GPA;
    }*/
    
    public Sem() {
    }

    public Sem(cat cat1, cat cat2, cat cat3, Assignment assignment, theory th, Internals internal, Sname sname) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.cat3 = cat3;
        this.assignment = assignment;
        this.th = th;
        this.internal = internal;
        this.sname = sname;
        CalInternal();
        CalResult();
        CalGPA();
    }

      public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public cat getCat1() {
        return cat1;
    }

    public void setCat1(cat cat1) {
        this.cat1 = cat1;
    }

    public cat getCat2() {
        return cat2;
    }

    public void setCat2(cat cat2) {
        this.cat2 = cat2;
    }

    public cat getCat3() {
        return cat3;
    }

    public void setCat3(cat cat3) {
        this.cat3 = cat3;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public theory getTh() {
        return th;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setTh(theory th) {
        this.th = th;
    }

    public Internals getInternal() {
        return internal;
    }

    public void setInternal(Internals internal) {
        this.internal = internal;
    }

    public Sname getSname() {
        return sname;
    }

    public void setSname(Sname sname) {
        this.sname = sname;
    }
    
    double Calcat(double c1,double c2,double c3,double i)
    {
        double s1=c1+c2,s2=c2+c3,s3=c1+c3;
        if(s1>s2 && s1>s3)
            return (s1*0.3)+i;
        else if(s2>s3 && s2>s1)
            return (s2*0.3)+i;
        else 
            return (s3*0.3)+i;
    }
    
    
    void CalInternal()
    {
        internal.setI1(Calcat(cat1.getS1(),cat2.getS1(),cat3.getS1(),assignment.getA1()));
        internal.setI2(Calcat(cat1.getS2(),cat2.getS2(),cat3.getS2(),assignment.getA2()));
        internal.setI3(Calcat(cat1.getS3(),cat2.getS3(),cat3.getS3(),assignment.getA3()));
        internal.setI4(Calcat(cat1.getS4(),cat2.getS4(),cat3.getS4(),assignment.getA4()));
        internal.setI5(Calcat(cat1.getS5(),cat2.getS5(),cat3.getS5(),assignment.getA5()));
        internal.setI6(Calcat(cat1.getS6(),cat2.getS6(),cat3.getS6(),assignment.getA6()));
        System.out.println("\n"+internal.getI1());
    }
    
    String Calgrade(double t,double i)
    {
        if(t>=30 && i>=20)
        {
            if(t+i > 90)
                return "O";
            else if(t+i > 80)
                return "A+";
            else if(t+i > 70)
                return "A";
            else if(t+i > 60)
                return "B+";
            else if(t+i > 50)
                return "B";
        }
        return "RA";
    }
    
    double getgrade(double t,double i)
    {
        if(t>=30 && i>=20)
        {
            return (t+i)/10;
        }
        return 0;
    }
    
    void CalResult()
    {
        result.setR1(Calgrade(th.getT1()*0.6,internal.getI1()));
        result.setR2(Calgrade(th.getT1()*0.6,internal.getI2()));
        result.setR3(Calgrade(th.getT3()*0.6,internal.getI3()));
        result.setR4(Calgrade(th.getT4()*0.6,internal.getI4()));
        result.setR5(Calgrade(th.getT5()*0.6,internal.getI5()));
        result.setR6(Calgrade(th.getT6()*0.6,internal.getI6()));
        result.setR7(Calgrade(th.getT7(),internal.getI7()));
        result.setR8(Calgrade(th.getT8(),internal.getI8()));
    }
    
    void CalGPA()
    {
        if(result.getR1().equals("RA") || result.getR2().equals("RA")  || result.getR3().equals("RA")  || result.getR4().equals("RA") || result.getR4().equals("RA") || result.getR5().equals("RA") || result.getR6().equals("RA") || result.getR7().equals("RA") || result.getR8().equals("RA"))
        {   GPA=0;
        }
        else{
        double div = sname.getC1() + sname.getC2() + sname.getC3() + sname.getC4() + sname.getC5() + sname.getC6() + sname.getC7() + sname.getC8() ;
        double num = (getgrade(th.getT1()*0.6,internal.getI1()) * sname.getC1() ) + (getgrade(th.getT2()*0.6,internal.getI2()) * sname.getC2() ) + (getgrade(th.getT3()*0.6,internal.getI3()) * sname.getC3() ) + (getgrade(th.getT4()*0.6,internal.getI4()) * sname.getC4() ) + (getgrade(th.getT5()*0.6,internal.getI5()) * sname.getC5() ) + (getgrade(th.getT6()*0.6,internal.getI6()) * sname.getC6() ) + (getgrade(th.getT7()*0.6,internal.getI7()) * sname.getC7() ) + (getgrade(th.getT8()*0.6,internal.getI8()) * sname.getC8() ); 
        GPA = num / div;
        }
    }
        
}


