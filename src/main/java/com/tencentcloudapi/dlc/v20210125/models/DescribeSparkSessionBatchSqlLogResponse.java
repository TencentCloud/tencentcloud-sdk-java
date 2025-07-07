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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSparkSessionBatchSqlLogResponse extends AbstractModel {

    /**
    * 状态：0：运行中、1：成功、2：失败、3：取消、4：超时；
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 日志信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogSet")
    @Expose
    private SparkSessionBatchLog [] LogSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 状态：0：运行中、1：成功、2：失败、3：取消、4：超时； 
     * @return State 状态：0：运行中、1：成功、2：失败、3：取消、4：超时；
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 状态：0：运行中、1：成功、2：失败、3：取消、4：超时；
     * @param State 状态：0：运行中、1：成功、2：失败、3：取消、4：超时；
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 日志信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogSet 日志信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SparkSessionBatchLog [] getLogSet() {
        return this.LogSet;
    }

    /**
     * Set 日志信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogSet 日志信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogSet(SparkSessionBatchLog [] LogSet) {
        this.LogSet = LogSet;
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

    public DescribeSparkSessionBatchSqlLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkSessionBatchSqlLogResponse(DescribeSparkSessionBatchSqlLogResponse source) {
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.LogSet != null) {
            this.LogSet = new SparkSessionBatchLog[source.LogSet.length];
            for (int i = 0; i < source.LogSet.length; i++) {
                this.LogSet[i] = new SparkSessionBatchLog(source.LogSet[i]);
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
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "LogSet.", this.LogSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

