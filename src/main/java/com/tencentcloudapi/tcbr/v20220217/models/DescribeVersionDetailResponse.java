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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVersionDetailResponse extends AbstractModel {

    /**
    * 版本名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 端口号
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * cpu 规格
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * mem 规格
    */
    @SerializedName("Mem")
    @Expose
    private Float Mem;

    /**
    * 最小副本数
    */
    @SerializedName("MinNum")
    @Expose
    private Long MinNum;

    /**
    * 最大副本数
    */
    @SerializedName("MaxNum")
    @Expose
    private Long MaxNum;

    /**
    * 扩缩容策略
    */
    @SerializedName("PolicyDetails")
    @Expose
    private HpaPolicy [] PolicyDetails;

    /**
    * Dockerfile path
    */
    @SerializedName("Dockerfile")
    @Expose
    private String Dockerfile;

    /**
    * 目标目录
    */
    @SerializedName("BuildDir")
    @Expose
    private String BuildDir;

    /**
    * 环境变量
    */
    @SerializedName("EnvParams")
    @Expose
    private String EnvParams;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 日志采集路径
    */
    @SerializedName("LogPath")
    @Expose
    private String LogPath;

    /**
    * entryPoint
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntryPoint")
    @Expose
    private String EntryPoint;

    /**
    * Cmd
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * vpc conf
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcConf")
    @Expose
    private VpcConf VpcConf;

    /**
    * volume conf
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumesConf")
    @Expose
    private VolumeConf [] VolumesConf;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 版本名 
     * @return Name 版本名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 版本名
     * @param Name 版本名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 端口号 
     * @return Port 端口号
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口号
     * @param Port 端口号
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get cpu 规格 
     * @return Cpu cpu 规格
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu 规格
     * @param Cpu cpu 规格
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get mem 规格 
     * @return Mem mem 规格
     */
    public Float getMem() {
        return this.Mem;
    }

    /**
     * Set mem 规格
     * @param Mem mem 规格
     */
    public void setMem(Float Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 最小副本数 
     * @return MinNum 最小副本数
     */
    public Long getMinNum() {
        return this.MinNum;
    }

    /**
     * Set 最小副本数
     * @param MinNum 最小副本数
     */
    public void setMinNum(Long MinNum) {
        this.MinNum = MinNum;
    }

    /**
     * Get 最大副本数 
     * @return MaxNum 最大副本数
     */
    public Long getMaxNum() {
        return this.MaxNum;
    }

    /**
     * Set 最大副本数
     * @param MaxNum 最大副本数
     */
    public void setMaxNum(Long MaxNum) {
        this.MaxNum = MaxNum;
    }

    /**
     * Get 扩缩容策略 
     * @return PolicyDetails 扩缩容策略
     */
    public HpaPolicy [] getPolicyDetails() {
        return this.PolicyDetails;
    }

    /**
     * Set 扩缩容策略
     * @param PolicyDetails 扩缩容策略
     */
    public void setPolicyDetails(HpaPolicy [] PolicyDetails) {
        this.PolicyDetails = PolicyDetails;
    }

    /**
     * Get Dockerfile path 
     * @return Dockerfile Dockerfile path
     */
    public String getDockerfile() {
        return this.Dockerfile;
    }

    /**
     * Set Dockerfile path
     * @param Dockerfile Dockerfile path
     */
    public void setDockerfile(String Dockerfile) {
        this.Dockerfile = Dockerfile;
    }

    /**
     * Get 目标目录 
     * @return BuildDir 目标目录
     */
    public String getBuildDir() {
        return this.BuildDir;
    }

    /**
     * Set 目标目录
     * @param BuildDir 目标目录
     */
    public void setBuildDir(String BuildDir) {
        this.BuildDir = BuildDir;
    }

    /**
     * Get 环境变量 
     * @return EnvParams 环境变量
     */
    public String getEnvParams() {
        return this.EnvParams;
    }

    /**
     * Set 环境变量
     * @param EnvParams 环境变量
     */
    public void setEnvParams(String EnvParams) {
        this.EnvParams = EnvParams;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间 
     * @return UpdatedTime 更新时间
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间
     * @param UpdatedTime 更新时间
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 日志采集路径 
     * @return LogPath 日志采集路径
     */
    public String getLogPath() {
        return this.LogPath;
    }

    /**
     * Set 日志采集路径
     * @param LogPath 日志采集路径
     */
    public void setLogPath(String LogPath) {
        this.LogPath = LogPath;
    }

    /**
     * Get entryPoint
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntryPoint entryPoint
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntryPoint() {
        return this.EntryPoint;
    }

    /**
     * Set entryPoint
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntryPoint entryPoint
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntryPoint(String EntryPoint) {
        this.EntryPoint = EntryPoint;
    }

    /**
     * Get Cmd
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cmd Cmd
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set Cmd
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cmd Cmd
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get vpc conf
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcConf vpc conf
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcConf getVpcConf() {
        return this.VpcConf;
    }

    /**
     * Set vpc conf
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcConf vpc conf
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcConf(VpcConf VpcConf) {
        this.VpcConf = VpcConf;
    }

    /**
     * Get volume conf
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumesConf volume conf
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeConf [] getVolumesConf() {
        return this.VolumesConf;
    }

    /**
     * Set volume conf
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumesConf volume conf
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumesConf(VolumeConf [] VolumesConf) {
        this.VolumesConf = VolumesConf;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVersionDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVersionDetailResponse(DescribeVersionDetailResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Float(source.Mem);
        }
        if (source.MinNum != null) {
            this.MinNum = new Long(source.MinNum);
        }
        if (source.MaxNum != null) {
            this.MaxNum = new Long(source.MaxNum);
        }
        if (source.PolicyDetails != null) {
            this.PolicyDetails = new HpaPolicy[source.PolicyDetails.length];
            for (int i = 0; i < source.PolicyDetails.length; i++) {
                this.PolicyDetails[i] = new HpaPolicy(source.PolicyDetails[i]);
            }
        }
        if (source.Dockerfile != null) {
            this.Dockerfile = new String(source.Dockerfile);
        }
        if (source.BuildDir != null) {
            this.BuildDir = new String(source.BuildDir);
        }
        if (source.EnvParams != null) {
            this.EnvParams = new String(source.EnvParams);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.LogPath != null) {
            this.LogPath = new String(source.LogPath);
        }
        if (source.EntryPoint != null) {
            this.EntryPoint = new String(source.EntryPoint);
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.VpcConf != null) {
            this.VpcConf = new VpcConf(source.VpcConf);
        }
        if (source.VolumesConf != null) {
            this.VolumesConf = new VolumeConf[source.VolumesConf.length];
            for (int i = 0; i < source.VolumesConf.length; i++) {
                this.VolumesConf[i] = new VolumeConf(source.VolumesConf[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "MinNum", this.MinNum);
        this.setParamSimple(map, prefix + "MaxNum", this.MaxNum);
        this.setParamArrayObj(map, prefix + "PolicyDetails.", this.PolicyDetails);
        this.setParamSimple(map, prefix + "Dockerfile", this.Dockerfile);
        this.setParamSimple(map, prefix + "BuildDir", this.BuildDir);
        this.setParamSimple(map, prefix + "EnvParams", this.EnvParams);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "LogPath", this.LogPath);
        this.setParamSimple(map, prefix + "EntryPoint", this.EntryPoint);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamObj(map, prefix + "VpcConf.", this.VpcConf);
        this.setParamArrayObj(map, prefix + "VolumesConf.", this.VolumesConf);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

