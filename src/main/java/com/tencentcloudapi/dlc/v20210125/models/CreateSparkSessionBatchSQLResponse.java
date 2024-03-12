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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSparkSessionBatchSQLResponse extends AbstractModel {

    /**
    * 批任务唯一标识
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * Statement任务列表信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Statements")
    @Expose
    private StatementInformation [] Statements;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 批任务唯一标识 
     * @return BatchId 批任务唯一标识
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批任务唯一标识
     * @param BatchId 批任务唯一标识
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get Statement任务列表信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Statements Statement任务列表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatementInformation [] getStatements() {
        return this.Statements;
    }

    /**
     * Set Statement任务列表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Statements Statement任务列表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatements(StatementInformation [] Statements) {
        this.Statements = Statements;
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

    public CreateSparkSessionBatchSQLResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSparkSessionBatchSQLResponse(CreateSparkSessionBatchSQLResponse source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.Statements != null) {
            this.Statements = new StatementInformation[source.Statements.length];
            for (int i = 0; i < source.Statements.length; i++) {
                this.Statements[i] = new StatementInformation(source.Statements[i]);
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
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamArrayObj(map, prefix + "Statements.", this.Statements);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

