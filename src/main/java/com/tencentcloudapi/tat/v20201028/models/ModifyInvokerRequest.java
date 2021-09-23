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

public class ModifyInvokerRequest extends AbstractModel{

    /**
    * 待修改的执行器ID。
    */
    @SerializedName("InvokerId")
    @Expose
    private String InvokerId;

    /**
    * 待修改的执行器名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 执行器类型，当前仅支持周期类型执行器，取值：`SCHEDULE` 。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 待修改的命令ID。
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * 待修改的用户名。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 待修改的自定义参数。
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * 待修改的实例ID列表。列表长度上限100。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 待修改的周期执行器设置。
    */
    @SerializedName("ScheduleSettings")
    @Expose
    private ScheduleSettings ScheduleSettings;

    /**
     * Get 待修改的执行器ID。 
     * @return InvokerId 待修改的执行器ID。
     */
    public String getInvokerId() {
        return this.InvokerId;
    }

    /**
     * Set 待修改的执行器ID。
     * @param InvokerId 待修改的执行器ID。
     */
    public void setInvokerId(String InvokerId) {
        this.InvokerId = InvokerId;
    }

    /**
     * Get 待修改的执行器名称。 
     * @return Name 待修改的执行器名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 待修改的执行器名称。
     * @param Name 待修改的执行器名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 执行器类型，当前仅支持周期类型执行器，取值：`SCHEDULE` 。 
     * @return Type 执行器类型，当前仅支持周期类型执行器，取值：`SCHEDULE` 。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 执行器类型，当前仅支持周期类型执行器，取值：`SCHEDULE` 。
     * @param Type 执行器类型，当前仅支持周期类型执行器，取值：`SCHEDULE` 。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 待修改的命令ID。 
     * @return CommandId 待修改的命令ID。
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set 待修改的命令ID。
     * @param CommandId 待修改的命令ID。
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get 待修改的用户名。 
     * @return Username 待修改的用户名。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 待修改的用户名。
     * @param Username 待修改的用户名。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 待修改的自定义参数。 
     * @return Parameters 待修改的自定义参数。
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set 待修改的自定义参数。
     * @param Parameters 待修改的自定义参数。
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 待修改的实例ID列表。列表长度上限100。 
     * @return InstanceIds 待修改的实例ID列表。列表长度上限100。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 待修改的实例ID列表。列表长度上限100。
     * @param InstanceIds 待修改的实例ID列表。列表长度上限100。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 待修改的周期执行器设置。 
     * @return ScheduleSettings 待修改的周期执行器设置。
     */
    public ScheduleSettings getScheduleSettings() {
        return this.ScheduleSettings;
    }

    /**
     * Set 待修改的周期执行器设置。
     * @param ScheduleSettings 待修改的周期执行器设置。
     */
    public void setScheduleSettings(ScheduleSettings ScheduleSettings) {
        this.ScheduleSettings = ScheduleSettings;
    }

    public ModifyInvokerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInvokerRequest(ModifyInvokerRequest source) {
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
        if (source.ScheduleSettings != null) {
            this.ScheduleSettings = new ScheduleSettings(source.ScheduleSettings);
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
        this.setParamObj(map, prefix + "ScheduleSettings.", this.ScheduleSettings);

    }
}

