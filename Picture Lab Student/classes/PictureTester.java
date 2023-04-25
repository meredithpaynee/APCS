/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
   /** Method to test zeroBlue */
   public static void testZeroBlue()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.zeroBlue();
      beach.explore();
   }
   
   public static void testKeepOnlyBlue()
   {
      Picture pic = new Picture("beach.jpg");
      pic.explore();
      pic.keepOnlyBlue();
      pic.explore();
   }
   
   public static void testKeepOnlyGreen()
   {
      Picture pic = new Picture("beach.jpg");
      pic.explore();
      pic.keepOnlyGreen();
      pic.explore();
   }
   
   public static void testKeepOnlyRed()
   {
      Picture pic = new Picture("beach.jpg");
      pic.explore();
      pic.keepOnlyRed();
      pic.explore();
   }
   
   public static void testNegate()
   {
      Picture pic = new Picture("beach.jpg");
      pic.explore();
      pic.negate();
      pic.explore();
   }
   
   public static void testGrayscale()
   {
      Picture pic = new Picture("beach.jpg");
      pic.explore();
      pic.grayscale();
      pic.explore();
   }
   
   /** Method to test mirrorVertical */
   public static void testMirrorVertical()
   {
      Picture pic = new Picture("caterpillar.jpg");
      pic.explore();
      pic.mirrorVertical();
      pic.explore();
   }
   
   public static void testMirrorVerticalRightToLeft()
   {
      Picture pic = new Picture("caterpillar.jpg");
      pic.explore();
      pic.mirrorVerticalRightToLeft();
      pic.explore();
   }
   
   public static void testMirrorHorizontal()
   {
      Picture pic = new Picture("caterpillar.jpg");
      pic.explore();
      pic.mirrorHorizontal();
      pic.explore();
   }
   
   public static void testMirrorHorizontalBotToTop()
   {
      Picture pic = new Picture("caterpillar.jpg");
      pic.explore();
      pic.mirrorHorizontalBotToTop();
      pic.explore();
   }
   
   /** Method to test mirrorTemple */
   public static void testMirrorTemple()
   {
      Picture pic = new Picture("temple.jpg");
      pic.explore();
      pic.mirrorTemple();
      pic.explore();
   }
   
   public static void testMirrorArms()
   {
      Picture pic = new Picture("snowman.jpg");
      pic.explore();
      pic.mirrorArms();
      pic.explore();
   }
   
   public static void testMirrorGull()
   {
      Picture pic = new Picture("seagull.jpg");
      pic.explore();
      pic.mirrorGull();
      pic.explore();
   }
   
   public static void testOwnPicMirror()
   {
      Picture pic = new Picture("smallbrunch.jpg");
      pic.explore();
      pic.ownPicMirror();
      pic.explore();
   }
   
   /** Method to test the collage method */
   public static void testCollage()
   {
      Picture canvas = new Picture("640x480.jpg");
      canvas.createCollage();
      canvas.explore();
   }
   
   /** Method to test edgeDetection */
   public static void testEdgeDetection()
   {
      Picture swan = new Picture("swan.jpg");
      swan.edgeDetection(10);
      swan.explore();
   }
   
   /** Main method for testing.  Every class can have a main
     * method in Java */
   public static void main(String[] args)
   {
      // uncomment a call here to run a test
      // and comment out the ones you don't want
      // to run
      //testZeroBlue();
      //testKeepOnlyBlue();
      //testKeepOnlyRed();
      //testKeepOnlyGreen();
      //testNegate();
      //testGrayscale();
      //testFixUnderwater();
      //testMirrorVertical();
      //testMirrorVerticalRightToLeft();
      //testMirrorHorizontal();
      //testMirrorHorizontalBotToTop();
      //testMirrorTemple();
      //testMirrorArms();
      //testMirrorGull();
      testOwnPicMirror();
      //testMirrorDiagonal();
      //testCollage();
      //testCopy();
      //testEdgeDetection();
      //testEdgeDetection2();
      //testChromakey();
      //testEncodeAndDecode();
      //testGetCountRedOverValue(250);
      //testSetRedToHalfValueInTopHalf();
      //testClearBlueOverValue(200);
      //testGetAverageForColumn(0);
   }
}