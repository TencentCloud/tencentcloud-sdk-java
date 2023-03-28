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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateIntegrationEmployeesResponse extends AbstractModel{

    /**
    * 更新成功的用户列表
    */
    @SerializedName("SuccessEmployeeData")
    @Expose
    private SuccessUpdateStaffData [] SuccessEmployeeData;

    /**
    * 更新失败的用户列表
    */
    @SerializedName("FailedEmployeeData")
    @Expose
    private FailedUpdateStaffData [] FailedEmployeeData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 更新成功的用户列表 
     * @return SuccessEmployeeData 更新成功的用户列表
     */
    public SuccessUpdateStaffData [] getSuccessEmployeeData() {
        return this.SuccessEmployeeData;
    }

    /**
     * Set 更新成功的用户列表
     * @param SuccessEmployeeData 更新成功的用户列表
     */
    public void setSuccessEmployeeData(SuccessUpdateStaffData [] SuccessEmployeeData) {
        this.SuccessEmployeeData = SuccessEmployeeData;
    }

    /**
     * Get 更新失败的用户列表 
     * @return FailedEmployeeData 更新失败的用户列表
     */
    public FailedUpdateStaffData [] getFailedEmployeeData() {
        return this.FailedEmployeeData;
    }

    /**
     * Set 更新失败的用户列表
     * @param FailedEmployeeData 更新失败的用户列表
     */
    public void setFailedEmployeeData(FailedUpdateStaffData [] FailedEmployeeData) {
        this.FailedEmployeeData = FailedEmployeeData;
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

    public UpdateIntegrationEmployeesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateIntegrationEmployeesResponse(UpdateIntegrationEmployeesResponse source) {
        if (source.SuccessEmployeeData != null) {
            this.SuccessEmployeeData = new SuccessUpdateStaffData[source.SuccessEmployeeData.length];
            for (int i = 0; i < source.SuccessEmployeeData.length; i++) {
                this.SuccessEmployeeData[i] = new SuccessUpdateStaffData(source.SuccessEmployeeData[i]);
            }
        }
        if (source.FailedEmployeeData != null) {
            this.FailedEmployeeData = new FailedUpdateStaffData[source.FailedEmployeeData.length];
            for (int i = 0; i < source.FailedEmployeeData.length; i++) {
                this.FailedEmployeeData[i] = new FailedUpdateStaffData(source.FailedEmployeeData[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SuccessEmployeeData.", this.SuccessEmployeeData);
        this.setParamArrayObj(map, prefix + "FailedEmployeeData.", this.FailedEmployeeData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

