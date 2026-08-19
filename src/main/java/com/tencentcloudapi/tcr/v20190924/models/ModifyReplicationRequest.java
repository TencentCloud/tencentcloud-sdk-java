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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyReplicationRequest extends AbstractModel {

    /**
    * <p>复制源实例ID</p>
    */
    @SerializedName("SourceRegistryId")
    @Expose
    private String SourceRegistryId;

    /**
    * <p>实例同步规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>同步规则</p>
    */
    @SerializedName("Rule")
    @Expose
    private ModifyReplicationRule Rule;

    /**
    * <p>规则描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>复制源实例ID</p> 
     * @return SourceRegistryId <p>复制源实例ID</p>
     */
    public String getSourceRegistryId() {
        return this.SourceRegistryId;
    }

    /**
     * Set <p>复制源实例ID</p>
     * @param SourceRegistryId <p>复制源实例ID</p>
     */
    public void setSourceRegistryId(String SourceRegistryId) {
        this.SourceRegistryId = SourceRegistryId;
    }

    /**
     * Get <p>实例同步规则名称</p> 
     * @return RuleName <p>实例同步规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>实例同步规则名称</p>
     * @param RuleName <p>实例同步规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>同步规则</p> 
     * @return Rule <p>同步规则</p>
     */
    public ModifyReplicationRule getRule() {
        return this.Rule;
    }

    /**
     * Set <p>同步规则</p>
     * @param Rule <p>同步规则</p>
     */
    public void setRule(ModifyReplicationRule Rule) {
        this.Rule = Rule;
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

    public ModifyReplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyReplicationRequest(ModifyReplicationRequest source) {
        if (source.SourceRegistryId != null) {
            this.SourceRegistryId = new String(source.SourceRegistryId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Rule != null) {
            this.Rule = new ModifyReplicationRule(source.Rule);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceRegistryId", this.SourceRegistryId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

