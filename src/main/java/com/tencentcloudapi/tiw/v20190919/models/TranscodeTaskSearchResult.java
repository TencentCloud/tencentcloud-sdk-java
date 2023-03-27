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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranscodeTaskSearchResult extends AbstractModel{

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务唯一ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 转码文件原始名称
    */
    @SerializedName("OriginalFilename")
    @Expose
    private String OriginalFilename;

    /**
    * 用户应用SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 转码任务结果
    */
    @SerializedName("Result")
    @Expose
    private TranscodeTaskResult Result;

    /**
    * 是否静态转码
    */
    @SerializedName("IsStatic")
    @Expose
    private Boolean IsStatic;

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务唯一ID 
     * @return TaskId 任务唯一ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务唯一ID
     * @param TaskId 任务唯一ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成 
     * @return Status 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成
     * @param Status 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 转码文件原始名称 
     * @return OriginalFilename 转码文件原始名称
     */
    public String getOriginalFilename() {
        return this.OriginalFilename;
    }

    /**
     * Set 转码文件原始名称
     * @param OriginalFilename 转码文件原始名称
     */
    public void setOriginalFilename(String OriginalFilename) {
        this.OriginalFilename = OriginalFilename;
    }

    /**
     * Get 用户应用SdkAppId 
     * @return SdkAppId 用户应用SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 用户应用SdkAppId
     * @param SdkAppId 用户应用SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 转码任务结果 
     * @return Result 转码任务结果
     */
    public TranscodeTaskResult getResult() {
        return this.Result;
    }

    /**
     * Set 转码任务结果
     * @param Result 转码任务结果
     */
    public void setResult(TranscodeTaskResult Result) {
        this.Result = Result;
    }

    /**
     * Get 是否静态转码 
     * @return IsStatic 是否静态转码
     */
    public Boolean getIsStatic() {
        return this.IsStatic;
    }

    /**
     * Set 是否静态转码
     * @param IsStatic 是否静态转码
     */
    public void setIsStatic(Boolean IsStatic) {
        this.IsStatic = IsStatic;
    }

    public TranscodeTaskSearchResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeTaskSearchResult(TranscodeTaskSearchResult source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OriginalFilename != null) {
            this.OriginalFilename = new String(source.OriginalFilename);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Result != null) {
            this.Result = new TranscodeTaskResult(source.Result);
        }
        if (source.IsStatic != null) {
            this.IsStatic = new Boolean(source.IsStatic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OriginalFilename", this.OriginalFilename);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "IsStatic", this.IsStatic);

    }
}

