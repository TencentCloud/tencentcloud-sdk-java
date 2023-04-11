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

public class SessionResult extends AbstractModel{

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
    * 主机账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 会话大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 设备ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 设备名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 内部Ip
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 外部Ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 来源Ip
    */
    @SerializedName("FromIp")
    @Expose
    private String FromIp;

    /**
    * 会话持续时长
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 该会话内命令数量 ，搜索图形会话时该字段无意义
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 该会话内高危命令数，搜索图形时该字段无意义
    */
    @SerializedName("DangerCount")
    @Expose
    private Long DangerCount;

    /**
    * 会话状态，如1会话活跃  2会话结束  3强制离线  4其他错误
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 会话Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 设备所属的地域
    */
    @SerializedName("ApCode")
    @Expose
    private String ApCode;

    /**
    * 会话协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

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
     * Get 主机账号 
     * @return Account 主机账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 主机账号
     * @param Account 主机账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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

    /**
     * Get 设备ID 
     * @return InstanceId 设备ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 设备ID
     * @param InstanceId 设备ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 设备名 
     * @return DeviceName 设备名
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名
     * @param DeviceName 设备名
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 内部Ip 
     * @return PrivateIp 内部Ip
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内部Ip
     * @param PrivateIp 内部Ip
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 外部Ip 
     * @return PublicIp 外部Ip
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 外部Ip
     * @param PublicIp 外部Ip
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 来源Ip 
     * @return FromIp 来源Ip
     */
    public String getFromIp() {
        return this.FromIp;
    }

    /**
     * Set 来源Ip
     * @param FromIp 来源Ip
     */
    public void setFromIp(String FromIp) {
        this.FromIp = FromIp;
    }

    /**
     * Get 会话持续时长 
     * @return Duration 会话持续时长
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 会话持续时长
     * @param Duration 会话持续时长
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 该会话内命令数量 ，搜索图形会话时该字段无意义 
     * @return Count 该会话内命令数量 ，搜索图形会话时该字段无意义
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 该会话内命令数量 ，搜索图形会话时该字段无意义
     * @param Count 该会话内命令数量 ，搜索图形会话时该字段无意义
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 该会话内高危命令数，搜索图形时该字段无意义 
     * @return DangerCount 该会话内高危命令数，搜索图形时该字段无意义
     */
    public Long getDangerCount() {
        return this.DangerCount;
    }

    /**
     * Set 该会话内高危命令数，搜索图形时该字段无意义
     * @param DangerCount 该会话内高危命令数，搜索图形时该字段无意义
     */
    public void setDangerCount(Long DangerCount) {
        this.DangerCount = DangerCount;
    }

    /**
     * Get 会话状态，如1会话活跃  2会话结束  3强制离线  4其他错误 
     * @return Status 会话状态，如1会话活跃  2会话结束  3强制离线  4其他错误
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 会话状态，如1会话活跃  2会话结束  3强制离线  4其他错误
     * @param Status 会话状态，如1会话活跃  2会话结束  3强制离线  4其他错误
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 会话Id 
     * @return Id 会话Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 会话Id
     * @param Id 会话Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 设备所属的地域 
     * @return ApCode 设备所属的地域
     */
    public String getApCode() {
        return this.ApCode;
    }

    /**
     * Set 设备所属的地域
     * @param ApCode 设备所属的地域
     */
    public void setApCode(String ApCode) {
        this.ApCode = ApCode;
    }

    /**
     * Get 会话协议 
     * @return Protocol 会话协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 会话协议
     * @param Protocol 会话协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public SessionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionResult(SessionResult source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.FromIp != null) {
            this.FromIp = new String(source.FromIp);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.DangerCount != null) {
            this.DangerCount = new Long(source.DangerCount);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ApCode != null) {
            this.ApCode = new String(source.ApCode);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "FromIp", this.FromIp);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "DangerCount", this.DangerCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ApCode", this.ApCode);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

