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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiNameMethod extends AbstractModel {

    /**
    * api名称
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * api请求方式
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * api近30天请求数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * api标签
    */
    @SerializedName("Label")
    @Expose
    private String [] Label;

    /**
     * Get api名称 
     * @return ApiName api名称
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set api名称
     * @param ApiName api名称
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get api请求方式 
     * @return Method api请求方式
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set api请求方式
     * @param Method api请求方式
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get api近30天请求数量 
     * @return Count api近30天请求数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set api近30天请求数量
     * @param Count api近30天请求数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get api标签 
     * @return Label api标签
     */
    public String [] getLabel() {
        return this.Label;
    }

    /**
     * Set api标签
     * @param Label api标签
     */
    public void setLabel(String [] Label) {
        this.Label = Label;
    }

    public ApiNameMethod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiNameMethod(ApiNameMethod source) {
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Label != null) {
            this.Label = new String[source.Label.length];
            for (int i = 0; i < source.Label.length; i++) {
                this.Label[i] = new String(source.Label[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArraySimple(map, prefix + "Label.", this.Label);

    }
}

