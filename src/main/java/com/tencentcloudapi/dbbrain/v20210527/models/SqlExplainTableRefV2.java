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

public class SqlExplainTableRefV2 extends AbstractModel {

    /**
    * <p>表名。</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>表所在的数据库名。</p>
    */
    @SerializedName("TableSchema")
    @Expose
    private String TableSchema;

    /**
     * Get <p>表名。</p> 
     * @return TableName <p>表名。</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>表名。</p>
     * @param TableName <p>表名。</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>表所在的数据库名。</p> 
     * @return TableSchema <p>表所在的数据库名。</p>
     */
    public String getTableSchema() {
        return this.TableSchema;
    }

    /**
     * Set <p>表所在的数据库名。</p>
     * @param TableSchema <p>表所在的数据库名。</p>
     */
    public void setTableSchema(String TableSchema) {
        this.TableSchema = TableSchema;
    }

    public SqlExplainTableRefV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SqlExplainTableRefV2(SqlExplainTableRefV2 source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableSchema != null) {
            this.TableSchema = new String(source.TableSchema);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableSchema", this.TableSchema);

    }
}

