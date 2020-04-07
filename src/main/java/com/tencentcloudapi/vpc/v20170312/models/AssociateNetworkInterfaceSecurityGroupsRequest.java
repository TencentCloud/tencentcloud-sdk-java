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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociateNetworkInterfaceSecurityGroupsRequest extends AbstractModel{

    /**
    * 弹性网卡实例ID。形如：eni-pxir56ns。每次请求的实例的上限为100。
    */
    @SerializedName("NetworkInterfaceIds")
    @Expose
    private String [] NetworkInterfaceIds;

    /**
    * 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。每次请求的实例的上限为100。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get 弹性网卡实例ID。形如：eni-pxir56ns。每次请求的实例的上限为100。 
     * @return NetworkInterfaceIds 弹性网卡实例ID。形如：eni-pxir56ns。每次请求的实例的上限为100。
     */
    public String [] getNetworkInterfaceIds() {
        return this.NetworkInterfaceIds;
    }

    /**
     * Set 弹性网卡实例ID。形如：eni-pxir56ns。每次请求的实例的上限为100。
     * @param NetworkInterfaceIds 弹性网卡实例ID。形如：eni-pxir56ns。每次请求的实例的上限为100。
     */
    public void setNetworkInterfaceIds(String [] NetworkInterfaceIds) {
        this.NetworkInterfaceIds = NetworkInterfaceIds;
    }

    /**
     * Get 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。每次请求的实例的上限为100。 
     * @return SecurityGroupIds 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。每次请求的实例的上限为100。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。每次请求的实例的上限为100。
     * @param SecurityGroupIds 安全组实例ID，例如：sg-33ocnj9n，可通过DescribeSecurityGroups获取。每次请求的实例的上限为100。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NetworkInterfaceIds.", this.NetworkInterfaceIds);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

