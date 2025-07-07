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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Column extends AbstractModel {

    /**
    * 列名
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * 新列名
    */
    @SerializedName("NewColumnName")
    @Expose
    private String NewColumnName;

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
     * Get 新列名 
     * @return NewColumnName 新列名
     */
    public String getNewColumnName() {
        return this.NewColumnName;
    }

    /**
     * Set 新列名
     * @param NewColumnName 新列名
     */
    public void setNewColumnName(String NewColumnName) {
        this.NewColumnName = NewColumnName;
    }

    public Column() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Column(Column source) {
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.NewColumnName != null) {
            this.NewColumnName = new String(source.NewColumnName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "NewColumnName", this.NewColumnName);

    }
}

