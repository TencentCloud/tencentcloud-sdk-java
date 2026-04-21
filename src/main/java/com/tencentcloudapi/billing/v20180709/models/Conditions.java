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

public class Conditions extends AbstractModel {

    /**
    * <p>只支持6个月和12个月两个值</p>
    */
    @SerializedName("TimeRange")
    @Expose
    private Long TimeRange;

    /**
    * <p>产品名称代码</p>
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>地域ID</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>付费模式，可选prePay和postPay</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>资源关键字</p>
    */
    @SerializedName("ResourceKeyword")
    @Expose
    private String ResourceKeyword;

    /**
    * <p>产品名称代码</p>
    */
    @SerializedName("BusinessCodes")
    @Expose
    private String [] BusinessCodes;

    /**
    * <p>子产品名称代码</p>
    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
    * <p>地域ID</p>
    */
    @SerializedName("RegionIds")
    @Expose
    private Long [] RegionIds;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * <p>付费模式，可选prePay和postPay</p>
    */
    @SerializedName("PayModes")
    @Expose
    private String [] PayModes;

    /**
    * <p>交易类型</p>
    */
    @SerializedName("ActionTypes")
    @Expose
    private String [] ActionTypes;

    /**
    * <p>是否隐藏0元流水</p>
    */
    @SerializedName("HideFreeCost")
    @Expose
    private Long HideFreeCost;

    /**
    * <p>排序规则，可选desc和asc</p>
    */
    @SerializedName("OrderByCost")
    @Expose
    private String OrderByCost;

    /**
    * <p>交易ID</p>
    */
    @SerializedName("BillIds")
    @Expose
    private String [] BillIds;

    /**
    * <p>组件编码</p>
    */
    @SerializedName("ComponentCodes")
    @Expose
    private String [] ComponentCodes;

