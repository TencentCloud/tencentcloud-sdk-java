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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TicketAuthInfo extends AbstractModel {

    /**
    * 授权用户
    */
    @SerializedName("AuthUser")
    @Expose
    private String AuthUser;

    /**
     * Get 授权用户 
     * @return AuthUser 授权用户
     */
    public String getAuthUser() {
        return this.AuthUser;
    }

    /**
     * Set 授权用户
     * @param AuthUser 授权用户
     */
    public void setAuthUser(String AuthUser) {
        this.AuthUser = AuthUser;
    }

    public TicketAuthInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TicketAuthInfo(TicketAuthInfo source) {
        if (source.AuthUser != null) {
            this.AuthUser = new String(source.AuthUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthUser", this.AuthUser);

    }
}

