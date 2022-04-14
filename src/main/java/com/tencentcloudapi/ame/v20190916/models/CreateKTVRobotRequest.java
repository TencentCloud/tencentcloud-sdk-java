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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKTVRobotRequest extends AbstractModel{

    /**
    * RTC厂商类型，取值有：
<li>TRTC</li>
    */
    @SerializedName("RTCSystem")
    @Expose
    private String RTCSystem;

    /**
    * 进房参数。
    */
    @SerializedName("JoinRoomInput")
    @Expose
    private JoinRoomInput JoinRoomInput;

    /**
    * license基础信息
    */
    @SerializedName("ApplicationLicenseInput")
    @Expose
    private ApplicationLicenseInput ApplicationLicenseInput;

    /**
    * 创建机器人时初始化参数。
    */
    @SerializedName("SyncRobotCommands")
    @Expose
    private SyncRobotCommand [] SyncRobotCommands;

    /**
     * Get RTC厂商类型，取值有：
<li>TRTC</li> 
     * @return RTCSystem RTC厂商类型，取值有：
<li>TRTC</li>
     */
    public String getRTCSystem() {
        return this.RTCSystem;
    }

    /**
     * Set RTC厂商类型，取值有：
<li>TRTC</li>
     * @param RTCSystem RTC厂商类型，取值有：
<li>TRTC</li>
     */
    public void setRTCSystem(String RTCSystem) {
        this.RTCSystem = RTCSystem;
    }

    /**
     * Get 进房参数。 
     * @return JoinRoomInput 进房参数。
     */
    public JoinRoomInput getJoinRoomInput() {
        return this.JoinRoomInput;
    }

    /**
     * Set 进房参数。
     * @param JoinRoomInput 进房参数。
     */
    public void setJoinRoomInput(JoinRoomInput JoinRoomInput) {
        this.JoinRoomInput = JoinRoomInput;
    }

    /**
     * Get license基础信息 
     * @return ApplicationLicenseInput license基础信息
     */
    public ApplicationLicenseInput getApplicationLicenseInput() {
        return this.ApplicationLicenseInput;
    }

    /**
     * Set license基础信息
     * @param ApplicationLicenseInput license基础信息
     */
    public void setApplicationLicenseInput(ApplicationLicenseInput ApplicationLicenseInput) {
        this.ApplicationLicenseInput = ApplicationLicenseInput;
    }

    /**
     * Get 创建机器人时初始化参数。 
     * @return SyncRobotCommands 创建机器人时初始化参数。
     */
    public SyncRobotCommand [] getSyncRobotCommands() {
        return this.SyncRobotCommands;
    }

    /**
     * Set 创建机器人时初始化参数。
     * @param SyncRobotCommands 创建机器人时初始化参数。
     */
    public void setSyncRobotCommands(SyncRobotCommand [] SyncRobotCommands) {
        this.SyncRobotCommands = SyncRobotCommands;
    }

    public CreateKTVRobotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKTVRobotRequest(CreateKTVRobotRequest source) {
        if (source.RTCSystem != null) {
            this.RTCSystem = new String(source.RTCSystem);
        }
        if (source.JoinRoomInput != null) {
            this.JoinRoomInput = new JoinRoomInput(source.JoinRoomInput);
        }
        if (source.ApplicationLicenseInput != null) {
            this.ApplicationLicenseInput = new ApplicationLicenseInput(source.ApplicationLicenseInput);
        }
        if (source.SyncRobotCommands != null) {
            this.SyncRobotCommands = new SyncRobotCommand[source.SyncRobotCommands.length];
            for (int i = 0; i < source.SyncRobotCommands.length; i++) {
                this.SyncRobotCommands[i] = new SyncRobotCommand(source.SyncRobotCommands[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RTCSystem", this.RTCSystem);
        this.setParamObj(map, prefix + "JoinRoomInput.", this.JoinRoomInput);
        this.setParamObj(map, prefix + "ApplicationLicenseInput.", this.ApplicationLicenseInput);
        this.setParamArrayObj(map, prefix + "SyncRobotCommands.", this.SyncRobotCommands);

    }
}

