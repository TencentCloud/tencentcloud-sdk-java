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

public class SecClientIp extends AbstractModel{

    /**
    * 客户端ip。
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 最大qps。
    */
    @SerializedName("RequestMaxQps")
    @Expose
    private Long RequestMaxQps;

    /**
    * 请求数。
    */
    @SerializedName("RequestNum")
    @Expose
    private Long RequestNum;

    /**
     * Get 客户端ip。 
     * @return ClientIp 客户端ip。
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 客户端ip。
     * @param ClientIp 客户端ip。
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 最大qps。 
     * @return RequestMaxQps 最大qps。
     */
    public Long getRequestMaxQps() {
        return this.RequestMaxQps;
    }

    /**
     * Set 最大qps。
     * @param RequestMaxQps 最大qps。
     */
    public void setRequestMaxQps(Long RequestMaxQps) {
        this.RequestMaxQps = RequestMaxQps;
    }

    /**
     * Get 请求数。 
     * @return RequestNum 请求数。
     */
    public Long getRequestNum() {
        return this.RequestNum;
    }

    /**
     * Set 请求数。
     * @param RequestNum 请求数。
     */
    public void setRequestNum(Long RequestNum) {
        this.RequestNum = RequestNum;
    }

    public SecClientIp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecClientIp(SecClientIp source) {
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.RequestMaxQps != null) {
            this.RequestMaxQps = new Long(source.RequestMaxQps);
        }
        if (source.RequestNum != null) {
            this.RequestNum = new Long(source.RequestNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "RequestMaxQps", this.RequestMaxQps);
        this.setParamSimple(map, prefix + "RequestNum", this.RequestNum);

    }
}

