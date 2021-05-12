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

public class ModifyTokenResponse extends AbstractModel{

    /**
    * 成功设置的Token。
    */
    @SerializedName("MatchToken")
    @Expose
    private String MatchToken;

    /**
    * 当前Token被替换后，GPM将持续推送原Token的时间。
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
     * Get 成功设置的Token。 
     * @return MatchToken 成功设置的Token。
     */
    public String getMatchToken() {
        return this.MatchToken;
    }

    /**
     * Set 成功设置的Token。
     * @param MatchToken 成功设置的Token。
     */
    public void setMatchToken(String MatchToken) {
        this.MatchToken = MatchToken;
    }

    /**
     * Get 当前Token被替换后，GPM将持续推送原Token的时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompatibleSpan 当前Token被替换后，GPM将持续推送原Token的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompatibleSpan() {
        return this.CompatibleSpan;
    }

    /**
     * Set 当前Token被替换后，GPM将持续推送原Token的时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompatibleSpan 当前Token被替换后，GPM将持续推送原Token的时间。
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

    public ModifyTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTokenResponse(ModifyTokenResponse source) {
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

