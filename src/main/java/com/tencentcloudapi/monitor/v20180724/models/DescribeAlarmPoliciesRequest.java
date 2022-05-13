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

public class DescribeAlarmPoliciesRequest extends AbstractModel{

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
    * 按策略名称模糊搜索
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 根据监控类型过滤 不选默认查所有类型 "MT_QCE"=云产品监控
    */
    @SerializedName("MonitorTypes")
    @Expose
    private String [] MonitorTypes;

    /**
    * 根据命名空间过滤，不同策略类型的值详见
[策略类型列表](https://cloud.tencent.com/document/product/248/50397)
    */
    @SerializedName("Namespaces")
    @Expose
    private String [] Namespaces;

    /**
    * 告警对象列表，JSON 字符串。外层数组，对应多个实例，内层为对象的维度。例如“云服务器-基础监控”可写为：
`[ {"Dimensions": {"unInstanceId": "ins-qr8d555g"}}, {"Dimensions": {"unInstanceId": "ins-qr8d555h"}} ]`
具体也可以参考下方的示例 2。

不同云产品参数示例详见 [维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397)

注意：如果NeedCorrespondence传入1，即需要返回策略与实例对应关系，请传入不多于20个告警对象维度，否则容易请求超时
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

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
    * 根据默认策略筛选 不传展示全部策略 DEFAULT=展示默认策略 NOT_DEFAULT=展示非默认策略
    */
    @SerializedName("PolicyType")
    @Expose
    private String [] PolicyType;

    /**
    * 排序字段，例如按照最后修改时间排序，Field: "UpdateTime"
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 排序顺序：升序：ASC  降序：DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 策略所属项目的id数组，可在此页面查看
[项目管理](https://console.cloud.tencent.com/project)
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 通知模版的id列表，可查询通知模版列表获取。
可使用 [查询通知模板列表](https://cloud.tencent.com/document/product/248/51280) 接口查询。
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * 根据触发条件筛选 不传展示全部策略 STATIC=展示静态阈值策略 DYNAMIC=展示动态阈值策略
    */
    @SerializedName("RuleTypes")
    @Expose
    private String [] RuleTypes;

    /**
    * 告警启停筛选，[1]：启用   [0]：停止，全部[0, 1]
    */
    @SerializedName("Enable")
    @Expose
    private Long [] Enable;

    /**
    * 传 1 查询未配置通知规则的告警策略；不传或传其他数值，查询所有策略。
    */
    @SerializedName("NotBindingNoticeRule")
    @Expose
    private Long NotBindingNoticeRule;

    /**
    * 实例分组id
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * 是否需要策略与入参过滤维度参数的对应关系，1：是  0：否，默认为0
    */
    @SerializedName("NeedCorrespondence")
    @Expose
    private Long NeedCorrespondence;

    /**
    * 按照触发任务（例如弹性伸缩）过滤策略。最多10个
    */
    @SerializedName("TriggerTasks")
    @Expose
    private AlarmPolicyTriggerTask [] TriggerTasks;

