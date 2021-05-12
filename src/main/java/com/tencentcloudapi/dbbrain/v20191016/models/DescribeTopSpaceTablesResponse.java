/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopSpaceTablesResponse extends AbstractModel{

    /**
    * 返回的Top表空间统计信息列表。
    */
    @SerializedName("TopSpaceTables")
    @Expose
    private TableSpaceData [] TopSpaceTables;

    /**
    * 采集表空间数据的时间戳（秒）。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回的Top表空间统计信息列表。 
     * @return TopSpaceTables 返回的Top表空间统计信息列表。
     */
    public TableSpaceData [] getTopSpaceTables() {
        return this.TopSpaceTables;
    }

    /**
     * Set 返回的Top表空间统计信息列表。
     * @param TopSpaceTables 返回的Top表空间统计信息列表。
     */
    public void setTopSpaceTables(TableSpaceData [] TopSpaceTables) {
        this.TopSpaceTables = TopSpaceTables;
    }

    /**
     * Get 采集表空间数据的时间戳（秒）。 
     * @return Timestamp 采集表空间数据的时间戳（秒）。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 采集表空间数据的时间戳（秒）。
     * @param Timestamp 采集表空间数据的时间戳（秒）。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTopSpaceTablesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopSpaceTablesResponse(DescribeTopSpaceTablesResponse source) {
        if (source.TopSpaceTables != null) {
            this.TopSpaceTables = new TableSpaceData[source.TopSpaceTables.length];
            for (int i = 0; i < source.TopSpaceTables.length; i++) {
                this.TopSpaceTables[i] = new TableSpaceData(source.TopSpaceTables[i]);
            }
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TopSpaceTables.", this.TopSpaceTables);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

