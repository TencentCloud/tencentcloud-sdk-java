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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomerClusterAttr extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * vpc网络id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 客户端数量
    */
    @SerializedName("ClientNum")
    @Expose
    private Long ClientNum;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群类型：0: 默认集群（文件系统创建时构建，不可销毁）；1: 扩展集群（客户端数量为0时可销毁）
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * 管理节点信息
    */
    @SerializedName("ManagerNodes")
    @Expose
    private ClientClusterManagerNodeInfo [] ManagerNodes;

    /**
    * 集群状态：0:creating 创建中；1: created 创建完成; 2: deleting 删除中； 3: deleted 删除完成； 4:  failed 创建失败 
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 客户端集群挂载存储集合
    */
    @SerializedName("ClusterMountSet")
    @Expose
    private ClusterMountAttr [] ClusterMountSet;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get vpc网络id 
     * @return VpcId vpc网络id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc网络id
     * @param VpcId vpc网络id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id 
     * @return SubnetId 子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
     * @param SubnetId 子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 客户端数量 
     * @return ClientNum 客户端数量
     */
    public Long getClientNum() {
        return this.ClientNum;
    }

    /**
     * Set 客户端数量
     * @param ClientNum 客户端数量
     */
    public void setClientNum(Long ClientNum) {
        this.ClientNum = ClientNum;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群类型：0: 默认集群（文件系统创建时构建，不可销毁）；1: 扩展集群（客户端数量为0时可销毁） 
     * @return ClusterType 集群类型：0: 默认集群（文件系统创建时构建，不可销毁）；1: 扩展集群（客户端数量为0时可销毁）
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型：0: 默认集群（文件系统创建时构建，不可销毁）；1: 扩展集群（客户端数量为0时可销毁）
     * @param ClusterType 集群类型：0: 默认集群（文件系统创建时构建，不可销毁）；1: 扩展集群（客户端数量为0时可销毁）
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 管理节点信息 
     * @return ManagerNodes 管理节点信息
     */
    public ClientClusterManagerNodeInfo [] getManagerNodes() {
        return this.ManagerNodes;
    }

    /**
     * Set 管理节点信息
     * @param ManagerNodes 管理节点信息
     */
    public void setManagerNodes(ClientClusterManagerNodeInfo [] ManagerNodes) {
        this.ManagerNodes = ManagerNodes;
    }

    /**
     * Get 集群状态：0:creating 创建中；1: created 创建完成; 2: deleting 删除中； 3: deleted 删除完成； 4:  failed 创建失败  
     * @return Status 集群状态：0:creating 创建中；1: created 创建完成; 2: deleting 删除中； 3: deleted 删除完成； 4:  failed 创建失败 
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态：0:creating 创建中；1: created 创建完成; 2: deleting 删除中； 3: deleted 删除完成； 4:  failed 创建失败 
     * @param Status 集群状态：0:creating 创建中；1: created 创建完成; 2: deleting 删除中； 3: deleted 删除完成； 4:  failed 创建失败 
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 客户端集群挂载存储集合 
     * @return ClusterMountSet 客户端集群挂载存储集合
     */
    public ClusterMountAttr [] getClusterMountSet() {
        return this.ClusterMountSet;
    }

    /**
     * Set 客户端集群挂载存储集合
     * @param ClusterMountSet 客户端集群挂载存储集合
     */
    public void setClusterMountSet(ClusterMountAttr [] ClusterMountSet) {
        this.ClusterMountSet = ClusterMountSet;
    }

    public CustomerClusterAttr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomerClusterAttr(CustomerClusterAttr source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ClientNum != null) {
            this.ClientNum = new Long(source.ClientNum);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.ManagerNodes != null) {
            this.ManagerNodes = new ClientClusterManagerNodeInfo[source.ManagerNodes.length];
            for (int i = 0; i < source.ManagerNodes.length; i++) {
                this.ManagerNodes[i] = new ClientClusterManagerNodeInfo(source.ManagerNodes[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ClusterMountSet != null) {
            this.ClusterMountSet = new ClusterMountAttr[source.ClusterMountSet.length];
            for (int i = 0; i < source.ClusterMountSet.length; i++) {
                this.ClusterMountSet[i] = new ClusterMountAttr(source.ClusterMountSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ClientNum", this.ClientNum);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamArrayObj(map, prefix + "ManagerNodes.", this.ManagerNodes);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ClusterMountSet.", this.ClusterMountSet);

    }
}

