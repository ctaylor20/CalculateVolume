import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    public void testSphereVolumeForRadiusOne() {
        Shape sphere = new Sphere();
        double volume = sphere.getVolume(1);
        assertEquals(4.19, volume);
    }

    @Test
    public void testSphereVolumeForRadiusFive() {
        Sphere sphere = new Sphere();
        double volume = sphere.getVolume(5);
        assertEquals(523.6, volume);
    }

    @Test
    public void testCubeVolumeForLengthOne() {
        Cube cube = new Cube();
        double volume = cube.getVolume(1);
        assertEquals(1,volume);
    }

    @Test
    public void testCubeVolumeForLengthFive() {
        Cube cube = new Cube();
        double volume = cube.getVolume(5);
        assertEquals(125 , volume);
    }

    @Test
    public void testTetrahedronVolumeForEdgeOne() {
        Tetrahedron tetrahedron = new Tetrahedron();
        double volume = tetrahedron.getVolume(1);
        assertEquals(0.12, volume);
    }

    @Test
    public void testTetrahedronVolumeForEdgeFive() {
        Tetrahedron tetrahedron = new Tetrahedron();
        double volume = tetrahedron.getVolume(5);
        assertEquals(14.73, volume);
    }




}
