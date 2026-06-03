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

public class CreateArchiveFlowTaskRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>归档合同列表，一次最多支持50个合同</p>
    */
    @SerializedName("ArchiveFlows")
    @Expose
    private CreateArchiveFlow [] ArchiveFlows;

    /**
     * Get <p>执行本接口操作的员工信息。注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行本接口操作的员工信息。注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行本接口操作的员工信息。注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>归档合同列表，一次最多支持50个合同</p> 
     * @return ArchiveFlows <p>归档合同列表，一次最多支持50个合同</p>
     */
    public CreateArchiveFlow [] getArchiveFlows() {
        return this.ArchiveFlows;
    }

    /**
     * Set <p>归档合同列表，一次最多支持50个合同</p>
     * @param ArchiveFlows <p>归档合同列表，一次最多支持50个合同</p>
     */
    public void setArchiveFlows(CreateArchiveFlow [] ArchiveFlows) {
        this.ArchiveFlows = ArchiveFlows;
    }

    public CreateArchiveFlowTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateArchiveFlowTaskRequest(CreateArchiveFlowTaskRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.ArchiveFlows != null) {
            this.ArchiveFlows = new CreateArchiveFlow[source.ArchiveFlows.length];
            for (int i = 0; i < source.ArchiveFlows.length; i++) {
                this.ArchiveFlows[i] = new CreateArchiveFlow(source.ArchiveFlows[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArrayObj(map, prefix + "ArchiveFlows.", this.ArchiveFlows);

    }
}

