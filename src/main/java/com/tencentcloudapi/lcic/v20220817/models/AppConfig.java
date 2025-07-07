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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppConfig extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 应用状态 1正常 2停用
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 1试用 2轻量版 3标准版 4旗舰版
    */
    @SerializedName("AppVersion")
    @Expose
    private Long AppVersion;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 回调
    */
    @SerializedName("Callback")
    @Expose
    private String Callback;

    /**
    * 回调Key
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 应用名称 
     * @return AppName 应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称
     * @param AppName 应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 应用状态 1正常 2停用 
     * @return State 应用状态 1正常 2停用
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 应用状态 1正常 2停用
     * @param State 应用状态 1正常 2停用
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 1试用 2轻量版 3标准版 4旗舰版 
     * @return AppVersion 1试用 2轻量版 3标准版 4旗舰版
     */
    public Long getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set 1试用 2轻量版 3标准版 4旗舰版
     * @param AppVersion 1试用 2轻量版 3标准版 4旗舰版
     */
    public void setAppVersion(Long AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 回调 
     * @return Callback 回调
     */
    public String getCallback() {
        return this.Callback;
    }

    /**
     * Set 回调
     * @param Callback 回调
     */
    public void setCallback(String Callback) {
        this.Callback = Callback;
    }

    /**
     * Get 回调Key 
     * @return CallbackKey 回调Key
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set 回调Key
     * @param CallbackKey 回调Key
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

    public AppConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppConfig(AppConfig source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new Long(source.AppVersion);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.Callback != null) {
            this.Callback = new String(source.Callback);
        }
        if (source.CallbackKey != null) {
            this.CallbackKey = new String(source.CallbackKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "Callback", this.Callback);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);

    }
}

