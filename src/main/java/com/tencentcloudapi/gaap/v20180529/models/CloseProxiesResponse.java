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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloseProxiesResponse extends AbstractModel{

    /**
    * 非运行状态下的通道实例ID列表，不可开启。
    */
    @SerializedName("InvalidStatusInstanceSet")
    @Expose
    private String [] InvalidStatusInstanceSet;

    /**
    * 开启操作失败的通道实例ID列表。
    */
    @SerializedName("OperationFailedInstanceSet")
    @Expose
    private String [] OperationFailedInstanceSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 非运行状态下的通道实例ID列表，不可开启。 
     * @return InvalidStatusInstanceSet 非运行状态下的通道实例ID列表，不可开启。
     */
    public String [] getInvalidStatusInstanceSet() {
        return this.InvalidStatusInstanceSet;
    }

    /**
     * Set 非运行状态下的通道实例ID列表，不可开启。
     * @param InvalidStatusInstanceSet 非运行状态下的通道实例ID列表，不可开启。
     */
    public void setInvalidStatusInstanceSet(String [] InvalidStatusInstanceSet) {
        this.InvalidStatusInstanceSet = InvalidStatusInstanceSet;
    }

    /**
     * Get 开启操作失败的通道实例ID列表。 
     * @return OperationFailedInstanceSet 开启操作失败的通道实例ID列表。
     */
    public String [] getOperationFailedInstanceSet() {
        return this.OperationFailedInstanceSet;
    }

    /**
     * Set 开启操作失败的通道实例ID列表。
     * @param OperationFailedInstanceSet 开启操作失败的通道实例ID列表。
     */
    public void setOperationFailedInstanceSet(String [] OperationFailedInstanceSet) {
        this.OperationFailedInstanceSet = OperationFailedInstanceSet;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InvalidStatusInstanceSet.", this.InvalidStatusInstanceSet);
        this.setParamArraySimple(map, prefix + "OperationFailedInstanceSet.", this.OperationFailedInstanceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

