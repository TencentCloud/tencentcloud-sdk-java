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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DnsServers extends AbstractModel {

    /**
    * 主DNS配置
    */
    @SerializedName("PrimaryDns")
    @Expose
    private String PrimaryDns;

    /**
    * 备DNS配置
    */
    @SerializedName("SecondaryDns")
    @Expose
    private String SecondaryDns;

    /**
     * Get 主DNS配置 
     * @return PrimaryDns 主DNS配置
     */
    public String getPrimaryDns() {
        return this.PrimaryDns;
    }

    /**
     * Set 主DNS配置
     * @param PrimaryDns 主DNS配置
     */
    public void setPrimaryDns(String PrimaryDns) {
        this.PrimaryDns = PrimaryDns;
    }

    /**
     * Get 备DNS配置 
     * @return SecondaryDns 备DNS配置
     */
    public String getSecondaryDns() {
        return this.SecondaryDns;
    }

    /**
     * Set 备DNS配置
     * @param SecondaryDns 备DNS配置
     */
    public void setSecondaryDns(String SecondaryDns) {
        this.SecondaryDns = SecondaryDns;
    }

    public DnsServers() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DnsServers(DnsServers source) {
        if (source.PrimaryDns != null) {
            this.PrimaryDns = new String(source.PrimaryDns);
        }
        if (source.SecondaryDns != null) {
            this.SecondaryDns = new String(source.SecondaryDns);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrimaryDns", this.PrimaryDns);
        this.setParamSimple(map, prefix + "SecondaryDns", this.SecondaryDns);

    }
}

