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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class APIResource extends AbstractModel {

    /**
    * 资源 ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 资源名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * API 资源关联的 API 服务 ID 列表。
    */
    @SerializedName("APIServiceIds")
    @Expose
    private String [] APIServiceIds;

    /**
    * 资源路径。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 请求方法列表。支持以下取值：GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE。
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * 请求内容匹配规则的具体内容，需符合表达式语法，详细规范参见产品文档。
    */
    @SerializedName("RequestConstraint")
    @Expose
    private String RequestConstraint;

    /**
     * Get 资源 ID。 
     * @return Id 资源 ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源 ID。
     * @param Id 资源 ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 资源名称。 
     * @return Name 资源名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源名称。
     * @param Name 资源名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get API 资源关联的 API 服务 ID 列表。 
     * @return APIServiceIds API 资源关联的 API 服务 ID 列表。
     */
    public String [] getAPIServiceIds() {
        return this.APIServiceIds;
    }

    /**
     * Set API 资源关联的 API 服务 ID 列表。
     * @param APIServiceIds API 资源关联的 API 服务 ID 列表。
     */
    public void setAPIServiceIds(String [] APIServiceIds) {
        this.APIServiceIds = APIServiceIds;
    }

    /**
     * Get 资源路径。 
     * @return Path 资源路径。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 资源路径。
     * @param Path 资源路径。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 请求方法列表。支持以下取值：GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE。 
     * @return Methods 请求方法列表。支持以下取值：GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE。
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set 请求方法列表。支持以下取值：GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE。
     * @param Methods 请求方法列表。支持以下取值：GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE。
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get 请求内容匹配规则的具体内容，需符合表达式语法，详细规范参见产品文档。 
     * @return RequestConstraint 请求内容匹配规则的具体内容，需符合表达式语法，详细规范参见产品文档。
     */
    public String getRequestConstraint() {
        return this.RequestConstraint;
    }

    /**
     * Set 请求内容匹配规则的具体内容，需符合表达式语法，详细规范参见产品文档。
     * @param RequestConstraint 请求内容匹配规则的具体内容，需符合表达式语法，详细规范参见产品文档。
     */
    public void setRequestConstraint(String RequestConstraint) {
        this.RequestConstraint = RequestConstraint;
    }

    public APIResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public APIResource(APIResource source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.APIServiceIds != null) {
            this.APIServiceIds = new String[source.APIServiceIds.length];
            for (int i = 0; i < source.APIServiceIds.length; i++) {
                this.APIServiceIds[i] = new String(source.APIServiceIds[i]);
            }
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Methods != null) {
            this.Methods = new String[source.Methods.length];
            for (int i = 0; i < source.Methods.length; i++) {
                this.Methods[i] = new String(source.Methods[i]);
            }
        }
        if (source.RequestConstraint != null) {
            this.RequestConstraint = new String(source.RequestConstraint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "APIServiceIds.", this.APIServiceIds);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamSimple(map, prefix + "RequestConstraint", this.RequestConstraint);

    }
}

