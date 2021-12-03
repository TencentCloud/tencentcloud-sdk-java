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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskResult extends AbstractModel{

    /**
    * 命令执行ExitCode。
    */
    @SerializedName("ExitCode")
    @Expose
    private Long ExitCode;

    /**
    * Base64编码后的命令输出。最大长度24KB。
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * 命令执行开始时间。
    */
    @SerializedName("ExecStartTime")
    @Expose
    private String ExecStartTime;

    /**
    * 命令执行结束时间。
    */
    @SerializedName("ExecEndTime")
    @Expose
    private String ExecEndTime;

    /**
    * 命令最终输出被截断的字节数。
    */
    @SerializedName("Dropped")
    @Expose
    private Long Dropped;

    /**
    * 日志在cos中的地址
    */
    @SerializedName("OutputUrl")
    @Expose
    private String OutputUrl;

    /**
    * 日志上传cos的错误信息。
    */
    @SerializedName("OutputUploadCOSErrorInfo")
    @Expose
    private String OutputUploadCOSErrorInfo;

    /**
     * Get 命令执行ExitCode。 
     * @return ExitCode 命令执行ExitCode。
     */
    public Long getExitCode() {
        return this.ExitCode;
    }

    /**
     * Set 命令执行ExitCode。
     * @param ExitCode 命令执行ExitCode。
     */
    public void setExitCode(Long ExitCode) {
        this.ExitCode = ExitCode;
    }

    /**
     * Get Base64编码后的命令输出。最大长度24KB。 
     * @return Output Base64编码后的命令输出。最大长度24KB。
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set Base64编码后的命令输出。最大长度24KB。
     * @param Output Base64编码后的命令输出。最大长度24KB。
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get 命令执行开始时间。 
     * @return ExecStartTime 命令执行开始时间。
     */
    public String getExecStartTime() {
        return this.ExecStartTime;
    }

    /**
     * Set 命令执行开始时间。
     * @param ExecStartTime 命令执行开始时间。
     */
    public void setExecStartTime(String ExecStartTime) {
        this.ExecStartTime = ExecStartTime;
    }

    /**
     * Get 命令执行结束时间。 
     * @return ExecEndTime 命令执行结束时间。
     */
    public String getExecEndTime() {
        return this.ExecEndTime;
    }

    /**
     * Set 命令执行结束时间。
     * @param ExecEndTime 命令执行结束时间。
     */
    public void setExecEndTime(String ExecEndTime) {
        this.ExecEndTime = ExecEndTime;
    }

    /**
     * Get 命令最终输出被截断的字节数。 
     * @return Dropped 命令最终输出被截断的字节数。
     */
    public Long getDropped() {
        return this.Dropped;
    }

    /**
     * Set 命令最终输出被截断的字节数。
     * @param Dropped 命令最终输出被截断的字节数。
     */
    public void setDropped(Long Dropped) {
        this.Dropped = Dropped;
    }

    /**
     * Get 日志在cos中的地址 
     * @return OutputUrl 日志在cos中的地址
     */
    public String getOutputUrl() {
        return this.OutputUrl;
    }

    /**
     * Set 日志在cos中的地址
     * @param OutputUrl 日志在cos中的地址
     */
    public void setOutputUrl(String OutputUrl) {
        this.OutputUrl = OutputUrl;
    }

    /**
     * Get 日志上传cos的错误信息。 
     * @return OutputUploadCOSErrorInfo 日志上传cos的错误信息。
     */
    public String getOutputUploadCOSErrorInfo() {
        return this.OutputUploadCOSErrorInfo;
    }

    /**
     * Set 日志上传cos的错误信息。
     * @param OutputUploadCOSErrorInfo 日志上传cos的错误信息。
     */
    public void setOutputUploadCOSErrorInfo(String OutputUploadCOSErrorInfo) {
        this.OutputUploadCOSErrorInfo = OutputUploadCOSErrorInfo;
    }

    public TaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskResult(TaskResult source) {
        if (source.ExitCode != null) {
            this.ExitCode = new Long(source.ExitCode);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.ExecStartTime != null) {
            this.ExecStartTime = new String(source.ExecStartTime);
        }
        if (source.ExecEndTime != null) {
            this.ExecEndTime = new String(source.ExecEndTime);
        }
        if (source.Dropped != null) {
            this.Dropped = new Long(source.Dropped);
        }
        if (source.OutputUrl != null) {
            this.OutputUrl = new String(source.OutputUrl);
        }
        if (source.OutputUploadCOSErrorInfo != null) {
            this.OutputUploadCOSErrorInfo = new String(source.OutputUploadCOSErrorInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExitCode", this.ExitCode);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "ExecStartTime", this.ExecStartTime);
        this.setParamSimple(map, prefix + "ExecEndTime", this.ExecEndTime);
        this.setParamSimple(map, prefix + "Dropped", this.Dropped);
        this.setParamSimple(map, prefix + "OutputUrl", this.OutputUrl);
        this.setParamSimple(map, prefix + "OutputUploadCOSErrorInfo", this.OutputUploadCOSErrorInfo);

    }
}

