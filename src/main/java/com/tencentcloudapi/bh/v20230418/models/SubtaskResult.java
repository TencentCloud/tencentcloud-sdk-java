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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtaskResult extends AbstractModel {

    /**
    * 执行日志ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 执行主机实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 执行主机名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 执行主机地域
    */
    @SerializedName("ApCode")
    @Expose
    private String ApCode;

    /**
    * 执行主机外网IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 执行主机内网IP
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 运维任务状态 1 - 执行中，2 - 成功， 3 - 失败，4 - 超时
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 运维任务失败原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 运维任务命令退出码
    */
    @SerializedName("ExitCode")
    @Expose
    private Long ExitCode;

    /**
    * 运维任务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 运维任务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 运维任务执行结果输出。默认超出16384字节的内容会被自动截断
    */
    @SerializedName("StdOut")
    @Expose
    private String StdOut;

    /**
    * 运维任务执行结果错误
    */
    @SerializedName("StdErr")
    @Expose
    private String StdErr;

    /**
    * 资产名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 资产账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
     * Get 执行日志ID 
     * @return Id 执行日志ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 执行日志ID
     * @param Id 执行日志ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 执行主机实例ID 
     * @return InstanceId 执行主机实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 执行主机实例ID
     * @param InstanceId 执行主机实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 执行主机名称 
     * @return Name 执行主机名称
     * @deprecated
     */
    @Deprecated
    public String getName() {
        return this.Name;
    }

    /**
     * Set 执行主机名称
     * @param Name 执行主机名称
     * @deprecated
     */
    @Deprecated
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 执行主机地域 
     * @return ApCode 执行主机地域
     */
    public String getApCode() {
        return this.ApCode;
    }

    /**
     * Set 执行主机地域
     * @param ApCode 执行主机地域
     */
    public void setApCode(String ApCode) {
        this.ApCode = ApCode;
    }

    /**
     * Get 执行主机外网IP 
     * @return PublicIp 执行主机外网IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 执行主机外网IP
     * @param PublicIp 执行主机外网IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 执行主机内网IP 
     * @return PrivateIp 执行主机内网IP
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 执行主机内网IP
     * @param PrivateIp 执行主机内网IP
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 运维任务状态 1 - 执行中，2 - 成功， 3 - 失败，4 - 超时 
     * @return Status 运维任务状态 1 - 执行中，2 - 成功， 3 - 失败，4 - 超时
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 运维任务状态 1 - 执行中，2 - 成功， 3 - 失败，4 - 超时
     * @param Status 运维任务状态 1 - 执行中，2 - 成功， 3 - 失败，4 - 超时
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 运维任务失败原因 
     * @return Reason 运维任务失败原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 运维任务失败原因
     * @param Reason 运维任务失败原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 运维任务命令退出码 
     * @return ExitCode 运维任务命令退出码
     */
    public Long getExitCode() {
        return this.ExitCode;
    }

    /**
     * Set 运维任务命令退出码
     * @param ExitCode 运维任务命令退出码
     */
    public void setExitCode(Long ExitCode) {
        this.ExitCode = ExitCode;
    }

    /**
     * Get 运维任务开始时间 
     * @return StartTime 运维任务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 运维任务开始时间
     * @param StartTime 运维任务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 运维任务结束时间 
     * @return EndTime 运维任务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 运维任务结束时间
     * @param EndTime 运维任务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 运维任务执行结果输出。默认超出16384字节的内容会被自动截断 
     * @return StdOut 运维任务执行结果输出。默认超出16384字节的内容会被自动截断
     */
    public String getStdOut() {
        return this.StdOut;
    }

    /**
     * Set 运维任务执行结果输出。默认超出16384字节的内容会被自动截断
     * @param StdOut 运维任务执行结果输出。默认超出16384字节的内容会被自动截断
     */
    public void setStdOut(String StdOut) {
        this.StdOut = StdOut;
    }

    /**
     * Get 运维任务执行结果错误 
     * @return StdErr 运维任务执行结果错误
     */
    public String getStdErr() {
        return this.StdErr;
    }

    /**
     * Set 运维任务执行结果错误
     * @param StdErr 运维任务执行结果错误
     */
    public void setStdErr(String StdErr) {
        this.StdErr = StdErr;
    }

    /**
     * Get 资产名 
     * @return DeviceName 资产名
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 资产名
     * @param DeviceName 资产名
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 资产账号 
     * @return Account 资产账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 资产账号
     * @param Account 资产账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    public SubtaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtaskResult(SubtaskResult source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ApCode != null) {
            this.ApCode = new String(source.ApCode);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.ExitCode != null) {
            this.ExitCode = new Long(source.ExitCode);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.StdOut != null) {
            this.StdOut = new String(source.StdOut);
        }
        if (source.StdErr != null) {
            this.StdErr = new String(source.StdErr);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ApCode", this.ApCode);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "ExitCode", this.ExitCode);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StdOut", this.StdOut);
        this.setParamSimple(map, prefix + "StdErr", this.StdErr);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Account", this.Account);

    }
}

