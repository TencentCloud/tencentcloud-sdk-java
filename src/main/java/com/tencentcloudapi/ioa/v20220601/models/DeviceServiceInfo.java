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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceServiceInfo extends AbstractModel {

    /**
    * 命令行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * 内存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 进程id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * 启动类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartType")
    @Expose
    private Long StartType;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 启动用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
     * Get 命令行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CmdLine 命令行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set 命令行
注意：此字段可能返回 null，表示取不到有效值。
     * @param CmdLine 命令行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get 内存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 内存
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 进程id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessId 进程id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set 进程id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessId 进程id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get 启动类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartType 启动类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartType() {
        return this.StartType;
    }

    /**
     * Set 启动类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartType 启动类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartType(Long StartType) {
        this.StartType = StartType;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 启动用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 启动用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 启动用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 启动用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    public DeviceServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceServiceInfo(DeviceServiceInfo source) {
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProcessId != null) {
            this.ProcessId = new Long(source.ProcessId);
        }
        if (source.StartType != null) {
            this.StartType = new Long(source.StartType);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "StartType", this.StartType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "User", this.User);

    }
}

