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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTokenResponse extends AbstractModel{

    /**
    * 当前的MatchCode对应的Token。如果当前MatchCode没有Token，该参数可能取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchToken")
    @Expose
    private String MatchToken;

    /**
    * 当Token被替换后，GPM将兼容推送原始Token的时间（秒）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompatibleSpan")
    @Expose
    private Long CompatibleSpan;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前的MatchCode对应的Token。如果当前MatchCode没有Token，该参数可能取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchToken 当前的MatchCode对应的Token。如果当前MatchCode没有Token，该参数可能取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMatchToken() {
        return this.MatchToken;
    }

    /**
     * Set 当前的MatchCode对应的Token。如果当前MatchCode没有Token，该参数可能取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchToken 当前的MatchCode对应的Token。如果当前MatchCode没有Token，该参数可能取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchToken(String MatchToken) {
        this.MatchToken = MatchToken;
    }

    /**
     * Get 当Token被替换后，GPM将兼容推送原始Token的时间（秒）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompatibleSpan 当Token被替换后，GPM将兼容推送原始Token的时间（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompatibleSpan() {
        return this.CompatibleSpan;
    }

    /**
     * Set 当Token被替换后，GPM将兼容推送原始Token的时间（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompatibleSpan 当Token被替换后，GPM将兼容推送原始Token的时间（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompatibleSpan(Long CompatibleSpan) {
        this.CompatibleSpan = CompatibleSpan;
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

    public DescribeTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTokenResponse(DescribeTokenResponse source) {
        if (source.MatchToken != null) {
            this.MatchToken = new String(source.MatchToken);
        }
        if (source.CompatibleSpan != null) {
            this.CompatibleSpan = new Long(source.CompatibleSpan);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchToken", this.MatchToken);
        this.setParamSimple(map, prefix + "CompatibleSpan", this.CompatibleSpan);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

