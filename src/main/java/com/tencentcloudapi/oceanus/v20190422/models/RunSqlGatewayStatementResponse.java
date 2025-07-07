/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunSqlGatewayStatementResponse extends AbstractModel {

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String [] ErrorMessage;

    /**
    * 会话id，若入参未传，则返回自动创建的会话id，若入参已经传递，则返回值与原传入值一致
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 返回执行id，可以根据该执行id和会话id获取执行结果
    */
    @SerializedName("OperationHandleId")
    @Expose
    private String OperationHandleId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String [] ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 会话id，若入参未传，则返回自动创建的会话id，若入参已经传递，则返回值与原传入值一致 
     * @return SessionId 会话id，若入参未传，则返回自动创建的会话id，若入参已经传递，则返回值与原传入值一致
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话id，若入参未传，则返回自动创建的会话id，若入参已经传递，则返回值与原传入值一致
     * @param SessionId 会话id，若入参未传，则返回自动创建的会话id，若入参已经传递，则返回值与原传入值一致
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 返回执行id，可以根据该执行id和会话id获取执行结果 
     * @return OperationHandleId 返回执行id，可以根据该执行id和会话id获取执行结果
     */
    public String getOperationHandleId() {
        return this.OperationHandleId;
    }

    /**
     * Set 返回执行id，可以根据该执行id和会话id获取执行结果
     * @param OperationHandleId 返回执行id，可以根据该执行id和会话id获取执行结果
     */
    public void setOperationHandleId(String OperationHandleId) {
        this.OperationHandleId = OperationHandleId;
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

    public RunSqlGatewayStatementResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunSqlGatewayStatementResponse(RunSqlGatewayStatementResponse source) {
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String[source.ErrorMessage.length];
            for (int i = 0; i < source.ErrorMessage.length; i++) {
                this.ErrorMessage[i] = new String(source.ErrorMessage[i]);
            }
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.OperationHandleId != null) {
            this.OperationHandleId = new String(source.OperationHandleId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ErrorMessage.", this.ErrorMessage);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "OperationHandleId", this.OperationHandleId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

