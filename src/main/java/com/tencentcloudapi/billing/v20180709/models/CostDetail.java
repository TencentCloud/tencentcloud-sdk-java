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

public class CostDetail extends AbstractModel {

    /**
    * <p>支付者uin</p>
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * <p>产品名称</p>
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * <p>子产品名称</p>
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * <p>计费模式名称</p>
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * <p>项目名称</p>
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>区域名称</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>地区名称</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>资源id</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>资源名称</p>
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>类型名称</p>
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
    * <p>订单id</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * <p>交易id</p>
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * <p>费用开始时间</p>
    */
    @SerializedName("FeeBeginTime")
    @Expose
    private String FeeBeginTime;

    /**
    * <p>费用结束时间</p>
    */
    @SerializedName("FeeEndTime")
    @Expose
    private String FeeEndTime;

    /**
    * <p>组件明细</p>
    */
    @SerializedName("ComponentSet")
    @Expose
    private CostComponentSet [] ComponentSet;

    /**
    * <p>子产品名称代码</p>
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private BillTagInfo [] Tags;

    /**
    * <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p>
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * <p>使用者UIN：实际使用资源的账号 ID</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>扣费时间：结算扣费时间</p>
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

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
     * Get <p>产品名称</p> 
     * @return BusinessCodeName <p>产品名称</p>
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set <p>产品名称</p>
     * @param BusinessCodeName <p>产品名称</p>
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get <p>子产品名称</p> 
     * @return ProductCodeName <p>子产品名称</p>
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set <p>子产品名称</p>
     * @param ProductCodeName <p>子产品名称</p>
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get <p>计费模式名称</p> 
     * @return PayModeName <p>计费模式名称</p>
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set <p>计费模式名称</p>
     * @param PayModeName <p>计费模式名称</p>
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get <p>项目名称</p> 
     * @return ProjectName <p>项目名称</p>
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名称</p>
     * @param ProjectName <p>项目名称</p>
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>区域名称</p> 
     * @return RegionName <p>区域名称</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>区域名称</p>
     * @param RegionName <p>区域名称</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>地区名称</p> 
     * @return ZoneName <p>地区名称</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>地区名称</p>
     * @param ZoneName <p>地区名称</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>资源id</p> 
     * @return ResourceId <p>资源id</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源id</p>
     * @param ResourceId <p>资源id</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>资源名称</p> 
     * @return ResourceName <p>资源名称</p>
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set <p>资源名称</p>
     * @param ResourceName <p>资源名称</p>
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get <p>类型名称</p> 
     * @return ActionTypeName <p>类型名称</p>
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set <p>类型名称</p>
     * @param ActionTypeName <p>类型名称</p>
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    /**
     * Get <p>订单id</p> 
     * @return OrderId <p>订单id</p>
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>订单id</p>
     * @param OrderId <p>订单id</p>
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>交易id</p> 
     * @return BillId <p>交易id</p>
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set <p>交易id</p>
     * @param BillId <p>交易id</p>
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * Get <p>费用开始时间</p> 
     * @return FeeBeginTime <p>费用开始时间</p>
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * Set <p>费用开始时间</p>
     * @param FeeBeginTime <p>费用开始时间</p>
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * Get <p>费用结束时间</p> 
     * @return FeeEndTime <p>费用结束时间</p>
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * Set <p>费用结束时间</p>
     * @param FeeEndTime <p>费用结束时间</p>
     */
    public void setFeeEndTime(String FeeEndTime) {
        this.FeeEndTime = FeeEndTime;
    }

    /**
     * Get <p>组件明细</p> 
     * @return ComponentSet <p>组件明细</p>
     */
    public CostComponentSet [] getComponentSet() {
        return this.ComponentSet;
    }

    /**
     * Set <p>组件明细</p>
     * @param ComponentSet <p>组件明细</p>
     */
    public void setComponentSet(CostComponentSet [] ComponentSet) {
        this.ComponentSet = ComponentSet;
    }

    /**
     * Get <p>子产品名称代码</p> 
     * @return ProductCode <p>子产品名称代码</p>
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set <p>子产品名称代码</p>
     * @param ProductCode <p>子产品名称代码</p>
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get <p>标签信息</p> 
     * @return Tags <p>标签信息</p>
     */
    public BillTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息</p>
     * @param Tags <p>标签信息</p>
     */
    public void setTags(BillTagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p> 
     * @return OperateUin <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p>
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p>
     * @param OperateUin <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p>
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get <p>使用者UIN：实际使用资源的账号 ID</p> 
     * @return OwnerUin <p>使用者UIN：实际使用资源的账号 ID</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>使用者UIN：实际使用资源的账号 ID</p>
     * @param OwnerUin <p>使用者UIN：实际使用资源的账号 ID</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>扣费时间：结算扣费时间</p> 
     * @return PayTime <p>扣费时间：结算扣费时间</p>
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set <p>扣费时间：结算扣费时间</p>
     * @param PayTime <p>扣费时间：结算扣费时间</p>
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    public CostDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CostDetail(CostDetail source) {
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.ProductCodeName != null) {
            this.ProductCodeName = new String(source.ProductCodeName);
        }
        if (source.PayModeName != null) {
            this.PayModeName = new String(source.PayModeName);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ActionTypeName != null) {
            this.ActionTypeName = new String(source.ActionTypeName);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.BillId != null) {
            this.BillId = new String(source.BillId);
        }
        if (source.FeeBeginTime != null) {
            this.FeeBeginTime = new String(source.FeeBeginTime);
        }
        if (source.FeeEndTime != null) {
            this.FeeEndTime = new String(source.FeeEndTime);
        }
        if (source.ComponentSet != null) {
            this.ComponentSet = new CostComponentSet[source.ComponentSet.length];
            for (int i = 0; i < source.ComponentSet.length; i++) {
                this.ComponentSet[i] = new CostComponentSet(source.ComponentSet[i]);
            }
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.Tags != null) {
            this.Tags = new BillTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new BillTagInfo(source.Tags[i]);
            }
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.PayTime != null) {
            this.PayTime = new String(source.PayTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "ProductCodeName", this.ProductCodeName);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ActionTypeName", this.ActionTypeName);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "FeeBeginTime", this.FeeBeginTime);
        this.setParamSimple(map, prefix + "FeeEndTime", this.FeeEndTime);
        this.setParamArrayObj(map, prefix + "ComponentSet.", this.ComponentSet);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);

    }
}

