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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesDeniedActionsResponse extends AbstractModel{

    /**
    * 实例操作限制列表详细信息。
    */
    @SerializedName("InstanceDeniedActionSet")
    @Expose
    private InstanceDeniedActions [] InstanceDeniedActionSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例操作限制列表详细信息。 
     * @return InstanceDeniedActionSet 实例操作限制列表详细信息。
     */
    public InstanceDeniedActions [] getInstanceDeniedActionSet() {
        return this.InstanceDeniedActionSet;
    }

    /**
     * Set 实例操作限制列表详细信息。
     * @param InstanceDeniedActionSet 实例操作限制列表详细信息。
     */
    public void setInstanceDeniedActionSet(InstanceDeniedActions [] InstanceDeniedActionSet) {
        this.InstanceDeniedActionSet = InstanceDeniedActionSet;
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

    public DescribeInstancesDeniedActionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesDeniedActionsResponse(DescribeInstancesDeniedActionsResponse source) {
        if (source.InstanceDeniedActionSet != null) {
            this.InstanceDeniedActionSet = new InstanceDeniedActions[source.InstanceDeniedActionSet.length];
            for (int i = 0; i < source.InstanceDeniedActionSet.length; i++) {
                this.InstanceDeniedActionSet[i] = new InstanceDeniedActions(source.InstanceDeniedActionSet[i]);
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
        this.setParamArrayObj(map, prefix + "InstanceDeniedActionSet.", this.InstanceDeniedActionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

