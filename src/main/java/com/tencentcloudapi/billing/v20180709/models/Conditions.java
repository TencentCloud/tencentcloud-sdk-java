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
    * 只支持6和12两个值
    */
    @SerializedName("TimeRange")
    @Expose
    private Long TimeRange;

    /**
    * 产品名称代码
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 付费模式，可选prePay和postPay
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 资源关键字
    */
    @SerializedName("ResourceKeyword")
    @Expose
    private String ResourceKeyword;

    /**
    * 产品名称代码
    */
    @SerializedName("BusinessCodes")
    @Expose
    private String [] BusinessCodes;

    /**
    * 子产品名称代码
    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
    * 地域ID
    */
    @SerializedName("RegionIds")
    @Expose
    private Long [] RegionIds;

    /**
    * 项目ID
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 付费模式，可选prePay和postPay
    */
    @SerializedName("PayModes")
    @Expose
    private String [] PayModes;

    /**
    * 交易类型
    */
    @SerializedName("ActionTypes")
    @Expose
    private String [] ActionTypes;

    /**
    * 是否隐藏0元流水
    */
    @SerializedName("HideFreeCost")
    @Expose
    private Long HideFreeCost;

    /**
    * 排序规则，可选desc和asc
    */
    @SerializedName("OrderByCost")
    @Expose
    private String OrderByCost;

    /**
    * 交易ID
    */
    @SerializedName("BillIds")
    @Expose
    private String [] BillIds;

    /**
    * 组件编码
    */
    @SerializedName("ComponentCodes")
    @Expose
    private String [] ComponentCodes;

    /**
    * 文件ID
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 文件类型
    */
    @SerializedName("FileTypes")
    @Expose
    private String [] FileTypes;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
     * Get 只支持6和12两个值 
     * @return TimeRange 只支持6和12两个值
     */
    public Long getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set 只支持6和12两个值
     * @param TimeRange 只支持6和12两个值
     */
    public void setTimeRange(Long TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get 产品名称代码 
     * @return BusinessCode 产品名称代码
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set 产品名称代码
     * @param BusinessCode 产品名称代码
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 付费模式，可选prePay和postPay 
     * @return PayMode 付费模式，可选prePay和postPay
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式，可选prePay和postPay
     * @param PayMode 付费模式，可选prePay和postPay
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 资源关键字 
     * @return ResourceKeyword 资源关键字
     */
    public String getResourceKeyword() {
        return this.ResourceKeyword;
    }

    /**
     * Set 资源关键字
     * @param ResourceKeyword 资源关键字
     */
    public void setResourceKeyword(String ResourceKeyword) {
        this.ResourceKeyword = ResourceKeyword;
    }

    /**
     * Get 产品名称代码 
     * @return BusinessCodes 产品名称代码
     */
    public String [] getBusinessCodes() {
        return this.BusinessCodes;
    }

    /**
     * Set 产品名称代码
     * @param BusinessCodes 产品名称代码
     */
    public void setBusinessCodes(String [] BusinessCodes) {
        this.BusinessCodes = BusinessCodes;
    }

    /**
     * Get 子产品名称代码 
     * @return ProductCodes 子产品名称代码
     */
    public String [] getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set 子产品名称代码
     * @param ProductCodes 子产品名称代码
     */
    public void setProductCodes(String [] ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    /**
     * Get 地域ID 
     * @return RegionIds 地域ID
     */
    public Long [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set 地域ID
     * @param RegionIds 地域ID
     */
    public void setRegionIds(Long [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get 项目ID 
     * @return ProjectIds 项目ID
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID
     * @param ProjectIds 项目ID
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 付费模式，可选prePay和postPay 
     * @return PayModes 付费模式，可选prePay和postPay
     */
    public String [] getPayModes() {
        return this.PayModes;
    }

    /**
     * Set 付费模式，可选prePay和postPay
     * @param PayModes 付费模式，可选prePay和postPay
     */
    public void setPayModes(String [] PayModes) {
        this.PayModes = PayModes;
    }

    /**
     * Get 交易类型 
     * @return ActionTypes 交易类型
     */
    public String [] getActionTypes() {
        return this.ActionTypes;
    }

    /**
     * Set 交易类型
     * @param ActionTypes 交易类型
     */
    public void setActionTypes(String [] ActionTypes) {
        this.ActionTypes = ActionTypes;
    }

    /**
     * Get 是否隐藏0元流水 
     * @return HideFreeCost 是否隐藏0元流水
     */
    public Long getHideFreeCost() {
        return this.HideFreeCost;
    }

    /**
     * Set 是否隐藏0元流水
     * @param HideFreeCost 是否隐藏0元流水
     */
    public void setHideFreeCost(Long HideFreeCost) {
        this.HideFreeCost = HideFreeCost;
    }

    /**
     * Get 排序规则，可选desc和asc 
     * @return OrderByCost 排序规则，可选desc和asc
     */
    public String getOrderByCost() {
        return this.OrderByCost;
    }

    /**
     * Set 排序规则，可选desc和asc
     * @param OrderByCost 排序规则，可选desc和asc
     */
    public void setOrderByCost(String OrderByCost) {
        this.OrderByCost = OrderByCost;
    }

    /**
     * Get 交易ID 
     * @return BillIds 交易ID
     */
    public String [] getBillIds() {
        return this.BillIds;
    }

    /**
     * Set 交易ID
     * @param BillIds 交易ID
     */
    public void setBillIds(String [] BillIds) {
        this.BillIds = BillIds;
    }

    /**
     * Get 组件编码 
     * @return ComponentCodes 组件编码
     */
    public String [] getComponentCodes() {
        return this.ComponentCodes;
    }

    /**
     * Set 组件编码
     * @param ComponentCodes 组件编码
     */
    public void setComponentCodes(String [] ComponentCodes) {
        this.ComponentCodes = ComponentCodes;
    }

    /**
     * Get 文件ID 
     * @return FileIds 文件ID
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 文件ID
     * @param FileIds 文件ID
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get 文件类型 
     * @return FileTypes 文件类型
     */
    public String [] getFileTypes() {
        return this.FileTypes;
    }

    /**
     * Set 文件类型
     * @param FileTypes 文件类型
     */
    public void setFileTypes(String [] FileTypes) {
        this.FileTypes = FileTypes;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
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

