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

public class RiskRuleItem extends AbstractModel {

    /**
    * 风险检查项ID
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 云厂商名称
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例类型名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 风险名称
    */
    @SerializedName("RiskTitle")
    @Expose
    private String RiskTitle;

    /**
    * 检查类型
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * 风险等级
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * 风险危害
    */
    @SerializedName("RiskInfluence")
    @Expose
    private String RiskInfluence;

    /**
     * Get 风险检查项ID 
     * @return ItemId 风险检查项ID
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 风险检查项ID
     * @param ItemId 风险检查项ID
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 云厂商名称 
     * @return Provider 云厂商名称
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set 云厂商名称
     * @param Provider 云厂商名称
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get 实例类型 
     * @return InstanceType 实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例类型名称 
     * @return InstanceName 实例类型名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例类型名称
     * @param InstanceName 实例类型名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 风险名称 
     * @return RiskTitle 风险名称
     */
    public String getRiskTitle() {
        return this.RiskTitle;
    }

    /**
     * Set 风险名称
     * @param RiskTitle 风险名称
     */
    public void setRiskTitle(String RiskTitle) {
        this.RiskTitle = RiskTitle;
    }

    /**
     * Get 检查类型 
     * @return CheckType 检查类型
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set 检查类型
     * @param CheckType 检查类型
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get 风险等级 
     * @return Severity 风险等级
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set 风险等级
     * @param Severity 风险等级
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get 风险危害 
     * @return RiskInfluence 风险危害
     */
    public String getRiskInfluence() {
        return this.RiskInfluence;
    }

    /**
     * Set 风险危害
     * @param RiskInfluence 风险危害
     */
    public void setRiskInfluence(String RiskInfluence) {
        this.RiskInfluence = RiskInfluence;
    }

    public RiskRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskRuleItem(RiskRuleItem source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RiskTitle != null) {
            this.RiskTitle = new String(source.RiskTitle);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.RiskInfluence != null) {
            this.RiskInfluence = new String(source.RiskInfluence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RiskTitle", this.RiskTitle);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "RiskInfluence", this.RiskInfluence);

    }
}

