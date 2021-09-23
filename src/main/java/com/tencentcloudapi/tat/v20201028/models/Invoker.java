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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Invoker extends AbstractModel{

    /**
    * 执行器ID。
    */
    @SerializedName("InvokerId")
    @Expose
    private String InvokerId;

    /**
    * 执行器名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 执行器类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 命令ID。
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * 用户名。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 自定义参数。
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * 实例ID列表。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 执行器是否启用。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 执行器周期计划。周期执行器会返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleSettings")
    @Expose
    private ScheduleSettings ScheduleSettings;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 修改时间。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get 执行器ID。 
     * @return InvokerId 执行器ID。
     */
    public String getInvokerId() {
        return this.InvokerId;
    }

    /**
     * Set 执行器ID。
     * @param InvokerId 执行器ID。
     */
    public void setInvokerId(String InvokerId) {
        this.InvokerId = InvokerId;
    }

    /**
     * Get 执行器名称。 
     * @return Name 执行器名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 执行器名称。
     * @param Name 执行器名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 执行器类型。 
     * @return Type 执行器类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 执行器类型。
     * @param Type 执行器类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 命令ID。 
     * @return CommandId 命令ID。
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set 命令ID。
     * @param CommandId 命令ID。
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get 用户名。 
     * @return Username 用户名。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名。
     * @param Username 用户名。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 自定义参数。 
     * @return Parameters 自定义参数。
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set 自定义参数。
     * @param Parameters 自定义参数。
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 实例ID列表。 
     * @return InstanceIds 实例ID列表。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID列表。
     * @param InstanceIds 实例ID列表。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 执行器是否启用。 
     * @return Enable 执行器是否启用。
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 执行器是否启用。
     * @param Enable 执行器是否启用。
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 执行器周期计划。周期执行器会返回此字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleSettings 执行器周期计划。周期执行器会返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleSettings getScheduleSettings() {
        return this.ScheduleSettings;
    }

    /**
     * Set 执行器周期计划。周期执行器会返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleSettings 执行器周期计划。周期执行器会返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleSettings(ScheduleSettings ScheduleSettings) {
        this.ScheduleSettings = ScheduleSettings;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 修改时间。 
     * @return UpdatedTime 修改时间。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 修改时间。
     * @param UpdatedTime 修改时间。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public Invoker() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Invoker(Invoker source) {
        if (source.InvokerId != null) {
            this.InvokerId = new String(source.InvokerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ScheduleSettings != null) {
            this.ScheduleSettings = new ScheduleSettings(source.ScheduleSettings);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokerId", this.InvokerId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamObj(map, prefix + "ScheduleSettings.", this.ScheduleSettings);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

