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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterDatabasesResponse extends AbstractModel {

    /**
    * <p>总条数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>分页偏移</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>数据库列表</p>
    */
    @SerializedName("Databases")
    @Expose
    private String [] Databases;

    /**
    * <p>分页限制数</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>总条数</p> 
     * @return TotalCount <p>总条数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总条数</p>
     * @param TotalCount <p>总条数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>分页偏移</p> 
     * @return Offset <p>分页偏移</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移</p>
     * @param Offset <p>分页偏移</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>数据库列表</p> 
     * @return Databases <p>数据库列表</p>
     */
    public String [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set <p>数据库列表</p>
     * @param Databases <p>数据库列表</p>
     */
    public void setDatabases(String [] Databases) {
        this.Databases = Databases;
    }

    /**
     * Get <p>分页限制数</p> 
     * @return Limit <p>分页限制数</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页限制数</p>
     * @param Limit <p>分页限制数</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    public DescribeClusterDatabasesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterDatabasesResponse(DescribeClusterDatabasesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Databases != null) {
            this.Databases = new String[source.Databases.length];
            for (int i = 0; i < source.Databases.length; i++) {
                this.Databases[i] = new String(source.Databases[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "Databases.", this.Databases);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

