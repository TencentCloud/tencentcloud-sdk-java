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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelServiceGroupResponse extends AbstractModel{

    /**
    * 服务组信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceGroup")
    @Expose
    private ServiceGroup ServiceGroup;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 服务组信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceGroup 服务组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceGroup getServiceGroup() {
        return this.ServiceGroup;
    }

    /**
     * Set 服务组信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceGroup 服务组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceGroup(ServiceGroup ServiceGroup) {
        this.ServiceGroup = ServiceGroup;
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

    public DescribeModelServiceGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelServiceGroupResponse(DescribeModelServiceGroupResponse source) {
        if (source.ServiceGroup != null) {
            this.ServiceGroup = new ServiceGroup(source.ServiceGroup);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ServiceGroup.", this.ServiceGroup);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

