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
    * <p>版本名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>端口号</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>cpu 规格</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * <p>mem 规格</p>
    */
    @SerializedName("Mem")
    @Expose
    private Float Mem;

    /**
    * <p>最小副本数</p>
    */
    @SerializedName("MinNum")
    @Expose
    private Long MinNum;

    /**
    * <p>最大副本数</p>
    */
    @SerializedName("MaxNum")
    @Expose
    private Long MaxNum;

    /**
    * <p>扩缩容策略</p>
    */
    @SerializedName("PolicyDetails")
    @Expose
    private HpaPolicy [] PolicyDetails;

    /**
    * <p>Dockerfile path</p>
    */
    @SerializedName("Dockerfile")
    @Expose
    private String Dockerfile;

    /**
    * <p>目标目录</p>
    */
    @SerializedName("BuildDir")
    @Expose
    private String BuildDir;

    /**
    * <p>环境变量</p>
    */
    @SerializedName("EnvParams")
    @Expose
    private String EnvParams;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * <p>日志采集路径</p>
    */
    @SerializedName("LogPath")
    @Expose
    private String LogPath;

    /**
    * <p>entryPoint</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntryPoint")
    @Expose
    private String EntryPoint;

    /**
    * <p>Cmd</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * <p>vpc conf</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcConf")
    @Expose
    private VpcConf VpcConf;

    /**
    * <p>volume conf</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumesConf")
    @Expose
    private VolumeConf [] VolumesConf;

    /**
    * <p>buildpack 信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuildPacks")
    @Expose
    private BuildPacksInfo BuildPacks;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>版本名</p> 
     * @return Name <p>版本名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>版本名</p>
     * @param Name <p>版本名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>端口号</p> 
     * @return Port <p>端口号</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口号</p>
     * @param Port <p>端口号</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>cpu 规格</p> 
     * @return Cpu <p>cpu 规格</p>
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>cpu 规格</p>
     * @param Cpu <p>cpu 规格</p>
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>mem 规格</p> 
     * @return Mem <p>mem 规格</p>
     */
    public Float getMem() {
        return this.Mem;
    }

    /**
     * Set <p>mem 规格</p>
     * @param Mem <p>mem 规格</p>
     */
    public void setMem(Float Mem) {
        this.Mem = Mem;
    }

    /**
     * Get <p>最小副本数</p> 
     * @return MinNum <p>最小副本数</p>
     */
    public Long getMinNum() {
        return this.MinNum;
    }

    /**
     * Set <p>最小副本数</p>
     * @param MinNum <p>最小副本数</p>
     */
    public void setMinNum(Long MinNum) {
        this.MinNum = MinNum;
    }

    /**
     * Get <p>最大副本数</p> 
     * @return MaxNum <p>最大副本数</p>
     */
    public Long getMaxNum() {
        return this.MaxNum;
    }

    /**
     * Set <p>最大副本数</p>
     * @param MaxNum <p>最大副本数</p>
     */
    public void setMaxNum(Long MaxNum) {
        this.MaxNum = MaxNum;
    }

    /**
     * Get <p>扩缩容策略</p> 
     * @return PolicyDetails <p>扩缩容策略</p>
     */
    public HpaPolicy [] getPolicyDetails() {
        return this.PolicyDetails;
    }

    /**
     * Set <p>扩缩容策略</p>
     * @param PolicyDetails <p>扩缩容策略</p>
     */
    public void setPolicyDetails(HpaPolicy [] PolicyDetails) {
        this.PolicyDetails = PolicyDetails;
    }

    /**
     * Get <p>Dockerfile path</p> 
     * @return Dockerfile <p>Dockerfile path</p>
     */
    public String getDockerfile() {
        return this.Dockerfile;
    }

    /**
     * Set <p>Dockerfile path</p>
     * @param Dockerfile <p>Dockerfile path</p>
     */
    public void setDockerfile(String Dockerfile) {
        this.Dockerfile = Dockerfile;
    }

    /**
     * Get <p>目标目录</p> 
     * @return BuildDir <p>目标目录</p>
     */
    public String getBuildDir() {
        return this.BuildDir;
    }

    /**
     * Set <p>目标目录</p>
     * @param BuildDir <p>目标目录</p>
     */
    public void setBuildDir(String BuildDir) {
        this.BuildDir = BuildDir;
    }

    /**
     * Get <p>环境变量</p> 
     * @return EnvParams <p>环境变量</p>
     */
    public String getEnvParams() {
        return this.EnvParams;
    }

    /**
     * Set <p>环境变量</p>
     * @param EnvParams <p>环境变量</p>
     */
    public void setEnvParams(String EnvParams) {
        this.EnvParams = EnvParams;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedTime <p>创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedTime <p>创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdatedTime <p>更新时间</p>
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdatedTime <p>更新时间</p>
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get <p>日志采集路径</p> 
     * @return LogPath <p>日志采集路径</p>
     */
    public String getLogPath() {
        return this.LogPath;
    }

    /**
     * Set <p>日志采集路径</p>
     * @param LogPath <p>日志采集路径</p>
     */
    public void setLogPath(String LogPath) {
        this.LogPath = LogPath;
    }

    /**
     * Get <p>entryPoint</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntryPoint <p>entryPoint</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntryPoint() {
        return this.EntryPoint;
    }

    /**
     * Set <p>entryPoint</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntryPoint <p>entryPoint</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntryPoint(String EntryPoint) {
        this.EntryPoint = EntryPoint;
    }

    /**
     * Get <p>Cmd</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cmd <p>Cmd</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set <p>Cmd</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cmd <p>Cmd</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get <p>vpc conf</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcConf <p>vpc conf</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcConf getVpcConf() {
        return this.VpcConf;
    }

    /**
     * Set <p>vpc conf</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcConf <p>vpc conf</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcConf(VpcConf VpcConf) {
        this.VpcConf = VpcConf;
    }

    /**
     * Get <p>volume conf</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumesConf <p>volume conf</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeConf [] getVolumesConf() {
        return this.VolumesConf;
    }

    /**
     * Set <p>volume conf</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumesConf <p>volume conf</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumesConf(VolumeConf [] VolumesConf) {
        this.VolumesConf = VolumesConf;
    }

    /**
     * Get <p>buildpack 信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuildPacks <p>buildpack 信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BuildPacksInfo getBuildPacks() {
        return this.BuildPacks;
    }

    /**
     * Set <p>buildpack 信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuildPacks <p>buildpack 信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuildPacks(BuildPacksInfo BuildPacks) {
        this.BuildPacks = BuildPacks;
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
        if (source.BuildPacks != null) {
            this.BuildPacks = new BuildPacksInfo(source.BuildPacks);
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
        this.setParamObj(map, prefix + "BuildPacks.", this.BuildPacks);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

