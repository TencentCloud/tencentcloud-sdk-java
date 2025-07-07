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

public class CompleteLifecycleActionRequest extends AbstractModel {

    /**
    * 生命周期挂钩ID。可以通过调用接口 [DescribeLifecycleHooks](https://cloud.tencent.com/document/api/377/34452) ，取返回信息中的 LifecycleHookId 获取生命周期挂钩ID。
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * 生命周期动作的结果，取值范围如下：
<li>CONTINUE: 默认值，表示继续执行扩缩容活动</li>
<li>ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</li>
    */
    @SerializedName("LifecycleActionResult")
    @Expose
    private String LifecycleActionResult;

    /**
    * 实例ID，`InstanceId` 和 `LifecycleActionToken` 参数必须填写其中一个。可通过登录 [控制台](https://console.cloud.tencent.com/cvm/index) 或调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 生命周期动作令牌，`InstanceId` 和 `LifecycleActionToken` 必须填充其中一个。
该参数获取方式如下：配置 `NotificationTarget ` 参数的挂钩被触发时，向  `NotificationTarget `  参数中指定的消息队列投递包含令牌的消息，消息队列的消费者可从消息中获取令牌。
    */
    @SerializedName("LifecycleActionToken")
    @Expose
    private String LifecycleActionToken;

    /**
     * Get 生命周期挂钩ID。可以通过调用接口 [DescribeLifecycleHooks](https://cloud.tencent.com/document/api/377/34452) ，取返回信息中的 LifecycleHookId 获取生命周期挂钩ID。 
     * @return LifecycleHookId 生命周期挂钩ID。可以通过调用接口 [DescribeLifecycleHooks](https://cloud.tencent.com/document/api/377/34452) ，取返回信息中的 LifecycleHookId 获取生命周期挂钩ID。
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * Set 生命周期挂钩ID。可以通过调用接口 [DescribeLifecycleHooks](https://cloud.tencent.com/document/api/377/34452) ，取返回信息中的 LifecycleHookId 获取生命周期挂钩ID。
     * @param LifecycleHookId 生命周期挂钩ID。可以通过调用接口 [DescribeLifecycleHooks](https://cloud.tencent.com/document/api/377/34452) ，取返回信息中的 LifecycleHookId 获取生命周期挂钩ID。
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * Get 生命周期动作的结果，取值范围如下：
<li>CONTINUE: 默认值，表示继续执行扩缩容活动</li>
<li>ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</li> 
     * @return LifecycleActionResult 生命周期动作的结果，取值范围如下：
<li>CONTINUE: 默认值，表示继续执行扩缩容活动</li>
<li>ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</li>
     */
    public String getLifecycleActionResult() {
        return this.LifecycleActionResult;
    }

    /**
     * Set 生命周期动作的结果，取值范围如下：
<li>CONTINUE: 默认值，表示继续执行扩缩容活动</li>
<li>ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</li>
     * @param LifecycleActionResult 生命周期动作的结果，取值范围如下：
<li>CONTINUE: 默认值，表示继续执行扩缩容活动</li>
<li>ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动。</li>
     */
    public void setLifecycleActionResult(String LifecycleActionResult) {
        this.LifecycleActionResult = LifecycleActionResult;
    }

    /**
     * Get 实例ID，`InstanceId` 和 `LifecycleActionToken` 参数必须填写其中一个。可通过登录 [控制台](https://console.cloud.tencent.com/cvm/index) 或调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。 
     * @return InstanceId 实例ID，`InstanceId` 和 `LifecycleActionToken` 参数必须填写其中一个。可通过登录 [控制台](https://console.cloud.tencent.com/cvm/index) 或调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，`InstanceId` 和 `LifecycleActionToken` 参数必须填写其中一个。可通过登录 [控制台](https://console.cloud.tencent.com/cvm/index) 或调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。
     * @param InstanceId 实例ID，`InstanceId` 和 `LifecycleActionToken` 参数必须填写其中一个。可通过登录 [控制台](https://console.cloud.tencent.com/cvm/index) 或调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 生命周期动作令牌，`InstanceId` 和 `LifecycleActionToken` 必须填充其中一个。
该参数获取方式如下：配置 `NotificationTarget ` 参数的挂钩被触发时，向  `NotificationTarget `  参数中指定的消息队列投递包含令牌的消息，消息队列的消费者可从消息中获取令牌。 
     * @return LifecycleActionToken 生命周期动作令牌，`InstanceId` 和 `LifecycleActionToken` 必须填充其中一个。
该参数获取方式如下：配置 `NotificationTarget ` 参数的挂钩被触发时，向  `NotificationTarget `  参数中指定的消息队列投递包含令牌的消息，消息队列的消费者可从消息中获取令牌。
     */
    public String getLifecycleActionToken() {
        return this.LifecycleActionToken;
    }

    /**
     * Set 生命周期动作令牌，`InstanceId` 和 `LifecycleActionToken` 必须填充其中一个。
该参数获取方式如下：配置 `NotificationTarget ` 参数的挂钩被触发时，向  `NotificationTarget `  参数中指定的消息队列投递包含令牌的消息，消息队列的消费者可从消息中获取令牌。
     * @param LifecycleActionToken 生命周期动作令牌，`InstanceId` 和 `LifecycleActionToken` 必须填充其中一个。
该参数获取方式如下：配置 `NotificationTarget ` 参数的挂钩被触发时，向  `NotificationTarget `  参数中指定的消息队列投递包含令牌的消息，消息队列的消费者可从消息中获取令牌。
     */
    public void setLifecycleActionToken(String LifecycleActionToken) {
        this.LifecycleActionToken = LifecycleActionToken;
    }

    public CompleteLifecycleActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompleteLifecycleActionRequest(CompleteLifecycleActionRequest source) {
        if (source.LifecycleHookId != null) {
            this.LifecycleHookId = new String(source.LifecycleHookId);
        }
        if (source.LifecycleActionResult != null) {
            this.LifecycleActionResult = new String(source.LifecycleActionResult);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LifecycleActionToken != null) {
            this.LifecycleActionToken = new String(source.LifecycleActionToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleHookId", this.LifecycleHookId);
        this.setParamSimple(map, prefix + "LifecycleActionResult", this.LifecycleActionResult);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LifecycleActionToken", this.LifecycleActionToken);

    }
}

