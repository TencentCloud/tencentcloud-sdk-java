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
    * <p>产品名称代码</p>
    */
    @SerializedName("BusinessCodes")
    @Expose
    private String BusinessCodes;

    /**
    * <p>子产品名称代码</p>
    */
    @SerializedName("ProductCodes")
    @Expose
    private String ProductCodes;

    /**
    * <p>组件类型代码</p>
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * <p>可用区ID：资源所属可用区ID</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private String ZoneIds;

    /**
    * <p>地域ID:资源所属地域ID</p>
    */
    @SerializedName("RegionIds")
    @Expose
    private String RegionIds;

    /**
    * <p>项目ID:资源所属项目ID</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private String ProjectIds;

    /**
    * <p>计费模式 prePay(表示包年包月)/postPay(表示按量计费)</p>
    */
    @SerializedName("PayModes")
    @Expose
    private String PayModes;

    /**
    * <p>交易类型，查询交易类型（请使用交易类型code入参）</p>
    */
    @SerializedName("ActionTypes")
    @Expose
    private String ActionTypes;

    /**
    * <p>分账标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * <p>费用类型，查询费用类型（请使用费用类型code入参）入参枚举如下</p><p>枚举值：</p><ul><li>cashPayAmount： 现金</li><li>incentivePayAmount： 赠送金</li><li>voucherPayAmount： 优惠券</li><li>transferPayAmount： 分成金</li></ul>
    */
    @SerializedName("FeeType")
    @Expose
    private String FeeType;

    /**
    * <p>查询成本分析数据的用户UIN</p>
    */
    @SerializedName("PayerUins")
    @Expose
    private String PayerUins;

    /**
    * <p>使用资源的用户UIN</p>
    */
    @SerializedName("OwnerUins")
    @Expose
    private String OwnerUins;

    /**
    * <p>消耗类型，查询消耗类型（请使用消耗类型code入参）</p>
    */
    @SerializedName("ConsumptionTypes")
    @Expose
    private String ConsumptionTypes;

    /**
     * Get <p>产品名称代码</p> 
     * @return BusinessCodes <p>产品名称代码</p>
     */
    public String getBusinessCodes() {
        return this.BusinessCodes;
    }

    /**
     * Set <p>产品名称代码</p>
     * @param BusinessCodes <p>产品名称代码</p>
     */
    public void setBusinessCodes(String BusinessCodes) {
        this.BusinessCodes = BusinessCodes;
    }

    /**
     * Get <p>子产品名称代码</p> 
     * @return ProductCodes <p>子产品名称代码</p>
     */
    public String getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set <p>子产品名称代码</p>
     * @param ProductCodes <p>子产品名称代码</p>
     */
    public void setProductCodes(String ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    /**
     * Get <p>组件类型代码</p> 
     * @return ComponentCode <p>组件类型代码</p>
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set <p>组件类型代码</p>
     * @param ComponentCode <p>组件类型代码</p>
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get <p>可用区ID：资源所属可用区ID</p> 
     * @return ZoneIds <p>可用区ID：资源所属可用区ID</p>
     */
    public String getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>可用区ID：资源所属可用区ID</p>
     * @param ZoneIds <p>可用区ID：资源所属可用区ID</p>
     */
    public void setZoneIds(String ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>地域ID:资源所属地域ID</p> 
     * @return RegionIds <p>地域ID:资源所属地域ID</p>
     */
    public String getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set <p>地域ID:资源所属地域ID</p>
     * @param RegionIds <p>地域ID:资源所属地域ID</p>
     */
    public void setRegionIds(String RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get <p>项目ID:资源所属项目ID</p> 
     * @return ProjectIds <p>项目ID:资源所属项目ID</p>
     */
    public String getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>项目ID:资源所属项目ID</p>
     * @param ProjectIds <p>项目ID:资源所属项目ID</p>
     */
    public void setProjectIds(String ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>计费模式 prePay(表示包年包月)/postPay(表示按量计费)</p> 
     * @return PayModes <p>计费模式 prePay(表示包年包月)/postPay(表示按量计费)</p>
     */
    public String getPayModes() {
        return this.PayModes;
    }

    /**
     * Set <p>计费模式 prePay(表示包年包月)/postPay(表示按量计费)</p>
     * @param PayModes <p>计费模式 prePay(表示包年包月)/postPay(表示按量计费)</p>
     */
    public void setPayModes(String PayModes) {
        this.PayModes = PayModes;
    }

    /**
     * Get <p>交易类型，查询交易类型（请使用交易类型code入参）</p> 
     * @return ActionTypes <p>交易类型，查询交易类型（请使用交易类型code入参）</p>
     */
    public String getActionTypes() {
        return this.ActionTypes;
    }

    /**
     * Set <p>交易类型，查询交易类型（请使用交易类型code入参）</p>
     * @param ActionTypes <p>交易类型，查询交易类型（请使用交易类型code入参）</p>
     */
    public void setActionTypes(String ActionTypes) {
        this.ActionTypes = ActionTypes;
    }

    /**
     * Get <p>分账标签</p> 
     * @return Tags <p>分账标签</p>
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set <p>分账标签</p>
     * @param Tags <p>分账标签</p>
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>费用类型，查询费用类型（请使用费用类型code入参）入参枚举如下</p><p>枚举值：</p><ul><li>cashPayAmount： 现金</li><li>incentivePayAmount： 赠送金</li><li>voucherPayAmount： 优惠券</li><li>transferPayAmount： 分成金</li></ul> 
     * @return FeeType <p>费用类型，查询费用类型（请使用费用类型code入参）入参枚举如下</p><p>枚举值：</p><ul><li>cashPayAmount： 现金</li><li>incentivePayAmount： 赠送金</li><li>voucherPayAmount： 优惠券</li><li>transferPayAmount： 分成金</li></ul>
     */
    public String getFeeType() {
        return this.FeeType;
    }

    /**
     * Set <p>费用类型，查询费用类型（请使用费用类型code入参）入参枚举如下</p><p>枚举值：</p><ul><li>cashPayAmount： 现金</li><li>incentivePayAmount： 赠送金</li><li>voucherPayAmount： 优惠券</li><li>transferPayAmount： 分成金</li></ul>
     * @param FeeType <p>费用类型，查询费用类型（请使用费用类型code入参）入参枚举如下</p><p>枚举值：</p><ul><li>cashPayAmount： 现金</li><li>incentivePayAmount： 赠送金</li><li>voucherPayAmount： 优惠券</li><li>transferPayAmount： 分成金</li></ul>
     */
    public void setFeeType(String FeeType) {
        this.FeeType = FeeType;
    }

    /**
     * Get <p>查询成本分析数据的用户UIN</p> 
     * @return PayerUins <p>查询成本分析数据的用户UIN</p>
     */
    public String getPayerUins() {
        return this.PayerUins;
    }

    /**
     * Set <p>查询成本分析数据的用户UIN</p>
     * @param PayerUins <p>查询成本分析数据的用户UIN</p>
     */
    public void setPayerUins(String PayerUins) {
        this.PayerUins = PayerUins;
    }

    /**
     * Get <p>使用资源的用户UIN</p> 
     * @return OwnerUins <p>使用资源的用户UIN</p>
     */
    public String getOwnerUins() {
        return this.OwnerUins;
    }

    /**
     * Set <p>使用资源的用户UIN</p>
     * @param OwnerUins <p>使用资源的用户UIN</p>
     */
    public void setOwnerUins(String OwnerUins) {
        this.OwnerUins = OwnerUins;
    }

    /**
     * Get <p>消耗类型，查询消耗类型（请使用消耗类型code入参）</p> 
     * @return ConsumptionTypes <p>消耗类型，查询消耗类型（请使用消耗类型code入参）</p>
     */
    public String getConsumptionTypes() {
        return this.ConsumptionTypes;
    }

    /**
     * Set <p>消耗类型，查询消耗类型（请使用消耗类型code入参）</p>
     * @param ConsumptionTypes <p>消耗类型，查询消耗类型（请使用消耗类型code入参）</p>
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

