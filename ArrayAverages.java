import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray = new int[7][7];

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    int sumr=0;
    int averager=0;

    for(int row=0; row<ray.length; row++)
    {
      sumr += row;
    }

    averager = sumr/ray[row].length-1
  
  }

  public void columnAverages(){
    //take each colum and go through all the rows
    //column loop on outside and row loop on inside
    int sumc=0;
    int averagec=0;

    for(int row=0; row<ray.length; row++)
    {
      for(int column=0; column<ray[row].length; column++)
      {
        sumc+=column;
      }

    averagec = sumc/ray[column].length-1;
  
  }

  public void arrayAverage(){
    suma =0;
    averagea=0;

    for(int row=0; row<ray.length; row++)

    {
      suma+=row;

      for(int column=0; column<ray[row].length; column++)
      {
        
        suma+=column;
      }

    averagea = suma/ray.length-1;
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    return "";
  }
}
