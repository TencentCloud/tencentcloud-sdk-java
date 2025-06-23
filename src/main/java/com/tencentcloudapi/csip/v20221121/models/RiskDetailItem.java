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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskDetailItem extends AbstractModel {

    /**
    * 首次发现时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 风险状态
    */
    @SerializedName("RiskStatus")
    @Expose
    private Long RiskStatus;

    /**
    * 风险内容
    */
    @SerializedName("RiskContent")
    @Expose
    private String RiskContent;

    /**
    * 云厂商
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * 云厂商名称
    */
    @SerializedName("ProviderName")
    @Expose
    private String ProviderName;

    /**
    * 云账号
    */
    @SerializedName("CloudAccountId")
    @Expose
    private String CloudAccountId;

    /**
    * 云账号名称
    */
    @SerializedName("CloudAccountName")
    @Expose
    private String CloudAccountName;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 风险ID
    */
    @SerializedName("RiskId")
    @Expose
    private Long RiskId;

    /**
    * 风险规则ID
    */
    @SerializedName("RiskRuleId")
    @Expose
    private String RiskRuleId;

    /**
    * 风险验证状态
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
     * Get 首次发现时间 
     * @return CreateTime 首次发现时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 首次发现时间
     * @param CreateTime 首次发现时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 风险状态 
     * @return RiskStatus 风险状态
     */
    public Long getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set 风险状态
     * @param RiskStatus 风险状态
     */
    public void setRiskStatus(Long RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get 风险内容 
     * @return RiskContent 风险内容
     */
    public String getRiskContent() {
        return this.RiskContent;
    }

    /**
     * Set 风险内容
     * @param RiskContent 风险内容
     */
    public void setRiskContent(String RiskContent) {
        this.RiskContent = RiskContent;
    }

    /**
     * Get 云厂商 
     * @return Provider 云厂商
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set 云厂商
     * @param Provider 云厂商
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get 云厂商名称 
     * @return ProviderName 云厂商名称
     */
    public String getProviderName() {
        return this.ProviderName;
    }

    /**
     * Set 云厂商名称
     * @param ProviderName 云厂商名称
     */
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    /**
     * Get 云账号 
     * @return CloudAccountId 云账号
     */
    public String getCloudAccountId() {
        return this.CloudAccountId;
    }

    /**
     * Set 云账号
     * @param CloudAccountId 云账号
     */
    public void setCloudAccountId(String CloudAccountId) {
        this.CloudAccountId = CloudAccountId;
    }

    /**
     * Get 云账号名称 
     * @return CloudAccountName 云账号名称
     */
    public String getCloudAccountName() {
        return this.CloudAccountName;
    }

    /**
     * Set 云账号名称
     * @param CloudAccountName 云账号名称
     */
    public void setCloudAccountName(String CloudAccountName) {
        this.CloudAccountName = CloudAccountName;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 风险ID 
     * @return RiskId 风险ID
     */
    public Long getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 风险ID
     * @param RiskId 风险ID
     */
    public void setRiskId(Long RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get 风险规则ID 
     * @return RiskRuleId 风险规则ID
     */
    public String getRiskRuleId() {
        return this.RiskRuleId;
    }

    /**
     * Set 风险规则ID
     * @param RiskRuleId 风险规则ID
     */
    public void setRiskRuleId(String RiskRuleId) {
        this.RiskRuleId = RiskRuleId;
    }

    /**
     * Get 风险验证状态 
     * @return CheckStatus 风险验证状态
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 风险验证状态
     * @param CheckStatus 风险验证状态
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    public RiskDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskDetailItem(RiskDetailItem source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new Long(source.RiskStatus);
        }
        if (source.RiskContent != null) {
            this.RiskContent = new String(source.RiskContent);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.ProviderName != null) {
            this.ProviderName = new String(source.ProviderName);
        }
        if (source.CloudAccountId != null) {
            this.CloudAccountId = new String(source.CloudAccountId);
        }
        if (source.CloudAccountName != null) {
            this.CloudAccountName = new String(source.CloudAccountName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RiskId != null) {
            this.RiskId = new Long(source.RiskId);
        }
        if (source.RiskRuleId != null) {
            this.RiskRuleId = new String(source.RiskRuleId);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamSimple(map, prefix + "RiskContent", this.RiskContent);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "ProviderName", this.ProviderName);
        this.setParamSimple(map, prefix + "CloudAccountId", this.CloudAccountId);
        this.setParamSimple(map, prefix + "CloudAccountName", this.CloudAccountName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "RiskRuleId", this.RiskRuleId);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);

    }
}

