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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyJobsResponse extends AbstractModel{

    /**
    * 成功条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 失败条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * 结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CopyJobsResults")
    @Expose
    private CopyJobResult [] CopyJobsResults;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 成功条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessCount 成功条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 成功条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessCount 成功条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 失败条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailCount 失败条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set 失败条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailCount 失败条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get 结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CopyJobsResults 结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CopyJobResult [] getCopyJobsResults() {
        return this.CopyJobsResults;
    }

    /**
     * Set 结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CopyJobsResults 结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCopyJobsResults(CopyJobResult [] CopyJobsResults) {
        this.CopyJobsResults = CopyJobsResults;
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

    public CopyJobsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyJobsResponse(CopyJobsResponse source) {
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.CopyJobsResults != null) {
            this.CopyJobsResults = new CopyJobResult[source.CopyJobsResults.length];
            for (int i = 0; i < source.CopyJobsResults.length; i++) {
                this.CopyJobsResults[i] = new CopyJobResult(source.CopyJobsResults[i]);
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
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamArrayObj(map, prefix + "CopyJobsResults.", this.CopyJobsResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

