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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessDetailBaseInfo extends AbstractModel{

    /**
    * 进程名称
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 进程pid
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * 进程启动用户
    */
    @SerializedName("ProcessStartUser")
    @Expose
    private String ProcessStartUser;

    /**
    * 进程用户组
    */
    @SerializedName("ProcessUserGroup")
    @Expose
    private String ProcessUserGroup;

    /**
    * 进程路径
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * 进程命令行参数
    */
    @SerializedName("ProcessParam")
    @Expose
    private String ProcessParam;

    /**
     * Get 进程名称 
     * @return ProcessName 进程名称
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名称
     * @param ProcessName 进程名称
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 进程pid 
     * @return ProcessId 进程pid
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set 进程pid
     * @param ProcessId 进程pid
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get 进程启动用户 
     * @return ProcessStartUser 进程启动用户
     */
    public String getProcessStartUser() {
        return this.ProcessStartUser;
    }

    /**
     * Set 进程启动用户
     * @param ProcessStartUser 进程启动用户
     */
    public void setProcessStartUser(String ProcessStartUser) {
        this.ProcessStartUser = ProcessStartUser;
    }

    /**
     * Get 进程用户组 
     * @return ProcessUserGroup 进程用户组
     */
    public String getProcessUserGroup() {
        return this.ProcessUserGroup;
    }

    /**
     * Set 进程用户组
     * @param ProcessUserGroup 进程用户组
     */
    public void setProcessUserGroup(String ProcessUserGroup) {
        this.ProcessUserGroup = ProcessUserGroup;
    }

    /**
     * Get 进程路径 
     * @return ProcessPath 进程路径
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set 进程路径
     * @param ProcessPath 进程路径
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get 进程命令行参数 
     * @return ProcessParam 进程命令行参数
     */
    public String getProcessParam() {
        return this.ProcessParam;
    }

    /**
     * Set 进程命令行参数
     * @param ProcessParam 进程命令行参数
     */
    public void setProcessParam(String ProcessParam) {
        this.ProcessParam = ProcessParam;
    }

    public ProcessDetailBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessDetailBaseInfo(ProcessDetailBaseInfo source) {
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ProcessId != null) {
            this.ProcessId = new Long(source.ProcessId);
        }
        if (source.ProcessStartUser != null) {
            this.ProcessStartUser = new String(source.ProcessStartUser);
        }
        if (source.ProcessUserGroup != null) {
            this.ProcessUserGroup = new String(source.ProcessUserGroup);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.ProcessParam != null) {
            this.ProcessParam = new String(source.ProcessParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "ProcessStartUser", this.ProcessStartUser);
        this.setParamSimple(map, prefix + "ProcessUserGroup", this.ProcessUserGroup);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "ProcessParam", this.ProcessParam);

    }
}

