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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Command extends AbstractModel {

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
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 设备account
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 设备ip
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * source ip
    */
    @SerializedName("FromIp")
    @Expose
    private String FromIp;

    /**
    * 该命令所属会话的会话开始时间
    */
    @SerializedName("SessionTime")
    @Expose
    private String SessionTime;

    /**
    * 该命令所属会话的会话开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessTime")
    @Expose
    private String SessTime;

    /**
    * 复核时间
    */
    @SerializedName("ConfirmTime")
    @Expose
    private String ConfirmTime;

    /**
    * 用户部门id
    */
    @SerializedName("UserDepartmentId")
    @Expose
    private String UserDepartmentId;

    /**
    * 用户部门name
    */
    @SerializedName("UserDepartmentName")
    @Expose
    private String UserDepartmentName;

    /**
    * 设备部门id
    */
    @SerializedName("DeviceDepartmentId")
    @Expose
    private String DeviceDepartmentId;

    /**
    * 设备部门name
    */
    @SerializedName("DeviceDepartmentName")
    @Expose
    private String DeviceDepartmentName;

    /**
    * 会话大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

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
     * @return Sid 会话id
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set 会话id
     * @param Sid 会话id
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 设备account 
     * @return Account 设备account
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 设备account
     * @param Account 设备account
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 设备ip 
     * @return InstanceId 设备ip
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 设备ip
     * @param InstanceId 设备ip
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get source ip 
     * @return FromIp source ip
     */
    public String getFromIp() {
        return this.FromIp;
    }

    /**
     * Set source ip
     * @param FromIp source ip
     */
    public void setFromIp(String FromIp) {
        this.FromIp = FromIp;
    }

    /**
     * Get 该命令所属会话的会话开始时间 
     * @return SessionTime 该命令所属会话的会话开始时间
     */
    public String getSessionTime() {
        return this.SessionTime;
    }

    /**
     * Set 该命令所属会话的会话开始时间
     * @param SessionTime 该命令所属会话的会话开始时间
     */
    public void setSessionTime(String SessionTime) {
        this.SessionTime = SessionTime;
    }

    /**
     * Get 该命令所属会话的会话开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessTime 该命令所属会话的会话开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getSessTime() {
        return this.SessTime;
    }

    /**
     * Set 该命令所属会话的会话开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessTime 该命令所属会话的会话开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setSessTime(String SessTime) {
        this.SessTime = SessTime;
    }

    /**
     * Get 复核时间 
     * @return ConfirmTime 复核时间
     */
    public String getConfirmTime() {
        return this.ConfirmTime;
    }

    /**
     * Set 复核时间
     * @param ConfirmTime 复核时间
     */
    public void setConfirmTime(String ConfirmTime) {
        this.ConfirmTime = ConfirmTime;
    }

    /**
     * Get 用户部门id 
     * @return UserDepartmentId 用户部门id
     */
    public String getUserDepartmentId() {
        return this.UserDepartmentId;
    }

    /**
     * Set 用户部门id
     * @param UserDepartmentId 用户部门id
     */
    public void setUserDepartmentId(String UserDepartmentId) {
        this.UserDepartmentId = UserDepartmentId;
    }

    /**
     * Get 用户部门name 
     * @return UserDepartmentName 用户部门name
     */
    public String getUserDepartmentName() {
        return this.UserDepartmentName;
    }

    /**
     * Set 用户部门name
     * @param UserDepartmentName 用户部门name
     */
    public void setUserDepartmentName(String UserDepartmentName) {
        this.UserDepartmentName = UserDepartmentName;
    }

    /**
     * Get 设备部门id 
     * @return DeviceDepartmentId 设备部门id
     */
    public String getDeviceDepartmentId() {
        return this.DeviceDepartmentId;
    }

    /**
     * Set 设备部门id
     * @param DeviceDepartmentId 设备部门id
     */
    public void setDeviceDepartmentId(String DeviceDepartmentId) {
        this.DeviceDepartmentId = DeviceDepartmentId;
    }

    /**
     * Get 设备部门name 
     * @return DeviceDepartmentName 设备部门name
     */
    public String getDeviceDepartmentName() {
        return this.DeviceDepartmentName;
    }

    /**
     * Set 设备部门name
     * @param DeviceDepartmentName 设备部门name
     */
    public void setDeviceDepartmentName(String DeviceDepartmentName) {
        this.DeviceDepartmentName = DeviceDepartmentName;
    }

    /**
     * Get 会话大小 
     * @return Size 会话大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 会话大小
     * @param Size 会话大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
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
        if (source.SessionTime != null) {
            this.SessionTime = new String(source.SessionTime);
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
        if (source.Size != null) {
            this.Size = new Long(source.Size);
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
        this.setParamSimple(map, prefix + "SessionTime", this.SessionTime);
        this.setParamSimple(map, prefix + "SessTime", this.SessTime);
        this.setParamSimple(map, prefix + "ConfirmTime", this.ConfirmTime);
        this.setParamSimple(map, prefix + "UserDepartmentId", this.UserDepartmentId);
        this.setParamSimple(map, prefix + "UserDepartmentName", this.UserDepartmentName);
        this.setParamSimple(map, prefix + "DeviceDepartmentId", this.DeviceDepartmentId);
        this.setParamSimple(map, prefix + "DeviceDepartmentName", this.DeviceDepartmentName);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

