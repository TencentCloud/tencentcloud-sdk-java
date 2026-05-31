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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RequestFilter extends AbstractModel {

    /**
    * 过滤字段名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 过滤操作符。取值：EXACT（精确匹配）、FUZZY（模糊匹配）、NOT（排除匹配）。
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * 过滤值列表。最多支持 10 个。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 过滤字段名称。 
     * @return Name 过滤字段名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤字段名称。
     * @param Name 过滤字段名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 过滤操作符。取值：EXACT（精确匹配）、FUZZY（模糊匹配）、NOT（排除匹配）。 
     * @return Op 过滤操作符。取值：EXACT（精确匹配）、FUZZY（模糊匹配）、NOT（排除匹配）。
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set 过滤操作符。取值：EXACT（精确匹配）、FUZZY（模糊匹配）、NOT（排除匹配）。
     * @param Op 过滤操作符。取值：EXACT（精确匹配）、FUZZY（模糊匹配）、NOT（排除匹配）。
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get 过滤值列表。最多支持 10 个。 
     * @return Values 过滤值列表。最多支持 10 个。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 过滤值列表。最多支持 10 个。
     * @param Values 过滤值列表。最多支持 10 个。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public RequestFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestFilter(RequestFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

