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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePortsResponse extends AbstractModel {

    /**
    * http端口列表
    */
    @SerializedName("HttpPorts")
    @Expose
    private String [] HttpPorts;

    /**
    * https端口列表
    */
    @SerializedName("HttpsPorts")
    @Expose
    private String [] HttpsPorts;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get http端口列表 
     * @return HttpPorts http端口列表
     */
    public String [] getHttpPorts() {
        return this.HttpPorts;
    }

    /**
     * Set http端口列表
     * @param HttpPorts http端口列表
     */
    public void setHttpPorts(String [] HttpPorts) {
        this.HttpPorts = HttpPorts;
    }

    /**
     * Get https端口列表 
     * @return HttpsPorts https端口列表
     */
    public String [] getHttpsPorts() {
        return this.HttpsPorts;
    }

    /**
     * Set https端口列表
     * @param HttpsPorts https端口列表
     */
    public void setHttpsPorts(String [] HttpsPorts) {
        this.HttpsPorts = HttpsPorts;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePortsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePortsResponse(DescribePortsResponse source) {
        if (source.HttpPorts != null) {
            this.HttpPorts = new String[source.HttpPorts.length];
            for (int i = 0; i < source.HttpPorts.length; i++) {
                this.HttpPorts[i] = new String(source.HttpPorts[i]);
            }
        }
        if (source.HttpsPorts != null) {
            this.HttpsPorts = new String[source.HttpsPorts.length];
            for (int i = 0; i < source.HttpsPorts.length; i++) {
                this.HttpsPorts[i] = new String(source.HttpsPorts[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HttpPorts.", this.HttpPorts);
        this.setParamArraySimple(map, prefix + "HttpsPorts.", this.HttpsPorts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

