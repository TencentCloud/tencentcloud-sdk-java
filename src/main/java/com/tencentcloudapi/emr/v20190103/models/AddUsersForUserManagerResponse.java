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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddUsersForUserManagerResponse extends AbstractModel {

    /**
    * 添加成功的用户列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessUserList")
    @Expose
    private String [] SuccessUserList;

    /**
    * 添加失败的用户列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedUserList")
    @Expose
    private String [] FailedUserList;

    /**
    * 流程id。大于0表示启动了流程；等于0表示没有启动流程
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 添加成功的用户列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessUserList 添加成功的用户列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSuccessUserList() {
        return this.SuccessUserList;
    }

    /**
     * Set 添加成功的用户列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessUserList 添加成功的用户列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessUserList(String [] SuccessUserList) {
        this.SuccessUserList = SuccessUserList;
    }

    /**
     * Get 添加失败的用户列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedUserList 添加失败的用户列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFailedUserList() {
        return this.FailedUserList;
    }

    /**
     * Set 添加失败的用户列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedUserList 添加失败的用户列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedUserList(String [] FailedUserList) {
        this.FailedUserList = FailedUserList;
    }

    /**
     * Get 流程id。大于0表示启动了流程；等于0表示没有启动流程 
     * @return FlowId 流程id。大于0表示启动了流程；等于0表示没有启动流程
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流程id。大于0表示启动了流程；等于0表示没有启动流程
     * @param FlowId 流程id。大于0表示启动了流程；等于0表示没有启动流程
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
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

    public AddUsersForUserManagerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddUsersForUserManagerResponse(AddUsersForUserManagerResponse source) {
        if (source.SuccessUserList != null) {
            this.SuccessUserList = new String[source.SuccessUserList.length];
            for (int i = 0; i < source.SuccessUserList.length; i++) {
                this.SuccessUserList[i] = new String(source.SuccessUserList[i]);
            }
        }
        if (source.FailedUserList != null) {
            this.FailedUserList = new String[source.FailedUserList.length];
            for (int i = 0; i < source.FailedUserList.length; i++) {
                this.FailedUserList[i] = new String(source.FailedUserList[i]);
            }
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SuccessUserList.", this.SuccessUserList);
        this.setParamArraySimple(map, prefix + "FailedUserList.", this.FailedUserList);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

