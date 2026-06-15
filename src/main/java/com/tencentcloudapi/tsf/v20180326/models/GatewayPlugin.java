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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayPlugin extends AbstractModel {

    /**
    * <p>网关插件id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>插件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>插件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>插件描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * <p>发布状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否禁用删除</p>
    */
    @SerializedName("DeleteDisabled")
    @Expose
    private Boolean DeleteDisabled;

    /**
    * <p>禁用原因</p>
    */
    @SerializedName("DeleteDisabledReason")
    @Expose
    private String DeleteDisabledReason;

    /**
    * <p>是否不可绑定</p><p>枚举值：</p><ul><li>true： 禁止绑定</li><li>false： 允许绑定</li></ul>
    */
    @SerializedName("BindDisabled")
    @Expose
    private Boolean BindDisabled;

    /**
     * Get <p>网关插件id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>网关插件id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>网关插件id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>网关插件id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>插件名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>插件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>插件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>插件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>插件类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>插件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>插件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>插件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>插件描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>插件描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>插件描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>插件描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get <p>发布状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>发布状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>发布状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>发布状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否禁用删除</p> 
     * @return DeleteDisabled <p>是否禁用删除</p>
     */
    public Boolean getDeleteDisabled() {
        return this.DeleteDisabled;
    }

    /**
     * Set <p>是否禁用删除</p>
     * @param DeleteDisabled <p>是否禁用删除</p>
     */
    public void setDeleteDisabled(Boolean DeleteDisabled) {
        this.DeleteDisabled = DeleteDisabled;
    }

    /**
     * Get <p>禁用原因</p> 
     * @return DeleteDisabledReason <p>禁用原因</p>
     */
    public String getDeleteDisabledReason() {
        return this.DeleteDisabledReason;
    }

    /**
     * Set <p>禁用原因</p>
     * @param DeleteDisabledReason <p>禁用原因</p>
     */
    public void setDeleteDisabledReason(String DeleteDisabledReason) {
        this.DeleteDisabledReason = DeleteDisabledReason;
    }

    /**
     * Get <p>是否不可绑定</p><p>枚举值：</p><ul><li>true： 禁止绑定</li><li>false： 允许绑定</li></ul> 
     * @return BindDisabled <p>是否不可绑定</p><p>枚举值：</p><ul><li>true： 禁止绑定</li><li>false： 允许绑定</li></ul>
     */
    public Boolean getBindDisabled() {
        return this.BindDisabled;
    }

    /**
     * Set <p>是否不可绑定</p><p>枚举值：</p><ul><li>true： 禁止绑定</li><li>false： 允许绑定</li></ul>
     * @param BindDisabled <p>是否不可绑定</p><p>枚举值：</p><ul><li>true： 禁止绑定</li><li>false： 允许绑定</li></ul>
     */
    public void setBindDisabled(Boolean BindDisabled) {
        this.BindDisabled = BindDisabled;
    }

    public GatewayPlugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayPlugin(GatewayPlugin source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DeleteDisabled != null) {
            this.DeleteDisabled = new Boolean(source.DeleteDisabled);
        }
        if (source.DeleteDisabledReason != null) {
            this.DeleteDisabledReason = new String(source.DeleteDisabledReason);
        }
        if (source.BindDisabled != null) {
            this.BindDisabled = new Boolean(source.BindDisabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DeleteDisabled", this.DeleteDisabled);
        this.setParamSimple(map, prefix + "DeleteDisabledReason", this.DeleteDisabledReason);
        this.setParamSimple(map, prefix + "BindDisabled", this.BindDisabled);

    }
}

