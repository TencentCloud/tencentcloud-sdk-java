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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeLifecycleHookRequest extends AbstractModel {

    /**
    * <p>生命周期挂钩ID。可以通过调用接口 <a href="https://cloud.tencent.com/document/api/377/34452">DescribeLifecycleHooks</a> ，取返回信息中的 LifecycleHookId 获取生命周期挂钩ID。</p>
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * <p>生命周期挂钩名称。名称仅支持中文、英文、数字、下划线（_）、短横线（-）、小数点（.），最大长度不能超128个字符。</p>
    */
    @SerializedName("LifecycleHookName")
    @Expose
    private String LifecycleHookName;

    /**
    * <p>进行生命周期挂钩的场景，取值范围如下:<em> INSTANCE_LAUNCHING: 扩容生命周期挂钩</em> INSTANCE_TERMINATING: 缩容生命周期挂钩</p>
    */
    @SerializedName("LifecycleTransition")
    @Expose
    private String LifecycleTransition;

    /**
    * <p>定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围是如下：<em> CONTINUE: 默认值，表示继续执行扩缩容活动</em> ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</p>
    */
    @SerializedName("DefaultResult")
    @Expose
    private String DefaultResult;

    /**
    * <p>生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到7200秒，默认值为300秒</p>
    */
    @SerializedName("HeartbeatTimeout")
    @Expose
    private Long HeartbeatTimeout;

    /**
    * <p>弹性伸缩向通知目标发送的附加信息，配置通知时使用，默认值为空字符串。NotificationMetadata 和 LifecycleCommand参数互斥，二者不可同时指定。</p>
    */
    @SerializedName("NotificationMetadata")
    @Expose
    private String NotificationMetadata;

    /**
    * <p>通知目标。NotificationTarget和LifecycleCommand参数互斥，二者不可同时指定。</p>
    */
    @SerializedName("NotificationTarget")
    @Expose
    private NotificationTarget NotificationTarget;

    /**
    * <p>进行生命周期挂钩的场景类型，取值范围包括NORMAL 和 EXTENSION。说明：设置为EXTENSION值，在AttachInstances、DetachInstances、RemoveInstaces接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。</p>
    */
    @SerializedName("LifecycleTransitionType")
    @Expose
    private String LifecycleTransitionType;

    /**
    * <p>远程命令执行对象。通知参数 NotificationMetadata、NotificationTarget 与 LifecycleCommand 互斥，不可同时指定。</p>
    */
    @SerializedName("LifecycleCommand")
    @Expose
    private LifecycleCommand LifecycleCommand;

    /**
     * Get <p>生命周期挂钩ID。可以通过调用接口 <a href="https://cloud.tencent.com/document/api/377/34452">DescribeLifecycleHooks</a> ，取返回信息中的 LifecycleHookId 获取生命周期挂钩ID。</p> 
     * @return LifecycleHookId <p>生命周期挂钩ID。可以通过调用接口 <a href="https://cloud.tencent.com/document/api/377/34452">DescribeLifecycleHooks</a> ，取返回信息中的 LifecycleHookId 获取生命周期挂钩ID。</p>
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * Set <p>生命周期挂钩ID。可以通过调用接口 <a href="https://cloud.tencent.com/document/api/377/34452">DescribeLifecycleHooks</a> ，取返回信息中的 LifecycleHookId 获取生命周期挂钩ID。</p>
     * @param LifecycleHookId <p>生命周期挂钩ID。可以通过调用接口 <a href="https://cloud.tencent.com/document/api/377/34452">DescribeLifecycleHooks</a> ，取返回信息中的 LifecycleHookId 获取生命周期挂钩ID。</p>
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * Get <p>生命周期挂钩名称。名称仅支持中文、英文、数字、下划线（_）、短横线（-）、小数点（.），最大长度不能超128个字符。</p> 
     * @return LifecycleHookName <p>生命周期挂钩名称。名称仅支持中文、英文、数字、下划线（_）、短横线（-）、小数点（.），最大长度不能超128个字符。</p>
     */
    public String getLifecycleHookName() {
        return this.LifecycleHookName;
    }

    /**
     * Set <p>生命周期挂钩名称。名称仅支持中文、英文、数字、下划线（_）、短横线（-）、小数点（.），最大长度不能超128个字符。</p>
     * @param LifecycleHookName <p>生命周期挂钩名称。名称仅支持中文、英文、数字、下划线（_）、短横线（-）、小数点（.），最大长度不能超128个字符。</p>
     */
    public void setLifecycleHookName(String LifecycleHookName) {
        this.LifecycleHookName = LifecycleHookName;
    }

    /**
     * Get <p>进行生命周期挂钩的场景，取值范围如下:<em> INSTANCE_LAUNCHING: 扩容生命周期挂钩</em> INSTANCE_TERMINATING: 缩容生命周期挂钩</p> 
     * @return LifecycleTransition <p>进行生命周期挂钩的场景，取值范围如下:<em> INSTANCE_LAUNCHING: 扩容生命周期挂钩</em> INSTANCE_TERMINATING: 缩容生命周期挂钩</p>
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * Set <p>进行生命周期挂钩的场景，取值范围如下:<em> INSTANCE_LAUNCHING: 扩容生命周期挂钩</em> INSTANCE_TERMINATING: 缩容生命周期挂钩</p>
     * @param LifecycleTransition <p>进行生命周期挂钩的场景，取值范围如下:<em> INSTANCE_LAUNCHING: 扩容生命周期挂钩</em> INSTANCE_TERMINATING: 缩容生命周期挂钩</p>
     */
    public void setLifecycleTransition(String LifecycleTransition) {
        this.LifecycleTransition = LifecycleTransition;
    }

    /**
     * Get <p>定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围是如下：<em> CONTINUE: 默认值，表示继续执行扩缩容活动</em> ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</p> 
     * @return DefaultResult <p>定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围是如下：<em> CONTINUE: 默认值，表示继续执行扩缩容活动</em> ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</p>
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * Set <p>定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围是如下：<em> CONTINUE: 默认值，表示继续执行扩缩容活动</em> ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</p>
     * @param DefaultResult <p>定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围是如下：<em> CONTINUE: 默认值，表示继续执行扩缩容活动</em> ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</p>
     */
    public void setDefaultResult(String DefaultResult) {
        this.DefaultResult = DefaultResult;
    }

    /**
     * Get <p>生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到7200秒，默认值为300秒</p> 
     * @return HeartbeatTimeout <p>生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到7200秒，默认值为300秒</p>
     */
    public Long getHeartbeatTimeout() {
        return this.HeartbeatTimeout;
    }

    /**
     * Set <p>生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到7200秒，默认值为300秒</p>
     * @param HeartbeatTimeout <p>生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到7200秒，默认值为300秒</p>
     */
    public void setHeartbeatTimeout(Long HeartbeatTimeout) {
        this.HeartbeatTimeout = HeartbeatTimeout;
    }

    /**
     * Get <p>弹性伸缩向通知目标发送的附加信息，配置通知时使用，默认值为空字符串。NotificationMetadata 和 LifecycleCommand参数互斥，二者不可同时指定。</p> 
     * @return NotificationMetadata <p>弹性伸缩向通知目标发送的附加信息，配置通知时使用，默认值为空字符串。NotificationMetadata 和 LifecycleCommand参数互斥，二者不可同时指定。</p>
     */
    public String getNotificationMetadata() {
        return this.NotificationMetadata;
    }

    /**
     * Set <p>弹性伸缩向通知目标发送的附加信息，配置通知时使用，默认值为空字符串。NotificationMetadata 和 LifecycleCommand参数互斥，二者不可同时指定。</p>
     * @param NotificationMetadata <p>弹性伸缩向通知目标发送的附加信息，配置通知时使用，默认值为空字符串。NotificationMetadata 和 LifecycleCommand参数互斥，二者不可同时指定。</p>
     */
    public void setNotificationMetadata(String NotificationMetadata) {
        this.NotificationMetadata = NotificationMetadata;
    }

    /**
     * Get <p>通知目标。NotificationTarget和LifecycleCommand参数互斥，二者不可同时指定。</p> 
     * @return NotificationTarget <p>通知目标。NotificationTarget和LifecycleCommand参数互斥，二者不可同时指定。</p>
     */
    public NotificationTarget getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * Set <p>通知目标。NotificationTarget和LifecycleCommand参数互斥，二者不可同时指定。</p>
     * @param NotificationTarget <p>通知目标。NotificationTarget和LifecycleCommand参数互斥，二者不可同时指定。</p>
     */
    public void setNotificationTarget(NotificationTarget NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
    }

    /**
     * Get <p>进行生命周期挂钩的场景类型，取值范围包括NORMAL 和 EXTENSION。说明：设置为EXTENSION值，在AttachInstances、DetachInstances、RemoveInstaces接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。</p> 
     * @return LifecycleTransitionType <p>进行生命周期挂钩的场景类型，取值范围包括NORMAL 和 EXTENSION。说明：设置为EXTENSION值，在AttachInstances、DetachInstances、RemoveInstaces接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。</p>
     */
    public String getLifecycleTransitionType() {
        return this.LifecycleTransitionType;
    }

    /**
     * Set <p>进行生命周期挂钩的场景类型，取值范围包括NORMAL 和 EXTENSION。说明：设置为EXTENSION值，在AttachInstances、DetachInstances、RemoveInstaces接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。</p>
     * @param LifecycleTransitionType <p>进行生命周期挂钩的场景类型，取值范围包括NORMAL 和 EXTENSION。说明：设置为EXTENSION值，在AttachInstances、DetachInstances、RemoveInstaces接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。</p>
     */
    public void setLifecycleTransitionType(String LifecycleTransitionType) {
        this.LifecycleTransitionType = LifecycleTransitionType;
    }

    /**
     * Get <p>远程命令执行对象。通知参数 NotificationMetadata、NotificationTarget 与 LifecycleCommand 互斥，不可同时指定。</p> 
     * @return LifecycleCommand <p>远程命令执行对象。通知参数 NotificationMetadata、NotificationTarget 与 LifecycleCommand 互斥，不可同时指定。</p>
     */
    public LifecycleCommand getLifecycleCommand() {
        return this.LifecycleCommand;
    }

    /**
     * Set <p>远程命令执行对象。通知参数 NotificationMetadata、NotificationTarget 与 LifecycleCommand 互斥，不可同时指定。</p>
     * @param LifecycleCommand <p>远程命令执行对象。通知参数 NotificationMetadata、NotificationTarget 与 LifecycleCommand 互斥，不可同时指定。</p>
     */
    public void setLifecycleCommand(LifecycleCommand LifecycleCommand) {
        this.LifecycleCommand = LifecycleCommand;
    }

    public UpgradeLifecycleHookRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeLifecycleHookRequest(UpgradeLifecycleHookRequest source) {
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
        if (source.NotificationTarget != null) {
            this.NotificationTarget = new NotificationTarget(source.NotificationTarget);
        }
        if (source.LifecycleTransitionType != null) {
            this.LifecycleTransitionType = new String(source.LifecycleTransitionType);
        }
        if (source.LifecycleCommand != null) {
            this.LifecycleCommand = new LifecycleCommand(source.LifecycleCommand);
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
        this.setParamObj(map, prefix + "NotificationTarget.", this.NotificationTarget);
        this.setParamSimple(map, prefix + "LifecycleTransitionType", this.LifecycleTransitionType);
        this.setParamObj(map, prefix + "LifecycleCommand.", this.LifecycleCommand);

    }
}

