package com.github.space125.mavendemo;

import com.github.romankh3.image.comparison.ImageComparisonUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;

/**
 * @author Ivan Kurilov on 07.07.2021
 */

@DisplayName("Unit-level testing for ImageComparator")
class ImageComparatorTest {
    private final ImageComparator comparator = new ImageComparator();

    @Test
    public void shouldConfirmImagesNotTheSame(){
        BufferedImage image1 = ImageComparisonUtil.readImageFromResources("image1.png");
        BufferedImage image2 = ImageComparisonUtil.readImageFromResources("image2.png");

        boolean theSaneImages = comparator.isTheSameImages(image1, image2);

        Assertions.assertFalse(theSaneImages);
    }

    @Test
    public void shouldConfirmImagesTheSame(){
        BufferedImage image1 = ImageComparisonUtil.readImageFromResources("image1.png");

        boolean theSaneImages = comparator.isTheSameImages(image1, image1);

        Assertions.assertTrue(theSaneImages);
    }

}