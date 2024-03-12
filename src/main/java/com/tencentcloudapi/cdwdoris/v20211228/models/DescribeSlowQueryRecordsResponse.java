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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowQueryRecordsResponse extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 记录列表
    */
    @SerializedName("SlowQueryRecords")
    @Expose
    private SlowQueryRecord [] SlowQueryRecords;

    /**
    * 所有数据库名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBNameList")
    @Expose
    private String [] DBNameList;

    /**
    * 所有catalog名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogNameList")
    @Expose
    private String [] CatalogNameList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 记录列表 
     * @return SlowQueryRecords 记录列表
     */
    public SlowQueryRecord [] getSlowQueryRecords() {
        return this.SlowQueryRecords;
    }

    /**
     * Set 记录列表
     * @param SlowQueryRecords 记录列表
     */
    public void setSlowQueryRecords(SlowQueryRecord [] SlowQueryRecords) {
        this.SlowQueryRecords = SlowQueryRecords;
    }

    /**
     * Get 所有数据库名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBNameList 所有数据库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDBNameList() {
        return this.DBNameList;
    }

    /**
     * Set 所有数据库名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBNameList 所有数据库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBNameList(String [] DBNameList) {
        this.DBNameList = DBNameList;
    }

    /**
     * Get 所有catalog名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogNameList 所有catalog名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCatalogNameList() {
        return this.CatalogNameList;
    }

    /**
     * Set 所有catalog名
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogNameList 所有catalog名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogNameList(String [] CatalogNameList) {
        this.CatalogNameList = CatalogNameList;
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

    public DescribeSlowQueryRecordsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowQueryRecordsResponse(DescribeSlowQueryRecordsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SlowQueryRecords != null) {
            this.SlowQueryRecords = new SlowQueryRecord[source.SlowQueryRecords.length];
            for (int i = 0; i < source.SlowQueryRecords.length; i++) {
                this.SlowQueryRecords[i] = new SlowQueryRecord(source.SlowQueryRecords[i]);
            }
        }
        if (source.DBNameList != null) {
            this.DBNameList = new String[source.DBNameList.length];
            for (int i = 0; i < source.DBNameList.length; i++) {
                this.DBNameList[i] = new String(source.DBNameList[i]);
            }
        }
        if (source.CatalogNameList != null) {
            this.CatalogNameList = new String[source.CatalogNameList.length];
            for (int i = 0; i < source.CatalogNameList.length; i++) {
                this.CatalogNameList[i] = new String(source.CatalogNameList[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "SlowQueryRecords.", this.SlowQueryRecords);
        this.setParamArraySimple(map, prefix + "DBNameList.", this.DBNameList);
        this.setParamArraySimple(map, prefix + "CatalogNameList.", this.CatalogNameList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

