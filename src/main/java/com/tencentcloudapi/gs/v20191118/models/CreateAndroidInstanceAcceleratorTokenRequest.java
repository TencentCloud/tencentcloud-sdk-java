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

public class CreateAndroidInstanceAcceleratorTokenRequest extends AbstractModel {

    /**
    * 用户IP，用户客户端的公网IP，用于就近选择起始加速节点
    */
    @SerializedName("UserIP")
    @Expose
    private String UserIP;

    /**
    * 实例 ID 列表。每次请求的实例的上限为 500。
    */
    @SerializedName("AndroidInstanceIds")
    @Expose
    private String [] AndroidInstanceIds;

    /**
     * Get 用户IP，用户客户端的公网IP，用于就近选择起始加速节点 
     * @return UserIP 用户IP，用户客户端的公网IP，用于就近选择起始加速节点
     */
    public String getUserIP() {
        return this.UserIP;
    }

    /**
     * Set 用户IP，用户客户端的公网IP，用于就近选择起始加速节点
     * @param UserIP 用户IP，用户客户端的公网IP，用于就近选择起始加速节点
     */
    public void setUserIP(String UserIP) {
        this.UserIP = UserIP;
    }

    /**
     * Get 实例 ID 列表。每次请求的实例的上限为 500。 
     * @return AndroidInstanceIds 实例 ID 列表。每次请求的实例的上限为 500。
     */
    public String [] getAndroidInstanceIds() {
        return this.AndroidInstanceIds;
    }

    /**
     * Set 实例 ID 列表。每次请求的实例的上限为 500。
     * @param AndroidInstanceIds 实例 ID 列表。每次请求的实例的上限为 500。
     */
    public void setAndroidInstanceIds(String [] AndroidInstanceIds) {
        this.AndroidInstanceIds = AndroidInstanceIds;
    }

    public CreateAndroidInstanceAcceleratorTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndroidInstanceAcceleratorTokenRequest(CreateAndroidInstanceAcceleratorTokenRequest source) {
        if (source.UserIP != null) {
            this.UserIP = new String(source.UserIP);
        }
        if (source.AndroidInstanceIds != null) {
            this.AndroidInstanceIds = new String[source.AndroidInstanceIds.length];
            for (int i = 0; i < source.AndroidInstanceIds.length; i++) {
                this.AndroidInstanceIds[i] = new String(source.AndroidInstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserIP", this.UserIP);
        this.setParamArraySimple(map, prefix + "AndroidInstanceIds.", this.AndroidInstanceIds);

    }
}

