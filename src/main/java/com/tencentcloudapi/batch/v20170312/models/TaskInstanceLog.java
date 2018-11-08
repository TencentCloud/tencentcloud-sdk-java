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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInstanceLog  extends AbstractModel{

    /**
    * 任务实例
    */
    @SerializedName("TaskInstanceIndex")
    @Expose
    private Integer TaskInstanceIndex;

    /**
    * 标准输出日志（Base64编码）
    */
    @SerializedName("StdoutLog")
    @Expose
    private String StdoutLog;

    /**
    * 标准错误日志（Base64编码）
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
     * 获取任务实例
     * @return TaskInstanceIndex 任务实例
     */
    public Integer getTaskInstanceIndex() {
        return this.TaskInstanceIndex;
    }

    /**
     * 设置任务实例
     * @param TaskInstanceIndex 任务实例
     */
    public void setTaskInstanceIndex(Integer TaskInstanceIndex) {
        this.TaskInstanceIndex = TaskInstanceIndex;
    }

    /**
     * 获取标准输出日志（Base64编码）
     * @return StdoutLog 标准输出日志（Base64编码）
     */
    public String getStdoutLog() {
        return this.StdoutLog;
    }

    /**
     * 设置标准输出日志（Base64编码）
     * @param StdoutLog 标准输出日志（Base64编码）
     */
    public void setStdoutLog(String StdoutLog) {
        this.StdoutLog = StdoutLog;
    }

    /**
     * 获取标准错误日志（Base64编码）
     * @return StderrLog 标准错误日志（Base64编码）
     */
    public String getStderrLog() {
        return this.StderrLog;
    }

    /**
     * 设置标准错误日志（Base64编码）
     * @param StderrLog 标准错误日志（Base64编码）
     */
    public void setStderrLog(String StderrLog) {
        this.StderrLog = StderrLog;
    }

    /**
     * 获取标准输出重定向路径
     * @return StdoutRedirectPath 标准输出重定向路径
     */
    public String getStdoutRedirectPath() {
        return this.StdoutRedirectPath;
    }

    /**
     * 设置标准输出重定向路径
     * @param StdoutRedirectPath 标准输出重定向路径
     */
    public void setStdoutRedirectPath(String StdoutRedirectPath) {
        this.StdoutRedirectPath = StdoutRedirectPath;
    }

    /**
     * 获取标准错误重定向路径
     * @return StderrRedirectPath 标准错误重定向路径
     */
    public String getStderrRedirectPath() {
        return this.StderrRedirectPath;
    }

    /**
     * 设置标准错误重定向路径
     * @param StderrRedirectPath 标准错误重定向路径
     */
    public void setStderrRedirectPath(String StderrRedirectPath) {
        this.StderrRedirectPath = StderrRedirectPath;
    }

    /**
     * 获取标准输出重定向文件名
     * @return StdoutRedirectFileName 标准输出重定向文件名
     */
    public String getStdoutRedirectFileName() {
        return this.StdoutRedirectFileName;
    }

    /**
     * 设置标准输出重定向文件名
     * @param StdoutRedirectFileName 标准输出重定向文件名
     */
    public void setStdoutRedirectFileName(String StdoutRedirectFileName) {
        this.StdoutRedirectFileName = StdoutRedirectFileName;
    }

    /**
     * 获取标准错误重定向文件名
     * @return StderrRedirectFileName 标准错误重定向文件名
     */
    public String getStderrRedirectFileName() {
        return this.StderrRedirectFileName;
    }

    /**
     * 设置标准错误重定向文件名
     * @param StderrRedirectFileName 标准错误重定向文件名
     */
    public void setStderrRedirectFileName(String StderrRedirectFileName) {
        this.StderrRedirectFileName = StderrRedirectFileName;
    }

    /**
     * 内部实现，用户禁止调用
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

