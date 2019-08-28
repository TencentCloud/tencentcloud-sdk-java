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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceConfig  extends AbstractModel{

    /**
    * Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 配置名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模型地址
    */
    @SerializedName("ModelUri")
    @Expose
    private String ModelUri;

    /**
    * 处理器配置, 单位为1/1000核
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存配置, 单位为1M
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * GPU算力，单位为1/100 tflops
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TflopUnits")
    @Expose
    private Long TflopUnits;

    /**
    * 显存配置, 单位为1M
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuMemory")
    @Expose
    private Long GpuMemory;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 运行环境
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 配置版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * 获取Id
     * @return Id Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * 设置Id
     * @param Id Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * 获取配置名
     * @return Name 配置名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置配置名
     * @param Name 配置名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取模型地址
     * @return ModelUri 模型地址
     */
    public String getModelUri() {
        return this.ModelUri;
    }

    /**
     * 设置模型地址
     * @param ModelUri 模型地址
     */
    public void setModelUri(String ModelUri) {
        this.ModelUri = ModelUri;
    }

    /**
     * 获取处理器配置, 单位为1/1000核
     * @return Cpu 处理器配置, 单位为1/1000核
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * 设置处理器配置, 单位为1/1000核
     * @param Cpu 处理器配置, 单位为1/1000核
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * 获取内存配置, 单位为1M
     * @return Memory 内存配置, 单位为1M
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存配置, 单位为1M
     * @param Memory 内存配置, 单位为1M
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取GPU算力，单位为1/100 tflops
注意：此字段可能返回 null，表示取不到有效值。
     * @return TflopUnits GPU算力，单位为1/100 tflops
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTflopUnits() {
        return this.TflopUnits;
    }

    /**
     * 设置GPU算力，单位为1/100 tflops
注意：此字段可能返回 null，表示取不到有效值。
     * @param TflopUnits GPU算力，单位为1/100 tflops
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTflopUnits(Long TflopUnits) {
        this.TflopUnits = TflopUnits;
    }

    /**
     * 获取显存配置, 单位为1M
注意：此字段可能返回 null，表示取不到有效值。
     * @return GpuMemory 显存配置, 单位为1M
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpuMemory() {
        return this.GpuMemory;
    }

    /**
     * 设置显存配置, 单位为1M
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuMemory 显存配置, 单位为1M
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuMemory(Long GpuMemory) {
        this.GpuMemory = GpuMemory;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取更新时间
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取运行环境
     * @return Runtime 运行环境
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * 设置运行环境
     * @param Runtime 运行环境
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * 获取配置版本
     * @return Version 配置版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * 设置配置版本
     * @param Version 配置版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ModelUri", this.ModelUri);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "TflopUnits", this.TflopUnits);
        this.setParamSimple(map, prefix + "GpuMemory", this.GpuMemory);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

