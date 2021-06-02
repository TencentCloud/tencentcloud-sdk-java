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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterBehaviorResponse extends AbstractModel{

    /**
    * 补录是否成功标志
功能标志为2时存在。
S：成功
F：失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplenishSuccessFlag")
    @Expose
    private String ReplenishSuccessFlag;

    /**
    * 签约信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegisterInfo")
    @Expose
    private RegisterInfo RegisterInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 补录是否成功标志
功能标志为2时存在。
S：成功
F：失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplenishSuccessFlag 补录是否成功标志
功能标志为2时存在。
S：成功
F：失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReplenishSuccessFlag() {
        return this.ReplenishSuccessFlag;
    }

    /**
     * Set 补录是否成功标志
功能标志为2时存在。
S：成功
F：失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplenishSuccessFlag 补录是否成功标志
功能标志为2时存在。
S：成功
F：失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplenishSuccessFlag(String ReplenishSuccessFlag) {
        this.ReplenishSuccessFlag = ReplenishSuccessFlag;
    }

    /**
     * Get 签约信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegisterInfo 签约信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegisterInfo getRegisterInfo() {
        return this.RegisterInfo;
    }

    /**
     * Set 签约信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegisterInfo 签约信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegisterInfo(RegisterInfo RegisterInfo) {
        this.RegisterInfo = RegisterInfo;
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

    public RegisterBehaviorResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterBehaviorResponse(RegisterBehaviorResponse source) {
        if (source.ReplenishSuccessFlag != null) {
            this.ReplenishSuccessFlag = new String(source.ReplenishSuccessFlag);
        }
        if (source.RegisterInfo != null) {
            this.RegisterInfo = new RegisterInfo(source.RegisterInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplenishSuccessFlag", this.ReplenishSuccessFlag);
        this.setParamObj(map, prefix + "RegisterInfo.", this.RegisterInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

