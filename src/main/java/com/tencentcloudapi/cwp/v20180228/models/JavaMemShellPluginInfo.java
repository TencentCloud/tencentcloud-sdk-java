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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JavaMemShellPluginInfo extends AbstractModel{

    /**
    * 注入进程pid
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 注入进程主类
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * 注入状态：0: 注入中, 1: 注入成功, 2: 插件超时, 3: 插件退出, 4: 注入失败 5: 软删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 错误日志
    */
    @SerializedName("ErrorLog")
    @Expose
    private String ErrorLog;

    /**
     * Get 注入进程pid 
     * @return Pid 注入进程pid
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 注入进程pid
     * @param Pid 注入进程pid
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 注入进程主类 
     * @return MainClass 注入进程主类
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set 注入进程主类
     * @param MainClass 注入进程主类
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get 注入状态：0: 注入中, 1: 注入成功, 2: 插件超时, 3: 插件退出, 4: 注入失败 5: 软删除 
     * @return Status 注入状态：0: 注入中, 1: 注入成功, 2: 插件超时, 3: 插件退出, 4: 注入失败 5: 软删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 注入状态：0: 注入中, 1: 注入成功, 2: 插件超时, 3: 插件退出, 4: 注入失败 5: 软删除
     * @param Status 注入状态：0: 注入中, 1: 注入成功, 2: 插件超时, 3: 插件退出, 4: 注入失败 5: 软删除
     */
    public void setStatus(Long Status) {
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

    public JavaMemShellPluginInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JavaMemShellPluginInfo(JavaMemShellPluginInfo source) {
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.MainClass != null) {
            this.MainClass = new String(source.MainClass);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrorLog != null) {
            this.ErrorLog = new String(source.ErrorLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorLog", this.ErrorLog);

    }
}

