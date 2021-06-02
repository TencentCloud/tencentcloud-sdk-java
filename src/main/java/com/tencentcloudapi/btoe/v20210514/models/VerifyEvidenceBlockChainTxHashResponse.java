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
package com.tencentcloudapi.btoe.v20210514.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyEvidenceBlockChainTxHashResponse extends AbstractModel{

    /**
    * 核验结果，true为核验成功，fals为核验失败
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * 存证时间，仅当核验结果为true时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EvidenceTime")
    @Expose
    private String EvidenceTime;

    /**
    * 存证编码，仅当核验结果为true时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EvidenceId")
    @Expose
    private String EvidenceId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 核验结果，true为核验成功，fals为核验失败 
     * @return Result 核验结果，true为核验成功，fals为核验失败
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set 核验结果，true为核验成功，fals为核验失败
     * @param Result 核验结果，true为核验成功，fals为核验失败
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get 存证时间，仅当核验结果为true时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EvidenceTime 存证时间，仅当核验结果为true时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEvidenceTime() {
        return this.EvidenceTime;
    }

    /**
     * Set 存证时间，仅当核验结果为true时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param EvidenceTime 存证时间，仅当核验结果为true时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvidenceTime(String EvidenceTime) {
        this.EvidenceTime = EvidenceTime;
    }

    /**
     * Get 存证编码，仅当核验结果为true时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EvidenceId 存证编码，仅当核验结果为true时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEvidenceId() {
        return this.EvidenceId;
    }

    /**
     * Set 存证编码，仅当核验结果为true时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param EvidenceId 存证编码，仅当核验结果为true时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvidenceId(String EvidenceId) {
        this.EvidenceId = EvidenceId;
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

    public VerifyEvidenceBlockChainTxHashResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyEvidenceBlockChainTxHashResponse(VerifyEvidenceBlockChainTxHashResponse source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.EvidenceTime != null) {
            this.EvidenceTime = new String(source.EvidenceTime);
        }
        if (source.EvidenceId != null) {
            this.EvidenceId = new String(source.EvidenceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "EvidenceTime", this.EvidenceTime);
        this.setParamSimple(map, prefix + "EvidenceId", this.EvidenceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

