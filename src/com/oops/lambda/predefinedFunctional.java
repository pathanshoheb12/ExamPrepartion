package com.oops.lambda;

interface predefinedFunctional<T,R> {

    R fourParameterMethod(T para1 , T para2, T para3, T para4);
}
class main {
    public static void main(String[] args) {

        predefinedFunctional<String, String> concateString = (s1, s2, s3, s4) -> s1 + s2 + s3 + s4;
        String s = concateString.fourParameterMethod("A", "B", "C", "D");
        System.out.println(s);
    }
}

