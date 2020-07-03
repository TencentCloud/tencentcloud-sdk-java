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

public class CreateBotRequest extends AbstractModel{

    /**
    * 机器人名称
    */
    @SerializedName("BotName")
    @Expose
    private String BotName;

    /**
    * 机器人中文名称
    */
    @SerializedName("BotCnName")
    @Expose
    private String BotCnName;

    /**
     * Get 机器人名称 
     * @return BotName 机器人名称
     */
    public String getBotName() {
        return this.BotName;
    }

    /**
     * Set 机器人名称
     * @param BotName 机器人名称
     */
    public void setBotName(String BotName) {
        this.BotName = BotName;
    }

    /**
     * Get 机器人中文名称 
     * @return BotCnName 机器人中文名称
     */
    public String getBotCnName() {
        return this.BotCnName;
    }

    /**
     * Set 机器人中文名称
     * @param BotCnName 机器人中文名称
     */
    public void setBotCnName(String BotCnName) {
        this.BotCnName = BotCnName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotName", this.BotName);
        this.setParamSimple(map, prefix + "BotCnName", this.BotCnName);

    }
}

