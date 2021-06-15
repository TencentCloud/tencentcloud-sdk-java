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

public class WeComTagDetail extends AbstractModel{

    /**
    * 标签分组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 标签分组业务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizGroupId")
    @Expose
    private String BizGroupId;

    /**
    * 标签名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 标签ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagId")
    @Expose
    private String TagId;

    /**
    * 标签业务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizTagId")
    @Expose
    private String BizTagId;

    /**
    * 标签分类，1：企业设置、2：用户自定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 标签业务ID字符串格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizTagIdStr")
    @Expose
    private String BizTagIdStr;

    /**
     * Get 标签分组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 标签分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 标签分组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 标签分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 标签分组业务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizGroupId 标签分组业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizGroupId() {
        return this.BizGroupId;
    }

    /**
     * Set 标签分组业务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizGroupId 标签分组业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizGroupId(String BizGroupId) {
        this.BizGroupId = BizGroupId;
    }

    /**
     * Get 标签名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagName 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagName 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 标签ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagId 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagId() {
        return this.TagId;
    }

    /**
     * Set 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagId 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagId(String TagId) {
        this.TagId = TagId;
    }

    /**
     * Get 标签业务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizTagId 标签业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizTagId() {
        return this.BizTagId;
    }

    /**
     * Set 标签业务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizTagId 标签业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizTagId(String BizTagId) {
        this.BizTagId = BizTagId;
    }

    /**
     * Get 标签分类，1：企业设置、2：用户自定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 标签分类，1：企业设置、2：用户自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 标签分类，1：企业设置、2：用户自定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 标签分类，1：企业设置、2：用户自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 标签业务ID字符串格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizTagIdStr 标签业务ID字符串格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizTagIdStr() {
        return this.BizTagIdStr;
    }

    /**
     * Set 标签业务ID字符串格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizTagIdStr 标签业务ID字符串格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizTagIdStr(String BizTagIdStr) {
        this.BizTagIdStr = BizTagIdStr;
    }

    public WeComTagDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WeComTagDetail(WeComTagDetail source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.BizGroupId != null) {
            this.BizGroupId = new String(source.BizGroupId);
        }
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.TagId != null) {
            this.TagId = new String(source.TagId);
        }
        if (source.BizTagId != null) {
            this.BizTagId = new String(source.BizTagId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.BizTagIdStr != null) {
            this.BizTagIdStr = new String(source.BizTagIdStr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "BizGroupId", this.BizGroupId);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "BizTagId", this.BizTagId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "BizTagIdStr", this.BizTagIdStr);

    }
}

