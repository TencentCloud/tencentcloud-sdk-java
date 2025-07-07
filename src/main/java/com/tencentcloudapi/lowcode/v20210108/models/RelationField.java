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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RelationField extends AbstractModel {

    /**
    * 关联关系字段
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 关联关系格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 关联数据源名称
    */
    @SerializedName("RelateDataSourceName")
    @Expose
    private String RelateDataSourceName;

    /**
     * Get 关联关系字段 
     * @return Field 关联关系字段
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 关联关系字段
     * @param Field 关联关系字段
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 关联关系格式 
     * @return Format 关联关系格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 关联关系格式
     * @param Format 关联关系格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 关联数据源名称 
     * @return RelateDataSourceName 关联数据源名称
     */
    public String getRelateDataSourceName() {
        return this.RelateDataSourceName;
    }

    /**
     * Set 关联数据源名称
     * @param RelateDataSourceName 关联数据源名称
     */
    public void setRelateDataSourceName(String RelateDataSourceName) {
        this.RelateDataSourceName = RelateDataSourceName;
    }

    public RelationField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelationField(RelationField source) {
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.RelateDataSourceName != null) {
            this.RelateDataSourceName = new String(source.RelateDataSourceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "RelateDataSourceName", this.RelateDataSourceName);

    }
}

