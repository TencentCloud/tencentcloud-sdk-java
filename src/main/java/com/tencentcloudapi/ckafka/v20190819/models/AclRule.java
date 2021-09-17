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

public class AclRule extends AbstractModel{

    /**
    * Acl规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 匹配类型，目前只支持前缀匹配，枚举值列表：PREFIXED
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PatternType")
    @Expose
    private String PatternType;

    /**
    * 表示前缀匹配的前缀的值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * Acl资源类型,目前只支持Topic,枚举值列表：Topic
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 该规则所包含的ACL信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AclList")
    @Expose
    private String AclList;

    /**
    * 规则所创建的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTimeStamp")
    @Expose
    private String CreateTimeStamp;

    /**
    * 预设ACL规则是否应用到新增的topic中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsApplied")
    @Expose
    private Long IsApplied;

    /**
    * 规则更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTimeStamp")
    @Expose
    private String UpdateTimeStamp;

    /**
    * 规则的备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 其中一个显示的对应的TopicName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 应用该ACL规则的Topic数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicCount")
    @Expose
    private Long TopicCount;

    /**
    * patternType的中文显示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PatternTypeTitle")
    @Expose
    private String PatternTypeTitle;

    /**
     * Get Acl规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName Acl规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Acl规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName Acl规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 匹配类型，目前只支持前缀匹配，枚举值列表：PREFIXED
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PatternType 匹配类型，目前只支持前缀匹配，枚举值列表：PREFIXED
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPatternType() {
        return this.PatternType;
    }

    /**
     * Set 匹配类型，目前只支持前缀匹配，枚举值列表：PREFIXED
注意：此字段可能返回 null，表示取不到有效值。
     * @param PatternType 匹配类型，目前只支持前缀匹配，枚举值列表：PREFIXED
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPatternType(String PatternType) {
        this.PatternType = PatternType;
    }

    /**
     * Get 表示前缀匹配的前缀的值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pattern 表示前缀匹配的前缀的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set 表示前缀匹配的前缀的值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pattern 表示前缀匹配的前缀的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get Acl资源类型,目前只支持Topic,枚举值列表：Topic
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType Acl资源类型,目前只支持Topic,枚举值列表：Topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Acl资源类型,目前只支持Topic,枚举值列表：Topic
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType Acl资源类型,目前只支持Topic,枚举值列表：Topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 该规则所包含的ACL信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AclList 该规则所包含的ACL信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAclList() {
        return this.AclList;
    }

    /**
     * Set 该规则所包含的ACL信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AclList 该规则所包含的ACL信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAclList(String AclList) {
        this.AclList = AclList;
    }

    /**
     * Get 规则所创建的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTimeStamp 规则所创建的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTimeStamp() {
        return this.CreateTimeStamp;
    }

    /**
     * Set 规则所创建的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTimeStamp 规则所创建的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTimeStamp(String CreateTimeStamp) {
        this.CreateTimeStamp = CreateTimeStamp;
    }

    /**
     * Get 预设ACL规则是否应用到新增的topic中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsApplied 预设ACL规则是否应用到新增的topic中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsApplied() {
        return this.IsApplied;
    }

    /**
     * Set 预设ACL规则是否应用到新增的topic中
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsApplied 预设ACL规则是否应用到新增的topic中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsApplied(Long IsApplied) {
        this.IsApplied = IsApplied;
    }

    /**
     * Get 规则更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTimeStamp 规则更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTimeStamp() {
        return this.UpdateTimeStamp;
    }

    /**
     * Set 规则更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTimeStamp 规则更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTimeStamp(String UpdateTimeStamp) {
        this.UpdateTimeStamp = UpdateTimeStamp;
    }

    /**
     * Get 规则的备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 规则的备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 规则的备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 规则的备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 其中一个显示的对应的TopicName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicName 其中一个显示的对应的TopicName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 其中一个显示的对应的TopicName
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicName 其中一个显示的对应的TopicName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 应用该ACL规则的Topic数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicCount 应用该ACL规则的Topic数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTopicCount() {
        return this.TopicCount;
    }

    /**
     * Set 应用该ACL规则的Topic数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicCount 应用该ACL规则的Topic数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicCount(Long TopicCount) {
        this.TopicCount = TopicCount;
    }

    /**
     * Get patternType的中文显示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PatternTypeTitle patternType的中文显示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPatternTypeTitle() {
        return this.PatternTypeTitle;
    }

    /**
     * Set patternType的中文显示
注意：此字段可能返回 null，表示取不到有效值。
     * @param PatternTypeTitle patternType的中文显示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPatternTypeTitle(String PatternTypeTitle) {
        this.PatternTypeTitle = PatternTypeTitle;
    }

    public AclRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclRule(AclRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PatternType != null) {
            this.PatternType = new String(source.PatternType);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.AclList != null) {
            this.AclList = new String(source.AclList);
        }
        if (source.CreateTimeStamp != null) {
            this.CreateTimeStamp = new String(source.CreateTimeStamp);
        }
        if (source.IsApplied != null) {
            this.IsApplied = new Long(source.IsApplied);
        }
        if (source.UpdateTimeStamp != null) {
            this.UpdateTimeStamp = new String(source.UpdateTimeStamp);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.TopicCount != null) {
            this.TopicCount = new Long(source.TopicCount);
        }
        if (source.PatternTypeTitle != null) {
            this.PatternTypeTitle = new String(source.PatternTypeTitle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PatternType", this.PatternType);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "AclList", this.AclList);
        this.setParamSimple(map, prefix + "CreateTimeStamp", this.CreateTimeStamp);
        this.setParamSimple(map, prefix + "IsApplied", this.IsApplied);
        this.setParamSimple(map, prefix + "UpdateTimeStamp", this.UpdateTimeStamp);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "TopicCount", this.TopicCount);
        this.setParamSimple(map, prefix + "PatternTypeTitle", this.PatternTypeTitle);

    }
}

