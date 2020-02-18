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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficMirrorsResponse extends AbstractModel{

    /**
    * 流量镜像总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 对象数组。数组元素为流量镜像信息，具体结构描述如list结构所示。
    */
    @SerializedName("TrafficMirrorSet")
    @Expose
    private TrafficMirror [] TrafficMirrorSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 流量镜像总数。 
     * @return TotalCount 流量镜像总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 流量镜像总数。
     * @param TotalCount 流量镜像总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 对象数组。数组元素为流量镜像信息，具体结构描述如list结构所示。 
     * @return TrafficMirrorSet 对象数组。数组元素为流量镜像信息，具体结构描述如list结构所示。
     */
    public TrafficMirror [] getTrafficMirrorSet() {
        return this.TrafficMirrorSet;
    }

    /**
     * Set 对象数组。数组元素为流量镜像信息，具体结构描述如list结构所示。
     * @param TrafficMirrorSet 对象数组。数组元素为流量镜像信息，具体结构描述如list结构所示。
     */
    public void setTrafficMirrorSet(TrafficMirror [] TrafficMirrorSet) {
        this.TrafficMirrorSet = TrafficMirrorSet;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TrafficMirrorSet.", this.TrafficMirrorSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

