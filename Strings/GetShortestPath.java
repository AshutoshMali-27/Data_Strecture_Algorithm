public class GetShortestPath {
    
    public static void main(String args[]){

        String path="WNEENESENNN";
        System.out.println("The shortest possible path is : "+GetShortestPath(path));

    }

    public static float  GetShortestPath(String path){
        int x=0,y=0;


        for(int i=0;i<path.length();i++){

            char dir=path.charAt(i);

            if(dir == 'N'){
                y++;
            }
            else if( dir =='S'){
                y--;
            }
            else if(dir =='W'){
                x--;
            }
            else{
                x++;
            }
        }

       int x2=x*x;  //(x2-x1)^2
       int y2=y*y;  //(y2 -y1)^2

        return(float) Math.sqrt(y2+x2);

    }
}
