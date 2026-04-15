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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBootScriptRsp extends AbstractModel {

    /**
    * 资源初始化结束自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceAfter")
    @Expose
    private PreExecuteFileSetting [] ResourceAfter;

    /**
    * 集群启动前自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterBefore")
    @Expose
    private PreExecuteFileSetting [] ClusterBefore;

    /**
    * 集群启动后自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterAfter")
    @Expose
    private PreExecuteFileSetting [] ClusterAfter;

    /**
    * 服务下线前自定义脚本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceBefore")
    @Expose
    private PreExecuteFileSetting [] ServiceBefore;

    /**
     * Get 资源初始化结束自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceAfter 资源初始化结束自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PreExecuteFileSetting [] getResourceAfter() {
        return this.ResourceAfter;
    }

    /**
     * Set 资源初始化结束自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceAfter 资源初始化结束自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceAfter(PreExecuteFileSetting [] ResourceAfter) {
        this.ResourceAfter = ResourceAfter;
    }

    /**
     * Get 集群启动前自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterBefore 集群启动前自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PreExecuteFileSetting [] getClusterBefore() {
        return this.ClusterBefore;
    }

    /**
     * Set 集群启动前自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterBefore 集群启动前自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterBefore(PreExecuteFileSetting [] ClusterBefore) {
        this.ClusterBefore = ClusterBefore;
    }

    /**
     * Get 集群启动后自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterAfter 集群启动后自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PreExecuteFileSetting [] getClusterAfter() {
        return this.ClusterAfter;
    }

    /**
     * Set 集群启动后自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterAfter 集群启动后自定义脚本文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterAfter(PreExecuteFileSetting [] ClusterAfter) {
        this.ClusterAfter = ClusterAfter;
    }

    /**
     * Get 服务下线前自定义脚本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceBefore 服务下线前自定义脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PreExecuteFileSetting [] getServiceBefore() {
        return this.ServiceBefore;
    }

    /**
     * Set 服务下线前自定义脚本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceBefore 服务下线前自定义脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceBefore(PreExecuteFileSetting [] ServiceBefore) {
        this.ServiceBefore = ServiceBefore;
    }

    public DescribeBootScriptRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBootScriptRsp(DescribeBootScriptRsp source) {
        if (source.ResourceAfter != null) {
            this.ResourceAfter = new PreExecuteFileSetting[source.ResourceAfter.length];
            for (int i = 0; i < source.ResourceAfter.length; i++) {
                this.ResourceAfter[i] = new PreExecuteFileSetting(source.ResourceAfter[i]);
            }
        }
        if (source.ClusterBefore != null) {
            this.ClusterBefore = new PreExecuteFileSetting[source.ClusterBefore.length];
            for (int i = 0; i < source.ClusterBefore.length; i++) {
                this.ClusterBefore[i] = new PreExecuteFileSetting(source.ClusterBefore[i]);
            }
        }
        if (source.ClusterAfter != null) {
            this.ClusterAfter = new PreExecuteFileSetting[source.ClusterAfter.length];
            for (int i = 0; i < source.ClusterAfter.length; i++) {
                this.ClusterAfter[i] = new PreExecuteFileSetting(source.ClusterAfter[i]);
            }
        }
        if (source.ServiceBefore != null) {
            this.ServiceBefore = new PreExecuteFileSetting[source.ServiceBefore.length];
            for (int i = 0; i < source.ServiceBefore.length; i++) {
                this.ServiceBefore[i] = new PreExecuteFileSetting(source.ServiceBefore[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ResourceAfter.", this.ResourceAfter);
        this.setParamArrayObj(map, prefix + "ClusterBefore.", this.ClusterBefore);
        this.setParamArrayObj(map, prefix + "ClusterAfter.", this.ClusterAfter);
        this.setParamArrayObj(map, prefix + "ServiceBefore.", this.ServiceBefore);

    }
}

