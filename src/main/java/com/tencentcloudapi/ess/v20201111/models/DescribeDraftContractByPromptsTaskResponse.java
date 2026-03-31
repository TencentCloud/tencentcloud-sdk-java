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

public class DescribeDraftContractByPromptsTaskResponse extends AbstractModel {

    /**
    * 任务状态，枚举，0 已创建，1 执行中，2 成功，3 失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务错误信息，仅在失败时返回
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 生成的合同名称
    */
    @SerializedName("ContractName")
    @Expose
    private String ContractName;

    /**
    * 生成的合同文件资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 生成的合同文件下载链接，有效期2小时
    */
    @SerializedName("ContractUrl")
    @Expose
    private String ContractUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务状态，枚举，0 已创建，1 执行中，2 成功，3 失败 
     * @return Status 任务状态，枚举，0 已创建，1 执行中，2 成功，3 失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，枚举，0 已创建，1 执行中，2 成功，3 失败
     * @param Status 任务状态，枚举，0 已创建，1 执行中，2 成功，3 失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务错误信息，仅在失败时返回 
     * @return Message 任务错误信息，仅在失败时返回
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 任务错误信息，仅在失败时返回
     * @param Message 任务错误信息，仅在失败时返回
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 生成的合同名称 
     * @return ContractName 生成的合同名称
     */
    public String getContractName() {
        return this.ContractName;
    }

    /**
     * Set 生成的合同名称
     * @param ContractName 生成的合同名称
     */
    public void setContractName(String ContractName) {
        this.ContractName = ContractName;
    }

    /**
     * Get 生成的合同文件资源id 
     * @return ResourceId 生成的合同文件资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 生成的合同文件资源id
     * @param ResourceId 生成的合同文件资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 生成的合同文件下载链接，有效期2小时 
     * @return ContractUrl 生成的合同文件下载链接，有效期2小时
     */
    public String getContractUrl() {
        return this.ContractUrl;
    }

    /**
     * Set 生成的合同文件下载链接，有效期2小时
     * @param ContractUrl 生成的合同文件下载链接，有效期2小时
     */
    public void setContractUrl(String ContractUrl) {
        this.ContractUrl = ContractUrl;
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

    public DescribeDraftContractByPromptsTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDraftContractByPromptsTaskResponse(DescribeDraftContractByPromptsTaskResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ContractName != null) {
            this.ContractName = new String(source.ContractName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ContractUrl != null) {
            this.ContractUrl = new String(source.ContractUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "ContractName", this.ContractName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ContractUrl", this.ContractUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

