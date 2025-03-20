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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCPUExpandStrategyInfoResponse extends AbstractModel {

    /**
    * 策略类型。可选值 auto、manual。如果返回为NULL说明尚未开通弹性扩容策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 手动扩容的 CPU 。Type为 manual 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpandCpu")
    @Expose
    private Long ExpandCpu;

    /**
    * 自动扩容策略。Type 为 auto 时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoStrategy")
    @Expose
    private AutoStrategy AutoStrategy;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 策略类型。可选值 auto、manual。如果返回为NULL说明尚未开通弹性扩容策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 策略类型。可选值 auto、manual。如果返回为NULL说明尚未开通弹性扩容策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 策略类型。可选值 auto、manual。如果返回为NULL说明尚未开通弹性扩容策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 策略类型。可选值 auto、manual。如果返回为NULL说明尚未开通弹性扩容策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 手动扩容的 CPU 。Type为 manual 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpandCpu 手动扩容的 CPU 。Type为 manual 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpandCpu() {
        return this.ExpandCpu;
    }

    /**
     * Set 手动扩容的 CPU 。Type为 manual 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpandCpu 手动扩容的 CPU 。Type为 manual 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpandCpu(Long ExpandCpu) {
        this.ExpandCpu = ExpandCpu;
    }

    /**
     * Get 自动扩容策略。Type 为 auto 时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoStrategy 自动扩容策略。Type 为 auto 时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AutoStrategy getAutoStrategy() {
        return this.AutoStrategy;
    }

    /**
     * Set 自动扩容策略。Type 为 auto 时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoStrategy 自动扩容策略。Type 为 auto 时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoStrategy(AutoStrategy AutoStrategy) {
        this.AutoStrategy = AutoStrategy;
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

    public DescribeCPUExpandStrategyInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCPUExpandStrategyInfoResponse(DescribeCPUExpandStrategyInfoResponse source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ExpandCpu != null) {
            this.ExpandCpu = new Long(source.ExpandCpu);
        }
        if (source.AutoStrategy != null) {
            this.AutoStrategy = new AutoStrategy(source.AutoStrategy);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ExpandCpu", this.ExpandCpu);
        this.setParamObj(map, prefix + "AutoStrategy.", this.AutoStrategy);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

