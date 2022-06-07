//switch case:

class Newww {
    static void main (String [] args){
        int i = 1
        int j = 2
        
        switch(i){
            case 0:
                switch(j) {
                    case 1:
                        println('i is 0, j is 1')
                        break;
                    case 2:
                        println('i is 0, j is 2')
                        break;
                }
            case 1:
                switch(j){
                    case 1:
                        println('i is 0, j is 1')
                        break;
                    case 2:
                        println('i is 0, j is 2')
                        break;
                }
            default:
            println('No matching case was found')
        }
    }
}