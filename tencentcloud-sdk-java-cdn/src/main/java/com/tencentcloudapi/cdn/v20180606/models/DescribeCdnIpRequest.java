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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCdnIpRequest extends AbstractModel{

    /**
    * 需要查询的 IP 列表
    */
    @SerializedName("Ips")
    @Expose
    private String [] Ips;

    /**
     * Get 需要查询的 IP 列表 
     * @return Ips 需要查询的 IP 列表
     */
    public String [] getIps() {
        return this.Ips;
    }

    /**
     * Set 需要查询的 IP 列表
     * @param Ips 需要查询的 IP 列表
     */
    public void setIps(String [] Ips) {
        this.Ips = Ips;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ips.", this.Ips);

    }
}

