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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartRouterResourceConfig extends AbstractModel {

    /**
    * <p>副本数，最小 1，建议 &gt;=2 以确保高可用；Scheduler（EPP）默认 2（保障 EPP 高可用与 Gossip 同步）</p>
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * <p>处理器资源，单位为 1/1000 核（milliCPU），与 EMS 一致</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存资源，单位为 1MB，与 EMS 一致</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>自定义环境变量，用于覆盖 Deployment 内置默认环境变量。Gateway 典型用途：覆盖 BACKEND_SERVICE_HOST 等；Scheduler 典型用途：覆盖 LRU_CAPACITY、BLOCK_SIZE_TOKENS 等</p>
    */
    @SerializedName("Env")
    @Expose
    private EnvVar [] Env;

    /**
    * <p>实例类型/规格，用于指定组件运行的机器规格</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>sidecar 容器配置，复用推理服务同款 SidecarSpec；未设置或 ImageInfo.ImageUrl 为空时不创建 sidecar 容器。sidecar 容器环境变量与组件主容器保持一致，不单独下发</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sidecar")
    @Expose
    private SidecarSpec Sidecar;

    /**
     * Get <p>副本数，最小 1，建议 &gt;=2 以确保高可用；Scheduler（EPP）默认 2（保障 EPP 高可用与 Gossip 同步）</p> 
     * @return Replicas <p>副本数，最小 1，建议 &gt;=2 以确保高可用；Scheduler（EPP）默认 2（保障 EPP 高可用与 Gossip 同步）</p>
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set <p>副本数，最小 1，建议 &gt;=2 以确保高可用；Scheduler（EPP）默认 2（保障 EPP 高可用与 Gossip 同步）</p>
     * @param Replicas <p>副本数，最小 1，建议 &gt;=2 以确保高可用；Scheduler（EPP）默认 2（保障 EPP 高可用与 Gossip 同步）</p>
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get <p>处理器资源，单位为 1/1000 核（milliCPU），与 EMS 一致</p> 
     * @return Cpu <p>处理器资源，单位为 1/1000 核（milliCPU），与 EMS 一致</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>处理器资源，单位为 1/1000 核（milliCPU），与 EMS 一致</p>
     * @param Cpu <p>处理器资源，单位为 1/1000 核（milliCPU），与 EMS 一致</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存资源，单位为 1MB，与 EMS 一致</p> 
     * @return Memory <p>内存资源，单位为 1MB，与 EMS 一致</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存资源，单位为 1MB，与 EMS 一致</p>
     * @param Memory <p>内存资源，单位为 1MB，与 EMS 一致</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>自定义环境变量，用于覆盖 Deployment 内置默认环境变量。Gateway 典型用途：覆盖 BACKEND_SERVICE_HOST 等；Scheduler 典型用途：覆盖 LRU_CAPACITY、BLOCK_SIZE_TOKENS 等</p> 
     * @return Env <p>自定义环境变量，用于覆盖 Deployment 内置默认环境变量。Gateway 典型用途：覆盖 BACKEND_SERVICE_HOST 等；Scheduler 典型用途：覆盖 LRU_CAPACITY、BLOCK_SIZE_TOKENS 等</p>
     */
    public EnvVar [] getEnv() {
        return this.Env;
    }

    /**
     * Set <p>自定义环境变量，用于覆盖 Deployment 内置默认环境变量。Gateway 典型用途：覆盖 BACKEND_SERVICE_HOST 等；Scheduler 典型用途：覆盖 LRU_CAPACITY、BLOCK_SIZE_TOKENS 等</p>
     * @param Env <p>自定义环境变量，用于覆盖 Deployment 内置默认环境变量。Gateway 典型用途：覆盖 BACKEND_SERVICE_HOST 等；Scheduler 典型用途：覆盖 LRU_CAPACITY、BLOCK_SIZE_TOKENS 等</p>
     */
    public void setEnv(EnvVar [] Env) {
        this.Env = Env;
    }

    /**
     * Get <p>实例类型/规格，用于指定组件运行的机器规格</p> 
     * @return InstanceType <p>实例类型/规格，用于指定组件运行的机器规格</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型/规格，用于指定组件运行的机器规格</p>
     * @param InstanceType <p>实例类型/规格，用于指定组件运行的机器规格</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>sidecar 容器配置，复用推理服务同款 SidecarSpec；未设置或 ImageInfo.ImageUrl 为空时不创建 sidecar 容器。sidecar 容器环境变量与组件主容器保持一致，不单独下发</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sidecar <p>sidecar 容器配置，复用推理服务同款 SidecarSpec；未设置或 ImageInfo.ImageUrl 为空时不创建 sidecar 容器。sidecar 容器环境变量与组件主容器保持一致，不单独下发</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SidecarSpec getSidecar() {
        return this.Sidecar;
    }

    /**
     * Set <p>sidecar 容器配置，复用推理服务同款 SidecarSpec；未设置或 ImageInfo.ImageUrl 为空时不创建 sidecar 容器。sidecar 容器环境变量与组件主容器保持一致，不单独下发</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sidecar <p>sidecar 容器配置，复用推理服务同款 SidecarSpec；未设置或 ImageInfo.ImageUrl 为空时不创建 sidecar 容器。sidecar 容器环境变量与组件主容器保持一致，不单独下发</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSidecar(SidecarSpec Sidecar) {
        this.Sidecar = Sidecar;
    }

    public SmartRouterResourceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartRouterResourceConfig(SmartRouterResourceConfig source) {
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Env != null) {
            this.Env = new EnvVar[source.Env.length];
            for (int i = 0; i < source.Env.length; i++) {
                this.Env[i] = new EnvVar(source.Env[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Sidecar != null) {
            this.Sidecar = new SidecarSpec(source.Sidecar);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamArrayObj(map, prefix + "Env.", this.Env);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "Sidecar.", this.Sidecar);

    }
}

