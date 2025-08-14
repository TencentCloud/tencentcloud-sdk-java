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

public class DeleteNamespaceRequest extends AbstractModel {

    /**
    * 命名空间ID，按照【命名空间ID】进行过滤，可通过调用[DescribeNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已创建的命名空间列表或登录控制台进行查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新命名空间。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 集群ID，按照【集群ID】进行过滤，可通过调用[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已创建的集群列表或登录控制台进行查看；也可以调用[CreateCluster](https://cloud.tencent.com/document/product/649/36049)创建新的集群。仅在集群下无部署组、命名空间、云主机时可以删除。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get 命名空间ID，按照【命名空间ID】进行过滤，可通过调用[DescribeNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已创建的命名空间列表或登录控制台进行查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新命名空间。 
     * @return NamespaceId 命名空间ID，按照【命名空间ID】进行过滤，可通过调用[DescribeNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已创建的命名空间列表或登录控制台进行查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新命名空间。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID，按照【命名空间ID】进行过滤，可通过调用[DescribeNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已创建的命名空间列表或登录控制台进行查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新命名空间。
     * @param NamespaceId 命名空间ID，按照【命名空间ID】进行过滤，可通过调用[DescribeNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已创建的命名空间列表或登录控制台进行查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新命名空间。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 集群ID，按照【集群ID】进行过滤，可通过调用[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已创建的集群列表或登录控制台进行查看；也可以调用[CreateCluster](https://cloud.tencent.com/document/product/649/36049)创建新的集群。仅在集群下无部署组、命名空间、云主机时可以删除。 
     * @return ClusterId 集群ID，按照【集群ID】进行过滤，可通过调用[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已创建的集群列表或登录控制台进行查看；也可以调用[CreateCluster](https://cloud.tencent.com/document/product/649/36049)创建新的集群。仅在集群下无部署组、命名空间、云主机时可以删除。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID，按照【集群ID】进行过滤，可通过调用[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已创建的集群列表或登录控制台进行查看；也可以调用[CreateCluster](https://cloud.tencent.com/document/product/649/36049)创建新的集群。仅在集群下无部署组、命名空间、云主机时可以删除。
     * @param ClusterId 集群ID，按照【集群ID】进行过滤，可通过调用[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已创建的集群列表或登录控制台进行查看；也可以调用[CreateCluster](https://cloud.tencent.com/document/product/649/36049)创建新的集群。仅在集群下无部署组、命名空间、云主机时可以删除。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public DeleteNamespaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNamespaceRequest(DeleteNamespaceRequest source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

