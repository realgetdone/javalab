class constructoroverload { 
    int l, b; 
    constructoroverload() {
        l = 0;
        b = 0;
    }
    constructoroverload(int x, int y) {
        l = x;
        b = y;
    }
    void display() {
        System.out.println("Area is " + (l * b));
    }
    public static void main(String args[]) {
        constructoroverload r1 = new constructoroverload();
        r1.display();
        constructoroverload r2 = new constructoroverload(10, 5);
        r2.display();
    }
}
