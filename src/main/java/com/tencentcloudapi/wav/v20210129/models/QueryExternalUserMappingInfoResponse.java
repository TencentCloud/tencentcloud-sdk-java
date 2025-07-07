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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryExternalUserMappingInfoResponse extends AbstractModel {

    /**
    * 外部联系人映射信息, 只返回映射成功的记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalUserIdMapping")
    @Expose
    private ExternalUserMappingInfo [] ExternalUserIdMapping;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 外部联系人映射信息, 只返回映射成功的记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalUserIdMapping 外部联系人映射信息, 只返回映射成功的记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExternalUserMappingInfo [] getExternalUserIdMapping() {
        return this.ExternalUserIdMapping;
    }

    /**
     * Set 外部联系人映射信息, 只返回映射成功的记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalUserIdMapping 外部联系人映射信息, 只返回映射成功的记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalUserIdMapping(ExternalUserMappingInfo [] ExternalUserIdMapping) {
        this.ExternalUserIdMapping = ExternalUserIdMapping;
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

    public QueryExternalUserMappingInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryExternalUserMappingInfoResponse(QueryExternalUserMappingInfoResponse source) {
        if (source.ExternalUserIdMapping != null) {
            this.ExternalUserIdMapping = new ExternalUserMappingInfo[source.ExternalUserIdMapping.length];
            for (int i = 0; i < source.ExternalUserIdMapping.length; i++) {
                this.ExternalUserIdMapping[i] = new ExternalUserMappingInfo(source.ExternalUserIdMapping[i]);
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
        this.setParamArrayObj(map, prefix + "ExternalUserIdMapping.", this.ExternalUserIdMapping);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

