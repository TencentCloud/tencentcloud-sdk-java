/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisasterRecoveryOverview extends AbstractModel {

    /**
    * 地域 ID
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 站点对总数
    */
    @SerializedName("SitePairCount")
    @Expose
    private Long SitePairCount;

    /**
    * 跨地域站点对数
    */
    @SerializedName("SitePairCrossRegionCount")
    @Expose
    private Long SitePairCrossRegionCount;

    /**
    * 跨可用区站点对数
    */
    @SerializedName("SitePairCrossZoneCount")
    @Expose
    private Long SitePairCrossZoneCount;

    /**
    * 跨云站点对数
    */
    @SerializedName("SitePairCrossCloudCount")
    @Expose
    private Long SitePairCrossCloudCount;

    /**
    * 保护组总数
    */
    @SerializedName("ProtectGroupCount")
    @Expose
    private Long ProtectGroupCount;

    /**
    * 跨地域保护组数
    */
    @SerializedName("ProtectGroupCrossRegionCount")
    @Expose
    private Long ProtectGroupCrossRegionCount;

    /**
    * 跨可用区保护组数
    */
    @SerializedName("ProtectGroupCrossZoneCount")
    @Expose
    private Long ProtectGroupCrossZoneCount;

    /**
    * 跨云保护组数
    */
    @SerializedName("ProtectGroupCrossCloudCount")
    @Expose
    private Long ProtectGroupCrossCloudCount;

    /**
    * 复制对总数
    */
    @SerializedName("CopyPairCount")
    @Expose
    private Long CopyPairCount;

    /**
    * RPO 正常的复制对数
    */
    @SerializedName("CopyPairSuccessRPOCount")
    @Expose
    private Long CopyPairSuccessRPOCount;

    /**
    * RPO 异常的复制对数
    */
    @SerializedName("CopyPairErrorRPOCount")
    @Expose
    private Long CopyPairErrorRPOCount;

    /**
    * 演练对总数
    */
    @SerializedName("DrillPairCount")
    @Expose
    private Long DrillPairCount;

    /**
    * 演练中
    */
    @SerializedName("DrillPairDrillingCount")
    @Expose
    private Long DrillPairDrillingCount;

    /**
    * 演练失败
    */
    @SerializedName("DrillPairFailedCount")
    @Expose
    private Long DrillPairFailedCount;

    /**
    * 演练成功
    */
    @SerializedName("DrillPairSuccessCount")
    @Expose
    private Long DrillPairSuccessCount;

    /**
    * 受保护资源总数
    */
    @SerializedName("ProtectedResourceCount")
    @Expose
    private Long ProtectedResourceCount;

    /**
    * 受保护资源-复制中
    */
    @SerializedName("ProtectedResourceCopyingCount")
    @Expose
    private Long ProtectedResourceCopyingCount;

    /**
    * 受保护资源-已停止/初始化
    */
    @SerializedName("ProtectedResourceStoppedCount")
    @Expose
    private Long ProtectedResourceStoppedCount;

    /**
    * 切换失败
    */
    @SerializedName("FailoverFailedCount")
    @Expose
    private Long FailoverFailedCount;

    /**
     * Get 地域 ID 
     * @return Region 地域 ID
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域 ID
     * @param Region 地域 ID
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 站点对总数 
     * @return SitePairCount 站点对总数
     */
    public Long getSitePairCount() {
        return this.SitePairCount;
    }

    /**
     * Set 站点对总数
     * @param SitePairCount 站点对总数
     */
    public void setSitePairCount(Long SitePairCount) {
        this.SitePairCount = SitePairCount;
    }

    /**
     * Get 跨地域站点对数 
     * @return SitePairCrossRegionCount 跨地域站点对数
     */
    public Long getSitePairCrossRegionCount() {
        return this.SitePairCrossRegionCount;
    }

    /**
     * Set 跨地域站点对数
     * @param SitePairCrossRegionCount 跨地域站点对数
     */
    public void setSitePairCrossRegionCount(Long SitePairCrossRegionCount) {
        this.SitePairCrossRegionCount = SitePairCrossRegionCount;
    }

    /**
     * Get 跨可用区站点对数 
     * @return SitePairCrossZoneCount 跨可用区站点对数
     */
    public Long getSitePairCrossZoneCount() {
        return this.SitePairCrossZoneCount;
    }

    /**
     * Set 跨可用区站点对数
     * @param SitePairCrossZoneCount 跨可用区站点对数
     */
    public void setSitePairCrossZoneCount(Long SitePairCrossZoneCount) {
        this.SitePairCrossZoneCount = SitePairCrossZoneCount;
    }

    /**
     * Get 跨云站点对数 
     * @return SitePairCrossCloudCount 跨云站点对数
     */
    public Long getSitePairCrossCloudCount() {
        return this.SitePairCrossCloudCount;
    }

    /**
     * Set 跨云站点对数
     * @param SitePairCrossCloudCount 跨云站点对数
     */
    public void setSitePairCrossCloudCount(Long SitePairCrossCloudCount) {
        this.SitePairCrossCloudCount = SitePairCrossCloudCount;
    }

    /**
     * Get 保护组总数 
     * @return ProtectGroupCount 保护组总数
     */
    public Long getProtectGroupCount() {
        return this.ProtectGroupCount;
    }

    /**
     * Set 保护组总数
     * @param ProtectGroupCount 保护组总数
     */
    public void setProtectGroupCount(Long ProtectGroupCount) {
        this.ProtectGroupCount = ProtectGroupCount;
    }

    /**
     * Get 跨地域保护组数 
     * @return ProtectGroupCrossRegionCount 跨地域保护组数
     */
    public Long getProtectGroupCrossRegionCount() {
        return this.ProtectGroupCrossRegionCount;
    }

    /**
     * Set 跨地域保护组数
     * @param ProtectGroupCrossRegionCount 跨地域保护组数
     */
    public void setProtectGroupCrossRegionCount(Long ProtectGroupCrossRegionCount) {
        this.ProtectGroupCrossRegionCount = ProtectGroupCrossRegionCount;
    }

    /**
     * Get 跨可用区保护组数 
     * @return ProtectGroupCrossZoneCount 跨可用区保护组数
     */
    public Long getProtectGroupCrossZoneCount() {
        return this.ProtectGroupCrossZoneCount;
    }

    /**
     * Set 跨可用区保护组数
     * @param ProtectGroupCrossZoneCount 跨可用区保护组数
     */
    public void setProtectGroupCrossZoneCount(Long ProtectGroupCrossZoneCount) {
        this.ProtectGroupCrossZoneCount = ProtectGroupCrossZoneCount;
    }

    /**
     * Get 跨云保护组数 
     * @return ProtectGroupCrossCloudCount 跨云保护组数
     */
    public Long getProtectGroupCrossCloudCount() {
        return this.ProtectGroupCrossCloudCount;
    }

    /**
     * Set 跨云保护组数
     * @param ProtectGroupCrossCloudCount 跨云保护组数
     */
    public void setProtectGroupCrossCloudCount(Long ProtectGroupCrossCloudCount) {
        this.ProtectGroupCrossCloudCount = ProtectGroupCrossCloudCount;
    }

    /**
     * Get 复制对总数 
     * @return CopyPairCount 复制对总数
     */
    public Long getCopyPairCount() {
        return this.CopyPairCount;
    }

    /**
     * Set 复制对总数
     * @param CopyPairCount 复制对总数
     */
    public void setCopyPairCount(Long CopyPairCount) {
        this.CopyPairCount = CopyPairCount;
    }

    /**
     * Get RPO 正常的复制对数 
     * @return CopyPairSuccessRPOCount RPO 正常的复制对数
     */
    public Long getCopyPairSuccessRPOCount() {
        return this.CopyPairSuccessRPOCount;
    }

    /**
     * Set RPO 正常的复制对数
     * @param CopyPairSuccessRPOCount RPO 正常的复制对数
     */
    public void setCopyPairSuccessRPOCount(Long CopyPairSuccessRPOCount) {
        this.CopyPairSuccessRPOCount = CopyPairSuccessRPOCount;
    }

    /**
     * Get RPO 异常的复制对数 
     * @return CopyPairErrorRPOCount RPO 异常的复制对数
     */
    public Long getCopyPairErrorRPOCount() {
        return this.CopyPairErrorRPOCount;
    }

    /**
     * Set RPO 异常的复制对数
     * @param CopyPairErrorRPOCount RPO 异常的复制对数
     */
    public void setCopyPairErrorRPOCount(Long CopyPairErrorRPOCount) {
        this.CopyPairErrorRPOCount = CopyPairErrorRPOCount;
    }

    /**
     * Get 演练对总数 
     * @return DrillPairCount 演练对总数
     */
    public Long getDrillPairCount() {
        return this.DrillPairCount;
    }

    /**
     * Set 演练对总数
     * @param DrillPairCount 演练对总数
     */
    public void setDrillPairCount(Long DrillPairCount) {
        this.DrillPairCount = DrillPairCount;
    }

    /**
     * Get 演练中 
     * @return DrillPairDrillingCount 演练中
     */
    public Long getDrillPairDrillingCount() {
        return this.DrillPairDrillingCount;
    }

    /**
     * Set 演练中
     * @param DrillPairDrillingCount 演练中
     */
    public void setDrillPairDrillingCount(Long DrillPairDrillingCount) {
        this.DrillPairDrillingCount = DrillPairDrillingCount;
    }

    /**
     * Get 演练失败 
     * @return DrillPairFailedCount 演练失败
     */
    public Long getDrillPairFailedCount() {
        return this.DrillPairFailedCount;
    }

    /**
     * Set 演练失败
     * @param DrillPairFailedCount 演练失败
     */
    public void setDrillPairFailedCount(Long DrillPairFailedCount) {
        this.DrillPairFailedCount = DrillPairFailedCount;
    }

    /**
     * Get 演练成功 
     * @return DrillPairSuccessCount 演练成功
     */
    public Long getDrillPairSuccessCount() {
        return this.DrillPairSuccessCount;
    }

    /**
     * Set 演练成功
     * @param DrillPairSuccessCount 演练成功
     */
    public void setDrillPairSuccessCount(Long DrillPairSuccessCount) {
        this.DrillPairSuccessCount = DrillPairSuccessCount;
    }

    /**
     * Get 受保护资源总数 
     * @return ProtectedResourceCount 受保护资源总数
     */
    public Long getProtectedResourceCount() {
        return this.ProtectedResourceCount;
    }

    /**
     * Set 受保护资源总数
     * @param ProtectedResourceCount 受保护资源总数
     */
    public void setProtectedResourceCount(Long ProtectedResourceCount) {
        this.ProtectedResourceCount = ProtectedResourceCount;
    }

    /**
     * Get 受保护资源-复制中 
     * @return ProtectedResourceCopyingCount 受保护资源-复制中
     */
    public Long getProtectedResourceCopyingCount() {
        return this.ProtectedResourceCopyingCount;
    }

    /**
     * Set 受保护资源-复制中
     * @param ProtectedResourceCopyingCount 受保护资源-复制中
     */
    public void setProtectedResourceCopyingCount(Long ProtectedResourceCopyingCount) {
        this.ProtectedResourceCopyingCount = ProtectedResourceCopyingCount;
    }

    /**
     * Get 受保护资源-已停止/初始化 
     * @return ProtectedResourceStoppedCount 受保护资源-已停止/初始化
     */
    public Long getProtectedResourceStoppedCount() {
        return this.ProtectedResourceStoppedCount;
    }

    /**
     * Set 受保护资源-已停止/初始化
     * @param ProtectedResourceStoppedCount 受保护资源-已停止/初始化
     */
    public void setProtectedResourceStoppedCount(Long ProtectedResourceStoppedCount) {
        this.ProtectedResourceStoppedCount = ProtectedResourceStoppedCount;
    }

    /**
     * Get 切换失败 
     * @return FailoverFailedCount 切换失败
     */
    public Long getFailoverFailedCount() {
        return this.FailoverFailedCount;
    }

    /**
     * Set 切换失败
     * @param FailoverFailedCount 切换失败
     */
    public void setFailoverFailedCount(Long FailoverFailedCount) {
        this.FailoverFailedCount = FailoverFailedCount;
    }

    public DisasterRecoveryOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisasterRecoveryOverview(DisasterRecoveryOverview source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SitePairCount != null) {
            this.SitePairCount = new Long(source.SitePairCount);
        }
        if (source.SitePairCrossRegionCount != null) {
            this.SitePairCrossRegionCount = new Long(source.SitePairCrossRegionCount);
        }
        if (source.SitePairCrossZoneCount != null) {
            this.SitePairCrossZoneCount = new Long(source.SitePairCrossZoneCount);
        }
        if (source.SitePairCrossCloudCount != null) {
            this.SitePairCrossCloudCount = new Long(source.SitePairCrossCloudCount);
        }
        if (source.ProtectGroupCount != null) {
            this.ProtectGroupCount = new Long(source.ProtectGroupCount);
        }
        if (source.ProtectGroupCrossRegionCount != null) {
            this.ProtectGroupCrossRegionCount = new Long(source.ProtectGroupCrossRegionCount);
        }
        if (source.ProtectGroupCrossZoneCount != null) {
            this.ProtectGroupCrossZoneCount = new Long(source.ProtectGroupCrossZoneCount);
        }
        if (source.ProtectGroupCrossCloudCount != null) {
            this.ProtectGroupCrossCloudCount = new Long(source.ProtectGroupCrossCloudCount);
        }
        if (source.CopyPairCount != null) {
            this.CopyPairCount = new Long(source.CopyPairCount);
        }
        if (source.CopyPairSuccessRPOCount != null) {
            this.CopyPairSuccessRPOCount = new Long(source.CopyPairSuccessRPOCount);
        }
        if (source.CopyPairErrorRPOCount != null) {
            this.CopyPairErrorRPOCount = new Long(source.CopyPairErrorRPOCount);
        }
        if (source.DrillPairCount != null) {
            this.DrillPairCount = new Long(source.DrillPairCount);
        }
        if (source.DrillPairDrillingCount != null) {
            this.DrillPairDrillingCount = new Long(source.DrillPairDrillingCount);
        }
        if (source.DrillPairFailedCount != null) {
            this.DrillPairFailedCount = new Long(source.DrillPairFailedCount);
        }
        if (source.DrillPairSuccessCount != null) {
            this.DrillPairSuccessCount = new Long(source.DrillPairSuccessCount);
        }
        if (source.ProtectedResourceCount != null) {
            this.ProtectedResourceCount = new Long(source.ProtectedResourceCount);
        }
        if (source.ProtectedResourceCopyingCount != null) {
            this.ProtectedResourceCopyingCount = new Long(source.ProtectedResourceCopyingCount);
        }
        if (source.ProtectedResourceStoppedCount != null) {
            this.ProtectedResourceStoppedCount = new Long(source.ProtectedResourceStoppedCount);
        }
        if (source.FailoverFailedCount != null) {
            this.FailoverFailedCount = new Long(source.FailoverFailedCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SitePairCount", this.SitePairCount);
        this.setParamSimple(map, prefix + "SitePairCrossRegionCount", this.SitePairCrossRegionCount);
        this.setParamSimple(map, prefix + "SitePairCrossZoneCount", this.SitePairCrossZoneCount);
        this.setParamSimple(map, prefix + "SitePairCrossCloudCount", this.SitePairCrossCloudCount);
        this.setParamSimple(map, prefix + "ProtectGroupCount", this.ProtectGroupCount);
        this.setParamSimple(map, prefix + "ProtectGroupCrossRegionCount", this.ProtectGroupCrossRegionCount);
        this.setParamSimple(map, prefix + "ProtectGroupCrossZoneCount", this.ProtectGroupCrossZoneCount);
        this.setParamSimple(map, prefix + "ProtectGroupCrossCloudCount", this.ProtectGroupCrossCloudCount);
        this.setParamSimple(map, prefix + "CopyPairCount", this.CopyPairCount);
        this.setParamSimple(map, prefix + "CopyPairSuccessRPOCount", this.CopyPairSuccessRPOCount);
        this.setParamSimple(map, prefix + "CopyPairErrorRPOCount", this.CopyPairErrorRPOCount);
        this.setParamSimple(map, prefix + "DrillPairCount", this.DrillPairCount);
        this.setParamSimple(map, prefix + "DrillPairDrillingCount", this.DrillPairDrillingCount);
        this.setParamSimple(map, prefix + "DrillPairFailedCount", this.DrillPairFailedCount);
        this.setParamSimple(map, prefix + "DrillPairSuccessCount", this.DrillPairSuccessCount);
        this.setParamSimple(map, prefix + "ProtectedResourceCount", this.ProtectedResourceCount);
        this.setParamSimple(map, prefix + "ProtectedResourceCopyingCount", this.ProtectedResourceCopyingCount);
        this.setParamSimple(map, prefix + "ProtectedResourceStoppedCount", this.ProtectedResourceStoppedCount);
        this.setParamSimple(map, prefix + "FailoverFailedCount", this.FailoverFailedCount);

    }
}

