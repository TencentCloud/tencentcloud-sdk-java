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

public class CreateDisasterRecoverySitePairRequest extends AbstractModel {

    /**
    * 容灾策略的容灾类型，跨地域：CROSS_REGION，或跨可用区：CROSS_ZONE
    */
    @SerializedName("DisasterRecoveryType")
    @Expose
    private String DisasterRecoveryType;

    /**
    * 生产站点地域
    */
    @SerializedName("SourceRegion")
    @Expose
    private String SourceRegion;

    /**
    * 容灾策略生产站点可用区
    */
    @SerializedName("SourceZone")
    @Expose
    private String SourceZone;

    /**
    * 容灾站点地域
    */
    @SerializedName("TargetRegion")
    @Expose
    private String TargetRegion;

    /**
    * 容灾策略容灾站点可用区
    */
    @SerializedName("TargetZone")
    @Expose
    private String TargetZone;

    /**
    * 容灾策略生产vpc
    */
    @SerializedName("SourceVpc")
    @Expose
    private String SourceVpc;

    /**
    * 容灾策略容灾vpc
    */
    @SerializedName("TargetVpc")
    @Expose
    private String TargetVpc;

    /**
    * 容灾策略所属产品类型，包括DISK、CFS、INSTANCE
    */
    @SerializedName("SitePairProductType")
    @Expose
    private String SitePairProductType;

    /**
    * 容灾策略的名称，最大长度为60个字符。
    */
    @SerializedName("SitePairName")
    @Expose
    private String SitePairName;

    /**
    * 容灾策略复制技术SYN/ASY
    */
    @SerializedName("CopyType")
    @Expose
    private String CopyType;

    /**
     * Get 容灾策略的容灾类型，跨地域：CROSS_REGION，或跨可用区：CROSS_ZONE 
     * @return DisasterRecoveryType 容灾策略的容灾类型，跨地域：CROSS_REGION，或跨可用区：CROSS_ZONE
     */
    public String getDisasterRecoveryType() {
        return this.DisasterRecoveryType;
    }

    /**
     * Set 容灾策略的容灾类型，跨地域：CROSS_REGION，或跨可用区：CROSS_ZONE
     * @param DisasterRecoveryType 容灾策略的容灾类型，跨地域：CROSS_REGION，或跨可用区：CROSS_ZONE
     */
    public void setDisasterRecoveryType(String DisasterRecoveryType) {
        this.DisasterRecoveryType = DisasterRecoveryType;
    }

    /**
     * Get 生产站点地域 
     * @return SourceRegion 生产站点地域
     */
    public String getSourceRegion() {
        return this.SourceRegion;
    }

    /**
     * Set 生产站点地域
     * @param SourceRegion 生产站点地域
     */
    public void setSourceRegion(String SourceRegion) {
        this.SourceRegion = SourceRegion;
    }

    /**
     * Get 容灾策略生产站点可用区 
     * @return SourceZone 容灾策略生产站点可用区
     */
    public String getSourceZone() {
        return this.SourceZone;
    }

    /**
     * Set 容灾策略生产站点可用区
     * @param SourceZone 容灾策略生产站点可用区
     */
    public void setSourceZone(String SourceZone) {
        this.SourceZone = SourceZone;
    }

    /**
     * Get 容灾站点地域 
     * @return TargetRegion 容灾站点地域
     */
    public String getTargetRegion() {
        return this.TargetRegion;
    }

    /**
     * Set 容灾站点地域
     * @param TargetRegion 容灾站点地域
     */
    public void setTargetRegion(String TargetRegion) {
        this.TargetRegion = TargetRegion;
    }

    /**
     * Get 容灾策略容灾站点可用区 
     * @return TargetZone 容灾策略容灾站点可用区
     */
    public String getTargetZone() {
        return this.TargetZone;
    }

    /**
     * Set 容灾策略容灾站点可用区
     * @param TargetZone 容灾策略容灾站点可用区
     */
    public void setTargetZone(String TargetZone) {
        this.TargetZone = TargetZone;
    }

    /**
     * Get 容灾策略生产vpc 
     * @return SourceVpc 容灾策略生产vpc
     */
    public String getSourceVpc() {
        return this.SourceVpc;
    }

