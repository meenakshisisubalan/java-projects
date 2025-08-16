class Example {
    int num;

    Example setNum(int num) {
        this.num = num;
        return this;  // Returning the current object
    }

    void display() {
        System.out.println("Value of num: " + num);
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.setNum(50).display();  // Method chaining
    }
}
