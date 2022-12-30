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

public class IPWhitelist extends AbstractModel{

    /**
    * IPv4列表。
    */
    @SerializedName("IPv4")
    @Expose
    private String [] IPv4;

    /**
    * IPv6列表。
    */
    @SerializedName("IPv6")
    @Expose
    private String [] IPv6;

    /**
     * Get IPv4列表。 
     * @return IPv4 IPv4列表。
     */
    public String [] getIPv4() {
        return this.IPv4;
    }

    /**
     * Set IPv4列表。
     * @param IPv4 IPv4列表。
     */
    public void setIPv4(String [] IPv4) {
        this.IPv4 = IPv4;
    }

    /**
     * Get IPv6列表。 
     * @return IPv6 IPv6列表。
     */
    public String [] getIPv6() {
        return this.IPv6;
    }

    /**
     * Set IPv6列表。
     * @param IPv6 IPv6列表。
     */
    public void setIPv6(String [] IPv6) {
        this.IPv6 = IPv6;
    }

    public IPWhitelist() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPWhitelist(IPWhitelist source) {
        if (source.IPv4 != null) {
            this.IPv4 = new String[source.IPv4.length];
            for (int i = 0; i < source.IPv4.length; i++) {
                this.IPv4[i] = new String(source.IPv4[i]);
            }
        }
        if (source.IPv6 != null) {
            this.IPv6 = new String[source.IPv6.length];
            for (int i = 0; i < source.IPv6.length; i++) {
                this.IPv6[i] = new String(source.IPv6[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IPv4.", this.IPv4);
        this.setParamArraySimple(map, prefix + "IPv6.", this.IPv6);

    }
}

