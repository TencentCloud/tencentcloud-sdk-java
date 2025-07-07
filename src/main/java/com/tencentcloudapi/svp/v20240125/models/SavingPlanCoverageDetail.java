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

public class SavingPlanCoverageDetail extends AbstractModel {

    /**
    * 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 产品编码
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 子产品编码
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 费用起始日期，格式yyyy-MM-dd
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 费用结束日期，格式yyyy-MM-dd，目前与StartDate相等
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 节省计划覆盖金额（即节省计划支付金额）
    */
    @SerializedName("SpCoveredAmount")
    @Expose
    private Float SpCoveredAmount;

    /**
    * 节省计划未覆盖金额（即优惠后总价）
    */
    @SerializedName("SpUncoveredAmount")
    @Expose
    private Float SpUncoveredAmount;

    /**
    * 总支出（即节省计划未覆盖金额 + 节省计划覆盖金额）
    */
    @SerializedName("TotalRealAmount")
    @Expose
    private Float TotalRealAmount;

    /**
    * 按量计费预期金额（即折前价 * 折扣）
    */
    @SerializedName("ExpectedAmount")
    @Expose
    private Float ExpectedAmount;

    /**
    * 覆盖率结果，取值[0, 100]
    */
    @SerializedName("SpCoverage")
    @Expose
    private Float SpCoverage;

    /**
    * 支付者昵称
    */
    @SerializedName("PayerUinName")
    @Expose
    private String PayerUinName;

    /**
    * 使用者昵称
    */
    @SerializedName("OwnerUinName")
    @Expose
    private String OwnerUinName;

    /**
    * 支付者uin
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * 计费项名称
    */
    @SerializedName("SubBillingItemName")
    @Expose
    private String SubBillingItemName;

    /**
    * 计费细项名称
    */
    @SerializedName("BillingItemName")
    @Expose
    private String BillingItemName;

    /**
    * 子产品名称
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
     * Get 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID 
     * @return ResourceId 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID
     * @param ResourceId 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
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
     * Get 费用起始日期，格式yyyy-MM-dd 
     * @return StartDate 费用起始日期，格式yyyy-MM-dd
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 费用起始日期，格式yyyy-MM-dd
     * @param StartDate 费用起始日期，格式yyyy-MM-dd
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 费用结束日期，格式yyyy-MM-dd，目前与StartDate相等 
     * @return EndDate 费用结束日期，格式yyyy-MM-dd，目前与StartDate相等
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 费用结束日期，格式yyyy-MM-dd，目前与StartDate相等
     * @param EndDate 费用结束日期，格式yyyy-MM-dd，目前与StartDate相等
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 节省计划覆盖金额（即节省计划支付金额） 
     * @return SpCoveredAmount 节省计划覆盖金额（即节省计划支付金额）
     */
    public Float getSpCoveredAmount() {
        return this.SpCoveredAmount;
    }

    /**
     * Set 节省计划覆盖金额（即节省计划支付金额）
     * @param SpCoveredAmount 节省计划覆盖金额（即节省计划支付金额）
     */
    public void setSpCoveredAmount(Float SpCoveredAmount) {
        this.SpCoveredAmount = SpCoveredAmount;
    }

    /**
     * Get 节省计划未覆盖金额（即优惠后总价） 
     * @return SpUncoveredAmount 节省计划未覆盖金额（即优惠后总价）
     */
    public Float getSpUncoveredAmount() {
        return this.SpUncoveredAmount;
    }

    /**
     * Set 节省计划未覆盖金额（即优惠后总价）
     * @param SpUncoveredAmount 节省计划未覆盖金额（即优惠后总价）
     */
    public void setSpUncoveredAmount(Float SpUncoveredAmount) {
        this.SpUncoveredAmount = SpUncoveredAmount;
    }

    /**
     * Get 总支出（即节省计划未覆盖金额 + 节省计划覆盖金额） 
     * @return TotalRealAmount 总支出（即节省计划未覆盖金额 + 节省计划覆盖金额）
     */
    public Float getTotalRealAmount() {
        return this.TotalRealAmount;
    }

    /**
     * Set 总支出（即节省计划未覆盖金额 + 节省计划覆盖金额）
     * @param TotalRealAmount 总支出（即节省计划未覆盖金额 + 节省计划覆盖金额）
     */
    public void setTotalRealAmount(Float TotalRealAmount) {
        this.TotalRealAmount = TotalRealAmount;
    }

    /**
     * Get 按量计费预期金额（即折前价 * 折扣） 
     * @return ExpectedAmount 按量计费预期金额（即折前价 * 折扣）
     */
    public Float getExpectedAmount() {
        return this.ExpectedAmount;
    }

