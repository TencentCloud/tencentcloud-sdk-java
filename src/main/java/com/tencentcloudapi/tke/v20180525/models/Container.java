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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Container extends AbstractModel{

    /**
    * 镜像
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 容器名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 容器启动命令
    */
    @SerializedName("Commands")
    @Expose
    private String [] Commands;

    /**
    * 容器启动参数
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
    * 容器内操作系统的环境变量
    */
    @SerializedName("EnvironmentVars")
    @Expose
    private EnvironmentVariable [] EnvironmentVars;

    /**
    * CPU，制改容器最多可使用的核数，该值不可超过容器实例的总核数。单位：核。
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * 内存，限制该容器最多可使用的内存值，该值不可超过容器实例的总内存值。单位：GiB
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * 数据卷挂载信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeMounts")
    @Expose
    private VolumeMount [] VolumeMounts;

    /**
    * 当前状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentState")
    @Expose
    private ContainerState CurrentState;

    /**
    * 重启次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
    * 容器工作目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkingDir")
    @Expose
    private String WorkingDir;

    /**
    * 存活探针
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivenessProbe")
    @Expose
    private LivenessOrReadinessProbe LivenessProbe;

    /**
    * 就绪探针
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadinessProbe")
    @Expose
    private LivenessOrReadinessProbe ReadinessProbe;

    /**
    * Gpu限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuLimit")
    @Expose
    private Long GpuLimit;

    /**
    * 容器的安全上下文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityContext")
    @Expose
    private SecurityContext SecurityContext;

    /**
     * Get 镜像 
     * @return Image 镜像
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 镜像
     * @param Image 镜像
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 容器名 
     * @return Name 容器名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 容器名
     * @param Name 容器名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 容器启动命令 
     * @return Commands 容器启动命令
     */
    public String [] getCommands() {
        return this.Commands;
    }

    /**
     * Set 容器启动命令
     * @param Commands 容器启动命令
     */
    public void setCommands(String [] Commands) {
        this.Commands = Commands;
    }

    /**
     * Get 容器启动参数 
     * @return Args 容器启动参数
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * Set 容器启动参数
     * @param Args 容器启动参数
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    /**
     * Get 容器内操作系统的环境变量 
     * @return EnvironmentVars 容器内操作系统的环境变量
     */
    public EnvironmentVariable [] getEnvironmentVars() {
        return this.EnvironmentVars;
    }

    /**
     * Set 容器内操作系统的环境变量
     * @param EnvironmentVars 容器内操作系统的环境变量
     */
    public void setEnvironmentVars(EnvironmentVariable [] EnvironmentVars) {
        this.EnvironmentVars = EnvironmentVars;
    }

    /**
     * Get CPU，制改容器最多可使用的核数，该值不可超过容器实例的总核数。单位：核。 
     * @return Cpu CPU，制改容器最多可使用的核数，该值不可超过容器实例的总核数。单位：核。
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU，制改容器最多可使用的核数，该值不可超过容器实例的总核数。单位：核。
     * @param Cpu CPU，制改容器最多可使用的核数，该值不可超过容器实例的总核数。单位：核。
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存，限制该容器最多可使用的内存值，该值不可超过容器实例的总内存值。单位：GiB 
     * @return Memory 内存，限制该容器最多可使用的内存值，该值不可超过容器实例的总内存值。单位：GiB
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存，限制该容器最多可使用的内存值，该值不可超过容器实例的总内存值。单位：GiB
     * @param Memory 内存，限制该容器最多可使用的内存值，该值不可超过容器实例的总内存值。单位：GiB
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 数据卷挂载信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeMounts 数据卷挂载信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeMount [] getVolumeMounts() {
        return this.VolumeMounts;
    }

    /**
     * Set 数据卷挂载信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeMounts 数据卷挂载信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeMounts(VolumeMount [] VolumeMounts) {
        this.VolumeMounts = VolumeMounts;
    }

    /**
     * Get 当前状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentState 当前状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContainerState getCurrentState() {
        return this.CurrentState;
    }

    /**
     * Set 当前状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentState 当前状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentState(ContainerState CurrentState) {
        this.CurrentState = CurrentState;
    }

    /**
     * Get 重启次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestartCount 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestartCount 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * Get 容器工作目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkingDir 容器工作目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkingDir() {
        return this.WorkingDir;
    }

    /**
     * Set 容器工作目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkingDir 容器工作目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkingDir(String WorkingDir) {
        this.WorkingDir = WorkingDir;
    }

    /**
     * Get 存活探针
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivenessProbe 存活探针
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LivenessOrReadinessProbe getLivenessProbe() {
        return this.LivenessProbe;
    }

    /**
     * Set 存活探针
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivenessProbe 存活探针
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivenessProbe(LivenessOrReadinessProbe LivenessProbe) {
        this.LivenessProbe = LivenessProbe;
    }

    /**
     * Get 就绪探针
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadinessProbe 就绪探针
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LivenessOrReadinessProbe getReadinessProbe() {
        return this.ReadinessProbe;
    }

    /**
     * Set 就绪探针
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadinessProbe 就绪探针
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadinessProbe(LivenessOrReadinessProbe ReadinessProbe) {
        this.ReadinessProbe = ReadinessProbe;
    }

    /**
     * Get Gpu限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuLimit Gpu限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpuLimit() {
        return this.GpuLimit;
    }

    /**
     * Set Gpu限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuLimit Gpu限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuLimit(Long GpuLimit) {
        this.GpuLimit = GpuLimit;
    }

    /**
     * Get 容器的安全上下文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityContext 容器的安全上下文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecurityContext getSecurityContext() {
        return this.SecurityContext;
    }

    /**
     * Set 容器的安全上下文
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityContext 容器的安全上下文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityContext(SecurityContext SecurityContext) {
        this.SecurityContext = SecurityContext;
    }

    public Container() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Container(Container source) {
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Commands != null) {
            this.Commands = new String[source.Commands.length];
            for (int i = 0; i < source.Commands.length; i++) {
                this.Commands[i] = new String(source.Commands[i]);
            }
        }
        if (source.Args != null) {
            this.Args = new String[source.Args.length];
            for (int i = 0; i < source.Args.length; i++) {
                this.Args[i] = new String(source.Args[i]);
            }
        }
        if (source.EnvironmentVars != null) {
            this.EnvironmentVars = new EnvironmentVariable[source.EnvironmentVars.length];
            for (int i = 0; i < source.EnvironmentVars.length; i++) {
                this.EnvironmentVars[i] = new EnvironmentVariable(source.EnvironmentVars[i]);
            }
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.VolumeMounts != null) {
            this.VolumeMounts = new VolumeMount[source.VolumeMounts.length];
            for (int i = 0; i < source.VolumeMounts.length; i++) {
                this.VolumeMounts[i] = new VolumeMount(source.VolumeMounts[i]);
            }
        }
        if (source.CurrentState != null) {
            this.CurrentState = new ContainerState(source.CurrentState);
        }
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
        if (source.WorkingDir != null) {
            this.WorkingDir = new String(source.WorkingDir);
        }
        if (source.LivenessProbe != null) {
            this.LivenessProbe = new LivenessOrReadinessProbe(source.LivenessProbe);
        }
        if (source.ReadinessProbe != null) {
            this.ReadinessProbe = new LivenessOrReadinessProbe(source.ReadinessProbe);
        }
        if (source.GpuLimit != null) {
            this.GpuLimit = new Long(source.GpuLimit);
        }
        if (source.SecurityContext != null) {
            this.SecurityContext = new SecurityContext(source.SecurityContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Commands.", this.Commands);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);
        this.setParamArrayObj(map, prefix + "EnvironmentVars.", this.EnvironmentVars);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamArrayObj(map, prefix + "VolumeMounts.", this.VolumeMounts);
        this.setParamObj(map, prefix + "CurrentState.", this.CurrentState);
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);
        this.setParamSimple(map, prefix + "WorkingDir", this.WorkingDir);
        this.setParamObj(map, prefix + "LivenessProbe.", this.LivenessProbe);
        this.setParamObj(map, prefix + "ReadinessProbe.", this.ReadinessProbe);
        this.setParamSimple(map, prefix + "GpuLimit", this.GpuLimit);
        this.setParamObj(map, prefix + "SecurityContext.", this.SecurityContext);

    }
}

