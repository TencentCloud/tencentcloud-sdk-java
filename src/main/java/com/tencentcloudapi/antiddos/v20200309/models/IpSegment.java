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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpSegment extends AbstractModel {

    /**
    * ip地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * ip掩码，如果为32位ip，填0
    */
    @SerializedName("Mask")
    @Expose
    private Long Mask;

    /**
     * Get ip地址 
     * @return Ip ip地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set ip地址
     * @param Ip ip地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get ip掩码，如果为32位ip，填0 
     * @return Mask ip掩码，如果为32位ip，填0
     */
    public Long getMask() {
        return this.Mask;
    }

    /**
     * Set ip掩码，如果为32位ip，填0
     * @param Mask ip掩码，如果为32位ip，填0
     */
    public void setMask(Long Mask) {
        this.Mask = Mask;
    }

    public IpSegment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpSegment(IpSegment source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Mask != null) {
            this.Mask = new Long(source.Mask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Mask", this.Mask);

    }
}

