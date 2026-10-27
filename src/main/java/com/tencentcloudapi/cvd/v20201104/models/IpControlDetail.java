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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpControlDetail extends AbstractModel {

    /**
    * <p>配置的IP。支持单IP和CIDR，暂不支持IP范围</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>IP的描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>配置的IP。支持单IP和CIDR，暂不支持IP范围</p> 
     * @return Ip <p>配置的IP。支持单IP和CIDR，暂不支持IP范围</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>配置的IP。支持单IP和CIDR，暂不支持IP范围</p>
     * @param Ip <p>配置的IP。支持单IP和CIDR，暂不支持IP范围</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>IP的描述</p> 
     * @return Description <p>IP的描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>IP的描述</p>
     * @param Description <p>IP的描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public IpControlDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpControlDetail(IpControlDetail source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

