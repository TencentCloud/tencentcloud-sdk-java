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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePrepareFlowResponse extends AbstractModel {

    /**
    * 发起流程的web页面链接，有效期5分钟
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 创建的合同id（还未实际发起），每次调用会生成新的id，用户可以记录此字段对应后续页面发起的合同，若在页面上未成功发起，则此字段无效。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 临时的草稿id（还未实际保存草稿），用户可以记录此字段对应后续页面保存的草稿，若在页面上未保存草稿，则此字段无效。
    */
    @SerializedName("DraftId")
    @Expose
    private String DraftId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 发起流程的web页面链接，有效期5分钟 
     * @return Url 发起流程的web页面链接，有效期5分钟
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 发起流程的web页面链接，有效期5分钟
     * @param Url 发起流程的web页面链接，有效期5分钟
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 创建的合同id（还未实际发起），每次调用会生成新的id，用户可以记录此字段对应后续页面发起的合同，若在页面上未成功发起，则此字段无效。 
     * @return FlowId 创建的合同id（还未实际发起），每次调用会生成新的id，用户可以记录此字段对应后续页面发起的合同，若在页面上未成功发起，则此字段无效。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 创建的合同id（还未实际发起），每次调用会生成新的id，用户可以记录此字段对应后续页面发起的合同，若在页面上未成功发起，则此字段无效。
     * @param FlowId 创建的合同id（还未实际发起），每次调用会生成新的id，用户可以记录此字段对应后续页面发起的合同，若在页面上未成功发起，则此字段无效。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 临时的草稿id（还未实际保存草稿），用户可以记录此字段对应后续页面保存的草稿，若在页面上未保存草稿，则此字段无效。 
     * @return DraftId 临时的草稿id（还未实际保存草稿），用户可以记录此字段对应后续页面保存的草稿，若在页面上未保存草稿，则此字段无效。
     */
    public String getDraftId() {
        return this.DraftId;
    }

    /**
     * Set 临时的草稿id（还未实际保存草稿），用户可以记录此字段对应后续页面保存的草稿，若在页面上未保存草稿，则此字段无效。
     * @param DraftId 临时的草稿id（还未实际保存草稿），用户可以记录此字段对应后续页面保存的草稿，若在页面上未保存草稿，则此字段无效。
     */
    public void setDraftId(String DraftId) {
        this.DraftId = DraftId;
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

    public CreatePrepareFlowResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrepareFlowResponse(CreatePrepareFlowResponse source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.DraftId != null) {
            this.DraftId = new String(source.DraftId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "DraftId", this.DraftId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

