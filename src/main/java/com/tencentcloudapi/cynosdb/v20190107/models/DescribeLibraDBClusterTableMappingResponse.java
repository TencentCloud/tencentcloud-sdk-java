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

public class DescribeLibraDBClusterTableMappingResponse extends AbstractModel {

    /**
    * 总记录数
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * 数据库映射信息
    */
    @SerializedName("TableMappings")
    @Expose
    private TableMappingObject [] TableMappings;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总记录数 
     * @return TotalCnt 总记录数
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set 总记录数
     * @param TotalCnt 总记录数
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get 数据库映射信息 
     * @return TableMappings 数据库映射信息
     */
    public TableMappingObject [] getTableMappings() {
        return this.TableMappings;
    }

    /**
     * Set 数据库映射信息
     * @param TableMappings 数据库映射信息
     */
    public void setTableMappings(TableMappingObject [] TableMappings) {
        this.TableMappings = TableMappings;
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

    public DescribeLibraDBClusterTableMappingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLibraDBClusterTableMappingResponse(DescribeLibraDBClusterTableMappingResponse source) {
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.TableMappings != null) {
            this.TableMappings = new TableMappingObject[source.TableMappings.length];
            for (int i = 0; i < source.TableMappings.length; i++) {
                this.TableMappings[i] = new TableMappingObject(source.TableMappings[i]);
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
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamArrayObj(map, prefix + "TableMappings.", this.TableMappings);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

