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

public class ApiSecSensitiveWhiteField extends AbstractModel {

    /**
    * <p>字段名称</p>
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * <p>字段位置</p>
    */
    @SerializedName("FieldType")
    @Expose
    private String FieldType;

    /**
    * <p>敏感数据类型列表</p>
    */
    @SerializedName("SensitiveTypes")
    @Expose
    private String [] SensitiveTypes;

    /**
     * Get <p>字段名称</p> 
     * @return FieldName <p>字段名称</p>
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set <p>字段名称</p>
     * @param FieldName <p>字段名称</p>
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get <p>字段位置</p> 
     * @return FieldType <p>字段位置</p>
     */
    public String getFieldType() {
        return this.FieldType;
    }

    /**
     * Set <p>字段位置</p>
     * @param FieldType <p>字段位置</p>
     */
    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }

    /**
     * Get <p>敏感数据类型列表</p> 
     * @return SensitiveTypes <p>敏感数据类型列表</p>
     */
    public String [] getSensitiveTypes() {
        return this.SensitiveTypes;
    }

    /**
     * Set <p>敏感数据类型列表</p>
     * @param SensitiveTypes <p>敏感数据类型列表</p>
     */
    public void setSensitiveTypes(String [] SensitiveTypes) {
        this.SensitiveTypes = SensitiveTypes;
    }

    public ApiSecSensitiveWhiteField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiSecSensitiveWhiteField(ApiSecSensitiveWhiteField source) {
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.FieldType != null) {
            this.FieldType = new String(source.FieldType);
        }
        if (source.SensitiveTypes != null) {
            this.SensitiveTypes = new String[source.SensitiveTypes.length];
            for (int i = 0; i < source.SensitiveTypes.length; i++) {
                this.SensitiveTypes[i] = new String(source.SensitiveTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "FieldType", this.FieldType);
        this.setParamArraySimple(map, prefix + "SensitiveTypes.", this.SensitiveTypes);

    }
}

