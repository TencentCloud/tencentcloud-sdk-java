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
package com.tencentcloudapi.svp.v20240125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SavingPlanDeductDetail extends AbstractModel {

    /**
    * 账号id
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 账号名称
    */
    @SerializedName("OwnerUinName")
    @Expose
    private String OwnerUinName;

    /**
    * 抵扣账号id
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * 抵扣账号名称
    */
    @SerializedName("PayerUinName")
    @Expose
    private String PayerUinName;

    /**
    * 节省计划资源id
    */
    @SerializedName("SpId")
    @Expose
    private String SpId;

    /**
    * 产品编码
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 子产品编码
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 子产品名称
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
    * 交易ID
    */
    @SerializedName("OutTradeNo")
    @Expose
    private String OutTradeNo;

    /**
    * 地域id
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 地域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地区id
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 地区名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 开始使用时间
    */
    @SerializedName("SpStartTime")
    @Expose
    private String SpStartTime;

    /**
    * 结束使用时间
    */
    @SerializedName("SpEndTime")
    @Expose
    private String SpEndTime;

    /**
    * 折扣时间
    */
    @SerializedName("DeductTime")
    @Expose
    private String DeductTime;

    /**
    * 抵扣金额，单位分
    */
    @SerializedName("DeductAmount")
    @Expose
    private String DeductAmount;

    /**
    * 抵扣折扣率
    */
    @SerializedName("DeductDiscount")
    @Expose
    private String DeductDiscount;

    /**
    * 抵扣比率
    */
    @SerializedName("DeductRate")
    @Expose
    private String DeductRate;

    /**
     * Get 账号id 
     * @return OwnerUin 账号id
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 账号id
     * @param OwnerUin 账号id
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 账号名称 
     * @return OwnerUinName 账号名称
     */
    public String getOwnerUinName() {
        return this.OwnerUinName;
    }

    /**
     * Set 账号名称
     * @param OwnerUinName 账号名称
     */
    public void setOwnerUinName(String OwnerUinName) {
        this.OwnerUinName = OwnerUinName;
    }

    /**
     * Get 抵扣账号id 
     * @return PayerUin 抵扣账号id
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set 抵扣账号id
     * @param PayerUin 抵扣账号id
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get 抵扣账号名称 
     * @return PayerUinName 抵扣账号名称
     */
    public String getPayerUinName() {
        return this.PayerUinName;
    }

    /**
     * Set 抵扣账号名称
     * @param PayerUinName 抵扣账号名称
     */
    public void setPayerUinName(String PayerUinName) {
        this.PayerUinName = PayerUinName;
    }

    /**
     * Get 节省计划资源id 
     * @return SpId 节省计划资源id
     */
    public String getSpId() {
        return this.SpId;
    }

    /**
     * Set 节省计划资源id
     * @param SpId 节省计划资源id
     */
    public void setSpId(String SpId) {
        this.SpId = SpId;
    }

    /**
     * Get 产品编码 
     * @return ProductCode 产品编码
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 产品编码
     * @param ProductCode 产品编码
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 子产品编码 
     * @return SubProductCode 子产品编码
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set 子产品编码
     * @param SubProductCode 子产品编码
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get 子产品名称 
     * @return SubProductName 子产品名称
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set 子产品名称
     * @param SubProductName 子产品名称
     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    /**
     * Get 交易ID 
     * @return OutTradeNo 交易ID
     */
    public String getOutTradeNo() {
        return this.OutTradeNo;
    }

    /**
     * Set 交易ID
     * @param OutTradeNo 交易ID
     */
    public void setOutTradeNo(String OutTradeNo) {
        this.OutTradeNo = OutTradeNo;
    }

    /**
     * Get 地域id 
     * @return RegionId 地域id
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域id
     * @param RegionId 地域id
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域名称 
     * @return RegionName 地域名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名称
     * @param RegionName 地域名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 地区id 
     * @return ZoneId 地区id
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 地区id
     * @param ZoneId 地区id
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 地区名称 
     * @return ZoneName 地区名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 地区名称
     * @param ZoneName 地区名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 开始使用时间 
     * @return SpStartTime 开始使用时间
     */
    public String getSpStartTime() {
        return this.SpStartTime;
    }

    /**
     * Set 开始使用时间
     * @param SpStartTime 开始使用时间
     */
    public void setSpStartTime(String SpStartTime) {
        this.SpStartTime = SpStartTime;
    }

    /**
     * Get 结束使用时间 
     * @return SpEndTime 结束使用时间
     */
    public String getSpEndTime() {
        return this.SpEndTime;
    }

    /**
     * Set 结束使用时间
     * @param SpEndTime 结束使用时间
     */
    public void setSpEndTime(String SpEndTime) {
        this.SpEndTime = SpEndTime;
    }

    /**
     * Get 折扣时间 
     * @return DeductTime 折扣时间
     */
    public String getDeductTime() {
        return this.DeductTime;
    }

    /**
     * Set 折扣时间
     * @param DeductTime 折扣时间
     */
    public void setDeductTime(String DeductTime) {
        this.DeductTime = DeductTime;
    }

    /**
     * Get 抵扣金额，单位分 
     * @return DeductAmount 抵扣金额，单位分
     */
    public String getDeductAmount() {
        return this.DeductAmount;
    }

    /**
     * Set 抵扣金额，单位分
     * @param DeductAmount 抵扣金额，单位分
     */
    public void setDeductAmount(String DeductAmount) {
        this.DeductAmount = DeductAmount;
    }

    /**
     * Get 抵扣折扣率 
     * @return DeductDiscount 抵扣折扣率
     */
    public String getDeductDiscount() {
        return this.DeductDiscount;
    }

    /**
     * Set 抵扣折扣率
     * @param DeductDiscount 抵扣折扣率
     */
    public void setDeductDiscount(String DeductDiscount) {
        this.DeductDiscount = DeductDiscount;
    }

    /**
     * Get 抵扣比率 
     * @return DeductRate 抵扣比率
     */
    public String getDeductRate() {
        return this.DeductRate;
    }

    /**
     * Set 抵扣比率
     * @param DeductRate 抵扣比率
     */
    public void setDeductRate(String DeductRate) {
        this.DeductRate = DeductRate;
    }

    public SavingPlanDeductDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SavingPlanDeductDetail(SavingPlanDeductDetail source) {
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerUinName != null) {
            this.OwnerUinName = new String(source.OwnerUinName);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.PayerUinName != null) {
            this.PayerUinName = new String(source.PayerUinName);
        }
        if (source.SpId != null) {
            this.SpId = new String(source.SpId);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.SubProductName != null) {
            this.SubProductName = new String(source.SubProductName);
        }
        if (source.OutTradeNo != null) {
            this.OutTradeNo = new String(source.OutTradeNo);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.SpStartTime != null) {
            this.SpStartTime = new String(source.SpStartTime);
        }
        if (source.SpEndTime != null) {
            this.SpEndTime = new String(source.SpEndTime);
        }
        if (source.DeductTime != null) {
            this.DeductTime = new String(source.DeductTime);
        }
        if (source.DeductAmount != null) {
            this.DeductAmount = new String(source.DeductAmount);
        }
        if (source.DeductDiscount != null) {
            this.DeductDiscount = new String(source.DeductDiscount);
        }
        if (source.DeductRate != null) {
            this.DeductRate = new String(source.DeductRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerUinName", this.OwnerUinName);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "PayerUinName", this.PayerUinName);
        this.setParamSimple(map, prefix + "SpId", this.SpId);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "SubProductName", this.SubProductName);
        this.setParamSimple(map, prefix + "OutTradeNo", this.OutTradeNo);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "SpStartTime", this.SpStartTime);
        this.setParamSimple(map, prefix + "SpEndTime", this.SpEndTime);
        this.setParamSimple(map, prefix + "DeductTime", this.DeductTime);
        this.setParamSimple(map, prefix + "DeductAmount", this.DeductAmount);
        this.setParamSimple(map, prefix + "DeductDiscount", this.DeductDiscount);
        this.setParamSimple(map, prefix + "DeductRate", this.DeductRate);

    }
}

