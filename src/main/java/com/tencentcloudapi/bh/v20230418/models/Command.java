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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Command extends AbstractModel {

    /**
    * <p>命令</p>
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * <p>命令输入的时间</p>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * <p>命令执行时间相对于所属会话开始时间的偏移量，单位ms</p>
    */
    @SerializedName("TimeOffset")
    @Expose
    private Long TimeOffset;

    /**
    * <p>命令执行情况，1--已放行，2--已阻断，3--确认</p>
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * <p>会话id</p>
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>设备account</p>
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * <p>设备ip</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>source ip</p>
    */
    @SerializedName("FromIp")
    @Expose
    private String FromIp;

    /**
    * <p>该命令所属会话的会话开始时间</p>
    */
    @SerializedName("SessTime")
    @Expose
    private String SessTime;

    /**
    * <p>该命令所属会话的会话开始时间</p>
    */
    @SerializedName("SessionTime")
    @Expose
    private String SessionTime;

    /**
    * <p>复核时间</p>
    */
    @SerializedName("ConfirmTime")
    @Expose
    private String ConfirmTime;

    /**
    * <p>用户部门id</p>
    */
    @SerializedName("UserDepartmentId")
    @Expose
    private String UserDepartmentId;

    /**
    * <p>用户部门name</p>
    */
    @SerializedName("UserDepartmentName")
    @Expose
    private String UserDepartmentName;

    /**
    * <p>设备部门id</p>
    */
    @SerializedName("DeviceDepartmentId")
    @Expose
    private String DeviceDepartmentId;

    /**
    * <p>设备部门name</p>
    */
    @SerializedName("DeviceDepartmentName")
    @Expose
    private String DeviceDepartmentName;

    /**
    * <p>会话大小</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>签名值</p>
    */
    @SerializedName("SignValue")
    @Expose
    private String SignValue;

    /**
    * <p>资产类型</p>
    */
    @SerializedName("DeviceKind")
    @Expose
    private String DeviceKind;

    /**
     * Get <p>命令</p> 
     * @return Cmd <p>命令</p>
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set <p>命令</p>
     * @param Cmd <p>命令</p>
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get <p>命令输入的时间</p> 
     * @return Time <p>命令输入的时间</p>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set <p>命令输入的时间</p>
     * @param Time <p>命令输入的时间</p>
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get <p>命令执行时间相对于所属会话开始时间的偏移量，单位ms</p> 
     * @return TimeOffset <p>命令执行时间相对于所属会话开始时间的偏移量，单位ms</p>
     */
    public Long getTimeOffset() {
        return this.TimeOffset;
    }

    /**
     * Set <p>命令执行时间相对于所属会话开始时间的偏移量，单位ms</p>
     * @param TimeOffset <p>命令执行时间相对于所属会话开始时间的偏移量，单位ms</p>
     */
    public void setTimeOffset(Long TimeOffset) {
        this.TimeOffset = TimeOffset;
    }

    /**
     * Get <p>命令执行情况，1--已放行，2--已阻断，3--确认</p> 
     * @return Action <p>命令执行情况，1--已放行，2--已阻断，3--确认</p>
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set <p>命令执行情况，1--已放行，2--已阻断，3--确认</p>
     * @param Action <p>命令执行情况，1--已放行，2--已阻断，3--确认</p>
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get <p>会话id</p> 
     * @return Sid <p>会话id</p>
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set <p>会话id</p>
     * @param Sid <p>会话id</p>
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get <p>用户名</p> 
     * @return UserName <p>用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
     * @param UserName <p>用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>设备account</p> 
     * @return Account <p>设备account</p>
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set <p>设备account</p>
     * @param Account <p>设备account</p>
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get <p>设备ip</p> 
     * @return InstanceId <p>设备ip</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>设备ip</p>
     * @param InstanceId <p>设备ip</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>source ip</p> 
     * @return FromIp <p>source ip</p>
     */
    public String getFromIp() {
        return this.FromIp;
    }

    /**
     * Set <p>source ip</p>
     * @param FromIp <p>source ip</p>
     */
    public void setFromIp(String FromIp) {
        this.FromIp = FromIp;
    }

    /**
     * Get <p>该命令所属会话的会话开始时间</p> 
     * @return SessTime <p>该命令所属会话的会话开始时间</p>
     */
    public String getSessTime() {
        return this.SessTime;
    }

    /**
     * Set <p>该命令所属会话的会话开始时间</p>
     * @param SessTime <p>该命令所属会话的会话开始时间</p>
     */
    public void setSessTime(String SessTime) {
        this.SessTime = SessTime;
    }

    /**
     * Get <p>该命令所属会话的会话开始时间</p> 
     * @return SessionTime <p>该命令所属会话的会话开始时间</p>
     */
    public String getSessionTime() {
        return this.SessionTime;
    }

    /**
     * Set <p>该命令所属会话的会话开始时间</p>
     * @param SessionTime <p>该命令所属会话的会话开始时间</p>
     */
    public void setSessionTime(String SessionTime) {
        this.SessionTime = SessionTime;
    }

    /**
     * Get <p>复核时间</p> 
     * @return ConfirmTime <p>复核时间</p>
     */
    public String getConfirmTime() {
        return this.ConfirmTime;
    }

    /**
     * Set <p>复核时间</p>
     * @param ConfirmTime <p>复核时间</p>
     */
    public void setConfirmTime(String ConfirmTime) {
        this.ConfirmTime = ConfirmTime;
    }

    /**
     * Get <p>用户部门id</p> 
     * @return UserDepartmentId <p>用户部门id</p>
     */
    public String getUserDepartmentId() {
        return this.UserDepartmentId;
    }

    /**
     * Set <p>用户部门id</p>
     * @param UserDepartmentId <p>用户部门id</p>
     */
    public void setUserDepartmentId(String UserDepartmentId) {
        this.UserDepartmentId = UserDepartmentId;
    }

    /**
     * Get <p>用户部门name</p> 
     * @return UserDepartmentName <p>用户部门name</p>
     */
    public String getUserDepartmentName() {
        return this.UserDepartmentName;
    }

    /**
     * Set <p>用户部门name</p>
     * @param UserDepartmentName <p>用户部门name</p>
     */
    public void setUserDepartmentName(String UserDepartmentName) {
        this.UserDepartmentName = UserDepartmentName;
    }

    /**
     * Get <p>设备部门id</p> 
     * @return DeviceDepartmentId <p>设备部门id</p>
     */
    public String getDeviceDepartmentId() {
        return this.DeviceDepartmentId;
    }

    /**
     * Set <p>设备部门id</p>
     * @param DeviceDepartmentId <p>设备部门id</p>
     */
    public void setDeviceDepartmentId(String DeviceDepartmentId) {
        this.DeviceDepartmentId = DeviceDepartmentId;
    }

    /**
     * Get <p>设备部门name</p> 
     * @return DeviceDepartmentName <p>设备部门name</p>
     */
    public String getDeviceDepartmentName() {
        return this.DeviceDepartmentName;
    }

    /**
     * Set <p>设备部门name</p>
     * @param DeviceDepartmentName <p>设备部门name</p>
     */
    public void setDeviceDepartmentName(String DeviceDepartmentName) {
        this.DeviceDepartmentName = DeviceDepartmentName;
    }

    /**
     * Get <p>会话大小</p> 
     * @return Size <p>会话大小</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>会话大小</p>
     * @param Size <p>会话大小</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>签名值</p> 
     * @return SignValue <p>签名值</p>
     */
    public String getSignValue() {
        return this.SignValue;
    }

    /**
     * Set <p>签名值</p>
     * @param SignValue <p>签名值</p>
     */
    public void setSignValue(String SignValue) {
        this.SignValue = SignValue;
    }

    /**
     * Get <p>资产类型</p> 
     * @return DeviceKind <p>资产类型</p>
     */
    public String getDeviceKind() {
        return this.DeviceKind;
    }

    /**
     * Set <p>资产类型</p>
     * @param DeviceKind <p>资产类型</p>
     */
    public void setDeviceKind(String DeviceKind) {
        this.DeviceKind = DeviceKind;
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
        if (source.SessionTime != null) {
            this.SessionTime = new String(source.SessionTime);
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
        if (source.SignValue != null) {
            this.SignValue = new String(source.SignValue);
        }
        if (source.DeviceKind != null) {
            this.DeviceKind = new String(source.DeviceKind);
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
        this.setParamSimple(map, prefix + "SessionTime", this.SessionTime);
        this.setParamSimple(map, prefix + "ConfirmTime", this.ConfirmTime);
        this.setParamSimple(map, prefix + "UserDepartmentId", this.UserDepartmentId);
        this.setParamSimple(map, prefix + "UserDepartmentName", this.UserDepartmentName);
        this.setParamSimple(map, prefix + "DeviceDepartmentId", this.DeviceDepartmentId);
        this.setParamSimple(map, prefix + "DeviceDepartmentName", this.DeviceDepartmentName);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "SignValue", this.SignValue);
        this.setParamSimple(map, prefix + "DeviceKind", this.DeviceKind);

    }
}

