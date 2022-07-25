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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClickHouseSchema extends AbstractModel{

    /**
    * 表的列名
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * 该列对应的jsonKey名
    */
    @SerializedName("JsonKey")
    @Expose
    private String JsonKey;

    /**
    * 表列项的类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 列项是否允许为空
    */
    @SerializedName("AllowNull")
    @Expose
    private Boolean AllowNull;

    /**
     * Get 表的列名 
     * @return ColumnName 表的列名
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set 表的列名
     * @param ColumnName 表的列名
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get 该列对应的jsonKey名 
     * @return JsonKey 该列对应的jsonKey名
     */
    public String getJsonKey() {
        return this.JsonKey;
    }

    /**
     * Set 该列对应的jsonKey名
     * @param JsonKey 该列对应的jsonKey名
     */
    public void setJsonKey(String JsonKey) {
        this.JsonKey = JsonKey;
    }

    /**
     * Get 表列项的类型 
     * @return Type 表列项的类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 表列项的类型
     * @param Type 表列项的类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 列项是否允许为空 
     * @return AllowNull 列项是否允许为空
     */
    public Boolean getAllowNull() {
        return this.AllowNull;
    }

    /**
     * Set 列项是否允许为空
     * @param AllowNull 列项是否允许为空
     */
    public void setAllowNull(Boolean AllowNull) {
        this.AllowNull = AllowNull;
    }

    public ClickHouseSchema() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClickHouseSchema(ClickHouseSchema source) {
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.JsonKey != null) {
            this.JsonKey = new String(source.JsonKey);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AllowNull != null) {
            this.AllowNull = new Boolean(source.AllowNull);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "JsonKey", this.JsonKey);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AllowNull", this.AllowNull);

    }
}

