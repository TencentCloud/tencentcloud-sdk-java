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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NsVerification extends AbstractModel{

    /**
    * NS 接入时，分配给用户的 DNS 服务器地址，需要将域名的 NameServer 切换至该地址。
    */
    @SerializedName("NameServers")
    @Expose
    private String [] NameServers;

    /**
     * Get NS 接入时，分配给用户的 DNS 服务器地址，需要将域名的 NameServer 切换至该地址。 
     * @return NameServers NS 接入时，分配给用户的 DNS 服务器地址，需要将域名的 NameServer 切换至该地址。
     */
    public String [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set NS 接入时，分配给用户的 DNS 服务器地址，需要将域名的 NameServer 切换至该地址。
     * @param NameServers NS 接入时，分配给用户的 DNS 服务器地址，需要将域名的 NameServer 切换至该地址。
     */
    public void setNameServers(String [] NameServers) {
        this.NameServers = NameServers;
    }

    public NsVerification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NsVerification(NsVerification source) {
        if (source.NameServers != null) {
            this.NameServers = new String[source.NameServers.length];
            for (int i = 0; i < source.NameServers.length; i++) {
                this.NameServers[i] = new String(source.NameServers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NameServers.", this.NameServers);

    }
}

