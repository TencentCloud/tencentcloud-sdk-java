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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel{

    /**
    * 需要过滤的字段
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 需要过滤字段的值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 需要过滤的字段 
     * @return Name 需要过滤的字段
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 需要过滤的字段
     * @param Name 需要过滤的字段
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 需要过滤字段的值 
     * @return Value 需要过滤字段的值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 需要过滤字段的值
     * @param Value 需要过滤字段的值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

