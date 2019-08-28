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

public class DescribeClusterInstancesRequest  extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 需要获取的节点实例Id列表。如果为空，表示拉取集群下所有节点实例。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER。默认为WORKER类型。
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
     * 获取集群ID
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * 设置集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * 获取偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @return Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @return Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取需要获取的节点实例Id列表。如果为空，表示拉取集群下所有节点实例。
     * @return InstanceIds 需要获取的节点实例Id列表。如果为空，表示拉取集群下所有节点实例。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置需要获取的节点实例Id列表。如果为空，表示拉取集群下所有节点实例。
     * @param InstanceIds 需要获取的节点实例Id列表。如果为空，表示拉取集群下所有节点实例。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 获取节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER。默认为WORKER类型。
     * @return InstanceRole 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER。默认为WORKER类型。
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * 设置节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER。默认为WORKER类型。
     * @param InstanceRole 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER。默认为WORKER类型。
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);

    }
}

