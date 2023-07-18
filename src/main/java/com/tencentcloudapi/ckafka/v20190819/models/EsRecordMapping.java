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

public class EsRecordMapping extends AbstractModel{

    /**
    * es 索引成员名称
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * 消息字段名称
    */
    @SerializedName("JsonKey")
    @Expose
    private String JsonKey;

    /**
     * Get es 索引成员名称 
     * @return ColumnName es 索引成员名称
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set es 索引成员名称
     * @param ColumnName es 索引成员名称
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get 消息字段名称 
     * @return JsonKey 消息字段名称
     */
    public String getJsonKey() {
        return this.JsonKey;
    }

    /**
     * Set 消息字段名称
     * @param JsonKey 消息字段名称
     */
    public void setJsonKey(String JsonKey) {
        this.JsonKey = JsonKey;
    }

    public EsRecordMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsRecordMapping(EsRecordMapping source) {
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.JsonKey != null) {
            this.JsonKey = new String(source.JsonKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "JsonKey", this.JsonKey);

    }
}

