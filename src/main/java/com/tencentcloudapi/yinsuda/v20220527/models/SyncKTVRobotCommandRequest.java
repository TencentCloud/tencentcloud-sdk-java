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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncKTVRobotCommandRequest extends AbstractModel {

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 用户标识。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 机器人Id。
    */
    @SerializedName("RobotId")
    @Expose
    private String RobotId;

    /**
    * 指令及指令参数数组。
    */
    @SerializedName("SyncRobotCommands")
    @Expose
    private SyncRobotCommand [] SyncRobotCommands;

    /**
     * Get 应用名称。 
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 用户标识。 
     * @return UserId 用户标识。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户标识。
     * @param UserId 用户标识。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 机器人Id。 
     * @return RobotId 机器人Id。
     */
    public String getRobotId() {
        return this.RobotId;
    }

    /**
     * Set 机器人Id。
     * @param RobotId 机器人Id。
     */
    public void setRobotId(String RobotId) {
        this.RobotId = RobotId;
    }

    /**
     * Get 指令及指令参数数组。 
     * @return SyncRobotCommands 指令及指令参数数组。
     */
    public SyncRobotCommand [] getSyncRobotCommands() {
        return this.SyncRobotCommands;
    }

    /**
     * Set 指令及指令参数数组。
     * @param SyncRobotCommands 指令及指令参数数组。
     */
    public void setSyncRobotCommands(SyncRobotCommand [] SyncRobotCommands) {
        this.SyncRobotCommands = SyncRobotCommands;
    }

    public SyncKTVRobotCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncKTVRobotCommandRequest(SyncKTVRobotCommandRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.RobotId != null) {
            this.RobotId = new String(source.RobotId);
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
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "RobotId", this.RobotId);
        this.setParamArrayObj(map, prefix + "SyncRobotCommands.", this.SyncRobotCommands);

    }
}

