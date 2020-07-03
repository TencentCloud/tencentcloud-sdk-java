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
package com.tencentcloudapi.cis.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Container extends AbstractModel{

    /**
    * 容器启动命令
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 容器启动参数
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
    * 容器环境变量
    */
    @SerializedName("EnvironmentVars")
    @Expose
    private EnvironmentVar [] EnvironmentVars;

    /**
    * 镜像
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 容器名，由小写字母、数字和 - 组成，由小写字母开头，小写字母或数字结尾，且长度不超过 63个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * CPU，单位：核
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * 内存，单位：Gi
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * 重启次数
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
    * 当前状态
    */
    @SerializedName("CurrentState")
    @Expose
    private ContainerState CurrentState;

    /**
    * 上一次状态
    */
    @SerializedName("PreviousState")
    @Expose
    private ContainerState PreviousState;

    /**
    * 容器工作目录
    */
    @SerializedName("WorkingDir")
    @Expose
    private String WorkingDir;

    /**
    * 容器ID
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
     * Get 容器启动命令 
     * @return Command 容器启动命令
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 容器启动命令
     * @param Command 容器启动命令
     */
    public void setCommand(String Command) {
        this.Command = Command;
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
     * Get 容器环境变量 
     * @return EnvironmentVars 容器环境变量
     */
    public EnvironmentVar [] getEnvironmentVars() {
        return this.EnvironmentVars;
    }

    /**
     * Set 容器环境变量
     * @param EnvironmentVars 容器环境变量
     */
    public void setEnvironmentVars(EnvironmentVar [] EnvironmentVars) {
        this.EnvironmentVars = EnvironmentVars;
    }

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
     * Get 容器名，由小写字母、数字和 - 组成，由小写字母开头，小写字母或数字结尾，且长度不超过 63个字符 
     * @return Name 容器名，由小写字母、数字和 - 组成，由小写字母开头，小写字母或数字结尾，且长度不超过 63个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 容器名，由小写字母、数字和 - 组成，由小写字母开头，小写字母或数字结尾，且长度不超过 63个字符
     * @param Name 容器名，由小写字母、数字和 - 组成，由小写字母开头，小写字母或数字结尾，且长度不超过 63个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get CPU，单位：核 
     * @return Cpu CPU，单位：核
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU，单位：核
     * @param Cpu CPU，单位：核
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存，单位：Gi 
     * @return Memory 内存，单位：Gi
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存，单位：Gi
     * @param Memory 内存，单位：Gi
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 重启次数 
     * @return RestartCount 重启次数
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set 重启次数
     * @param RestartCount 重启次数
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * Get 当前状态 
     * @return CurrentState 当前状态
     */
    public ContainerState getCurrentState() {
        return this.CurrentState;
    }

    /**
     * Set 当前状态
     * @param CurrentState 当前状态
     */
    public void setCurrentState(ContainerState CurrentState) {
        this.CurrentState = CurrentState;
    }

    /**
     * Get 上一次状态 
     * @return PreviousState 上一次状态
     */
    public ContainerState getPreviousState() {
        return this.PreviousState;
    }

    /**
     * Set 上一次状态
     * @param PreviousState 上一次状态
     */
    public void setPreviousState(ContainerState PreviousState) {
        this.PreviousState = PreviousState;
    }

    /**
     * Get 容器工作目录 
     * @return WorkingDir 容器工作目录
     */
    public String getWorkingDir() {
        return this.WorkingDir;
    }

    /**
     * Set 容器工作目录
     * @param WorkingDir 容器工作目录
     */
    public void setWorkingDir(String WorkingDir) {
        this.WorkingDir = WorkingDir;
    }

    /**
     * Get 容器ID 
     * @return ContainerId 容器ID
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器ID
     * @param ContainerId 容器ID
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);
        this.setParamArrayObj(map, prefix + "EnvironmentVars.", this.EnvironmentVars);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);
        this.setParamObj(map, prefix + "CurrentState.", this.CurrentState);
        this.setParamObj(map, prefix + "PreviousState.", this.PreviousState);
        this.setParamSimple(map, prefix + "WorkingDir", this.WorkingDir);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);

    }
}

