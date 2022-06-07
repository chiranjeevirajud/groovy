class Forinloop2 {
    static void main (String [] args){
      def employee = [ 'Ram' : 28, 'Krishna' : 20, 'Loknayak' : 30 ]
//        def employee = [ 'Ram':28, 'Krishna':20, 'Loknayak':30 ]

        for (a in employee){
            println a
        }
    }
}