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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeShieldPlanInstanceResponse extends AbstractModel {

    /**
    * 绑定资源信息
    */
    @SerializedName("BindInfo")
    @Expose
    private BindInfo BindInfo;

    /**
    * 加固策略信息
    */
    @SerializedName("ShieldPlanInfo")
    @Expose
    private ShieldPlanInfo ShieldPlanInfo;

    /**
    * 加固资源信息
    */
    @SerializedName("ResourceServiceInfo")
    @Expose
    private ResourceServiceInfo ResourceServiceInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 绑定资源信息 
     * @return BindInfo 绑定资源信息
     */
    public BindInfo getBindInfo() {
        return this.BindInfo;
    }

    /**
     * Set 绑定资源信息
     * @param BindInfo 绑定资源信息
     */
    public void setBindInfo(BindInfo BindInfo) {
        this.BindInfo = BindInfo;
    }

    /**
     * Get 加固策略信息 
     * @return ShieldPlanInfo 加固策略信息
     */
    public ShieldPlanInfo getShieldPlanInfo() {
        return this.ShieldPlanInfo;
    }

    /**
     * Set 加固策略信息
     * @param ShieldPlanInfo 加固策略信息
     */
    public void setShieldPlanInfo(ShieldPlanInfo ShieldPlanInfo) {
        this.ShieldPlanInfo = ShieldPlanInfo;
    }

    /**
     * Get 加固资源信息 
     * @return ResourceServiceInfo 加固资源信息
     */
    public ResourceServiceInfo getResourceServiceInfo() {
        return this.ResourceServiceInfo;
    }

    /**
     * Set 加固资源信息
     * @param ResourceServiceInfo 加固资源信息
     */
    public void setResourceServiceInfo(ResourceServiceInfo ResourceServiceInfo) {
        this.ResourceServiceInfo = ResourceServiceInfo;
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

    public DescribeShieldPlanInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeShieldPlanInstanceResponse(DescribeShieldPlanInstanceResponse source) {
        if (source.BindInfo != null) {
            this.BindInfo = new BindInfo(source.BindInfo);
        }
        if (source.ShieldPlanInfo != null) {
            this.ShieldPlanInfo = new ShieldPlanInfo(source.ShieldPlanInfo);
        }
        if (source.ResourceServiceInfo != null) {
            this.ResourceServiceInfo = new ResourceServiceInfo(source.ResourceServiceInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BindInfo.", this.BindInfo);
        this.setParamObj(map, prefix + "ShieldPlanInfo.", this.ShieldPlanInfo);
        this.setParamObj(map, prefix + "ResourceServiceInfo.", this.ResourceServiceInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

