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
package com.tencentcloudapi.cis.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContainerLogRequest extends AbstractModel{

    /**
    * 容器实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 容器名称
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 日志显示尾部行数
    */
    @SerializedName("Tail")
    @Expose
    private Long Tail;

    /**
    * 日志起始时间
    */
    @SerializedName("SinceTime")
    @Expose
    private String SinceTime;

    /**
     * Get 容器实例名称 
     * @return InstanceName 容器实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 容器实例名称
     * @param InstanceName 容器实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 容器名称 
     * @return ContainerName 容器名称
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名称
     * @param ContainerName 容器名称
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 日志显示尾部行数 
     * @return Tail 日志显示尾部行数
     */
    public Long getTail() {
        return this.Tail;
    }

    /**
     * Set 日志显示尾部行数
     * @param Tail 日志显示尾部行数
     */
    public void setTail(Long Tail) {
        this.Tail = Tail;
    }

    /**
     * Get 日志起始时间 
     * @return SinceTime 日志起始时间
     */
    public String getSinceTime() {
        return this.SinceTime;
    }

    /**
     * Set 日志起始时间
     * @param SinceTime 日志起始时间
     */
    public void setSinceTime(String SinceTime) {
        this.SinceTime = SinceTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "Tail", this.Tail);
        this.setParamSimple(map, prefix + "SinceTime", this.SinceTime);

    }
}

