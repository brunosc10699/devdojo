package com.bruno.aula;

public class LearningPrimitiveTypes {

    public static void main(String[] args) {

        byte byteType = 127;
        short shortType = 32767;
        char charType = 'C';
        char asciiCode = 36;
        char unicodeValue = '\u0024';
        float floatType = 2.6f;
        double doubleType = 3.59;
        int intType = 2147483647;
        long longType = 9223372036854775807L;
        boolean booleanType = true;

        //casting explícito
        byteType = (byte) shortType;
        floatType = (float) doubleType;
        float castingFromDouble = (float) 3000.0;

        //casting implícito
        doubleType = floatType;
        double castingFromFloat = 3000f;

        System.out.println("Resultado do casting da variável 'shortType' para 'byte': " + byteType);
        System.out.println("Resultado do casting da variável 'doubleType' para 'float': " + floatType);

    }
}
