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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordingRuleSet extends AbstractModel{

    /**
    * 规则 ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则状态码
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则内容组
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 规则数量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 规则创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 规则最近更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get 规则 ID 
     * @return RuleId 规则 ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则 ID
     * @param RuleId 规则 ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则状态码 
     * @return RuleState 规则状态码
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set 规则状态码
     * @param RuleState 规则状态码
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
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
     * Get 规则内容组 
     * @return Group 规则内容组
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 规则内容组
     * @param Group 规则内容组
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 规则数量 
     * @return Total 规则数量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 规则数量
     * @param Total 规则数量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 规则创建时间 
     * @return CreatedAt 规则创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 规则创建时间
     * @param CreatedAt 规则创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 规则最近更新时间 
     * @return UpdatedAt 规则最近更新时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 规则最近更新时间
     * @param UpdatedAt 规则最近更新时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public RecordingRuleSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordingRuleSet(RecordingRuleSet source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleState != null) {
            this.RuleState = new Long(source.RuleState);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleState", this.RuleState);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

