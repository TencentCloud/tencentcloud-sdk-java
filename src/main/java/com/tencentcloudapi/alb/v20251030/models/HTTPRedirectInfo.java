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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HTTPRedirectInfo extends AbstractModel {

    /**
    * <p>重定向的HTTP码，支持301、302、303、307、 308。</p>
    */
    @SerializedName("HttpCode")
    @Expose
    private Long HttpCode;

    /**
    * <p>重定向的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>重定向的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z A-Z 0-9  ? =  _  . - / : 。</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>重定向的端口，默认值 ${port}。取值1 ~ 65535。</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>重定向的协议，取值：HTTP,HTTPS，默认值${protocol}。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>重定向的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}|&lt;&gt;&amp; 和空格。</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get <p>重定向的HTTP码，支持301、302、303、307、 308。</p> 
     * @return HttpCode <p>重定向的HTTP码，支持301、302、303、307、 308。</p>
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set <p>重定向的HTTP码，支持301、302、303、307、 308。</p>
     * @param HttpCode <p>重定向的HTTP码，支持301、302、303、307、 308。</p>
     */
    public void setHttpCode(Long HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get <p>重定向的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。</p> 
     * @return Host <p>重定向的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>重定向的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。</p>
     * @param Host <p>重定向的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>重定向的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z A-Z 0-9  ? =  _  . - / : 。</p> 
     * @return Path <p>重定向的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z A-Z 0-9  ? =  _  . - / : 。</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>重定向的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z A-Z 0-9  ? =  _  . - / : 。</p>
     * @param Path <p>重定向的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z A-Z 0-9  ? =  _  . - / : 。</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>重定向的端口，默认值 ${port}。取值1 ~ 65535。</p> 
     * @return Port <p>重定向的端口，默认值 ${port}。取值1 ~ 65535。</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>重定向的端口，默认值 ${port}。取值1 ~ 65535。</p>
     * @param Port <p>重定向的端口，默认值 ${port}。取值1 ~ 65535。</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>重定向的协议，取值：HTTP,HTTPS，默认值${protocol}。</p> 
     * @return Protocol <p>重定向的协议，取值：HTTP,HTTPS，默认值${protocol}。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>重定向的协议，取值：HTTP,HTTPS，默认值${protocol}。</p>
     * @param Protocol <p>重定向的协议，取值：HTTP,HTTPS，默认值${protocol}。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>重定向的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}|&lt;&gt;&amp; 和空格。</p> 
     * @return Query <p>重定向的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}|&lt;&gt;&amp; 和空格。</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>重定向的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}|&lt;&gt;&amp; 和空格。</p>
     * @param Query <p>重定向的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}|&lt;&gt;&amp; 和空格。</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public HTTPRedirectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPRedirectInfo(HTTPRedirectInfo source) {
        if (source.HttpCode != null) {
            this.HttpCode = new Long(source.HttpCode);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HttpCode", this.HttpCode);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

