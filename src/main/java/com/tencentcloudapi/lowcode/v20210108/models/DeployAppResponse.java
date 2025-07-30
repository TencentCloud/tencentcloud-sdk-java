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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployAppResponse extends AbstractModel {

    /**
    * 构建id
    */
    @SerializedName("BuildId")
    @Expose
    private String BuildId;

    /**
    * 发布错误code
    */
    @SerializedName("DeployErrCode")
    @Expose
    private Long DeployErrCode;

    /**
    * 发布错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployErrMsg")
    @Expose
    private String DeployErrMsg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 构建id 
     * @return BuildId 构建id
     */
    public String getBuildId() {
        return this.BuildId;
    }

    /**
     * Set 构建id
     * @param BuildId 构建id
     */
    public void setBuildId(String BuildId) {
        this.BuildId = BuildId;
    }

    /**
     * Get 发布错误code 
     * @return DeployErrCode 发布错误code
     */
    public Long getDeployErrCode() {
        return this.DeployErrCode;
    }

    /**
     * Set 发布错误code
     * @param DeployErrCode 发布错误code
     */
    public void setDeployErrCode(Long DeployErrCode) {
        this.DeployErrCode = DeployErrCode;
    }

    /**
     * Get 发布错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployErrMsg 发布错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployErrMsg() {
        return this.DeployErrMsg;
    }

    /**
     * Set 发布错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployErrMsg 发布错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployErrMsg(String DeployErrMsg) {
        this.DeployErrMsg = DeployErrMsg;
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

    public DeployAppResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployAppResponse(DeployAppResponse source) {
        if (source.BuildId != null) {
            this.BuildId = new String(source.BuildId);
        }
        if (source.DeployErrCode != null) {
            this.DeployErrCode = new Long(source.DeployErrCode);
        }
        if (source.DeployErrMsg != null) {
            this.DeployErrMsg = new String(source.DeployErrMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BuildId", this.BuildId);
        this.setParamSimple(map, prefix + "DeployErrCode", this.DeployErrCode);
        this.setParamSimple(map, prefix + "DeployErrMsg", this.DeployErrMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

