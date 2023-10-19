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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDSPASelfBuildMetaResourceResponse extends AbstractModel {

    /**
    * 连通性测试情况，success表示可正常访问，failed表示无法访问。
    */
    @SerializedName("ConnectivityStatus")
    @Expose
    private String ConnectivityStatus;

    /**
    * 连通性描述字段，如果连通性测试失败，这里会返回无法访问的相关信息说明。
    */
    @SerializedName("ConnectivityDescription")
    @Expose
    private String ConnectivityDescription;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 连通性测试情况，success表示可正常访问，failed表示无法访问。 
     * @return ConnectivityStatus 连通性测试情况，success表示可正常访问，failed表示无法访问。
     */
    public String getConnectivityStatus() {
        return this.ConnectivityStatus;
    }

    /**
     * Set 连通性测试情况，success表示可正常访问，failed表示无法访问。
     * @param ConnectivityStatus 连通性测试情况，success表示可正常访问，failed表示无法访问。
     */
    public void setConnectivityStatus(String ConnectivityStatus) {
        this.ConnectivityStatus = ConnectivityStatus;
    }

    /**
     * Get 连通性描述字段，如果连通性测试失败，这里会返回无法访问的相关信息说明。 
     * @return ConnectivityDescription 连通性描述字段，如果连通性测试失败，这里会返回无法访问的相关信息说明。
     */
    public String getConnectivityDescription() {
        return this.ConnectivityDescription;
    }

    /**
     * Set 连通性描述字段，如果连通性测试失败，这里会返回无法访问的相关信息说明。
     * @param ConnectivityDescription 连通性描述字段，如果连通性测试失败，这里会返回无法访问的相关信息说明。
     */
    public void setConnectivityDescription(String ConnectivityDescription) {
        this.ConnectivityDescription = ConnectivityDescription;
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

    public CreateDSPASelfBuildMetaResourceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDSPASelfBuildMetaResourceResponse(CreateDSPASelfBuildMetaResourceResponse source) {
        if (source.ConnectivityStatus != null) {
            this.ConnectivityStatus = new String(source.ConnectivityStatus);
        }
        if (source.ConnectivityDescription != null) {
            this.ConnectivityDescription = new String(source.ConnectivityDescription);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectivityStatus", this.ConnectivityStatus);
        this.setParamSimple(map, prefix + "ConnectivityDescription", this.ConnectivityDescription);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

