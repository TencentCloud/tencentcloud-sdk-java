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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeLifecycleHookRequest  extends AbstractModel{

    /**
    * 生命周期挂钩ID
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * 生命周期挂钩名称
    */
    @SerializedName("LifecycleHookName")
    @Expose
    private String LifecycleHookName;

    /**
    * 进行生命周期挂钩的场景，取值范围包括“INSTANCE_LAUNCHING”和“INSTANCE_TERMINATING”
    */
    @SerializedName("LifecycleTransition")
    @Expose
    private String LifecycleTransition;

    /**
    * 定义伸缩组在生命周期挂钩超时的情况下应采取的操作，取值范围是“CONTINUE”或“ABANDON”，默认值为“CONTINUE”
    */
    @SerializedName("DefaultResult")
    @Expose
    private String DefaultResult;

    /**
    * 生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到3600秒，默认值为300秒
    */
    @SerializedName("HeartbeatTimeout")
    @Expose
    private Integer HeartbeatTimeout;

    /**
    * 弹性伸缩向通知目标发送的附加信息，默认值为''
    */
    @SerializedName("NotificationMetadata")
    @Expose
    private String NotificationMetadata;

    /**
    * 通知目标
    */
    @SerializedName("NotificationTarget")
    @Expose
    private NotificationTarget NotificationTarget;

    /**
     * 获取生命周期挂钩ID
     * @return LifecycleHookId 生命周期挂钩ID
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * 设置生命周期挂钩ID
     * @param LifecycleHookId 生命周期挂钩ID
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * 获取生命周期挂钩名称
     * @return LifecycleHookName 生命周期挂钩名称
     */
    public String getLifecycleHookName() {
        return this.LifecycleHookName;
    }

    /**
     * 设置生命周期挂钩名称
     * @param LifecycleHookName 生命周期挂钩名称
     */
    public void setLifecycleHookName(String LifecycleHookName) {
        this.LifecycleHookName = LifecycleHookName;
    }

    /**
     * 获取进行生命周期挂钩的场景，取值范围包括“INSTANCE_LAUNCHING”和“INSTANCE_TERMINATING”
     * @return LifecycleTransition 进行生命周期挂钩的场景，取值范围包括“INSTANCE_LAUNCHING”和“INSTANCE_TERMINATING”
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * 设置进行生命周期挂钩的场景，取值范围包括“INSTANCE_LAUNCHING”和“INSTANCE_TERMINATING”
     * @param LifecycleTransition 进行生命周期挂钩的场景，取值范围包括“INSTANCE_LAUNCHING”和“INSTANCE_TERMINATING”
     */
    public void setLifecycleTransition(String LifecycleTransition) {
        this.LifecycleTransition = LifecycleTransition;
    }

    /**
     * 获取定义伸缩组在生命周期挂钩超时的情况下应采取的操作，取值范围是“CONTINUE”或“ABANDON”，默认值为“CONTINUE”
     * @return DefaultResult 定义伸缩组在生命周期挂钩超时的情况下应采取的操作，取值范围是“CONTINUE”或“ABANDON”，默认值为“CONTINUE”
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * 设置定义伸缩组在生命周期挂钩超时的情况下应采取的操作，取值范围是“CONTINUE”或“ABANDON”，默认值为“CONTINUE”
     * @param DefaultResult 定义伸缩组在生命周期挂钩超时的情况下应采取的操作，取值范围是“CONTINUE”或“ABANDON”，默认值为“CONTINUE”
     */
    public void setDefaultResult(String DefaultResult) {
        this.DefaultResult = DefaultResult;
    }

    /**
     * 获取生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到3600秒，默认值为300秒
     * @return HeartbeatTimeout 生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到3600秒，默认值为300秒
     */
    public Integer getHeartbeatTimeout() {
        return this.HeartbeatTimeout;
    }

    /**
     * 设置生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到3600秒，默认值为300秒
     * @param HeartbeatTimeout 生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到3600秒，默认值为300秒
     */
    public void setHeartbeatTimeout(Integer HeartbeatTimeout) {
        this.HeartbeatTimeout = HeartbeatTimeout;
    }

    /**
     * 获取弹性伸缩向通知目标发送的附加信息，默认值为''
     * @return NotificationMetadata 弹性伸缩向通知目标发送的附加信息，默认值为''
     */
    public String getNotificationMetadata() {
        return this.NotificationMetadata;
    }

    /**
     * 设置弹性伸缩向通知目标发送的附加信息，默认值为''
     * @param NotificationMetadata 弹性伸缩向通知目标发送的附加信息，默认值为''
     */
    public void setNotificationMetadata(String NotificationMetadata) {
        this.NotificationMetadata = NotificationMetadata;
    }

    /**
     * 获取通知目标
     * @return NotificationTarget 通知目标
     */
    public NotificationTarget getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * 设置通知目标
     * @param NotificationTarget 通知目标
     */
    public void setNotificationTarget(NotificationTarget NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleHookId", this.LifecycleHookId);
        this.setParamSimple(map, prefix + "LifecycleHookName", this.LifecycleHookName);
        this.setParamSimple(map, prefix + "LifecycleTransition", this.LifecycleTransition);
        this.setParamSimple(map, prefix + "DefaultResult", this.DefaultResult);
        this.setParamSimple(map, prefix + "HeartbeatTimeout", this.HeartbeatTimeout);
        this.setParamSimple(map, prefix + "NotificationMetadata", this.NotificationMetadata);
        this.setParamObj(map, prefix + "NotificationTarget.", this.NotificationTarget);

    }
}

