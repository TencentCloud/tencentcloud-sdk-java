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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInformation extends AbstractModel{

    /**
    * 房间号
    */
    @SerializedName("RoomStr")
    @Expose
    private String RoomStr;

    /**
    * 用户Id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户进房时间
    */
    @SerializedName("JoinTs")
    @Expose
    private Long JoinTs;

    /**
    * 用户退房时间，用户没有退房则返回当前时间
    */
    @SerializedName("LeaveTs")
    @Expose
    private Long LeaveTs;

    /**
    * 终端类型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Sdk版本号
    */
    @SerializedName("SdkVersion")
    @Expose
    private String SdkVersion;

    /**
    * 客户端IP地址
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 判断用户是否已经离开房间
    */
    @SerializedName("Finished")
    @Expose
    private Boolean Finished;

    /**
     * Get 房间号 
     * @return RoomStr 房间号
     */
    public String getRoomStr() {
        return this.RoomStr;
    }

    /**
     * Set 房间号
     * @param RoomStr 房间号
     */
    public void setRoomStr(String RoomStr) {
        this.RoomStr = RoomStr;
    }

    /**
     * Get 用户Id 
     * @return UserId 用户Id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户Id
     * @param UserId 用户Id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户进房时间 
     * @return JoinTs 用户进房时间
     */
    public Long getJoinTs() {
        return this.JoinTs;
    }

    /**
     * Set 用户进房时间
     * @param JoinTs 用户进房时间
     */
    public void setJoinTs(Long JoinTs) {
        this.JoinTs = JoinTs;
    }

    /**
     * Get 用户退房时间，用户没有退房则返回当前时间 
     * @return LeaveTs 用户退房时间，用户没有退房则返回当前时间
     */
    public Long getLeaveTs() {
        return this.LeaveTs;
    }

    /**
     * Set 用户退房时间，用户没有退房则返回当前时间
     * @param LeaveTs 用户退房时间，用户没有退房则返回当前时间
     */
    public void setLeaveTs(Long LeaveTs) {
        this.LeaveTs = LeaveTs;
    }

    /**
     * Get 终端类型 
     * @return DeviceType 终端类型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 终端类型
     * @param DeviceType 终端类型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Sdk版本号 
     * @return SdkVersion Sdk版本号
     */
    public String getSdkVersion() {
        return this.SdkVersion;
    }

    /**
     * Set Sdk版本号
     * @param SdkVersion Sdk版本号
     */
    public void setSdkVersion(String SdkVersion) {
        this.SdkVersion = SdkVersion;
    }

    /**
     * Get 客户端IP地址 
     * @return ClientIp 客户端IP地址
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 客户端IP地址
     * @param ClientIp 客户端IP地址
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 判断用户是否已经离开房间 
     * @return Finished 判断用户是否已经离开房间
     */
    public Boolean getFinished() {
        return this.Finished;
    }

    /**
     * Set 判断用户是否已经离开房间
     * @param Finished 判断用户是否已经离开房间
     */
    public void setFinished(Boolean Finished) {
        this.Finished = Finished;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomStr", this.RoomStr);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "JoinTs", this.JoinTs);
        this.setParamSimple(map, prefix + "LeaveTs", this.LeaveTs);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "SdkVersion", this.SdkVersion);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Finished", this.Finished);

    }
}

