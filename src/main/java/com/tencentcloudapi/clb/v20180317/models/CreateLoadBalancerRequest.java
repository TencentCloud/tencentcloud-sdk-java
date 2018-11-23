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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerRequest  extends AbstractModel{

    /**
    * 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 负载均衡实例。1：应用型，0：传统型，默认为应用型负载均衡实例。
    */
    @SerializedName("Forward")
    @Expose
    private Integer Forward;

    /**
    * 负载均衡实例的名称，只用来创建一个的时候生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称重复的话，则系统将会自动生成此次创建的负载均衡实例的名称。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡后端实例所属网络 ID，可以通过 DescribeVpcEx 接口获取。 不填则默认为基础网络。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 在私有网络内购买内网负载均衡实例的时候需要指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。其他情况不用填写该字段。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。不填则属于默认项目。
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
     * 获取负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     * @return LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * 设置负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     * @param LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * 获取负载均衡实例。1：应用型，0：传统型，默认为应用型负载均衡实例。
     * @return Forward 负载均衡实例。1：应用型，0：传统型，默认为应用型负载均衡实例。
     */
    public Integer getForward() {
        return this.Forward;
    }

    /**
     * 设置负载均衡实例。1：应用型，0：传统型，默认为应用型负载均衡实例。
     * @param Forward 负载均衡实例。1：应用型，0：传统型，默认为应用型负载均衡实例。
     */
    public void setForward(Integer Forward) {
        this.Forward = Forward;
    }

    /**
     * 获取负载均衡实例的名称，只用来创建一个的时候生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称重复的话，则系统将会自动生成此次创建的负载均衡实例的名称。
     * @return LoadBalancerName 负载均衡实例的名称，只用来创建一个的时候生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称重复的话，则系统将会自动生成此次创建的负载均衡实例的名称。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * 设置负载均衡实例的名称，只用来创建一个的时候生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称重复的话，则系统将会自动生成此次创建的负载均衡实例的名称。
     * @param LoadBalancerName 负载均衡实例的名称，只用来创建一个的时候生效。规则：1-50 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称重复的话，则系统将会自动生成此次创建的负载均衡实例的名称。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * 获取负载均衡后端实例所属网络 ID，可以通过 DescribeVpcEx 接口获取。 不填则默认为基础网络。
     * @return VpcId 负载均衡后端实例所属网络 ID，可以通过 DescribeVpcEx 接口获取。 不填则默认为基础网络。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置负载均衡后端实例所属网络 ID，可以通过 DescribeVpcEx 接口获取。 不填则默认为基础网络。
     * @param VpcId 负载均衡后端实例所属网络 ID，可以通过 DescribeVpcEx 接口获取。 不填则默认为基础网络。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取在私有网络内购买内网负载均衡实例的时候需要指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。其他情况不用填写该字段。
     * @return SubnetId 在私有网络内购买内网负载均衡实例的时候需要指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。其他情况不用填写该字段。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置在私有网络内购买内网负载均衡实例的时候需要指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。其他情况不用填写该字段。
     * @param SubnetId 在私有网络内购买内网负载均衡实例的时候需要指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。其他情况不用填写该字段。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。不填则属于默认项目。
     * @return ProjectId 负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。不填则属于默认项目。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。不填则属于默认项目。
     * @param ProjectId 负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。不填则属于默认项目。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "Forward", this.Forward);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

