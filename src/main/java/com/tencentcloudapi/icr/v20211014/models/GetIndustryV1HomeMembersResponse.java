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
package com.tencentcloudapi.icr.v20211014.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetIndustryV1HomeMembersResponse extends AbstractModel{

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadata")
    @Expose
    private RspMetadata Metadata;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Payload")
    @Expose
    private GetIndustryV1HomeMembersRespPayload Payload;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadata 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RspMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadata 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetadata(RspMetadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Payload 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GetIndustryV1HomeMembersRespPayload getPayload() {
        return this.Payload;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param Payload 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayload(GetIndustryV1HomeMembersRespPayload Payload) {
        this.Payload = Payload;
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

    public GetIndustryV1HomeMembersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetIndustryV1HomeMembersResponse(GetIndustryV1HomeMembersResponse source) {
        if (source.Metadata != null) {
            this.Metadata = new RspMetadata(source.Metadata);
        }
        if (source.Payload != null) {
            this.Payload = new GetIndustryV1HomeMembersRespPayload(source.Payload);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamObj(map, prefix + "Payload.", this.Payload);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

