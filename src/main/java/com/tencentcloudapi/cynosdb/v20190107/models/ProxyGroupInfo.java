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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyGroupInfo extends AbstractModel{

    /**
    * 数据库代理组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyGroup")
    @Expose
    private ProxyGroup ProxyGroup;

    /**
    * 数据库代理组读写分离信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyGroupRwInfo")
    @Expose
    private ProxyGroupRwInfo ProxyGroupRwInfo;

    /**
    * 数据库代理节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyNodes")
    @Expose
    private ProxyNodeInfo [] ProxyNodes;

    /**
    * 数据库代理连接池信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionPool")
    @Expose
    private ProxyConnectionPoolInfo ConnectionPool;

    /**
    * 数据库代理网络信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetAddrInfos")
    @Expose
    private NetAddr [] NetAddrInfos;

    /**
    * 数据库代理任务集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
     * Get 数据库代理组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyGroup 数据库代理组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProxyGroup getProxyGroup() {
        return this.ProxyGroup;
    }

    /**
     * Set 数据库代理组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyGroup 数据库代理组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyGroup(ProxyGroup ProxyGroup) {
        this.ProxyGroup = ProxyGroup;
    }

    /**
     * Get 数据库代理组读写分离信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyGroupRwInfo 数据库代理组读写分离信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProxyGroupRwInfo getProxyGroupRwInfo() {
        return this.ProxyGroupRwInfo;
    }

    /**
     * Set 数据库代理组读写分离信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyGroupRwInfo 数据库代理组读写分离信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyGroupRwInfo(ProxyGroupRwInfo ProxyGroupRwInfo) {
        this.ProxyGroupRwInfo = ProxyGroupRwInfo;
    }

    /**
     * Get 数据库代理节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyNodes 数据库代理节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProxyNodeInfo [] getProxyNodes() {
        return this.ProxyNodes;
    }

    /**
     * Set 数据库代理节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyNodes 数据库代理节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyNodes(ProxyNodeInfo [] ProxyNodes) {
        this.ProxyNodes = ProxyNodes;
    }

    /**
     * Get 数据库代理连接池信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionPool 数据库代理连接池信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProxyConnectionPoolInfo getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set 数据库代理连接池信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionPool 数据库代理连接池信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionPool(ProxyConnectionPoolInfo ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get 数据库代理网络信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetAddrInfos 数据库代理网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetAddr [] getNetAddrInfos() {
        return this.NetAddrInfos;
    }

    /**
     * Set 数据库代理网络信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetAddrInfos 数据库代理网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetAddrInfos(NetAddr [] NetAddrInfos) {
        this.NetAddrInfos = NetAddrInfos;
    }

    /**
     * Get 数据库代理任务集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks 数据库代理任务集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 数据库代理任务集
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks 数据库代理任务集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    public ProxyGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroupInfo(ProxyGroupInfo source) {
        if (source.ProxyGroup != null) {
            this.ProxyGroup = new ProxyGroup(source.ProxyGroup);
        }
        if (source.ProxyGroupRwInfo != null) {
            this.ProxyGroupRwInfo = new ProxyGroupRwInfo(source.ProxyGroupRwInfo);
        }
        if (source.ProxyNodes != null) {
            this.ProxyNodes = new ProxyNodeInfo[source.ProxyNodes.length];
            for (int i = 0; i < source.ProxyNodes.length; i++) {
                this.ProxyNodes[i] = new ProxyNodeInfo(source.ProxyNodes[i]);
            }
        }
        if (source.ConnectionPool != null) {
            this.ConnectionPool = new ProxyConnectionPoolInfo(source.ConnectionPool);
        }
        if (source.NetAddrInfos != null) {
            this.NetAddrInfos = new NetAddr[source.NetAddrInfos.length];
            for (int i = 0; i < source.NetAddrInfos.length; i++) {
                this.NetAddrInfos[i] = new NetAddr(source.NetAddrInfos[i]);
            }
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ProxyGroup.", this.ProxyGroup);
        this.setParamObj(map, prefix + "ProxyGroupRwInfo.", this.ProxyGroupRwInfo);
        this.setParamArrayObj(map, prefix + "ProxyNodes.", this.ProxyNodes);
        this.setParamObj(map, prefix + "ConnectionPool.", this.ConnectionPool);
        this.setParamArrayObj(map, prefix + "NetAddrInfos.", this.NetAddrInfos);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);

    }
}

