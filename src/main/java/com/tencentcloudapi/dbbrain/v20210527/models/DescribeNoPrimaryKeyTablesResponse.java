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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNoPrimaryKeyTablesResponse extends AbstractModel{

    /**
    * 无主键表总数。
    */
    @SerializedName("NoPrimaryKeyTableCount")
    @Expose
    private Long NoPrimaryKeyTableCount;

    /**
    * 与昨日扫描无主键表的差值，正数为增加，负数为减少，0为无变化。
    */
    @SerializedName("NoPrimaryKeyTableCountDiff")
    @Expose
    private Long NoPrimaryKeyTableCountDiff;

    /**
    * 记录的无主键表总数（不超过无主键表总数），可用于分页查询。
    */
    @SerializedName("NoPrimaryKeyTableRecordCount")
    @Expose
    private Long NoPrimaryKeyTableRecordCount;

    /**
    * 无主键表列表。
    */
    @SerializedName("NoPrimaryKeyTables")
    @Expose
    private Table [] NoPrimaryKeyTables;

    /**
    * 采集时间戳（秒）。
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
     * Get 无主键表总数。 
     * @return NoPrimaryKeyTableCount 无主键表总数。
     */
    public Long getNoPrimaryKeyTableCount() {
        return this.NoPrimaryKeyTableCount;
    }

    /**
     * Set 无主键表总数。
     * @param NoPrimaryKeyTableCount 无主键表总数。
     */
    public void setNoPrimaryKeyTableCount(Long NoPrimaryKeyTableCount) {
        this.NoPrimaryKeyTableCount = NoPrimaryKeyTableCount;
    }

    /**
     * Get 与昨日扫描无主键表的差值，正数为增加，负数为减少，0为无变化。 
     * @return NoPrimaryKeyTableCountDiff 与昨日扫描无主键表的差值，正数为增加，负数为减少，0为无变化。
     */
    public Long getNoPrimaryKeyTableCountDiff() {
        return this.NoPrimaryKeyTableCountDiff;
    }

    /**
     * Set 与昨日扫描无主键表的差值，正数为增加，负数为减少，0为无变化。
     * @param NoPrimaryKeyTableCountDiff 与昨日扫描无主键表的差值，正数为增加，负数为减少，0为无变化。
     */
    public void setNoPrimaryKeyTableCountDiff(Long NoPrimaryKeyTableCountDiff) {
        this.NoPrimaryKeyTableCountDiff = NoPrimaryKeyTableCountDiff;
    }

    /**
     * Get 记录的无主键表总数（不超过无主键表总数），可用于分页查询。 
     * @return NoPrimaryKeyTableRecordCount 记录的无主键表总数（不超过无主键表总数），可用于分页查询。
     */
    public Long getNoPrimaryKeyTableRecordCount() {
        return this.NoPrimaryKeyTableRecordCount;
    }

    /**
     * Set 记录的无主键表总数（不超过无主键表总数），可用于分页查询。
     * @param NoPrimaryKeyTableRecordCount 记录的无主键表总数（不超过无主键表总数），可用于分页查询。
     */
    public void setNoPrimaryKeyTableRecordCount(Long NoPrimaryKeyTableRecordCount) {
        this.NoPrimaryKeyTableRecordCount = NoPrimaryKeyTableRecordCount;
    }

    /**
     * Get 无主键表列表。 
     * @return NoPrimaryKeyTables 无主键表列表。
     */
    public Table [] getNoPrimaryKeyTables() {
        return this.NoPrimaryKeyTables;
    }

    /**
     * Set 无主键表列表。
     * @param NoPrimaryKeyTables 无主键表列表。
     */
    public void setNoPrimaryKeyTables(Table [] NoPrimaryKeyTables) {
        this.NoPrimaryKeyTables = NoPrimaryKeyTables;
    }

    /**
     * Get 采集时间戳（秒）。 
     * @return Timestamp 采集时间戳（秒）。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 采集时间戳（秒）。
     * @param Timestamp 采集时间戳（秒）。
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

    public DescribeNoPrimaryKeyTablesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNoPrimaryKeyTablesResponse(DescribeNoPrimaryKeyTablesResponse source) {
        if (source.NoPrimaryKeyTableCount != null) {
            this.NoPrimaryKeyTableCount = new Long(source.NoPrimaryKeyTableCount);
        }
        if (source.NoPrimaryKeyTableCountDiff != null) {
            this.NoPrimaryKeyTableCountDiff = new Long(source.NoPrimaryKeyTableCountDiff);
        }
        if (source.NoPrimaryKeyTableRecordCount != null) {
            this.NoPrimaryKeyTableRecordCount = new Long(source.NoPrimaryKeyTableRecordCount);
        }
        if (source.NoPrimaryKeyTables != null) {
            this.NoPrimaryKeyTables = new Table[source.NoPrimaryKeyTables.length];
            for (int i = 0; i < source.NoPrimaryKeyTables.length; i++) {
                this.NoPrimaryKeyTables[i] = new Table(source.NoPrimaryKeyTables[i]);
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
        this.setParamSimple(map, prefix + "NoPrimaryKeyTableCount", this.NoPrimaryKeyTableCount);
        this.setParamSimple(map, prefix + "NoPrimaryKeyTableCountDiff", this.NoPrimaryKeyTableCountDiff);
        this.setParamSimple(map, prefix + "NoPrimaryKeyTableRecordCount", this.NoPrimaryKeyTableRecordCount);
        this.setParamArrayObj(map, prefix + "NoPrimaryKeyTables.", this.NoPrimaryKeyTables);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

