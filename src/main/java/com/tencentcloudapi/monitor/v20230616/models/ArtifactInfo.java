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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ArtifactInfo extends AbstractModel {

    /**
    * <p>产物 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ArtifactId")
    @Expose
    private String ArtifactId;

    /**
    * <p>产物名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>物理类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MimeType")
    @Expose
    private String MimeType;

    /**
    * <p>文件大小(字节)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SizeBytes")
    @Expose
    private Long SizeBytes;

    /**
    * <p>是否公共</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * <p>创建时间 Unix 秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * <p>修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private Long UpdatedAt;

    /**
    * <p>产生该制品的 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>产生该制品的 Skill ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * <p>用于解析调用下载接口</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoragePath")
    @Expose
    private String StoragePath;

    /**
     * Get <p>产物 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ArtifactId <p>产物 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArtifactId() {
        return this.ArtifactId;
    }

    /**
     * Set <p>产物 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ArtifactId <p>产物 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArtifactId(String ArtifactId) {
        this.ArtifactId = ArtifactId;
    }

    /**
     * Get <p>产物名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>产物名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>产物名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>产物名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>物理类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MimeType <p>物理类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMimeType() {
        return this.MimeType;
    }

    /**
     * Set <p>物理类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MimeType <p>物理类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMimeType(String MimeType) {
        this.MimeType = MimeType;
    }

    /**
     * Get <p>文件大小(字节)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SizeBytes <p>文件大小(字节)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSizeBytes() {
        return this.SizeBytes;
    }

    /**
     * Set <p>文件大小(字节)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SizeBytes <p>文件大小(字节)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSizeBytes(Long SizeBytes) {
        this.SizeBytes = SizeBytes;
    }

    /**
     * Get <p>是否公共</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsGlobal <p>是否公共</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set <p>是否公共</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsGlobal <p>是否公共</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get <p>创建时间 Unix 秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt <p>创建时间 Unix 秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间 Unix 秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt <p>创建时间 Unix 秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt <p>修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt <p>修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(Long UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>产生该制品的 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentId <p>产生该制品的 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>产生该制品的 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentId <p>产生该制品的 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>产生该制品的 Skill ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkillId <p>产生该制品的 Skill ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set <p>产生该制品的 Skill ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkillId <p>产生该制品的 Skill ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * Get <p>用于解析调用下载接口</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoragePath <p>用于解析调用下载接口</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStoragePath() {
        return this.StoragePath;
    }

    /**
     * Set <p>用于解析调用下载接口</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoragePath <p>用于解析调用下载接口</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoragePath(String StoragePath) {
        this.StoragePath = StoragePath;
    }

    public ArtifactInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ArtifactInfo(ArtifactInfo source) {
        if (source.ArtifactId != null) {
            this.ArtifactId = new String(source.ArtifactId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MimeType != null) {
            this.MimeType = new String(source.MimeType);
        }
        if (source.SizeBytes != null) {
            this.SizeBytes = new Long(source.SizeBytes);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new Long(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new Long(source.UpdatedAt);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.SkillId != null) {
            this.SkillId = new String(source.SkillId);
        }
        if (source.StoragePath != null) {
            this.StoragePath = new String(source.StoragePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ArtifactId", this.ArtifactId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MimeType", this.MimeType);
        this.setParamSimple(map, prefix + "SizeBytes", this.SizeBytes);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "SkillId", this.SkillId);
        this.setParamSimple(map, prefix + "StoragePath", this.StoragePath);

    }
}

