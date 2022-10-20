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

public class VulDefencePlugin extends AbstractModel{

    /**
    * java进程pid
    */
    @SerializedName("PID")
    @Expose
    private Long PID;

    /**
    * 进程主类名
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * 插件运行状态：注入中:INJECTING，注入成功：SUCCESS，注入失败：FAIL，插件超时：TIMEOUT，插件退出：QUIT
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误日志
    */
    @SerializedName("ErrorLog")
    @Expose
    private String ErrorLog;

    /**
     * Get java进程pid 
     * @return PID java进程pid
     */
    public Long getPID() {
        return this.PID;
    }

    /**
     * Set java进程pid
     * @param PID java进程pid
     */
    public void setPID(Long PID) {
        this.PID = PID;
    }

    /**
     * Get 进程主类名 
     * @return MainClass 进程主类名
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set 进程主类名
     * @param MainClass 进程主类名
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get 插件运行状态：注入中:INJECTING，注入成功：SUCCESS，注入失败：FAIL，插件超时：TIMEOUT，插件退出：QUIT 
     * @return Status 插件运行状态：注入中:INJECTING，注入成功：SUCCESS，注入失败：FAIL，插件超时：TIMEOUT，插件退出：QUIT
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 插件运行状态：注入中:INJECTING，注入成功：SUCCESS，注入失败：FAIL，插件超时：TIMEOUT，插件退出：QUIT
     * @param Status 插件运行状态：注入中:INJECTING，注入成功：SUCCESS，注入失败：FAIL，插件超时：TIMEOUT，插件退出：QUIT
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误日志 
     * @return ErrorLog 错误日志
     */
    public String getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set 错误日志
     * @param ErrorLog 错误日志
     */
    public void setErrorLog(String ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    public VulDefencePlugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefencePlugin(VulDefencePlugin source) {
        if (source.PID != null) {
            this.PID = new Long(source.PID);
        }
        if (source.MainClass != null) {
            this.MainClass = new String(source.MainClass);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorLog != null) {
            this.ErrorLog = new String(source.ErrorLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PID", this.PID);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorLog", this.ErrorLog);

    }
}

