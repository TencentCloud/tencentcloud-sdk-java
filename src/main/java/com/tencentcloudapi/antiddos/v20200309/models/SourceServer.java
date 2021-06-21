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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceServer extends AbstractModel{

    /**
    * 源站的地址（IP或者域名）
    */
    @SerializedName("RealServer")
    @Expose
    private String RealServer;

    /**
    * 源站的地址类型，取值[
1(域名地址)
2(IP地址)
]
    */
    @SerializedName("RsType")
    @Expose
    private Long RsType;

    /**
    * 源站的回源权重，取值1~100
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get 源站的地址（IP或者域名） 
     * @return RealServer 源站的地址（IP或者域名）
     */
    public String getRealServer() {
        return this.RealServer;
    }

    /**
     * Set 源站的地址（IP或者域名）
     * @param RealServer 源站的地址（IP或者域名）
     */
    public void setRealServer(String RealServer) {
        this.RealServer = RealServer;
    }

    /**
     * Get 源站的地址类型，取值[
1(域名地址)
2(IP地址)
] 
     * @return RsType 源站的地址类型，取值[
1(域名地址)
2(IP地址)
]
     */
    public Long getRsType() {
        return this.RsType;
    }

    /**
     * Set 源站的地址类型，取值[
1(域名地址)
2(IP地址)
]
     * @param RsType 源站的地址类型，取值[
1(域名地址)
2(IP地址)
]
     */
    public void setRsType(Long RsType) {
        this.RsType = RsType;
    }

    /**
     * Get 源站的回源权重，取值1~100 
     * @return Weight 源站的回源权重，取值1~100
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 源站的回源权重，取值1~100
     * @param Weight 源站的回源权重，取值1~100
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public SourceServer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceServer(SourceServer source) {
        if (source.RealServer != null) {
            this.RealServer = new String(source.RealServer);
        }
        if (source.RsType != null) {
            this.RsType = new Long(source.RsType);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealServer", this.RealServer);
        this.setParamSimple(map, prefix + "RsType", this.RsType);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

