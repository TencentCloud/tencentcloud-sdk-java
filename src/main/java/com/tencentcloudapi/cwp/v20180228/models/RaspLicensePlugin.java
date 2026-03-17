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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RaspLicensePlugin extends AbstractModel {

    /**
    * java进程pid
    */
    @SerializedName("PID")
    @Expose
    private Long PID;

    /**
    * java主类
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * 0: 注入中, 1: 注入成功, 2: 插件超时, 3: 插件退出, 4: 注入失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 错误详情
    */
    @SerializedName("ErrorLog")
    @Expose
    private String ErrorLog;

    /**
    * 注入失败原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 注入时间
    */
    @SerializedName("InjectTime")
    @Expose
    private String InjectTime;

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
     * Get java主类 
     * @return MainClass java主类
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set java主类
     * @param MainClass java主类
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get 0: 注入中, 1: 注入成功, 2: 插件超时, 3: 插件退出, 4: 注入失败 
     * @return Status 0: 注入中, 1: 注入成功, 2: 插件超时, 3: 插件退出, 4: 注入失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: 注入中, 1: 注入成功, 2: 插件超时, 3: 插件退出, 4: 注入失败
     * @param Status 0: 注入中, 1: 注入成功, 2: 插件超时, 3: 插件退出, 4: 注入失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 错误详情 
     * @return ErrorLog 错误详情
     */
    public String getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set 错误详情
     * @param ErrorLog 错误详情
     */
    public void setErrorLog(String ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    /**
     * Get 注入失败原因 
     * @return Reason 注入失败原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 注入失败原因
     * @param Reason 注入失败原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 注入时间 
     * @return InjectTime 注入时间
     */
    public String getInjectTime() {
        return this.InjectTime;
    }

    /**
     * Set 注入时间
     * @param InjectTime 注入时间
     */
    public void setInjectTime(String InjectTime) {
        this.InjectTime = InjectTime;
    }

    public RaspLicensePlugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspLicensePlugin(RaspLicensePlugin source) {
        if (source.PID != null) {
            this.PID = new Long(source.PID);
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
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.InjectTime != null) {
            this.InjectTime = new String(source.InjectTime);
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
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "InjectTime", this.InjectTime);

    }
}