    /**
     * Set 按量计费预期金额（即折前价 * 折扣）
     * @param ExpectedAmount 按量计费预期金额（即折前价 * 折扣）
     */
    public void setExpectedAmount(Float ExpectedAmount) {
        this.ExpectedAmount = ExpectedAmount;
    }

    /**
     * Get 覆盖率结果，取值[0, 100] 
     * @return SpCoverage 覆盖率结果，取值[0, 100]
     */
    public Float getSpCoverage() {
        return this.SpCoverage;
    }

    /**
     * Set 覆盖率结果，取值[0, 100]
     * @param SpCoverage 覆盖率结果，取值[0, 100]
     */
    public void setSpCoverage(Float SpCoverage) {
        this.SpCoverage = SpCoverage;
    }

    /**
     * Get 支付者昵称 
     * @return PayerUinName 支付者昵称
     */
    public String getPayerUinName() {
        return this.PayerUinName;
    }

    /**
     * Set 支付者昵称
     * @param PayerUinName 支付者昵称
     */
    public void setPayerUinName(String PayerUinName) {
        this.PayerUinName = PayerUinName;
    }

    /**
     * Get 使用者昵称 
     * @return OwnerUinName 使用者昵称
     */
    public String getOwnerUinName() {
        return this.OwnerUinName;
    }

    /**
     * Set 使用者昵称
     * @param OwnerUinName 使用者昵称
     */
    public void setOwnerUinName(String OwnerUinName) {
        this.OwnerUinName = OwnerUinName;
    }

    /**
     * Get 支付者uin 
     * @return PayerUin 支付者uin
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set 支付者uin
     * @param PayerUin 支付者uin
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get 计费项名称 
     * @return SubBillingItemName 计费项名称
     */
    public String getSubBillingItemName() {
        return this.SubBillingItemName;
    }

    /**
     * Set 计费项名称
     * @param SubBillingItemName 计费项名称
     */
    public void setSubBillingItemName(String SubBillingItemName) {
        this.SubBillingItemName = SubBillingItemName;
    }

    /**
     * Get 计费细项名称 
     * @return BillingItemName 计费细项名称
     */
    public String getBillingItemName() {
        return this.BillingItemName;
    }

    /**
     * Set 计费细项名称
     * @param BillingItemName 计费细项名称
     */
    public void setBillingItemName(String BillingItemName) {
        this.BillingItemName = BillingItemName;
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

    public SavingPlanCoverageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SavingPlanCoverageDetail(SavingPlanCoverageDetail source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.SpCoveredAmount != null) {
            this.SpCoveredAmount = new Float(source.SpCoveredAmount);
        }
        if (source.SpUncoveredAmount != null) {
            this.SpUncoveredAmount = new Float(source.SpUncoveredAmount);
        }
        if (source.TotalRealAmount != null) {
            this.TotalRealAmount = new Float(source.TotalRealAmount);
        }
        if (source.ExpectedAmount != null) {
            this.ExpectedAmount = new Float(source.ExpectedAmount);
        }
        if (source.SpCoverage != null) {
            this.SpCoverage = new Float(source.SpCoverage);
        }
        if (source.PayerUinName != null) {
            this.PayerUinName = new String(source.PayerUinName);
        }
        if (source.OwnerUinName != null) {
            this.OwnerUinName = new String(source.OwnerUinName);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.SubBillingItemName != null) {
            this.SubBillingItemName = new String(source.SubBillingItemName);
        }
        if (source.BillingItemName != null) {
            this.BillingItemName = new String(source.BillingItemName);
        }
        if (source.SubProductName != null) {
            this.SubProductName = new String(source.SubProductName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "SpCoveredAmount", this.SpCoveredAmount);
        this.setParamSimple(map, prefix + "SpUncoveredAmount", this.SpUncoveredAmount);
        this.setParamSimple(map, prefix + "TotalRealAmount", this.TotalRealAmount);
        this.setParamSimple(map, prefix + "ExpectedAmount", this.ExpectedAmount);
        this.setParamSimple(map, prefix + "SpCoverage", this.SpCoverage);
        this.setParamSimple(map, prefix + "PayerUinName", this.PayerUinName);
        this.setParamSimple(map, prefix + "OwnerUinName", this.OwnerUinName);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "SubBillingItemName", this.SubBillingItemName);
        this.setParamSimple(map, prefix + "BillingItemName", this.BillingItemName);
        this.setParamSimple(map, prefix + "SubProductName", this.SubProductName);

    }
}

