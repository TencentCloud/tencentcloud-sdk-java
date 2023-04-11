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

public class SessionCommand extends AbstractModel{

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
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 账号
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

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
    * 命令列表
    */
    @SerializedName("Commands")
    @Expose
    private Command [] Commands;

    /**
    * 记录数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 会话Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 设备id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 设备所属的地域
    */
    @SerializedName("ApCode")
    @Expose
    private String ApCode;

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
     * Get 账号 
     * @return RealName 账号
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 账号
     * @param RealName 账号
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
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
     * Get 命令列表 
     * @return Commands 命令列表
     */
    public Command [] getCommands() {
        return this.Commands;
    }

    /**
     * Set 命令列表
     * @param Commands 命令列表
     */
    public void setCommands(Command [] Commands) {
        this.Commands = Commands;
    }

    /**
     * Get 记录数 
     * @return Count 记录数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 记录数
     * @param Count 记录数
     */
    public void setCount(Long Count) {
        this.Count = Count;
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
     * Get 设备id 
     * @return InstanceId 设备id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 设备id
     * @param InstanceId 设备id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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

    public SessionCommand() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionCommand(SessionCommand source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
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
        if (source.Commands != null) {
            this.Commands = new Command[source.Commands.length];
            for (int i = 0; i < source.Commands.length; i++) {
                this.Commands[i] = new Command(source.Commands[i]);
            }
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ApCode != null) {
            this.ApCode = new String(source.ApCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamArrayObj(map, prefix + "Commands.", this.Commands);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ApCode", this.ApCode);

    }
}

