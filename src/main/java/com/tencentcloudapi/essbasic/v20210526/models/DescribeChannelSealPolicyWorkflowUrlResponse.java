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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeChannelSealPolicyWorkflowUrlResponse extends AbstractModel {

    /**
    * 用印审批小程序链接，链接类型（通过H5唤起小程序或通过APP跳转方式查看）。
    */
    @SerializedName("WorkflowUrl")
    @Expose
    private String WorkflowUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用印审批小程序链接，链接类型（通过H5唤起小程序或通过APP跳转方式查看）。 
     * @return WorkflowUrl 用印审批小程序链接，链接类型（通过H5唤起小程序或通过APP跳转方式查看）。
     */
    public String getWorkflowUrl() {
        return this.WorkflowUrl;
    }

    /**
     * Set 用印审批小程序链接，链接类型（通过H5唤起小程序或通过APP跳转方式查看）。
     * @param WorkflowUrl 用印审批小程序链接，链接类型（通过H5唤起小程序或通过APP跳转方式查看）。
     */
    public void setWorkflowUrl(String WorkflowUrl) {
        this.WorkflowUrl = WorkflowUrl;
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

    public DescribeChannelSealPolicyWorkflowUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChannelSealPolicyWorkflowUrlResponse(DescribeChannelSealPolicyWorkflowUrlResponse source) {
        if (source.WorkflowUrl != null) {
            this.WorkflowUrl = new String(source.WorkflowUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowUrl", this.WorkflowUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

