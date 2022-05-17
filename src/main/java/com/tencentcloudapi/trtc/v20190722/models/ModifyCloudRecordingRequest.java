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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCloudRecordingRequest extends AbstractModel{

    /**
    * TRTC的SDKAppId，和录制的房间所对应的SDKAppId相同。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 录制任务的唯一Id，在启动录制成功后会返回。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 需要更新的混流的布局参数。
    */
    @SerializedName("MixLayoutParams")
    @Expose
    private MixLayoutParams MixLayoutParams;

    /**
    * 指定订阅流白名单或者黑名单。
    */
    @SerializedName("SubscribeStreamUserIds")
    @Expose
    private SubscribeStreamUserIds SubscribeStreamUserIds;

    /**
     * Get TRTC的SDKAppId，和录制的房间所对应的SDKAppId相同。 
     * @return SdkAppId TRTC的SDKAppId，和录制的房间所对应的SDKAppId相同。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的SDKAppId，和录制的房间所对应的SDKAppId相同。
     * @param SdkAppId TRTC的SDKAppId，和录制的房间所对应的SDKAppId相同。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 录制任务的唯一Id，在启动录制成功后会返回。 
     * @return TaskId 录制任务的唯一Id，在启动录制成功后会返回。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 录制任务的唯一Id，在启动录制成功后会返回。
     * @param TaskId 录制任务的唯一Id，在启动录制成功后会返回。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 需要更新的混流的布局参数。 
     * @return MixLayoutParams 需要更新的混流的布局参数。
     */
    public MixLayoutParams getMixLayoutParams() {
        return this.MixLayoutParams;
    }

    /**
     * Set 需要更新的混流的布局参数。
     * @param MixLayoutParams 需要更新的混流的布局参数。
     */
    public void setMixLayoutParams(MixLayoutParams MixLayoutParams) {
        this.MixLayoutParams = MixLayoutParams;
    }

    /**
     * Get 指定订阅流白名单或者黑名单。 
     * @return SubscribeStreamUserIds 指定订阅流白名单或者黑名单。
     */
    public SubscribeStreamUserIds getSubscribeStreamUserIds() {
        return this.SubscribeStreamUserIds;
    }

    /**
     * Set 指定订阅流白名单或者黑名单。
     * @param SubscribeStreamUserIds 指定订阅流白名单或者黑名单。
     */
    public void setSubscribeStreamUserIds(SubscribeStreamUserIds SubscribeStreamUserIds) {
        this.SubscribeStreamUserIds = SubscribeStreamUserIds;
    }

    public ModifyCloudRecordingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudRecordingRequest(ModifyCloudRecordingRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.MixLayoutParams != null) {
            this.MixLayoutParams = new MixLayoutParams(source.MixLayoutParams);
        }
        if (source.SubscribeStreamUserIds != null) {
            this.SubscribeStreamUserIds = new SubscribeStreamUserIds(source.SubscribeStreamUserIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "MixLayoutParams.", this.MixLayoutParams);
        this.setParamObj(map, prefix + "SubscribeStreamUserIds.", this.SubscribeStreamUserIds);

    }
}

