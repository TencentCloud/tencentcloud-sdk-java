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
package com.tencentcloudapi.tbp.v20190311.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetRequest extends AbstractModel{

    /**
    * 机器人标识
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * 子账户id，每个终端对应一个
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 机器人版本号。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
    */
    @SerializedName("BotVersion")
    @Expose
    private String BotVersion;

    /**
    * 机器人环境{dev:测试;release:线上}。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
    */
    @SerializedName("BotEnv")
    @Expose
    private String BotEnv;

    /**
     * Get 机器人标识 
     * @return BotId 机器人标识
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * Set 机器人标识
     * @param BotId 机器人标识
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * Get 子账户id，每个终端对应一个 
     * @return UserId 子账户id，每个终端对应一个
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 子账户id，每个终端对应一个
     * @param UserId 子账户id，每个终端对应一个
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 机器人版本号。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev 
     * @return BotVersion 机器人版本号。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
     */
    public String getBotVersion() {
        return this.BotVersion;
    }

    /**
     * Set 机器人版本号。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
     * @param BotVersion 机器人版本号。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
     */
    public void setBotVersion(String BotVersion) {
        this.BotVersion = BotVersion;
    }

    /**
     * Get 机器人环境{dev:测试;release:线上}。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev 
     * @return BotEnv 机器人环境{dev:测试;release:线上}。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
     */
    public String getBotEnv() {
        return this.BotEnv;
    }

    /**
     * Set 机器人环境{dev:测试;release:线上}。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
     * @param BotEnv 机器人环境{dev:测试;release:线上}。BotVersion/BotEnv二选一：二者均填，仅BotVersion有效；二者均不填，默认BotEnv=dev
     */
    public void setBotEnv(String BotEnv) {
        this.BotEnv = BotEnv;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "BotVersion", this.BotVersion);
        this.setParamSimple(map, prefix + "BotEnv", this.BotEnv);

    }
}

