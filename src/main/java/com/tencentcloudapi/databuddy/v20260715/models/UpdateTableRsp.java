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

public class UpdateTableRsp extends AbstractModel {

    /**
    * 更新后的表信息
    */
    @SerializedName("Table")
    @Expose
    private TableInfo Table;

    /**
     * Get 更新后的表信息 
     * @return Table 更新后的表信息
     */
    public TableInfo getTable() {
        return this.Table;
    }

    /**
     * Set 更新后的表信息
     * @param Table 更新后的表信息
     */
    public void setTable(TableInfo Table) {
        this.Table = Table;
    }

    public UpdateTableRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTableRsp(UpdateTableRsp source) {
        if (source.Table != null) {
            this.Table = new TableInfo(source.Table);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Table.", this.Table);

    }
}

