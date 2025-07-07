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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseConditions extends AbstractModel {

    /**
    * 产品名称代码
    */
    @SerializedName("BusinessCodes")
    @Expose
    private String BusinessCodes;

    /**
    * 子产品名称代码
    */
    @SerializedName("ProductCodes")
    @Expose
    private String ProductCodes;

    /**
    * 组件类型代码
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * 可用区ID：资源所属可用区ID
    */
    @SerializedName("ZoneIds")
    @Expose
    private String ZoneIds;

    /**
    * 地域ID:资源所属地域ID
    */
    @SerializedName("RegionIds")
    @Expose
    private String RegionIds;

    /**
    * 项目ID:资源所属项目ID
    */
    @SerializedName("ProjectIds")
    @Expose
    private String ProjectIds;

    /**
    * 计费模式 prePay(表示包年包月)/postPay(表示按量计费)
    */
    @SerializedName("PayModes")
    @Expose
    private String PayModes;

    /**
    * 交易类型，查询交易类型（请使用交易类型code入参）
    */
    @SerializedName("ActionTypes")
    @Expose
    private String ActionTypes;

    /**
    * 分账标签键
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * 费用类型，查询费用类型（请使用费用类型code入参)入参枚举如下：
cashPayAmount:现金 
incentivePayAmount:赠送金 
voucherPayAmount:优惠券 
tax:税金 
costBeforeTax:税前价
    */
    @SerializedName("FeeType")
    @Expose
    private String FeeType;

    /**
    * 查询成本分析数据的用户UIN
    */
    @SerializedName("PayerUins")
    @Expose
    private String PayerUins;

    /**
    * 使用资源的用户UIN
    */
    @SerializedName("OwnerUins")
    @Expose
    private String OwnerUins;

    /**
    * 消耗类型，查询消耗类型（请使用消耗类型code入参）
    */
    @SerializedName("ConsumptionTypes")
    @Expose
    private String ConsumptionTypes;

    /**
     * Get 产品名称代码 
     * @return BusinessCodes 产品名称代码
     */
    public String getBusinessCodes() {
        return this.BusinessCodes;
    }

    /**
     * Set 产品名称代码
     * @param BusinessCodes 产品名称代码
     */
    public void setBusinessCodes(String BusinessCodes) {
        this.BusinessCodes = BusinessCodes;
    }

    /**
     * Get 子产品名称代码 
     * @return ProductCodes 子产品名称代码
     */
    public String getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set 子产品名称代码
     * @param ProductCodes 子产品名称代码
     */
    public void setProductCodes(String ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    /**
     * Get 组件类型代码 
     * @return ComponentCode 组件类型代码
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set 组件类型代码
     * @param ComponentCode 组件类型代码
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get 可用区ID：资源所属可用区ID 
     * @return ZoneIds 可用区ID：资源所属可用区ID
     */
    public String getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 可用区ID：资源所属可用区ID
     * @param ZoneIds 可用区ID：资源所属可用区ID
     */
    public void setZoneIds(String ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 地域ID:资源所属地域ID 
     * @return RegionIds 地域ID:资源所属地域ID
     */
    public String getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set 地域ID:资源所属地域ID
     * @param RegionIds 地域ID:资源所属地域ID
     */
    public void setRegionIds(String RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get 项目ID:资源所属项目ID 
     * @return ProjectIds 项目ID:资源所属项目ID
     */
    public String getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID:资源所属项目ID
     * @param ProjectIds 项目ID:资源所属项目ID
     */
    public void setProjectIds(String ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 计费模式 prePay(表示包年包月)/postPay(表示按量计费) 
     * @return PayModes 计费模式 prePay(表示包年包月)/postPay(表示按量计费)
     */
    public String getPayModes() {
        return this.PayModes;
    }

    /**
     * Set 计费模式 prePay(表示包年包月)/postPay(表示按量计费)
     * @param PayModes 计费模式 prePay(表示包年包月)/postPay(表示按量计费)
     */
    public void setPayModes(String PayModes) {
        this.PayModes = PayModes;
    }

    /**
     * Get 交易类型，查询交易类型（请使用交易类型code入参） 
     * @return ActionTypes 交易类型，查询交易类型（请使用交易类型code入参）
     */
    public String getActionTypes() {
        return this.ActionTypes;
    }

    /**
     * Set 交易类型，查询交易类型（请使用交易类型code入参）
     * @param ActionTypes 交易类型，查询交易类型（请使用交易类型code入参）
     */
    public void setActionTypes(String ActionTypes) {
        this.ActionTypes = ActionTypes;
    }

    /**
     * Get 分账标签键 
     * @return Tags 分账标签键
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 分账标签键
     * @param Tags 分账标签键
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 费用类型，查询费用类型（请使用费用类型code入参)入参枚举如下：
cashPayAmount:现金 
incentivePayAmount:赠送金 
voucherPayAmount:优惠券 
tax:税金 
costBeforeTax:税前价 
     * @return FeeType 费用类型，查询费用类型（请使用费用类型code入参)入参枚举如下：
cashPayAmount:现金 
incentivePayAmount:赠送金 
voucherPayAmount:优惠券 
tax:税金 
costBeforeTax:税前价
     */
    public String getFeeType() {
        return this.FeeType;
    }

    /**
     * Set 费用类型，查询费用类型（请使用费用类型code入参)入参枚举如下：
cashPayAmount:现金 
incentivePayAmount:赠送金 
voucherPayAmount:优惠券 
tax:税金 
costBeforeTax:税前价
     * @param FeeType 费用类型，查询费用类型（请使用费用类型code入参)入参枚举如下：
cashPayAmount:现金 
incentivePayAmount:赠送金 
voucherPayAmount:优惠券 
tax:税金 
costBeforeTax:税前价
     */
    public void setFeeType(String FeeType) {
        this.FeeType = FeeType;
    }

    /**
     * Get 查询成本分析数据的用户UIN 
     * @return PayerUins 查询成本分析数据的用户UIN
     */
    public String getPayerUins() {
        return this.PayerUins;
    }

    /**
     * Set 查询成本分析数据的用户UIN
     * @param PayerUins 查询成本分析数据的用户UIN
     */
    public void setPayerUins(String PayerUins) {
        this.PayerUins = PayerUins;
    }

    /**
     * Get 使用资源的用户UIN 
     * @return OwnerUins 使用资源的用户UIN
     */
    public String getOwnerUins() {
        return this.OwnerUins;
    }

    /**
     * Set 使用资源的用户UIN
     * @param OwnerUins 使用资源的用户UIN
     */
    public void setOwnerUins(String OwnerUins) {
        this.OwnerUins = OwnerUins;
    }

    /**
     * Get 消耗类型，查询消耗类型（请使用消耗类型code入参） 
     * @return ConsumptionTypes 消耗类型，查询消耗类型（请使用消耗类型code入参）
     */
    public String getConsumptionTypes() {
        return this.ConsumptionTypes;
    }

    /**
     * Set 消耗类型，查询消耗类型（请使用消耗类型code入参）
     * @param ConsumptionTypes 消耗类型，查询消耗类型（请使用消耗类型code入参）
     */
    public void setConsumptionTypes(String ConsumptionTypes) {
        this.ConsumptionTypes = ConsumptionTypes;
    }

    public AnalyseConditions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseConditions(AnalyseConditions source) {
        if (source.BusinessCodes != null) {
            this.BusinessCodes = new String(source.BusinessCodes);
        }
        if (source.ProductCodes != null) {
            this.ProductCodes = new String(source.ProductCodes);
        }
        if (source.ComponentCode != null) {
            this.ComponentCode = new String(source.ComponentCode);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String(source.ZoneIds);
        }
        if (source.RegionIds != null) {
            this.RegionIds = new String(source.RegionIds);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String(source.ProjectIds);
        }
        if (source.PayModes != null) {
            this.PayModes = new String(source.PayModes);
        }
        if (source.ActionTypes != null) {
            this.ActionTypes = new String(source.ActionTypes);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.FeeType != null) {
            this.FeeType = new String(source.FeeType);
        }
        if (source.PayerUins != null) {
            this.PayerUins = new String(source.PayerUins);
        }
        if (source.OwnerUins != null) {
            this.OwnerUins = new String(source.OwnerUins);
        }
        if (source.ConsumptionTypes != null) {
            this.ConsumptionTypes = new String(source.ConsumptionTypes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessCodes", this.BusinessCodes);
        this.setParamSimple(map, prefix + "ProductCodes", this.ProductCodes);
        this.setParamSimple(map, prefix + "ComponentCode", this.ComponentCode);
        this.setParamSimple(map, prefix + "ZoneIds", this.ZoneIds);
        this.setParamSimple(map, prefix + "RegionIds", this.RegionIds);
        this.setParamSimple(map, prefix + "ProjectIds", this.ProjectIds);
        this.setParamSimple(map, prefix + "PayModes", this.PayModes);
        this.setParamSimple(map, prefix + "ActionTypes", this.ActionTypes);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "FeeType", this.FeeType);
        this.setParamSimple(map, prefix + "PayerUins", this.PayerUins);
        this.setParamSimple(map, prefix + "OwnerUins", this.OwnerUins);
        this.setParamSimple(map, prefix + "ConsumptionTypes", this.ConsumptionTypes);

    }
}

