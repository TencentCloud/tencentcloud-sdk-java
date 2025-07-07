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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineLicenseDetail extends AbstractModel {

    /**
    * 主机quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 计费模式, 0 按量计费 , 1 预付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 授权类型
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * 订单类型,0 默认计费订单 1 试用订单, 2 赠送 3 体验
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 废弃字段,
    */
    @SerializedName("InquireKey")
    @Expose
    private String InquireKey;

    /**
    * 自动续费标识 0 默认不自动付费, 1 自动付费 2 手动设置不续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 到期时间,按量付费该值为空
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * 购买时间
    */
    @SerializedName("BuyTime")
    @Expose
    private String BuyTime;

    /**
    * 授权数量
    */
    @SerializedName("LicenseCnt")
    @Expose
    private Long LicenseCnt;

    /**
     * Get 主机quuid 
     * @return Quuid 主机quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机quuid
     * @param Quuid 主机quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 计费模式, 0 按量计费 , 1 预付费 
     * @return PayMode 计费模式, 0 按量计费 , 1 预付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式, 0 按量计费 , 1 预付费
     * @param PayMode 计费模式, 0 按量计费 , 1 预付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 授权类型 
     * @return LicenseType 授权类型
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 授权类型
     * @param LicenseType 授权类型
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 订单类型,0 默认计费订单 1 试用订单, 2 赠送 3 体验 
     * @return SourceType 订单类型,0 默认计费订单 1 试用订单, 2 赠送 3 体验
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 订单类型,0 默认计费订单 1 试用订单, 2 赠送 3 体验
     * @param SourceType 订单类型,0 默认计费订单 1 试用订单, 2 赠送 3 体验
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 废弃字段, 
     * @return InquireKey 废弃字段,
     */
    public String getInquireKey() {
        return this.InquireKey;
    }

    /**
     * Set 废弃字段,
     * @param InquireKey 废弃字段,
     */
    public void setInquireKey(String InquireKey) {
        this.InquireKey = InquireKey;
    }

    /**
     * Get 自动续费标识 0 默认不自动付费, 1 自动付费 2 手动设置不续费 
     * @return AutoRenewFlag 自动续费标识 0 默认不自动付费, 1 自动付费 2 手动设置不续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标识 0 默认不自动付费, 1 自动付费 2 手动设置不续费
     * @param AutoRenewFlag 自动续费标识 0 默认不自动付费, 1 自动付费 2 手动设置不续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 到期时间,按量付费该值为空 
     * @return Deadline 到期时间,按量付费该值为空
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 到期时间,按量付费该值为空
     * @param Deadline 到期时间,按量付费该值为空
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 购买时间 
     * @return BuyTime 购买时间
     */
    public String getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set 购买时间
     * @param BuyTime 购买时间
     */
    public void setBuyTime(String BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get 授权数量 
     * @return LicenseCnt 授权数量
     */
    public Long getLicenseCnt() {
        return this.LicenseCnt;
    }

    /**
     * Set 授权数量
     * @param LicenseCnt 授权数量
     */
    public void setLicenseCnt(Long LicenseCnt) {
        this.LicenseCnt = LicenseCnt;
    }

    public MachineLicenseDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineLicenseDetail(MachineLicenseDetail source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.InquireKey != null) {
            this.InquireKey = new String(source.InquireKey);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new String(source.BuyTime);
        }
        if (source.LicenseCnt != null) {
            this.LicenseCnt = new Long(source.LicenseCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "InquireKey", this.InquireKey);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "LicenseCnt", this.LicenseCnt);

    }
}

