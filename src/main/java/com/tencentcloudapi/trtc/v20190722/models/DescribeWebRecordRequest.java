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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWebRecordRequest extends AbstractModel {

    /**
    * 开始页面录制时返回的任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 发起页面录制时传递的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 发起录制时传递的RecordId, 传入此值时需要传递SdkAppId
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
     * Get 开始页面录制时返回的任务id 
     * @return TaskId 开始页面录制时返回的任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 开始页面录制时返回的任务id
     * @param TaskId 开始页面录制时返回的任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 发起页面录制时传递的SdkAppId 
     * @return SdkAppId 发起页面录制时传递的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 发起页面录制时传递的SdkAppId
     * @param SdkAppId 发起页面录制时传递的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 发起录制时传递的RecordId, 传入此值时需要传递SdkAppId 
     * @return RecordId 发起录制时传递的RecordId, 传入此值时需要传递SdkAppId
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 发起录制时传递的RecordId, 传入此值时需要传递SdkAppId
     * @param RecordId 发起录制时传递的RecordId, 传入此值时需要传递SdkAppId
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    public DescribeWebRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebRecordRequest(DescribeWebRecordRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);

    }
}

