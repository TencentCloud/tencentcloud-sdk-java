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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPStrategyApi extends AbstractModel{

    /**
    * API 唯一 ID。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * 用户自定义的 API 名称。
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * API 类型。取值为NORMAL（普通API）和TSF （微服务API）。
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * API 的路径。如 /path。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API 的请求方法。如 GET。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * API 已经绑定的其他策略唯一ID。
    */
    @SerializedName("OtherIPStrategyId")
    @Expose
    private String OtherIPStrategyId;

    /**
    * API 已经绑定的环境。
    */
    @SerializedName("OtherEnvironmentName")
    @Expose
    private String OtherEnvironmentName;

    /**
     * Get API 唯一 ID。 
     * @return ApiId API 唯一 ID。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API 唯一 ID。
     * @param ApiId API 唯一 ID。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get 用户自定义的 API 名称。 
     * @return ApiName 用户自定义的 API 名称。
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set 用户自定义的 API 名称。
     * @param ApiName 用户自定义的 API 名称。
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get API 类型。取值为NORMAL（普通API）和TSF （微服务API）。 
     * @return ApiType API 类型。取值为NORMAL（普通API）和TSF （微服务API）。
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set API 类型。取值为NORMAL（普通API）和TSF （微服务API）。
     * @param ApiType API 类型。取值为NORMAL（普通API）和TSF （微服务API）。
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get API 的路径。如 /path。 
     * @return Path API 的路径。如 /path。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API 的路径。如 /path。
     * @param Path API 的路径。如 /path。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API 的请求方法。如 GET。 
     * @return Method API 的请求方法。如 GET。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API 的请求方法。如 GET。
     * @param Method API 的请求方法。如 GET。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get API 已经绑定的其他策略唯一ID。 
     * @return OtherIPStrategyId API 已经绑定的其他策略唯一ID。
     */
    public String getOtherIPStrategyId() {
        return this.OtherIPStrategyId;
    }

    /**
     * Set API 已经绑定的其他策略唯一ID。
     * @param OtherIPStrategyId API 已经绑定的其他策略唯一ID。
     */
    public void setOtherIPStrategyId(String OtherIPStrategyId) {
        this.OtherIPStrategyId = OtherIPStrategyId;
    }

    /**
     * Get API 已经绑定的环境。 
     * @return OtherEnvironmentName API 已经绑定的环境。
     */
    public String getOtherEnvironmentName() {
        return this.OtherEnvironmentName;
    }

    /**
     * Set API 已经绑定的环境。
     * @param OtherEnvironmentName API 已经绑定的环境。
     */
    public void setOtherEnvironmentName(String OtherEnvironmentName) {
        this.OtherEnvironmentName = OtherEnvironmentName;
    }

    public IPStrategyApi() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPStrategyApi(IPStrategyApi source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.OtherIPStrategyId != null) {
            this.OtherIPStrategyId = new String(source.OtherIPStrategyId);
        }
        if (source.OtherEnvironmentName != null) {
            this.OtherEnvironmentName = new String(source.OtherEnvironmentName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "OtherIPStrategyId", this.OtherIPStrategyId);
        this.setParamSimple(map, prefix + "OtherEnvironmentName", this.OtherEnvironmentName);

    }
}

