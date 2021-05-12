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

public class ApiEnvironmentStrategy extends AbstractModel{

    /**
    * API唯一ID。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * 用户自定义API名称。
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * API的路径。如/path。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API的方法。如GET。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 环境的限流信息。
    */
    @SerializedName("EnvironmentStrategySet")
    @Expose
    private EnvironmentStrategy [] EnvironmentStrategySet;

    /**
     * Get API唯一ID。 
     * @return ApiId API唯一ID。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API唯一ID。
     * @param ApiId API唯一ID。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get 用户自定义API名称。 
     * @return ApiName 用户自定义API名称。
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set 用户自定义API名称。
     * @param ApiName 用户自定义API名称。
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get API的路径。如/path。 
     * @return Path API的路径。如/path。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API的路径。如/path。
     * @param Path API的路径。如/path。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API的方法。如GET。 
     * @return Method API的方法。如GET。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API的方法。如GET。
     * @param Method API的方法。如GET。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 环境的限流信息。 
     * @return EnvironmentStrategySet 环境的限流信息。
     */
    public EnvironmentStrategy [] getEnvironmentStrategySet() {
        return this.EnvironmentStrategySet;
    }

    /**
     * Set 环境的限流信息。
     * @param EnvironmentStrategySet 环境的限流信息。
     */
    public void setEnvironmentStrategySet(EnvironmentStrategy [] EnvironmentStrategySet) {
        this.EnvironmentStrategySet = EnvironmentStrategySet;
    }

    public ApiEnvironmentStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiEnvironmentStrategy(ApiEnvironmentStrategy source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.EnvironmentStrategySet != null) {
            this.EnvironmentStrategySet = new EnvironmentStrategy[source.EnvironmentStrategySet.length];
            for (int i = 0; i < source.EnvironmentStrategySet.length; i++) {
                this.EnvironmentStrategySet[i] = new EnvironmentStrategy(source.EnvironmentStrategySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamArrayObj(map, prefix + "EnvironmentStrategySet.", this.EnvironmentStrategySet);

    }
}

