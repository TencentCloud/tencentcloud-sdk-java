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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MiniPkg extends AbstractModel {

    /**
    * 资源id
    */
    @SerializedName("ResourceIds")
    @Expose
    private String ResourceIds;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private Long Region;

    /**
    * 开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 购买数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 续费标志
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 计费项
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
    * 小程序网关类型 1新网关；0老网关
    */
    @SerializedName("GatewayType")
    @Expose
    private Long GatewayType;

    /**
     * Get 资源id 
     * @return ResourceIds 资源id
     */
    public String getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源id
     * @param ResourceIds 资源id
     */
    public void setResourceIds(String ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public Long getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(Long Region) {
        this.Region = Region;
    }

    /**
     * Get 开始时间 
     * @return BeginTime 开始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间
     * @param BeginTime 开始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 购买数量 
     * @return Count 购买数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 购买数量
     * @param Count 购买数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 续费标志 
     * @return RenewFlag 续费标志
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 续费标志
     * @param RenewFlag 续费标志
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 计费项 
     * @return BillingItem 计费项
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set 计费项
     * @param BillingItem 计费项
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    /**
     * Get 小程序网关类型 1新网关；0老网关 
     * @return GatewayType 小程序网关类型 1新网关；0老网关
     */
    public Long getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set 小程序网关类型 1新网关；0老网关
     * @param GatewayType 小程序网关类型 1新网关；0老网关
     */
    public void setGatewayType(Long GatewayType) {
        this.GatewayType = GatewayType;
    }

    public MiniPkg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MiniPkg(MiniPkg source) {
        if (source.ResourceIds != null) {
            this.ResourceIds = new String(source.ResourceIds);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Region != null) {
            this.Region = new Long(source.Region);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new Long(source.GatewayType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceIds", this.ResourceIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);

    }
}

