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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRabbitMQVirtualHostRequest extends AbstractModel {

    /**
    * 实例 ID，形如amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * vhost名
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 消息轨迹开关,true打开,false关闭,默认关闭
    */
    @SerializedName("TraceFlag")
    @Expose
    private Boolean TraceFlag;

    /**
    * 是否创建镜像队列策略，默认值 true
    */
    @SerializedName("MirrorQueuePolicyFlag")
    @Expose
    private Boolean MirrorQueuePolicyFlag;

    /**
     * Get 实例 ID，形如amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。 
     * @return InstanceId 实例 ID，形如amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，形如amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。
     * @param InstanceId 实例 ID，形如amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get vhost名 
     * @return VirtualHost vhost名
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set vhost名
     * @param VirtualHost vhost名
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 消息轨迹开关,true打开,false关闭,默认关闭 
     * @return TraceFlag 消息轨迹开关,true打开,false关闭,默认关闭
     */
    public Boolean getTraceFlag() {
        return this.TraceFlag;
    }

    /**
     * Set 消息轨迹开关,true打开,false关闭,默认关闭
     * @param TraceFlag 消息轨迹开关,true打开,false关闭,默认关闭
     */
    public void setTraceFlag(Boolean TraceFlag) {
        this.TraceFlag = TraceFlag;
    }

    /**
     * Get 是否创建镜像队列策略，默认值 true 
     * @return MirrorQueuePolicyFlag 是否创建镜像队列策略，默认值 true
     */
    public Boolean getMirrorQueuePolicyFlag() {
        return this.MirrorQueuePolicyFlag;
    }

    /**
     * Set 是否创建镜像队列策略，默认值 true
     * @param MirrorQueuePolicyFlag 是否创建镜像队列策略，默认值 true
     */
    public void setMirrorQueuePolicyFlag(Boolean MirrorQueuePolicyFlag) {
        this.MirrorQueuePolicyFlag = MirrorQueuePolicyFlag;
    }

    public CreateRabbitMQVirtualHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRabbitMQVirtualHostRequest(CreateRabbitMQVirtualHostRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TraceFlag != null) {
            this.TraceFlag = new Boolean(source.TraceFlag);
        }
        if (source.MirrorQueuePolicyFlag != null) {
            this.MirrorQueuePolicyFlag = new Boolean(source.MirrorQueuePolicyFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TraceFlag", this.TraceFlag);
        this.setParamSimple(map, prefix + "MirrorQueuePolicyFlag", this.MirrorQueuePolicyFlag);

    }
}

