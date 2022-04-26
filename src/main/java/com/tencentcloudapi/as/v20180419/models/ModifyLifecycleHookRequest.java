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

public class ModifyLifecycleHookRequest extends AbstractModel{

    /**
    * 生命周期挂钩ID。
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * 生命周期挂钩名称。
    */
    @SerializedName("LifecycleHookName")
    @Expose
    private String LifecycleHookName;

    /**
    * 进入生命周期挂钩场景，取值包括：
<li> INSTANCE_LAUNCHING：实例启动后
<li> INSTANCE_TERMINATING：实例销毁前
    */
    @SerializedName("LifecycleTransition")
    @Expose
    private String LifecycleTransition;

    /**
    * 定义伸缩组在生命周期挂钩超时的情况下应采取的操作，取值包括：
<li> CONTINUE： 超时后继续伸缩活动
<li> ABANDON：超时后终止伸缩活动
    */
    @SerializedName("DefaultResult")
    @Expose
    private String DefaultResult;

    /**
    * 生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从 30 到 7200 秒。
    */
    @SerializedName("HeartbeatTimeout")
    @Expose
    private Long HeartbeatTimeout;

    /**
    * 弹性伸缩向通知目标发送的附加信息。
    */
    @SerializedName("NotificationMetadata")
    @Expose
    private String NotificationMetadata;

    /**
    * 进行生命周期挂钩的场景类型，取值范围包括`NORMAL`和 `EXTENSION`。说明：设置为`EXTENSION`值，在AttachInstances、DetachInstances、RemoveInstances 接口时会触发生命周期挂钩操作，值为`NORMAL`则不会在这些接口中触发生命周期挂钩。
    */
    @SerializedName("LifecycleTransitionType")
    @Expose
    private String LifecycleTransitionType;

    /**
    * 通知目标信息。
    */
    @SerializedName("NotificationTarget")
    @Expose
    private NotificationTarget NotificationTarget;

    /**
     * Get 生命周期挂钩ID。 
     * @return LifecycleHookId 生命周期挂钩ID。
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * Set 生命周期挂钩ID。
     * @param LifecycleHookId 生命周期挂钩ID。
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * Get 生命周期挂钩名称。 
     * @return LifecycleHookName 生命周期挂钩名称。
     */
    public String getLifecycleHookName() {
        return this.LifecycleHookName;
    }

    /**
     * Set 生命周期挂钩名称。
     * @param LifecycleHookName 生命周期挂钩名称。
     */
    public void setLifecycleHookName(String LifecycleHookName) {
        this.LifecycleHookName = LifecycleHookName;
    }

    /**
     * Get 进入生命周期挂钩场景，取值包括：
<li> INSTANCE_LAUNCHING：实例启动后
<li> INSTANCE_TERMINATING：实例销毁前 
     * @return LifecycleTransition 进入生命周期挂钩场景，取值包括：
<li> INSTANCE_LAUNCHING：实例启动后
<li> INSTANCE_TERMINATING：实例销毁前
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * Set 进入生命周期挂钩场景，取值包括：
<li> INSTANCE_LAUNCHING：实例启动后
<li> INSTANCE_TERMINATING：实例销毁前
     * @param LifecycleTransition 进入生命周期挂钩场景，取值包括：
<li> INSTANCE_LAUNCHING：实例启动后
<li> INSTANCE_TERMINATING：实例销毁前
     */
    public void setLifecycleTransition(String LifecycleTransition) {
        this.LifecycleTransition = LifecycleTransition;
    }

    /**
     * Get 定义伸缩组在生命周期挂钩超时的情况下应采取的操作，取值包括：
<li> CONTINUE： 超时后继续伸缩活动
<li> ABANDON：超时后终止伸缩活动 
     * @return DefaultResult 定义伸缩组在生命周期挂钩超时的情况下应采取的操作，取值包括：
<li> CONTINUE： 超时后继续伸缩活动
<li> ABANDON：超时后终止伸缩活动
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * Set 定义伸缩组在生命周期挂钩超时的情况下应采取的操作，取值包括：
<li> CONTINUE： 超时后继续伸缩活动
<li> ABANDON：超时后终止伸缩活动
     * @param DefaultResult 定义伸缩组在生命周期挂钩超时的情况下应采取的操作，取值包括：
<li> CONTINUE： 超时后继续伸缩活动
<li> ABANDON：超时后终止伸缩活动
     */
    public void setDefaultResult(String DefaultResult) {
        this.DefaultResult = DefaultResult;
    }

    /**
     * Get 生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从 30 到 7200 秒。 
     * @return HeartbeatTimeout 生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从 30 到 7200 秒。
     */
    public Long getHeartbeatTimeout() {
        return this.HeartbeatTimeout;
    }

