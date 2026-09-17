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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublicNetworkSegment extends AbstractModel {

    /**
    * 网段Cidr
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
    * 网关Ip
    */
    @SerializedName("Gateway")
    @Expose
    private String Gateway;

    /**
     * Get 网段Cidr 
     * @return Cidr 网段Cidr
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * Set 网段Cidr
     * @param Cidr 网段Cidr
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    /**
     * Get 网关Ip 
     * @return Gateway 网关Ip
     */
    public String getGateway() {
        return this.Gateway;
    }

    /**
     * Set 网关Ip
     * @param Gateway 网关Ip
     */
    public void setGateway(String Gateway) {
        this.Gateway = Gateway;
    }

    public PublicNetworkSegment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicNetworkSegment(PublicNetworkSegment source) {
        if (source.Cidr != null) {
            this.Cidr = new String(source.Cidr);
        }
        if (source.Gateway != null) {
            this.Gateway = new String(source.Gateway);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);
        this.setParamSimple(map, prefix + "Gateway", this.Gateway);

    }
}

