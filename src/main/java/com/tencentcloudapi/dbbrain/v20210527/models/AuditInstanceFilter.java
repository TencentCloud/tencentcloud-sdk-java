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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditInstanceFilter extends AbstractModel {

    /**
    * 搜索条件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 要搜索的条件的值
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 搜索条件名称 
     * @return Name 搜索条件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 搜索条件名称
     * @param Name 搜索条件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 要搜索的条件的值 
     * @return Values 要搜索的条件的值
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 要搜索的条件的值
     * @param Values 要搜索的条件的值
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public AuditInstanceFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditInstanceFilter(AuditInstanceFilter source) {
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

