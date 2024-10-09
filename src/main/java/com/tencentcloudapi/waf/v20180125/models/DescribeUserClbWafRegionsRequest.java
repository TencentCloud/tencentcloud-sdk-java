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

public class DescribeUserClbWafRegionsRequest extends AbstractModel {

    /**
    * 流量来源，不填默认clb。clb：负载均衡器，tsegw：云原生API网关，scf：云函数，apisix：腾讯云上其他网关
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
     * Get 流量来源，不填默认clb。clb：负载均衡器，tsegw：云原生API网关，scf：云函数，apisix：腾讯云上其他网关 
     * @return AlbType 流量来源，不填默认clb。clb：负载均衡器，tsegw：云原生API网关，scf：云函数，apisix：腾讯云上其他网关
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set 流量来源，不填默认clb。clb：负载均衡器，tsegw：云原生API网关，scf：云函数，apisix：腾讯云上其他网关
     * @param AlbType 流量来源，不填默认clb。clb：负载均衡器，tsegw：云原生API网关，scf：云函数，apisix：腾讯云上其他网关
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    public DescribeUserClbWafRegionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserClbWafRegionsRequest(DescribeUserClbWafRegionsRequest source) {
        if (source.AlbType != null) {
            this.AlbType = new String(source.AlbType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlbType", this.AlbType);

    }
}

