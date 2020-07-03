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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecItemInfo extends AbstractModel{

    /**
    * 规格ID
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * PostgreSQL的内核版本编号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 内核编号对应的完整版本名称
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * CPU核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小，单位：MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 该规格所支持最大存储容量，单位：GB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * 该规格所支持最小存储容量，单位：GB
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * 该规格的预估QPS
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 该规格对应的计费ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 机器类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 规格ID 
     * @return SpecCode 规格ID
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set 规格ID
     * @param SpecCode 规格ID
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get PostgreSQL的内核版本编号 
     * @return Version PostgreSQL的内核版本编号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set PostgreSQL的内核版本编号
     * @param Version PostgreSQL的内核版本编号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 内核编号对应的完整版本名称 
     * @return VersionName 内核编号对应的完整版本名称
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 内核编号对应的完整版本名称
     * @param VersionName 内核编号对应的完整版本名称
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get CPU核数 
     * @return Cpu CPU核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数
     * @param Cpu CPU核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小，单位：MB 
     * @return Memory 内存大小，单位：MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位：MB
     * @param Memory 内存大小，单位：MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 该规格所支持最大存储容量，单位：GB 
     * @return MaxStorage 该规格所支持最大存储容量，单位：GB
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set 该规格所支持最大存储容量，单位：GB
     * @param MaxStorage 该规格所支持最大存储容量，单位：GB
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get 该规格所支持最小存储容量，单位：GB 
     * @return MinStorage 该规格所支持最小存储容量，单位：GB
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set 该规格所支持最小存储容量，单位：GB
     * @param MinStorage 该规格所支持最小存储容量，单位：GB
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get 该规格的预估QPS 
     * @return Qps 该规格的预估QPS
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 该规格的预估QPS
     * @param Qps 该规格的预估QPS
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 该规格对应的计费ID 
     * @return Pid 该规格对应的计费ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 该规格对应的计费ID
     * @param Pid 该规格对应的计费ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 机器类型 
     * @return Type 机器类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 机器类型
     * @param Type 机器类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "MinStorage", this.MinStorage);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

