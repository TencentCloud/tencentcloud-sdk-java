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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageFIlter extends AbstractModel {

    /**
    * 过滤字段名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 过滤值
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 是否反选
    */
    @SerializedName("Negative")
    @Expose
    private Boolean Negative;

    /**
     * Get 过滤字段名称 
     * @return Name 过滤字段名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤字段名称
     * @param Name 过滤字段名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 过滤值 
     * @return Values 过滤值
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 过滤值
     * @param Values 过滤值
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 是否反选 
     * @return Negative 是否反选
     */
    public Boolean getNegative() {
        return this.Negative;
    }

    /**
     * Set 是否反选
     * @param Negative 是否反选
     */
    public void setNegative(Boolean Negative) {
        this.Negative = Negative;
    }

    public ImageFIlter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageFIlter(ImageFIlter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.Negative != null) {
            this.Negative = new Boolean(source.Negative);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Negative", this.Negative);

    }
}

