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

public class HTTPRewriteInfo extends AbstractModel {

    /**
    * 重写的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 重写的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z 0-9 ? = _ . - / : 。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 重写的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}|<>& 和空格。
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get 重写的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。 
     * @return Host 重写的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 重写的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。
     * @param Host 重写的主机地址，默认值${host}。长度3 ~ 128个字符，支持的字符集为：a-z 0-9 _ . -。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 重写的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z 0-9 ? = _ . - / : 。 
     * @return Path 重写的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z 0-9 ? = _ . - / : 。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 重写的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z 0-9 ? = _ . - / : 。
     * @param Path 重写的路径，默认值${path}。长度1 ~ 128个字符，支持的字符集为：a-z 0-9 ? = _ . - / : 。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 重写的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}|<>& 和空格。 
     * @return Query 重写的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}|<>& 和空格。
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 重写的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}|<>& 和空格。
     * @param Query 重写的查询字符串，默认值${query}。长度1 ~ 128字符，支持可打印字符，不支持 #[]{}|<>& 和空格。
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public HTTPRewriteInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPRewriteInfo(HTTPRewriteInfo source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

