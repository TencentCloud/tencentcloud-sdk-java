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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNormalLogsRequest extends AbstractModel{

    /**
    * 压测项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 测试场景ID
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * 压测任务ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 日志上下文，加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容。过期时间1小时
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 日志开始时间
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 日志结束时间
    */
    @SerializedName("To")
    @Expose
    private String To;

    /**
    * 日志级别，可取debug/info/error
    */
    @SerializedName("SeverityText")
    @Expose
    private String SeverityText;

    /**
    * 施压节点IP
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * 施压节点所在地域
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * 日志类型， console代表用户输出，engine代表引擎输出
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 返回日志条数限制，最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 压测项目ID 
     * @return ProjectId 压测项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 压测项目ID
     * @param ProjectId 压测项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 测试场景ID 
     * @return ScenarioId 测试场景ID
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set 测试场景ID
     * @param ScenarioId 测试场景ID
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get 压测任务ID 
     * @return JobId 压测任务ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 压测任务ID
     * @param JobId 压测任务ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 日志上下文，加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容。过期时间1小时 
     * @return Context 日志上下文，加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容。过期时间1小时
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 日志上下文，加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容。过期时间1小时
     * @param Context 日志上下文，加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容。过期时间1小时
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 日志开始时间 
     * @return From 日志开始时间
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 日志开始时间
     * @param From 日志开始时间
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 日志结束时间 
     * @return To 日志结束时间
     */
    public String getTo() {
        return this.To;
    }

    /**
     * Set 日志结束时间
     * @param To 日志结束时间
     */
    public void setTo(String To) {
        this.To = To;
    }

    /**
     * Get 日志级别，可取debug/info/error 
     * @return SeverityText 日志级别，可取debug/info/error
     */
    public String getSeverityText() {
        return this.SeverityText;
    }

    /**
     * Set 日志级别，可取debug/info/error
     * @param SeverityText 日志级别，可取debug/info/error
     */
    public void setSeverityText(String SeverityText) {
        this.SeverityText = SeverityText;
    }

    /**
     * Get 施压节点IP 
     * @return Instance 施压节点IP
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set 施压节点IP
     * @param Instance 施压节点IP
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 施压节点所在地域 
     * @return InstanceRegion 施压节点所在地域
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set 施压节点所在地域
     * @param InstanceRegion 施压节点所在地域
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get 日志类型， console代表用户输出，engine代表引擎输出 
     * @return LogType 日志类型， console代表用户输出，engine代表引擎输出
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型， console代表用户输出，engine代表引擎输出
     * @param LogType 日志类型， console代表用户输出，engine代表引擎输出
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 返回日志条数限制，最大100 
     * @return Limit 返回日志条数限制，最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回日志条数限制，最大100
     * @param Limit 返回日志条数限制，最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeNormalLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNormalLogsRequest(DescribeNormalLogsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.To != null) {
            this.To = new String(source.To);
        }
        if (source.SeverityText != null) {
            this.SeverityText = new String(source.SeverityText);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "SeverityText", this.SeverityText);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

