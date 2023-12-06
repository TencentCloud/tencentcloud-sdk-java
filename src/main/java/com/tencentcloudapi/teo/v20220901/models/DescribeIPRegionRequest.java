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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIPRegionRequest extends AbstractModel {

    /**
    * 待查询的 IP 列表，支持 IPV4 和 IPV6，最大可查询 100 条。
    */
    @SerializedName("IPs")
    @Expose
    private String [] IPs;

    /**
     * Get 待查询的 IP 列表，支持 IPV4 和 IPV6，最大可查询 100 条。 
     * @return IPs 待查询的 IP 列表，支持 IPV4 和 IPV6，最大可查询 100 条。
     */
    public String [] getIPs() {
        return this.IPs;
    }

    /**
     * Set 待查询的 IP 列表，支持 IPV4 和 IPV6，最大可查询 100 条。
     * @param IPs 待查询的 IP 列表，支持 IPV4 和 IPV6，最大可查询 100 条。
     */
    public void setIPs(String [] IPs) {
        this.IPs = IPs;
    }

    public DescribeIPRegionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIPRegionRequest(DescribeIPRegionRequest source) {
        if (source.IPs != null) {
            this.IPs = new String[source.IPs.length];
            for (int i = 0; i < source.IPs.length; i++) {
                this.IPs[i] = new String(source.IPs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IPs.", this.IPs);

    }
}

