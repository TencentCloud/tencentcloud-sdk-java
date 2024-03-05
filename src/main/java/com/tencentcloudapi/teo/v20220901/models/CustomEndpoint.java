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

public class CustomEndpoint extends AbstractModel {

    /**
    * 实时日志投递的自定义 HTTP 接口地址，暂仅支持 HTTP/HTTPS 协议。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 填写自定义的 SecretId 用于生成加密签名，如果源站需要鉴权此参数必填。
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * 填写自定义的 SecretKey 用于生成加密签名，如果源站需要鉴权此参数必填。
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * 数据压缩类型，取值有: <li> gzip：使用 gzip 方式压缩。</li>不填表示不启用压缩。
    */
    @SerializedName("CompressType")
    @Expose
    private String CompressType;

    /**
    * POST 请求投递日志时，使用的应用层协议类型，取值有： 
<li>http：HTTP 协议；</li>
<li>https：HTTPS 协议。</li>如果不填默认根据填写的 URL 地址解析出协议类型。	
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 投递日志时携带的自定义请求头，注意 Content-Type、Accept-Encoding 不支持添加修改。
    */
    @SerializedName("Headers")
    @Expose
    private Header [] Headers;

    /**
     * Get 实时日志投递的自定义 HTTP 接口地址，暂仅支持 HTTP/HTTPS 协议。 
     * @return Url 实时日志投递的自定义 HTTP 接口地址，暂仅支持 HTTP/HTTPS 协议。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 实时日志投递的自定义 HTTP 接口地址，暂仅支持 HTTP/HTTPS 协议。
     * @param Url 实时日志投递的自定义 HTTP 接口地址，暂仅支持 HTTP/HTTPS 协议。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 填写自定义的 SecretId 用于生成加密签名，如果源站需要鉴权此参数必填。 
     * @return AccessId 填写自定义的 SecretId 用于生成加密签名，如果源站需要鉴权此参数必填。
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set 填写自定义的 SecretId 用于生成加密签名，如果源站需要鉴权此参数必填。
     * @param AccessId 填写自定义的 SecretId 用于生成加密签名，如果源站需要鉴权此参数必填。
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get 填写自定义的 SecretKey 用于生成加密签名，如果源站需要鉴权此参数必填。 
     * @return AccessKey 填写自定义的 SecretKey 用于生成加密签名，如果源站需要鉴权此参数必填。
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set 填写自定义的 SecretKey 用于生成加密签名，如果源站需要鉴权此参数必填。
     * @param AccessKey 填写自定义的 SecretKey 用于生成加密签名，如果源站需要鉴权此参数必填。
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get 数据压缩类型，取值有: <li> gzip：使用 gzip 方式压缩。</li>不填表示不启用压缩。 
     * @return CompressType 数据压缩类型，取值有: <li> gzip：使用 gzip 方式压缩。</li>不填表示不启用压缩。
     */
    public String getCompressType() {
        return this.CompressType;
    }

    /**
     * Set 数据压缩类型，取值有: <li> gzip：使用 gzip 方式压缩。</li>不填表示不启用压缩。
     * @param CompressType 数据压缩类型，取值有: <li> gzip：使用 gzip 方式压缩。</li>不填表示不启用压缩。
     */
    public void setCompressType(String CompressType) {
        this.CompressType = CompressType;
    }

    /**
     * Get POST 请求投递日志时，使用的应用层协议类型，取值有： 
<li>http：HTTP 协议；</li>
<li>https：HTTPS 协议。</li>如果不填默认根据填写的 URL 地址解析出协议类型。	 
     * @return Protocol POST 请求投递日志时，使用的应用层协议类型，取值有： 
<li>http：HTTP 协议；</li>
<li>https：HTTPS 协议。</li>如果不填默认根据填写的 URL 地址解析出协议类型。	
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set POST 请求投递日志时，使用的应用层协议类型，取值有： 
<li>http：HTTP 协议；</li>
<li>https：HTTPS 协议。</li>如果不填默认根据填写的 URL 地址解析出协议类型。	
     * @param Protocol POST 请求投递日志时，使用的应用层协议类型，取值有： 
<li>http：HTTP 协议；</li>
<li>https：HTTPS 协议。</li>如果不填默认根据填写的 URL 地址解析出协议类型。	
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 投递日志时携带的自定义请求头，注意 Content-Type、Accept-Encoding 不支持添加修改。 
     * @return Headers 投递日志时携带的自定义请求头，注意 Content-Type、Accept-Encoding 不支持添加修改。
     */
    public Header [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 投递日志时携带的自定义请求头，注意 Content-Type、Accept-Encoding 不支持添加修改。
     * @param Headers 投递日志时携带的自定义请求头，注意 Content-Type、Accept-Encoding 不支持添加修改。
     */
    public void setHeaders(Header [] Headers) {
        this.Headers = Headers;
    }

    public CustomEndpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomEndpoint(CustomEndpoint source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.AccessId != null) {
            this.AccessId = new String(source.AccessId);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.CompressType != null) {
            this.CompressType = new String(source.CompressType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
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
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "CompressType", this.CompressType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);

    }
}

