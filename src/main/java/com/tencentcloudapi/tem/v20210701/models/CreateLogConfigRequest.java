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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLogConfigRequest extends AbstractModel{

    /**
    * 环境 ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 配置名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 收集类型，container_stdout 为标准输出；container_file 为文件；
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * 应用 ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 日志集 ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 日志主题 ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志提取模式，minimalist_log 为单行全文；multiline_log 为多行全文；json_log 为 json格式；fullregex_log 为单行正则；multiline_fullregex_log 为多行正则
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 首行正则表达式，当LogType=multiline_log 时生效
    */
    @SerializedName("BeginningRegex")
    @Expose
    private String BeginningRegex;

    /**
    * 收集文件目录，当 InputType=container_file 时生效
    */
    @SerializedName("LogPath")
    @Expose
    private String LogPath;

    /**
    * 收集文件名模式，当 InputType=container_file 时生效
    */
    @SerializedName("FilePattern")
    @Expose
    private String FilePattern;

    /**
    * 导出规则
    */
    @SerializedName("ExtractRule")
    @Expose
    private LogConfigExtractRule ExtractRule;

    /**
     * Get 环境 ID 
     * @return EnvironmentId 环境 ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境 ID
     * @param EnvironmentId 环境 ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 配置名 
     * @return Name 配置名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置名
     * @param Name 配置名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 收集类型，container_stdout 为标准输出；container_file 为文件； 
     * @return InputType 收集类型，container_stdout 为标准输出；container_file 为文件；
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set 收集类型，container_stdout 为标准输出；container_file 为文件；
     * @param InputType 收集类型，container_stdout 为标准输出；container_file 为文件；
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get 应用 ID 
     * @return ApplicationId 应用 ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用 ID
     * @param ApplicationId 应用 ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 日志集 ID 
     * @return LogsetId 日志集 ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集 ID
     * @param LogsetId 日志集 ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 日志主题 ID 
     * @return TopicId 日志主题 ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题 ID
     * @param TopicId 日志主题 ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志提取模式，minimalist_log 为单行全文；multiline_log 为多行全文；json_log 为 json格式；fullregex_log 为单行正则；multiline_fullregex_log 为多行正则 
     * @return LogType 日志提取模式，minimalist_log 为单行全文；multiline_log 为多行全文；json_log 为 json格式；fullregex_log 为单行正则；multiline_fullregex_log 为多行正则
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志提取模式，minimalist_log 为单行全文；multiline_log 为多行全文；json_log 为 json格式；fullregex_log 为单行正则；multiline_fullregex_log 为多行正则
     * @param LogType 日志提取模式，minimalist_log 为单行全文；multiline_log 为多行全文；json_log 为 json格式；fullregex_log 为单行正则；multiline_fullregex_log 为多行正则
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 首行正则表达式，当LogType=multiline_log 时生效 
     * @return BeginningRegex 首行正则表达式，当LogType=multiline_log 时生效
     */
    public String getBeginningRegex() {
        return this.BeginningRegex;
    }

    /**
     * Set 首行正则表达式，当LogType=multiline_log 时生效
     * @param BeginningRegex 首行正则表达式，当LogType=multiline_log 时生效
     */
    public void setBeginningRegex(String BeginningRegex) {
        this.BeginningRegex = BeginningRegex;
    }

    /**
     * Get 收集文件目录，当 InputType=container_file 时生效 
     * @return LogPath 收集文件目录，当 InputType=container_file 时生效
     */
    public String getLogPath() {
        return this.LogPath;
    }

    /**
     * Set 收集文件目录，当 InputType=container_file 时生效
     * @param LogPath 收集文件目录，当 InputType=container_file 时生效
     */
    public void setLogPath(String LogPath) {
        this.LogPath = LogPath;
    }

    /**
     * Get 收集文件名模式，当 InputType=container_file 时生效 
     * @return FilePattern 收集文件名模式，当 InputType=container_file 时生效
     */
    public String getFilePattern() {
        return this.FilePattern;
    }

    /**
     * Set 收集文件名模式，当 InputType=container_file 时生效
     * @param FilePattern 收集文件名模式，当 InputType=container_file 时生效
     */
    public void setFilePattern(String FilePattern) {
        this.FilePattern = FilePattern;
    }

    /**
     * Get 导出规则 
     * @return ExtractRule 导出规则
     */
    public LogConfigExtractRule getExtractRule() {
        return this.ExtractRule;
    }

    /**
     * Set 导出规则
     * @param ExtractRule 导出规则
     */
    public void setExtractRule(LogConfigExtractRule ExtractRule) {
        this.ExtractRule = ExtractRule;
    }

    public CreateLogConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLogConfigRequest(CreateLogConfigRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.BeginningRegex != null) {
            this.BeginningRegex = new String(source.BeginningRegex);
        }
        if (source.LogPath != null) {
            this.LogPath = new String(source.LogPath);
        }
        if (source.FilePattern != null) {
            this.FilePattern = new String(source.FilePattern);
        }
        if (source.ExtractRule != null) {
            this.ExtractRule = new LogConfigExtractRule(source.ExtractRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "BeginningRegex", this.BeginningRegex);
        this.setParamSimple(map, prefix + "LogPath", this.LogPath);
        this.setParamSimple(map, prefix + "FilePattern", this.FilePattern);
        this.setParamObj(map, prefix + "ExtractRule.", this.ExtractRule);

    }
}

