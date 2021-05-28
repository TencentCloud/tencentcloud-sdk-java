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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchemaItem extends AbstractModel{

    /**
    * 数据库名称
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
     * Get 数据库名称 
     * @return Schema 数据库名称
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set 数据库名称
     * @param Schema 数据库名称
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    public SchemaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchemaItem(SchemaItem source) {
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Schema", this.Schema);

    }
}

