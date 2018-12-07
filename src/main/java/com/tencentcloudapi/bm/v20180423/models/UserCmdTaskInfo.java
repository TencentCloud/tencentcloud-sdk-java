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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserCmdTaskInfo  extends AbstractModel{

    /**
    * 自动编号，可忽略
    */
    @SerializedName("AutoId")
    @Expose
    private Integer AutoId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务开始时间
    */
    @SerializedName("RunBeginTime")
    @Expose
    private String RunBeginTime;

    /**
    * 任务结束时间
    */
    @SerializedName("RunEndTime")
    @Expose
    private String RunEndTime;

    /**
    * 任务状态ID，取值为 -1：进行中；0：成功；>0：失败错误码
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 设备别名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 设备ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 私有网络名
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 私有网络整型ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络Cidr
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 子网名
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网Cidr
    */
    @SerializedName("SubnetCidrBlock")
    @Expose
    private String SubnetCidrBlock;

    /**
    * 内网IP
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * 脚本内容，base64编码后的值
    */
    @SerializedName("CmdContent")
    @Expose
    private String CmdContent;

    /**
    * 脚本参数，base64编码后的值
    */
    @SerializedName("CmdParam")
    @Expose
    private String CmdParam;

    /**
    * 脚本执行结果，base64编码后的值
    */
    @SerializedName("CmdResult")
    @Expose
    private String CmdResult;

    /**
    * 用户AppId
    */
    @SerializedName("AppId")
    @Expose
    private Integer AppId;

    /**
    * 用户执行脚本结束退出的返回值，没有返回值为-1
    */
    @SerializedName("LastShellExit")
    @Expose
    private Integer LastShellExit;

    /**
     * 获取自动编号，可忽略
     * @return AutoId 自动编号，可忽略
     */
    public Integer getAutoId() {
        return this.AutoId;
    }

    /**
     * 设置自动编号，可忽略
     * @param AutoId 自动编号，可忽略
     */
    public void setAutoId(Integer AutoId) {
        this.AutoId = AutoId;
    }

    /**
     * 获取任务ID
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取任务开始时间
     * @return RunBeginTime 任务开始时间
     */
    public String getRunBeginTime() {
        return this.RunBeginTime;
    }

    /**
     * 设置任务开始时间
     * @param RunBeginTime 任务开始时间
     */
    public void setRunBeginTime(String RunBeginTime) {
        this.RunBeginTime = RunBeginTime;
    }

    /**
     * 获取任务结束时间
     * @return RunEndTime 任务结束时间
     */
    public String getRunEndTime() {
        return this.RunEndTime;
    }

    /**
     * 设置任务结束时间
     * @param RunEndTime 任务结束时间
     */
    public void setRunEndTime(String RunEndTime) {
        this.RunEndTime = RunEndTime;
    }

    /**
     * 获取任务状态ID，取值为 -1：进行中；0：成功；>0：失败错误码
     * @return Status 任务状态ID，取值为 -1：进行中；0：成功；>0：失败错误码
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置任务状态ID，取值为 -1：进行中；0：成功；>0：失败错误码
     * @param Status 任务状态ID，取值为 -1：进行中；0：成功；>0：失败错误码
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取设备别名
     * @return InstanceName 设备别名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置设备别名
     * @param InstanceName 设备别名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取设备ID
     * @return InstanceId 设备ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置设备ID
     * @param InstanceId 设备ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取私有网络名
     * @return VpcName 私有网络名
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * 设置私有网络名
     * @param VpcName 私有网络名
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * 获取私有网络整型ID
     * @return VpcId 私有网络整型ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络整型ID
     * @param VpcId 私有网络整型ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取私有网络Cidr
     * @return VpcCidrBlock 私有网络Cidr
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * 设置私有网络Cidr
     * @param VpcCidrBlock 私有网络Cidr
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * 获取子网名
     * @return SubnetName 子网名
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * 设置子网名
     * @param SubnetName 子网名
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * 获取子网ID
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取子网Cidr
     * @return SubnetCidrBlock 子网Cidr
     */
    public String getSubnetCidrBlock() {
        return this.SubnetCidrBlock;
    }

    /**
     * 设置子网Cidr
     * @param SubnetCidrBlock 子网Cidr
     */
    public void setSubnetCidrBlock(String SubnetCidrBlock) {
        this.SubnetCidrBlock = SubnetCidrBlock;
    }

    /**
     * 获取内网IP
     * @return LanIp 内网IP
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * 设置内网IP
     * @param LanIp 内网IP
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * 获取脚本内容，base64编码后的值
     * @return CmdContent 脚本内容，base64编码后的值
     */
    public String getCmdContent() {
        return this.CmdContent;
    }

    /**
     * 设置脚本内容，base64编码后的值
     * @param CmdContent 脚本内容，base64编码后的值
     */
    public void setCmdContent(String CmdContent) {
        this.CmdContent = CmdContent;
    }

    /**
     * 获取脚本参数，base64编码后的值
     * @return CmdParam 脚本参数，base64编码后的值
     */
    public String getCmdParam() {
        return this.CmdParam;
    }

    /**
     * 设置脚本参数，base64编码后的值
     * @param CmdParam 脚本参数，base64编码后的值
     */
    public void setCmdParam(String CmdParam) {
        this.CmdParam = CmdParam;
    }

    /**
     * 获取脚本执行结果，base64编码后的值
     * @return CmdResult 脚本执行结果，base64编码后的值
     */
    public String getCmdResult() {
        return this.CmdResult;
    }

    /**
     * 设置脚本执行结果，base64编码后的值
     * @param CmdResult 脚本执行结果，base64编码后的值
     */
    public void setCmdResult(String CmdResult) {
        this.CmdResult = CmdResult;
    }

    /**
     * 获取用户AppId
     * @return AppId 用户AppId
     */
    public Integer getAppId() {
        return this.AppId;
    }

    /**
     * 设置用户AppId
     * @param AppId 用户AppId
     */
    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取用户执行脚本结束退出的返回值，没有返回值为-1
     * @return LastShellExit 用户执行脚本结束退出的返回值，没有返回值为-1
     */
    public Integer getLastShellExit() {
        return this.LastShellExit;
    }

    /**
     * 设置用户执行脚本结束退出的返回值，没有返回值为-1
     * @param LastShellExit 用户执行脚本结束退出的返回值，没有返回值为-1
     */
    public void setLastShellExit(Integer LastShellExit) {
        this.LastShellExit = LastShellExit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoId", this.AutoId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RunBeginTime", this.RunBeginTime);
        this.setParamSimple(map, prefix + "RunEndTime", this.RunEndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetCidrBlock", this.SubnetCidrBlock);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "CmdContent", this.CmdContent);
        this.setParamSimple(map, prefix + "CmdParam", this.CmdParam);
        this.setParamSimple(map, prefix + "CmdResult", this.CmdResult);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "LastShellExit", this.LastShellExit);

    }
}

