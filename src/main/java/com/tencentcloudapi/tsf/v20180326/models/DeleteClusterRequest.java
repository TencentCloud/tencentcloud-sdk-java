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

public class DeleteClusterRequest extends AbstractModel {

    /**
    * 集群ID，按照【集群ID】进行过滤，可通过调用DescribeClusters查询已创建的项目列表或登录控制台进行查看；也可以调用CreateCluster创建新的项目。集群ID例如：cls-6a79x94v。仅在集群下无部署组、命名空间、云主机时可以删除。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 是否只解绑，不删除容器集群，默认不传则删除容器集群。
    */
    @SerializedName("Unbind")
    @Expose
    private Boolean Unbind;

    /**
     * Get 集群ID，按照【集群ID】进行过滤，可通过调用DescribeClusters查询已创建的项目列表或登录控制台进行查看；也可以调用CreateCluster创建新的项目。集群ID例如：cls-6a79x94v。仅在集群下无部署组、命名空间、云主机时可以删除。 
     * @return ClusterId 集群ID，按照【集群ID】进行过滤，可通过调用DescribeClusters查询已创建的项目列表或登录控制台进行查看；也可以调用CreateCluster创建新的项目。集群ID例如：cls-6a79x94v。仅在集群下无部署组、命名空间、云主机时可以删除。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID，按照【集群ID】进行过滤，可通过调用DescribeClusters查询已创建的项目列表或登录控制台进行查看；也可以调用CreateCluster创建新的项目。集群ID例如：cls-6a79x94v。仅在集群下无部署组、命名空间、云主机时可以删除。
     * @param ClusterId 集群ID，按照【集群ID】进行过滤，可通过调用DescribeClusters查询已创建的项目列表或登录控制台进行查看；也可以调用CreateCluster创建新的项目。集群ID例如：cls-6a79x94v。仅在集群下无部署组、命名空间、云主机时可以删除。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 是否只解绑，不删除容器集群，默认不传则删除容器集群。 
     * @return Unbind 是否只解绑，不删除容器集群，默认不传则删除容器集群。
     */
    public Boolean getUnbind() {
        return this.Unbind;
    }

    /**
     * Set 是否只解绑，不删除容器集群，默认不传则删除容器集群。
     * @param Unbind 是否只解绑，不删除容器集群，默认不传则删除容器集群。
     */
    public void setUnbind(Boolean Unbind) {
        this.Unbind = Unbind;
    }

    public DeleteClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteClusterRequest(DeleteClusterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Unbind != null) {
            this.Unbind = new Boolean(source.Unbind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Unbind", this.Unbind);

    }
}