    /**
     * Set 生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从 30 到 7200 秒。
     * @param HeartbeatTimeout 生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从 30 到 7200 秒。
     */
    public void setHeartbeatTimeout(Long HeartbeatTimeout) {
        this.HeartbeatTimeout = HeartbeatTimeout;
    }

    /**
     * Get 弹性伸缩向通知目标发送的附加信息。 
     * @return NotificationMetadata 弹性伸缩向通知目标发送的附加信息。
     */
    public String getNotificationMetadata() {
        return this.NotificationMetadata;
    }

    /**
     * Set 弹性伸缩向通知目标发送的附加信息。
     * @param NotificationMetadata 弹性伸缩向通知目标发送的附加信息。
     */
    public void setNotificationMetadata(String NotificationMetadata) {
        this.NotificationMetadata = NotificationMetadata;
    }

    /**
     * Get 进行生命周期挂钩的场景类型，取值范围包括`NORMAL`和 `EXTENSION`。说明：设置为`EXTENSION`值，在AttachInstances、DetachInstances、RemoveInstances 接口时会触发生命周期挂钩操作，值为`NORMAL`则不会在这些接口中触发生命周期挂钩。 
     * @return LifecycleTransitionType 进行生命周期挂钩的场景类型，取值范围包括`NORMAL`和 `EXTENSION`。说明：设置为`EXTENSION`值，在AttachInstances、DetachInstances、RemoveInstances 接口时会触发生命周期挂钩操作，值为`NORMAL`则不会在这些接口中触发生命周期挂钩。
     */
    public String getLifecycleTransitionType() {
        return this.LifecycleTransitionType;
    }

    /**
     * Set 进行生命周期挂钩的场景类型，取值范围包括`NORMAL`和 `EXTENSION`。说明：设置为`EXTENSION`值，在AttachInstances、DetachInstances、RemoveInstances 接口时会触发生命周期挂钩操作，值为`NORMAL`则不会在这些接口中触发生命周期挂钩。
     * @param LifecycleTransitionType 进行生命周期挂钩的场景类型，取值范围包括`NORMAL`和 `EXTENSION`。说明：设置为`EXTENSION`值，在AttachInstances、DetachInstances、RemoveInstances 接口时会触发生命周期挂钩操作，值为`NORMAL`则不会在这些接口中触发生命周期挂钩。
     */
    public void setLifecycleTransitionType(String LifecycleTransitionType) {
        this.LifecycleTransitionType = LifecycleTransitionType;
    }

    /**
     * Get 通知目标信息。 
     * @return NotificationTarget 通知目标信息。
     */
    public NotificationTarget getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * Set 通知目标信息。
     * @param NotificationTarget 通知目标信息。
     */
    public void setNotificationTarget(NotificationTarget NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
    }

    public ModifyLifecycleHookRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLifecycleHookRequest(ModifyLifecycleHookRequest source) {
        if (source.LifecycleHookId != null) {
            this.LifecycleHookId = new String(source.LifecycleHookId);
        }
        if (source.LifecycleHookName != null) {
            this.LifecycleHookName = new String(source.LifecycleHookName);
        }
        if (source.LifecycleTransition != null) {
            this.LifecycleTransition = new String(source.LifecycleTransition);
        }
        if (source.DefaultResult != null) {
            this.DefaultResult = new String(source.DefaultResult);
        }
        if (source.HeartbeatTimeout != null) {
            this.HeartbeatTimeout = new Long(source.HeartbeatTimeout);
        }
        if (source.NotificationMetadata != null) {
            this.NotificationMetadata = new String(source.NotificationMetadata);
        }
        if (source.LifecycleTransitionType != null) {
            this.LifecycleTransitionType = new String(source.LifecycleTransitionType);
        }
        if (source.NotificationTarget != null) {
            this.NotificationTarget = new NotificationTarget(source.NotificationTarget);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleHookId", this.LifecycleHookId);
        this.setParamSimple(map, prefix + "LifecycleHookName", this.LifecycleHookName);
        this.setParamSimple(map, prefix + "LifecycleTransition", this.LifecycleTransition);
        this.setParamSimple(map, prefix + "DefaultResult", this.DefaultResult);
        this.setParamSimple(map, prefix + "HeartbeatTimeout", this.HeartbeatTimeout);
        this.setParamSimple(map, prefix + "NotificationMetadata", this.NotificationMetadata);
        this.setParamSimple(map, prefix + "LifecycleTransitionType", this.LifecycleTransitionType);
        this.setParamObj(map, prefix + "NotificationTarget.", this.NotificationTarget);

    }
}

