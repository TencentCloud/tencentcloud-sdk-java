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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePartitionRequest extends AbstractModel {

    /**
    * <p>交易类型：purchase-新购，renew-续费，modify-变配</p>
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * <p>付费模式：0-后付费，1-预付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>资源配额列表（计费项+数量）</p>
    */
    @SerializedName("ResourceQuotaList")
    @Expose
    private ResourceQuota [] ResourceQuotaList;

    /**
    * <p>时间大小，预付费时为购买月数，后付费时为3600</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>时间单位，预付费为m（月），后付费为s（秒）</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>自动续费标志：0-默认，1-自动续费，2-不自动续费（仅预付费有效）</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>弹性资源池名称，用于订单页展示</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>队列描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>交易类型：purchase-新购，renew-续费，modify-变配</p> 
     * @return ActionType <p>交易类型：purchase-新购，renew-续费，modify-变配</p>
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>交易类型：purchase-新购，renew-续费，modify-变配</p>
     * @param ActionType <p>交易类型：purchase-新购，renew-续费，modify-变配</p>
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>付费模式：0-后付费，1-预付费</p> 
     * @return PayMode <p>付费模式：0-后付费，1-预付费</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式：0-后付费，1-预付费</p>
     * @param PayMode <p>付费模式：0-后付费，1-预付费</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>资源配额列表（计费项+数量）</p> 
     * @return ResourceQuotaList <p>资源配额列表（计费项+数量）</p>
     */
    public ResourceQuota [] getResourceQuotaList() {
        return this.ResourceQuotaList;
    }

    /**
     * Set <p>资源配额列表（计费项+数量）</p>
     * @param ResourceQuotaList <p>资源配额列表（计费项+数量）</p>
     */
    public void setResourceQuotaList(ResourceQuota [] ResourceQuotaList) {
        this.ResourceQuotaList = ResourceQuotaList;
    }

    /**
     * Get <p>时间大小，预付费时为购买月数，后付费时为3600</p> 
     * @return TimeSpan <p>时间大小，预付费时为购买月数，后付费时为3600</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>时间大小，预付费时为购买月数，后付费时为3600</p>
     * @param TimeSpan <p>时间大小，预付费时为购买月数，后付费时为3600</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>时间单位，预付费为m（月），后付费为s（秒）</p> 
     * @return TimeUnit <p>时间单位，预付费为m（月），后付费为s（秒）</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>时间单位，预付费为m（月），后付费为s（秒）</p>
     * @param TimeUnit <p>时间单位，预付费为m（月），后付费为s（秒）</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>自动续费标志：0-默认，1-自动续费，2-不自动续费（仅预付费有效）</p> 
     * @return AutoRenewFlag <p>自动续费标志：0-默认，1-自动续费，2-不自动续费（仅预付费有效）</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标志：0-默认，1-自动续费，2-不自动续费（仅预付费有效）</p>
     * @param AutoRenewFlag <p>自动续费标志：0-默认，1-自动续费，2-不自动续费（仅预付费有效）</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>弹性资源池名称，用于订单页展示</p> 
     * @return Name <p>弹性资源池名称，用于订单页展示</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>弹性资源池名称，用于订单页展示</p>
     * @param Name <p>弹性资源池名称，用于订单页展示</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>队列描述</p> 
     * @return Description <p>队列描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>队列描述</p>
     * @param Description <p>队列描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreatePartitionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePartitionRequest(CreatePartitionRequest source) {
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ResourceQuotaList != null) {
            this.ResourceQuotaList = new ResourceQuota[source.ResourceQuotaList.length];
            for (int i = 0; i < source.ResourceQuotaList.length; i++) {
                this.ResourceQuotaList[i] = new ResourceQuota(source.ResourceQuotaList[i]);
            }
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArrayObj(map, prefix + "ResourceQuotaList.", this.ResourceQuotaList);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

