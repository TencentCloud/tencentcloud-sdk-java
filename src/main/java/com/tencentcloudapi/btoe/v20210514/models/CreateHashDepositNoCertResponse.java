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

public class CreateHashDepositNoCertResponse extends AbstractModel{

    /**
    * 透传字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 存证编码
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
     * Get 透传字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessId 透传字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 透传字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessId 透传字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 存证编码 
     * @return EvidenceId 存证编码
     */
    public String getEvidenceId() {
        return this.EvidenceId;
    }

    /**
     * Set 存证编码
     * @param EvidenceId 存证编码
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

    public CreateHashDepositNoCertResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHashDepositNoCertResponse(CreateHashDepositNoCertResponse source) {
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
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
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "EvidenceId", this.EvidenceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

