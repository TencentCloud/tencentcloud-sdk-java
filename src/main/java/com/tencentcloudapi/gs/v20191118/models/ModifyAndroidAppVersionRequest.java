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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAndroidAppVersionRequest extends AbstractModel {

    /**
    * 安卓应用 Id
    */
    @SerializedName("AndroidAppId")
    @Expose
    private String AndroidAppId;

    /**
    * 安卓应用版本 Id
    */
    @SerializedName("AndroidAppVersion")
    @Expose
    private String AndroidAppVersion;

    /**
    * 安卓应用版本名称
    */
    @SerializedName("AndroidAppVersionName")
    @Expose
    private String AndroidAppVersionName;

    /**
    * shell 命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
     * Get 安卓应用 Id 
     * @return AndroidAppId 安卓应用 Id
     */
    public String getAndroidAppId() {
        return this.AndroidAppId;
    }

    /**
     * Set 安卓应用 Id
     * @param AndroidAppId 安卓应用 Id
     */
    public void setAndroidAppId(String AndroidAppId) {
        this.AndroidAppId = AndroidAppId;
    }

    /**
     * Get 安卓应用版本 Id 
     * @return AndroidAppVersion 安卓应用版本 Id
     */
    public String getAndroidAppVersion() {
        return this.AndroidAppVersion;
    }

    /**
     * Set 安卓应用版本 Id
     * @param AndroidAppVersion 安卓应用版本 Id
     */
    public void setAndroidAppVersion(String AndroidAppVersion) {
        this.AndroidAppVersion = AndroidAppVersion;
    }

    /**
     * Get 安卓应用版本名称 
     * @return AndroidAppVersionName 安卓应用版本名称
     */
    public String getAndroidAppVersionName() {
        return this.AndroidAppVersionName;
    }

    /**
     * Set 安卓应用版本名称
     * @param AndroidAppVersionName 安卓应用版本名称
     */
    public void setAndroidAppVersionName(String AndroidAppVersionName) {
        this.AndroidAppVersionName = AndroidAppVersionName;
    }

    /**
     * Get shell 命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效） 
     * @return Command shell 命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set shell 命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）
     * @param Command shell 命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    public ModifyAndroidAppVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAndroidAppVersionRequest(ModifyAndroidAppVersionRequest source) {
        if (source.AndroidAppId != null) {
            this.AndroidAppId = new String(source.AndroidAppId);
        }
        if (source.AndroidAppVersion != null) {
            this.AndroidAppVersion = new String(source.AndroidAppVersion);
        }
        if (source.AndroidAppVersionName != null) {
            this.AndroidAppVersionName = new String(source.AndroidAppVersionName);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidAppId", this.AndroidAppId);
        this.setParamSimple(map, prefix + "AndroidAppVersion", this.AndroidAppVersion);
        this.setParamSimple(map, prefix + "AndroidAppVersionName", this.AndroidAppVersionName);
        this.setParamSimple(map, prefix + "Command", this.Command);

    }
}

