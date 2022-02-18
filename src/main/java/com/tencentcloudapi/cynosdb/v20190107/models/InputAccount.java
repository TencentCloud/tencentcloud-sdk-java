/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputAccount extends AbstractModel{

    /**
    * 账号
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 主机，默认‘%’
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get 账号 
     * @return AccountName 账号
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账号
     * @param AccountName 账号
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 主机，默认‘%’ 
     * @return Host 主机，默认‘%’
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机，默认‘%’
     * @param Host 主机，默认‘%’
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public InputAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputAccount(InputAccount source) {
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

