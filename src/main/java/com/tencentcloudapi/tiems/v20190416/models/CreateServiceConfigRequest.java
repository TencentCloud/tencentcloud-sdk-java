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

public class CreateServiceConfigRequest  extends AbstractModel{

    /**
    * 配置名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 运行环境
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 模型地址，支持cos路径，格式为 cos://bucket名-appid.cos.region名.myqcloud.com/模型文件夹路径。为模型文件的上一层文件夹地址。
    */
    @SerializedName("ModelUri")
    @Expose
    private String ModelUri;

    /**
    * 处理器配置, 单位为1/1000核；范围[100, 256000]
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存配置, 单位为1M；范围[100, 256000]
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * GPU算力配置，单位为1/100 tflops，范围 [0, 256000]
    */
    @SerializedName("TflopUnits")
    @Expose
    private Long TflopUnits;

    /**
    * 显存配置, 单位为1M，范围 [0, 256000]
    */
    @SerializedName("GpuMemory")
    @Expose
    private Long GpuMemory;

    /**
     * 获取配置名称
     * @return Name 配置名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置配置名称
     * @param Name 配置名称
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * 获取模型地址，支持cos路径，格式为 cos://bucket名-appid.cos.region名.myqcloud.com/模型文件夹路径。为模型文件的上一层文件夹地址。
     * @return ModelUri 模型地址，支持cos路径，格式为 cos://bucket名-appid.cos.region名.myqcloud.com/模型文件夹路径。为模型文件的上一层文件夹地址。
     */
    public String getModelUri() {
        return this.ModelUri;
    }

    /**
     * 设置模型地址，支持cos路径，格式为 cos://bucket名-appid.cos.region名.myqcloud.com/模型文件夹路径。为模型文件的上一层文件夹地址。
     * @param ModelUri 模型地址，支持cos路径，格式为 cos://bucket名-appid.cos.region名.myqcloud.com/模型文件夹路径。为模型文件的上一层文件夹地址。
     */
    public void setModelUri(String ModelUri) {
        this.ModelUri = ModelUri;
    }

    /**
     * 获取处理器配置, 单位为1/1000核；范围[100, 256000]
     * @return Cpu 处理器配置, 单位为1/1000核；范围[100, 256000]
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * 设置处理器配置, 单位为1/1000核；范围[100, 256000]
     * @param Cpu 处理器配置, 单位为1/1000核；范围[100, 256000]
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * 获取内存配置, 单位为1M；范围[100, 256000]
     * @return Memory 内存配置, 单位为1M；范围[100, 256000]
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存配置, 单位为1M；范围[100, 256000]
     * @param Memory 内存配置, 单位为1M；范围[100, 256000]
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取GPU算力配置，单位为1/100 tflops，范围 [0, 256000]
     * @return TflopUnits GPU算力配置，单位为1/100 tflops，范围 [0, 256000]
     */
    public Long getTflopUnits() {
        return this.TflopUnits;
    }

    /**
     * 设置GPU算力配置，单位为1/100 tflops，范围 [0, 256000]
     * @param TflopUnits GPU算力配置，单位为1/100 tflops，范围 [0, 256000]
     */
    public void setTflopUnits(Long TflopUnits) {
        this.TflopUnits = TflopUnits;
    }

    /**
     * 获取显存配置, 单位为1M，范围 [0, 256000]
     * @return GpuMemory 显存配置, 单位为1M，范围 [0, 256000]
     */
    public Long getGpuMemory() {
        return this.GpuMemory;
    }

    /**
     * 设置显存配置, 单位为1M，范围 [0, 256000]
     * @param GpuMemory 显存配置, 单位为1M，范围 [0, 256000]
     */
    public void setGpuMemory(Long GpuMemory) {
        this.GpuMemory = GpuMemory;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "ModelUri", this.ModelUri);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "TflopUnits", this.TflopUnits);
        this.setParamSimple(map, prefix + "GpuMemory", this.GpuMemory);

    }
}

