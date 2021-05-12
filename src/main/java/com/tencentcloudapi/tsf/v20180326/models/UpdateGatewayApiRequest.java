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

public class UpdateGatewayApiRequest extends AbstractModel{

    /**
    * API ID
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API 路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Api 请求方法
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
    * api所在服务host
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
     * Get API ID 
     * @return ApiId API ID
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API ID
     * @param ApiId API ID
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API 路径 
     * @return Path API 路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API 路径
     * @param Path API 路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Api 请求方法 
     * @return Method Api 请求方法
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Api 请求方法
     * @param Method Api 请求方法
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
     * Get api所在服务host 
     * @return Host api所在服务host
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set api所在服务host
     * @param Host api所在服务host
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

    public UpdateGatewayApiRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateGatewayApiRequest(UpdateGatewayApiRequest source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
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
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "PathMapping", this.PathMapping);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

