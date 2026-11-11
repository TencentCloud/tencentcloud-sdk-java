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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SqlExplainResultV2 extends AbstractModel {

    /**
    * <p>EXPLAIN 列名顺序，与 Data 中每一行的字段一一对应。</p>
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * <p>执行计划行列表。</p>
    */
    @SerializedName("Data")
    @Expose
    private SqlExplainRowV2 [] Data;

    /**
     * Get <p>EXPLAIN 列名顺序，与 Data 中每一行的字段一一对应。</p> 
     * @return Names <p>EXPLAIN 列名顺序，与 Data 中每一行的字段一一对应。</p>
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set <p>EXPLAIN 列名顺序，与 Data 中每一行的字段一一对应。</p>
     * @param Names <p>EXPLAIN 列名顺序，与 Data 中每一行的字段一一对应。</p>
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get <p>执行计划行列表。</p> 
     * @return Data <p>执行计划行列表。</p>
     */
    public SqlExplainRowV2 [] getData() {
        return this.Data;
    }

    /**
     * Set <p>执行计划行列表。</p>
     * @param Data <p>执行计划行列表。</p>
     */
    public void setData(SqlExplainRowV2 [] Data) {
        this.Data = Data;
    }

    public SqlExplainResultV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SqlExplainResultV2(SqlExplainResultV2 source) {
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new SqlExplainRowV2[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SqlExplainRowV2(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

