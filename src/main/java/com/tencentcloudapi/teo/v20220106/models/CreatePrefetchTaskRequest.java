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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePrefetchTaskRequest extends AbstractModel{

    /**
    * Zone ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 要预热的资源列表，每个元素格式类似如下:
http://www.example.com/example.txt
    */
    @SerializedName("Targets")
    @Expose
    private String [] Targets;

    /**
    * 是否对url进行encode
若内容含有非 ASCII 字符集的字符，请开启此开关，编码转换（编码规则遵循 RFC3986）
    */
    @SerializedName("EncodeUrl")
    @Expose
    private Boolean EncodeUrl;

    /**
    * 附带的http头部信息
    */
    @SerializedName("Headers")
    @Expose
    private Header [] Headers;

    /**
     * Get Zone ID 
     * @return ZoneId Zone ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID
     * @param ZoneId Zone ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 要预热的资源列表，每个元素格式类似如下:
http://www.example.com/example.txt 
     * @return Targets 要预热的资源列表，每个元素格式类似如下:
http://www.example.com/example.txt
     */
    public String [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 要预热的资源列表，每个元素格式类似如下:
http://www.example.com/example.txt
     * @param Targets 要预热的资源列表，每个元素格式类似如下:
http://www.example.com/example.txt
     */
    public void setTargets(String [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get 是否对url进行encode
若内容含有非 ASCII 字符集的字符，请开启此开关，编码转换（编码规则遵循 RFC3986） 
     * @return EncodeUrl 是否对url进行encode
若内容含有非 ASCII 字符集的字符，请开启此开关，编码转换（编码规则遵循 RFC3986）
     */
    public Boolean getEncodeUrl() {
        return this.EncodeUrl;
    }

    /**
     * Set 是否对url进行encode
若内容含有非 ASCII 字符集的字符，请开启此开关，编码转换（编码规则遵循 RFC3986）
     * @param EncodeUrl 是否对url进行encode
若内容含有非 ASCII 字符集的字符，请开启此开关，编码转换（编码规则遵循 RFC3986）
     */
    public void setEncodeUrl(Boolean EncodeUrl) {
        this.EncodeUrl = EncodeUrl;
    }

    /**
     * Get 附带的http头部信息 
     * @return Headers 附带的http头部信息
     */
    public Header [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 附带的http头部信息
     * @param Headers 附带的http头部信息
     */
    public void setHeaders(Header [] Headers) {
        this.Headers = Headers;
    }

    public CreatePrefetchTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrefetchTaskRequest(CreatePrefetchTaskRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Targets != null) {
            this.Targets = new String[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new String(source.Targets[i]);
            }
        }
        if (source.EncodeUrl != null) {
            this.EncodeUrl = new Boolean(source.EncodeUrl);
        }
        if (source.Headers != null) {
            this.Headers = new Header[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new Header(source.Headers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "EncodeUrl", this.EncodeUrl);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);

    }
}

