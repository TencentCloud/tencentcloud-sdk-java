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

public class ModifyAndroidAppRequest extends AbstractModel {

    /**
    * 安卓应用 Id
    */
    @SerializedName("AndroidAppId")
    @Expose
    private String AndroidAppId;

    /**
    * 安卓应用名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户 Id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

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
     * Get 安卓应用名称 
     * @return Name 安卓应用名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 安卓应用名称
     * @param Name 安卓应用名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户 Id 
     * @return UserId 用户 Id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 Id
     * @param UserId 用户 Id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public ModifyAndroidAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAndroidAppRequest(ModifyAndroidAppRequest source) {
        if (source.AndroidAppId != null) {
            this.AndroidAppId = new String(source.AndroidAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidAppId", this.AndroidAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

