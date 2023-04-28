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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Command extends AbstractModel{

    /**
    * 命令
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * 命令输入的时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 命令执行时间相对于所属会话开始时间的偏移量，单位ms
    */
    @SerializedName("TimeOffset")
    @Expose
    private Long TimeOffset;

    /**
    * 命令执行情况，1--允许，2--拒绝，3--确认
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * 会话id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 设备account
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 设备ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * source ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromIp")
    @Expose
    private String FromIp;

    /**
    * 该命令所属会话的会话开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessTime")
    @Expose
    private String SessTime;

    /**
    * 复核时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfirmTime")
    @Expose
    private String ConfirmTime;

    /**
    * 用户部门id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserDepartmentId")
    @Expose
    private String UserDepartmentId;

    /**
    * 用户部门name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserDepartmentName")
    @Expose
    private String UserDepartmentName;

    /**
    * 设备部门id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceDepartmentId")
    @Expose
    private String DeviceDepartmentId;

    /**
    * 设备部门name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceDepartmentName")
    @Expose
    private String DeviceDepartmentName;

    /**
     * Get 命令 
     * @return Cmd 命令
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set 命令
     * @param Cmd 命令
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get 命令输入的时间 
     * @return Time 命令输入的时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 命令输入的时间
     * @param Time 命令输入的时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 命令执行时间相对于所属会话开始时间的偏移量，单位ms 
     * @return TimeOffset 命令执行时间相对于所属会话开始时间的偏移量，单位ms
     */
    public Long getTimeOffset() {
        return this.TimeOffset;
    }

    /**
     * Set 命令执行时间相对于所属会话开始时间的偏移量，单位ms
     * @param TimeOffset 命令执行时间相对于所属会话开始时间的偏移量，单位ms
     */
    public void setTimeOffset(Long TimeOffset) {
        this.TimeOffset = TimeOffset;
    }

    /**
     * Get 命令执行情况，1--允许，2--拒绝，3--确认 
     * @return Action 命令执行情况，1--允许，2--拒绝，3--确认
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 命令执行情况，1--允许，2--拒绝，3--确认
     * @param Action 命令执行情况，1--允许，2--拒绝，3--确认
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get 会话id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sid 会话id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set 会话id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sid 会话id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 设备account
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Account 设备account
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 设备account
注意：此字段可能返回 null，表示取不到有效值。
     * @param Account 设备account
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 设备ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 设备ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 设备ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 设备ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get source ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromIp source ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFromIp() {
        return this.FromIp;
    }

    /**
     * Set source ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromIp source ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromIp(String FromIp) {
        this.FromIp = FromIp;
    }

    /**
     * Get 该命令所属会话的会话开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessTime 该命令所属会话的会话开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessTime() {
        return this.SessTime;
    }

    /**
     * Set 该命令所属会话的会话开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessTime 该命令所属会话的会话开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessTime(String SessTime) {
        this.SessTime = SessTime;
    }

    /**
     * Get 复核时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfirmTime 复核时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfirmTime() {
        return this.ConfirmTime;
    }

    /**
     * Set 复核时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfirmTime 复核时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfirmTime(String ConfirmTime) {
        this.ConfirmTime = ConfirmTime;
    }

    /**
     * Get 用户部门id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserDepartmentId 用户部门id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserDepartmentId() {
        return this.UserDepartmentId;
    }

    /**
     * Set 用户部门id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserDepartmentId 用户部门id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserDepartmentId(String UserDepartmentId) {
        this.UserDepartmentId = UserDepartmentId;
    }

    /**
     * Get 用户部门name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserDepartmentName 用户部门name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserDepartmentName() {
        return this.UserDepartmentName;
    }

    /**
     * Set 用户部门name
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserDepartmentName 用户部门name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserDepartmentName(String UserDepartmentName) {
        this.UserDepartmentName = UserDepartmentName;
    }

    /**
     * Get 设备部门id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceDepartmentId 设备部门id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceDepartmentId() {
        return this.DeviceDepartmentId;
    }

    /**
     * Set 设备部门id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceDepartmentId 设备部门id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceDepartmentId(String DeviceDepartmentId) {
        this.DeviceDepartmentId = DeviceDepartmentId;
    }

    /**
     * Get 设备部门name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceDepartmentName 设备部门name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceDepartmentName() {
        return this.DeviceDepartmentName;
    }

    /**
     * Set 设备部门name
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceDepartmentName 设备部门name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceDepartmentName(String DeviceDepartmentName) {
        this.DeviceDepartmentName = DeviceDepartmentName;
    }

    public Command() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Command(Command source) {
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.TimeOffset != null) {
            this.TimeOffset = new Long(source.TimeOffset);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.Sid != null) {
            this.Sid = new String(source.Sid);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FromIp != null) {
            this.FromIp = new String(source.FromIp);
        }
        if (source.SessTime != null) {
            this.SessTime = new String(source.SessTime);
        }
        if (source.ConfirmTime != null) {
            this.ConfirmTime = new String(source.ConfirmTime);
        }
        if (source.UserDepartmentId != null) {
            this.UserDepartmentId = new String(source.UserDepartmentId);
        }
        if (source.UserDepartmentName != null) {
            this.UserDepartmentName = new String(source.UserDepartmentName);
        }
        if (source.DeviceDepartmentId != null) {
            this.DeviceDepartmentId = new String(source.DeviceDepartmentId);
        }
        if (source.DeviceDepartmentName != null) {
            this.DeviceDepartmentName = new String(source.DeviceDepartmentName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "TimeOffset", this.TimeOffset);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Sid", this.Sid);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FromIp", this.FromIp);
        this.setParamSimple(map, prefix + "SessTime", this.SessTime);
        this.setParamSimple(map, prefix + "ConfirmTime", this.ConfirmTime);
        this.setParamSimple(map, prefix + "UserDepartmentId", this.UserDepartmentId);
        this.setParamSimple(map, prefix + "UserDepartmentName", this.UserDepartmentName);
        this.setParamSimple(map, prefix + "DeviceDepartmentId", this.DeviceDepartmentId);
        this.setParamSimple(map, prefix + "DeviceDepartmentName", this.DeviceDepartmentName);

    }
}

