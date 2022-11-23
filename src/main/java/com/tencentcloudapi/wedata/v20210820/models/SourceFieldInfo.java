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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceFieldInfo extends AbstractModel{

    /**
    * 字段名称
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * 字段类型
    */
    @SerializedName("FieldType")
    @Expose
    private String FieldType;

    /**
    * 字段别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

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
     * Get 字段类型 
     * @return FieldType 字段类型
     */
    public String getFieldType() {
        return this.FieldType;
    }

    /**
     * Set 字段类型
     * @param FieldType 字段类型
     */
    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }

    /**
     * Get 字段别名 
     * @return Alias 字段别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 字段别名
     * @param Alias 字段别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public SourceFieldInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceFieldInfo(SourceFieldInfo source) {
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.FieldType != null) {
            this.FieldType = new String(source.FieldType);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "FieldType", this.FieldType);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

