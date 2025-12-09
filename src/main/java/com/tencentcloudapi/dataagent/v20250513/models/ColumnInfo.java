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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ColumnInfo extends AbstractModel {

    /**
    * 列名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 列类型：int, bigint, double, date, datetime, string，decimal
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 列名称描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 列索引
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 原始字段名称
    */
    @SerializedName("OriginalName")
    @Expose
    private String OriginalName;

    /**
     * Get 列名称 
     * @return Name 列名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 列名称
     * @param Name 列名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 列类型：int, bigint, double, date, datetime, string，decimal 
     * @return Type 列类型：int, bigint, double, date, datetime, string，decimal
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 列类型：int, bigint, double, date, datetime, string，decimal
     * @param Type 列类型：int, bigint, double, date, datetime, string，decimal
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 列名称描述 
     * @return Description 列名称描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 列名称描述
     * @param Description 列名称描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 列索引 
     * @return Index 列索引
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 列索引
     * @param Index 列索引
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 原始字段名称 
     * @return OriginalName 原始字段名称
     */
    public String getOriginalName() {
        return this.OriginalName;
    }

    /**
     * Set 原始字段名称
     * @param OriginalName 原始字段名称
     */
    public void setOriginalName(String OriginalName) {
        this.OriginalName = OriginalName;
    }

    public ColumnInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnInfo(ColumnInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.OriginalName != null) {
            this.OriginalName = new String(source.OriginalName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "OriginalName", this.OriginalName);

    }
}

