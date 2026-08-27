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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDataRepositoryTaskRequest extends AbstractModel {

    /**
    * <p>数据流通任务类型, FS_TO_COS(文件系统到COS Bucket),或者COS_TO_FS(COS Bucket到文件系统)</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>COS存储桶名</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>文件系统ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>对于FS_TO_COS, TaskPath是Bucket映射目录的相对路径, 对于COS_TO_FS是COS上的路径。如果置为空, 则表示全部数据</p>
    */
    @SerializedName("TaskPath")
    @Expose
    private String TaskPath;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务路径是否表示绝对路径（暂时仅支持沉降使用）</p>
    */
    @SerializedName("IsTaskPathAbsolute")
    @Expose
    private Boolean IsTaskPathAbsolute;

    /**
    * <p>数据流通方式 MSP_AFM 手动加载  RAW_AFM 按需加载</p>
    */
    @SerializedName("RepositoryType")
    @Expose
    private String RepositoryType;

    /**
    * <p>文件列表下载地址，以http开头</p>
    */
    @SerializedName("TextLocation")
    @Expose
    private String TextLocation;

    /**
    * <p>是否开启自定义路径(暂时仅供预热使用)</p>
    */
    @SerializedName("EnableDataFlowSubPath")
    @Expose
    private Boolean EnableDataFlowSubPath;

    /**
    * <p>自定义路径(暂时仅供预热使用)</p>
    */
    @SerializedName("DataFlowSubPath")
    @Expose
    private String DataFlowSubPath;

    /**
    * <p>是否开启自定义目的路径（预热任务表示本地路径，沉降任务表示COS桶前缀）</p>
    */
    @SerializedName("EnableCustomDestPath")
    @Expose
    private Boolean EnableCustomDestPath;

    /**
    * <p>自定义目的路径（预热任务表示本地路径，沉降任务表示COS桶前缀）</p>
    */
    @SerializedName("CustomDestPath")
    @Expose
    private String CustomDestPath;

    /**
    * <p>输出的COS桶，用于存放任务执行的相关结果（当前用于存放任务失败时的失败文件列表）</p>
    */
    @SerializedName("OutputBucket")
    @Expose
    private String OutputBucket;

    /**
    * <p>输出的COS桶的前缀，用于存放任务执行的相关结果（当前用于存放任务失败时的失败文件列表）</p>
    */
    @SerializedName("OutputPrefix")
    @Expose
    private String OutputPrefix;

    /**
    * <p>是否支持自定义数据源路径(暂时仅支持清单过滤使用)</p>
    */
    @SerializedName("EnableCustomSrcPath")
    @Expose
    private Boolean EnableCustomSrcPath;

    /**
    * <p>自定义数据源路径(暂时仅支持清单过滤使用)</p>
    */
    @SerializedName("CustomSrcPath")
    @Expose
    private String CustomSrcPath;

    /**
     * Get <p>数据流通任务类型, FS_TO_COS(文件系统到COS Bucket),或者COS_TO_FS(COS Bucket到文件系统)</p> 
     * @return TaskType <p>数据流通任务类型, FS_TO_COS(文件系统到COS Bucket),或者COS_TO_FS(COS Bucket到文件系统)</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>数据流通任务类型, FS_TO_COS(文件系统到COS Bucket),或者COS_TO_FS(COS Bucket到文件系统)</p>
     * @param TaskType <p>数据流通任务类型, FS_TO_COS(文件系统到COS Bucket),或者COS_TO_FS(COS Bucket到文件系统)</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>COS存储桶名</p> 
     * @return Bucket <p>COS存储桶名</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>COS存储桶名</p>
     * @param Bucket <p>COS存储桶名</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>文件系统ID</p> 
     * @return FileSystemId <p>文件系统ID</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统ID</p>
     * @param FileSystemId <p>文件系统ID</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>对于FS_TO_COS, TaskPath是Bucket映射目录的相对路径, 对于COS_TO_FS是COS上的路径。如果置为空, 则表示全部数据</p> 
     * @return TaskPath <p>对于FS_TO_COS, TaskPath是Bucket映射目录的相对路径, 对于COS_TO_FS是COS上的路径。如果置为空, 则表示全部数据</p>
     */
    public String getTaskPath() {
        return this.TaskPath;
    }

    /**
     * Set <p>对于FS_TO_COS, TaskPath是Bucket映射目录的相对路径, 对于COS_TO_FS是COS上的路径。如果置为空, 则表示全部数据</p>
     * @param TaskPath <p>对于FS_TO_COS, TaskPath是Bucket映射目录的相对路径, 对于COS_TO_FS是COS上的路径。如果置为空, 则表示全部数据</p>
     */
    public void setTaskPath(String TaskPath) {
        this.TaskPath = TaskPath;
    }

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务路径是否表示绝对路径（暂时仅支持沉降使用）</p> 
     * @return IsTaskPathAbsolute <p>任务路径是否表示绝对路径（暂时仅支持沉降使用）</p>
     */
    public Boolean getIsTaskPathAbsolute() {
        return this.IsTaskPathAbsolute;
    }

    /**
     * Set <p>任务路径是否表示绝对路径（暂时仅支持沉降使用）</p>
     * @param IsTaskPathAbsolute <p>任务路径是否表示绝对路径（暂时仅支持沉降使用）</p>
     */
    public void setIsTaskPathAbsolute(Boolean IsTaskPathAbsolute) {
        this.IsTaskPathAbsolute = IsTaskPathAbsolute;
    }

    /**
     * Get <p>数据流通方式 MSP_AFM 手动加载  RAW_AFM 按需加载</p> 
     * @return RepositoryType <p>数据流通方式 MSP_AFM 手动加载  RAW_AFM 按需加载</p>
     */
    public String getRepositoryType() {
        return this.RepositoryType;
    }

    /**
     * Set <p>数据流通方式 MSP_AFM 手动加载  RAW_AFM 按需加载</p>
     * @param RepositoryType <p>数据流通方式 MSP_AFM 手动加载  RAW_AFM 按需加载</p>
     */
    public void setRepositoryType(String RepositoryType) {
        this.RepositoryType = RepositoryType;
    }

    /**
     * Get <p>文件列表下载地址，以http开头</p> 
     * @return TextLocation <p>文件列表下载地址，以http开头</p>
     */
    public String getTextLocation() {
        return this.TextLocation;
    }

    /**
     * Set <p>文件列表下载地址，以http开头</p>
     * @param TextLocation <p>文件列表下载地址，以http开头</p>
     */
    public void setTextLocation(String TextLocation) {
        this.TextLocation = TextLocation;
    }

    /**
     * Get <p>是否开启自定义路径(暂时仅供预热使用)</p> 
     * @return EnableDataFlowSubPath <p>是否开启自定义路径(暂时仅供预热使用)</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getEnableDataFlowSubPath() {
        return this.EnableDataFlowSubPath;
    }

    /**
     * Set <p>是否开启自定义路径(暂时仅供预热使用)</p>
     * @param EnableDataFlowSubPath <p>是否开启自定义路径(暂时仅供预热使用)</p>
     * @deprecated
     */
    @Deprecated
    public void setEnableDataFlowSubPath(Boolean EnableDataFlowSubPath) {
        this.EnableDataFlowSubPath = EnableDataFlowSubPath;
    }

    /**
     * Get <p>自定义路径(暂时仅供预热使用)</p> 
     * @return DataFlowSubPath <p>自定义路径(暂时仅供预热使用)</p>
     * @deprecated
     */
    @Deprecated
    public String getDataFlowSubPath() {
        return this.DataFlowSubPath;
    }

    /**
     * Set <p>自定义路径(暂时仅供预热使用)</p>
     * @param DataFlowSubPath <p>自定义路径(暂时仅供预热使用)</p>
     * @deprecated
     */
    @Deprecated
    public void setDataFlowSubPath(String DataFlowSubPath) {
        this.DataFlowSubPath = DataFlowSubPath;
    }

    /**
     * Get <p>是否开启自定义目的路径（预热任务表示本地路径，沉降任务表示COS桶前缀）</p> 
     * @return EnableCustomDestPath <p>是否开启自定义目的路径（预热任务表示本地路径，沉降任务表示COS桶前缀）</p>
     */
    public Boolean getEnableCustomDestPath() {
        return this.EnableCustomDestPath;
    }

    /**
     * Set <p>是否开启自定义目的路径（预热任务表示本地路径，沉降任务表示COS桶前缀）</p>
     * @param EnableCustomDestPath <p>是否开启自定义目的路径（预热任务表示本地路径，沉降任务表示COS桶前缀）</p>
     */
    public void setEnableCustomDestPath(Boolean EnableCustomDestPath) {
        this.EnableCustomDestPath = EnableCustomDestPath;
    }

    /**
     * Get <p>自定义目的路径（预热任务表示本地路径，沉降任务表示COS桶前缀）</p> 
     * @return CustomDestPath <p>自定义目的路径（预热任务表示本地路径，沉降任务表示COS桶前缀）</p>
     */
    public String getCustomDestPath() {
        return this.CustomDestPath;
    }

    /**
     * Set <p>自定义目的路径（预热任务表示本地路径，沉降任务表示COS桶前缀）</p>
     * @param CustomDestPath <p>自定义目的路径（预热任务表示本地路径，沉降任务表示COS桶前缀）</p>
     */
    public void setCustomDestPath(String CustomDestPath) {
        this.CustomDestPath = CustomDestPath;
    }

    /**
     * Get <p>输出的COS桶，用于存放任务执行的相关结果（当前用于存放任务失败时的失败文件列表）</p> 
     * @return OutputBucket <p>输出的COS桶，用于存放任务执行的相关结果（当前用于存放任务失败时的失败文件列表）</p>
     */
    public String getOutputBucket() {
        return this.OutputBucket;
    }

    /**
     * Set <p>输出的COS桶，用于存放任务执行的相关结果（当前用于存放任务失败时的失败文件列表）</p>
     * @param OutputBucket <p>输出的COS桶，用于存放任务执行的相关结果（当前用于存放任务失败时的失败文件列表）</p>
     */
    public void setOutputBucket(String OutputBucket) {
        this.OutputBucket = OutputBucket;
    }

    /**
     * Get <p>输出的COS桶的前缀，用于存放任务执行的相关结果（当前用于存放任务失败时的失败文件列表）</p> 
     * @return OutputPrefix <p>输出的COS桶的前缀，用于存放任务执行的相关结果（当前用于存放任务失败时的失败文件列表）</p>
     */
    public String getOutputPrefix() {
        return this.OutputPrefix;
    }

    /**
     * Set <p>输出的COS桶的前缀，用于存放任务执行的相关结果（当前用于存放任务失败时的失败文件列表）</p>
     * @param OutputPrefix <p>输出的COS桶的前缀，用于存放任务执行的相关结果（当前用于存放任务失败时的失败文件列表）</p>
     */
    public void setOutputPrefix(String OutputPrefix) {
        this.OutputPrefix = OutputPrefix;
    }

    /**
     * Get <p>是否支持自定义数据源路径(暂时仅支持清单过滤使用)</p> 
     * @return EnableCustomSrcPath <p>是否支持自定义数据源路径(暂时仅支持清单过滤使用)</p>
     */
    public Boolean getEnableCustomSrcPath() {
        return this.EnableCustomSrcPath;
    }

    /**
     * Set <p>是否支持自定义数据源路径(暂时仅支持清单过滤使用)</p>
     * @param EnableCustomSrcPath <p>是否支持自定义数据源路径(暂时仅支持清单过滤使用)</p>
     */
    public void setEnableCustomSrcPath(Boolean EnableCustomSrcPath) {
        this.EnableCustomSrcPath = EnableCustomSrcPath;
    }

    /**
     * Get <p>自定义数据源路径(暂时仅支持清单过滤使用)</p> 
     * @return CustomSrcPath <p>自定义数据源路径(暂时仅支持清单过滤使用)</p>
     */
    public String getCustomSrcPath() {
        return this.CustomSrcPath;
    }

    /**
     * Set <p>自定义数据源路径(暂时仅支持清单过滤使用)</p>
     * @param CustomSrcPath <p>自定义数据源路径(暂时仅支持清单过滤使用)</p>
     */
    public void setCustomSrcPath(String CustomSrcPath) {
        this.CustomSrcPath = CustomSrcPath;
    }

    public CreateDataRepositoryTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataRepositoryTaskRequest(CreateDataRepositoryTaskRequest source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.TaskPath != null) {
            this.TaskPath = new String(source.TaskPath);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.IsTaskPathAbsolute != null) {
            this.IsTaskPathAbsolute = new Boolean(source.IsTaskPathAbsolute);
        }
        if (source.RepositoryType != null) {
            this.RepositoryType = new String(source.RepositoryType);
        }
        if (source.TextLocation != null) {
            this.TextLocation = new String(source.TextLocation);
        }
        if (source.EnableDataFlowSubPath != null) {
            this.EnableDataFlowSubPath = new Boolean(source.EnableDataFlowSubPath);
        }
        if (source.DataFlowSubPath != null) {
            this.DataFlowSubPath = new String(source.DataFlowSubPath);
        }
        if (source.EnableCustomDestPath != null) {
            this.EnableCustomDestPath = new Boolean(source.EnableCustomDestPath);
        }
        if (source.CustomDestPath != null) {
            this.CustomDestPath = new String(source.CustomDestPath);
        }
        if (source.OutputBucket != null) {
            this.OutputBucket = new String(source.OutputBucket);
        }
        if (source.OutputPrefix != null) {
            this.OutputPrefix = new String(source.OutputPrefix);
        }
        if (source.EnableCustomSrcPath != null) {
            this.EnableCustomSrcPath = new Boolean(source.EnableCustomSrcPath);
        }
        if (source.CustomSrcPath != null) {
            this.CustomSrcPath = new String(source.CustomSrcPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "TaskPath", this.TaskPath);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "IsTaskPathAbsolute", this.IsTaskPathAbsolute);
        this.setParamSimple(map, prefix + "RepositoryType", this.RepositoryType);
        this.setParamSimple(map, prefix + "TextLocation", this.TextLocation);
        this.setParamSimple(map, prefix + "EnableDataFlowSubPath", this.EnableDataFlowSubPath);
        this.setParamSimple(map, prefix + "DataFlowSubPath", this.DataFlowSubPath);
        this.setParamSimple(map, prefix + "EnableCustomDestPath", this.EnableCustomDestPath);
        this.setParamSimple(map, prefix + "CustomDestPath", this.CustomDestPath);
        this.setParamSimple(map, prefix + "OutputBucket", this.OutputBucket);
        this.setParamSimple(map, prefix + "OutputPrefix", this.OutputPrefix);
        this.setParamSimple(map, prefix + "EnableCustomSrcPath", this.EnableCustomSrcPath);
        this.setParamSimple(map, prefix + "CustomSrcPath", this.CustomSrcPath);

    }
}

