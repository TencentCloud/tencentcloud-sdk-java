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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstallClusterAgentRequest extends AbstractModel {

    /**
    * <p>集群CA证书MD5列表（单/批量统一）<br>用途：指定需要安装容器安全Agent（平行容器方式）的集群<br>取值参考：通过 DescribeClusterListV2 接口返回项中的 ClusterCaMD5 字段获取<br>说明：capi 层不对该字段做存在性/类型校验，按 cluster_ca_md5 透传到接入侧 ClusterInstall RPC</p>
    */
    @SerializedName("ClusterCaMD5List")
    @Expose
    private String [] ClusterCaMD5List;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>集群CA证书MD5列表（单/批量统一）<br>用途：指定需要安装容器安全Agent（平行容器方式）的集群<br>取值参考：通过 DescribeClusterListV2 接口返回项中的 ClusterCaMD5 字段获取<br>说明：capi 层不对该字段做存在性/类型校验，按 cluster_ca_md5 透传到接入侧 ClusterInstall RPC</p> 
     * @return ClusterCaMD5List <p>集群CA证书MD5列表（单/批量统一）<br>用途：指定需要安装容器安全Agent（平行容器方式）的集群<br>取值参考：通过 DescribeClusterListV2 接口返回项中的 ClusterCaMD5 字段获取<br>说明：capi 层不对该字段做存在性/类型校验，按 cluster_ca_md5 透传到接入侧 ClusterInstall RPC</p>
     */
    public String [] getClusterCaMD5List() {
        return this.ClusterCaMD5List;
    }

    /**
     * Set <p>集群CA证书MD5列表（单/批量统一）<br>用途：指定需要安装容器安全Agent（平行容器方式）的集群<br>取值参考：通过 DescribeClusterListV2 接口返回项中的 ClusterCaMD5 字段获取<br>说明：capi 层不对该字段做存在性/类型校验，按 cluster_ca_md5 透传到接入侧 ClusterInstall RPC</p>
     * @param ClusterCaMD5List <p>集群CA证书MD5列表（单/批量统一）<br>用途：指定需要安装容器安全Agent（平行容器方式）的集群<br>取值参考：通过 DescribeClusterListV2 接口返回项中的 ClusterCaMD5 字段获取<br>说明：capi 层不对该字段做存在性/类型校验，按 cluster_ca_md5 透传到接入侧 ClusterInstall RPC</p>
     */
    public void setClusterCaMD5List(String [] ClusterCaMD5List) {
        this.ClusterCaMD5List = ClusterCaMD5List;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public InstallClusterAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstallClusterAgentRequest(InstallClusterAgentRequest source) {
        if (source.ClusterCaMD5List != null) {
            this.ClusterCaMD5List = new String[source.ClusterCaMD5List.length];
            for (int i = 0; i < source.ClusterCaMD5List.length; i++) {
                this.ClusterCaMD5List[i] = new String(source.ClusterCaMD5List[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterCaMD5List.", this.ClusterCaMD5List);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

