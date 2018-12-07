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

public class MaliciousRequest  extends AbstractModel{

    /**
    * 记录ID。
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 云镜客户端UUID。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机内网IP。
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
    * 恶意请求域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 恶意请求数。
    */
    @SerializedName("Count")
    @Expose
    private Integer Count;

    /**
    * 进程名。
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 记录状态。
<li>UN_OPERATED：待处理</li>
<li>TRUSTED：已信任</li>
<li>UN_TRUSTED：已取消信任</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 恶意请求域名描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 参考地址。
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * 发现时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 记录合并时间。
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * 进程MD5
值。
    */
    @SerializedName("ProcessMd5")
    @Expose
    private String ProcessMd5;

    /**
    * 执行命令行。
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * 进程PID。
    */
    @SerializedName("Pid")
    @Expose
    private Integer Pid;

    /**
     * 获取记录ID。
     * @return Id 记录ID。
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置记录ID。
     * @param Id 记录ID。
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取云镜客户端UUID。
     * @return Uuid 云镜客户端UUID。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * 设置云镜客户端UUID。
     * @param Uuid 云镜客户端UUID。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * 获取主机内网IP。
     * @return MachineIp 主机内网IP。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * 设置主机内网IP。
     * @param MachineIp 主机内网IP。
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
     * 获取恶意请求域名。
     * @return Domain 恶意请求域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置恶意请求域名。
     * @param Domain 恶意请求域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取恶意请求数。
     * @return Count 恶意请求数。
     */
    public Integer getCount() {
        return this.Count;
    }

    /**
     * 设置恶意请求数。
     * @param Count 恶意请求数。
     */
    public void setCount(Integer Count) {
        this.Count = Count;
    }

    /**
     * 获取进程名。
     * @return ProcessName 进程名。
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * 设置进程名。
     * @param ProcessName 进程名。
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * 获取记录状态。
<li>UN_OPERATED：待处理</li>
<li>TRUSTED：已信任</li>
<li>UN_TRUSTED：已取消信任</li>
     * @return Status 记录状态。
<li>UN_OPERATED：待处理</li>
<li>TRUSTED：已信任</li>
<li>UN_TRUSTED：已取消信任</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置记录状态。
<li>UN_OPERATED：待处理</li>
<li>TRUSTED：已信任</li>
<li>UN_TRUSTED：已取消信任</li>
     * @param Status 记录状态。
<li>UN_OPERATED：待处理</li>
<li>TRUSTED：已信任</li>
<li>UN_TRUSTED：已取消信任</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取恶意请求域名描述。
     * @return Description 恶意请求域名描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置恶意请求域名描述。
     * @param Description 恶意请求域名描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取参考地址。
     * @return Reference 参考地址。
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * 设置参考地址。
     * @param Reference 参考地址。
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * 获取发现时间。
     * @return CreateTime 发现时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置发现时间。
     * @param CreateTime 发现时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取记录合并时间。
     * @return MergeTime 记录合并时间。
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * 设置记录合并时间。
     * @param MergeTime 记录合并时间。
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
    }

    /**
     * 获取进程MD5
值。
     * @return ProcessMd5 进程MD5
值。
     */
    public String getProcessMd5() {
        return this.ProcessMd5;
    }

    /**
     * 设置进程MD5
值。
     * @param ProcessMd5 进程MD5
值。
     */
    public void setProcessMd5(String ProcessMd5) {
        this.ProcessMd5 = ProcessMd5;
    }

    /**
     * 获取执行命令行。
     * @return CmdLine 执行命令行。
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * 设置执行命令行。
     * @param CmdLine 执行命令行。
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * 获取进程PID。
     * @return Pid 进程PID。
     */
    public Integer getPid() {
        return this.Pid;
    }

    /**
     * 设置进程PID。
     * @param Pid 进程PID。
     */
    public void setPid(Integer Pid) {
        this.Pid = Pid;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamSimple(map, prefix + "ProcessMd5", this.ProcessMd5);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "Pid", this.Pid);

    }
}

