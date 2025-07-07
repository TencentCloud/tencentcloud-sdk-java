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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseTableResponse extends AbstractModel {

    /**
    * 实例名称。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库名称。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 表名称。
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 列信息。
    */
    @SerializedName("Cols")
    @Expose
    private TableColumn [] Cols;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例名称。 
     * @return InstanceId 实例名称。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例名称。
     * @param InstanceId 实例名称。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库名称。 
     * @return DbName 数据库名称。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称。
     * @param DbName 数据库名称。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 表名称。 
     * @return Table 表名称。
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 表名称。
     * @param Table 表名称。
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 列信息。 
     * @return Cols 列信息。
     */
    public TableColumn [] getCols() {
        return this.Cols;
    }

    /**
     * Set 列信息。
     * @param Cols 列信息。
     */
    public void setCols(TableColumn [] Cols) {
        this.Cols = Cols;
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

    public DescribeDatabaseTableResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseTableResponse(DescribeDatabaseTableResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Cols != null) {
            this.Cols = new TableColumn[source.Cols.length];
            for (int i = 0; i < source.Cols.length; i++) {
                this.Cols[i] = new TableColumn(source.Cols[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamArrayObj(map, prefix + "Cols.", this.Cols);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

