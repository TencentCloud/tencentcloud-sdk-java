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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTask extends AbstractModel {

    /**
    * 唯一id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Job类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Job状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 进度百分比0~100
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 错误代码
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 错误信息描述
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 唯一id 
     * @return Id 唯一id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 唯一id
     * @param Id 唯一id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Job类型 
     * @return Type Job类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Job类型
     * @param Type Job类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Job状态 
     * @return Status Job状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Job状态
     * @param Status Job状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 进度百分比0~100 
     * @return Progress 进度百分比0~100
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 进度百分比0~100
     * @param Progress 进度百分比0~100
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 错误代码 
     * @return ErrorCode 错误代码
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 错误代码
     * @param ErrorCode 错误代码
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 错误信息描述 
     * @return Message 错误信息描述
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误信息描述
     * @param Message 错误信息描述
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public InstanceTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTask(InstanceTask source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

