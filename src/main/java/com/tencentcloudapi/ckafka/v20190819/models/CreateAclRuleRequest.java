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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAclRuleRequest extends AbstractModel{

    /**
    * 实例id信息
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Acl资源类型,目前只支持Topic,枚举值列表：Topic
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 匹配类型，目前支持前缀匹配与预设策略，枚举值列表：PREFIXED/PRESET
    */
    @SerializedName("PatternType")
    @Expose
    private String PatternType;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 设置的ACL规则列表
    */
    @SerializedName("RuleList")
    @Expose
    private AclRuleInfo [] RuleList;

    /**
    * 表示前缀匹配的前缀的值
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * 预设ACL规则是否应用到新增的topic中
    */
    @SerializedName("IsApplied")
    @Expose
    private Long IsApplied;

    /**
    * ACL规则的备注
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 实例id信息 
     * @return InstanceId 实例id信息
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id信息
     * @param InstanceId 实例id信息
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Acl资源类型,目前只支持Topic,枚举值列表：Topic 
     * @return ResourceType Acl资源类型,目前只支持Topic,枚举值列表：Topic
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Acl资源类型,目前只支持Topic,枚举值列表：Topic
     * @param ResourceType Acl资源类型,目前只支持Topic,枚举值列表：Topic
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 匹配类型，目前支持前缀匹配与预设策略，枚举值列表：PREFIXED/PRESET 
     * @return PatternType 匹配类型，目前支持前缀匹配与预设策略，枚举值列表：PREFIXED/PRESET
     */
    public String getPatternType() {
        return this.PatternType;
    }

    /**
     * Set 匹配类型，目前支持前缀匹配与预设策略，枚举值列表：PREFIXED/PRESET
     * @param PatternType 匹配类型，目前支持前缀匹配与预设策略，枚举值列表：PREFIXED/PRESET
     */
    public void setPatternType(String PatternType) {
        this.PatternType = PatternType;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 设置的ACL规则列表 
     * @return RuleList 设置的ACL规则列表
     */
    public AclRuleInfo [] getRuleList() {
        return this.RuleList;
    }

    /**
     * Set 设置的ACL规则列表
     * @param RuleList 设置的ACL规则列表
     */
    public void setRuleList(AclRuleInfo [] RuleList) {
        this.RuleList = RuleList;
    }

    /**
     * Get 表示前缀匹配的前缀的值 
     * @return Pattern 表示前缀匹配的前缀的值
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set 表示前缀匹配的前缀的值
     * @param Pattern 表示前缀匹配的前缀的值
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get 预设ACL规则是否应用到新增的topic中 
     * @return IsApplied 预设ACL规则是否应用到新增的topic中
     */
    public Long getIsApplied() {
        return this.IsApplied;
    }

    /**
     * Set 预设ACL规则是否应用到新增的topic中
     * @param IsApplied 预设ACL规则是否应用到新增的topic中
     */
    public void setIsApplied(Long IsApplied) {
        this.IsApplied = IsApplied;
    }

    /**
     * Get ACL规则的备注 
     * @return Comment ACL规则的备注
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set ACL规则的备注
     * @param Comment ACL规则的备注
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public CreateAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAclRuleRequest(CreateAclRuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.PatternType != null) {
            this.PatternType = new String(source.PatternType);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleList != null) {
            this.RuleList = new AclRuleInfo[source.RuleList.length];
            for (int i = 0; i < source.RuleList.length; i++) {
                this.RuleList[i] = new AclRuleInfo(source.RuleList[i]);
            }
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.IsApplied != null) {
            this.IsApplied = new Long(source.IsApplied);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "PatternType", this.PatternType);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "RuleList.", this.RuleList);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "IsApplied", this.IsApplied);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

