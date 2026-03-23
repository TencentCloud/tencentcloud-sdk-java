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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McpSecurityRulesVO extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 规则类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 风险等级
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 版本号
    */
    @SerializedName("VersionNumber")
    @Expose
    private String VersionNumber;

    /**
    * 状态开关
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当前选择的处置动作
    */
    @SerializedName("Act")
    @Expose
    private String Act;

    /**
    * 支持的处置动作
    */
    @SerializedName("SupportActs")
    @Expose
    private String [] SupportActs;

    /**
    * 内容类型
    */
    @SerializedName("BodyType")
    @Expose
    private String BodyType;

    /**
    * icon类型
    */
    @SerializedName("IconType")
    @Expose
    private String IconType;

    /**
     * Get 规则ID 
     * @return ID 规则ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 规则ID
     * @param ID 规则ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 规则类型 
     * @return Type 规则类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 规则类型
     * @param Type 规则类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则描述 
     * @return Description 规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
     * @param Description 规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 风险等级 
     * @return RiskLevel 风险等级
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
     * @param RiskLevel 风险等级
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 版本号 
     * @return VersionNumber 版本号
     */
    public String getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set 版本号
     * @param VersionNumber 版本号
     */
    public void setVersionNumber(String VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get 状态开关 
     * @return Status 状态开关
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态开关
     * @param Status 状态开关
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当前选择的处置动作 
     * @return Act 当前选择的处置动作
     */
    public String getAct() {
        return this.Act;
    }

    /**
     * Set 当前选择的处置动作
     * @param Act 当前选择的处置动作
     */
    public void setAct(String Act) {
        this.Act = Act;
    }

    /**
     * Get 支持的处置动作 
     * @return SupportActs 支持的处置动作
     */
    public String [] getSupportActs() {
        return this.SupportActs;
    }

    /**
     * Set 支持的处置动作
     * @param SupportActs 支持的处置动作
     */
    public void setSupportActs(String [] SupportActs) {
        this.SupportActs = SupportActs;
    }

    /**
     * Get 内容类型 
     * @return BodyType 内容类型
     */
    public String getBodyType() {
        return this.BodyType;
    }

    /**
     * Set 内容类型
     * @param BodyType 内容类型
     */
    public void setBodyType(String BodyType) {
        this.BodyType = BodyType;
    }

    /**
     * Get icon类型 
     * @return IconType icon类型
     */
    public String getIconType() {
        return this.IconType;
    }

    /**
     * Set icon类型
     * @param IconType icon类型
     */
    public void setIconType(String IconType) {
        this.IconType = IconType;
    }

    public McpSecurityRulesVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McpSecurityRulesVO(McpSecurityRulesVO source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.VersionNumber != null) {
            this.VersionNumber = new String(source.VersionNumber);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Act != null) {
            this.Act = new String(source.Act);
        }
        if (source.SupportActs != null) {
            this.SupportActs = new String[source.SupportActs.length];
            for (int i = 0; i < source.SupportActs.length; i++) {
                this.SupportActs[i] = new String(source.SupportActs[i]);
            }
        }
        if (source.BodyType != null) {
            this.BodyType = new String(source.BodyType);
        }
        if (source.IconType != null) {
            this.IconType = new String(source.IconType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Act", this.Act);
        this.setParamArraySimple(map, prefix + "SupportActs.", this.SupportActs);
        this.setParamSimple(map, prefix + "BodyType", this.BodyType);
        this.setParamSimple(map, prefix + "IconType", this.IconType);

    }
}

