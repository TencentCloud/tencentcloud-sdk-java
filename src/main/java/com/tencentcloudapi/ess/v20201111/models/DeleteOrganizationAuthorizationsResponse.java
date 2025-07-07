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

public class DeleteOrganizationAuthorizationsResponse extends AbstractModel {

    /**
    * 清理的认证流的详细信息，其中包括企业名称，认证流唯一 Id 以及清理过程中产生的错误信息
    */
    @SerializedName("DeleteOrganizationAuthorizationInfos")
    @Expose
    private DeleteOrganizationAuthorizationInfo [] DeleteOrganizationAuthorizationInfos;

    /**
    * 批量清理认证流返回的状态值
其中包括
- 1 全部成功
- 2 部分成功
- 3 全部失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 清理的认证流的详细信息，其中包括企业名称，认证流唯一 Id 以及清理过程中产生的错误信息 
     * @return DeleteOrganizationAuthorizationInfos 清理的认证流的详细信息，其中包括企业名称，认证流唯一 Id 以及清理过程中产生的错误信息
     */
    public DeleteOrganizationAuthorizationInfo [] getDeleteOrganizationAuthorizationInfos() {
        return this.DeleteOrganizationAuthorizationInfos;
    }

    /**
     * Set 清理的认证流的详细信息，其中包括企业名称，认证流唯一 Id 以及清理过程中产生的错误信息
     * @param DeleteOrganizationAuthorizationInfos 清理的认证流的详细信息，其中包括企业名称，认证流唯一 Id 以及清理过程中产生的错误信息
     */
    public void setDeleteOrganizationAuthorizationInfos(DeleteOrganizationAuthorizationInfo [] DeleteOrganizationAuthorizationInfos) {
        this.DeleteOrganizationAuthorizationInfos = DeleteOrganizationAuthorizationInfos;
    }

    /**
     * Get 批量清理认证流返回的状态值
其中包括
- 1 全部成功
- 2 部分成功
- 3 全部失败 
     * @return Status 批量清理认证流返回的状态值
其中包括
- 1 全部成功
- 2 部分成功
- 3 全部失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 批量清理认证流返回的状态值
其中包括
- 1 全部成功
- 2 部分成功
- 3 全部失败
     * @param Status 批量清理认证流返回的状态值
其中包括
- 1 全部成功
- 2 部分成功
- 3 全部失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public DeleteOrganizationAuthorizationsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteOrganizationAuthorizationsResponse(DeleteOrganizationAuthorizationsResponse source) {
        if (source.DeleteOrganizationAuthorizationInfos != null) {
            this.DeleteOrganizationAuthorizationInfos = new DeleteOrganizationAuthorizationInfo[source.DeleteOrganizationAuthorizationInfos.length];
            for (int i = 0; i < source.DeleteOrganizationAuthorizationInfos.length; i++) {
                this.DeleteOrganizationAuthorizationInfos[i] = new DeleteOrganizationAuthorizationInfo(source.DeleteOrganizationAuthorizationInfos[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DeleteOrganizationAuthorizationInfos.", this.DeleteOrganizationAuthorizationInfos);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

