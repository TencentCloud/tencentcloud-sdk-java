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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpProbe extends AbstractModel{

    /**
    * 请求路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 请求端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 请求地址，默认Pod的IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 请求模式  HTTP|HTTPS，默认HTTP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * HTTP的请求头
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Headers")
    @Expose
    private HttpHeader [] Headers;

    /**
     * Get 请求路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 请求路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 请求路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 请求路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 请求端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 请求端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 请求端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 请求端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 请求地址，默认Pod的IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host 请求地址，默认Pod的IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 请求地址，默认Pod的IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host 请求地址，默认Pod的IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 请求模式  HTTP|HTTPS，默认HTTP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scheme 请求模式  HTTP|HTTPS，默认HTTP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set 请求模式  HTTP|HTTPS，默认HTTP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scheme 请求模式  HTTP|HTTPS，默认HTTP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get HTTP的请求头
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Headers HTTP的请求头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HttpHeader [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set HTTP的请求头
注意：此字段可能返回 null，表示取不到有效值。
     * @param Headers HTTP的请求头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaders(HttpHeader [] Headers) {
        this.Headers = Headers;
    }

    public HttpProbe() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpProbe(HttpProbe source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.Headers != null) {
            this.Headers = new HttpHeader[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new HttpHeader(source.Headers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);

    }
}

