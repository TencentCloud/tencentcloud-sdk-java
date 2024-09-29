package com.tencentcloudapi.unit.common;

import com.tencentcloudapi.common.profile.Region;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class RegionTest {
    @Test
    public void testRegion() {
        String[] expectedRegions = {
                "ap-bangkok", "ap-beijing", "ap-chengdu", "ap-chongqing", "ap-guangzhou", "ap-guangzhou-open",
                "ap-hongkong", "ap-mumbai", "ap-seoul", "ap-shanghai", "ap-shanghai-fsi", "ap-shenzhen-fsi",
                "ap-singapore", "ap-tokyo", "eu-frankfurt", "eu-moscow", "na-ashburn", "na-siliconvalley", "na-toronto"
        };
        for (String expectedRegion : expectedRegions) {
            boolean found = false;
            for (Region region : Region.values()) {
                if (region.getValue().equals(expectedRegion)) {
                    found = true;
                    break;
                }
            }
            assertTrue("Expected region " + expectedRegion + " to be present", found);
        }
    }

    @Test
    public void testRegionValue() {
        assertEquals("ap-bangkok", Region.Bangkok.getValue());
        assertEquals("ap-bangkok", Region.Bangkok.toString());
    }
}
