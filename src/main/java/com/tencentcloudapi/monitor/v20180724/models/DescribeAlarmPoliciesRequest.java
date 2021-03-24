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
    * 告警对象列表，外层数组，对应多个实例
内层数组，每个数组对应一个实例，里面的object对应的是这个实例的维度信息。格式为
[
	[{"name":"unInstanceId","value":"ins-qr888845g"}],
	[{"name":"unInstanceId","value":"ins-qr8d555g"}]
	...
]
不同云产品参数示例详见
[维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397)
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * 根据接收人的uid搜索，需要调用访问管理的api查询。详见
[拉取子用户](https://cloud.tencent.com/document/product/598/34587)
    */
    @SerializedName("ReceiverUids")
    @Expose
    private Long [] ReceiverUids;

    /**
    * 根据接收组的uid搜索，需要调用访问管理的api查询，详见
[查询用户组列表](https://cloud.tencent.com/document/product/598/34589)
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
[查询通知模板列表](https://cloud.tencent.com/document/product/248/51280)
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
     * Get 告警对象列表，外层数组，对应多个实例
内层数组，每个数组对应一个实例，里面的object对应的是这个实例的维度信息。格式为
[
	[{"name":"unInstanceId","value":"ins-qr888845g"}],
	[{"name":"unInstanceId","value":"ins-qr8d555g"}]
	...
]
不同云产品参数示例详见
[维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397) 
     * @return Dimensions 告警对象列表，外层数组，对应多个实例
内层数组，每个数组对应一个实例，里面的object对应的是这个实例的维度信息。格式为
[
	[{"name":"unInstanceId","value":"ins-qr888845g"}],
	[{"name":"unInstanceId","value":"ins-qr8d555g"}]
	...
]
不同云产品参数示例详见
[维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397)
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 告警对象列表，外层数组，对应多个实例
内层数组，每个数组对应一个实例，里面的object对应的是这个实例的维度信息。格式为
[
	[{"name":"unInstanceId","value":"ins-qr888845g"}],
	[{"name":"unInstanceId","value":"ins-qr8d555g"}]
	...
]
不同云产品参数示例详见
[维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397)
     * @param Dimensions 告警对象列表，外层数组，对应多个实例
内层数组，每个数组对应一个实例，里面的object对应的是这个实例的维度信息。格式为
[
	[{"name":"unInstanceId","value":"ins-qr888845g"}],
	[{"name":"unInstanceId","value":"ins-qr8d555g"}]
	...
]
不同云产品参数示例详见
[维度信息Dimensions列表](https://cloud.tencent.com/document/product/248/50397)
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 根据接收人的uid搜索，需要调用访问管理的api查询。详见
[拉取子用户](https://cloud.tencent.com/document/product/598/34587) 
     * @return ReceiverUids 根据接收人的uid搜索，需要调用访问管理的api查询。详见
[拉取子用户](https://cloud.tencent.com/document/product/598/34587)
     */
    public Long [] getReceiverUids() {
        return this.ReceiverUids;
    }

    /**
     * Set 根据接收人的uid搜索，需要调用访问管理的api查询。详见
[拉取子用户](https://cloud.tencent.com/document/product/598/34587)
     * @param ReceiverUids 根据接收人的uid搜索，需要调用访问管理的api查询。详见
[拉取子用户](https://cloud.tencent.com/document/product/598/34587)
     */
    public void setReceiverUids(Long [] ReceiverUids) {
        this.ReceiverUids = ReceiverUids;
    }

    /**
     * Get 根据接收组的uid搜索，需要调用访问管理的api查询，详见
[查询用户组列表](https://cloud.tencent.com/document/product/598/34589) 
     * @return ReceiverGroups 根据接收组的uid搜索，需要调用访问管理的api查询，详见
[查询用户组列表](https://cloud.tencent.com/document/product/598/34589)
     */
    public Long [] getReceiverGroups() {
        return this.ReceiverGroups;
    }

    /**
     * Set 根据接收组的uid搜索，需要调用访问管理的api查询，详见
[查询用户组列表](https://cloud.tencent.com/document/product/598/34589)
     * @param ReceiverGroups 根据接收组的uid搜索，需要调用访问管理的api查询，详见
[查询用户组列表](https://cloud.tencent.com/document/product/598/34589)
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
[查询通知模板列表](https://cloud.tencent.com/document/product/248/51280) 
     * @return NoticeIds 通知模版的id列表，可查询通知模版列表获取。
[查询通知模板列表](https://cloud.tencent.com/document/product/248/51280)
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set 通知模版的id列表，可查询通知模版列表获取。
[查询通知模板列表](https://cloud.tencent.com/document/product/248/51280)
     * @param NoticeIds 通知模版的id列表，可查询通知模版列表获取。
[查询通知模板列表](https://cloud.tencent.com/document/product/248/51280)
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

    }
}

