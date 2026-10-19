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

public class DescribeDBAuditLogsResponse extends AbstractModel {

    /**
    * <p>满足条件的总条数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>过滤后记录数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilteredRecords")
    @Expose
    private Long FilteredRecords;

    /**
    * <p>Proxy 层审计日志列表。LogType=Proxy 或 All 时返回，字段结构参见 AuditProxyLogItem。</p>
    */
    @SerializedName("ProxyLogs")
    @Expose
    private AuditProxyLogItem [] ProxyLogs;

    /**
    * <p>DB 层审计日志列表。LogType=DB 或 All 时返回，字段结构参见 AuditDBLogItem。</p>
    */
    @SerializedName("DBLogs")
    @Expose
    private AuditDBLogItem [] DBLogs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>满足条件的总条数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount <p>满足条件的总条数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>满足条件的总条数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount <p>满足条件的总条数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>过滤后记录数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilteredRecords <p>过滤后记录数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFilteredRecords() {
        return this.FilteredRecords;
    }

    /**
     * Set <p>过滤后记录数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilteredRecords <p>过滤后记录数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilteredRecords(Long FilteredRecords) {
        this.FilteredRecords = FilteredRecords;
    }

    /**
     * Get <p>Proxy 层审计日志列表。LogType=Proxy 或 All 时返回，字段结构参见 AuditProxyLogItem。</p> 
     * @return ProxyLogs <p>Proxy 层审计日志列表。LogType=Proxy 或 All 时返回，字段结构参见 AuditProxyLogItem。</p>
     */
    public AuditProxyLogItem [] getProxyLogs() {
        return this.ProxyLogs;
    }

    /**
     * Set <p>Proxy 层审计日志列表。LogType=Proxy 或 All 时返回，字段结构参见 AuditProxyLogItem。</p>
     * @param ProxyLogs <p>Proxy 层审计日志列表。LogType=Proxy 或 All 时返回，字段结构参见 AuditProxyLogItem。</p>
     */
    public void setProxyLogs(AuditProxyLogItem [] ProxyLogs) {
        this.ProxyLogs = ProxyLogs;
    }

    /**
     * Get <p>DB 层审计日志列表。LogType=DB 或 All 时返回，字段结构参见 AuditDBLogItem。</p> 
     * @return DBLogs <p>DB 层审计日志列表。LogType=DB 或 All 时返回，字段结构参见 AuditDBLogItem。</p>
     */
    public AuditDBLogItem [] getDBLogs() {
        return this.DBLogs;
    }

    /**
     * Set <p>DB 层审计日志列表。LogType=DB 或 All 时返回，字段结构参见 AuditDBLogItem。</p>
     * @param DBLogs <p>DB 层审计日志列表。LogType=DB 或 All 时返回，字段结构参见 AuditDBLogItem。</p>
     */
    public void setDBLogs(AuditDBLogItem [] DBLogs) {
        this.DBLogs = DBLogs;
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

    public DescribeDBAuditLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBAuditLogsResponse(DescribeDBAuditLogsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.FilteredRecords != null) {
            this.FilteredRecords = new Long(source.FilteredRecords);
        }
        if (source.ProxyLogs != null) {
            this.ProxyLogs = new AuditProxyLogItem[source.ProxyLogs.length];
            for (int i = 0; i < source.ProxyLogs.length; i++) {
                this.ProxyLogs[i] = new AuditProxyLogItem(source.ProxyLogs[i]);
            }
        }
        if (source.DBLogs != null) {
            this.DBLogs = new AuditDBLogItem[source.DBLogs.length];
            for (int i = 0; i < source.DBLogs.length; i++) {
                this.DBLogs[i] = new AuditDBLogItem(source.DBLogs[i]);
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
        this.setParamSimple(map, prefix + "FilteredRecords", this.FilteredRecords);
        this.setParamArrayObj(map, prefix + "ProxyLogs.", this.ProxyLogs);
        this.setParamArrayObj(map, prefix + "DBLogs.", this.DBLogs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

