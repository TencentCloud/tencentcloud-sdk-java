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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * <p>筛选条件</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>过滤字段对应的参数值</p>
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get <p>筛选条件</p> 
     * @return Name <p>筛选条件</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>筛选条件</p>
     * @param Name <p>筛选条件</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>过滤字段对应的参数值</p> 
     * @return Values <p>过滤字段对应的参数值</p>
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set <p>过滤字段对应的参数值</p>
     * @param Values <p>过滤字段对应的参数值</p>
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

