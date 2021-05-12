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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotInfo extends AbstractModel{

    /**
    * 机器人ID
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * 机器人名称
    */
    @SerializedName("BotName")
    @Expose
    private String BotName;

    /**
    * 机器人状态。0-停用 1-启用 2-待审核
    */
    @SerializedName("BotStatus")
    @Expose
    private String BotStatus;

    /**
     * Get 机器人ID 
     * @return BotId 机器人ID
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * Set 机器人ID
     * @param BotId 机器人ID
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

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
     * Get 机器人状态。0-停用 1-启用 2-待审核 
     * @return BotStatus 机器人状态。0-停用 1-启用 2-待审核
     */
    public String getBotStatus() {
        return this.BotStatus;
    }

    /**
     * Set 机器人状态。0-停用 1-启用 2-待审核
     * @param BotStatus 机器人状态。0-停用 1-启用 2-待审核
     */
    public void setBotStatus(String BotStatus) {
        this.BotStatus = BotStatus;
    }

    public BotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotInfo(BotInfo source) {
        if (source.BotId != null) {
            this.BotId = new String(source.BotId);
        }
        if (source.BotName != null) {
            this.BotName = new String(source.BotName);
        }
        if (source.BotStatus != null) {
            this.BotStatus = new String(source.BotStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "BotName", this.BotName);
        this.setParamSimple(map, prefix + "BotStatus", this.BotStatus);

    }
}

