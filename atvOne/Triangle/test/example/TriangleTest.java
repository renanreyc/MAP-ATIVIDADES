package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void equilateralTriangleHaveEqualSides() throws Exception {
        Triangle triangle = new Triangle(2, 2, 2);

        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());
    }

    @Test
    public void triangleOnlyHaveNegativeSides() {
        Assertions.assertThrows(TriangleException.class, () -> {
                    new Triangle(-1, -1, -1);
                }, "no errors triangleOnlyHaveNegativeSides"
        )
    }

    @Test
    public void triangleOnlySidesEqualsToZero() {
        Assertions.assertThrows(TriangleException.class, () -> {
                    new Triangle(0, 0, 0);
                }, "no errors triangleOnlySidesEqualsToZero"
        )
    }

    @Test
    public void triangleSidesNotInequality() {
        Assertions.assertThrows(TriangleException.class, () -> {
            new Triangle(3, 2, 1);
        }, "no errors triangleSidesNotInequality");
    }

    @Test
    public void isocelesTriangleWithTwoEqualSides() throws Exception {
        Triangle triangle = new Triangle(1, 1, 2);
        assertEquals(2, triangle.getNumberOfUniqueSides());
    }

    @Test
    public void equilateralTriangleHaveEqualSides() throws Exception {
        Triangle triangle = new Triangle(1, 1, 1);

        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());
        assertEquals(1, triangle.getNumberOfUniqueSides());
    }

    @Test
    public void scaneleTriangleHaveThreeEqualSides() throws Exception {
        Triangle triangle = new Triangle(2, 2, 2);
        assertEquals(3, triangle.getNumberOfUniqueSides());
    }

}