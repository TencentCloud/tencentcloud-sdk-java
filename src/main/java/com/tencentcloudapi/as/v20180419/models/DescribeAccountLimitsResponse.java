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

public class DescribeAccountLimitsResponse  extends AbstractModel{

    /**
    * 用户账户被允许创建的启动配置最大数量
    */
    @SerializedName("MaxNumberOfLaunchConfigurations")
    @Expose
    private Integer MaxNumberOfLaunchConfigurations;

    /**
    * 用户账户启动配置的当前数量
    */
    @SerializedName("NumberOfLaunchConfigurations")
    @Expose
    private Integer NumberOfLaunchConfigurations;

    /**
    * 用户账户被允许创建的伸缩组最大数量
    */
    @SerializedName("MaxNumberOfAutoScalingGroups")
    @Expose
    private Integer MaxNumberOfAutoScalingGroups;

    /**
    * 用户账户伸缩组的当前数量
    */
    @SerializedName("NumberOfAutoScalingGroups")
    @Expose
    private Integer NumberOfAutoScalingGroups;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取用户账户被允许创建的启动配置最大数量
     * @return MaxNumberOfLaunchConfigurations 用户账户被允许创建的启动配置最大数量
     */
    public Integer getMaxNumberOfLaunchConfigurations() {
        return this.MaxNumberOfLaunchConfigurations;
    }

    /**
     * 设置用户账户被允许创建的启动配置最大数量
     * @param MaxNumberOfLaunchConfigurations 用户账户被允许创建的启动配置最大数量
     */
    public void setMaxNumberOfLaunchConfigurations(Integer MaxNumberOfLaunchConfigurations) {
        this.MaxNumberOfLaunchConfigurations = MaxNumberOfLaunchConfigurations;
    }

    /**
     * 获取用户账户启动配置的当前数量
     * @return NumberOfLaunchConfigurations 用户账户启动配置的当前数量
     */
    public Integer getNumberOfLaunchConfigurations() {
        return this.NumberOfLaunchConfigurations;
    }

    /**
     * 设置用户账户启动配置的当前数量
     * @param NumberOfLaunchConfigurations 用户账户启动配置的当前数量
     */
    public void setNumberOfLaunchConfigurations(Integer NumberOfLaunchConfigurations) {
        this.NumberOfLaunchConfigurations = NumberOfLaunchConfigurations;
    }

    /**
     * 获取用户账户被允许创建的伸缩组最大数量
     * @return MaxNumberOfAutoScalingGroups 用户账户被允许创建的伸缩组最大数量
     */
    public Integer getMaxNumberOfAutoScalingGroups() {
        return this.MaxNumberOfAutoScalingGroups;
    }

    /**
     * 设置用户账户被允许创建的伸缩组最大数量
     * @param MaxNumberOfAutoScalingGroups 用户账户被允许创建的伸缩组最大数量
     */
    public void setMaxNumberOfAutoScalingGroups(Integer MaxNumberOfAutoScalingGroups) {
        this.MaxNumberOfAutoScalingGroups = MaxNumberOfAutoScalingGroups;
    }

    /**
     * 获取用户账户伸缩组的当前数量
     * @return NumberOfAutoScalingGroups 用户账户伸缩组的当前数量
     */
    public Integer getNumberOfAutoScalingGroups() {
        return this.NumberOfAutoScalingGroups;
    }

    /**
     * 设置用户账户伸缩组的当前数量
     * @param NumberOfAutoScalingGroups 用户账户伸缩组的当前数量
     */
    public void setNumberOfAutoScalingGroups(Integer NumberOfAutoScalingGroups) {
        this.NumberOfAutoScalingGroups = NumberOfAutoScalingGroups;
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
        this.setParamSimple(map, prefix + "MaxNumberOfLaunchConfigurations", this.MaxNumberOfLaunchConfigurations);
        this.setParamSimple(map, prefix + "NumberOfLaunchConfigurations", this.NumberOfLaunchConfigurations);
        this.setParamSimple(map, prefix + "MaxNumberOfAutoScalingGroups", this.MaxNumberOfAutoScalingGroups);
        this.setParamSimple(map, prefix + "NumberOfAutoScalingGroups", this.NumberOfAutoScalingGroups);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

