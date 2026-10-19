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

public class AppIdentity extends AbstractModel {

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>应用名称</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>应用模式</p><p>枚举值：</p><ul><li>1： 标准模式</li><li>2： agent模式</li><li>3： 单工作流模式</li><li>4： ClawAgent模式</li></ul>
    */
    @SerializedName("AppMode")
    @Expose
    private Long AppMode;

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>应用名称</p> 
     * @return AppName <p>应用名称</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>应用名称</p>
     * @param AppName <p>应用名称</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>应用模式</p><p>枚举值：</p><ul><li>1： 标准模式</li><li>2： agent模式</li><li>3： 单工作流模式</li><li>4： ClawAgent模式</li></ul> 
     * @return AppMode <p>应用模式</p><p>枚举值：</p><ul><li>1： 标准模式</li><li>2： agent模式</li><li>3： 单工作流模式</li><li>4： ClawAgent模式</li></ul>
     */
    public Long getAppMode() {
        return this.AppMode;
    }

    /**
     * Set <p>应用模式</p><p>枚举值：</p><ul><li>1： 标准模式</li><li>2： agent模式</li><li>3： 单工作流模式</li><li>4： ClawAgent模式</li></ul>
     * @param AppMode <p>应用模式</p><p>枚举值：</p><ul><li>1： 标准模式</li><li>2： agent模式</li><li>3： 单工作流模式</li><li>4： ClawAgent模式</li></ul>
     */
    public void setAppMode(Long AppMode) {
        this.AppMode = AppMode;
    }

    public AppIdentity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppIdentity(AppIdentity source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AppMode != null) {
            this.AppMode = new Long(source.AppMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppMode", this.AppMode);

    }
}

