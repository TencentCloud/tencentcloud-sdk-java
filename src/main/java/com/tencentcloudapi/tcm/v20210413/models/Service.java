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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Service extends AbstractModel{

    /**
    * ClusterIP/NodePort/LoadBalancer
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 是否开启LB直通Pod
    */
    @SerializedName("CLBDirectAccess")
    @Expose
    private Boolean CLBDirectAccess;

    /**
    * 服务是否希望将外部流量路由到节点本地或集群范围的端点。 有两个可用选项：Cluster（默认）和 Local。Cluster 隐藏了客户端源 IP，可能导致第二跳到另一个节点；Local 保留客户端源 IP 并避免 LoadBalancer 和 NodePort 类型服务的第二跳。
    */
    @SerializedName("ExternalTrafficPolicy")
    @Expose
    private String ExternalTrafficPolicy;

    /**
     * Get ClusterIP/NodePort/LoadBalancer 
     * @return Type ClusterIP/NodePort/LoadBalancer
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set ClusterIP/NodePort/LoadBalancer
     * @param Type ClusterIP/NodePort/LoadBalancer
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 是否开启LB直通Pod 
     * @return CLBDirectAccess 是否开启LB直通Pod
     */
    public Boolean getCLBDirectAccess() {
        return this.CLBDirectAccess;
    }

    /**
     * Set 是否开启LB直通Pod
     * @param CLBDirectAccess 是否开启LB直通Pod
     */
    public void setCLBDirectAccess(Boolean CLBDirectAccess) {
        this.CLBDirectAccess = CLBDirectAccess;
    }

    /**
     * Get 服务是否希望将外部流量路由到节点本地或集群范围的端点。 有两个可用选项：Cluster（默认）和 Local。Cluster 隐藏了客户端源 IP，可能导致第二跳到另一个节点；Local 保留客户端源 IP 并避免 LoadBalancer 和 NodePort 类型服务的第二跳。 
     * @return ExternalTrafficPolicy 服务是否希望将外部流量路由到节点本地或集群范围的端点。 有两个可用选项：Cluster（默认）和 Local。Cluster 隐藏了客户端源 IP，可能导致第二跳到另一个节点；Local 保留客户端源 IP 并避免 LoadBalancer 和 NodePort 类型服务的第二跳。
     */
    public String getExternalTrafficPolicy() {
        return this.ExternalTrafficPolicy;
    }

    /**
     * Set 服务是否希望将外部流量路由到节点本地或集群范围的端点。 有两个可用选项：Cluster（默认）和 Local。Cluster 隐藏了客户端源 IP，可能导致第二跳到另一个节点；Local 保留客户端源 IP 并避免 LoadBalancer 和 NodePort 类型服务的第二跳。
     * @param ExternalTrafficPolicy 服务是否希望将外部流量路由到节点本地或集群范围的端点。 有两个可用选项：Cluster（默认）和 Local。Cluster 隐藏了客户端源 IP，可能导致第二跳到另一个节点；Local 保留客户端源 IP 并避免 LoadBalancer 和 NodePort 类型服务的第二跳。
     */
    public void setExternalTrafficPolicy(String ExternalTrafficPolicy) {
        this.ExternalTrafficPolicy = ExternalTrafficPolicy;
    }

    public Service() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Service(Service source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CLBDirectAccess != null) {
            this.CLBDirectAccess = new Boolean(source.CLBDirectAccess);
        }
        if (source.ExternalTrafficPolicy != null) {
            this.ExternalTrafficPolicy = new String(source.ExternalTrafficPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CLBDirectAccess", this.CLBDirectAccess);
        this.setParamSimple(map, prefix + "ExternalTrafficPolicy", this.ExternalTrafficPolicy);

    }
}

