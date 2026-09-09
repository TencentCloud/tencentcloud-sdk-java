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

public class LarkChannelConfig extends AbstractModel {

    /**
    * <p>飞书机器人AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>飞书机器人AppSecret</p>
    */
    @SerializedName("AppSecret")
    @Expose
    private String AppSecret;

    /**
     * Get <p>飞书机器人AppId</p> 
     * @return AppId <p>飞书机器人AppId</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>飞书机器人AppId</p>
     * @param AppId <p>飞书机器人AppId</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>飞书机器人AppSecret</p> 
     * @return AppSecret <p>飞书机器人AppSecret</p>
     */
    public String getAppSecret() {
        return this.AppSecret;
    }

    /**
     * Set <p>飞书机器人AppSecret</p>
     * @param AppSecret <p>飞书机器人AppSecret</p>
     */
    public void setAppSecret(String AppSecret) {
        this.AppSecret = AppSecret;
    }

    public LarkChannelConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LarkChannelConfig(LarkChannelConfig source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppSecret != null) {
            this.AppSecret = new String(source.AppSecret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppSecret", this.AppSecret);

    }
}

