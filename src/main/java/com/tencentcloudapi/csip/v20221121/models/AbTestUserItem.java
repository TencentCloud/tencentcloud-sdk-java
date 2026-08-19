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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbTestUserItem extends AbstractModel {

    /**
    * appId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 是否灰度用户
    */
    @SerializedName("IsAbTestUser")
    @Expose
    private Boolean IsAbTestUser;

    /**
     * Get appId 
     * @return AppId appId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appId
     * @param AppId appId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 是否灰度用户 
     * @return IsAbTestUser 是否灰度用户
     */
    public Boolean getIsAbTestUser() {
        return this.IsAbTestUser;
    }

    /**
     * Set 是否灰度用户
     * @param IsAbTestUser 是否灰度用户
     */
    public void setIsAbTestUser(Boolean IsAbTestUser) {
        this.IsAbTestUser = IsAbTestUser;
    }

    public AbTestUserItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbTestUserItem(AbTestUserItem source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.IsAbTestUser != null) {
            this.IsAbTestUser = new Boolean(source.IsAbTestUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "IsAbTestUser", this.IsAbTestUser);

    }
}

