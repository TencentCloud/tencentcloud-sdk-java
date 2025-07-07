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

public class DeleteIntegrationEmployeesResponse extends AbstractModel {

    /**
    * 员工删除结果。包含成功数据与失败数据。
<ul><li>**成功数据**：展示员工姓名、手机号与电子签平台UserId</li>
<li>**失败数据**：展示员工电子签平台UserId、第三方平台OpenId和失败原因</li></ul>
    */
    @SerializedName("DeleteEmployeeResult")
    @Expose
    private DeleteStaffsResult DeleteEmployeeResult;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 员工删除结果。包含成功数据与失败数据。
<ul><li>**成功数据**：展示员工姓名、手机号与电子签平台UserId</li>
<li>**失败数据**：展示员工电子签平台UserId、第三方平台OpenId和失败原因</li></ul> 
     * @return DeleteEmployeeResult 员工删除结果。包含成功数据与失败数据。
<ul><li>**成功数据**：展示员工姓名、手机号与电子签平台UserId</li>
<li>**失败数据**：展示员工电子签平台UserId、第三方平台OpenId和失败原因</li></ul>
     */
    public DeleteStaffsResult getDeleteEmployeeResult() {
        return this.DeleteEmployeeResult;
    }

    /**
     * Set 员工删除结果。包含成功数据与失败数据。
<ul><li>**成功数据**：展示员工姓名、手机号与电子签平台UserId</li>
<li>**失败数据**：展示员工电子签平台UserId、第三方平台OpenId和失败原因</li></ul>
     * @param DeleteEmployeeResult 员工删除结果。包含成功数据与失败数据。
<ul><li>**成功数据**：展示员工姓名、手机号与电子签平台UserId</li>
<li>**失败数据**：展示员工电子签平台UserId、第三方平台OpenId和失败原因</li></ul>
     */
    public void setDeleteEmployeeResult(DeleteStaffsResult DeleteEmployeeResult) {
        this.DeleteEmployeeResult = DeleteEmployeeResult;
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

    public DeleteIntegrationEmployeesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIntegrationEmployeesResponse(DeleteIntegrationEmployeesResponse source) {
        if (source.DeleteEmployeeResult != null) {
            this.DeleteEmployeeResult = new DeleteStaffsResult(source.DeleteEmployeeResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DeleteEmployeeResult.", this.DeleteEmployeeResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

