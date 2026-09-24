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

public class CloudRecord extends AbstractModel {

    /**
    * <p>Record ID；格式 <code>rec-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>所属 Registry ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>Record 名称；同一 Registry 内可重复。</p>
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
    * <p>协议描述符类型；创建后不可变。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DescriptorType")
    @Expose
    private String DescriptorType;

    /**
    * <p>生命周期状态。ACTIVE：可用；DELETED：软删除墓碑，不再参与常规查询、下发或版本配额。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifecycleStatus")
    @Expose
    private String LifecycleStatus;

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
    * <p>创建者子账号 UIN；主账号直接创建时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorSubAccountUin")
    @Expose
    private String CreatorSubAccountUin;

    /**
    * <p>创建时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近一次更新时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Record 下未删除 Version 数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionCount")
    @Expose
    private Long VersionCount;

    /**
    * <p>Record 下所有 Label Name（含未绑定 Label），包括系统 Label（stable / latest）和自定义 Label。仅名称，不含 VersionId、更新时间或操作者。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelSet")
    @Expose
    private String [] LabelSet;

    /**
     * Get <p>Record ID；格式 <code>rec-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId <p>Record ID；格式 <code>rec-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>Record ID；格式 <code>rec-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId <p>Record ID；格式 <code>rec-</code> + 8 位小写字母/数字。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>所属 Registry ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryId <p>所属 Registry ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>所属 Registry ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryId <p>所属 Registry ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>Record 名称；同一 Registry 内可重复。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>Record 名称；同一 Registry 内可重复。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Record 名称；同一 Registry 内可重复。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>Record 名称；同一 Registry 内可重复。</p>
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
     * Get <p>协议描述符类型；创建后不可变。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DescriptorType <p>协议描述符类型；创建后不可变。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescriptorType() {
        return this.DescriptorType;
    }

    /**
     * Set <p>协议描述符类型；创建后不可变。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DescriptorType <p>协议描述符类型；创建后不可变。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescriptorType(String DescriptorType) {
        this.DescriptorType = DescriptorType;
    }

    /**
     * Get <p>生命周期状态。ACTIVE：可用；DELETED：软删除墓碑，不再参与常规查询、下发或版本配额。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifecycleStatus <p>生命周期状态。ACTIVE：可用；DELETED：软删除墓碑，不再参与常规查询、下发或版本配额。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLifecycleStatus() {
        return this.LifecycleStatus;
    }

    /**
     * Set <p>生命周期状态。ACTIVE：可用；DELETED：软删除墓碑，不再参与常规查询、下发或版本配额。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifecycleStatus <p>生命周期状态。ACTIVE：可用；DELETED：软删除墓碑，不再参与常规查询、下发或版本配额。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifecycleStatus(String LifecycleStatus) {
        this.LifecycleStatus = LifecycleStatus;
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
     * Get <p>创建者子账号 UIN；主账号直接创建时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorSubAccountUin <p>创建者子账号 UIN；主账号直接创建时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorSubAccountUin() {
        return this.CreatorSubAccountUin;
    }

    /**
     * Set <p>创建者子账号 UIN；主账号直接创建时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorSubAccountUin <p>创建者子账号 UIN；主账号直接创建时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorSubAccountUin(String CreatorSubAccountUin) {
        this.CreatorSubAccountUin = CreatorSubAccountUin;
    }

    /**
     * Get <p>创建时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最近一次更新时间。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>最近一次更新时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最近一次更新时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>最近一次更新时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Record 下未删除 Version 数量。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionCount <p>Record 下未删除 Version 数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVersionCount() {
        return this.VersionCount;
    }

    /**
     * Set <p>Record 下未删除 Version 数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionCount <p>Record 下未删除 Version 数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionCount(Long VersionCount) {
        this.VersionCount = VersionCount;
    }

    /**
     * Get <p>Record 下所有 Label Name（含未绑定 Label），包括系统 Label（stable / latest）和自定义 Label。仅名称，不含 VersionId、更新时间或操作者。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelSet <p>Record 下所有 Label Name（含未绑定 Label），包括系统 Label（stable / latest）和自定义 Label。仅名称，不含 VersionId、更新时间或操作者。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLabelSet() {
        return this.LabelSet;
    }

    /**
     * Set <p>Record 下所有 Label Name（含未绑定 Label），包括系统 Label（stable / latest）和自定义 Label。仅名称，不含 VersionId、更新时间或操作者。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelSet <p>Record 下所有 Label Name（含未绑定 Label），包括系统 Label（stable / latest）和自定义 Label。仅名称，不含 VersionId、更新时间或操作者。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelSet(String [] LabelSet) {
        this.LabelSet = LabelSet;
    }

    public CloudRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudRecord(CloudRecord source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DescriptorType != null) {
            this.DescriptorType = new String(source.DescriptorType);
        }
        if (source.LifecycleStatus != null) {
            this.LifecycleStatus = new String(source.LifecycleStatus);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.VersionCount != null) {
            this.VersionCount = new Long(source.VersionCount);
        }
        if (source.LabelSet != null) {
            this.LabelSet = new String[source.LabelSet.length];
            for (int i = 0; i < source.LabelSet.length; i++) {
                this.LabelSet[i] = new String(source.LabelSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DescriptorType", this.DescriptorType);
        this.setParamSimple(map, prefix + "LifecycleStatus", this.LifecycleStatus);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "CreatorSubAccountUin", this.CreatorSubAccountUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "VersionCount", this.VersionCount);
        this.setParamArraySimple(map, prefix + "LabelSet.", this.LabelSet);

    }
}

