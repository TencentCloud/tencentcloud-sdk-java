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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputDetails extends AbstractModel {

    /**
    * 字段名称
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * 字段值
    */
    @SerializedName("FieldValue")
    @Expose
    private String FieldValue;

    /**
     * Get 字段名称 
     * @return FieldName 字段名称
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 字段名称
     * @param FieldName 字段名称
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get 字段值 
     * @return FieldValue 字段值
     */
    public String getFieldValue() {
        return this.FieldValue;
    }

    /**
     * Set 字段值
     * @param FieldValue 字段值
     */
    public void setFieldValue(String FieldValue) {
        this.FieldValue = FieldValue;
    }

    public InputDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputDetails(InputDetails source) {
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.FieldValue != null) {
            this.FieldValue = new String(source.FieldValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "FieldValue", this.FieldValue);

    }
}

