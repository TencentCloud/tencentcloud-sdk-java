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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallbackURL extends AbstractModel {

    /**
    * <p>图片回调地址</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Token</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * <p>是否开启</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
     * Get <p>图片回调地址</p> 
     * @return Url <p>图片回调地址</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>图片回调地址</p>
     * @param Url <p>图片回调地址</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Token</p> 
     * @return Token <p>Token</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>Token</p>
     * @param Token <p>Token</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get <p>是否开启</p> 
     * @return Enable <p>是否开启</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否开启</p>
     * @param Enable <p>是否开启</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public CallbackURL() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallbackURL(CallbackURL source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

