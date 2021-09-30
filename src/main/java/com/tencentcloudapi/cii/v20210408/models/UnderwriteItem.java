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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnderwriteItem extends AbstractModel{

    /**
    * 字段名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 风险值或者说明
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 字段名 
     * @return Name 字段名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字段名
     * @param Name 字段名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 结果 
     * @return Result 结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 结果
     * @param Result 结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 风险值或者说明 
     * @return Value 风险值或者说明
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 风险值或者说明
     * @param Value 风险值或者说明
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public UnderwriteItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnderwriteItem(UnderwriteItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