    /**
    * 根据一键告警策略筛选 不传展示全部策略 ONECLICK=展示一键告警策略 NOT_ONECLICK=展示非一键告警策略
    */
    @SerializedName("OneClickPolicyType")
    @Expose
    private String [] OneClickPolicyType;

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
     * Get 按策略名称模糊搜索 
     * @return PolicyName 按策略名称模糊搜索
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 按策略名称模糊搜索
     * @param PolicyName 按策略名称模糊搜索
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
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
     * Get 根据命名空间过滤，不同策略类型的值详见
[策略类型列表](https://cloud.tencent.com/document/product/248/50397) 
     * @return Namespaces 根据命名空间过滤，不同策略类型的值详见
[策略类型列表](https://cloud.tencent.com/document/product/248/50397)
     */
    public String [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set 根据命名空间过滤，不同策略类型的值详见
[策略类型列表](https://cloud.tencent.com/document/product/248/50397)
     * @param Namespaces 根据命名空间过滤，不同策略类型的值详见
[策略类型列表](https://cloud.tencent.com/document/product/248/50397)
     */
    public void setNamespaces(String [] Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get 告警对象列表，JSON 字符串。外层数组，对应多个实例，内层为对象的维度。例如“云服务器-基础监控”可写为：
`[ {"Dimensions": {"unInstanceId": "ins-qr8d555g"}}, {"Dimensions": {"unInstanceId": "ins-qr8d555h"}} ]`
具体也可以参考下方的示例 2。

不同云产品参数示例详见 [维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397)

注意：如果NeedCorrespondence传入1，即需要返回策略与实例对应关系，请传入不多于20个告警对象维度，否则容易请求超时 
     * @return Dimensions 告警对象列表，JSON 字符串。外层数组，对应多个实例，内层为对象的维度。例如“云服务器-基础监控”可写为：
`[ {"Dimensions": {"unInstanceId": "ins-qr8d555g"}}, {"Dimensions": {"unInstanceId": "ins-qr8d555h"}} ]`
具体也可以参考下方的示例 2。

不同云产品参数示例详见 [维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397)

注意：如果NeedCorrespondence传入1，即需要返回策略与实例对应关系，请传入不多于20个告警对象维度，否则容易请求超时
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 告警对象列表，JSON 字符串。外层数组，对应多个实例，内层为对象的维度。例如“云服务器-基础监控”可写为：
`[ {"Dimensions": {"unInstanceId": "ins-qr8d555g"}}, {"Dimensions": {"unInstanceId": "ins-qr8d555h"}} ]`
具体也可以参考下方的示例 2。

不同云产品参数示例详见 [维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397)

注意：如果NeedCorrespondence传入1，即需要返回策略与实例对应关系，请传入不多于20个告警对象维度，否则容易请求超时
     * @param Dimensions 告警对象列表，JSON 字符串。外层数组，对应多个实例，内层为对象的维度。例如“云服务器-基础监控”可写为：
`[ {"Dimensions": {"unInstanceId": "ins-qr8d555g"}}, {"Dimensions": {"unInstanceId": "ins-qr8d555h"}} ]`
具体也可以参考下方的示例 2。

不同云产品参数示例详见 [维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397)

注意：如果NeedCorrespondence传入1，即需要返回策略与实例对应关系，请传入不多于20个告警对象维度，否则容易请求超时
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
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
     * Get 根据默认策略筛选 不传展示全部策略 DEFAULT=展示默认策略 NOT_DEFAULT=展示非默认策略 
     * @return PolicyType 根据默认策略筛选 不传展示全部策略 DEFAULT=展示默认策略 NOT_DEFAULT=展示非默认策略
     */
    public String [] getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 根据默认策略筛选 不传展示全部策略 DEFAULT=展示默认策略 NOT_DEFAULT=展示非默认策略
     * @param PolicyType 根据默认策略筛选 不传展示全部策略 DEFAULT=展示默认策略 NOT_DEFAULT=展示非默认策略
     */
    public void setPolicyType(String [] PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 排序字段，例如按照最后修改时间排序，Field: "UpdateTime" 
     * @return Field 排序字段，例如按照最后修改时间排序，Field: "UpdateTime"
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 排序字段，例如按照最后修改时间排序，Field: "UpdateTime"
     * @param Field 排序字段，例如按照最后修改时间排序，Field: "UpdateTime"
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 排序顺序：升序：ASC  降序：DESC 
     * @return Order 排序顺序：升序：ASC  降序：DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序顺序：升序：ASC  降序：DESC
     * @param Order 排序顺序：升序：ASC  降序：DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 策略所属项目的id数组，可在此页面查看
[项目管理](https://console.cloud.tencent.com/project) 
     * @return ProjectIds 策略所属项目的id数组，可在此页面查看
[项目管理](https://console.cloud.tencent.com/project)
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 策略所属项目的id数组，可在此页面查看
[项目管理](https://console.cloud.tencent.com/project)
     * @param ProjectIds 策略所属项目的id数组，可在此页面查看
[项目管理](https://console.cloud.tencent.com/project)
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 通知模版的id列表，可查询通知模版列表获取。
可使用 [查询通知模板列表](https://cloud.tencent.com/document/product/248/51280) 接口查询。 
     * @return NoticeIds 通知模版的id列表，可查询通知模版列表获取。
可使用 [查询通知模板列表](https://cloud.tencent.com/document/product/248/51280) 接口查询。
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set 通知模版的id列表，可查询通知模版列表获取。
可使用 [查询通知模板列表](https://cloud.tencent.com/document/product/248/51280) 接口查询。
     * @param NoticeIds 通知模版的id列表，可查询通知模版列表获取。
可使用 [查询通知模板列表](https://cloud.tencent.com/document/product/248/51280) 接口查询。
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get 根据触发条件筛选 不传展示全部策略 STATIC=展示静态阈值策略 DYNAMIC=展示动态阈值策略 
     * @return RuleTypes 根据触发条件筛选 不传展示全部策略 STATIC=展示静态阈值策略 DYNAMIC=展示动态阈值策略
     */
    public String [] getRuleTypes() {
        return this.RuleTypes;
    }

    /**
     * Set 根据触发条件筛选 不传展示全部策略 STATIC=展示静态阈值策略 DYNAMIC=展示动态阈值策略
     * @param RuleTypes 根据触发条件筛选 不传展示全部策略 STATIC=展示静态阈值策略 DYNAMIC=展示动态阈值策略
     */
    public void setRuleTypes(String [] RuleTypes) {
        this.RuleTypes = RuleTypes;
    }

    /**
     * Get 告警启停筛选，[1]：启用   [0]：停止，全部[0, 1] 
     * @return Enable 告警启停筛选，[1]：启用   [0]：停止，全部[0, 1]
     */
    public Long [] getEnable() {
        return this.Enable;
    }

    /**
     * Set 告警启停筛选，[1]：启用   [0]：停止，全部[0, 1]
     * @param Enable 告警启停筛选，[1]：启用   [0]：停止，全部[0, 1]
     */
    public void setEnable(Long [] Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 传 1 查询未配置通知规则的告警策略；不传或传其他数值，查询所有策略。 
     * @return NotBindingNoticeRule 传 1 查询未配置通知规则的告警策略；不传或传其他数值，查询所有策略。
     */
    public Long getNotBindingNoticeRule() {
        return this.NotBindingNoticeRule;
    }

    /**
     * Set 传 1 查询未配置通知规则的告警策略；不传或传其他数值，查询所有策略。
     * @param NotBindingNoticeRule 传 1 查询未配置通知规则的告警策略；不传或传其他数值，查询所有策略。
     */
    public void setNotBindingNoticeRule(Long NotBindingNoticeRule) {
        this.NotBindingNoticeRule = NotBindingNoticeRule;
    }

    /**
     * Get 实例分组id 
     * @return InstanceGroupId 实例分组id
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 实例分组id
     * @param InstanceGroupId 实例分组id
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get 是否需要策略与入参过滤维度参数的对应关系，1：是  0：否，默认为0 
     * @return NeedCorrespondence 是否需要策略与入参过滤维度参数的对应关系，1：是  0：否，默认为0
     */
    public Long getNeedCorrespondence() {
        return this.NeedCorrespondence;
    }

    /**
     * Set 是否需要策略与入参过滤维度参数的对应关系，1：是  0：否，默认为0
     * @param NeedCorrespondence 是否需要策略与入参过滤维度参数的对应关系，1：是  0：否，默认为0
     */
    public void setNeedCorrespondence(Long NeedCorrespondence) {
        this.NeedCorrespondence = NeedCorrespondence;
    }

    /**
     * Get 按照触发任务（例如弹性伸缩）过滤策略。最多10个 
     * @return TriggerTasks 按照触发任务（例如弹性伸缩）过滤策略。最多10个
     */
    public AlarmPolicyTriggerTask [] getTriggerTasks() {
        return this.TriggerTasks;
    }

    /**
     * Set 按照触发任务（例如弹性伸缩）过滤策略。最多10个
     * @param TriggerTasks 按照触发任务（例如弹性伸缩）过滤策略。最多10个
     */
    public void setTriggerTasks(AlarmPolicyTriggerTask [] TriggerTasks) {
        this.TriggerTasks = TriggerTasks;
    }

    /**
     * Get 根据一键告警策略筛选 不传展示全部策略 ONECLICK=展示一键告警策略 NOT_ONECLICK=展示非一键告警策略 
     * @return OneClickPolicyType 根据一键告警策略筛选 不传展示全部策略 ONECLICK=展示一键告警策略 NOT_ONECLICK=展示非一键告警策略
     */
    public String [] getOneClickPolicyType() {
        return this.OneClickPolicyType;
    }

    /**
     * Set 根据一键告警策略筛选 不传展示全部策略 ONECLICK=展示一键告警策略 NOT_ONECLICK=展示非一键告警策略
     * @param OneClickPolicyType 根据一键告警策略筛选 不传展示全部策略 ONECLICK=展示一键告警策略 NOT_ONECLICK=展示非一键告警策略
     */
    public void setOneClickPolicyType(String [] OneClickPolicyType) {
        this.OneClickPolicyType = OneClickPolicyType;
    }

    public DescribeAlarmPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmPoliciesRequest(DescribeAlarmPoliciesRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.MonitorTypes != null) {
            this.MonitorTypes = new String[source.MonitorTypes.length];
            for (int i = 0; i < source.MonitorTypes.length; i++) {
                this.MonitorTypes[i] = new String(source.MonitorTypes[i]);
            }
        }
        if (source.Namespaces != null) {
            this.Namespaces = new String[source.Namespaces.length];
            for (int i = 0; i < source.Namespaces.length; i++) {
                this.Namespaces[i] = new String(source.Namespaces[i]);
            }
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String(source.Dimensions);
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
        if (source.PolicyType != null) {
            this.PolicyType = new String[source.PolicyType.length];
            for (int i = 0; i < source.PolicyType.length; i++) {
                this.PolicyType[i] = new String(source.PolicyType[i]);
            }
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.NoticeIds != null) {
            this.NoticeIds = new String[source.NoticeIds.length];
            for (int i = 0; i < source.NoticeIds.length; i++) {
                this.NoticeIds[i] = new String(source.NoticeIds[i]);
            }
        }
        if (source.RuleTypes != null) {
            this.RuleTypes = new String[source.RuleTypes.length];
            for (int i = 0; i < source.RuleTypes.length; i++) {
                this.RuleTypes[i] = new String(source.RuleTypes[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Long[source.Enable.length];
            for (int i = 0; i < source.Enable.length; i++) {
                this.Enable[i] = new Long(source.Enable[i]);
            }
        }
        if (source.NotBindingNoticeRule != null) {
            this.NotBindingNoticeRule = new Long(source.NotBindingNoticeRule);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
        if (source.NeedCorrespondence != null) {
            this.NeedCorrespondence = new Long(source.NeedCorrespondence);
        }
        if (source.TriggerTasks != null) {
            this.TriggerTasks = new AlarmPolicyTriggerTask[source.TriggerTasks.length];
            for (int i = 0; i < source.TriggerTasks.length; i++) {
                this.TriggerTasks[i] = new AlarmPolicyTriggerTask(source.TriggerTasks[i]);
            }
        }
        if (source.OneClickPolicyType != null) {
            this.OneClickPolicyType = new String[source.OneClickPolicyType.length];
            for (int i = 0; i < source.OneClickPolicyType.length; i++) {
                this.OneClickPolicyType[i] = new String(source.OneClickPolicyType[i]);
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
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamArraySimple(map, prefix + "MonitorTypes.", this.MonitorTypes);
        this.setParamArraySimple(map, prefix + "Namespaces.", this.Namespaces);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamArraySimple(map, prefix + "ReceiverUids.", this.ReceiverUids);
        this.setParamArraySimple(map, prefix + "ReceiverGroups.", this.ReceiverGroups);
        this.setParamArraySimple(map, prefix + "PolicyType.", this.PolicyType);
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "NoticeIds.", this.NoticeIds);
        this.setParamArraySimple(map, prefix + "RuleTypes.", this.RuleTypes);
        this.setParamArraySimple(map, prefix + "Enable.", this.Enable);
        this.setParamSimple(map, prefix + "NotBindingNoticeRule", this.NotBindingNoticeRule);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "NeedCorrespondence", this.NeedCorrespondence);
        this.setParamArrayObj(map, prefix + "TriggerTasks.", this.TriggerTasks);
        this.setParamArraySimple(map, prefix + "OneClickPolicyType.", this.OneClickPolicyType);

    }
}

