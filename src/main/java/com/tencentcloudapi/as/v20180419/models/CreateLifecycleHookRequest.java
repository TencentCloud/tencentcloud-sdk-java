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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLifecycleHookRequest extends AbstractModel {

    /**
    * 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 生命周期挂钩名称。名称仅支持中文、英文、数字、下划线（_）、短横线（-）、小数点（.），最大长度不能超128个字节。
    */
    @SerializedName("LifecycleHookName")
    @Expose
    private String LifecycleHookName;

    /**
    * 进行生命周期挂钩的场景，取值范围如下:
<li> INSTANCE_LAUNCHING: 扩容生命周期挂钩</li>
<li>INSTANCE_TERMINATING: 缩容生命周期挂钩</li>
    */
    @SerializedName("LifecycleTransition")
    @Expose
    private String LifecycleTransition;

    /**
    * 定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围如下：
<li>CONTINUE: 默认值，表示继续执行扩缩容活动</li>
<li>ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</li>
    */
    @SerializedName("DefaultResult")
    @Expose
    private String DefaultResult;

    /**
    * 生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到7200秒，默认值为300秒
    */
    @SerializedName("HeartbeatTimeout")
    @Expose
    private Long HeartbeatTimeout;

    /**
    * 弹性伸缩向通知目标发送的附加信息，配置通知时使用，默认值为空字符串，最长不超过 1024 字符。NotificationMetadata 和 LifecycleCommand参数互斥，二者不可同时指定。
    */
    @SerializedName("NotificationMetadata")
    @Expose
    private String NotificationMetadata;

    /**
    * 通知目标。NotificationTarget和LifecycleCommand参数互斥，二者不可同时指定。
    */
    @SerializedName("NotificationTarget")
    @Expose
    private NotificationTarget NotificationTarget;

    /**
    * 进行生命周期挂钩的场景类型，取值范围包括 NORMAL 和 EXTENSION，默认值为 NORMAL。
说明：设置为EXTENSION值，在 [AttachInstances](https://cloud.tencent.com/document/api/377/20441)、[DetachInstances](https://cloud.tencent.com/document/api/377/20436)、[RemoveInstaces](https://cloud.tencent.com/document/api/377/20431)、[StopAutoScalingInstances](https://cloud.tencent.com/document/api/377/40286)、[StartAutoScalingInstances](https://cloud.tencent.com/document/api/377/40287)、[StartInstanceRefresh](https://cloud.tencent.com/document/api/377/99172) 接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。
    */
    @SerializedName("LifecycleTransitionType")
    @Expose
    private String LifecycleTransitionType;

    /**
    * 远程命令执行对象。通知相关参数（NotificationTarget、NotificationMetadata）与该参数互斥，二者不可同时指定。
    */
    @SerializedName("LifecycleCommand")
    @Expose
    private LifecycleCommand LifecycleCommand;

    /**
     * Get 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li> 
     * @return AutoScalingGroupId 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
     * @param AutoScalingGroupId 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 生命周期挂钩名称。名称仅支持中文、英文、数字、下划线（_）、短横线（-）、小数点（.），最大长度不能超128个字节。 
     * @return LifecycleHookName 生命周期挂钩名称。名称仅支持中文、英文、数字、下划线（_）、短横线（-）、小数点（.），最大长度不能超128个字节。
     */
    public String getLifecycleHookName() {
        return this.LifecycleHookName;
    }

    /**
     * Set 生命周期挂钩名称。名称仅支持中文、英文、数字、下划线（_）、短横线（-）、小数点（.），最大长度不能超128个字节。
     * @param LifecycleHookName 生命周期挂钩名称。名称仅支持中文、英文、数字、下划线（_）、短横线（-）、小数点（.），最大长度不能超128个字节。
     */
    public void setLifecycleHookName(String LifecycleHookName) {
        this.LifecycleHookName = LifecycleHookName;
    }

    /**
     * Get 进行生命周期挂钩的场景，取值范围如下:
<li> INSTANCE_LAUNCHING: 扩容生命周期挂钩</li>
<li>INSTANCE_TERMINATING: 缩容生命周期挂钩</li> 
     * @return LifecycleTransition 进行生命周期挂钩的场景，取值范围如下:
<li> INSTANCE_LAUNCHING: 扩容生命周期挂钩</li>
<li>INSTANCE_TERMINATING: 缩容生命周期挂钩</li>
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * Set 进行生命周期挂钩的场景，取值范围如下:
<li> INSTANCE_LAUNCHING: 扩容生命周期挂钩</li>
<li>INSTANCE_TERMINATING: 缩容生命周期挂钩</li>
     * @param LifecycleTransition 进行生命周期挂钩的场景，取值范围如下:
<li> INSTANCE_LAUNCHING: 扩容生命周期挂钩</li>
<li>INSTANCE_TERMINATING: 缩容生命周期挂钩</li>
     */
    public void setLifecycleTransition(String LifecycleTransition) {
        this.LifecycleTransition = LifecycleTransition;
    }

    /**
     * Get 定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围如下：
<li>CONTINUE: 默认值，表示继续执行扩缩容活动</li>
<li>ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</li> 
     * @return DefaultResult 定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围如下：
<li>CONTINUE: 默认值，表示继续执行扩缩容活动</li>
<li>ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</li>
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * Set 定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围如下：
<li>CONTINUE: 默认值，表示继续执行扩缩容活动</li>
<li>ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</li>
     * @param DefaultResult 定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围如下：
<li>CONTINUE: 默认值，表示继续执行扩缩容活动</li>
<li>ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</li>
     */
    public void setDefaultResult(String DefaultResult) {
        this.DefaultResult = DefaultResult;
    }

    /**
     * Get 生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到7200秒，默认值为300秒 
     * @return HeartbeatTimeout 生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到7200秒，默认值为300秒
     */
    public Long getHeartbeatTimeout() {
        return this.HeartbeatTimeout;
    }

    /**
     * Set 生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到7200秒，默认值为300秒
     * @param HeartbeatTimeout 生命周期挂钩超时之前可以经过的最长时间（以秒为单位），范围从30到7200秒，默认值为300秒
     */
    public void setHeartbeatTimeout(Long HeartbeatTimeout) {
        this.HeartbeatTimeout = HeartbeatTimeout;
    }

    /**
     * Get 弹性伸缩向通知目标发送的附加信息，配置通知时使用，默认值为空字符串，最长不超过 1024 字符。NotificationMetadata 和 LifecycleCommand参数互斥，二者不可同时指定。 
     * @return NotificationMetadata 弹性伸缩向通知目标发送的附加信息，配置通知时使用，默认值为空字符串，最长不超过 1024 字符。NotificationMetadata 和 LifecycleCommand参数互斥，二者不可同时指定。
     */
    public String getNotificationMetadata() {
        return this.NotificationMetadata;
    }

    /**
     * Set 弹性伸缩向通知目标发送的附加信息，配置通知时使用，默认值为空字符串，最长不超过 1024 字符。NotificationMetadata 和 LifecycleCommand参数互斥，二者不可同时指定。
     * @param NotificationMetadata 弹性伸缩向通知目标发送的附加信息，配置通知时使用，默认值为空字符串，最长不超过 1024 字符。NotificationMetadata 和 LifecycleCommand参数互斥，二者不可同时指定。
     */
    public void setNotificationMetadata(String NotificationMetadata) {
        this.NotificationMetadata = NotificationMetadata;
    }

    /**
     * Get 通知目标。NotificationTarget和LifecycleCommand参数互斥，二者不可同时指定。 
     * @return NotificationTarget 通知目标。NotificationTarget和LifecycleCommand参数互斥，二者不可同时指定。
     */
    public NotificationTarget getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * Set 通知目标。NotificationTarget和LifecycleCommand参数互斥，二者不可同时指定。
     * @param NotificationTarget 通知目标。NotificationTarget和LifecycleCommand参数互斥，二者不可同时指定。
     */
    public void setNotificationTarget(NotificationTarget NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
    }

    /**
     * Get 进行生命周期挂钩的场景类型，取值范围包括 NORMAL 和 EXTENSION，默认值为 NORMAL。
说明：设置为EXTENSION值，在 [AttachInstances](https://cloud.tencent.com/document/api/377/20441)、[DetachInstances](https://cloud.tencent.com/document/api/377/20436)、[RemoveInstaces](https://cloud.tencent.com/document/api/377/20431)、[StopAutoScalingInstances](https://cloud.tencent.com/document/api/377/40286)、[StartAutoScalingInstances](https://cloud.tencent.com/document/api/377/40287)、[StartInstanceRefresh](https://cloud.tencent.com/document/api/377/99172) 接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。 
     * @return LifecycleTransitionType 进行生命周期挂钩的场景类型，取值范围包括 NORMAL 和 EXTENSION，默认值为 NORMAL。
说明：设置为EXTENSION值，在 [AttachInstances](https://cloud.tencent.com/document/api/377/20441)、[DetachInstances](https://cloud.tencent.com/document/api/377/20436)、[RemoveInstaces](https://cloud.tencent.com/document/api/377/20431)、[StopAutoScalingInstances](https://cloud.tencent.com/document/api/377/40286)、[StartAutoScalingInstances](https://cloud.tencent.com/document/api/377/40287)、[StartInstanceRefresh](https://cloud.tencent.com/document/api/377/99172) 接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。
     */
    public String getLifecycleTransitionType() {
        return this.LifecycleTransitionType;
    }

    /**
     * Set 进行生命周期挂钩的场景类型，取值范围包括 NORMAL 和 EXTENSION，默认值为 NORMAL。
说明：设置为EXTENSION值，在 [AttachInstances](https://cloud.tencent.com/document/api/377/20441)、[DetachInstances](https://cloud.tencent.com/document/api/377/20436)、[RemoveInstaces](https://cloud.tencent.com/document/api/377/20431)、[StopAutoScalingInstances](https://cloud.tencent.com/document/api/377/40286)、[StartAutoScalingInstances](https://cloud.tencent.com/document/api/377/40287)、[StartInstanceRefresh](https://cloud.tencent.com/document/api/377/99172) 接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。
     * @param LifecycleTransitionType 进行生命周期挂钩的场景类型，取值范围包括 NORMAL 和 EXTENSION，默认值为 NORMAL。
说明：设置为EXTENSION值，在 [AttachInstances](https://cloud.tencent.com/document/api/377/20441)、[DetachInstances](https://cloud.tencent.com/document/api/377/20436)、[RemoveInstaces](https://cloud.tencent.com/document/api/377/20431)、[StopAutoScalingInstances](https://cloud.tencent.com/document/api/377/40286)、[StartAutoScalingInstances](https://cloud.tencent.com/document/api/377/40287)、[StartInstanceRefresh](https://cloud.tencent.com/document/api/377/99172) 接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。
     */
    public void setLifecycleTransitionType(String LifecycleTransitionType) {
        this.LifecycleTransitionType = LifecycleTransitionType;
    }

    /**
     * Get 远程命令执行对象。通知相关参数（NotificationTarget、NotificationMetadata）与该参数互斥，二者不可同时指定。 
     * @return LifecycleCommand 远程命令执行对象。通知相关参数（NotificationTarget、NotificationMetadata）与该参数互斥，二者不可同时指定。
     */
    public LifecycleCommand getLifecycleCommand() {
        return this.LifecycleCommand;
    }

    /**
     * Set 远程命令执行对象。通知相关参数（NotificationTarget、NotificationMetadata）与该参数互斥，二者不可同时指定。
     * @param LifecycleCommand 远程命令执行对象。通知相关参数（NotificationTarget、NotificationMetadata）与该参数互斥，二者不可同时指定。
     */
    public void setLifecycleCommand(LifecycleCommand LifecycleCommand) {
        this.LifecycleCommand = LifecycleCommand;
    }

    public CreateLifecycleHookRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLifecycleHookRequest(CreateLifecycleHookRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
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
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
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

