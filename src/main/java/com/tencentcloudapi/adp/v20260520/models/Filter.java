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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * 检索名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 检索值
    */
    @SerializedName("ValueList")
    @Expose
    private String [] ValueList;

    /**
     * Get 检索名称 
     * @return Name 检索名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 检索名称
     * @param Name 检索名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 检索值 
     * @return ValueList 检索值
     */
    public String [] getValueList() {
        return this.ValueList;
    }

    /**
     * Set 检索值
     * @param ValueList 检索值
     */
    public void setValueList(String [] ValueList) {
        this.ValueList = ValueList;
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
        if (source.ValueList != null) {
            this.ValueList = new String[source.ValueList.length];
            for (int i = 0; i < source.ValueList.length; i++) {
                this.ValueList[i] = new String(source.ValueList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "ValueList.", this.ValueList);

    }
}

