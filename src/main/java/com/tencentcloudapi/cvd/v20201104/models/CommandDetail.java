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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommandDetail extends AbstractModel {

    /**
    * 租户 Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 租户 APPID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 任务类型，取值有：
PowerShellScript
Bat
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * RUNNING - 执行中；FINISHED - 执行完成
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务脚本，Base64 编码
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 任务唯一 ID
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * 任务完成时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 各实例运行结果集
    */
    @SerializedName("Invocations")
    @Expose
    private InvocationDetail [] Invocations;

    /**
    * 是否以绑定用户运行任务，默认 false：system 用户执行
    */
    @SerializedName("RunAsBoundUser")
    @Expose
    private Boolean RunAsBoundUser;

    /**
    * 是否前台运行任务，默认 false：后台运行任务
    */
    @SerializedName("RunForeground")
    @Expose
    private Boolean RunForeground;

    /**
     * Get 租户 Uin 
     * @return Uin 租户 Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 租户 Uin
     * @param Uin 租户 Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 租户 APPID 
     * @return AppId 租户 APPID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户 APPID
     * @param AppId 租户 APPID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 任务类型，取值有：
PowerShellScript
Bat 
     * @return Type 任务类型，取值有：
PowerShellScript
Bat
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务类型，取值有：
PowerShellScript
Bat
     * @param Type 任务类型，取值有：
PowerShellScript
Bat
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get RUNNING - 执行中；FINISHED - 执行完成 
     * @return Status RUNNING - 执行中；FINISHED - 执行完成
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set RUNNING - 执行中；FINISHED - 执行完成
     * @param Status RUNNING - 执行中；FINISHED - 执行完成
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务脚本，Base64 编码 
     * @return Command 任务脚本，Base64 编码
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 任务脚本，Base64 编码
     * @param Command 任务脚本，Base64 编码
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 任务唯一 ID 
     * @return CommandId 任务唯一 ID
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set 任务唯一 ID
     * @param CommandId 任务唯一 ID
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get 任务完成时间 
     * @return CreateTime 任务完成时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务完成时间
     * @param CreateTime 任务完成时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishTime 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishTime 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 各实例运行结果集 
     * @return Invocations 各实例运行结果集
     */
    public InvocationDetail [] getInvocations() {
        return this.Invocations;
    }

    /**
     * Set 各实例运行结果集
     * @param Invocations 各实例运行结果集
     */
    public void setInvocations(InvocationDetail [] Invocations) {
        this.Invocations = Invocations;
    }

    /**
     * Get 是否以绑定用户运行任务，默认 false：system 用户执行 
     * @return RunAsBoundUser 是否以绑定用户运行任务，默认 false：system 用户执行
     */
    public Boolean getRunAsBoundUser() {
        return this.RunAsBoundUser;
    }

    /**
     * Set 是否以绑定用户运行任务，默认 false：system 用户执行
     * @param RunAsBoundUser 是否以绑定用户运行任务，默认 false：system 用户执行
     */
    public void setRunAsBoundUser(Boolean RunAsBoundUser) {
        this.RunAsBoundUser = RunAsBoundUser;
    }

    /**
     * Get 是否前台运行任务，默认 false：后台运行任务 
     * @return RunForeground 是否前台运行任务，默认 false：后台运行任务
     */
    public Boolean getRunForeground() {
        return this.RunForeground;
    }

    /**
     * Set 是否前台运行任务，默认 false：后台运行任务
     * @param RunForeground 是否前台运行任务，默认 false：后台运行任务
     */
    public void setRunForeground(Boolean RunForeground) {
        this.RunForeground = RunForeground;
    }

    public CommandDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommandDetail(CommandDetail source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.Invocations != null) {
            this.Invocations = new InvocationDetail[source.Invocations.length];
            for (int i = 0; i < source.Invocations.length; i++) {
                this.Invocations[i] = new InvocationDetail(source.Invocations[i]);
            }
        }
        if (source.RunAsBoundUser != null) {
            this.RunAsBoundUser = new Boolean(source.RunAsBoundUser);
        }
        if (source.RunForeground != null) {
            this.RunForeground = new Boolean(source.RunForeground);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamArrayObj(map, prefix + "Invocations.", this.Invocations);
        this.setParamSimple(map, prefix + "RunAsBoundUser", this.RunAsBoundUser);
        this.setParamSimple(map, prefix + "RunForeground", this.RunForeground);

    }
}

