/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulLevelImageSummaryResponse extends AbstractModel{

    /**
    * 高危漏洞最新本地镜像占比
    */
    @SerializedName("HighLevelVulLocalImagePercent")
    @Expose
    private Float HighLevelVulLocalImagePercent;

    /**
    * 中危漏洞最新本地镜像占比
    */
    @SerializedName("MediumLevelVulLocalImagePercent")
    @Expose
    private Float MediumLevelVulLocalImagePercent;

    /**
    * 低危漏洞最新本地镜像占比
    */
    @SerializedName("LowLevelVulLocalImagePercent")
    @Expose
    private Float LowLevelVulLocalImagePercent;

    /**
    * 严重漏洞最新本地镜像占比
    */
    @SerializedName("CriticalLevelVulLocalImagePercent")
    @Expose
    private Float CriticalLevelVulLocalImagePercent;

    /**
    * 影响的最新版本本地镜像数
    */
    @SerializedName("LocalNewestImageCount")
    @Expose
    private Long LocalNewestImageCount;

    /**
    * 影响的最新版本仓库镜像数
    */
    @SerializedName("RegistryNewestImageCount")
    @Expose
    private Long RegistryNewestImageCount;

    /**
    * 高危漏洞最新仓库镜像占比
    */
    @SerializedName("HighLevelVulRegistryImagePercent")
    @Expose
    private Float HighLevelVulRegistryImagePercent;

    /**
    * 中危漏洞最新仓库镜像占比
    */
    @SerializedName("MediumLevelVulRegistryImagePercent")
    @Expose
    private Float MediumLevelVulRegistryImagePercent;

    /**
    * 低危漏洞最新仓库镜像占比
    */
    @SerializedName("LowLevelVulRegistryImagePercent")
    @Expose
    private Float LowLevelVulRegistryImagePercent;

    /**
    * 严重漏洞最新仓库镜像占比
    */
    @SerializedName("CriticalLevelVulRegistryImagePercent")
    @Expose
    private Float CriticalLevelVulRegistryImagePercent;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 高危漏洞最新本地镜像占比 
     * @return HighLevelVulLocalImagePercent 高危漏洞最新本地镜像占比
     */
    public Float getHighLevelVulLocalImagePercent() {
        return this.HighLevelVulLocalImagePercent;
    }

    /**
     * Set 高危漏洞最新本地镜像占比
     * @param HighLevelVulLocalImagePercent 高危漏洞最新本地镜像占比
     */
    public void setHighLevelVulLocalImagePercent(Float HighLevelVulLocalImagePercent) {
        this.HighLevelVulLocalImagePercent = HighLevelVulLocalImagePercent;
    }

    /**
     * Get 中危漏洞最新本地镜像占比 
     * @return MediumLevelVulLocalImagePercent 中危漏洞最新本地镜像占比
     */
    public Float getMediumLevelVulLocalImagePercent() {
        return this.MediumLevelVulLocalImagePercent;
    }

    /**
     * Set 中危漏洞最新本地镜像占比
     * @param MediumLevelVulLocalImagePercent 中危漏洞最新本地镜像占比
     */
    public void setMediumLevelVulLocalImagePercent(Float MediumLevelVulLocalImagePercent) {
        this.MediumLevelVulLocalImagePercent = MediumLevelVulLocalImagePercent;
    }

    /**
     * Get 低危漏洞最新本地镜像占比 
     * @return LowLevelVulLocalImagePercent 低危漏洞最新本地镜像占比
     */
    public Float getLowLevelVulLocalImagePercent() {
        return this.LowLevelVulLocalImagePercent;
    }

    /**
     * Set 低危漏洞最新本地镜像占比
     * @param LowLevelVulLocalImagePercent 低危漏洞最新本地镜像占比
     */
    public void setLowLevelVulLocalImagePercent(Float LowLevelVulLocalImagePercent) {
        this.LowLevelVulLocalImagePercent = LowLevelVulLocalImagePercent;
    }

    /**
     * Get 严重漏洞最新本地镜像占比 
     * @return CriticalLevelVulLocalImagePercent 严重漏洞最新本地镜像占比
     */
    public Float getCriticalLevelVulLocalImagePercent() {
        return this.CriticalLevelVulLocalImagePercent;
    }

    /**
     * Set 严重漏洞最新本地镜像占比
     * @param CriticalLevelVulLocalImagePercent 严重漏洞最新本地镜像占比
     */
    public void setCriticalLevelVulLocalImagePercent(Float CriticalLevelVulLocalImagePercent) {
        this.CriticalLevelVulLocalImagePercent = CriticalLevelVulLocalImagePercent;
    }

    /**
     * Get 影响的最新版本本地镜像数 
     * @return LocalNewestImageCount 影响的最新版本本地镜像数
     */
    public Long getLocalNewestImageCount() {
        return this.LocalNewestImageCount;
    }

    /**
     * Set 影响的最新版本本地镜像数
     * @param LocalNewestImageCount 影响的最新版本本地镜像数
     */
    public void setLocalNewestImageCount(Long LocalNewestImageCount) {
        this.LocalNewestImageCount = LocalNewestImageCount;
    }

    /**
     * Get 影响的最新版本仓库镜像数 
     * @return RegistryNewestImageCount 影响的最新版本仓库镜像数
     */
    public Long getRegistryNewestImageCount() {
        return this.RegistryNewestImageCount;
    }

    /**
     * Set 影响的最新版本仓库镜像数
     * @param RegistryNewestImageCount 影响的最新版本仓库镜像数
     */
    public void setRegistryNewestImageCount(Long RegistryNewestImageCount) {
        this.RegistryNewestImageCount = RegistryNewestImageCount;
    }

    /**
     * Get 高危漏洞最新仓库镜像占比 
     * @return HighLevelVulRegistryImagePercent 高危漏洞最新仓库镜像占比
     */
    public Float getHighLevelVulRegistryImagePercent() {
        return this.HighLevelVulRegistryImagePercent;
    }

    /**
     * Set 高危漏洞最新仓库镜像占比
     * @param HighLevelVulRegistryImagePercent 高危漏洞最新仓库镜像占比
     */
    public void setHighLevelVulRegistryImagePercent(Float HighLevelVulRegistryImagePercent) {
        this.HighLevelVulRegistryImagePercent = HighLevelVulRegistryImagePercent;
    }

    /**
     * Get 中危漏洞最新仓库镜像占比 
     * @return MediumLevelVulRegistryImagePercent 中危漏洞最新仓库镜像占比
     */
    public Float getMediumLevelVulRegistryImagePercent() {
        return this.MediumLevelVulRegistryImagePercent;
    }

    /**
     * Set 中危漏洞最新仓库镜像占比
     * @param MediumLevelVulRegistryImagePercent 中危漏洞最新仓库镜像占比
     */
    public void setMediumLevelVulRegistryImagePercent(Float MediumLevelVulRegistryImagePercent) {
        this.MediumLevelVulRegistryImagePercent = MediumLevelVulRegistryImagePercent;
    }

    /**
     * Get 低危漏洞最新仓库镜像占比 
     * @return LowLevelVulRegistryImagePercent 低危漏洞最新仓库镜像占比
     */
    public Float getLowLevelVulRegistryImagePercent() {
        return this.LowLevelVulRegistryImagePercent;
    }

    /**
     * Set 低危漏洞最新仓库镜像占比
     * @param LowLevelVulRegistryImagePercent 低危漏洞最新仓库镜像占比
     */
    public void setLowLevelVulRegistryImagePercent(Float LowLevelVulRegistryImagePercent) {
        this.LowLevelVulRegistryImagePercent = LowLevelVulRegistryImagePercent;
    }

    /**
     * Get 严重漏洞最新仓库镜像占比 
     * @return CriticalLevelVulRegistryImagePercent 严重漏洞最新仓库镜像占比
     */
    public Float getCriticalLevelVulRegistryImagePercent() {
        return this.CriticalLevelVulRegistryImagePercent;
    }

    /**
     * Set 严重漏洞最新仓库镜像占比
     * @param CriticalLevelVulRegistryImagePercent 严重漏洞最新仓库镜像占比
     */
    public void setCriticalLevelVulRegistryImagePercent(Float CriticalLevelVulRegistryImagePercent) {
        this.CriticalLevelVulRegistryImagePercent = CriticalLevelVulRegistryImagePercent;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVulLevelImageSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulLevelImageSummaryResponse(DescribeVulLevelImageSummaryResponse source) {
        if (source.HighLevelVulLocalImagePercent != null) {
            this.HighLevelVulLocalImagePercent = new Float(source.HighLevelVulLocalImagePercent);
        }
        if (source.MediumLevelVulLocalImagePercent != null) {
            this.MediumLevelVulLocalImagePercent = new Float(source.MediumLevelVulLocalImagePercent);
        }
        if (source.LowLevelVulLocalImagePercent != null) {
            this.LowLevelVulLocalImagePercent = new Float(source.LowLevelVulLocalImagePercent);
        }
        if (source.CriticalLevelVulLocalImagePercent != null) {
            this.CriticalLevelVulLocalImagePercent = new Float(source.CriticalLevelVulLocalImagePercent);
        }
        if (source.LocalNewestImageCount != null) {
            this.LocalNewestImageCount = new Long(source.LocalNewestImageCount);
        }
        if (source.RegistryNewestImageCount != null) {
            this.RegistryNewestImageCount = new Long(source.RegistryNewestImageCount);
        }
        if (source.HighLevelVulRegistryImagePercent != null) {
            this.HighLevelVulRegistryImagePercent = new Float(source.HighLevelVulRegistryImagePercent);
        }
        if (source.MediumLevelVulRegistryImagePercent != null) {
            this.MediumLevelVulRegistryImagePercent = new Float(source.MediumLevelVulRegistryImagePercent);
        }
        if (source.LowLevelVulRegistryImagePercent != null) {
            this.LowLevelVulRegistryImagePercent = new Float(source.LowLevelVulRegistryImagePercent);
        }
        if (source.CriticalLevelVulRegistryImagePercent != null) {
            this.CriticalLevelVulRegistryImagePercent = new Float(source.CriticalLevelVulRegistryImagePercent);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighLevelVulLocalImagePercent", this.HighLevelVulLocalImagePercent);
        this.setParamSimple(map, prefix + "MediumLevelVulLocalImagePercent", this.MediumLevelVulLocalImagePercent);
        this.setParamSimple(map, prefix + "LowLevelVulLocalImagePercent", this.LowLevelVulLocalImagePercent);
        this.setParamSimple(map, prefix + "CriticalLevelVulLocalImagePercent", this.CriticalLevelVulLocalImagePercent);
        this.setParamSimple(map, prefix + "LocalNewestImageCount", this.LocalNewestImageCount);
        this.setParamSimple(map, prefix + "RegistryNewestImageCount", this.RegistryNewestImageCount);
        this.setParamSimple(map, prefix + "HighLevelVulRegistryImagePercent", this.HighLevelVulRegistryImagePercent);
        this.setParamSimple(map, prefix + "MediumLevelVulRegistryImagePercent", this.MediumLevelVulRegistryImagePercent);
        this.setParamSimple(map, prefix + "LowLevelVulRegistryImagePercent", this.LowLevelVulRegistryImagePercent);
        this.setParamSimple(map, prefix + "CriticalLevelVulRegistryImagePercent", this.CriticalLevelVulRegistryImagePercent);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

