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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFwGroupIdNamesRequest extends AbstractModel {

    /**
    * <p>Ip版本，0：IPv4，1：IPv6，默认为IPv4</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
     * Get <p>Ip版本，0：IPv4，1：IPv6，默认为IPv4</p> 
     * @return IpVersion <p>Ip版本，0：IPv4，1：IPv6，默认为IPv4</p>
     */
    public Long getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set <p>Ip版本，0：IPv4，1：IPv6，默认为IPv4</p>
     * @param IpVersion <p>Ip版本，0：IPv4，1：IPv6，默认为IPv4</p>
     */
    public void setIpVersion(Long IpVersion) {
        this.IpVersion = IpVersion;
    }

    public DescribeFwGroupIdNamesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFwGroupIdNamesRequest(DescribeFwGroupIdNamesRequest source) {
        if (source.IpVersion != null) {
            this.IpVersion = new Long(source.IpVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);

    }
}

