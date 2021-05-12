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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmHistoriesRequest extends AbstractModel{

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 页数，从 1 开始计数，默认 1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页的数量，取值1~100，默认20
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 默认按首次出现时间倒序排列 "ASC"=正序 "DESC"=逆序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 起始时间，默认一天前的时间戳。对应 `FirstOccurTime` 告警首次出现时间，告警历史的 `FirstOccurTime` 晚于 `StartTime` 才可能被搜索到。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间，默认当前时间戳。对应 `FirstOccurTime` 告警首次出现时间，告警历史的 `FirstOccurTime` 早于 `EndTime` 才可能被搜索到。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 根据监控类型过滤 不选默认查所有类型 "MT_QCE"=云产品监控
    */
    @SerializedName("MonitorTypes")
    @Expose
    private String [] MonitorTypes;

    /**
    * 根据告警对象过滤 字符串模糊搜索
    */
    @SerializedName("AlarmObject")
    @Expose
    private String AlarmObject;

    /**
    * 根据告警状态过滤 ALARM=未恢复 OK=已恢复 NO_CONF=已失效 NO_DATA=数据不足，不选默认查所有
    */
    @SerializedName("AlarmStatus")
    @Expose
    private String [] AlarmStatus;

    /**
    * 根据项目ID过滤，-1=无项目 0=默认项目
可在此页面查询 [项目管理](https://console.cloud.tencent.com/project)
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 根据实例组ID过滤
    */
    @SerializedName("InstanceGroupIds")
    @Expose
    private Long [] InstanceGroupIds;

    /**
    * 根据策略类型过滤，策略类型是监控类型之下的概念，在这里两者都需要传入，例如 `[{"MonitorType": "MT_QCE", "Namespace": "cvm_device"}]`
可使用 [查询所有名字空间 DescribeAllNamespaces](https://cloud.tencent.com/document/product/248/48683) 接口查询
    */
    @SerializedName("Namespaces")
    @Expose
    private MonitorTypeNamespace [] Namespaces;

    /**
    * 根据指标名过滤
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * 根据策略名称模糊搜索
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 根据告警内容模糊搜索
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 根据接收人搜索，可以使用“访问管理”的 [拉取子用户 ListUsers](https://cloud.tencent.com/document/product/598/34587) 接口获取用户列表 或 [查询子用户 GetUser](https://cloud.tencent.com/document/product/598/34590) 接口查询子用户详情，此处填入返回结果中的 `Uid` 字段
    */
    @SerializedName("ReceiverUids")
    @Expose
    private Long [] ReceiverUids;

    /**
    * 根据接收组搜索，可以使用“访问管理”的 [查询用户组列表 ListGroups](https://cloud.tencent.com/document/product/598/34589) 接口获取用户组列表 或 [列出用户关联的用户组 ListGroupsForUser](https://cloud.tencent.com/document/product/598/34588) 查询某个子用户所在的用户组列表 ，此处填入返回结果中的 `GroupId ` 字段
    */
    @SerializedName("ReceiverGroups")
    @Expose
    private Long [] ReceiverGroups;

    /**
    * 根据告警策略 Id 列表搜索
    */
    @SerializedName("PolicyIds")
    @Expose
    private String [] PolicyIds;

    /**
     * Get 固定值，为"monitor" 
     * @return Module 固定值，为"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，为"monitor"
     * @param Module 固定值，为"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 页数，从 1 开始计数，默认 1 
     * @return PageNumber 页数，从 1 开始计数，默认 1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页数，从 1 开始计数，默认 1
     * @param PageNumber 页数，从 1 开始计数，默认 1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页的数量，取值1~100，默认20 
     * @return PageSize 每页的数量，取值1~100，默认20
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页的数量，取值1~100，默认20
     * @param PageSize 每页的数量，取值1~100，默认20
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 默认按首次出现时间倒序排列 "ASC"=正序 "DESC"=逆序 
     * @return Order 默认按首次出现时间倒序排列 "ASC"=正序 "DESC"=逆序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 默认按首次出现时间倒序排列 "ASC"=正序 "DESC"=逆序
     * @param Order 默认按首次出现时间倒序排列 "ASC"=正序 "DESC"=逆序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 起始时间，默认一天前的时间戳。对应 `FirstOccurTime` 告警首次出现时间，告警历史的 `FirstOccurTime` 晚于 `StartTime` 才可能被搜索到。 
     * @return StartTime 起始时间，默认一天前的时间戳。对应 `FirstOccurTime` 告警首次出现时间，告警历史的 `FirstOccurTime` 晚于 `StartTime` 才可能被搜索到。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，默认一天前的时间戳。对应 `FirstOccurTime` 告警首次出现时间，告警历史的 `FirstOccurTime` 晚于 `StartTime` 才可能被搜索到。
     * @param StartTime 起始时间，默认一天前的时间戳。对应 `FirstOccurTime` 告警首次出现时间，告警历史的 `FirstOccurTime` 晚于 `StartTime` 才可能被搜索到。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，默认当前时间戳。对应 `FirstOccurTime` 告警首次出现时间，告警历史的 `FirstOccurTime` 早于 `EndTime` 才可能被搜索到。 
     * @return EndTime 结束时间，默认当前时间戳。对应 `FirstOccurTime` 告警首次出现时间，告警历史的 `FirstOccurTime` 早于 `EndTime` 才可能被搜索到。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，默认当前时间戳。对应 `FirstOccurTime` 告警首次出现时间，告警历史的 `FirstOccurTime` 早于 `EndTime` 才可能被搜索到。
     * @param EndTime 结束时间，默认当前时间戳。对应 `FirstOccurTime` 告警首次出现时间，告警历史的 `FirstOccurTime` 早于 `EndTime` 才可能被搜索到。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 根据监控类型过滤 不选默认查所有类型 "MT_QCE"=云产品监控 
     * @return MonitorTypes 根据监控类型过滤 不选默认查所有类型 "MT_QCE"=云产品监控
     */
    public String [] getMonitorTypes() {
        return this.MonitorTypes;
    }

    /**
     * Set 根据监控类型过滤 不选默认查所有类型 "MT_QCE"=云产品监控
     * @param MonitorTypes 根据监控类型过滤 不选默认查所有类型 "MT_QCE"=云产品监控
     */
    public void setMonitorTypes(String [] MonitorTypes) {
        this.MonitorTypes = MonitorTypes;
    }

    /**
     * Get 根据告警对象过滤 字符串模糊搜索 
     * @return AlarmObject 根据告警对象过滤 字符串模糊搜索
     */
    public String getAlarmObject() {
        return this.AlarmObject;
    }

    /**
     * Set 根据告警对象过滤 字符串模糊搜索
     * @param AlarmObject 根据告警对象过滤 字符串模糊搜索
     */
    public void setAlarmObject(String AlarmObject) {
        this.AlarmObject = AlarmObject;
    }

    /**
     * Get 根据告警状态过滤 ALARM=未恢复 OK=已恢复 NO_CONF=已失效 NO_DATA=数据不足，不选默认查所有 
     * @return AlarmStatus 根据告警状态过滤 ALARM=未恢复 OK=已恢复 NO_CONF=已失效 NO_DATA=数据不足，不选默认查所有
     */
    public String [] getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set 根据告警状态过滤 ALARM=未恢复 OK=已恢复 NO_CONF=已失效 NO_DATA=数据不足，不选默认查所有
     * @param AlarmStatus 根据告警状态过滤 ALARM=未恢复 OK=已恢复 NO_CONF=已失效 NO_DATA=数据不足，不选默认查所有
     */
    public void setAlarmStatus(String [] AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }

    /**
     * Get 根据项目ID过滤，-1=无项目 0=默认项目
可在此页面查询 [项目管理](https://console.cloud.tencent.com/project) 
     * @return ProjectIds 根据项目ID过滤，-1=无项目 0=默认项目
可在此页面查询 [项目管理](https://console.cloud.tencent.com/project)
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 根据项目ID过滤，-1=无项目 0=默认项目
可在此页面查询 [项目管理](https://console.cloud.tencent.com/project)
     * @param ProjectIds 根据项目ID过滤，-1=无项目 0=默认项目
可在此页面查询 [项目管理](https://console.cloud.tencent.com/project)
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 根据实例组ID过滤 
     * @return InstanceGroupIds 根据实例组ID过滤
     */
    public Long [] getInstanceGroupIds() {
        return this.InstanceGroupIds;
    }

    /**
     * Set 根据实例组ID过滤
     * @param InstanceGroupIds 根据实例组ID过滤
     */
    public void setInstanceGroupIds(Long [] InstanceGroupIds) {
        this.InstanceGroupIds = InstanceGroupIds;
    }

    /**
     * Get 根据策略类型过滤，策略类型是监控类型之下的概念，在这里两者都需要传入，例如 `[{"MonitorType": "MT_QCE", "Namespace": "cvm_device"}]`
可使用 [查询所有名字空间 DescribeAllNamespaces](https://cloud.tencent.com/document/product/248/48683) 接口查询 
     * @return Namespaces 根据策略类型过滤，策略类型是监控类型之下的概念，在这里两者都需要传入，例如 `[{"MonitorType": "MT_QCE", "Namespace": "cvm_device"}]`
可使用 [查询所有名字空间 DescribeAllNamespaces](https://cloud.tencent.com/document/product/248/48683) 接口查询
     */
    public MonitorTypeNamespace [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set 根据策略类型过滤，策略类型是监控类型之下的概念，在这里两者都需要传入，例如 `[{"MonitorType": "MT_QCE", "Namespace": "cvm_device"}]`
可使用 [查询所有名字空间 DescribeAllNamespaces](https://cloud.tencent.com/document/product/248/48683) 接口查询
     * @param Namespaces 根据策略类型过滤，策略类型是监控类型之下的概念，在这里两者都需要传入，例如 `[{"MonitorType": "MT_QCE", "Namespace": "cvm_device"}]`
可使用 [查询所有名字空间 DescribeAllNamespaces](https://cloud.tencent.com/document/product/248/48683) 接口查询
     */
    public void setNamespaces(MonitorTypeNamespace [] Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get 根据指标名过滤 
     * @return MetricNames 根据指标名过滤
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set 根据指标名过滤
     * @param MetricNames 根据指标名过滤
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get 根据策略名称模糊搜索 
     * @return PolicyName 根据策略名称模糊搜索
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 根据策略名称模糊搜索
     * @param PolicyName 根据策略名称模糊搜索
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 根据告警内容模糊搜索 
     * @return Content 根据告警内容模糊搜索
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 根据告警内容模糊搜索
     * @param Content 根据告警内容模糊搜索
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 根据接收人搜索，可以使用“访问管理”的 [拉取子用户 ListUsers](https://cloud.tencent.com/document/product/598/34587) 接口获取用户列表 或 [查询子用户 GetUser](https://cloud.tencent.com/document/product/598/34590) 接口查询子用户详情，此处填入返回结果中的 `Uid` 字段 
     * @return ReceiverUids 根据接收人搜索，可以使用“访问管理”的 [拉取子用户 ListUsers](https://cloud.tencent.com/document/product/598/34587) 接口获取用户列表 或 [查询子用户 GetUser](https://cloud.tencent.com/document/product/598/34590) 接口查询子用户详情，此处填入返回结果中的 `Uid` 字段
     */
    public Long [] getReceiverUids() {
        return this.ReceiverUids;
    }

    /**
     * Set 根据接收人搜索，可以使用“访问管理”的 [拉取子用户 ListUsers](https://cloud.tencent.com/document/product/598/34587) 接口获取用户列表 或 [查询子用户 GetUser](https://cloud.tencent.com/document/product/598/34590) 接口查询子用户详情，此处填入返回结果中的 `Uid` 字段
     * @param ReceiverUids 根据接收人搜索，可以使用“访问管理”的 [拉取子用户 ListUsers](https://cloud.tencent.com/document/product/598/34587) 接口获取用户列表 或 [查询子用户 GetUser](https://cloud.tencent.com/document/product/598/34590) 接口查询子用户详情，此处填入返回结果中的 `Uid` 字段
     */
    public void setReceiverUids(Long [] ReceiverUids) {
        this.ReceiverUids = ReceiverUids;
    }

    /**
     * Get 根据接收组搜索，可以使用“访问管理”的 [查询用户组列表 ListGroups](https://cloud.tencent.com/document/product/598/34589) 接口获取用户组列表 或 [列出用户关联的用户组 ListGroupsForUser](https://cloud.tencent.com/document/product/598/34588) 查询某个子用户所在的用户组列表 ，此处填入返回结果中的 `GroupId ` 字段 
     * @return ReceiverGroups 根据接收组搜索，可以使用“访问管理”的 [查询用户组列表 ListGroups](https://cloud.tencent.com/document/product/598/34589) 接口获取用户组列表 或 [列出用户关联的用户组 ListGroupsForUser](https://cloud.tencent.com/document/product/598/34588) 查询某个子用户所在的用户组列表 ，此处填入返回结果中的 `GroupId ` 字段
     */
    public Long [] getReceiverGroups() {
        return this.ReceiverGroups;
    }

    /**
     * Set 根据接收组搜索，可以使用“访问管理”的 [查询用户组列表 ListGroups](https://cloud.tencent.com/document/product/598/34589) 接口获取用户组列表 或 [列出用户关联的用户组 ListGroupsForUser](https://cloud.tencent.com/document/product/598/34588) 查询某个子用户所在的用户组列表 ，此处填入返回结果中的 `GroupId ` 字段
     * @param ReceiverGroups 根据接收组搜索，可以使用“访问管理”的 [查询用户组列表 ListGroups](https://cloud.tencent.com/document/product/598/34589) 接口获取用户组列表 或 [列出用户关联的用户组 ListGroupsForUser](https://cloud.tencent.com/document/product/598/34588) 查询某个子用户所在的用户组列表 ，此处填入返回结果中的 `GroupId ` 字段
     */
    public void setReceiverGroups(Long [] ReceiverGroups) {
        this.ReceiverGroups = ReceiverGroups;
    }

    /**
     * Get 根据告警策略 Id 列表搜索 
     * @return PolicyIds 根据告警策略 Id 列表搜索
     */
    public String [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set 根据告警策略 Id 列表搜索
     * @param PolicyIds 根据告警策略 Id 列表搜索
     */
    public void setPolicyIds(String [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    public DescribeAlarmHistoriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmHistoriesRequest(DescribeAlarmHistoriesRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.MonitorTypes != null) {
            this.MonitorTypes = new String[source.MonitorTypes.length];
            for (int i = 0; i < source.MonitorTypes.length; i++) {
                this.MonitorTypes[i] = new String(source.MonitorTypes[i]);
            }
        }
        if (source.AlarmObject != null) {
            this.AlarmObject = new String(source.AlarmObject);
        }
        if (source.AlarmStatus != null) {
            this.AlarmStatus = new String[source.AlarmStatus.length];
            for (int i = 0; i < source.AlarmStatus.length; i++) {
                this.AlarmStatus[i] = new String(source.AlarmStatus[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.InstanceGroupIds != null) {
            this.InstanceGroupIds = new Long[source.InstanceGroupIds.length];
            for (int i = 0; i < source.InstanceGroupIds.length; i++) {
                this.InstanceGroupIds[i] = new Long(source.InstanceGroupIds[i]);
            }
        }
        if (source.Namespaces != null) {
            this.Namespaces = new MonitorTypeNamespace[source.Namespaces.length];
            for (int i = 0; i < source.Namespaces.length; i++) {
                this.Namespaces[i] = new MonitorTypeNamespace(source.Namespaces[i]);
            }
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ReceiverUids != null) {
            this.ReceiverUids = new Long[source.ReceiverUids.length];
            for (int i = 0; i < source.ReceiverUids.length; i++) {
                this.ReceiverUids[i] = new Long(source.ReceiverUids[i]);
            }
        }
        if (source.ReceiverGroups != null) {
            this.ReceiverGroups = new Long[source.ReceiverGroups.length];
            for (int i = 0; i < source.ReceiverGroups.length; i++) {
                this.ReceiverGroups[i] = new Long(source.ReceiverGroups[i]);
            }
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new String[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new String(source.PolicyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "MonitorTypes.", this.MonitorTypes);
        this.setParamSimple(map, prefix + "AlarmObject", this.AlarmObject);
        this.setParamArraySimple(map, prefix + "AlarmStatus.", this.AlarmStatus);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "InstanceGroupIds.", this.InstanceGroupIds);
        this.setParamArrayObj(map, prefix + "Namespaces.", this.Namespaces);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArraySimple(map, prefix + "ReceiverUids.", this.ReceiverUids);
        this.setParamArraySimple(map, prefix + "ReceiverGroups.", this.ReceiverGroups);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);

    }
}

