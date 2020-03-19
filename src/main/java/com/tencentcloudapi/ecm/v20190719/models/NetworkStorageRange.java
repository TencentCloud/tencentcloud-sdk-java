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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkStorageRange extends AbstractModel{

    /**
    * 网络带宽上限
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * 数据盘上限
    */
    @SerializedName("MaxSystemDiskSize")
    @Expose
    private Long MaxSystemDiskSize;

    /**
    * 网络带宽下限
    */
    @SerializedName("MinBandwidth")
    @Expose
    private Long MinBandwidth;

    /**
    * 数据盘下限
    */
    @SerializedName("MinSystemDiskSize")
    @Expose
    private Long MinSystemDiskSize;

    /**
    * 最大数据盘大小
    */
    @SerializedName("MaxDataDiskSize")
    @Expose
    private Long MaxDataDiskSize;

    /**
    * 最小数据盘大小
    */
    @SerializedName("MinDataDiskSize")
    @Expose
    private Long MinDataDiskSize;

    /**
    * 建议带宽
    */
    @SerializedName("SuggestBandwidth")
    @Expose
    private Long SuggestBandwidth;

    /**
    * 建议硬盘大小
    */
    @SerializedName("SuggestDataDiskSize")
    @Expose
    private Long SuggestDataDiskSize;

    /**
    * 建议系统盘大小
    */
    @SerializedName("SuggestSystemDiskSize")
    @Expose
    private Long SuggestSystemDiskSize;

    /**
    * Cpu核数峰值
    */
    @SerializedName("MaxVcpu")
    @Expose
    private Long MaxVcpu;

    /**
    * Cpu核最小值
    */
    @SerializedName("MinVcpu")
    @Expose
    private Long MinVcpu;

    /**
    * 单次请求最大cpu核数
    */
    @SerializedName("MaxVcpuPerReq")
    @Expose
    private Long MaxVcpuPerReq;

    /**
    * 带宽步长
    */
    @SerializedName("PerBandwidth")
    @Expose
    private Long PerBandwidth;

    /**
    * 数据盘步长
    */
    @SerializedName("PerDataDisk")
    @Expose
    private Long PerDataDisk;

    /**
    * 总模块数量
    */
    @SerializedName("MaxModuleNum")
    @Expose
    private Long MaxModuleNum;

    /**
     * Get 网络带宽上限 
     * @return MaxBandwidth 网络带宽上限
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set 网络带宽上限
     * @param MaxBandwidth 网络带宽上限
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get 数据盘上限 
     * @return MaxSystemDiskSize 数据盘上限
     */
    public Long getMaxSystemDiskSize() {
        return this.MaxSystemDiskSize;
    }

    /**
     * Set 数据盘上限
     * @param MaxSystemDiskSize 数据盘上限
     */
    public void setMaxSystemDiskSize(Long MaxSystemDiskSize) {
        this.MaxSystemDiskSize = MaxSystemDiskSize;
    }

    /**
     * Get 网络带宽下限 
     * @return MinBandwidth 网络带宽下限
     */
    public Long getMinBandwidth() {
        return this.MinBandwidth;
    }

    /**
     * Set 网络带宽下限
     * @param MinBandwidth 网络带宽下限
     */
    public void setMinBandwidth(Long MinBandwidth) {
        this.MinBandwidth = MinBandwidth;
    }

    /**
     * Get 数据盘下限 
     * @return MinSystemDiskSize 数据盘下限
     */
    public Long getMinSystemDiskSize() {
        return this.MinSystemDiskSize;
    }

    /**
     * Set 数据盘下限
     * @param MinSystemDiskSize 数据盘下限
     */
    public void setMinSystemDiskSize(Long MinSystemDiskSize) {
        this.MinSystemDiskSize = MinSystemDiskSize;
    }

    /**
     * Get 最大数据盘大小 
     * @return MaxDataDiskSize 最大数据盘大小
     */
    public Long getMaxDataDiskSize() {
        return this.MaxDataDiskSize;
    }

    /**
     * Set 最大数据盘大小
     * @param MaxDataDiskSize 最大数据盘大小
     */
    public void setMaxDataDiskSize(Long MaxDataDiskSize) {
        this.MaxDataDiskSize = MaxDataDiskSize;
    }

    /**
     * Get 最小数据盘大小 
     * @return MinDataDiskSize 最小数据盘大小
     */
    public Long getMinDataDiskSize() {
        return this.MinDataDiskSize;
    }

    /**
     * Set 最小数据盘大小
     * @param MinDataDiskSize 最小数据盘大小
     */
    public void setMinDataDiskSize(Long MinDataDiskSize) {
        this.MinDataDiskSize = MinDataDiskSize;
    }

    /**
     * Get 建议带宽 
     * @return SuggestBandwidth 建议带宽
     */
    public Long getSuggestBandwidth() {
        return this.SuggestBandwidth;
    }

    /**
     * Set 建议带宽
     * @param SuggestBandwidth 建议带宽
     */
    public void setSuggestBandwidth(Long SuggestBandwidth) {
        this.SuggestBandwidth = SuggestBandwidth;
    }

    /**
     * Get 建议硬盘大小 
     * @return SuggestDataDiskSize 建议硬盘大小
     */
    public Long getSuggestDataDiskSize() {
        return this.SuggestDataDiskSize;
    }

    /**
     * Set 建议硬盘大小
     * @param SuggestDataDiskSize 建议硬盘大小
     */
    public void setSuggestDataDiskSize(Long SuggestDataDiskSize) {
        this.SuggestDataDiskSize = SuggestDataDiskSize;
    }

    /**
     * Get 建议系统盘大小 
     * @return SuggestSystemDiskSize 建议系统盘大小
     */
    public Long getSuggestSystemDiskSize() {
        return this.SuggestSystemDiskSize;
    }

    /**
     * Set 建议系统盘大小
     * @param SuggestSystemDiskSize 建议系统盘大小
     */
    public void setSuggestSystemDiskSize(Long SuggestSystemDiskSize) {
        this.SuggestSystemDiskSize = SuggestSystemDiskSize;
    }

    /**
     * Get Cpu核数峰值 
     * @return MaxVcpu Cpu核数峰值
     */
    public Long getMaxVcpu() {
        return this.MaxVcpu;
    }

    /**
     * Set Cpu核数峰值
     * @param MaxVcpu Cpu核数峰值
     */
    public void setMaxVcpu(Long MaxVcpu) {
        this.MaxVcpu = MaxVcpu;
    }

    /**
     * Get Cpu核最小值 
     * @return MinVcpu Cpu核最小值
     */
    public Long getMinVcpu() {
        return this.MinVcpu;
    }

    /**
     * Set Cpu核最小值
     * @param MinVcpu Cpu核最小值
     */
    public void setMinVcpu(Long MinVcpu) {
        this.MinVcpu = MinVcpu;
    }

    /**
     * Get 单次请求最大cpu核数 
     * @return MaxVcpuPerReq 单次请求最大cpu核数
     */
    public Long getMaxVcpuPerReq() {
        return this.MaxVcpuPerReq;
    }

    /**
     * Set 单次请求最大cpu核数
     * @param MaxVcpuPerReq 单次请求最大cpu核数
     */
    public void setMaxVcpuPerReq(Long MaxVcpuPerReq) {
        this.MaxVcpuPerReq = MaxVcpuPerReq;
    }

    /**
     * Get 带宽步长 
     * @return PerBandwidth 带宽步长
     */
    public Long getPerBandwidth() {
        return this.PerBandwidth;
    }

    /**
     * Set 带宽步长
     * @param PerBandwidth 带宽步长
     */
    public void setPerBandwidth(Long PerBandwidth) {
        this.PerBandwidth = PerBandwidth;
    }

    /**
     * Get 数据盘步长 
     * @return PerDataDisk 数据盘步长
     */
    public Long getPerDataDisk() {
        return this.PerDataDisk;
    }

    /**
     * Set 数据盘步长
     * @param PerDataDisk 数据盘步长
     */
    public void setPerDataDisk(Long PerDataDisk) {
        this.PerDataDisk = PerDataDisk;
    }

    /**
     * Get 总模块数量 
     * @return MaxModuleNum 总模块数量
     */
    public Long getMaxModuleNum() {
        return this.MaxModuleNum;
    }

    /**
     * Set 总模块数量
     * @param MaxModuleNum 总模块数量
     */
    public void setMaxModuleNum(Long MaxModuleNum) {
        this.MaxModuleNum = MaxModuleNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamSimple(map, prefix + "MaxSystemDiskSize", this.MaxSystemDiskSize);
        this.setParamSimple(map, prefix + "MinBandwidth", this.MinBandwidth);
        this.setParamSimple(map, prefix + "MinSystemDiskSize", this.MinSystemDiskSize);
        this.setParamSimple(map, prefix + "MaxDataDiskSize", this.MaxDataDiskSize);
        this.setParamSimple(map, prefix + "MinDataDiskSize", this.MinDataDiskSize);
        this.setParamSimple(map, prefix + "SuggestBandwidth", this.SuggestBandwidth);
        this.setParamSimple(map, prefix + "SuggestDataDiskSize", this.SuggestDataDiskSize);
        this.setParamSimple(map, prefix + "SuggestSystemDiskSize", this.SuggestSystemDiskSize);
        this.setParamSimple(map, prefix + "MaxVcpu", this.MaxVcpu);
        this.setParamSimple(map, prefix + "MinVcpu", this.MinVcpu);
        this.setParamSimple(map, prefix + "MaxVcpuPerReq", this.MaxVcpuPerReq);
        this.setParamSimple(map, prefix + "PerBandwidth", this.PerBandwidth);
        this.setParamSimple(map, prefix + "PerDataDisk", this.PerDataDisk);
        this.setParamSimple(map, prefix + "MaxModuleNum", this.MaxModuleNum);

    }
}

