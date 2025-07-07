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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableColumn extends AbstractModel {

    /**
    * 列名称
    */
    @SerializedName("Header")
    @Expose
    private String Header;

    /**
    * 列数据类型
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
     * Get 列名称 
     * @return Header 列名称
     */
    public String getHeader() {
        return this.Header;
    }

    /**
     * Set 列名称
     * @param Header 列名称
     */
    public void setHeader(String Header) {
        this.Header = Header;
    }

    /**
     * Get 列数据类型 
     * @return DataType 列数据类型
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set 列数据类型
     * @param DataType 列数据类型
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    public TableColumn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableColumn(TableColumn source) {
        if (source.Header != null) {
            this.Header = new String(source.Header);
        }
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Header", this.Header);
        this.setParamSimple(map, prefix + "DataType", this.DataType);

    }
}

