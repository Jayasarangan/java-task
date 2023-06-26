public class AreaCircle
{
  public void AreaOfCircle(double Radius)
  {
	  double a = 3.14*Radius*Radius;
	  System.out.println(a);
  }
  public void Perimeter(double Radius)
  {
	  Double a= 2*3.14*Radius;
	  System.out.println(a);
  }
  public static void main(String args[])
  {
	  AreaCircle sc = new AreaCircle();
	  sc.AreaOfCircle(7.5);
	  sc.Perimeter(7.5);
  }
}

	