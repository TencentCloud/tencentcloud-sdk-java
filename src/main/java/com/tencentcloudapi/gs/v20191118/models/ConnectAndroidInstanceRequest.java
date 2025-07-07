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

public class ConnectAndroidInstanceRequest extends AbstractModel {

    /**
    * 用户Session信息
    */
    @SerializedName("ClientSession")
    @Expose
    private String ClientSession;

    /**
    * 实例ID
    */
    @SerializedName("AndroidInstanceId")
    @Expose
    private String AndroidInstanceId;

    /**
    * 用户IP，用户客户端的公网IP，用于选择最佳网络链路
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
     * Get 用户Session信息 
     * @return ClientSession 用户Session信息
     */
    public String getClientSession() {
        return this.ClientSession;
    }

    /**
     * Set 用户Session信息
     * @param ClientSession 用户Session信息
     */
    public void setClientSession(String ClientSession) {
        this.ClientSession = ClientSession;
    }

    /**
     * Get 实例ID 
     * @return AndroidInstanceId 实例ID
     */
    public String getAndroidInstanceId() {
        return this.AndroidInstanceId;
    }

    /**
     * Set 实例ID
     * @param AndroidInstanceId 实例ID
     */
    public void setAndroidInstanceId(String AndroidInstanceId) {
        this.AndroidInstanceId = AndroidInstanceId;
    }

    /**
     * Get 用户IP，用户客户端的公网IP，用于选择最佳网络链路 
     * @return UserIp 用户IP，用户客户端的公网IP，用于选择最佳网络链路
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 用户IP，用户客户端的公网IP，用于选择最佳网络链路
     * @param UserIp 用户IP，用户客户端的公网IP，用于选择最佳网络链路
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    public ConnectAndroidInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectAndroidInstanceRequest(ConnectAndroidInstanceRequest source) {
        if (source.ClientSession != null) {
            this.ClientSession = new String(source.ClientSession);
        }
        if (source.AndroidInstanceId != null) {
            this.AndroidInstanceId = new String(source.AndroidInstanceId);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientSession", this.ClientSession);
        this.setParamSimple(map, prefix + "AndroidInstanceId", this.AndroidInstanceId);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);

    }
}

