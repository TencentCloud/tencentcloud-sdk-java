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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInstanceLog extends AbstractModel {

    /**
    * 任务实例
    */
    @SerializedName("TaskInstanceIndex")
    @Expose
    private Long TaskInstanceIndex;

    /**
    * 标准输出日志（Base64编码，解码后最大日志长度2048字节）
    */
    @SerializedName("StdoutLog")
    @Expose
    private String StdoutLog;

    /**
    * 标准错误日志（Base64编码，解码后最大日志长度2048字节）
    */
    @SerializedName("StderrLog")
    @Expose
    private String StderrLog;

    /**
    * 标准输出重定向路径
    */
    @SerializedName("StdoutRedirectPath")
    @Expose
    private String StdoutRedirectPath;

    /**
    * 标准错误重定向路径
    */
    @SerializedName("StderrRedirectPath")
    @Expose
    private String StderrRedirectPath;

    /**
    * 标准输出重定向文件名
    */
    @SerializedName("StdoutRedirectFileName")
    @Expose
    private String StdoutRedirectFileName;

    /**
    * 标准错误重定向文件名
    */
    @SerializedName("StderrRedirectFileName")
    @Expose
    private String StderrRedirectFileName;

    /**
     * Get 任务实例 
     * @return TaskInstanceIndex 任务实例
     */
    public Long getTaskInstanceIndex() {
        return this.TaskInstanceIndex;
    }

    /**
     * Set 任务实例
     * @param TaskInstanceIndex 任务实例
     */
    public void setTaskInstanceIndex(Long TaskInstanceIndex) {
        this.TaskInstanceIndex = TaskInstanceIndex;
    }

    /**
     * Get 标准输出日志（Base64编码，解码后最大日志长度2048字节） 
     * @return StdoutLog 标准输出日志（Base64编码，解码后最大日志长度2048字节）
     */
    public String getStdoutLog() {
        return this.StdoutLog;
    }

    /**
     * Set 标准输出日志（Base64编码，解码后最大日志长度2048字节）
     * @param StdoutLog 标准输出日志（Base64编码，解码后最大日志长度2048字节）
     */
    public void setStdoutLog(String StdoutLog) {
        this.StdoutLog = StdoutLog;
    }

    /**
     * Get 标准错误日志（Base64编码，解码后最大日志长度2048字节） 
     * @return StderrLog 标准错误日志（Base64编码，解码后最大日志长度2048字节）
     */
    public String getStderrLog() {
        return this.StderrLog;
    }

    /**
     * Set 标准错误日志（Base64编码，解码后最大日志长度2048字节）
     * @param StderrLog 标准错误日志（Base64编码，解码后最大日志长度2048字节）
     */
    public void setStderrLog(String StderrLog) {
        this.StderrLog = StderrLog;
    }

    /**
     * Get 标准输出重定向路径 
     * @return StdoutRedirectPath 标准输出重定向路径
     */
    public String getStdoutRedirectPath() {
        return this.StdoutRedirectPath;
    }

    /**
     * Set 标准输出重定向路径
     * @param StdoutRedirectPath 标准输出重定向路径
     */
    public void setStdoutRedirectPath(String StdoutRedirectPath) {
        this.StdoutRedirectPath = StdoutRedirectPath;
    }

    /**
     * Get 标准错误重定向路径 
     * @return StderrRedirectPath 标准错误重定向路径
     */
    public String getStderrRedirectPath() {
        return this.StderrRedirectPath;
    }

    /**
     * Set 标准错误重定向路径
     * @param StderrRedirectPath 标准错误重定向路径
     */
    public void setStderrRedirectPath(String StderrRedirectPath) {
        this.StderrRedirectPath = StderrRedirectPath;
    }

    /**
     * Get 标准输出重定向文件名 
     * @return StdoutRedirectFileName 标准输出重定向文件名
     */
    public String getStdoutRedirectFileName() {
        return this.StdoutRedirectFileName;
    }

    /**
     * Set 标准输出重定向文件名
     * @param StdoutRedirectFileName 标准输出重定向文件名
     */
    public void setStdoutRedirectFileName(String StdoutRedirectFileName) {
        this.StdoutRedirectFileName = StdoutRedirectFileName;
    }

    /**
     * Get 标准错误重定向文件名 
     * @return StderrRedirectFileName 标准错误重定向文件名
     */
    public String getStderrRedirectFileName() {
        return this.StderrRedirectFileName;
    }

    /**
     * Set 标准错误重定向文件名
     * @param StderrRedirectFileName 标准错误重定向文件名
     */
    public void setStderrRedirectFileName(String StderrRedirectFileName) {
        this.StderrRedirectFileName = StderrRedirectFileName;
    }

    public TaskInstanceLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInstanceLog(TaskInstanceLog source) {
        if (source.TaskInstanceIndex != null) {
            this.TaskInstanceIndex = new Long(source.TaskInstanceIndex);
        }
        if (source.StdoutLog != null) {
            this.StdoutLog = new String(source.StdoutLog);
        }
        if (source.StderrLog != null) {
            this.StderrLog = new String(source.StderrLog);
        }
        if (source.StdoutRedirectPath != null) {
            this.StdoutRedirectPath = new String(source.StdoutRedirectPath);
        }
        if (source.StderrRedirectPath != null) {
            this.StderrRedirectPath = new String(source.StderrRedirectPath);
        }
        if (source.StdoutRedirectFileName != null) {
            this.StdoutRedirectFileName = new String(source.StdoutRedirectFileName);
        }
        if (source.StderrRedirectFileName != null) {
            this.StderrRedirectFileName = new String(source.StderrRedirectFileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskInstanceIndex", this.TaskInstanceIndex);
        this.setParamSimple(map, prefix + "StdoutLog", this.StdoutLog);
        this.setParamSimple(map, prefix + "StderrLog", this.StderrLog);
        this.setParamSimple(map, prefix + "StdoutRedirectPath", this.StdoutRedirectPath);
        this.setParamSimple(map, prefix + "StderrRedirectPath", this.StderrRedirectPath);
        this.setParamSimple(map, prefix + "StdoutRedirectFileName", this.StdoutRedirectFileName);
        this.setParamSimple(map, prefix + "StderrRedirectFileName", this.StderrRedirectFileName);

    }
}

