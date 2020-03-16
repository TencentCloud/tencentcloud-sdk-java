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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecConfigInfo extends AbstractModel{

    /**
    * 设备型号
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * 内存大小，单位 GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 数据盘规格最小值，单位 GB
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * 数据盘规格最大值，单位 GB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * 推荐的使用场景
    */
    @SerializedName("SuitInfo")
    @Expose
    private String SuitInfo;

    /**
    * 最大 Qps 值
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 产品类型 Id
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 节点个数，2 表示一主一从，3 表示一主二从
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Cpu核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get 设备型号 
     * @return Machine 设备型号
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * Set 设备型号
     * @param Machine 设备型号
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
    }

    /**
     * Get 内存大小，单位 GB 
     * @return Memory 内存大小，单位 GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位 GB
     * @param Memory 内存大小，单位 GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 数据盘规格最小值，单位 GB 
     * @return MinStorage 数据盘规格最小值，单位 GB
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set 数据盘规格最小值，单位 GB
     * @param MinStorage 数据盘规格最小值，单位 GB
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get 数据盘规格最大值，单位 GB 
     * @return MaxStorage 数据盘规格最大值，单位 GB
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set 数据盘规格最大值，单位 GB
     * @param MaxStorage 数据盘规格最大值，单位 GB
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get 推荐的使用场景 
     * @return SuitInfo 推荐的使用场景
     */
    public String getSuitInfo() {
        return this.SuitInfo;
    }

    /**
     * Set 推荐的使用场景
     * @param SuitInfo 推荐的使用场景
     */
    public void setSuitInfo(String SuitInfo) {
        this.SuitInfo = SuitInfo;
    }

    /**
     * Get 最大 Qps 值 
     * @return Qps 最大 Qps 值
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 最大 Qps 值
     * @param Qps 最大 Qps 值
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 产品类型 Id 
     * @return Pid 产品类型 Id
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 产品类型 Id
     * @param Pid 产品类型 Id
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 节点个数，2 表示一主一从，3 表示一主二从 
     * @return NodeCount 节点个数，2 表示一主一从，3 表示一主二从
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点个数，2 表示一主一从，3 表示一主二从
     * @param NodeCount 节点个数，2 表示一主一从，3 表示一主二从
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Cpu核数 
     * @return Cpu Cpu核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Cpu核数
     * @param Cpu Cpu核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Machine", this.Machine);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "MinStorage", this.MinStorage);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "SuitInfo", this.SuitInfo);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