    /**
    * <p>文件ID</p>
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * <p>文件类型</p>
    */
    @SerializedName("FileTypes")
    @Expose
    private String [] FileTypes;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
     * Get <p>只支持6个月和12个月两个值</p> 
     * @return TimeRange <p>只支持6个月和12个月两个值</p>
     */
    public Long getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set <p>只支持6个月和12个月两个值</p>
     * @param TimeRange <p>只支持6个月和12个月两个值</p>
     */
    public void setTimeRange(Long TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get <p>产品名称代码</p> 
     * @return BusinessCode <p>产品名称代码</p>
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set <p>产品名称代码</p>
     * @param BusinessCode <p>产品名称代码</p>
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get <p>付费模式，可选prePay和postPay</p> 
     * @return PayMode <p>付费模式，可选prePay和postPay</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式，可选prePay和postPay</p>
     * @param PayMode <p>付费模式，可选prePay和postPay</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>资源关键字</p> 
     * @return ResourceKeyword <p>资源关键字</p>
     */
    public String getResourceKeyword() {
        return this.ResourceKeyword;
    }

    /**
     * Set <p>资源关键字</p>
     * @param ResourceKeyword <p>资源关键字</p>
     */
    public void setResourceKeyword(String ResourceKeyword) {
        this.ResourceKeyword = ResourceKeyword;
    }

    /**
     * Get <p>产品名称代码</p> 
     * @return BusinessCodes <p>产品名称代码</p>
     */
    public String [] getBusinessCodes() {
        return this.BusinessCodes;
    }

    /**
     * Set <p>产品名称代码</p>
     * @param BusinessCodes <p>产品名称代码</p>
     */
    public void setBusinessCodes(String [] BusinessCodes) {
        this.BusinessCodes = BusinessCodes;
    }

    /**
     * Get <p>子产品名称代码</p> 
     * @return ProductCodes <p>子产品名称代码</p>
     */
    public String [] getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set <p>子产品名称代码</p>
     * @param ProductCodes <p>子产品名称代码</p>
     */
    public void setProductCodes(String [] ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    /**
     * Get <p>地域ID</p> 
     * @return RegionIds <p>地域ID</p>
     */
    public Long [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set <p>地域ID</p>
     * @param RegionIds <p>地域ID</p>
     */
    public void setRegionIds(Long [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectIds <p>项目ID</p>
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectIds <p>项目ID</p>
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>付费模式，可选prePay和postPay</p> 
     * @return PayModes <p>付费模式，可选prePay和postPay</p>
     */
    public String [] getPayModes() {
        return this.PayModes;
    }

    /**
     * Set <p>付费模式，可选prePay和postPay</p>
     * @param PayModes <p>付费模式，可选prePay和postPay</p>
     */
    public void setPayModes(String [] PayModes) {
        this.PayModes = PayModes;
    }

    /**
     * Get <p>交易类型</p> 
     * @return ActionTypes <p>交易类型</p>
     */
    public String [] getActionTypes() {
        return this.ActionTypes;
    }

    /**
     * Set <p>交易类型</p>
     * @param ActionTypes <p>交易类型</p>
     */
    public void setActionTypes(String [] ActionTypes) {
        this.ActionTypes = ActionTypes;
    }

    /**
     * Get <p>是否隐藏0元流水</p> 
     * @return HideFreeCost <p>是否隐藏0元流水</p>
     */
    public Long getHideFreeCost() {
        return this.HideFreeCost;
    }

    /**
     * Set <p>是否隐藏0元流水</p>
     * @param HideFreeCost <p>是否隐藏0元流水</p>
     */
    public void setHideFreeCost(Long HideFreeCost) {
        this.HideFreeCost = HideFreeCost;
    }

    /**
     * Get <p>排序规则，可选desc和asc</p> 
     * @return OrderByCost <p>排序规则，可选desc和asc</p>
     */
    public String getOrderByCost() {
        return this.OrderByCost;
    }

    /**
     * Set <p>排序规则，可选desc和asc</p>
     * @param OrderByCost <p>排序规则，可选desc和asc</p>
     */
    public void setOrderByCost(String OrderByCost) {
        this.OrderByCost = OrderByCost;
    }

    /**
     * Get <p>交易ID</p> 
     * @return BillIds <p>交易ID</p>
     */
    public String [] getBillIds() {
        return this.BillIds;
    }

    /**
     * Set <p>交易ID</p>
     * @param BillIds <p>交易ID</p>
     */
    public void setBillIds(String [] BillIds) {
        this.BillIds = BillIds;
    }

    /**
     * Get <p>组件编码</p> 
     * @return ComponentCodes <p>组件编码</p>
     */
    public String [] getComponentCodes() {
        return this.ComponentCodes;
    }

    /**
     * Set <p>组件编码</p>
     * @param ComponentCodes <p>组件编码</p>
     */
    public void setComponentCodes(String [] ComponentCodes) {
        this.ComponentCodes = ComponentCodes;
    }

    /**
     * Get <p>文件ID</p> 
     * @return FileIds <p>文件ID</p>
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set <p>文件ID</p>
     * @param FileIds <p>文件ID</p>
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get <p>文件类型</p> 
     * @return FileTypes <p>文件类型</p>
     */
    public String [] getFileTypes() {
        return this.FileTypes;
    }

    /**
     * Set <p>文件类型</p>
     * @param FileTypes <p>文件类型</p>
     */
    public void setFileTypes(String [] FileTypes) {
        this.FileTypes = FileTypes;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    public Conditions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Conditions(Conditions source) {
        if (source.TimeRange != null) {
            this.TimeRange = new Long(source.TimeRange);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ResourceKeyword != null) {
            this.ResourceKeyword = new String(source.ResourceKeyword);
        }
        if (source.BusinessCodes != null) {
            this.BusinessCodes = new String[source.BusinessCodes.length];
            for (int i = 0; i < source.BusinessCodes.length; i++) {
                this.BusinessCodes[i] = new String(source.BusinessCodes[i]);
            }
        }
        if (source.ProductCodes != null) {
            this.ProductCodes = new String[source.ProductCodes.length];
            for (int i = 0; i < source.ProductCodes.length; i++) {
                this.ProductCodes[i] = new String(source.ProductCodes[i]);
            }
        }
        if (source.RegionIds != null) {
            this.RegionIds = new Long[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new Long(source.RegionIds[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.PayModes != null) {
            this.PayModes = new String[source.PayModes.length];
            for (int i = 0; i < source.PayModes.length; i++) {
                this.PayModes[i] = new String(source.PayModes[i]);
            }
        }
        if (source.ActionTypes != null) {
            this.ActionTypes = new String[source.ActionTypes.length];
            for (int i = 0; i < source.ActionTypes.length; i++) {
                this.ActionTypes[i] = new String(source.ActionTypes[i]);
            }
        }
        if (source.HideFreeCost != null) {
            this.HideFreeCost = new Long(source.HideFreeCost);
        }
        if (source.OrderByCost != null) {
            this.OrderByCost = new String(source.OrderByCost);
        }
        if (source.BillIds != null) {
            this.BillIds = new String[source.BillIds.length];
            for (int i = 0; i < source.BillIds.length; i++) {
                this.BillIds[i] = new String(source.BillIds[i]);
            }
        }
        if (source.ComponentCodes != null) {
            this.ComponentCodes = new String[source.ComponentCodes.length];
            for (int i = 0; i < source.ComponentCodes.length; i++) {
                this.ComponentCodes[i] = new String(source.ComponentCodes[i]);
            }
        }
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.FileTypes != null) {
            this.FileTypes = new String[source.FileTypes.length];
            for (int i = 0; i < source.FileTypes.length; i++) {
                this.FileTypes[i] = new String(source.FileTypes[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ResourceKeyword", this.ResourceKeyword);
        this.setParamArraySimple(map, prefix + "BusinessCodes.", this.BusinessCodes);
        this.setParamArraySimple(map, prefix + "ProductCodes.", this.ProductCodes);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "PayModes.", this.PayModes);
        this.setParamArraySimple(map, prefix + "ActionTypes.", this.ActionTypes);
        this.setParamSimple(map, prefix + "HideFreeCost", this.HideFreeCost);
        this.setParamSimple(map, prefix + "OrderByCost", this.OrderByCost);
        this.setParamArraySimple(map, prefix + "BillIds.", this.BillIds);
        this.setParamArraySimple(map, prefix + "ComponentCodes.", this.ComponentCodes);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamArraySimple(map, prefix + "FileTypes.", this.FileTypes);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

