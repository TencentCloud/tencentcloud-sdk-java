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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiInfo extends AbstractModel{

    /**
    * 命名空间Id，若为外部API,为固定值："namespace-external"
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 服务Id，若为外部API,为固定值："ms-external"
    */
    @SerializedName("MicroserviceId")
    @Expose
    private String MicroserviceId;

    /**
    * API path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Api 请求
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 请求映射
    */
    @SerializedName("PathMapping")
    @Expose
    private String PathMapping;

    /**
    * api所在服务host,限定外部Api填写。格式: `http://127.0.0.1:8080`
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * api描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 命名空间Id，若为外部API,为固定值："namespace-external" 
     * @return NamespaceId 命名空间Id，若为外部API,为固定值："namespace-external"
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间Id，若为外部API,为固定值："namespace-external"
     * @param NamespaceId 命名空间Id，若为外部API,为固定值："namespace-external"
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 服务Id，若为外部API,为固定值："ms-external" 
     * @return MicroserviceId 服务Id，若为外部API,为固定值："ms-external"
     */
    public String getMicroserviceId() {
        return this.MicroserviceId;
    }

    /**
     * Set 服务Id，若为外部API,为固定值："ms-external"
     * @param MicroserviceId 服务Id，若为外部API,为固定值："ms-external"
     */
    public void setMicroserviceId(String MicroserviceId) {
        this.MicroserviceId = MicroserviceId;
    }

    /**
     * Get API path 
     * @return Path API path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API path
     * @param Path API path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Api 请求 
     * @return Method Api 请求
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Api 请求
     * @param Method Api 请求
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 请求映射 
     * @return PathMapping 请求映射
     */
    public String getPathMapping() {
        return this.PathMapping;
    }

    /**
     * Set 请求映射
     * @param PathMapping 请求映射
     */
    public void setPathMapping(String PathMapping) {
        this.PathMapping = PathMapping;
    }

    /**
     * Get api所在服务host,限定外部Api填写。格式: `http://127.0.0.1:8080` 
     * @return Host api所在服务host,限定外部Api填写。格式: `http://127.0.0.1:8080`
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set api所在服务host,限定外部Api填写。格式: `http://127.0.0.1:8080`
     * @param Host api所在服务host,限定外部Api填写。格式: `http://127.0.0.1:8080`
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get api描述信息 
     * @return Description api描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set api描述信息
     * @param Description api描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ApiInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiInfo(ApiInfo source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.MicroserviceId != null) {
            this.MicroserviceId = new String(source.MicroserviceId);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.PathMapping != null) {
            this.PathMapping = new String(source.PathMapping);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "MicroserviceId", this.MicroserviceId);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "PathMapping", this.PathMapping);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

