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

public class DescribeRecommendedParamsResponse extends AbstractModel {

    /**
    * <p>推荐来源: builtin | matched | default</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>推荐的高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedParams")
    @Expose
    private RecommendedAdvancedParams AdvancedParams;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>推荐来源: builtin | matched | default</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source <p>推荐来源: builtin | matched | default</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>推荐来源: builtin | matched | default</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source <p>推荐来源: builtin | matched | default</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>推荐的高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedParams <p>推荐的高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecommendedAdvancedParams getAdvancedParams() {
        return this.AdvancedParams;
    }

    /**
     * Set <p>推荐的高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedParams <p>推荐的高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedParams(RecommendedAdvancedParams AdvancedParams) {
        this.AdvancedParams = AdvancedParams;
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

    public DescribeRecommendedParamsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecommendedParamsResponse(DescribeRecommendedParamsResponse source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.AdvancedParams != null) {
            this.AdvancedParams = new RecommendedAdvancedParams(source.AdvancedParams);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamObj(map, prefix + "AdvancedParams.", this.AdvancedParams);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

