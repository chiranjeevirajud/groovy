class New {
    static void main (String[] args){
        def x = 5
        int y = 6
        def a = 10
        def b =20
        println('value of x is' + x + 'value of y is '+ y) 

        println( x < y || a < b )
        println( x < y || a > b )
        println( x > y || a < b )
        println( x > y || a > b )
    }
}