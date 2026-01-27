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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstallAndroidInstancesAppWithURLRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("AndroidInstanceIds")
    @Expose
    private String [] AndroidInstanceIds;

    /**
    * 安卓应用下载 URL
    */
    @SerializedName("AndroidAppURL")
    @Expose
    private String AndroidAppURL;

    /**
    * 安卓应用MD5码值（32位小写十六进制字符串）
    */
    @SerializedName("AndroidAppMD5")
    @Expose
    private String AndroidAppMD5;

    /**
     * Get 实例ID 
     * @return AndroidInstanceIds 实例ID
     */
    public String [] getAndroidInstanceIds() {
        return this.AndroidInstanceIds;
    }

    /**
     * Set 实例ID
     * @param AndroidInstanceIds 实例ID
     */
    public void setAndroidInstanceIds(String [] AndroidInstanceIds) {
        this.AndroidInstanceIds = AndroidInstanceIds;
    }

    /**
     * Get 安卓应用下载 URL 
     * @return AndroidAppURL 安卓应用下载 URL
     */
    public String getAndroidAppURL() {
        return this.AndroidAppURL;
    }

    /**
     * Set 安卓应用下载 URL
     * @param AndroidAppURL 安卓应用下载 URL
     */
    public void setAndroidAppURL(String AndroidAppURL) {
        this.AndroidAppURL = AndroidAppURL;
    }

    /**
     * Get 安卓应用MD5码值（32位小写十六进制字符串） 
     * @return AndroidAppMD5 安卓应用MD5码值（32位小写十六进制字符串）
     */
    public String getAndroidAppMD5() {
        return this.AndroidAppMD5;
    }

    /**
     * Set 安卓应用MD5码值（32位小写十六进制字符串）
     * @param AndroidAppMD5 安卓应用MD5码值（32位小写十六进制字符串）
     */
    public void setAndroidAppMD5(String AndroidAppMD5) {
        this.AndroidAppMD5 = AndroidAppMD5;
    }

    public InstallAndroidInstancesAppWithURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstallAndroidInstancesAppWithURLRequest(InstallAndroidInstancesAppWithURLRequest source) {
        if (source.AndroidInstanceIds != null) {
            this.AndroidInstanceIds = new String[source.AndroidInstanceIds.length];
            for (int i = 0; i < source.AndroidInstanceIds.length; i++) {
                this.AndroidInstanceIds[i] = new String(source.AndroidInstanceIds[i]);
            }
        }
        if (source.AndroidAppURL != null) {
            this.AndroidAppURL = new String(source.AndroidAppURL);
        }
        if (source.AndroidAppMD5 != null) {
            this.AndroidAppMD5 = new String(source.AndroidAppMD5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AndroidInstanceIds.", this.AndroidInstanceIds);
        this.setParamSimple(map, prefix + "AndroidAppURL", this.AndroidAppURL);
        this.setParamSimple(map, prefix + "AndroidAppMD5", this.AndroidAppMD5);

    }
}

