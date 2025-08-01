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

public class DescribeEngineNodeSpecResponse extends AbstractModel {

    /**
    * driver可用的规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DriverSpec")
    @Expose
    private SpecInfo [] DriverSpec;

    /**
    * executor可用的规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorSpec")
    @Expose
    private SpecInfo [] ExecutorSpec;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get driver可用的规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DriverSpec driver可用的规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SpecInfo [] getDriverSpec() {
        return this.DriverSpec;
    }

    /**
     * Set driver可用的规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param DriverSpec driver可用的规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDriverSpec(SpecInfo [] DriverSpec) {
        this.DriverSpec = DriverSpec;
    }

    /**
     * Get executor可用的规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorSpec executor可用的规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SpecInfo [] getExecutorSpec() {
        return this.ExecutorSpec;
    }

    /**
     * Set executor可用的规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorSpec executor可用的规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorSpec(SpecInfo [] ExecutorSpec) {
        this.ExecutorSpec = ExecutorSpec;
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

    public DescribeEngineNodeSpecResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEngineNodeSpecResponse(DescribeEngineNodeSpecResponse source) {
        if (source.DriverSpec != null) {
            this.DriverSpec = new SpecInfo[source.DriverSpec.length];
            for (int i = 0; i < source.DriverSpec.length; i++) {
                this.DriverSpec[i] = new SpecInfo(source.DriverSpec[i]);
            }
        }
        if (source.ExecutorSpec != null) {
            this.ExecutorSpec = new SpecInfo[source.ExecutorSpec.length];
            for (int i = 0; i < source.ExecutorSpec.length; i++) {
                this.ExecutorSpec[i] = new SpecInfo(source.ExecutorSpec[i]);
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
        this.setParamArrayObj(map, prefix + "DriverSpec.", this.DriverSpec);
        this.setParamArrayObj(map, prefix + "ExecutorSpec.", this.ExecutorSpec);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

