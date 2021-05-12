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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenDBExtranetAccessRequest extends AbstractModel{

    /**
    * 待开放外网访问的实例ID。形如：dcdbt-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 是否IPv6，默认0
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
     * Get 待开放外网访问的实例ID。形如：dcdbt-ow728lmc。 
     * @return InstanceId 待开放外网访问的实例ID。形如：dcdbt-ow728lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 待开放外网访问的实例ID。形如：dcdbt-ow728lmc。
     * @param InstanceId 待开放外网访问的实例ID。形如：dcdbt-ow728lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 是否IPv6，默认0 
     * @return Ipv6Flag 是否IPv6，默认0
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set 是否IPv6，默认0
     * @param Ipv6Flag 是否IPv6，默认0
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    public OpenDBExtranetAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenDBExtranetAccessRequest(OpenDBExtranetAccessRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Long(source.Ipv6Flag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);

    }
}

