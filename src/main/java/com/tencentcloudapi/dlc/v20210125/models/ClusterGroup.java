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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterGroup extends AbstractModel {

    /**
    * 集群组 ID（系统生成）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 集群组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 集群组描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 应用 ID（多租户）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 创建者主账号 UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 创建者子账号 UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 是否已软删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deleted")
    @Expose
    private Boolean Deleted;

    /**
    * 删除时间（软删时写入，活跃记录为 null）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteTime")
    @Expose
    private Long DeleteTime;

    /**
     * Get 集群组 ID（系统生成）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 集群组 ID（系统生成）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 集群组 ID（系统生成）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 集群组 ID（系统生成）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 集群组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 集群组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 集群组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 集群组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 集群组描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 集群组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 集群组描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 集群组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Config 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 应用 ID（多租户）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 应用 ID（多租户）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用 ID（多租户）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 应用 ID（多租户）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 创建者主账号 UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 创建者主账号 UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 创建者主账号 UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 创建者主账号 UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 创建者子账号 UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin 创建者子账号 UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 创建者子账号 UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin 创建者子账号 UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 是否已软删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deleted 是否已软删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeleted() {
        return this.Deleted;
    }

    /**
     * Set 是否已软删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deleted 是否已软删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleted(Boolean Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get 删除时间（软删时写入，活跃记录为 null）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteTime 删除时间（软删时写入，活跃记录为 null）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set 删除时间（软删时写入，活跃记录为 null）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteTime 删除时间（软删时写入，活跃记录为 null）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteTime(Long DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    public ClusterGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterGroup(ClusterGroup source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Deleted != null) {
            this.Deleted = new Boolean(source.Deleted);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new Long(source.DeleteTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);

    }
}

