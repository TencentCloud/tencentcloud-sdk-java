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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountLimitsResponse extends AbstractModel{

    /**
    * 用户账户被允许创建的启动配置最大数量
    */
    @SerializedName("MaxNumberOfLaunchConfigurations")
    @Expose
    private Long MaxNumberOfLaunchConfigurations;

    /**
    * 用户账户启动配置的当前数量
    */
    @SerializedName("NumberOfLaunchConfigurations")
    @Expose
    private Long NumberOfLaunchConfigurations;

    /**
    * 用户账户被允许创建的伸缩组最大数量
    */
    @SerializedName("MaxNumberOfAutoScalingGroups")
    @Expose
    private Long MaxNumberOfAutoScalingGroups;

    /**
    * 用户账户伸缩组的当前数量
    */
    @SerializedName("NumberOfAutoScalingGroups")
    @Expose
    private Long NumberOfAutoScalingGroups;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户账户被允许创建的启动配置最大数量 
     * @return MaxNumberOfLaunchConfigurations 用户账户被允许创建的启动配置最大数量
     */
    public Long getMaxNumberOfLaunchConfigurations() {
        return this.MaxNumberOfLaunchConfigurations;
    }

    /**
     * Set 用户账户被允许创建的启动配置最大数量
     * @param MaxNumberOfLaunchConfigurations 用户账户被允许创建的启动配置最大数量
     */
    public void setMaxNumberOfLaunchConfigurations(Long MaxNumberOfLaunchConfigurations) {
        this.MaxNumberOfLaunchConfigurations = MaxNumberOfLaunchConfigurations;
    }

    /**
     * Get 用户账户启动配置的当前数量 
     * @return NumberOfLaunchConfigurations 用户账户启动配置的当前数量
     */
    public Long getNumberOfLaunchConfigurations() {
        return this.NumberOfLaunchConfigurations;
    }

    /**
     * Set 用户账户启动配置的当前数量
     * @param NumberOfLaunchConfigurations 用户账户启动配置的当前数量
     */
    public void setNumberOfLaunchConfigurations(Long NumberOfLaunchConfigurations) {
        this.NumberOfLaunchConfigurations = NumberOfLaunchConfigurations;
    }

    /**
     * Get 用户账户被允许创建的伸缩组最大数量 
     * @return MaxNumberOfAutoScalingGroups 用户账户被允许创建的伸缩组最大数量
     */
    public Long getMaxNumberOfAutoScalingGroups() {
        return this.MaxNumberOfAutoScalingGroups;
    }

    /**
     * Set 用户账户被允许创建的伸缩组最大数量
     * @param MaxNumberOfAutoScalingGroups 用户账户被允许创建的伸缩组最大数量
     */
    public void setMaxNumberOfAutoScalingGroups(Long MaxNumberOfAutoScalingGroups) {
        this.MaxNumberOfAutoScalingGroups = MaxNumberOfAutoScalingGroups;
    }

    /**
     * Get 用户账户伸缩组的当前数量 
     * @return NumberOfAutoScalingGroups 用户账户伸缩组的当前数量
     */
    public Long getNumberOfAutoScalingGroups() {
        return this.NumberOfAutoScalingGroups;
    }

    /**
     * Set 用户账户伸缩组的当前数量
     * @param NumberOfAutoScalingGroups 用户账户伸缩组的当前数量
     */
    public void setNumberOfAutoScalingGroups(Long NumberOfAutoScalingGroups) {
        this.NumberOfAutoScalingGroups = NumberOfAutoScalingGroups;
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
        this.setParamSimple(map, prefix + "MaxNumberOfLaunchConfigurations", this.MaxNumberOfLaunchConfigurations);
        this.setParamSimple(map, prefix + "NumberOfLaunchConfigurations", this.NumberOfLaunchConfigurations);
        this.setParamSimple(map, prefix + "MaxNumberOfAutoScalingGroups", this.MaxNumberOfAutoScalingGroups);
        this.setParamSimple(map, prefix + "NumberOfAutoScalingGroups", this.NumberOfAutoScalingGroups);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

