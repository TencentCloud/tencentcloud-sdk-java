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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCloudModerationRequest extends AbstractModel {

    /**
    * <p>TRTC的SDKAppId，和TRTC的房间所对应的SDKAppId相同。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>AI 内容理解任务的唯一Id，在启动切片任务成功后会返回。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>指定订阅流白名单或者黑名单。</p>
    */
    @SerializedName("SubscribeStreamUserIds")
    @Expose
    private SubscribeStreamUserIds SubscribeStreamUserIds;

    /**
     * Get <p>TRTC的SDKAppId，和TRTC的房间所对应的SDKAppId相同。</p> 
     * @return SdkAppId <p>TRTC的SDKAppId，和TRTC的房间所对应的SDKAppId相同。</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>TRTC的SDKAppId，和TRTC的房间所对应的SDKAppId相同。</p>
     * @param SdkAppId <p>TRTC的SDKAppId，和TRTC的房间所对应的SDKAppId相同。</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>AI 内容理解任务的唯一Id，在启动切片任务成功后会返回。</p> 
     * @return TaskId <p>AI 内容理解任务的唯一Id，在启动切片任务成功后会返回。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>AI 内容理解任务的唯一Id，在启动切片任务成功后会返回。</p>
     * @param TaskId <p>AI 内容理解任务的唯一Id，在启动切片任务成功后会返回。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>指定订阅流白名单或者黑名单。</p> 
     * @return SubscribeStreamUserIds <p>指定订阅流白名单或者黑名单。</p>
     */
    public SubscribeStreamUserIds getSubscribeStreamUserIds() {
        return this.SubscribeStreamUserIds;
    }

    /**
     * Set <p>指定订阅流白名单或者黑名单。</p>
     * @param SubscribeStreamUserIds <p>指定订阅流白名单或者黑名单。</p>
     */
    public void setSubscribeStreamUserIds(SubscribeStreamUserIds SubscribeStreamUserIds) {
        this.SubscribeStreamUserIds = SubscribeStreamUserIds;
    }

    public ModifyCloudModerationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudModerationRequest(ModifyCloudModerationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        this.setParamObj(map, prefix + "SubscribeStreamUserIds.", this.SubscribeStreamUserIds);

    }
}

