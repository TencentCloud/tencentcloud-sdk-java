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

public class SearchCommandResult extends AbstractModel{

    /**
    * 命令输入的时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 姓名
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 资产ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资产名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 资产公网IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 资产内网IP
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 命令
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * 命令执行情况，1--允许，2--拒绝
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * 命令所属的会话ID
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * 命令执行时间相对于所属会话开始时间的偏移量，单位ms
    */
    @SerializedName("TimeOffset")
    @Expose
    private Long TimeOffset;

    /**
    * 账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Account")
    @Expose
    private String Account;

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
    * 部门id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserDepartmentId")
    @Expose
    private String UserDepartmentId;

    /**
    * 用户部门名称
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
    * 设备部门名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceDepartmentName")
    @Expose
    private String DeviceDepartmentName;

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
     * Get 姓名 
     * @return RealName 姓名
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 姓名
     * @param RealName 姓名
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 资产ID 
     * @return InstanceId 资产ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资产ID
     * @param InstanceId 资产ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资产名称 
     * @return DeviceName 资产名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 资产名称
     * @param DeviceName 资产名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 资产公网IP 
     * @return PublicIp 资产公网IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 资产公网IP
     * @param PublicIp 资产公网IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 资产内网IP 
     * @return PrivateIp 资产内网IP
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 资产内网IP
     * @param PrivateIp 资产内网IP
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

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
     * Get 命令执行情况，1--允许，2--拒绝 
     * @return Action 命令执行情况，1--允许，2--拒绝
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 命令执行情况，1--允许，2--拒绝
     * @param Action 命令执行情况，1--允许，2--拒绝
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get 命令所属的会话ID 
     * @return Sid 命令所属的会话ID
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set 命令所属的会话ID
     * @param Sid 命令所属的会话ID
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
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
     * Get 账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Account 账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Account 账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccount(String Account) {
        this.Account = Account;
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
     * Get 部门id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserDepartmentId 部门id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserDepartmentId() {
        return this.UserDepartmentId;
    }

    /**
     * Set 部门id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserDepartmentId 部门id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserDepartmentId(String UserDepartmentId) {
        this.UserDepartmentId = UserDepartmentId;
    }

    /**
     * Get 用户部门名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserDepartmentName 用户部门名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserDepartmentName() {
        return this.UserDepartmentName;
    }

    /**
     * Set 用户部门名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserDepartmentName 用户部门名称
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
     * Get 设备部门名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceDepartmentName 设备部门名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceDepartmentName() {
        return this.DeviceDepartmentName;
    }

    /**
     * Set 设备部门名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceDepartmentName 设备部门名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceDepartmentName(String DeviceDepartmentName) {
        this.DeviceDepartmentName = DeviceDepartmentName;
    }

    public SearchCommandResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchCommandResult(SearchCommandResult source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.Sid != null) {
            this.Sid = new String(source.Sid);
        }
        if (source.TimeOffset != null) {
            this.TimeOffset = new Long(source.TimeOffset);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
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
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Sid", this.Sid);
        this.setParamSimple(map, prefix + "TimeOffset", this.TimeOffset);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "FromIp", this.FromIp);
        this.setParamSimple(map, prefix + "SessTime", this.SessTime);
        this.setParamSimple(map, prefix + "ConfirmTime", this.ConfirmTime);
        this.setParamSimple(map, prefix + "UserDepartmentId", this.UserDepartmentId);
        this.setParamSimple(map, prefix + "UserDepartmentName", this.UserDepartmentName);
        this.setParamSimple(map, prefix + "DeviceDepartmentId", this.DeviceDepartmentId);
        this.setParamSimple(map, prefix + "DeviceDepartmentName", this.DeviceDepartmentName);

    }
}

