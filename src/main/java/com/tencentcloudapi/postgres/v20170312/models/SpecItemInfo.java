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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecItemInfo extends AbstractModel {

    /**
    * <p>规格ID</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>PostgreSQL的版本编号</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>内核编号对应的完整版本名称</p>
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * <p>CPU核数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存大小，单位：MB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>该规格所支持最大存储容量，单位：GB</p>
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * <p>该规格所支持最小存储容量，单位：GB</p>
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * <p>该规格的预估QPS</p>
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * <p>【该字段废弃】</p>
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * <p>机器类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>PostgreSQL的主要版本编号</p>
    */
    @SerializedName("MajorVersion")
    @Expose
    private String MajorVersion;

    /**
    * <p>PostgreSQL的内核版本编号</p>
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * <p>是否支持TDE数据加密功能，0-不支持，1-支持</p>
    */
    @SerializedName("IsSupportTDE")
    @Expose
    private Long IsSupportTDE;

    /**
     * Get <p>规格ID</p> 
     * @return SpecCode <p>规格ID</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>规格ID</p>
     * @param SpecCode <p>规格ID</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>PostgreSQL的版本编号</p> 
     * @return Version <p>PostgreSQL的版本编号</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>PostgreSQL的版本编号</p>
     * @param Version <p>PostgreSQL的版本编号</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>内核编号对应的完整版本名称</p> 
     * @return VersionName <p>内核编号对应的完整版本名称</p>
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set <p>内核编号对应的完整版本名称</p>
     * @param VersionName <p>内核编号对应的完整版本名称</p>
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get <p>CPU核数</p> 
     * @return Cpu <p>CPU核数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU核数</p>
     * @param Cpu <p>CPU核数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存大小，单位：MB</p> 
     * @return Memory <p>内存大小，单位：MB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存大小，单位：MB</p>
     * @param Memory <p>内存大小，单位：MB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>该规格所支持最大存储容量，单位：GB</p> 
     * @return MaxStorage <p>该规格所支持最大存储容量，单位：GB</p>
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set <p>该规格所支持最大存储容量，单位：GB</p>
     * @param MaxStorage <p>该规格所支持最大存储容量，单位：GB</p>
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get <p>该规格所支持最小存储容量，单位：GB</p> 
     * @return MinStorage <p>该规格所支持最小存储容量，单位：GB</p>
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set <p>该规格所支持最小存储容量，单位：GB</p>
     * @param MinStorage <p>该规格所支持最小存储容量，单位：GB</p>
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get <p>该规格的预估QPS</p> 
     * @return Qps <p>该规格的预估QPS</p>
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set <p>该规格的预估QPS</p>
     * @param Qps <p>该规格的预估QPS</p>
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get <p>【该字段废弃】</p> 
     * @return Pid <p>【该字段废弃】</p>
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set <p>【该字段废弃】</p>
     * @param Pid <p>【该字段废弃】</p>
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get <p>机器类型</p> 
     * @return Type <p>机器类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>机器类型</p>
     * @param Type <p>机器类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>PostgreSQL的主要版本编号</p> 
     * @return MajorVersion <p>PostgreSQL的主要版本编号</p>
     */
    public String getMajorVersion() {
        return this.MajorVersion;
    }

    /**
     * Set <p>PostgreSQL的主要版本编号</p>
     * @param MajorVersion <p>PostgreSQL的主要版本编号</p>
     */
    public void setMajorVersion(String MajorVersion) {
        this.MajorVersion = MajorVersion;
    }

    /**
     * Get <p>PostgreSQL的内核版本编号</p> 
     * @return KernelVersion <p>PostgreSQL的内核版本编号</p>
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set <p>PostgreSQL的内核版本编号</p>
     * @param KernelVersion <p>PostgreSQL的内核版本编号</p>
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get <p>是否支持TDE数据加密功能，0-不支持，1-支持</p> 
     * @return IsSupportTDE <p>是否支持TDE数据加密功能，0-不支持，1-支持</p>
     */
    public Long getIsSupportTDE() {
        return this.IsSupportTDE;
    }

    /**
     * Set <p>是否支持TDE数据加密功能，0-不支持，1-支持</p>
     * @param IsSupportTDE <p>是否支持TDE数据加密功能，0-不支持，1-支持</p>
     */
    public void setIsSupportTDE(Long IsSupportTDE) {
        this.IsSupportTDE = IsSupportTDE;
    }

    public SpecItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecItemInfo(SpecItemInfo source) {
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.MinStorage != null) {
            this.MinStorage = new Long(source.MinStorage);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MajorVersion != null) {
            this.MajorVersion = new String(source.MajorVersion);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.IsSupportTDE != null) {
            this.IsSupportTDE = new Long(source.IsSupportTDE);
        }
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
        this.setParamSimple(map, prefix + "MajorVersion", this.MajorVersion);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "IsSupportTDE", this.IsSupportTDE);

    }
}

