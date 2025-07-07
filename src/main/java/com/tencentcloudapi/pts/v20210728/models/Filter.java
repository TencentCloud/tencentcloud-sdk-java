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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * 等于：0，不等于：1
    */
    @SerializedName("Operator")
    @Expose
    private Long Operator;

    /**
    * 标签名，可选值包括：
1. method，请求方法名；
2. proto：协议名；
3. service：服务名；
4. status：响应状态码；
5. result：响应详情；
6. check：检查名。
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * 标签值：
1. method：请求方法名，以 http 协议为例，method 为 GET、POST、PUT 等；
2. proto：协议名，以 http 协议为例，proto 为 HTTP/1.1、HTTP/2 等；
3. service：服务名，以 http 协议为例，service 为请求 url，如 http://httpbin.org/get 等；
4. status：响应状态码，以 http 协议为例，状态码包括 200、404、500 等；
5. result：响应详情，通过 result 判断请求成功或失败；请求正常，result 标签值为 ok；请求失败，result 标签携带错误码和描述；
6. check：检查名，标签值为用户设置的检查点名称。
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
     * Get 等于：0，不等于：1 
     * @return Operator 等于：0，不等于：1
     */
    public Long getOperator() {
        return this.Operator;
    }

    /**
     * Set 等于：0，不等于：1
     * @param Operator 等于：0，不等于：1
     */
    public void setOperator(Long Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 标签名，可选值包括：
1. method，请求方法名；
2. proto：协议名；
3. service：服务名；
4. status：响应状态码；
5. result：响应详情；
6. check：检查名。 
     * @return LabelName 标签名，可选值包括：
1. method，请求方法名；
2. proto：协议名；
3. service：服务名；
4. status：响应状态码；
5. result：响应详情；
6. check：检查名。
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set 标签名，可选值包括：
1. method，请求方法名；
2. proto：协议名；
3. service：服务名；
4. status：响应状态码；
5. result：响应详情；
6. check：检查名。
     * @param LabelName 标签名，可选值包括：
1. method，请求方法名；
2. proto：协议名；
3. service：服务名；
4. status：响应状态码；
5. result：响应详情；
6. check：检查名。
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get 标签值：
1. method：请求方法名，以 http 协议为例，method 为 GET、POST、PUT 等；
2. proto：协议名，以 http 协议为例，proto 为 HTTP/1.1、HTTP/2 等；
3. service：服务名，以 http 协议为例，service 为请求 url，如 http://httpbin.org/get 等；
4. status：响应状态码，以 http 协议为例，状态码包括 200、404、500 等；
5. result：响应详情，通过 result 判断请求成功或失败；请求正常，result 标签值为 ok；请求失败，result 标签携带错误码和描述；
6. check：检查名，标签值为用户设置的检查点名称。 
     * @return LabelValue 标签值：
1. method：请求方法名，以 http 协议为例，method 为 GET、POST、PUT 等；
2. proto：协议名，以 http 协议为例，proto 为 HTTP/1.1、HTTP/2 等；
3. service：服务名，以 http 协议为例，service 为请求 url，如 http://httpbin.org/get 等；
4. status：响应状态码，以 http 协议为例，状态码包括 200、404、500 等；
5. result：响应详情，通过 result 判断请求成功或失败；请求正常，result 标签值为 ok；请求失败，result 标签携带错误码和描述；
6. check：检查名，标签值为用户设置的检查点名称。
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set 标签值：
1. method：请求方法名，以 http 协议为例，method 为 GET、POST、PUT 等；
2. proto：协议名，以 http 协议为例，proto 为 HTTP/1.1、HTTP/2 等；
3. service：服务名，以 http 协议为例，service 为请求 url，如 http://httpbin.org/get 等；
4. status：响应状态码，以 http 协议为例，状态码包括 200、404、500 等；
5. result：响应详情，通过 result 判断请求成功或失败；请求正常，result 标签值为 ok；请求失败，result 标签携带错误码和描述；
6. check：检查名，标签值为用户设置的检查点名称。
     * @param LabelValue 标签值：
1. method：请求方法名，以 http 协议为例，method 为 GET、POST、PUT 等；
2. proto：协议名，以 http 协议为例，proto 为 HTTP/1.1、HTTP/2 等；
3. service：服务名，以 http 协议为例，service 为请求 url，如 http://httpbin.org/get 等；
4. status：响应状态码，以 http 协议为例，状态码包括 200、404、500 等；
5. result：响应详情，通过 result 判断请求成功或失败；请求正常，result 标签值为 ok；请求失败，result 标签携带错误码和描述；
6. check：检查名，标签值为用户设置的检查点名称。
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Operator != null) {
            this.Operator = new Long(source.Operator);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);

    }
}

