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

public class ShrinkInstancesRequest extends AbstractModel {

    /**
    * 部署组ID，可通过调用[获取虚拟机部署组列表](https://cloud.tencent.com/document/api/649/36065)接口时出参中的Result.Content.GroupId，或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-aaaaaaaa&tab=publish&subTab=group)选择对应应用进入应用部署页面查看，同时也是调用[创建部署组](https://cloud.tencent.com/document/api/649/36074)接口返回的Result值
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 实例ID列表，实例ID可通过调用[查询虚拟机部署组云主机列表](https://cloud.tencent.com/document/product/649/36066)接口时出参中的Result.Content.InstanceId，或登录[控制台](https://console.cloud.tencent.com/tsf/resource-detail?rid=1&id=cluster-aaaaaaaa)选择对应的虚拟机集群查看云主机信息，同时也是[集群添加云主机](https://cloud.tencent.com/document/product/649/41225?ls=doc-search!current)接口的的返回值Result中的节点列表
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
     * Get 部署组ID，可通过调用[获取虚拟机部署组列表](https://cloud.tencent.com/document/api/649/36065)接口时出参中的Result.Content.GroupId，或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-aaaaaaaa&tab=publish&subTab=group)选择对应应用进入应用部署页面查看，同时也是调用[创建部署组](https://cloud.tencent.com/document/api/649/36074)接口返回的Result值 
     * @return GroupId 部署组ID，可通过调用[获取虚拟机部署组列表](https://cloud.tencent.com/document/api/649/36065)接口时出参中的Result.Content.GroupId，或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-aaaaaaaa&tab=publish&subTab=group)选择对应应用进入应用部署页面查看，同时也是调用[创建部署组](https://cloud.tencent.com/document/api/649/36074)接口返回的Result值
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID，可通过调用[获取虚拟机部署组列表](https://cloud.tencent.com/document/api/649/36065)接口时出参中的Result.Content.GroupId，或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-aaaaaaaa&tab=publish&subTab=group)选择对应应用进入应用部署页面查看，同时也是调用[创建部署组](https://cloud.tencent.com/document/api/649/36074)接口返回的Result值
     * @param GroupId 部署组ID，可通过调用[获取虚拟机部署组列表](https://cloud.tencent.com/document/api/649/36065)接口时出参中的Result.Content.GroupId，或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-aaaaaaaa&tab=publish&subTab=group)选择对应应用进入应用部署页面查看，同时也是调用[创建部署组](https://cloud.tencent.com/document/api/649/36074)接口返回的Result值
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 实例ID列表，实例ID可通过调用[查询虚拟机部署组云主机列表](https://cloud.tencent.com/document/product/649/36066)接口时出参中的Result.Content.InstanceId，或登录[控制台](https://console.cloud.tencent.com/tsf/resource-detail?rid=1&id=cluster-aaaaaaaa)选择对应的虚拟机集群查看云主机信息，同时也是[集群添加云主机](https://cloud.tencent.com/document/product/649/41225?ls=doc-search!current)接口的的返回值Result中的节点列表 
     * @return InstanceIdList 实例ID列表，实例ID可通过调用[查询虚拟机部署组云主机列表](https://cloud.tencent.com/document/product/649/36066)接口时出参中的Result.Content.InstanceId，或登录[控制台](https://console.cloud.tencent.com/tsf/resource-detail?rid=1&id=cluster-aaaaaaaa)选择对应的虚拟机集群查看云主机信息，同时也是[集群添加云主机](https://cloud.tencent.com/document/product/649/41225?ls=doc-search!current)接口的的返回值Result中的节点列表
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set 实例ID列表，实例ID可通过调用[查询虚拟机部署组云主机列表](https://cloud.tencent.com/document/product/649/36066)接口时出参中的Result.Content.InstanceId，或登录[控制台](https://console.cloud.tencent.com/tsf/resource-detail?rid=1&id=cluster-aaaaaaaa)选择对应的虚拟机集群查看云主机信息，同时也是[集群添加云主机](https://cloud.tencent.com/document/product/649/41225?ls=doc-search!current)接口的的返回值Result中的节点列表
     * @param InstanceIdList 实例ID列表，实例ID可通过调用[查询虚拟机部署组云主机列表](https://cloud.tencent.com/document/product/649/36066)接口时出参中的Result.Content.InstanceId，或登录[控制台](https://console.cloud.tencent.com/tsf/resource-detail?rid=1&id=cluster-aaaaaaaa)选择对应的虚拟机集群查看云主机信息，同时也是[集群添加云主机](https://cloud.tencent.com/document/product/649/41225?ls=doc-search!current)接口的的返回值Result中的节点列表
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    public ShrinkInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShrinkInstancesRequest(ShrinkInstancesRequest source) {
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

