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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopologyNewRequest extends AbstractModel {

    /**
    * 业务系统 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 查询开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 应用名
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 上游层级
    */
    @SerializedName("UpLevel")
    @Expose
    private Long UpLevel;

    /**
    * 应用实例信息
    */
    @SerializedName("ServiceInstance")
    @Expose
    private String ServiceInstance;

    /**
    * 下游层级
    */
    @SerializedName("DownLevel")
    @Expose
    private Long DownLevel;

    /**
    * 视角
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * 过滤器
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 表示Topic（MQ拓扑图用）
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 视图筛选列表
    */
    @SerializedName("Selectors")
    @Expose
    private Selectors Selectors;

    /**
    * 视图ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * TraceID
    */
    @SerializedName("TraceID")
    @Expose
    private String TraceID;

    /**
    * 查询top5慢响应节点
    */
    @SerializedName("IsSlowTopFive")
    @Expose
    private Boolean IsSlowTopFive;

    /**
    * 是否获取资源层信息
    */
    @SerializedName("GetResource")
    @Expose
    private Boolean GetResource;

    /**
    * 根据应用标签过滤
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * 不显示的节点类型
    */
    @SerializedName("Hidden")
    @Expose
    private Selectors Hidden;

    /**
     * Get 业务系统 ID 
     * @return InstanceId 业务系统 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 业务系统 ID
     * @param InstanceId 业务系统 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 查询开始时间 
     * @return StartTime 查询开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间
     * @param StartTime 查询开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间 
     * @return EndTime 查询结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间
     * @param EndTime 查询结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 应用名 
     * @return ServiceName 应用名
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 应用名
     * @param ServiceName 应用名
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 上游层级 
     * @return UpLevel 上游层级
     */
    public Long getUpLevel() {
        return this.UpLevel;
    }

    /**
     * Set 上游层级
     * @param UpLevel 上游层级
     */
    public void setUpLevel(Long UpLevel) {
        this.UpLevel = UpLevel;
    }

    /**
     * Get 应用实例信息 
     * @return ServiceInstance 应用实例信息
     */
    public String getServiceInstance() {
        return this.ServiceInstance;
    }

    /**
     * Set 应用实例信息
     * @param ServiceInstance 应用实例信息
     */
    public void setServiceInstance(String ServiceInstance) {
        this.ServiceInstance = ServiceInstance;
    }

    /**
     * Get 下游层级 
     * @return DownLevel 下游层级
     */
    public Long getDownLevel() {
        return this.DownLevel;
    }

    /**
     * Set 下游层级
     * @param DownLevel 下游层级
     */
    public void setDownLevel(Long DownLevel) {
        this.DownLevel = DownLevel;
    }

    /**
     * Get 视角 
     * @return View 视角
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set 视角
     * @param View 视角
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get 过滤器 
     * @return Filters 过滤器
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器
     * @param Filters 过滤器
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 表示Topic（MQ拓扑图用） 
     * @return Topic 表示Topic（MQ拓扑图用）
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 表示Topic（MQ拓扑图用）
     * @param Topic 表示Topic（MQ拓扑图用）
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 视图筛选列表 
     * @return Selectors 视图筛选列表
     */
    public Selectors getSelectors() {
        return this.Selectors;
    }

    /**
     * Set 视图筛选列表
     * @param Selectors 视图筛选列表
     */
    public void setSelectors(Selectors Selectors) {
        this.Selectors = Selectors;
    }

    /**
     * Get 视图ID 
     * @return Id 视图ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 视图ID
     * @param Id 视图ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get TraceID 
     * @return TraceID TraceID
     */
    public String getTraceID() {
        return this.TraceID;
    }

    /**
     * Set TraceID
     * @param TraceID TraceID
     */
    public void setTraceID(String TraceID) {
        this.TraceID = TraceID;
    }

    /**
     * Get 查询top5慢响应节点 
     * @return IsSlowTopFive 查询top5慢响应节点
     */
    public Boolean getIsSlowTopFive() {
        return this.IsSlowTopFive;
    }

    /**
     * Set 查询top5慢响应节点
     * @param IsSlowTopFive 查询top5慢响应节点
     */
    public void setIsSlowTopFive(Boolean IsSlowTopFive) {
        this.IsSlowTopFive = IsSlowTopFive;
    }

    /**
     * Get 是否获取资源层信息 
     * @return GetResource 是否获取资源层信息
     */
    public Boolean getGetResource() {
        return this.GetResource;
    }

    /**
     * Set 是否获取资源层信息
     * @param GetResource 是否获取资源层信息
     */
    public void setGetResource(Boolean GetResource) {
        this.GetResource = GetResource;
    }

    /**
     * Get 根据应用标签过滤 
     * @return Tags 根据应用标签过滤
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 根据应用标签过滤
     * @param Tags 根据应用标签过滤
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 不显示的节点类型 
     * @return Hidden 不显示的节点类型
     */
    public Selectors getHidden() {
        return this.Hidden;
    }

    /**
     * Set 不显示的节点类型
     * @param Hidden 不显示的节点类型
     */
    public void setHidden(Selectors Hidden) {
        this.Hidden = Hidden;
    }

    public DescribeTopologyNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopologyNewRequest(DescribeTopologyNewRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.UpLevel != null) {
            this.UpLevel = new Long(source.UpLevel);
        }
        if (source.ServiceInstance != null) {
            this.ServiceInstance = new String(source.ServiceInstance);
        }
        if (source.DownLevel != null) {
            this.DownLevel = new Long(source.DownLevel);
        }
        if (source.View != null) {
            this.View = new String(source.View);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Selectors != null) {
            this.Selectors = new Selectors(source.Selectors);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TraceID != null) {
            this.TraceID = new String(source.TraceID);
        }
        if (source.IsSlowTopFive != null) {
            this.IsSlowTopFive = new Boolean(source.IsSlowTopFive);
        }
        if (source.GetResource != null) {
            this.GetResource = new Boolean(source.GetResource);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.Hidden != null) {
            this.Hidden = new Selectors(source.Hidden);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "UpLevel", this.UpLevel);
        this.setParamSimple(map, prefix + "ServiceInstance", this.ServiceInstance);
        this.setParamSimple(map, prefix + "DownLevel", this.DownLevel);
        this.setParamSimple(map, prefix + "View", this.View);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamObj(map, prefix + "Selectors.", this.Selectors);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TraceID", this.TraceID);
        this.setParamSimple(map, prefix + "IsSlowTopFive", this.IsSlowTopFive);
        this.setParamSimple(map, prefix + "GetResource", this.GetResource);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "Hidden.", this.Hidden);

    }
}

