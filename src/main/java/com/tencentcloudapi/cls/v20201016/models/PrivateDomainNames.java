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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrivateDomainNames extends AbstractModel {

    /**
    * 域名地址
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * ip地址
    */
    @SerializedName("IpAddr")
    @Expose
    private String IpAddr;

    /**
     * Get 域名地址 
     * @return DomainName 域名地址
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 域名地址
     * @param DomainName 域名地址
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get ip地址 
     * @return IpAddr ip地址
     */
    public String getIpAddr() {
        return this.IpAddr;
    }

    /**
     * Set ip地址
     * @param IpAddr ip地址
     */
    public void setIpAddr(String IpAddr) {
        this.IpAddr = IpAddr;
    }

    public PrivateDomainNames() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateDomainNames(PrivateDomainNames source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.IpAddr != null) {
            this.IpAddr = new String(source.IpAddr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "IpAddr", this.IpAddr);

    }
}

