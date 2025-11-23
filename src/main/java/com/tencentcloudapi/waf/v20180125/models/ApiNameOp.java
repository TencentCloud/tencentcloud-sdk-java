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

public class ApiNameOp extends AbstractModel {

    /**
    * 匹配值列表
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
    * 匹配方式，如属于和正则等
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * 手动筛选的时候，要传该结构体
    */
    @SerializedName("ApiNameMethod")
    @Expose
    private ApiNameMethod [] ApiNameMethod;

    /**
     * Get 匹配值列表 
     * @return Value 匹配值列表
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set 匹配值列表
     * @param Value 匹配值列表
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    /**
     * Get 匹配方式，如属于和正则等 
     * @return Op 匹配方式，如属于和正则等
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set 匹配方式，如属于和正则等
     * @param Op 匹配方式，如属于和正则等
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get 手动筛选的时候，要传该结构体 
     * @return ApiNameMethod 手动筛选的时候，要传该结构体
     */
    public ApiNameMethod [] getApiNameMethod() {
        return this.ApiNameMethod;
    }

    /**
     * Set 手动筛选的时候，要传该结构体
     * @param ApiNameMethod 手动筛选的时候，要传该结构体
     */
    public void setApiNameMethod(ApiNameMethod [] ApiNameMethod) {
        this.ApiNameMethod = ApiNameMethod;
    }

    public ApiNameOp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiNameOp(ApiNameOp source) {
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.ApiNameMethod != null) {
            this.ApiNameMethod = new ApiNameMethod[source.ApiNameMethod.length];
            for (int i = 0; i < source.ApiNameMethod.length; i++) {
                this.ApiNameMethod[i] = new ApiNameMethod(source.ApiNameMethod[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Value.", this.Value);
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamArrayObj(map, prefix + "ApiNameMethod.", this.ApiNameMethod);

    }
}

