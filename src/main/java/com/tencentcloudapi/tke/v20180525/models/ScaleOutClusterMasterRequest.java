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

public class ScaleOutClusterMasterRequest extends AbstractModel{

    /**
    * 集群实例ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 新建节点参数
    */
    @SerializedName("RunInstancesForNode")
    @Expose
    private RunInstancesForNode [] RunInstancesForNode;

    /**
    * 添加已有节点相关参数
    */
    @SerializedName("ExistedInstancesForNode")
    @Expose
    private ExistedInstancesForNode [] ExistedInstancesForNode;

    /**
    * 实例高级设置
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * 集群master组件自定义参数
    */
    @SerializedName("ExtraArgs")
    @Expose
    private ClusterExtraArgs ExtraArgs;

    /**
     * Get 集群实例ID 
     * @return ClusterId 集群实例ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群实例ID
     * @param ClusterId 集群实例ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 新建节点参数 
     * @return RunInstancesForNode 新建节点参数
     */
    public RunInstancesForNode [] getRunInstancesForNode() {
        return this.RunInstancesForNode;
    }

    /**
     * Set 新建节点参数
     * @param RunInstancesForNode 新建节点参数
     */
    public void setRunInstancesForNode(RunInstancesForNode [] RunInstancesForNode) {
        this.RunInstancesForNode = RunInstancesForNode;
    }

    /**
     * Get 添加已有节点相关参数 
     * @return ExistedInstancesForNode 添加已有节点相关参数
     */
    public ExistedInstancesForNode [] getExistedInstancesForNode() {
        return this.ExistedInstancesForNode;
    }

    /**
     * Set 添加已有节点相关参数
     * @param ExistedInstancesForNode 添加已有节点相关参数
     */
    public void setExistedInstancesForNode(ExistedInstancesForNode [] ExistedInstancesForNode) {
        this.ExistedInstancesForNode = ExistedInstancesForNode;
    }

    /**
     * Get 实例高级设置 
     * @return InstanceAdvancedSettings 实例高级设置
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set 实例高级设置
     * @param InstanceAdvancedSettings 实例高级设置
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get 集群master组件自定义参数 
     * @return ExtraArgs 集群master组件自定义参数
     */
    public ClusterExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set 集群master组件自定义参数
     * @param ExtraArgs 集群master组件自定义参数
     */
    public void setExtraArgs(ClusterExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    public ScaleOutClusterMasterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleOutClusterMasterRequest(ScaleOutClusterMasterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.RunInstancesForNode != null) {
            this.RunInstancesForNode = new RunInstancesForNode[source.RunInstancesForNode.length];
            for (int i = 0; i < source.RunInstancesForNode.length; i++) {
                this.RunInstancesForNode[i] = new RunInstancesForNode(source.RunInstancesForNode[i]);
            }
        }
        if (source.ExistedInstancesForNode != null) {
            this.ExistedInstancesForNode = new ExistedInstancesForNode[source.ExistedInstancesForNode.length];
            for (int i = 0; i < source.ExistedInstancesForNode.length; i++) {
                this.ExistedInstancesForNode[i] = new ExistedInstancesForNode(source.ExistedInstancesForNode[i]);
            }
        }
        if (source.InstanceAdvancedSettings != null) {
            this.InstanceAdvancedSettings = new InstanceAdvancedSettings(source.InstanceAdvancedSettings);
        }
        if (source.ExtraArgs != null) {
            this.ExtraArgs = new ClusterExtraArgs(source.ExtraArgs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "RunInstancesForNode.", this.RunInstancesForNode);
        this.setParamArrayObj(map, prefix + "ExistedInstancesForNode.", this.ExistedInstancesForNode);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamObj(map, prefix + "ExtraArgs.", this.ExtraArgs);

    }
}

