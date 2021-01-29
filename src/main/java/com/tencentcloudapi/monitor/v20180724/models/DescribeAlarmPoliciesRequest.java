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
    * 根据命名空间过滤
    */
    @SerializedName("Namespaces")
    @Expose
    private String [] Namespaces;

    /**
    * 告警对象列表
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * 根据接收人搜索
    */
    @SerializedName("ReceiverUids")
    @Expose
    private Long [] ReceiverUids;

    /**
    * 根据接收组搜索
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
    * 排序字段
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
    * 项目id数组
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 告警通知id列表
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
    * 启停，1：启用   0：停止
    */
    @SerializedName("Enable")
    @Expose
    private Long [] Enable;

    /**
    * 是否未配置通知规则，1：未配置，0：配置
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
     * Get 根据命名空间过滤 
     * @return Namespaces 根据命名空间过滤
     */
    public String [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set 根据命名空间过滤
     * @param Namespaces 根据命名空间过滤
     */
    public void setNamespaces(String [] Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get 告警对象列表 
     * @return Dimensions 告警对象列表
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 告警对象列表
     * @param Dimensions 告警对象列表
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 根据接收人搜索 
     * @return ReceiverUids 根据接收人搜索
     */
    public Long [] getReceiverUids() {
        return this.ReceiverUids;
    }

    /**
     * Set 根据接收人搜索
     * @param ReceiverUids 根据接收人搜索
     */
    public void setReceiverUids(Long [] ReceiverUids) {
        this.ReceiverUids = ReceiverUids;
    }

    /**
     * Get 根据接收组搜索 
     * @return ReceiverGroups 根据接收组搜索
     */
    public Long [] getReceiverGroups() {
        return this.ReceiverGroups;
    }

    /**
     * Set 根据接收组搜索
     * @param ReceiverGroups 根据接收组搜索
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
     * Get 排序字段 
     * @return Field 排序字段
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 排序字段
     * @param Field 排序字段
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
     * Get 项目id数组 
     * @return ProjectIds 项目id数组
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目id数组
     * @param ProjectIds 项目id数组
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 告警通知id列表 
     * @return NoticeIds 告警通知id列表
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set 告警通知id列表
     * @param NoticeIds 告警通知id列表
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
     * Get 启停，1：启用   0：停止 
     * @return Enable 启停，1：启用   0：停止
     */
    public Long [] getEnable() {
        return this.Enable;
    }

    /**
     * Set 启停，1：启用   0：停止
     * @param Enable 启停，1：启用   0：停止
     */
    public void setEnable(Long [] Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 是否未配置通知规则，1：未配置，0：配置 
     * @return NotBindingNoticeRule 是否未配置通知规则，1：未配置，0：配置
     */
    public Long getNotBindingNoticeRule() {
        return this.NotBindingNoticeRule;
    }

    /**
     * Set 是否未配置通知规则，1：未配置，0：配置
     * @param NotBindingNoticeRule 是否未配置通知规则，1：未配置，0：配置
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

