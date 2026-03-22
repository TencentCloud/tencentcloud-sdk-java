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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenClawServiceResponse extends AbstractModel {

    /**
    * <p>日志集id</p><p><a href="https://cloud.tencent.com/document/product/614/41034">日志集文档</a></p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>日志集名称</p>
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * <p>日志主题id</p><p><a href="https://cloud.tencent.com/document/product/614/41035">日志主题文档</a></p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>日志主题名称</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>指标主题id</p><p><a href="https://cloud.tencent.com/document/product/614/90328">指标主题文档</a></p>
    */
    @SerializedName("MetricTopicId")
    @Expose
    private String MetricTopicId;

    /**
    * <p>指标主题名称</p>
    */
    @SerializedName("MetricTopicName")
    @Expose
    private String MetricTopicName;

    /**
    * <p>机器组id</p><p><a href="https://cloud.tencent.com/document/product/614/17412">机器组文档</a></p>
    */
    @SerializedName("MachineGroupId")
    @Expose
    private String MachineGroupId;

    /**
    * <p>机器组名称</p>
    */
    @SerializedName("MachineGroupName")
    @Expose
    private String MachineGroupName;

    /**
    * <p>采集配置id。应用日志</p><p><a href="https://cloud.tencent.com/document/product/614/33494">采集概述文档</a> - <a href="https://cloud.tencent.com/document/product/614/57497">LogListener 采集配置导入</a></p>
    */
    @SerializedName("AppLogConfigId")
    @Expose
    private String AppLogConfigId;

    /**
    * <p>采集配置名称。应用日志</p>
    */
    @SerializedName("AppLogConfigName")
    @Expose
    private String AppLogConfigName;

    /**
    * <p>采集配置id。会话日志</p><p><a href="https://cloud.tencent.com/document/product/614/33494">采集概述文档</a> - <a href="https://cloud.tencent.com/document/product/614/57497">LogListener 采集配置导入</a></p>
    */
    @SerializedName("SessionLogConfigId")
    @Expose
    private String SessionLogConfigId;

    /**
    * <p>采集配置名称。会话日志</p>
    */
    @SerializedName("SessionLogConfigName")
    @Expose
    private String SessionLogConfigName;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>日志集id</p><p><a href="https://cloud.tencent.com/document/product/614/41034">日志集文档</a></p> 
     * @return LogsetId <p>日志集id</p><p><a href="https://cloud.tencent.com/document/product/614/41034">日志集文档</a></p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集id</p><p><a href="https://cloud.tencent.com/document/product/614/41034">日志集文档</a></p>
     * @param LogsetId <p>日志集id</p><p><a href="https://cloud.tencent.com/document/product/614/41034">日志集文档</a></p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>日志集名称</p> 
     * @return LogsetName <p>日志集名称</p>
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set <p>日志集名称</p>
     * @param LogsetName <p>日志集名称</p>
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get <p>日志主题id</p><p><a href="https://cloud.tencent.com/document/product/614/41035">日志主题文档</a></p> 
     * @return TopicId <p>日志主题id</p><p><a href="https://cloud.tencent.com/document/product/614/41035">日志主题文档</a></p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题id</p><p><a href="https://cloud.tencent.com/document/product/614/41035">日志主题文档</a></p>
     * @param TopicId <p>日志主题id</p><p><a href="https://cloud.tencent.com/document/product/614/41035">日志主题文档</a></p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>日志主题名称</p> 
     * @return TopicName <p>日志主题名称</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>日志主题名称</p>
     * @param TopicName <p>日志主题名称</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>指标主题id</p><p><a href="https://cloud.tencent.com/document/product/614/90328">指标主题文档</a></p> 
     * @return MetricTopicId <p>指标主题id</p><p><a href="https://cloud.tencent.com/document/product/614/90328">指标主题文档</a></p>
     */
    public String getMetricTopicId() {
        return this.MetricTopicId;
    }

    /**
     * Set <p>指标主题id</p><p><a href="https://cloud.tencent.com/document/product/614/90328">指标主题文档</a></p>
     * @param MetricTopicId <p>指标主题id</p><p><a href="https://cloud.tencent.com/document/product/614/90328">指标主题文档</a></p>
     */
    public void setMetricTopicId(String MetricTopicId) {
        this.MetricTopicId = MetricTopicId;
    }

    /**
     * Get <p>指标主题名称</p> 
     * @return MetricTopicName <p>指标主题名称</p>
     */
    public String getMetricTopicName() {
        return this.MetricTopicName;
    }

    /**
     * Set <p>指标主题名称</p>
     * @param MetricTopicName <p>指标主题名称</p>
     */
    public void setMetricTopicName(String MetricTopicName) {
        this.MetricTopicName = MetricTopicName;
    }

    /**
     * Get <p>机器组id</p><p><a href="https://cloud.tencent.com/document/product/614/17412">机器组文档</a></p> 
     * @return MachineGroupId <p>机器组id</p><p><a href="https://cloud.tencent.com/document/product/614/17412">机器组文档</a></p>
     */
    public String getMachineGroupId() {
        return this.MachineGroupId;
    }

    /**
     * Set <p>机器组id</p><p><a href="https://cloud.tencent.com/document/product/614/17412">机器组文档</a></p>
     * @param MachineGroupId <p>机器组id</p><p><a href="https://cloud.tencent.com/document/product/614/17412">机器组文档</a></p>
     */
    public void setMachineGroupId(String MachineGroupId) {
        this.MachineGroupId = MachineGroupId;
    }

    /**
     * Get <p>机器组名称</p> 
     * @return MachineGroupName <p>机器组名称</p>
     */
    public String getMachineGroupName() {
        return this.MachineGroupName;
    }

    /**
     * Set <p>机器组名称</p>
     * @param MachineGroupName <p>机器组名称</p>
     */
    public void setMachineGroupName(String MachineGroupName) {
        this.MachineGroupName = MachineGroupName;
    }

    /**
     * Get <p>采集配置id。应用日志</p><p><a href="https://cloud.tencent.com/document/product/614/33494">采集概述文档</a> - <a href="https://cloud.tencent.com/document/product/614/57497">LogListener 采集配置导入</a></p> 
     * @return AppLogConfigId <p>采集配置id。应用日志</p><p><a href="https://cloud.tencent.com/document/product/614/33494">采集概述文档</a> - <a href="https://cloud.tencent.com/document/product/614/57497">LogListener 采集配置导入</a></p>
     */
    public String getAppLogConfigId() {
        return this.AppLogConfigId;
    }

    /**
     * Set <p>采集配置id。应用日志</p><p><a href="https://cloud.tencent.com/document/product/614/33494">采集概述文档</a> - <a href="https://cloud.tencent.com/document/product/614/57497">LogListener 采集配置导入</a></p>
     * @param AppLogConfigId <p>采集配置id。应用日志</p><p><a href="https://cloud.tencent.com/document/product/614/33494">采集概述文档</a> - <a href="https://cloud.tencent.com/document/product/614/57497">LogListener 采集配置导入</a></p>
     */
    public void setAppLogConfigId(String AppLogConfigId) {
        this.AppLogConfigId = AppLogConfigId;
    }

    /**
     * Get <p>采集配置名称。应用日志</p> 
     * @return AppLogConfigName <p>采集配置名称。应用日志</p>
     */
    public String getAppLogConfigName() {
        return this.AppLogConfigName;
    }

    /**
     * Set <p>采集配置名称。应用日志</p>
     * @param AppLogConfigName <p>采集配置名称。应用日志</p>
     */
    public void setAppLogConfigName(String AppLogConfigName) {
        this.AppLogConfigName = AppLogConfigName;
    }

    /**
     * Get <p>采集配置id。会话日志</p><p><a href="https://cloud.tencent.com/document/product/614/33494">采集概述文档</a> - <a href="https://cloud.tencent.com/document/product/614/57497">LogListener 采集配置导入</a></p> 
     * @return SessionLogConfigId <p>采集配置id。会话日志</p><p><a href="https://cloud.tencent.com/document/product/614/33494">采集概述文档</a> - <a href="https://cloud.tencent.com/document/product/614/57497">LogListener 采集配置导入</a></p>
     */
    public String getSessionLogConfigId() {
        return this.SessionLogConfigId;
    }

    /**
     * Set <p>采集配置id。会话日志</p><p><a href="https://cloud.tencent.com/document/product/614/33494">采集概述文档</a> - <a href="https://cloud.tencent.com/document/product/614/57497">LogListener 采集配置导入</a></p>
     * @param SessionLogConfigId <p>采集配置id。会话日志</p><p><a href="https://cloud.tencent.com/document/product/614/33494">采集概述文档</a> - <a href="https://cloud.tencent.com/document/product/614/57497">LogListener 采集配置导入</a></p>
     */
    public void setSessionLogConfigId(String SessionLogConfigId) {
        this.SessionLogConfigId = SessionLogConfigId;
    }

    /**
     * Get <p>采集配置名称。会话日志</p> 
     * @return SessionLogConfigName <p>采集配置名称。会话日志</p>
     */
    public String getSessionLogConfigName() {
        return this.SessionLogConfigName;
    }

    /**
     * Set <p>采集配置名称。会话日志</p>
     * @param SessionLogConfigName <p>采集配置名称。会话日志</p>
     */
    public void setSessionLogConfigName(String SessionLogConfigName) {
        this.SessionLogConfigName = SessionLogConfigName;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public OpenClawServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenClawServiceResponse(OpenClawServiceResponse source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MetricTopicId != null) {
            this.MetricTopicId = new String(source.MetricTopicId);
        }
        if (source.MetricTopicName != null) {
            this.MetricTopicName = new String(source.MetricTopicName);
        }
        if (source.MachineGroupId != null) {
            this.MachineGroupId = new String(source.MachineGroupId);
        }
        if (source.MachineGroupName != null) {
            this.MachineGroupName = new String(source.MachineGroupName);
        }
        if (source.AppLogConfigId != null) {
            this.AppLogConfigId = new String(source.AppLogConfigId);
        }
        if (source.AppLogConfigName != null) {
            this.AppLogConfigName = new String(source.AppLogConfigName);
        }
        if (source.SessionLogConfigId != null) {
            this.SessionLogConfigId = new String(source.SessionLogConfigId);
        }
        if (source.SessionLogConfigName != null) {
            this.SessionLogConfigName = new String(source.SessionLogConfigName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MetricTopicId", this.MetricTopicId);
        this.setParamSimple(map, prefix + "MetricTopicName", this.MetricTopicName);
        this.setParamSimple(map, prefix + "MachineGroupId", this.MachineGroupId);
        this.setParamSimple(map, prefix + "MachineGroupName", this.MachineGroupName);
        this.setParamSimple(map, prefix + "AppLogConfigId", this.AppLogConfigId);
        this.setParamSimple(map, prefix + "AppLogConfigName", this.AppLogConfigName);
        this.setParamSimple(map, prefix + "SessionLogConfigId", this.SessionLogConfigId);
        this.setParamSimple(map, prefix + "SessionLogConfigName", this.SessionLogConfigName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

