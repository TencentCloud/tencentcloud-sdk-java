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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTablesResponse extends AbstractModel {

    /**
    * 表信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tables")
    @Expose
    private TableInfo [] Tables;

    /**
    * 分页信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pager")
    @Expose
    private Pager Pager;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 表信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tables 表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableInfo [] getTables() {
        return this.Tables;
    }

    /**
     * Set 表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tables 表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTables(TableInfo [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get 分页信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pager 分页信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Pager getPager() {
        return this.Pager;
    }

    /**
     * Set 分页信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pager 分页信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPager(Pager Pager) {
        this.Pager = Pager;
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

    public DescribeTablesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTablesResponse(DescribeTablesResponse source) {
        if (source.Tables != null) {
            this.Tables = new TableInfo[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new TableInfo(source.Tables[i]);
            }
        }
        if (source.Pager != null) {
            this.Pager = new Pager(source.Pager);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamObj(map, prefix + "Pager.", this.Pager);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

