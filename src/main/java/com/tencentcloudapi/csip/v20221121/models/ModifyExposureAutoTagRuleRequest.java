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

public class ModifyExposureAutoTagRuleRequest extends AbstractModel {

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
    * <p>规则ID</p>
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>规则描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>开启状态</p>
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
    * <p>是否立即执行打标</p>
    */
    @SerializedName("ApplyNow")
    @Expose
    private Boolean ApplyNow;

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
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>规则描述</p> 
     * @return Description <p>规则描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>规则描述</p>
     * @param Description <p>规则描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>开启状态</p> 
     * @return Enable <p>开启状态</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>开启状态</p>
     * @param Enable <p>开启状态</p>
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
     * Get <p>是否立即执行打标</p> 
     * @return ApplyNow <p>是否立即执行打标</p>
     */
    public Boolean getApplyNow() {
        return this.ApplyNow;
    }

    /**
     * Set <p>是否立即执行打标</p>
     * @param ApplyNow <p>是否立即执行打标</p>
     */
    public void setApplyNow(Boolean ApplyNow) {
        this.ApplyNow = ApplyNow;
    }

    public ModifyExposureAutoTagRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyExposureAutoTagRuleRequest(ModifyExposureAutoTagRuleRequest source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
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
        if (source.ApplyNow != null) {
            this.ApplyNow = new Boolean(source.ApplyNow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArraySimple(map, prefix + "AssetTypes.", this.AssetTypes);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamArraySimple(map, prefix + "OpenStatuses.", this.OpenStatuses);
        this.setParamSimple(map, prefix + "ApplyNow", this.ApplyNow);

    }
}

