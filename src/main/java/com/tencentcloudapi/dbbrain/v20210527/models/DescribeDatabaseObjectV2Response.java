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

public class DescribeDatabaseObjectV2Response extends AbstractModel {

    /**
    * <p>索引 DDL 列表，每项为一条 CREATE INDEX 语句，无索引时为空数组。</p>
    */
    @SerializedName("IndexDDLs")
    @Expose
    private IndexDDLInfo [] IndexDDLs;

    /**
    * <p>建表 DDL 语句，对象不存在时为空串。</p>
    */
    @SerializedName("TableDDL")
    @Expose
    private String TableDDL;

    /**
    * <p>表名。</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>库名。</p>
    */
    @SerializedName("TableSchema")
    @Expose
    private String TableSchema;

    /**
    * <p>表空间统计。</p>
    */
    @SerializedName("TableStatistics")
    @Expose
    private TableStatistics TableStatistics;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>索引 DDL 列表，每项为一条 CREATE INDEX 语句，无索引时为空数组。</p> 
     * @return IndexDDLs <p>索引 DDL 列表，每项为一条 CREATE INDEX 语句，无索引时为空数组。</p>
     */
    public IndexDDLInfo [] getIndexDDLs() {
        return this.IndexDDLs;
    }

    /**
     * Set <p>索引 DDL 列表，每项为一条 CREATE INDEX 语句，无索引时为空数组。</p>
     * @param IndexDDLs <p>索引 DDL 列表，每项为一条 CREATE INDEX 语句，无索引时为空数组。</p>
     */
    public void setIndexDDLs(IndexDDLInfo [] IndexDDLs) {
        this.IndexDDLs = IndexDDLs;
    }

    /**
     * Get <p>建表 DDL 语句，对象不存在时为空串。</p> 
     * @return TableDDL <p>建表 DDL 语句，对象不存在时为空串。</p>
     */
    public String getTableDDL() {
        return this.TableDDL;
    }

    /**
     * Set <p>建表 DDL 语句，对象不存在时为空串。</p>
     * @param TableDDL <p>建表 DDL 语句，对象不存在时为空串。</p>
     */
    public void setTableDDL(String TableDDL) {
        this.TableDDL = TableDDL;
    }

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
     * Get <p>库名。</p> 
     * @return TableSchema <p>库名。</p>
     */
    public String getTableSchema() {
        return this.TableSchema;
    }

    /**
     * Set <p>库名。</p>
     * @param TableSchema <p>库名。</p>
     */
    public void setTableSchema(String TableSchema) {
        this.TableSchema = TableSchema;
    }

    /**
     * Get <p>表空间统计。</p> 
     * @return TableStatistics <p>表空间统计。</p>
     */
    public TableStatistics getTableStatistics() {
        return this.TableStatistics;
    }

    /**
     * Set <p>表空间统计。</p>
     * @param TableStatistics <p>表空间统计。</p>
     */
    public void setTableStatistics(TableStatistics TableStatistics) {
        this.TableStatistics = TableStatistics;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDatabaseObjectV2Response() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseObjectV2Response(DescribeDatabaseObjectV2Response source) {
        if (source.IndexDDLs != null) {
            this.IndexDDLs = new IndexDDLInfo[source.IndexDDLs.length];
            for (int i = 0; i < source.IndexDDLs.length; i++) {
                this.IndexDDLs[i] = new IndexDDLInfo(source.IndexDDLs[i]);
            }
        }
        if (source.TableDDL != null) {
            this.TableDDL = new String(source.TableDDL);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableSchema != null) {
            this.TableSchema = new String(source.TableSchema);
        }
        if (source.TableStatistics != null) {
            this.TableStatistics = new TableStatistics(source.TableStatistics);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "IndexDDLs.", this.IndexDDLs);
        this.setParamSimple(map, prefix + "TableDDL", this.TableDDL);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableSchema", this.TableSchema);
        this.setParamObj(map, prefix + "TableStatistics.", this.TableStatistics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

