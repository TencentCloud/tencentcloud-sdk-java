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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudRegistry extends AbstractModel {

    /**
    * <p>Registry ID；格式 <code>reg-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>Registry 同一 AppId + Region 唯一名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>审批模式；AUTO 自动通过，MANUAL 需人工审批；创建时确定，不可修改。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApprovalMode")
    @Expose
    private String ApprovalMode;

    /**
    * <p>Registry 所在腾讯云地域，如 <code>ap-guangzhou</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Registry 状态。ACTIVE / ARCHIVED。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>创建时间，ISO 8601 UTC，如 <code>2026-08-11T10:00:00Z</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近一次更新时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Registry 下 Record 总数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * <p>权威读取的腾讯云自定义标签，按 Key、Value 稳定排序；无标签时固定返回空数组，不返回 null。</p>
    */
    @SerializedName("Tags")
    @Expose
    private CloudTag [] Tags;

    /**
    * <p>Stable Label 已绑定的 Record 数量。Approved Version 数量和可对外消费的 Record 数量已不再等价。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishedRecordCount")
    @Expose
    private Long PublishedRecordCount;

    /**
    * <p>所属租户 AppId。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>创建者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * <p>创建者子账号 UIN；主账号直接创建时为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorSubAccountUin")
    @Expose
    private String CreatorSubAccountUin;

    /**
     * Get <p>Registry ID；格式 <code>reg-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryId <p>Registry ID；格式 <code>reg-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>Registry ID；格式 <code>reg-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryId <p>Registry ID；格式 <code>reg-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>Registry 同一 AppId + Region 唯一名称。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>Registry 同一 AppId + Region 唯一名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Registry 同一 AppId + Region 唯一名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>Registry 同一 AppId + Region 唯一名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>审批模式；AUTO 自动通过，MANUAL 需人工审批；创建时确定，不可修改。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApprovalMode <p>审批模式；AUTO 自动通过，MANUAL 需人工审批；创建时确定，不可修改。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApprovalMode() {
        return this.ApprovalMode;
    }

    /**
     * Set <p>审批模式；AUTO 自动通过，MANUAL 需人工审批；创建时确定，不可修改。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApprovalMode <p>审批模式；AUTO 自动通过，MANUAL 需人工审批；创建时确定，不可修改。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApprovalMode(String ApprovalMode) {
        this.ApprovalMode = ApprovalMode;
    }

    /**
     * Get <p>Registry 所在腾讯云地域，如 <code>ap-guangzhou</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>Registry 所在腾讯云地域，如 <code>ap-guangzhou</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Registry 所在腾讯云地域，如 <code>ap-guangzhou</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>Registry 所在腾讯云地域，如 <code>ap-guangzhou</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Registry 状态。ACTIVE / ARCHIVED。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>Registry 状态。ACTIVE / ARCHIVED。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Registry 状态。ACTIVE / ARCHIVED。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>Registry 状态。ACTIVE / ARCHIVED。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间，ISO 8601 UTC，如 <code>2026-08-11T10:00:00Z</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间，ISO 8601 UTC，如 <code>2026-08-11T10:00:00Z</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，ISO 8601 UTC，如 <code>2026-08-11T10:00:00Z</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间，ISO 8601 UTC，如 <code>2026-08-11T10:00:00Z</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最近一次更新时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>最近一次更新时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最近一次更新时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>最近一次更新时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Registry 下 Record 总数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordCount <p>Registry 下 Record 总数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set <p>Registry 下 Record 总数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordCount <p>Registry 下 Record 总数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get <p>权威读取的腾讯云自定义标签，按 Key、Value 稳定排序；无标签时固定返回空数组，不返回 null。</p> 
     * @return Tags <p>权威读取的腾讯云自定义标签，按 Key、Value 稳定排序；无标签时固定返回空数组，不返回 null。</p>
     */
    public CloudTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>权威读取的腾讯云自定义标签，按 Key、Value 稳定排序；无标签时固定返回空数组，不返回 null。</p>
     * @param Tags <p>权威读取的腾讯云自定义标签，按 Key、Value 稳定排序；无标签时固定返回空数组，不返回 null。</p>
     */
    public void setTags(CloudTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Stable Label 已绑定的 Record 数量。Approved Version 数量和可对外消费的 Record 数量已不再等价。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishedRecordCount <p>Stable Label 已绑定的 Record 数量。Approved Version 数量和可对外消费的 Record 数量已不再等价。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPublishedRecordCount() {
        return this.PublishedRecordCount;
    }

    /**
     * Set <p>Stable Label 已绑定的 Record 数量。Approved Version 数量和可对外消费的 Record 数量已不再等价。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishedRecordCount <p>Stable Label 已绑定的 Record 数量。Approved Version 数量和可对外消费的 Record 数量已不再等价。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublishedRecordCount(Long PublishedRecordCount) {
        this.PublishedRecordCount = PublishedRecordCount;
    }

    /**
     * Get <p>所属租户 AppId。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>所属租户 AppId。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>所属租户 AppId。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>所属租户 AppId。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>创建者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin <p>创建者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>创建者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin <p>创建者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get <p>创建者子账号 UIN；主账号直接创建时为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorSubAccountUin <p>创建者子账号 UIN；主账号直接创建时为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorSubAccountUin() {
        return this.CreatorSubAccountUin;
    }

    /**
     * Set <p>创建者子账号 UIN；主账号直接创建时为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorSubAccountUin <p>创建者子账号 UIN；主账号直接创建时为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorSubAccountUin(String CreatorSubAccountUin) {
        this.CreatorSubAccountUin = CreatorSubAccountUin;
    }

    public CloudRegistry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudRegistry(CloudRegistry source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ApprovalMode != null) {
            this.ApprovalMode = new String(source.ApprovalMode);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.Tags != null) {
            this.Tags = new CloudTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new CloudTag(source.Tags[i]);
            }
        }
        if (source.PublishedRecordCount != null) {
            this.PublishedRecordCount = new Long(source.PublishedRecordCount);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.CreatorSubAccountUin != null) {
            this.CreatorSubAccountUin = new String(source.CreatorSubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ApprovalMode", this.ApprovalMode);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PublishedRecordCount", this.PublishedRecordCount);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "CreatorSubAccountUin", this.CreatorSubAccountUin);

    }
}

