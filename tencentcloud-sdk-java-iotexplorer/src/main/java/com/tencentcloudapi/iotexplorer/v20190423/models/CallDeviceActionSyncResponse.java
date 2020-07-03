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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallDeviceActionSyncResponse extends AbstractModel{

    /**
    * 调用Id
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 输出参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputParams")
    @Expose
    private String OutputParams;

    /**
    * 返回状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 调用Id 
     * @return ClientToken 调用Id
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 调用Id
     * @param ClientToken 调用Id
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 输出参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputParams 输出参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputParams() {
        return this.OutputParams;
    }

    /**
     * Set 输出参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputParams 输出参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputParams(String OutputParams) {
        this.OutputParams = OutputParams;
    }

    /**
     * Get 返回状态 
     * @return Status 返回状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 返回状态
     * @param Status 返回状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "OutputParams", this.OutputParams);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

