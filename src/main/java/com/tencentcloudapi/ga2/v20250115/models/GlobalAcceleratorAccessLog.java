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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GlobalAcceleratorAccessLog extends AbstractModel {

    /**
    * <p>日志唯一Id</p>
    */
    @SerializedName("LogPushTaskId")
    @Expose
    private String LogPushTaskId;

    /**
    * <p>GA实例唯一Id</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>监听器唯一Id</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>终端节点组唯一Id</p>
    */
    @SerializedName("EndpointGroupId")
    @Expose
    private String EndpointGroupId;

    /**
    * <p>日志任务描述</p>
    */
    @SerializedName("FlowLogDescription")
    @Expose
    private String FlowLogDescription;

    /**
    * <p>日志所在地域</p>
    */
    @SerializedName("CloudRegion")
    @Expose
    private String CloudRegion;

    /**
    * <p>日志主题Id</p>
    */
    @SerializedName("CloudLogId")
    @Expose
    private String CloudLogId;

    /**
    * <p>日志集Id</p>
    */
    @SerializedName("CloudLogSetId")
    @Expose
    private String CloudLogSetId;

    /**
    * <p>选择日志采集字段</p>
    */
    @SerializedName("FieldKeys")
    @Expose
    private String [] FieldKeys;

    /**
    * <p>日志任务状态</p><p>枚举值：</p><ul><li>active： 运行中</li><li>stopped： 已暂停</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>日志唯一Id</p> 
     * @return LogPushTaskId <p>日志唯一Id</p>
     */
    public String getLogPushTaskId() {
        return this.LogPushTaskId;
    }

    /**
     * Set <p>日志唯一Id</p>
     * @param LogPushTaskId <p>日志唯一Id</p>
     */
    public void setLogPushTaskId(String LogPushTaskId) {
        this.LogPushTaskId = LogPushTaskId;
    }

    /**
     * Get <p>GA实例唯一Id</p> 
     * @return GlobalAcceleratorId <p>GA实例唯一Id</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>GA实例唯一Id</p>
     * @param GlobalAcceleratorId <p>GA实例唯一Id</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>监听器唯一Id</p> 
     * @return ListenerId <p>监听器唯一Id</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>监听器唯一Id</p>
     * @param ListenerId <p>监听器唯一Id</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>终端节点组唯一Id</p> 
     * @return EndpointGroupId <p>终端节点组唯一Id</p>
     */
    public String getEndpointGroupId() {
        return this.EndpointGroupId;
    }

    /**
     * Set <p>终端节点组唯一Id</p>
     * @param EndpointGroupId <p>终端节点组唯一Id</p>
     */
    public void setEndpointGroupId(String EndpointGroupId) {
        this.EndpointGroupId = EndpointGroupId;
    }

    /**
     * Get <p>日志任务描述</p> 
     * @return FlowLogDescription <p>日志任务描述</p>
     */
    public String getFlowLogDescription() {
        return this.FlowLogDescription;
    }

    /**
     * Set <p>日志任务描述</p>
     * @param FlowLogDescription <p>日志任务描述</p>
     */
    public void setFlowLogDescription(String FlowLogDescription) {
        this.FlowLogDescription = FlowLogDescription;
    }

    /**
     * Get <p>日志所在地域</p> 
     * @return CloudRegion <p>日志所在地域</p>
     */
    public String getCloudRegion() {
        return this.CloudRegion;
    }

    /**
     * Set <p>日志所在地域</p>
     * @param CloudRegion <p>日志所在地域</p>
     */
    public void setCloudRegion(String CloudRegion) {
        this.CloudRegion = CloudRegion;
    }

    /**
     * Get <p>日志主题Id</p> 
     * @return CloudLogId <p>日志主题Id</p>
     */
    public String getCloudLogId() {
        return this.CloudLogId;
    }

    /**
     * Set <p>日志主题Id</p>
     * @param CloudLogId <p>日志主题Id</p>
     */
    public void setCloudLogId(String CloudLogId) {
        this.CloudLogId = CloudLogId;
    }

    /**
     * Get <p>日志集Id</p> 
     * @return CloudLogSetId <p>日志集Id</p>
     */
    public String getCloudLogSetId() {
        return this.CloudLogSetId;
    }

    /**
     * Set <p>日志集Id</p>
     * @param CloudLogSetId <p>日志集Id</p>
     */
    public void setCloudLogSetId(String CloudLogSetId) {
        this.CloudLogSetId = CloudLogSetId;
    }

    /**
     * Get <p>选择日志采集字段</p> 
     * @return FieldKeys <p>选择日志采集字段</p>
     */
    public String [] getFieldKeys() {
        return this.FieldKeys;
    }

    /**
     * Set <p>选择日志采集字段</p>
     * @param FieldKeys <p>选择日志采集字段</p>
     */
    public void setFieldKeys(String [] FieldKeys) {
        this.FieldKeys = FieldKeys;
    }

    /**
     * Get <p>日志任务状态</p><p>枚举值：</p><ul><li>active： 运行中</li><li>stopped： 已暂停</li></ul> 
     * @return Status <p>日志任务状态</p><p>枚举值：</p><ul><li>active： 运行中</li><li>stopped： 已暂停</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>日志任务状态</p><p>枚举值：</p><ul><li>active： 运行中</li><li>stopped： 已暂停</li></ul>
     * @param Status <p>日志任务状态</p><p>枚举值：</p><ul><li>active： 运行中</li><li>stopped： 已暂停</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public GlobalAcceleratorAccessLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlobalAcceleratorAccessLog(GlobalAcceleratorAccessLog source) {
        if (source.LogPushTaskId != null) {
            this.LogPushTaskId = new String(source.LogPushTaskId);
        }
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.EndpointGroupId != null) {
            this.EndpointGroupId = new String(source.EndpointGroupId);
        }
        if (source.FlowLogDescription != null) {
            this.FlowLogDescription = new String(source.FlowLogDescription);
        }
        if (source.CloudRegion != null) {
            this.CloudRegion = new String(source.CloudRegion);
        }
        if (source.CloudLogId != null) {
            this.CloudLogId = new String(source.CloudLogId);
        }
        if (source.CloudLogSetId != null) {
            this.CloudLogSetId = new String(source.CloudLogSetId);
        }
        if (source.FieldKeys != null) {
            this.FieldKeys = new String[source.FieldKeys.length];
            for (int i = 0; i < source.FieldKeys.length; i++) {
                this.FieldKeys[i] = new String(source.FieldKeys[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogPushTaskId", this.LogPushTaskId);
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "EndpointGroupId", this.EndpointGroupId);
        this.setParamSimple(map, prefix + "FlowLogDescription", this.FlowLogDescription);
        this.setParamSimple(map, prefix + "CloudRegion", this.CloudRegion);
        this.setParamSimple(map, prefix + "CloudLogId", this.CloudLogId);
        this.setParamSimple(map, prefix + "CloudLogSetId", this.CloudLogSetId);
        this.setParamArraySimple(map, prefix + "FieldKeys.", this.FieldKeys);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

