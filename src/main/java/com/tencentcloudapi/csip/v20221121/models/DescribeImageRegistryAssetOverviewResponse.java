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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageRegistryAssetOverviewResponse extends AbstractModel {

    /**
    * <p>镜像总数</p>
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * <p>已扫描镜像数</p>
    */
    @SerializedName("ImageScannedCnt")
    @Expose
    private Long ImageScannedCnt;

    /**
    * <p>组件数</p>
    */
    @SerializedName("ComponentCnt")
    @Expose
    private Long ComponentCnt;

    /**
    * <p>漏洞数</p>
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

    /**
    * <p>木马数</p>
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

    /**
    * <p>敏感信息数</p>
    */
    @SerializedName("SensitiveCnt")
    @Expose
    private Long SensitiveCnt;

    /**
    * <p>定时扫描配置数</p>
    */
    @SerializedName("TimedScanTaskConfigCnt")
    @Expose
    private Long TimedScanTaskConfigCnt;

    /**
    * <p>总配额</p>
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * <p>已使用配额</p>
    */
    @SerializedName("UsedQuota")
    @Expose
    private Long UsedQuota;

    /**
    * <p>剩余配额</p>
    */
    @SerializedName("RemainingQuota")
    @Expose
    private Long RemainingQuota;

    /**
    * <p>试用配额</p>
    */
    @SerializedName("TrialQuota")
    @Expose
    private Long TrialQuota;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>镜像总数</p> 
     * @return ImageCnt <p>镜像总数</p>
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set <p>镜像总数</p>
     * @param ImageCnt <p>镜像总数</p>
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get <p>已扫描镜像数</p> 
     * @return ImageScannedCnt <p>已扫描镜像数</p>
     */
    public Long getImageScannedCnt() {
        return this.ImageScannedCnt;
    }

    /**
     * Set <p>已扫描镜像数</p>
     * @param ImageScannedCnt <p>已扫描镜像数</p>
     */
    public void setImageScannedCnt(Long ImageScannedCnt) {
        this.ImageScannedCnt = ImageScannedCnt;
    }

    /**
     * Get <p>组件数</p> 
     * @return ComponentCnt <p>组件数</p>
     */
    public Long getComponentCnt() {
        return this.ComponentCnt;
    }

    /**
     * Set <p>组件数</p>
     * @param ComponentCnt <p>组件数</p>
     */
    public void setComponentCnt(Long ComponentCnt) {
        this.ComponentCnt = ComponentCnt;
    }

    /**
     * Get <p>漏洞数</p> 
     * @return VulCnt <p>漏洞数</p>
     */
    public Long getVulCnt() {
        return this.VulCnt;
    }

    /**
     * Set <p>漏洞数</p>
     * @param VulCnt <p>漏洞数</p>
     */
    public void setVulCnt(Long VulCnt) {
        this.VulCnt = VulCnt;
    }

    /**
     * Get <p>木马数</p> 
     * @return VirusCnt <p>木马数</p>
     */
    public Long getVirusCnt() {
        return this.VirusCnt;
    }

    /**
     * Set <p>木马数</p>
     * @param VirusCnt <p>木马数</p>
     */
    public void setVirusCnt(Long VirusCnt) {
        this.VirusCnt = VirusCnt;
    }

    /**
     * Get <p>敏感信息数</p> 
     * @return SensitiveCnt <p>敏感信息数</p>
     */
    public Long getSensitiveCnt() {
        return this.SensitiveCnt;
    }

    /**
     * Set <p>敏感信息数</p>
     * @param SensitiveCnt <p>敏感信息数</p>
     */
    public void setSensitiveCnt(Long SensitiveCnt) {
        this.SensitiveCnt = SensitiveCnt;
    }

    /**
     * Get <p>定时扫描配置数</p> 
     * @return TimedScanTaskConfigCnt <p>定时扫描配置数</p>
     */
    public Long getTimedScanTaskConfigCnt() {
        return this.TimedScanTaskConfigCnt;
    }

    /**
     * Set <p>定时扫描配置数</p>
     * @param TimedScanTaskConfigCnt <p>定时扫描配置数</p>
     */
    public void setTimedScanTaskConfigCnt(Long TimedScanTaskConfigCnt) {
        this.TimedScanTaskConfigCnt = TimedScanTaskConfigCnt;
    }

    /**
     * Get <p>总配额</p> 
     * @return TotalQuota <p>总配额</p>
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set <p>总配额</p>
     * @param TotalQuota <p>总配额</p>
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get <p>已使用配额</p> 
     * @return UsedQuota <p>已使用配额</p>
     */
    public Long getUsedQuota() {
        return this.UsedQuota;
    }

    /**
     * Set <p>已使用配额</p>
     * @param UsedQuota <p>已使用配额</p>
     */
    public void setUsedQuota(Long UsedQuota) {
        this.UsedQuota = UsedQuota;
    }

    /**
     * Get <p>剩余配额</p> 
     * @return RemainingQuota <p>剩余配额</p>
     */
    public Long getRemainingQuota() {
        return this.RemainingQuota;
    }

    /**
     * Set <p>剩余配额</p>
     * @param RemainingQuota <p>剩余配额</p>
     */
    public void setRemainingQuota(Long RemainingQuota) {
        this.RemainingQuota = RemainingQuota;
    }

    /**
     * Get <p>试用配额</p> 
     * @return TrialQuota <p>试用配额</p>
     */
    public Long getTrialQuota() {
        return this.TrialQuota;
    }

    /**
     * Set <p>试用配额</p>
     * @param TrialQuota <p>试用配额</p>
     */
    public void setTrialQuota(Long TrialQuota) {
        this.TrialQuota = TrialQuota;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeImageRegistryAssetOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageRegistryAssetOverviewResponse(DescribeImageRegistryAssetOverviewResponse source) {
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.ImageScannedCnt != null) {
            this.ImageScannedCnt = new Long(source.ImageScannedCnt);
        }
        if (source.ComponentCnt != null) {
            this.ComponentCnt = new Long(source.ComponentCnt);
        }
        if (source.VulCnt != null) {
            this.VulCnt = new Long(source.VulCnt);
        }
        if (source.VirusCnt != null) {
            this.VirusCnt = new Long(source.VirusCnt);
        }
        if (source.SensitiveCnt != null) {
            this.SensitiveCnt = new Long(source.SensitiveCnt);
        }
        if (source.TimedScanTaskConfigCnt != null) {
            this.TimedScanTaskConfigCnt = new Long(source.TimedScanTaskConfigCnt);
        }
        if (source.TotalQuota != null) {
            this.TotalQuota = new Long(source.TotalQuota);
        }
        if (source.UsedQuota != null) {
            this.UsedQuota = new Long(source.UsedQuota);
        }
        if (source.RemainingQuota != null) {
            this.RemainingQuota = new Long(source.RemainingQuota);
        }
        if (source.TrialQuota != null) {
            this.TrialQuota = new Long(source.TrialQuota);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "ImageScannedCnt", this.ImageScannedCnt);
        this.setParamSimple(map, prefix + "ComponentCnt", this.ComponentCnt);
        this.setParamSimple(map, prefix + "VulCnt", this.VulCnt);
        this.setParamSimple(map, prefix + "VirusCnt", this.VirusCnt);
        this.setParamSimple(map, prefix + "SensitiveCnt", this.SensitiveCnt);
        this.setParamSimple(map, prefix + "TimedScanTaskConfigCnt", this.TimedScanTaskConfigCnt);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "UsedQuota", this.UsedQuota);
        this.setParamSimple(map, prefix + "RemainingQuota", this.RemainingQuota);
        this.setParamSimple(map, prefix + "TrialQuota", this.TrialQuota);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

