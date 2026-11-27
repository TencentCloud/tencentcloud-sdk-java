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
    * <p>资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>地域ID</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>产品编码</p>
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * <p>子产品编码</p>
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * <p>费用起始日期，格式yyyy-MM-dd</p>
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * <p>费用结束日期，格式yyyy-MM-dd，目前与StartDate相等</p>
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * <p>节省计划覆盖金额（即节省计划支付金额）</p>
    */
    @SerializedName("SpCoveredAmount")
    @Expose
    private Float SpCoveredAmount;

    /**
    * <p>节省计划未覆盖金额（即优惠后总价）</p>
    */
    @SerializedName("SpUncoveredAmount")
    @Expose
    private Float SpUncoveredAmount;

    /**
    * <p>总支出（即节省计划未覆盖金额 + 节省计划覆盖金额）</p>
    */
    @SerializedName("TotalRealAmount")
    @Expose
    private Float TotalRealAmount;

    /**
    * <p>按量计费预期金额（即折前价 * 折扣）</p>
    */
    @SerializedName("ExpectedAmount")
    @Expose
    private Float ExpectedAmount;

    /**
    * <p>覆盖率结果，取值为百分比值，取值范围[0,100]</p>
    */
    @SerializedName("SpCoverage")
    @Expose
    private Float SpCoverage;

    /**
    * <p>支付者昵称</p>
    */
    @SerializedName("PayerUinName")
    @Expose
    private String PayerUinName;

    /**
    * <p>使用者昵称</p>
    */
    @SerializedName("OwnerUinName")
    @Expose
    private String OwnerUinName;

    /**
    * <p>支付者uin</p>
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * <p>计费项名称</p>
    */
    @SerializedName("SubBillingItemName")
    @Expose
    private String SubBillingItemName;

    /**
    * <p>计费细项名称</p>
    */
    @SerializedName("BillingItemName")
    @Expose
    private String BillingItemName;

    /**
    * <p>子产品名称</p>
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
     * Get <p>资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID</p> 
     * @return ResourceId <p>资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID</p>
     * @param ResourceId <p>资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>地域ID</p> 
     * @return RegionId <p>地域ID</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域ID</p>
     * @param RegionId <p>地域ID</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>产品编码</p> 
     * @return ProductCode <p>产品编码</p>
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set <p>产品编码</p>
     * @param ProductCode <p>产品编码</p>
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get <p>子产品编码</p> 
     * @return SubProductCode <p>子产品编码</p>
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set <p>子产品编码</p>
     * @param SubProductCode <p>子产品编码</p>
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get <p>费用起始日期，格式yyyy-MM-dd</p> 
     * @return StartDate <p>费用起始日期，格式yyyy-MM-dd</p>
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set <p>费用起始日期，格式yyyy-MM-dd</p>
     * @param StartDate <p>费用起始日期，格式yyyy-MM-dd</p>
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get <p>费用结束日期，格式yyyy-MM-dd，目前与StartDate相等</p> 
     * @return EndDate <p>费用结束日期，格式yyyy-MM-dd，目前与StartDate相等</p>
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set <p>费用结束日期，格式yyyy-MM-dd，目前与StartDate相等</p>
     * @param EndDate <p>费用结束日期，格式yyyy-MM-dd，目前与StartDate相等</p>
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get <p>节省计划覆盖金额（即节省计划支付金额）</p> 
     * @return SpCoveredAmount <p>节省计划覆盖金额（即节省计划支付金额）</p>
     */
    public Float getSpCoveredAmount() {
        return this.SpCoveredAmount;
    }

    /**
     * Set <p>节省计划覆盖金额（即节省计划支付金额）</p>
     * @param SpCoveredAmount <p>节省计划覆盖金额（即节省计划支付金额）</p>
     */
    public void setSpCoveredAmount(Float SpCoveredAmount) {
        this.SpCoveredAmount = SpCoveredAmount;
    }

    /**
     * Get <p>节省计划未覆盖金额（即优惠后总价）</p> 
     * @return SpUncoveredAmount <p>节省计划未覆盖金额（即优惠后总价）</p>
     */
    public Float getSpUncoveredAmount() {
        return this.SpUncoveredAmount;
    }

    /**
     * Set <p>节省计划未覆盖金额（即优惠后总价）</p>
     * @param SpUncoveredAmount <p>节省计划未覆盖金额（即优惠后总价）</p>
     */
    public void setSpUncoveredAmount(Float SpUncoveredAmount) {
        this.SpUncoveredAmount = SpUncoveredAmount;
    }

    /**
     * Get <p>总支出（即节省计划未覆盖金额 + 节省计划覆盖金额）</p> 
     * @return TotalRealAmount <p>总支出（即节省计划未覆盖金额 + 节省计划覆盖金额）</p>
     */
    public Float getTotalRealAmount() {
        return this.TotalRealAmount;
    }

    /**
     * Set <p>总支出（即节省计划未覆盖金额 + 节省计划覆盖金额）</p>
     * @param TotalRealAmount <p>总支出（即节省计划未覆盖金额 + 节省计划覆盖金额）</p>
     */
    public void setTotalRealAmount(Float TotalRealAmount) {
        this.TotalRealAmount = TotalRealAmount;
    }

    /**
     * Get <p>按量计费预期金额（即折前价 * 折扣）</p> 
     * @return ExpectedAmount <p>按量计费预期金额（即折前价 * 折扣）</p>
     */
    public Float getExpectedAmount() {
        return this.ExpectedAmount;
    }

    /**
     * Set <p>按量计费预期金额（即折前价 * 折扣）</p>
     * @param ExpectedAmount <p>按量计费预期金额（即折前价 * 折扣）</p>
     */
    public void setExpectedAmount(Float ExpectedAmount) {
        this.ExpectedAmount = ExpectedAmount;
    }

    /**
     * Get <p>覆盖率结果，取值为百分比值，取值范围[0,100]</p> 
     * @return SpCoverage <p>覆盖率结果，取值为百分比值，取值范围[0,100]</p>
     */
    public Float getSpCoverage() {
        return this.SpCoverage;
    }

    /**
     * Set <p>覆盖率结果，取值为百分比值，取值范围[0,100]</p>
     * @param SpCoverage <p>覆盖率结果，取值为百分比值，取值范围[0,100]</p>
     */
    public void setSpCoverage(Float SpCoverage) {
        this.SpCoverage = SpCoverage;
    }

    /**
     * Get <p>支付者昵称</p> 
     * @return PayerUinName <p>支付者昵称</p>
     */
    public String getPayerUinName() {
        return this.PayerUinName;
    }

    /**
     * Set <p>支付者昵称</p>
     * @param PayerUinName <p>支付者昵称</p>
     */
    public void setPayerUinName(String PayerUinName) {
        this.PayerUinName = PayerUinName;
    }

    /**
     * Get <p>使用者昵称</p> 
     * @return OwnerUinName <p>使用者昵称</p>
     */
    public String getOwnerUinName() {
        return this.OwnerUinName;
    }

    /**
     * Set <p>使用者昵称</p>
     * @param OwnerUinName <p>使用者昵称</p>
     */
    public void setOwnerUinName(String OwnerUinName) {
        this.OwnerUinName = OwnerUinName;
    }

    /**
     * Get <p>支付者uin</p> 
     * @return PayerUin <p>支付者uin</p>
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set <p>支付者uin</p>
     * @param PayerUin <p>支付者uin</p>
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get <p>计费项名称</p> 
     * @return SubBillingItemName <p>计费项名称</p>
     */
    public String getSubBillingItemName() {
        return this.SubBillingItemName;
    }

    /**
     * Set <p>计费项名称</p>
     * @param SubBillingItemName <p>计费项名称</p>
     */
    public void setSubBillingItemName(String SubBillingItemName) {
        this.SubBillingItemName = SubBillingItemName;
    }

    /**
     * Get <p>计费细项名称</p> 
     * @return BillingItemName <p>计费细项名称</p>
     */
    public String getBillingItemName() {
        return this.BillingItemName;
    }

    /**
     * Set <p>计费细项名称</p>
     * @param BillingItemName <p>计费细项名称</p>
     */
    public void setBillingItemName(String BillingItemName) {
        this.BillingItemName = BillingItemName;
    }

    /**
     * Get <p>子产品名称</p> 
     * @return SubProductName <p>子产品名称</p>
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set <p>子产品名称</p>
     * @param SubProductName <p>子产品名称</p>
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

