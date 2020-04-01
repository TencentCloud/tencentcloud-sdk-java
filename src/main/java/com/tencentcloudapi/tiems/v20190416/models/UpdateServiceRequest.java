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

public class UpdateServiceRequest extends AbstractModel{

    /**
    * 服务Id
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 扩缩容配置
    */
    @SerializedName("Scaler")
    @Expose
    private Scaler Scaler;

    /**
    * 服务配置Id
    */
    @SerializedName("ServiceConfigId")
    @Expose
    private String ServiceConfigId;

    /**
    * 支持AUTO, MANUAL，分别表示自动扩缩容，手动扩缩容
    */
    @SerializedName("ScaleMode")
    @Expose
    private String ScaleMode;

    /**
    * 支持STOP(停止) RESUME(重启)
    */
    @SerializedName("ServiceAction")
    @Expose
    private String ServiceAction;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * GPU卡类型
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * 处理器配置，单位为 1/1000 核
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存配置，单位为1M
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 显卡配置，单位为 1/1000 卡
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * Cls日志主题ID
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
     * Get 服务Id 
     * @return ServiceId 服务Id
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务Id
     * @param ServiceId 服务Id
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 扩缩容配置 
     * @return Scaler 扩缩容配置
     */
    public Scaler getScaler() {
        return this.Scaler;
    }

    /**
     * Set 扩缩容配置
     * @param Scaler 扩缩容配置
     */
    public void setScaler(Scaler Scaler) {
        this.Scaler = Scaler;
    }

    /**
     * Get 服务配置Id 
     * @return ServiceConfigId 服务配置Id
     */
    public String getServiceConfigId() {
        return this.ServiceConfigId;
    }

    /**
     * Set 服务配置Id
     * @param ServiceConfigId 服务配置Id
     */
    public void setServiceConfigId(String ServiceConfigId) {
        this.ServiceConfigId = ServiceConfigId;
    }

    /**
     * Get 支持AUTO, MANUAL，分别表示自动扩缩容，手动扩缩容 
     * @return ScaleMode 支持AUTO, MANUAL，分别表示自动扩缩容，手动扩缩容
     */
    public String getScaleMode() {
        return this.ScaleMode;
    }

    /**
     * Set 支持AUTO, MANUAL，分别表示自动扩缩容，手动扩缩容
     * @param ScaleMode 支持AUTO, MANUAL，分别表示自动扩缩容，手动扩缩容
     */
    public void setScaleMode(String ScaleMode) {
        this.ScaleMode = ScaleMode;
    }

    /**
     * Get 支持STOP(停止) RESUME(重启) 
     * @return ServiceAction 支持STOP(停止) RESUME(重启)
     */
    public String getServiceAction() {
        return this.ServiceAction;
    }

    /**
     * Set 支持STOP(停止) RESUME(重启)
     * @param ServiceAction 支持STOP(停止) RESUME(重启)
     */
    public void setServiceAction(String ServiceAction) {
        this.ServiceAction = ServiceAction;
    }

    /**
     * Get 备注 
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get GPU卡类型 
     * @return GpuType GPU卡类型
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set GPU卡类型
     * @param GpuType GPU卡类型
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get 处理器配置，单位为 1/1000 核 
     * @return Cpu 处理器配置，单位为 1/1000 核
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 处理器配置，单位为 1/1000 核
     * @param Cpu 处理器配置，单位为 1/1000 核
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存配置，单位为1M 
     * @return Memory 内存配置，单位为1M
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存配置，单位为1M
     * @param Memory 内存配置，单位为1M
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 显卡配置，单位为 1/1000 卡 
     * @return Gpu 显卡配置，单位为 1/1000 卡
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set 显卡配置，单位为 1/1000 卡
     * @param Gpu 显卡配置，单位为 1/1000 卡
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get Cls日志主题ID 
     * @return LogTopicId Cls日志主题ID
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set Cls日志主题ID
     * @param LogTopicId Cls日志主题ID
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamObj(map, prefix + "Scaler.", this.Scaler);
        this.setParamSimple(map, prefix + "ServiceConfigId", this.ServiceConfigId);
        this.setParamSimple(map, prefix + "ScaleMode", this.ScaleMode);
        this.setParamSimple(map, prefix + "ServiceAction", this.ServiceAction);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);

    }
}

