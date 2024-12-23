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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContentIdentifier extends AbstractModel {

    /**
    * 内容标识符 ID。
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * 内容标识符描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 被规则引擎引用的次数。
    */
    @SerializedName("ReferenceCount")
    @Expose
    private Long ReferenceCount;

    /**
    * 绑定的套餐 ID。
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 绑定的标签。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 内容标识符状态，取值有：
<li> active：已生效； </li>
<li> deleted：已删除。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间，时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 最新一次更新时间，时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * 删除时间，状态非 deleted 时候为空；时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeletedOn")
    @Expose
    private String DeletedOn;

    /**
     * Get 内容标识符 ID。 
     * @return ContentId 内容标识符 ID。
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set 内容标识符 ID。
     * @param ContentId 内容标识符 ID。
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get 内容标识符描述。 
     * @return Description 内容标识符描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 内容标识符描述。
     * @param Description 内容标识符描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 被规则引擎引用的次数。 
     * @return ReferenceCount 被规则引擎引用的次数。
     */
    public Long getReferenceCount() {
        return this.ReferenceCount;
    }

    /**
     * Set 被规则引擎引用的次数。
     * @param ReferenceCount 被规则引擎引用的次数。
     */
    public void setReferenceCount(Long ReferenceCount) {
        this.ReferenceCount = ReferenceCount;
    }

    /**
     * Get 绑定的套餐 ID。 
     * @return PlanId 绑定的套餐 ID。
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 绑定的套餐 ID。
     * @param PlanId 绑定的套餐 ID。
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 绑定的标签。 
     * @return Tags 绑定的标签。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 绑定的标签。
     * @param Tags 绑定的标签。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 内容标识符状态，取值有：
<li> active：已生效； </li>
<li> deleted：已删除。</li> 
     * @return Status 内容标识符状态，取值有：
<li> active：已生效； </li>
<li> deleted：已删除。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 内容标识符状态，取值有：
<li> active：已生效； </li>
<li> deleted：已删除。</li>
     * @param Status 内容标识符状态，取值有：
<li> active：已生效； </li>
<li> deleted：已删除。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间，时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。 
     * @return CreatedOn 创建时间，时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间，时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     * @param CreatedOn 创建时间，时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 最新一次更新时间，时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。 
     * @return ModifiedOn 最新一次更新时间，时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set 最新一次更新时间，时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     * @param ModifiedOn 最新一次更新时间，时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get 删除时间，状态非 deleted 时候为空；时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeletedOn 删除时间，状态非 deleted 时候为空；时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeletedOn() {
        return this.DeletedOn;
    }

    /**
     * Set 删除时间，状态非 deleted 时候为空；时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeletedOn 删除时间，状态非 deleted 时候为空；时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeletedOn(String DeletedOn) {
        this.DeletedOn = DeletedOn;
    }

    public ContentIdentifier() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentIdentifier(ContentIdentifier source) {
        if (source.ContentId != null) {
            this.ContentId = new String(source.ContentId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ReferenceCount != null) {
            this.ReferenceCount = new Long(source.ReferenceCount);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.DeletedOn != null) {
            this.DeletedOn = new String(source.DeletedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ReferenceCount", this.ReferenceCount);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "DeletedOn", this.DeletedOn);

    }
}

