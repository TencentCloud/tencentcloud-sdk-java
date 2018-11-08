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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenPort  extends AbstractModel{

    /**
    * 唯一ID。
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 云镜客户端唯一UUID。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 开放端口号。
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 主机IP。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 主机名。
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 端口对应进程名。
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 端口对应进程Pid。
    */
    @SerializedName("Pid")
    @Expose
    private Integer Pid;

    /**
    * 记录创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 记录更新时间。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * 获取唯一ID。
     * @return Id 唯一ID。
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置唯一ID。
     * @param Id 唯一ID。
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取云镜客户端唯一UUID。
     * @return Uuid 云镜客户端唯一UUID。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * 设置云镜客户端唯一UUID。
     * @param Uuid 云镜客户端唯一UUID。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * 获取开放端口号。
     * @return Port 开放端口号。
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置开放端口号。
     * @param Port 开放端口号。
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取主机IP。
     * @return MachineIp 主机IP。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * 设置主机IP。
     * @param MachineIp 主机IP。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * 获取主机名。
     * @return MachineName 主机名。
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * 设置主机名。
     * @param MachineName 主机名。
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * 获取端口对应进程名。
     * @return ProcessName 端口对应进程名。
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * 设置端口对应进程名。
     * @param ProcessName 端口对应进程名。
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * 获取端口对应进程Pid。
     * @return Pid 端口对应进程Pid。
     */
    public Integer getPid() {
        return this.Pid;
    }

    /**
     * 设置端口对应进程Pid。
     * @param Pid 端口对应进程Pid。
     */
    public void setPid(Integer Pid) {
        this.Pid = Pid;
    }

    /**
     * 获取记录创建时间。
     * @return CreateTime 记录创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置记录创建时间。
     * @param CreateTime 记录创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取记录更新时间。
     * @return ModifyTime 记录更新时间。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * 设置记录更新时间。
     * @param ModifyTime 记录更新时间。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

