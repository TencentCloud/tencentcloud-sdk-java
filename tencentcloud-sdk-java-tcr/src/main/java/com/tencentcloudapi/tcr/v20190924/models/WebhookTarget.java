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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebhookTarget extends AbstractModel{

    /**
    * 目标地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 自定义 Headers
    */
    @SerializedName("Headers")
    @Expose
    private Header [] Headers;

    /**
     * Get 目标地址 
     * @return Address 目标地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 目标地址
     * @param Address 目标地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 自定义 Headers 
     * @return Headers 自定义 Headers
     */
    public Header [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 自定义 Headers
     * @param Headers 自定义 Headers
     */
    public void setHeaders(Header [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);

    }
}

