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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Label extends AbstractModel {

    /**
    * 列名
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * 缺失值填充
    */
    @SerializedName("MissingValueImputation")
    @Expose
    private String MissingValueImputation;

    /**
    * 数据格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get 列名 
     * @return ColumnName 列名
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set 列名
     * @param ColumnName 列名
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get 缺失值填充 
     * @return MissingValueImputation 缺失值填充
     */
    public String getMissingValueImputation() {
        return this.MissingValueImputation;
    }

    /**
     * Set 缺失值填充
     * @param MissingValueImputation 缺失值填充
     */
    public void setMissingValueImputation(String MissingValueImputation) {
        this.MissingValueImputation = MissingValueImputation;
    }

    /**
     * Get 数据格式 
     * @return Format 数据格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 数据格式
     * @param Format 数据格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public Label() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Label(Label source) {
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.MissingValueImputation != null) {
            this.MissingValueImputation = new String(source.MissingValueImputation);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "MissingValueImputation", this.MissingValueImputation);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

