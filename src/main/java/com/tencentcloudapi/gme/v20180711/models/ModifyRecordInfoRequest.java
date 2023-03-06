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

public class ModifyRecordInfoRequest extends AbstractModel{

    /**
    * 进行中的任务taskid（StartRecord接口返回）。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 录制类型：1代表单流 2代表混流 3代表单流和混流。
    */
    @SerializedName("RecordMode")
    @Expose
    private Long RecordMode;

    /**
    * 应用ID。
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 指定订阅流白名单或者黑名单。
    */
    @SerializedName("SubscribeRecordUserIds")
    @Expose
    private SubscribeRecordUserIds SubscribeRecordUserIds;

    /**
     * Get 进行中的任务taskid（StartRecord接口返回）。 
     * @return TaskId 进行中的任务taskid（StartRecord接口返回）。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 进行中的任务taskid（StartRecord接口返回）。
     * @param TaskId 进行中的任务taskid（StartRecord接口返回）。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 录制类型：1代表单流 2代表混流 3代表单流和混流。 
     * @return RecordMode 录制类型：1代表单流 2代表混流 3代表单流和混流。
     */
    public Long getRecordMode() {
        return this.RecordMode;
    }

    /**
     * Set 录制类型：1代表单流 2代表混流 3代表单流和混流。
     * @param RecordMode 录制类型：1代表单流 2代表混流 3代表单流和混流。
     */
    public void setRecordMode(Long RecordMode) {
        this.RecordMode = RecordMode;
    }

    /**
     * Get 应用ID。 
     * @return BizId 应用ID。
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用ID。
     * @param BizId 应用ID。
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 指定订阅流白名单或者黑名单。 
     * @return SubscribeRecordUserIds 指定订阅流白名单或者黑名单。
     */
    public SubscribeRecordUserIds getSubscribeRecordUserIds() {
        return this.SubscribeRecordUserIds;
    }

    /**
     * Set 指定订阅流白名单或者黑名单。
     * @param SubscribeRecordUserIds 指定订阅流白名单或者黑名单。
     */
    public void setSubscribeRecordUserIds(SubscribeRecordUserIds SubscribeRecordUserIds) {
        this.SubscribeRecordUserIds = SubscribeRecordUserIds;
    }

    public ModifyRecordInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordInfoRequest(ModifyRecordInfoRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.RecordMode != null) {
            this.RecordMode = new Long(source.RecordMode);
        }
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.SubscribeRecordUserIds != null) {
            this.SubscribeRecordUserIds = new SubscribeRecordUserIds(source.SubscribeRecordUserIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RecordMode", this.RecordMode);
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamObj(map, prefix + "SubscribeRecordUserIds.", this.SubscribeRecordUserIds);

    }
}

