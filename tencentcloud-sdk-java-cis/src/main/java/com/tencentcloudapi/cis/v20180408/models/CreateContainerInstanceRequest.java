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

public class CreateContainerInstanceRequest extends AbstractModel{

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * vpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * subnetId
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 容器实例名称，由小写字母、数字和 - 组成，由小写字母开头，小写字母或数字结尾，且长度不超过 40个字符
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 重启策略（Always,OnFailure,Never）
    */
    @SerializedName("RestartPolicy")
    @Expose
    private String RestartPolicy;

    /**
    * 容器列表
    */
    @SerializedName("Containers")
    @Expose
    private Container [] Containers;

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get vpcId 
     * @return VpcId vpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId
     * @param VpcId vpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get subnetId 
     * @return SubnetId subnetId
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set subnetId
     * @param SubnetId subnetId
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 容器实例名称，由小写字母、数字和 - 组成，由小写字母开头，小写字母或数字结尾，且长度不超过 40个字符 
     * @return InstanceName 容器实例名称，由小写字母、数字和 - 组成，由小写字母开头，小写字母或数字结尾，且长度不超过 40个字符
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 容器实例名称，由小写字母、数字和 - 组成，由小写字母开头，小写字母或数字结尾，且长度不超过 40个字符
     * @param InstanceName 容器实例名称，由小写字母、数字和 - 组成，由小写字母开头，小写字母或数字结尾，且长度不超过 40个字符
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 重启策略（Always,OnFailure,Never） 
     * @return RestartPolicy 重启策略（Always,OnFailure,Never）
     */
    public String getRestartPolicy() {
        return this.RestartPolicy;
    }

    /**
     * Set 重启策略（Always,OnFailure,Never）
     * @param RestartPolicy 重启策略（Always,OnFailure,Never）
     */
    public void setRestartPolicy(String RestartPolicy) {
        this.RestartPolicy = RestartPolicy;
    }

    /**
     * Get 容器列表 
     * @return Containers 容器列表
     */
    public Container [] getContainers() {
        return this.Containers;
    }

    /**
     * Set 容器列表
     * @param Containers 容器列表
     */
    public void setContainers(Container [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RestartPolicy", this.RestartPolicy);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);

    }
}

