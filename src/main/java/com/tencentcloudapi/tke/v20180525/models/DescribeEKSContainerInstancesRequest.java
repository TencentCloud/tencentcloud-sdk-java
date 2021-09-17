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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEKSContainerInstancesRequest extends AbstractModel{

    /**
    * 限定此次返回资源的数量。如果不设定，默认返回20，最大不能超过100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量,默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件，可条件：
(1)实例名称
KeyName: eks-ci-name
类型：String

(2)实例状态
KeyName: status
类型：String
可选值："Pending", "Running", "Succeeded", "Failed"

(3)内网ip
KeyName: private-ip
类型：String

(4)EIP地址
KeyName: eip-address
类型：String

(5)VpcId
KeyName: vpc-id
类型：String
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 容器实例 ID 数组
    */
    @SerializedName("EksCiIds")
    @Expose
    private String [] EksCiIds;

    /**
     * Get 限定此次返回资源的数量。如果不设定，默认返回20，最大不能超过100 
     * @return Limit 限定此次返回资源的数量。如果不设定，默认返回20，最大不能超过100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限定此次返回资源的数量。如果不设定，默认返回20，最大不能超过100
     * @param Limit 限定此次返回资源的数量。如果不设定，默认返回20，最大不能超过100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量,默认0 
     * @return Offset 偏移量,默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量,默认0
     * @param Offset 偏移量,默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件，可条件：
(1)实例名称
KeyName: eks-ci-name
类型：String

(2)实例状态
KeyName: status
类型：String
可选值："Pending", "Running", "Succeeded", "Failed"

(3)内网ip
KeyName: private-ip
类型：String

(4)EIP地址
KeyName: eip-address
类型：String

(5)VpcId
KeyName: vpc-id
类型：String 
     * @return Filters 过滤条件，可条件：
(1)实例名称
KeyName: eks-ci-name
类型：String

(2)实例状态
KeyName: status
类型：String
可选值："Pending", "Running", "Succeeded", "Failed"

(3)内网ip
KeyName: private-ip
类型：String

(4)EIP地址
KeyName: eip-address
类型：String

(5)VpcId
KeyName: vpc-id
类型：String
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，可条件：
(1)实例名称
KeyName: eks-ci-name
类型：String

(2)实例状态
KeyName: status
类型：String
可选值："Pending", "Running", "Succeeded", "Failed"

(3)内网ip
KeyName: private-ip
类型：String

(4)EIP地址
KeyName: eip-address
类型：String

(5)VpcId
KeyName: vpc-id
类型：String
     * @param Filters 过滤条件，可条件：
(1)实例名称
KeyName: eks-ci-name
类型：String

(2)实例状态
KeyName: status
类型：String
可选值："Pending", "Running", "Succeeded", "Failed"

(3)内网ip
KeyName: private-ip
类型：String

(4)EIP地址
KeyName: eip-address
类型：String

(5)VpcId
KeyName: vpc-id
类型：String
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 容器实例 ID 数组 
     * @return EksCiIds 容器实例 ID 数组
     */
    public String [] getEksCiIds() {
        return this.EksCiIds;
    }

    /**
     * Set 容器实例 ID 数组
     * @param EksCiIds 容器实例 ID 数组
     */
    public void setEksCiIds(String [] EksCiIds) {
        this.EksCiIds = EksCiIds;
    }

    public DescribeEKSContainerInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEKSContainerInstancesRequest(DescribeEKSContainerInstancesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.EksCiIds != null) {
            this.EksCiIds = new String[source.EksCiIds.length];
            for (int i = 0; i < source.EksCiIds.length; i++) {
                this.EksCiIds[i] = new String(source.EksCiIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "EksCiIds.", this.EksCiIds);

    }
}

