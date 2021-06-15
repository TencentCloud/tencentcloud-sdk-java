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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalContactTag extends AbstractModel{

    /**
    * 该成员添加此外部联系人所打标签的分组名称（标签功能需要企业微信升级到2.7.5及以上版本）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 该成员添加此外部联系人所打标签名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 该成员添加此外部联系人所打标签类型, 1-企业设置, 2-用户自定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 该成员添加此外部联系人所打企业标签的id，仅企业设置（type为1）的标签返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagId")
    @Expose
    private String TagId;

    /**
     * Get 该成员添加此外部联系人所打标签的分组名称（标签功能需要企业微信升级到2.7.5及以上版本）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 该成员添加此外部联系人所打标签的分组名称（标签功能需要企业微信升级到2.7.5及以上版本）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 该成员添加此外部联系人所打标签的分组名称（标签功能需要企业微信升级到2.7.5及以上版本）
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 该成员添加此外部联系人所打标签的分组名称（标签功能需要企业微信升级到2.7.5及以上版本）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 该成员添加此外部联系人所打标签名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagName 该成员添加此外部联系人所打标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 该成员添加此外部联系人所打标签名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagName 该成员添加此外部联系人所打标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 该成员添加此外部联系人所打标签类型, 1-企业设置, 2-用户自定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 该成员添加此外部联系人所打标签类型, 1-企业设置, 2-用户自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 该成员添加此外部联系人所打标签类型, 1-企业设置, 2-用户自定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 该成员添加此外部联系人所打标签类型, 1-企业设置, 2-用户自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 该成员添加此外部联系人所打企业标签的id，仅企业设置（type为1）的标签返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagId 该成员添加此外部联系人所打企业标签的id，仅企业设置（type为1）的标签返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagId() {
        return this.TagId;
    }

    /**
     * Set 该成员添加此外部联系人所打企业标签的id，仅企业设置（type为1）的标签返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagId 该成员添加此外部联系人所打企业标签的id，仅企业设置（type为1）的标签返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagId(String TagId) {
        this.TagId = TagId;
    }

    public ExternalContactTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalContactTag(ExternalContactTag source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TagId != null) {
            this.TagId = new String(source.TagId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TagId", this.TagId);

    }
}

