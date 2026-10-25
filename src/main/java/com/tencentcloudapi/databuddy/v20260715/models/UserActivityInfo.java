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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserActivityInfo extends AbstractModel {

    /**
    * 是否收藏
- true  是
- false 否
    */
    @SerializedName("IsFavorite")
    @Expose
    private Boolean IsFavorite;

    /**
    * 上次查看时间
    */
    @SerializedName("LastViewTime")
    @Expose
    private String LastViewTime;

    /**
     * Get 是否收藏
- true  是
- false 否 
     * @return IsFavorite 是否收藏
- true  是
- false 否
     */
    public Boolean getIsFavorite() {
        return this.IsFavorite;
    }

    /**
     * Set 是否收藏
- true  是
- false 否
     * @param IsFavorite 是否收藏
- true  是
- false 否
     */
    public void setIsFavorite(Boolean IsFavorite) {
        this.IsFavorite = IsFavorite;
    }

    /**
     * Get 上次查看时间 
     * @return LastViewTime 上次查看时间
     */
    public String getLastViewTime() {
        return this.LastViewTime;
    }

    /**
     * Set 上次查看时间
     * @param LastViewTime 上次查看时间
     */
    public void setLastViewTime(String LastViewTime) {
        this.LastViewTime = LastViewTime;
    }

    public UserActivityInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserActivityInfo(UserActivityInfo source) {
        if (source.IsFavorite != null) {
            this.IsFavorite = new Boolean(source.IsFavorite);
        }
        if (source.LastViewTime != null) {
            this.LastViewTime = new String(source.LastViewTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsFavorite", this.IsFavorite);
        this.setParamSimple(map, prefix + "LastViewTime", this.LastViewTime);

    }
}

