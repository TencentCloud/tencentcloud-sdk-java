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
    * <p>账号名，可输入1 - 32个字符。</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>账号的主机。</p><p>IP 形式，支持填入%。</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get <p>账号名，可输入1 - 32个字符。</p> 
     * @return User <p>账号名，可输入1 - 32个字符。</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>账号名，可输入1 - 32个字符。</p>
     * @param User <p>账号名，可输入1 - 32个字符。</p>
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>账号的主机。</p><p>IP 形式，支持填入%。</p> 
     * @return Host <p>账号的主机。</p><p>IP 形式，支持填入%。</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>账号的主机。</p><p>IP 形式，支持填入%。</p>
     * @param Host <p>账号的主机。</p><p>IP 形式，支持填入%。</p>
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

