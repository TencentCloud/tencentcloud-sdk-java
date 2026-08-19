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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoTagRuleItem extends AbstractModel {

    /**
    * <p>规则ID</p>
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * <p>规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>开关状态</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>资产类型</p>
    */
    @SerializedName("AssetTypes")
    @Expose
    private String [] AssetTypes;

    /**
    * <p>端口</p>
    */
    @SerializedName("Ports")
    @Expose
    private String [] Ports;

    /**
    * <p>开放状态</p>
    */
    @SerializedName("OpenStatuses")
    @Expose
    private String [] OpenStatuses;

    /**
    * <p>规则优先级</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>规则ID</p> 
     * @return RuleID <p>规则ID</p>
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>规则ID</p>
     * @param RuleID <p>规则ID</p>
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>规则名称</p> 
     * @return RuleName <p>规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称</p>
     * @param RuleName <p>规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>标签</p> 
     * @return Tag <p>标签</p>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>标签</p>
     * @param Tag <p>标签</p>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>开关状态</p> 
     * @return Enable <p>开关状态</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>开关状态</p>
     * @param Enable <p>开关状态</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>资产类型</p> 
     * @return AssetTypes <p>资产类型</p>
     */
    public String [] getAssetTypes() {
        return this.AssetTypes;
    }

    /**
     * Set <p>资产类型</p>
     * @param AssetTypes <p>资产类型</p>
     */
    public void setAssetTypes(String [] AssetTypes) {
        this.AssetTypes = AssetTypes;
    }

    /**
     * Get <p>端口</p> 
     * @return Ports <p>端口</p>
     */
    public String [] getPorts() {
        return this.Ports;
    }

    /**
     * Set <p>端口</p>
     * @param Ports <p>端口</p>
     */
    public void setPorts(String [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get <p>开放状态</p> 
     * @return OpenStatuses <p>开放状态</p>
     */
    public String [] getOpenStatuses() {
        return this.OpenStatuses;
    }

    /**
     * Set <p>开放状态</p>
     * @param OpenStatuses <p>开放状态</p>
     */
    public void setOpenStatuses(String [] OpenStatuses) {
        this.OpenStatuses = OpenStatuses;
    }

    /**
     * Get <p>规则优先级</p> 
     * @return Priority <p>规则优先级</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>规则优先级</p>
     * @param Priority <p>规则优先级</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AutoTagRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoTagRuleItem(AutoTagRuleItem source) {
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.AssetTypes != null) {
            this.AssetTypes = new String[source.AssetTypes.length];
            for (int i = 0; i < source.AssetTypes.length; i++) {
                this.AssetTypes[i] = new String(source.AssetTypes[i]);
            }
        }
        if (source.Ports != null) {
            this.Ports = new String[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new String(source.Ports[i]);
            }
        }
        if (source.OpenStatuses != null) {
            this.OpenStatuses = new String[source.OpenStatuses.length];
            for (int i = 0; i < source.OpenStatuses.length; i++) {
                this.OpenStatuses[i] = new String(source.OpenStatuses[i]);
            }
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArraySimple(map, prefix + "AssetTypes.", this.AssetTypes);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamArraySimple(map, prefix + "OpenStatuses.", this.OpenStatuses);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