    /**
     * Set 容灾策略生产vpc
     * @param SourceVpc 容灾策略生产vpc
     */
    public void setSourceVpc(String SourceVpc) {
        this.SourceVpc = SourceVpc;
    }

    /**
     * Get 容灾策略容灾vpc 
     * @return TargetVpc 容灾策略容灾vpc
     */
    public String getTargetVpc() {
        return this.TargetVpc;
    }

    /**
     * Set 容灾策略容灾vpc
     * @param TargetVpc 容灾策略容灾vpc
     */
    public void setTargetVpc(String TargetVpc) {
        this.TargetVpc = TargetVpc;
    }

    /**
     * Get 容灾策略所属产品类型，包括DISK、CFS、INSTANCE 
     * @return SitePairProductType 容灾策略所属产品类型，包括DISK、CFS、INSTANCE
     */
    public String getSitePairProductType() {
        return this.SitePairProductType;
    }

    /**
     * Set 容灾策略所属产品类型，包括DISK、CFS、INSTANCE
     * @param SitePairProductType 容灾策略所属产品类型，包括DISK、CFS、INSTANCE
     */
    public void setSitePairProductType(String SitePairProductType) {
        this.SitePairProductType = SitePairProductType;
    }

    /**
     * Get 容灾策略的名称，最大长度为60个字符。 
     * @return SitePairName 容灾策略的名称，最大长度为60个字符。
     */
    public String getSitePairName() {
        return this.SitePairName;
    }

    /**
     * Set 容灾策略的名称，最大长度为60个字符。
     * @param SitePairName 容灾策略的名称，最大长度为60个字符。
     */
    public void setSitePairName(String SitePairName) {
        this.SitePairName = SitePairName;
    }

    /**
     * Get 容灾策略复制技术SYN/ASY 
     * @return CopyType 容灾策略复制技术SYN/ASY
     */
    public String getCopyType() {
        return this.CopyType;
    }

    /**
     * Set 容灾策略复制技术SYN/ASY
     * @param CopyType 容灾策略复制技术SYN/ASY
     */
    public void setCopyType(String CopyType) {
        this.CopyType = CopyType;
    }

    public CreateDisasterRecoverySitePairRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDisasterRecoverySitePairRequest(CreateDisasterRecoverySitePairRequest source) {
        if (source.DisasterRecoveryType != null) {
            this.DisasterRecoveryType = new String(source.DisasterRecoveryType);
        }
        if (source.SourceRegion != null) {
            this.SourceRegion = new String(source.SourceRegion);
        }
        if (source.SourceZone != null) {
            this.SourceZone = new String(source.SourceZone);
        }
        if (source.TargetRegion != null) {
            this.TargetRegion = new String(source.TargetRegion);
        }
        if (source.TargetZone != null) {
            this.TargetZone = new String(source.TargetZone);
        }
        if (source.SourceVpc != null) {
            this.SourceVpc = new String(source.SourceVpc);
        }
        if (source.TargetVpc != null) {
            this.TargetVpc = new String(source.TargetVpc);
        }
        if (source.SitePairProductType != null) {
            this.SitePairProductType = new String(source.SitePairProductType);
        }
        if (source.SitePairName != null) {
            this.SitePairName = new String(source.SitePairName);
        }
        if (source.CopyType != null) {
            this.CopyType = new String(source.CopyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisasterRecoveryType", this.DisasterRecoveryType);
        this.setParamSimple(map, prefix + "SourceRegion", this.SourceRegion);
        this.setParamSimple(map, prefix + "SourceZone", this.SourceZone);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);
        this.setParamSimple(map, prefix + "TargetZone", this.TargetZone);
        this.setParamSimple(map, prefix + "SourceVpc", this.SourceVpc);
        this.setParamSimple(map, prefix + "TargetVpc", this.TargetVpc);
        this.setParamSimple(map, prefix + "SitePairProductType", this.SitePairProductType);
        this.setParamSimple(map, prefix + "SitePairName", this.SitePairName);
        this.setParamSimple(map, prefix + "CopyType", this.CopyType);

    }
}

