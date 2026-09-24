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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexInfo extends AbstractModel {

    /**
    * <p>索引名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>索引类型</p><p>枚举值：</p><ul><li>primary_key： 主键</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>索引字段</p>
    */
    @SerializedName("FieldNames")
    @Expose
    private String [] FieldNames;

    /**
     * Get <p>索引名称</p> 
     * @return Name <p>索引名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>索引名称</p>
     * @param Name <p>索引名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>索引类型</p><p>枚举值：</p><ul><li>primary_key： 主键</li></ul> 
     * @return Type <p>索引类型</p><p>枚举值：</p><ul><li>primary_key： 主键</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>索引类型</p><p>枚举值：</p><ul><li>primary_key： 主键</li></ul>
     * @param Type <p>索引类型</p><p>枚举值：</p><ul><li>primary_key： 主键</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>索引字段</p> 
     * @return FieldNames <p>索引字段</p>
     */
    public String [] getFieldNames() {
        return this.FieldNames;
    }

    /**
     * Set <p>索引字段</p>
     * @param FieldNames <p>索引字段</p>
     */
    public void setFieldNames(String [] FieldNames) {
        this.FieldNames = FieldNames;
    }

    public IndexInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexInfo(IndexInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FieldNames != null) {
            this.FieldNames = new String[source.FieldNames.length];
            for (int i = 0; i < source.FieldNames.length; i++) {
                this.FieldNames[i] = new String(source.FieldNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "FieldNames.", this.FieldNames);

    }
}

