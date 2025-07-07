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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientInfo extends AbstractModel {

    /**
    * 登录的端类型，"Web"表示web工作台，"WeChatMiniProgram"表示微信小程序
    */
    @SerializedName("ClientType")
    @Expose
    private String ClientType;

    /**
    * 当前登录的端是否在前台。若登录的端是Web，则该值为true；若登录的端是WeChatMiniProgram，true表示打开着微信小程序，false表示微信小程序退到后台
    */
    @SerializedName("IsConnected")
    @Expose
    private Boolean IsConnected;

    /**
     * Get 登录的端类型，"Web"表示web工作台，"WeChatMiniProgram"表示微信小程序 
     * @return ClientType 登录的端类型，"Web"表示web工作台，"WeChatMiniProgram"表示微信小程序
     */
    public String getClientType() {
        return this.ClientType;
    }

    /**
     * Set 登录的端类型，"Web"表示web工作台，"WeChatMiniProgram"表示微信小程序
     * @param ClientType 登录的端类型，"Web"表示web工作台，"WeChatMiniProgram"表示微信小程序
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get 当前登录的端是否在前台。若登录的端是Web，则该值为true；若登录的端是WeChatMiniProgram，true表示打开着微信小程序，false表示微信小程序退到后台 
     * @return IsConnected 当前登录的端是否在前台。若登录的端是Web，则该值为true；若登录的端是WeChatMiniProgram，true表示打开着微信小程序，false表示微信小程序退到后台
     */
    public Boolean getIsConnected() {
        return this.IsConnected;
    }

    /**
     * Set 当前登录的端是否在前台。若登录的端是Web，则该值为true；若登录的端是WeChatMiniProgram，true表示打开着微信小程序，false表示微信小程序退到后台
     * @param IsConnected 当前登录的端是否在前台。若登录的端是Web，则该值为true；若登录的端是WeChatMiniProgram，true表示打开着微信小程序，false表示微信小程序退到后台
     */
    public void setIsConnected(Boolean IsConnected) {
        this.IsConnected = IsConnected;
    }

    public ClientInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientInfo(ClientInfo source) {
        if (source.ClientType != null) {
            this.ClientType = new String(source.ClientType);
        }
        if (source.IsConnected != null) {
            this.IsConnected = new Boolean(source.IsConnected);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientType", this.ClientType);
        this.setParamSimple(map, prefix + "IsConnected", this.IsConnected);

    }
}

