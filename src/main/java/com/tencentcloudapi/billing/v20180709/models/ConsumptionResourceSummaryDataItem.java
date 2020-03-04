/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumptionResourceSummaryDataItem extends AbstractModel{

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 折后总价
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * 现金花费
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 地域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 付费模式名称
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * 产品码
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * 产品名称
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * 消耗类型
    */
    @SerializedName("ConsumptionTypeName")
    @Expose
    private String ConsumptionTypeName;

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
     * Get 资源名称 
     * @return ResourceName 资源名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
     * @param ResourceName 资源名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 折后总价 
     * @return RealTotalCost 折后总价
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 折后总价
     * @param RealTotalCost 折后总价
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 现金花费 
     * @return CashPayAmount 现金花费
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set 现金花费
     * @param CashPayAmount 现金花费
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(String RegionId) {
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
     * Get 付费模式 
     * @return PayMode 付费模式
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
     * @param PayMode 付费模式
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 付费模式名称 
     * @return PayModeName 付费模式名称
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set 付费模式名称
     * @param PayModeName 付费模式名称
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get 产品码 
     * @return BusinessCode 产品码
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set 产品码
     * @param BusinessCode 产品码
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get 产品名称 
     * @return BusinessCodeName 产品名称
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set 产品名称
     * @param BusinessCodeName 产品名称
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get 消耗类型 
     * @return ConsumptionTypeName 消耗类型
     */
    public String getConsumptionTypeName() {
        return this.ConsumptionTypeName;
    }

    /**
     * Set 消耗类型
     * @param ConsumptionTypeName 消耗类型
     */
    public void setConsumptionTypeName(String ConsumptionTypeName) {
        this.ConsumptionTypeName = ConsumptionTypeName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "ConsumptionTypeName", this.ConsumptionTypeName);

    }
}

