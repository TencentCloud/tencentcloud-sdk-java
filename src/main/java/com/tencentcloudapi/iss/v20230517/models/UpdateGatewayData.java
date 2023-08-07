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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateGatewayData extends AbstractModel{

    /**
    * 网关索引ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GwId")
    @Expose
    private String GwId;

    /**
    * 网关名称，仅支持中文、英文、数字、_、-，长度不超过32个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 服务节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 服务节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 网关状态，0：离线，1:在线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 激活时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * 网关密钥
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Secret")
    @Expose
    private String Secret;

    /**
    * 网关版本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get 网关索引ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayId 网关索引ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关索引ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayId 网关索引ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GwId 网关编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGwId() {
        return this.GwId;
    }

    /**
     * Set 网关编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param GwId 网关编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGwId(String GwId) {
        this.GwId = GwId;
    }

    /**
     * Get 网关名称，仅支持中文、英文、数字、_、-，长度不超过32个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 网关名称，仅支持中文、英文、数字、_、-，长度不超过32个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 网关名称，仅支持中文、英文、数字、_、-，长度不超过32个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 网关名称，仅支持中文、英文、数字、_、-，长度不超过32个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 服务节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 服务节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 服务节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 服务节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 服务节点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 服务节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 服务节点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 服务节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 网关状态，0：离线，1:在线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 网关状态，0：离线，1:在线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 网关状态，0：离线，1:在线
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 网关状态，0：离线，1:在线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 激活时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 网关密钥
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Secret 网关密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecret() {
        return this.Secret;
    }

    /**
     * Set 网关密钥
注意：此字段可能返回 null，表示取不到有效值。
     * @param Secret 网关密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecret(String Secret) {
        this.Secret = Secret;
    }

    /**
     * Get 网关版本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 网关版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 网关版本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 网关版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public UpdateGatewayData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateGatewayData(UpdateGatewayData source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GwId != null) {
            this.GwId = new String(source.GwId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new Long(source.CreatedAt);
        }
        if (source.Secret != null) {
            this.Secret = new String(source.Secret);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GwId", this.GwId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "Secret", this.Secret);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

