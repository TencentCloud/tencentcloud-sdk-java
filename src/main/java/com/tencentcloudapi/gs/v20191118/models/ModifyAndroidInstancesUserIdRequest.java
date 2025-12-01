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

public class ModifyAndroidInstancesUserIdRequest extends AbstractModel {

    /**
    * 安卓实例 ID 列表
    */
    @SerializedName("AndroidInstanceIds")
    @Expose
    private String [] AndroidInstanceIds;

    /**
    * 用户 ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 有效时长。如果不填该字段，默认为永久。支持 s（秒）、m（分）、h（小时）、d（天）等单位，比如 12h 表示 12 小时，1h2m3s 表示一小时两分三秒
    */
    @SerializedName("ExpirationDuration")
    @Expose
    private String ExpirationDuration;

    /**
     * Get 安卓实例 ID 列表 
     * @return AndroidInstanceIds 安卓实例 ID 列表
     */
    public String [] getAndroidInstanceIds() {
        return this.AndroidInstanceIds;
    }

    /**
     * Set 安卓实例 ID 列表
     * @param AndroidInstanceIds 安卓实例 ID 列表
     */
    public void setAndroidInstanceIds(String [] AndroidInstanceIds) {
        this.AndroidInstanceIds = AndroidInstanceIds;
    }

    /**
     * Get 用户 ID 
     * @return UserId 用户 ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 ID
     * @param UserId 用户 ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 有效时长。如果不填该字段，默认为永久。支持 s（秒）、m（分）、h（小时）、d（天）等单位，比如 12h 表示 12 小时，1h2m3s 表示一小时两分三秒 
     * @return ExpirationDuration 有效时长。如果不填该字段，默认为永久。支持 s（秒）、m（分）、h（小时）、d（天）等单位，比如 12h 表示 12 小时，1h2m3s 表示一小时两分三秒
     */
    public String getExpirationDuration() {
        return this.ExpirationDuration;
    }

    /**
     * Set 有效时长。如果不填该字段，默认为永久。支持 s（秒）、m（分）、h（小时）、d（天）等单位，比如 12h 表示 12 小时，1h2m3s 表示一小时两分三秒
     * @param ExpirationDuration 有效时长。如果不填该字段，默认为永久。支持 s（秒）、m（分）、h（小时）、d（天）等单位，比如 12h 表示 12 小时，1h2m3s 表示一小时两分三秒
     */
    public void setExpirationDuration(String ExpirationDuration) {
        this.ExpirationDuration = ExpirationDuration;
    }

    public ModifyAndroidInstancesUserIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAndroidInstancesUserIdRequest(ModifyAndroidInstancesUserIdRequest source) {
        if (source.AndroidInstanceIds != null) {
            this.AndroidInstanceIds = new String[source.AndroidInstanceIds.length];
            for (int i = 0; i < source.AndroidInstanceIds.length; i++) {
                this.AndroidInstanceIds[i] = new String(source.AndroidInstanceIds[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.ExpirationDuration != null) {
            this.ExpirationDuration = new String(source.ExpirationDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AndroidInstanceIds.", this.AndroidInstanceIds);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "ExpirationDuration", this.ExpirationDuration);

    }
}

