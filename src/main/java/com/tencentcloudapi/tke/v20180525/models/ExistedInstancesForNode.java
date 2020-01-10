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

public class ExistedInstancesForNode extends AbstractModel{

    /**
    * 节点角色，取值:MASTER_ETCD, WORKER。MASTER_ETCD只有在创建 INDEPENDENT_CLUSTER 独立集群时需要指定。MASTER_ETCD节点数量为3～7，建议为奇数。MASTER_ETCD最小配置为4C8G。
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * 已存在实例的重装参数
    */
    @SerializedName("ExistedInstancesPara")
    @Expose
    private ExistedInstancesPara ExistedInstancesPara;

    /**
    * 节点高级设置，会覆盖集群级别设置的InstanceAdvancedSettings（当前只对节点自定义参数ExtraArgs生效）
    */
    @SerializedName("InstanceAdvancedSettingsOverride")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettingsOverride;

    /**
     * Get 节点角色，取值:MASTER_ETCD, WORKER。MASTER_ETCD只有在创建 INDEPENDENT_CLUSTER 独立集群时需要指定。MASTER_ETCD节点数量为3～7，建议为奇数。MASTER_ETCD最小配置为4C8G。 
     * @return NodeRole 节点角色，取值:MASTER_ETCD, WORKER。MASTER_ETCD只有在创建 INDEPENDENT_CLUSTER 独立集群时需要指定。MASTER_ETCD节点数量为3～7，建议为奇数。MASTER_ETCD最小配置为4C8G。
     */
    public String getNodeRole() {
        return this.NodeRole;
    }

    /**
     * Set 节点角色，取值:MASTER_ETCD, WORKER。MASTER_ETCD只有在创建 INDEPENDENT_CLUSTER 独立集群时需要指定。MASTER_ETCD节点数量为3～7，建议为奇数。MASTER_ETCD最小配置为4C8G。
     * @param NodeRole 节点角色，取值:MASTER_ETCD, WORKER。MASTER_ETCD只有在创建 INDEPENDENT_CLUSTER 独立集群时需要指定。MASTER_ETCD节点数量为3～7，建议为奇数。MASTER_ETCD最小配置为4C8G。
     */
    public void setNodeRole(String NodeRole) {
        this.NodeRole = NodeRole;
    }

    /**
     * Get 已存在实例的重装参数 
     * @return ExistedInstancesPara 已存在实例的重装参数
     */
    public ExistedInstancesPara getExistedInstancesPara() {
        return this.ExistedInstancesPara;
    }

    /**
     * Set 已存在实例的重装参数
     * @param ExistedInstancesPara 已存在实例的重装参数
     */
    public void setExistedInstancesPara(ExistedInstancesPara ExistedInstancesPara) {
        this.ExistedInstancesPara = ExistedInstancesPara;
    }

    /**
     * Get 节点高级设置，会覆盖集群级别设置的InstanceAdvancedSettings（当前只对节点自定义参数ExtraArgs生效） 
     * @return InstanceAdvancedSettingsOverride 节点高级设置，会覆盖集群级别设置的InstanceAdvancedSettings（当前只对节点自定义参数ExtraArgs生效）
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettingsOverride() {
        return this.InstanceAdvancedSettingsOverride;
    }

    /**
     * Set 节点高级设置，会覆盖集群级别设置的InstanceAdvancedSettings（当前只对节点自定义参数ExtraArgs生效）
     * @param InstanceAdvancedSettingsOverride 节点高级设置，会覆盖集群级别设置的InstanceAdvancedSettings（当前只对节点自定义参数ExtraArgs生效）
     */
    public void setInstanceAdvancedSettingsOverride(InstanceAdvancedSettings InstanceAdvancedSettingsOverride) {
        this.InstanceAdvancedSettingsOverride = InstanceAdvancedSettingsOverride;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamObj(map, prefix + "ExistedInstancesPara.", this.ExistedInstancesPara);
        this.setParamObj(map, prefix + "InstanceAdvancedSettingsOverride.", this.InstanceAdvancedSettingsOverride);

    }
}

