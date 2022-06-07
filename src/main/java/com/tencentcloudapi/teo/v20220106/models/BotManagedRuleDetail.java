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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotManagedRuleDetail extends AbstractModel{

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则分类
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * 该规则开启/关闭
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
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
     * Get 规则分类 
     * @return RuleTypeName 规则分类
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set 规则分类
     * @param RuleTypeName 规则分类
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get 该规则开启/关闭 
     * @return Status 该规则开启/关闭
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 该规则开启/关闭
     * @param Status 该规则开启/关闭
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public BotManagedRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagedRuleDetail(BotManagedRuleDetail source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleTypeName != null) {
            this.RuleTypeName = new String(source.RuleTypeName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuleTypeName", this.RuleTypeName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

