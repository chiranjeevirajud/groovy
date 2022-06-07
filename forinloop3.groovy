class Forloop1 {
    static void main (String [] args){
        def x = [1,2,3,4,5,'x','d',8]
        for (i in x){
            // i is an index which will loop into x
            println i
        }
        
        def y = ['l','m','n']
        for (c in y){
            println c
        }
    }
}