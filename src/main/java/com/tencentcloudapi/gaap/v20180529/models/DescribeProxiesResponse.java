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

public class DescribeProxiesResponse  extends AbstractModel{

    /**
    * 通道个数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * （旧参数，请切换到ProxySet）通道实例信息列表。
    */
    @SerializedName("InstanceSet")
    @Expose
    private ProxyInfo [] InstanceSet;

    /**
    * （新参数）通道实例信息列表。
    */
    @SerializedName("ProxySet")
    @Expose
    private ProxyInfo [] ProxySet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取通道个数。
     * @return TotalCount 通道个数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置通道个数。
     * @param TotalCount 通道个数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取（旧参数，请切换到ProxySet）通道实例信息列表。
     * @return InstanceSet （旧参数，请切换到ProxySet）通道实例信息列表。
     */
    public ProxyInfo [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * 设置（旧参数，请切换到ProxySet）通道实例信息列表。
     * @param InstanceSet （旧参数，请切换到ProxySet）通道实例信息列表。
     */
    public void setInstanceSet(ProxyInfo [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    /**
     * 获取（新参数）通道实例信息列表。
     * @return ProxySet （新参数）通道实例信息列表。
     */
    public ProxyInfo [] getProxySet() {
        return this.ProxySet;
    }

    /**
     * 设置（新参数）通道实例信息列表。
     * @param ProxySet （新参数）通道实例信息列表。
     */
    public void setProxySet(ProxyInfo [] ProxySet) {
        this.ProxySet = ProxySet;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamArrayObj(map, prefix + "ProxySet.", this.ProxySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

