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
package com.tencentcloudapi.rkp.v20191209.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetOpenIdResponse extends AbstractModel{

    /**
    * 设备ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 设备风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskInfo")
    @Expose
    private RiskInfo [] RiskInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 设备ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenId 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenId 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 设备风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskInfo 设备风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RiskInfo [] getRiskInfo() {
        return this.RiskInfo;
    }

    /**
     * Set 设备风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskInfo 设备风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskInfo(RiskInfo [] RiskInfo) {
        this.RiskInfo = RiskInfo;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamArrayObj(map, prefix + "RiskInfo.", this.RiskInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

