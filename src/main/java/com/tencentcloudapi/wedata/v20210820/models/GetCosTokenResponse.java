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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCosTokenResponse extends AbstractModel {

    /**
    * cos地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Token信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Token")
    @Expose
    private CosTokenResponse Token;

    /**
    * 桶名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 终止点（针对私有云环境）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndPoint")
    @Expose
    private String EndPoint;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get cos地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region cos地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set cos地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region cos地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Token信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Token Token信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosTokenResponse getToken() {
        return this.Token;
    }

    /**
     * Set Token信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Token Token信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToken(CosTokenResponse Token) {
        this.Token = Token;
    }

    /**
     * Get 桶名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bucket 桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 桶名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bucket 桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 终止点（针对私有云环境）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndPoint 终止点（针对私有云环境）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndPoint() {
        return this.EndPoint;
    }

    /**
     * Set 终止点（针对私有云环境）
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndPoint 终止点（针对私有云环境）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndPoint(String EndPoint) {
        this.EndPoint = EndPoint;
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

    public GetCosTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCosTokenResponse(GetCosTokenResponse source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Token != null) {
            this.Token = new CosTokenResponse(source.Token);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.EndPoint != null) {
            this.EndPoint = new String(source.EndPoint);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamObj(map, prefix + "Token.", this.Token);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "EndPoint", this.EndPoint);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

