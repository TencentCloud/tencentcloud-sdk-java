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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRulesRequest extends AbstractModel{

    /**
    * 自动化规则ID
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 自动化规则ID
    */
    @SerializedName("RuleIDs")
    @Expose
    private Long [] RuleIDs;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 是否激活
    */
    @SerializedName("IsActive")
    @Expose
    private Long IsActive;

    /**
    * 翻页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 翻页偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 自动化规则ID 
     * @return RuleID 自动化规则ID
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 自动化规则ID
     * @param RuleID 自动化规则ID
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 自动化规则ID 
     * @return RuleIDs 自动化规则ID
     */
    public Long [] getRuleIDs() {
        return this.RuleIDs;
    }

    /**
     * Set 自动化规则ID
     * @param RuleIDs 自动化规则ID
     */
    public void setRuleIDs(Long [] RuleIDs) {
        this.RuleIDs = RuleIDs;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 是否激活 
     * @return IsActive 是否激活
     */
    public Long getIsActive() {
        return this.IsActive;
    }

    /**
     * Set 是否激活
     * @param IsActive 是否激活
     */
    public void setIsActive(Long IsActive) {
        this.IsActive = IsActive;
    }

    /**
     * Get 翻页大小 
     * @return Limit 翻页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 翻页大小
     * @param Limit 翻页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 翻页偏移 
     * @return Offset 翻页偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页偏移
     * @param Offset 翻页偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRulesRequest(DescribeRulesRequest source) {
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.RuleIDs != null) {
            this.RuleIDs = new Long[source.RuleIDs.length];
            for (int i = 0; i < source.RuleIDs.length; i++) {
                this.RuleIDs[i] = new Long(source.RuleIDs[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.IsActive != null) {
            this.IsActive = new Long(source.IsActive);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "RuleIDs.", this.RuleIDs);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsActive", this.IsActive);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

