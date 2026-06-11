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
    * <p>业务系统 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>查询开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>查询结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>应用名</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>上游层级</p>
    */
    @SerializedName("UpLevel")
    @Expose
    private Long UpLevel;

    /**
    * <p>应用实例信息</p>
    */
    @SerializedName("ServiceInstance")
    @Expose
    private String ServiceInstance;

    /**
    * <p>下游层级</p>
    */
    @SerializedName("DownLevel")
    @Expose
    private Long DownLevel;

    /**
    * <p>视角</p>
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * <p>过滤器</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>表示Topic（MQ拓扑图用）</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>视图筛选列表</p>
    */
    @SerializedName("Selectors")
    @Expose
    private Selectors Selectors;

    /**
    * <p>视图ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>TraceID</p>
    */
    @SerializedName("TraceID")
    @Expose
    private String TraceID;

    /**
    * <p>查询top5慢响应节点</p>
    */
    @SerializedName("IsSlowTopFive")
    @Expose
    private Boolean IsSlowTopFive;

    /**
    * <p>是否获取资源层信息</p>
    */
    @SerializedName("GetResource")
    @Expose
    private Boolean GetResource;

    /**
    * <p>根据应用标签过滤</p>
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * <p>不显示的节点类型</p>
    */
    @SerializedName("Hidden")
    @Expose
    private Selectors Hidden;

    /**
    * <p>是否开启云资源关联</p>
    */
    @SerializedName("EnableResourceLink")
    @Expose
    private Boolean EnableResourceLink;

    /**
     * Get <p>业务系统 ID</p> 
     * @return InstanceId <p>业务系统 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>业务系统 ID</p>
     * @param InstanceId <p>业务系统 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>查询开始时间</p> 
     * @return StartTime <p>查询开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询开始时间</p>
     * @param StartTime <p>查询开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间</p> 
     * @return EndTime <p>查询结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间</p>
     * @param EndTime <p>查询结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>应用名</p> 
     * @return ServiceName <p>应用名</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>应用名</p>
     * @param ServiceName <p>应用名</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>上游层级</p> 
     * @return UpLevel <p>上游层级</p>
     */
    public Long getUpLevel() {
        return this.UpLevel;
    }

    /**
     * Set <p>上游层级</p>
     * @param UpLevel <p>上游层级</p>
     */
    public void setUpLevel(Long UpLevel) {
        this.UpLevel = UpLevel;
    }

    /**
     * Get <p>应用实例信息</p> 
     * @return ServiceInstance <p>应用实例信息</p>
     */
    public String getServiceInstance() {
        return this.ServiceInstance;
    }

    /**
     * Set <p>应用实例信息</p>
     * @param ServiceInstance <p>应用实例信息</p>
     */
    public void setServiceInstance(String ServiceInstance) {
        this.ServiceInstance = ServiceInstance;
    }

    /**
     * Get <p>下游层级</p> 
     * @return DownLevel <p>下游层级</p>
     */
    public Long getDownLevel() {
        return this.DownLevel;
    }

    /**
     * Set <p>下游层级</p>
     * @param DownLevel <p>下游层级</p>
     */
    public void setDownLevel(Long DownLevel) {
        this.DownLevel = DownLevel;
    }

    /**
     * Get <p>视角</p> 
     * @return View <p>视角</p>
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set <p>视角</p>
     * @param View <p>视角</p>
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get <p>过滤器</p> 
     * @return Filters <p>过滤器</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤器</p>
     * @param Filters <p>过滤器</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>表示Topic（MQ拓扑图用）</p> 
     * @return Topic <p>表示Topic（MQ拓扑图用）</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>表示Topic（MQ拓扑图用）</p>
     * @param Topic <p>表示Topic（MQ拓扑图用）</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>视图筛选列表</p> 
     * @return Selectors <p>视图筛选列表</p>
     */
    public Selectors getSelectors() {
        return this.Selectors;
    }

    /**
     * Set <p>视图筛选列表</p>
     * @param Selectors <p>视图筛选列表</p>
     */
    public void setSelectors(Selectors Selectors) {
        this.Selectors = Selectors;
    }

    /**
     * Get <p>视图ID</p> 
     * @return Id <p>视图ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>视图ID</p>
     * @param Id <p>视图ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>TraceID</p> 
     * @return TraceID <p>TraceID</p>
     */
    public String getTraceID() {
        return this.TraceID;
    }

    /**
     * Set <p>TraceID</p>
     * @param TraceID <p>TraceID</p>
     */
    public void setTraceID(String TraceID) {
        this.TraceID = TraceID;
    }

    /**
     * Get <p>查询top5慢响应节点</p> 
     * @return IsSlowTopFive <p>查询top5慢响应节点</p>
     */
    public Boolean getIsSlowTopFive() {
        return this.IsSlowTopFive;
    }

    /**
     * Set <p>查询top5慢响应节点</p>
     * @param IsSlowTopFive <p>查询top5慢响应节点</p>
     */
    public void setIsSlowTopFive(Boolean IsSlowTopFive) {
        this.IsSlowTopFive = IsSlowTopFive;
    }

    /**
     * Get <p>是否获取资源层信息</p> 
     * @return GetResource <p>是否获取资源层信息</p>
     */
    public Boolean getGetResource() {
        return this.GetResource;
    }

    /**
     * Set <p>是否获取资源层信息</p>
     * @param GetResource <p>是否获取资源层信息</p>
     */
    public void setGetResource(Boolean GetResource) {
        this.GetResource = GetResource;
    }

    /**
     * Get <p>根据应用标签过滤</p> 
     * @return Tags <p>根据应用标签过滤</p>
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>根据应用标签过滤</p>
     * @param Tags <p>根据应用标签过滤</p>
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>不显示的节点类型</p> 
     * @return Hidden <p>不显示的节点类型</p>
     */
    public Selectors getHidden() {
        return this.Hidden;
    }

    /**
     * Set <p>不显示的节点类型</p>
     * @param Hidden <p>不显示的节点类型</p>
     */
    public void setHidden(Selectors Hidden) {
        this.Hidden = Hidden;
    }

    /**
     * Get <p>是否开启云资源关联</p> 
     * @return EnableResourceLink <p>是否开启云资源关联</p>
     */
    public Boolean getEnableResourceLink() {
        return this.EnableResourceLink;
    }

    /**
     * Set <p>是否开启云资源关联</p>
     * @param EnableResourceLink <p>是否开启云资源关联</p>
     */
    public void setEnableResourceLink(Boolean EnableResourceLink) {
        this.EnableResourceLink = EnableResourceLink;
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
        if (source.EnableResourceLink != null) {
            this.EnableResourceLink = new Boolean(source.EnableResourceLink);
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
        this.setParamSimple(map, prefix + "EnableResourceLink", this.EnableResourceLink);

    }
}

