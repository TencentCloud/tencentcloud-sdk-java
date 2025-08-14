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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExpandGroupRequest extends AbstractModel {

    /**
    * 部署组ID，可通过调用[DescribeGroups](https://cloud.tencent.com/document/api/649/36065)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateGroup](https://cloud.tencent.com/document/api/649/36074)创建新的部署组。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 扩容的机器实例ID列表，调用[DescribeClusters](https://console.cloud.tencent.com/tsf/resource?rid=1)接口，选定一个虚拟机集群，选择部署组，选择应用扩容可获取实例列表
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
     * Get 部署组ID，可通过调用[DescribeGroups](https://cloud.tencent.com/document/api/649/36065)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateGroup](https://cloud.tencent.com/document/api/649/36074)创建新的部署组。 
     * @return GroupId 部署组ID，可通过调用[DescribeGroups](https://cloud.tencent.com/document/api/649/36065)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateGroup](https://cloud.tencent.com/document/api/649/36074)创建新的部署组。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID，可通过调用[DescribeGroups](https://cloud.tencent.com/document/api/649/36065)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateGroup](https://cloud.tencent.com/document/api/649/36074)创建新的部署组。
     * @param GroupId 部署组ID，可通过调用[DescribeGroups](https://cloud.tencent.com/document/api/649/36065)查询已创建的部署组列表或登录控制台进行查看；也可以调用[CreateGroup](https://cloud.tencent.com/document/api/649/36074)创建新的部署组。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 扩容的机器实例ID列表，调用[DescribeClusters](https://console.cloud.tencent.com/tsf/resource?rid=1)接口，选定一个虚拟机集群，选择部署组，选择应用扩容可获取实例列表 
     * @return InstanceIdList 扩容的机器实例ID列表，调用[DescribeClusters](https://console.cloud.tencent.com/tsf/resource?rid=1)接口，选定一个虚拟机集群，选择部署组，选择应用扩容可获取实例列表
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set 扩容的机器实例ID列表，调用[DescribeClusters](https://console.cloud.tencent.com/tsf/resource?rid=1)接口，选定一个虚拟机集群，选择部署组，选择应用扩容可获取实例列表
     * @param InstanceIdList 扩容的机器实例ID列表，调用[DescribeClusters](https://console.cloud.tencent.com/tsf/resource?rid=1)接口，选定一个虚拟机集群，选择部署组，选择应用扩容可获取实例列表
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    public ExpandGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpandGroupRequest(ExpandGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);

    }
}

