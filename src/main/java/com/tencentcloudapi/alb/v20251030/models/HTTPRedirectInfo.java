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
    * 重定向的HTTP码，支持301、302、303、307、 308。
    */
    @SerializedName("HttpCode")
    @Expose
    private Long HttpCode;

    /**
    * 重定向的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 重定向的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z 0-9  ? =  _  . - / : 。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 重定向的端口，默认值 ${port}。取值1 ~ 65535。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 重定向的协议，取值：HTTP,HTTPS，默认值${protocol}。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 重定向的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}\|<>& 和空格。
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get 重定向的HTTP码，支持301、302、303、307、 308。 
     * @return HttpCode 重定向的HTTP码，支持301、302、303、307、 308。
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set 重定向的HTTP码，支持301、302、303、307、 308。
     * @param HttpCode 重定向的HTTP码，支持301、302、303、307、 308。
     */
    public void setHttpCode(Long HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get 重定向的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。 
     * @return Host 重定向的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 重定向的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。
     * @param Host 重定向的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 重定向的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z 0-9  ? =  _  . - / : 。 
     * @return Path 重定向的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z 0-9  ? =  _  . - / : 。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 重定向的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z 0-9  ? =  _  . - / : 。
     * @param Path 重定向的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z 0-9  ? =  _  . - / : 。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 重定向的端口，默认值 ${port}。取值1 ~ 65535。 
     * @return Port 重定向的端口，默认值 ${port}。取值1 ~ 65535。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 重定向的端口，默认值 ${port}。取值1 ~ 65535。
     * @param Port 重定向的端口，默认值 ${port}。取值1 ~ 65535。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 重定向的协议，取值：HTTP,HTTPS，默认值${protocol}。 
     * @return Protocol 重定向的协议，取值：HTTP,HTTPS，默认值${protocol}。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 重定向的协议，取值：HTTP,HTTPS，默认值${protocol}。
     * @param Protocol 重定向的协议，取值：HTTP,HTTPS，默认值${protocol}。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 重定向的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}\|<>& 和空格。 
     * @return Query 重定向的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}\|<>& 和空格。
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 重定向的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}\|<>& 和空格。
     * @param Query 重定向的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}\|<>& 和空格。
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

