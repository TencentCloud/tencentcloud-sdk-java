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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEndPointAndEndPointServiceResponse extends AbstractModel {

    /**
    * 终端节点id
    */
    @SerializedName("EndPointId")
    @Expose
    private String EndPointId;

    /**
    * 终端节点名
    */
    @SerializedName("EndPointName")
    @Expose
    private String EndPointName;

    /**
    * 终端节点服务ID
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * 终端节点的IP列表
    */
    @SerializedName("EndPointVipSet")
    @Expose
    private String [] EndPointVipSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 终端节点id 
     * @return EndPointId 终端节点id
     */
    public String getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set 终端节点id
     * @param EndPointId 终端节点id
     */
    public void setEndPointId(String EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Get 终端节点名 
     * @return EndPointName 终端节点名
     */
    public String getEndPointName() {
        return this.EndPointName;
    }

    /**
     * Set 终端节点名
     * @param EndPointName 终端节点名
     */
    public void setEndPointName(String EndPointName) {
        this.EndPointName = EndPointName;
    }

    /**
     * Get 终端节点服务ID 
     * @return EndPointServiceId 终端节点服务ID
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set 终端节点服务ID
     * @param EndPointServiceId 终端节点服务ID
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get 终端节点的IP列表 
     * @return EndPointVipSet 终端节点的IP列表
     */
    public String [] getEndPointVipSet() {
        return this.EndPointVipSet;
    }

    /**
     * Set 终端节点的IP列表
     * @param EndPointVipSet 终端节点的IP列表
     */
    public void setEndPointVipSet(String [] EndPointVipSet) {
        this.EndPointVipSet = EndPointVipSet;
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

    public CreateEndPointAndEndPointServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEndPointAndEndPointServiceResponse(CreateEndPointAndEndPointServiceResponse source) {
        if (source.EndPointId != null) {
            this.EndPointId = new String(source.EndPointId);
        }
        if (source.EndPointName != null) {
            this.EndPointName = new String(source.EndPointName);
        }
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.EndPointVipSet != null) {
            this.EndPointVipSet = new String[source.EndPointVipSet.length];
            for (int i = 0; i < source.EndPointVipSet.length; i++) {
                this.EndPointVipSet[i] = new String(source.EndPointVipSet[i]);
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
        this.setParamSimple(map, prefix + "EndPointId", this.EndPointId);
        this.setParamSimple(map, prefix + "EndPointName", this.EndPointName);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamArraySimple(map, prefix + "EndPointVipSet.", this.EndPointVipSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

