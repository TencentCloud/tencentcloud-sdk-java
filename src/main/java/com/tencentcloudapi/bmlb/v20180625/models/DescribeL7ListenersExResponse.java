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

public class DescribeL7ListenersExResponse extends AbstractModel{

    /**
    * 此指定VPC中负载均衡的总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 符合条件的监听器。
    */
    @SerializedName("ListenerSet")
    @Expose
    private L7ExListener [] ListenerSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 此指定VPC中负载均衡的总数。 
     * @return TotalCount 此指定VPC中负载均衡的总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 此指定VPC中负载均衡的总数。
     * @param TotalCount 此指定VPC中负载均衡的总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 符合条件的监听器。 
     * @return ListenerSet 符合条件的监听器。
     */
    public L7ExListener [] getListenerSet() {
        return this.ListenerSet;
    }

    /**
     * Set 符合条件的监听器。
     * @param ListenerSet 符合条件的监听器。
     */
    public void setListenerSet(L7ExListener [] ListenerSet) {
        this.ListenerSet = ListenerSet;
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

    public DescribeL7ListenersExResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeL7ListenersExResponse(DescribeL7ListenersExResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ListenerSet != null) {
            this.ListenerSet = new L7ExListener[source.ListenerSet.length];
            for (int i = 0; i < source.ListenerSet.length; i++) {
                this.ListenerSet[i] = new L7ExListener(source.ListenerSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ListenerSet.", this.ListenerSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

