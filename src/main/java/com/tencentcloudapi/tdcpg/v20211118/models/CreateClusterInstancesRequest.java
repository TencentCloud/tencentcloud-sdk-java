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
package com.tencentcloudapi.tdcpg.v20211118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterInstancesRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * CPU核数。取值参考文档【购买指南】
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 内存大小，单位GiB。取值参考文档【购买指南】
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与InstanceId一致。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 新建实例的数量，默认为1。单集群下实例数量目前不能超过4个。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get CPU核数。取值参考文档【购买指南】 
     * @return CPU CPU核数。取值参考文档【购买指南】
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU核数。取值参考文档【购买指南】
     * @param CPU CPU核数。取值参考文档【购买指南】
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 内存大小，单位GiB。取值参考文档【购买指南】 
     * @return Memory 内存大小，单位GiB。取值参考文档【购买指南】
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位GiB。取值参考文档【购买指南】
     * @param Memory 内存大小，单位GiB。取值参考文档【购买指南】
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与InstanceId一致。 
     * @return InstanceName 实例名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与InstanceId一致。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与InstanceId一致。
     * @param InstanceName 实例名，1-60个字符，可以包含中文、英文、数字和符号"-"、"_"、"."。不输入此参数时默认与InstanceId一致。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 新建实例的数量，默认为1。单集群下实例数量目前不能超过4个。 
     * @return InstanceCount 新建实例的数量，默认为1。单集群下实例数量目前不能超过4个。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 新建实例的数量，默认为1。单集群下实例数量目前不能超过4个。
     * @param InstanceCount 新建实例的数量，默认为1。单集群下实例数量目前不能超过4个。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    public CreateClusterInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterInstancesRequest(CreateClusterInstancesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);

    }
}

