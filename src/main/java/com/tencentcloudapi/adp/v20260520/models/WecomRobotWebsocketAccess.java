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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WecomRobotWebsocketAccess extends AbstractModel {

    /**
    * <p>绑定类型：1-扫码绑定，2-填写表单绑定</p>
    */
    @SerializedName("BindType")
    @Expose
    private Long BindType;

    /**
    * <p>企微机器人BotId</p>
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * <p>企微机器人BotSecret</p>
    */
    @SerializedName("BotSecret")
    @Expose
    private String BotSecret;

    /**
     * Get <p>绑定类型：1-扫码绑定，2-填写表单绑定</p> 
     * @return BindType <p>绑定类型：1-扫码绑定，2-填写表单绑定</p>
     */
    public Long getBindType() {
        return this.BindType;
    }

    /**
     * Set <p>绑定类型：1-扫码绑定，2-填写表单绑定</p>
     * @param BindType <p>绑定类型：1-扫码绑定，2-填写表单绑定</p>
     */
    public void setBindType(Long BindType) {
        this.BindType = BindType;
    }

    /**
     * Get <p>企微机器人BotId</p> 
     * @return BotId <p>企微机器人BotId</p>
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * Set <p>企微机器人BotId</p>
     * @param BotId <p>企微机器人BotId</p>
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * Get <p>企微机器人BotSecret</p> 
     * @return BotSecret <p>企微机器人BotSecret</p>
     */
    public String getBotSecret() {
        return this.BotSecret;
    }

    /**
     * Set <p>企微机器人BotSecret</p>
     * @param BotSecret <p>企微机器人BotSecret</p>
     */
    public void setBotSecret(String BotSecret) {
        this.BotSecret = BotSecret;
    }

    public WecomRobotWebsocketAccess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WecomRobotWebsocketAccess(WecomRobotWebsocketAccess source) {
        if (source.BindType != null) {
            this.BindType = new Long(source.BindType);
        }
        if (source.BotId != null) {
            this.BotId = new String(source.BotId);
        }
        if (source.BotSecret != null) {
            this.BotSecret = new String(source.BotSecret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "BotSecret", this.BotSecret);

    }
}

