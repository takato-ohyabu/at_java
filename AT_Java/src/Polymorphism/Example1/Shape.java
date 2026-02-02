package Polymorphism.Example1;

public abstract class Shape {
    // 面積を返す共通メソッド。各クラスで実装が違う。
    public abstract double area();

    // 図形の説明用
    public abstract String name();
}
