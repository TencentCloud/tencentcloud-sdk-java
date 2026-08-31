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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Account extends AbstractModel {

    /**
    * 账号名称
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 账号的主机地址
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get 账号名称 
     * @return User 账号名称
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 账号名称
     * @param User 账号名称
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 账号的主机地址 
     * @return Host 账号的主机地址
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 账号的主机地址
     * @param Host 账号的主机地址
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public Account() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Account(Account source) {
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

