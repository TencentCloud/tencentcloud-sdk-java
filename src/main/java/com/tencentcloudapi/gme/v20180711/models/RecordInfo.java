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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordInfo extends AbstractModel{

    /**
    * 用户ID（当混流模式时，取值为0）。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 录制文件名。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 录制开始时间（unix时间戳如：1234567868）。
    */
    @SerializedName("RecordBeginTime")
    @Expose
    private Long RecordBeginTime;

    /**
    * 录制状态：2代表正在录制  10代表等待转码  11代表正在转码  12正在上传  13代表上传完成  14代表通知用户完成。
    */
    @SerializedName("RecordStatus")
    @Expose
    private Long RecordStatus;

    /**
     * Get 用户ID（当混流模式时，取值为0）。 
     * @return UserId 用户ID（当混流模式时，取值为0）。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID（当混流模式时，取值为0）。
     * @param UserId 用户ID（当混流模式时，取值为0）。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 录制文件名。 
     * @return FileName 录制文件名。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 录制文件名。
     * @param FileName 录制文件名。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 录制开始时间（unix时间戳如：1234567868）。 
     * @return RecordBeginTime 录制开始时间（unix时间戳如：1234567868）。
     */
    public Long getRecordBeginTime() {
        return this.RecordBeginTime;
    }

    /**
     * Set 录制开始时间（unix时间戳如：1234567868）。
     * @param RecordBeginTime 录制开始时间（unix时间戳如：1234567868）。
     */
    public void setRecordBeginTime(Long RecordBeginTime) {
        this.RecordBeginTime = RecordBeginTime;
    }

    /**
     * Get 录制状态：2代表正在录制  10代表等待转码  11代表正在转码  12正在上传  13代表上传完成  14代表通知用户完成。 
     * @return RecordStatus 录制状态：2代表正在录制  10代表等待转码  11代表正在转码  12正在上传  13代表上传完成  14代表通知用户完成。
     */
    public Long getRecordStatus() {
        return this.RecordStatus;
    }

    /**
     * Set 录制状态：2代表正在录制  10代表等待转码  11代表正在转码  12正在上传  13代表上传完成  14代表通知用户完成。
     * @param RecordStatus 录制状态：2代表正在录制  10代表等待转码  11代表正在转码  12正在上传  13代表上传完成  14代表通知用户完成。
     */
    public void setRecordStatus(Long RecordStatus) {
        this.RecordStatus = RecordStatus;
    }

    public RecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordInfo(RecordInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.RecordBeginTime != null) {
            this.RecordBeginTime = new Long(source.RecordBeginTime);
        }
        if (source.RecordStatus != null) {
            this.RecordStatus = new Long(source.RecordStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "RecordBeginTime", this.RecordBeginTime);
        this.setParamSimple(map, prefix + "RecordStatus", this.RecordStatus);

    }
}

