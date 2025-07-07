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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * 过滤参数key
    */
    @SerializedName("FilterKey")
    @Expose
    private String FilterKey;

    /**
    * 过滤参数值
    */
    @SerializedName("FilterValue")
    @Expose
    private String FilterValue;

    /**
     * Get 过滤参数key 
     * @return FilterKey 过滤参数key
     */
    public String getFilterKey() {
        return this.FilterKey;
    }

    /**
     * Set 过滤参数key
     * @param FilterKey 过滤参数key
     */
    public void setFilterKey(String FilterKey) {
        this.FilterKey = FilterKey;
    }

    /**
     * Get 过滤参数值 
     * @return FilterValue 过滤参数值
     */
    public String getFilterValue() {
        return this.FilterValue;
    }

    /**
     * Set 过滤参数值
     * @param FilterValue 过滤参数值
     */
    public void setFilterValue(String FilterValue) {
        this.FilterValue = FilterValue;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.FilterKey != null) {
            this.FilterKey = new String(source.FilterKey);
        }
        if (source.FilterValue != null) {
            this.FilterValue = new String(source.FilterValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterKey", this.FilterKey);
        this.setParamSimple(map, prefix + "FilterValue", this.FilterValue);

    }
}

