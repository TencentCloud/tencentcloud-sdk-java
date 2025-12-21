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

public class DeleteReplicationRuleRequest extends AbstractModel {

    /**
    * 源实例ID
    */
    @SerializedName("SourceRegistryId")
    @Expose
    private String SourceRegistryId;

    /**
    * 同步规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 源实例ID 
     * @return SourceRegistryId 源实例ID
     */
    public String getSourceRegistryId() {
        return this.SourceRegistryId;
    }

    /**
     * Set 源实例ID
     * @param SourceRegistryId 源实例ID
     */
    public void setSourceRegistryId(String SourceRegistryId) {
        this.SourceRegistryId = SourceRegistryId;
    }

    /**
     * Get 同步规则名称 
     * @return RuleName 同步规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 同步规则名称
     * @param RuleName 同步规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
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

    public DeleteReplicationRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteReplicationRuleRequest(DeleteReplicationRuleRequest source) {
        if (source.SourceRegistryId != null) {
            this.SourceRegistryId = new String(source.SourceRegistryId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
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
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

