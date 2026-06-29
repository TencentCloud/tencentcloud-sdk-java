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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmPoliciesRequest extends AbstractModel {

    /**
    * <p>固定值，为&quot;monitor&quot;</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>页数，从 1 开始计数，默认 1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页的数量，取值1~100，默认20</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>按策略名称模糊搜索</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>根据监控类型过滤 不选默认查所有类型 &quot;MT_QCE&quot;=云产品监控,当Dimension不为空时，该项为必填项</p>
    */
    @SerializedName("MonitorTypes")
    @Expose
    private String [] MonitorTypes;

    /**
    * <p>根据命名空间过滤，不同策略类型的值详见<br><a href="https://cloud.tencent.com/document/product/248/50397">策略类型列表</a>当Dimension不为空时，该项为必填项</p>
    */
    @SerializedName("Namespaces")
    @Expose
    private String [] Namespaces;

    /**
    * <p>告警对象列表，JSON 字符串。外层数组，对应多个实例，内层为对象的维度。例如“云服务器-基础监控”可写为：<code>[[{&quot;name&quot;:&quot;unInstanceId&quot;,&quot;value&quot;:&quot;ins-qr888845g&quot;}]]</code>具体也可以参考下方的示例 2。不同云产品参数示例详见 <a href="https://cloud.tencent.com/document/product/248/50397">维度信息Dimensions列表</a>注意：如果NeedCorrespondence传入1，即需要返回策略与实例对应关系，请传入不多于20个告警对象维度，否则容易请求超时</p>
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * <p>根据接收人搜索，可以使用“访问管理”的 <a href="https://cloud.tencent.com/document/product/598/34587">拉取子用户 ListUsers</a> 接口获取用户列表 或 <a href="https://cloud.tencent.com/document/product/598/34590">查询子用户 GetUser</a> 接口查询子用户详情，此处填入返回结果中的 <code>Uid</code> 字段</p>
    */
    @SerializedName("ReceiverUids")
    @Expose
    private Long [] ReceiverUids;

    /**
    * <p>根据接收组搜索，可以使用“访问管理”的 <a href="https://cloud.tencent.com/document/product/598/34589">查询用户组列表 ListGroups</a> 接口获取用户组列表 或 <a href="https://cloud.tencent.com/document/product/598/34588">列出用户关联的用户组 ListGroupsForUser</a> 查询某个子用户所在的用户组列表 ，此处填入返回结果中的 <code>GroupId</code> 字段</p>
    */
    @SerializedName("ReceiverGroups")
    @Expose
    private Long [] ReceiverGroups;

    /**
    * <p>根据默认策略筛选 不传展示全部策略 DEFAULT=展示默认策略 NOT_DEFAULT=展示非默认策略</p>
    */
    @SerializedName("PolicyType")
    @Expose
    private String [] PolicyType;

    /**
    * <p>排序字段，例如按照最后修改时间排序，Field: &quot;UpdateTime&quot;</p>
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * <p>排序顺序：升序：ASC  降序：DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>策略所属项目的id数组，可在此页面查看<br><a href="https://console.cloud.tencent.com/project">项目管理</a></p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * <p>通知模板的id列表，可查询通知模板列表获取。<br>可使用 <a href="https://cloud.tencent.com/document/product/248/51280">查询通知模板列表</a> 接口查询。</p>
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * <p>根据触发条件筛选 不传展示全部策略 STATIC=展示静态阈值策略 DYNAMIC=展示动态阈值策略</p>
    */
    @SerializedName("RuleTypes")
    @Expose
    private String [] RuleTypes;

    /**
    * <p>告警启停筛选，[1]：启用   [0]：停止，全部[0, 1]</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long [] Enable;

    /**
    * <p>传 1 查询未配置通知规则的告警策略；不传或传其他数值，查询所有策略。</p>
    */
    @SerializedName("NotBindingNoticeRule")
    @Expose
    private Long NotBindingNoticeRule;

    /**
    * <p>实例分组id</p>
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * <p>是否需要策略与入参过滤维度参数的对应关系，1：是  0：否，默认为0</p>
    */
    @SerializedName("NeedCorrespondence")
    @Expose
    private Long NeedCorrespondence;

    /**
    * <p>按照触发任务（例如弹性伸缩）过滤策略。最多10个</p>
    */
    @SerializedName("TriggerTasks")
    @Expose
    private AlarmPolicyTriggerTask [] TriggerTasks;

    /**
    * <p>根据一键告警策略筛选 不传展示全部策略 ONECLICK=展示一键告警策略 NOT_ONECLICK=展示非一键告警策略</p>
    */
    @SerializedName("OneClickPolicyType")
    @Expose
    private String [] OneClickPolicyType;

    /**
    * <p>返回结果过滤掉绑定全部对象的策略，1代表需要过滤，0则无需过滤</p>
    */
    @SerializedName("NotBindAll")
    @Expose
    private Long NotBindAll;

    /**
    * <p>返回结果过滤掉关联实例为实例分组的策略，1代表需要过滤，0则无需过滤</p>
    */
    @SerializedName("NotInstanceGroup")
    @Expose
    private Long NotInstanceGroup;

    /**
    * <p>策略根据标签过滤</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>prom实例id，自定义指标策略时会用到</p>
    */
    @SerializedName("PromInsId")
    @Expose
    private String PromInsId;

    /**
    * <p>根据排班表搜索</p>
    */
    @SerializedName("ReceiverOnCallFormIDs")
    @Expose
    private String [] ReceiverOnCallFormIDs;

    /**
    * <p>通知内容模板ID筛选</p>
    */
    @SerializedName("NoticeContentTmplIDs")
    @Expose
    private String [] NoticeContentTmplIDs;

    /**
    * <p>是否为预设策略，1是，0否</p>
    */
    @SerializedName("IsPredefined")
    @Expose
    private Long IsPredefined;

    /**
     * Get <p>固定值，为&quot;monitor&quot;</p> 
     * @return Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>固定值，为&quot;monitor&quot;</p>
     * @param Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>页数，从 1 开始计数，默认 1</p> 
     * @return PageNumber <p>页数，从 1 开始计数，默认 1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页数，从 1 开始计数，默认 1</p>
     * @param PageNumber <p>页数，从 1 开始计数，默认 1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页的数量，取值1~100，默认20</p> 
     * @return PageSize <p>每页的数量，取值1~100，默认20</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页的数量，取值1~100，默认20</p>
     * @param PageSize <p>每页的数量，取值1~100，默认20</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>按策略名称模糊搜索</p> 
     * @return PolicyName <p>按策略名称模糊搜索</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>按策略名称模糊搜索</p>
     * @param PolicyName <p>按策略名称模糊搜索</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>根据监控类型过滤 不选默认查所有类型 &quot;MT_QCE&quot;=云产品监控,当Dimension不为空时，该项为必填项</p> 
     * @return MonitorTypes <p>根据监控类型过滤 不选默认查所有类型 &quot;MT_QCE&quot;=云产品监控,当Dimension不为空时，该项为必填项</p>
     */
    public String [] getMonitorTypes() {
        return this.MonitorTypes;
    }

    /**
     * Set <p>根据监控类型过滤 不选默认查所有类型 &quot;MT_QCE&quot;=云产品监控,当Dimension不为空时，该项为必填项</p>
     * @param MonitorTypes <p>根据监控类型过滤 不选默认查所有类型 &quot;MT_QCE&quot;=云产品监控,当Dimension不为空时，该项为必填项</p>
     */
    public void setMonitorTypes(String [] MonitorTypes) {
        this.MonitorTypes = MonitorTypes;
    }

    /**
     * Get <p>根据命名空间过滤，不同策略类型的值详见<br><a href="https://cloud.tencent.com/document/product/248/50397">策略类型列表</a>当Dimension不为空时，该项为必填项</p> 
     * @return Namespaces <p>根据命名空间过滤，不同策略类型的值详见<br><a href="https://cloud.tencent.com/document/product/248/50397">策略类型列表</a>当Dimension不为空时，该项为必填项</p>
     */
    public String [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set <p>根据命名空间过滤，不同策略类型的值详见<br><a href="https://cloud.tencent.com/document/product/248/50397">策略类型列表</a>当Dimension不为空时，该项为必填项</p>
     * @param Namespaces <p>根据命名空间过滤，不同策略类型的值详见<br><a href="https://cloud.tencent.com/document/product/248/50397">策略类型列表</a>当Dimension不为空时，该项为必填项</p>
     */
    public void setNamespaces(String [] Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get <p>告警对象列表，JSON 字符串。外层数组，对应多个实例，内层为对象的维度。例如“云服务器-基础监控”可写为：<code>[[{&quot;name&quot;:&quot;unInstanceId&quot;,&quot;value&quot;:&quot;ins-qr888845g&quot;}]]</code>具体也可以参考下方的示例 2。不同云产品参数示例详见 <a href="https://cloud.tencent.com/document/product/248/50397">维度信息Dimensions列表</a>注意：如果NeedCorrespondence传入1，即需要返回策略与实例对应关系，请传入不多于20个告警对象维度，否则容易请求超时</p> 
     * @return Dimensions <p>告警对象列表，JSON 字符串。外层数组，对应多个实例，内层为对象的维度。例如“云服务器-基础监控”可写为：<code>[[{&quot;name&quot;:&quot;unInstanceId&quot;,&quot;value&quot;:&quot;ins-qr888845g&quot;}]]</code>具体也可以参考下方的示例 2。不同云产品参数示例详见 <a href="https://cloud.tencent.com/document/product/248/50397">维度信息Dimensions列表</a>注意：如果NeedCorrespondence传入1，即需要返回策略与实例对应关系，请传入不多于20个告警对象维度，否则容易请求超时</p>
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set <p>告警对象列表，JSON 字符串。外层数组，对应多个实例，内层为对象的维度。例如“云服务器-基础监控”可写为：<code>[[{&quot;name&quot;:&quot;unInstanceId&quot;,&quot;value&quot;:&quot;ins-qr888845g&quot;}]]</code>具体也可以参考下方的示例 2。不同云产品参数示例详见 <a href="https://cloud.tencent.com/document/product/248/50397">维度信息Dimensions列表</a>注意：如果NeedCorrespondence传入1，即需要返回策略与实例对应关系，请传入不多于20个告警对象维度，否则容易请求超时</p>
     * @param Dimensions <p>告警对象列表，JSON 字符串。外层数组，对应多个实例，内层为对象的维度。例如“云服务器-基础监控”可写为：<code>[[{&quot;name&quot;:&quot;unInstanceId&quot;,&quot;value&quot;:&quot;ins-qr888845g&quot;}]]</code>具体也可以参考下方的示例 2。不同云产品参数示例详见 <a href="https://cloud.tencent.com/document/product/248/50397">维度信息Dimensions列表</a>注意：如果NeedCorrespondence传入1，即需要返回策略与实例对应关系，请传入不多于20个告警对象维度，否则容易请求超时</p>
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get <p>根据接收人搜索，可以使用“访问管理”的 <a href="https://cloud.tencent.com/document/product/598/34587">拉取子用户 ListUsers</a> 接口获取用户列表 或 <a href="https://cloud.tencent.com/document/product/598/34590">查询子用户 GetUser</a> 接口查询子用户详情，此处填入返回结果中的 <code>Uid</code> 字段</p> 
     * @return ReceiverUids <p>根据接收人搜索，可以使用“访问管理”的 <a href="https://cloud.tencent.com/document/product/598/34587">拉取子用户 ListUsers</a> 接口获取用户列表 或 <a href="https://cloud.tencent.com/document/product/598/34590">查询子用户 GetUser</a> 接口查询子用户详情，此处填入返回结果中的 <code>Uid</code> 字段</p>
     */
    public Long [] getReceiverUids() {
        return this.ReceiverUids;
    }

    /**
     * Set <p>根据接收人搜索，可以使用“访问管理”的 <a href="https://cloud.tencent.com/document/product/598/34587">拉取子用户 ListUsers</a> 接口获取用户列表 或 <a href="https://cloud.tencent.com/document/product/598/34590">查询子用户 GetUser</a> 接口查询子用户详情，此处填入返回结果中的 <code>Uid</code> 字段</p>
     * @param ReceiverUids <p>根据接收人搜索，可以使用“访问管理”的 <a href="https://cloud.tencent.com/document/product/598/34587">拉取子用户 ListUsers</a> 接口获取用户列表 或 <a href="https://cloud.tencent.com/document/product/598/34590">查询子用户 GetUser</a> 接口查询子用户详情，此处填入返回结果中的 <code>Uid</code> 字段</p>
     */
    public void setReceiverUids(Long [] ReceiverUids) {
        this.ReceiverUids = ReceiverUids;
    }

    /**
     * Get <p>根据接收组搜索，可以使用“访问管理”的 <a href="https://cloud.tencent.com/document/product/598/34589">查询用户组列表 ListGroups</a> 接口获取用户组列表 或 <a href="https://cloud.tencent.com/document/product/598/34588">列出用户关联的用户组 ListGroupsForUser</a> 查询某个子用户所在的用户组列表 ，此处填入返回结果中的 <code>GroupId</code> 字段</p> 
     * @return ReceiverGroups <p>根据接收组搜索，可以使用“访问管理”的 <a href="https://cloud.tencent.com/document/product/598/34589">查询用户组列表 ListGroups</a> 接口获取用户组列表 或 <a href="https://cloud.tencent.com/document/product/598/34588">列出用户关联的用户组 ListGroupsForUser</a> 查询某个子用户所在的用户组列表 ，此处填入返回结果中的 <code>GroupId</code> 字段</p>
     */
    public Long [] getReceiverGroups() {
        return this.ReceiverGroups;
    }

    /**
     * Set <p>根据接收组搜索，可以使用“访问管理”的 <a href="https://cloud.tencent.com/document/product/598/34589">查询用户组列表 ListGroups</a> 接口获取用户组列表 或 <a href="https://cloud.tencent.com/document/product/598/34588">列出用户关联的用户组 ListGroupsForUser</a> 查询某个子用户所在的用户组列表 ，此处填入返回结果中的 <code>GroupId</code> 字段</p>
     * @param ReceiverGroups <p>根据接收组搜索，可以使用“访问管理”的 <a href="https://cloud.tencent.com/document/product/598/34589">查询用户组列表 ListGroups</a> 接口获取用户组列表 或 <a href="https://cloud.tencent.com/document/product/598/34588">列出用户关联的用户组 ListGroupsForUser</a> 查询某个子用户所在的用户组列表 ，此处填入返回结果中的 <code>GroupId</code> 字段</p>
     */
    public void setReceiverGroups(Long [] ReceiverGroups) {
        this.ReceiverGroups = ReceiverGroups;
    }

    /**
     * Get <p>根据默认策略筛选 不传展示全部策略 DEFAULT=展示默认策略 NOT_DEFAULT=展示非默认策略</p> 
     * @return PolicyType <p>根据默认策略筛选 不传展示全部策略 DEFAULT=展示默认策略 NOT_DEFAULT=展示非默认策略</p>
     */
    public String [] getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>根据默认策略筛选 不传展示全部策略 DEFAULT=展示默认策略 NOT_DEFAULT=展示非默认策略</p>
     * @param PolicyType <p>根据默认策略筛选 不传展示全部策略 DEFAULT=展示默认策略 NOT_DEFAULT=展示非默认策略</p>
     */
    public void setPolicyType(String [] PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get <p>排序字段，例如按照最后修改时间排序，Field: &quot;UpdateTime&quot;</p> 
     * @return Field <p>排序字段，例如按照最后修改时间排序，Field: &quot;UpdateTime&quot;</p>
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set <p>排序字段，例如按照最后修改时间排序，Field: &quot;UpdateTime&quot;</p>
     * @param Field <p>排序字段，例如按照最后修改时间排序，Field: &quot;UpdateTime&quot;</p>
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get <p>排序顺序：升序：ASC  降序：DESC</p> 
     * @return Order <p>排序顺序：升序：ASC  降序：DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序顺序：升序：ASC  降序：DESC</p>
     * @param Order <p>排序顺序：升序：ASC  降序：DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>策略所属项目的id数组，可在此页面查看<br><a href="https://console.cloud.tencent.com/project">项目管理</a></p> 
     * @return ProjectIds <p>策略所属项目的id数组，可在此页面查看<br><a href="https://console.cloud.tencent.com/project">项目管理</a></p>
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>策略所属项目的id数组，可在此页面查看<br><a href="https://console.cloud.tencent.com/project">项目管理</a></p>
     * @param ProjectIds <p>策略所属项目的id数组，可在此页面查看<br><a href="https://console.cloud.tencent.com/project">项目管理</a></p>
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>通知模板的id列表，可查询通知模板列表获取。<br>可使用 <a href="https://cloud.tencent.com/document/product/248/51280">查询通知模板列表</a> 接口查询。</p> 
     * @return NoticeIds <p>通知模板的id列表，可查询通知模板列表获取。<br>可使用 <a href="https://cloud.tencent.com/document/product/248/51280">查询通知模板列表</a> 接口查询。</p>
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set <p>通知模板的id列表，可查询通知模板列表获取。<br>可使用 <a href="https://cloud.tencent.com/document/product/248/51280">查询通知模板列表</a> 接口查询。</p>
     * @param NoticeIds <p>通知模板的id列表，可查询通知模板列表获取。<br>可使用 <a href="https://cloud.tencent.com/document/product/248/51280">查询通知模板列表</a> 接口查询。</p>
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get <p>根据触发条件筛选 不传展示全部策略 STATIC=展示静态阈值策略 DYNAMIC=展示动态阈值策略</p> 
     * @return RuleTypes <p>根据触发条件筛选 不传展示全部策略 STATIC=展示静态阈值策略 DYNAMIC=展示动态阈值策略</p>
     */
    public String [] getRuleTypes() {
        return this.RuleTypes;
    }

    /**
     * Set <p>根据触发条件筛选 不传展示全部策略 STATIC=展示静态阈值策略 DYNAMIC=展示动态阈值策略</p>
     * @param RuleTypes <p>根据触发条件筛选 不传展示全部策略 STATIC=展示静态阈值策略 DYNAMIC=展示动态阈值策略</p>
     */
    public void setRuleTypes(String [] RuleTypes) {
        this.RuleTypes = RuleTypes;
    }

    /**
     * Get <p>告警启停筛选，[1]：启用   [0]：停止，全部[0, 1]</p> 
     * @return Enable <p>告警启停筛选，[1]：启用   [0]：停止，全部[0, 1]</p>
     */
    public Long [] getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>告警启停筛选，[1]：启用   [0]：停止，全部[0, 1]</p>
     * @param Enable <p>告警启停筛选，[1]：启用   [0]：停止，全部[0, 1]</p>
     */
    public void setEnable(Long [] Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>传 1 查询未配置通知规则的告警策略；不传或传其他数值，查询所有策略。</p> 
     * @return NotBindingNoticeRule <p>传 1 查询未配置通知规则的告警策略；不传或传其他数值，查询所有策略。</p>
     */
    public Long getNotBindingNoticeRule() {
        return this.NotBindingNoticeRule;
    }

    /**
     * Set <p>传 1 查询未配置通知规则的告警策略；不传或传其他数值，查询所有策略。</p>
     * @param NotBindingNoticeRule <p>传 1 查询未配置通知规则的告警策略；不传或传其他数值，查询所有策略。</p>
     */
    public void setNotBindingNoticeRule(Long NotBindingNoticeRule) {
        this.NotBindingNoticeRule = NotBindingNoticeRule;
    }

    /**
     * Get <p>实例分组id</p> 
     * @return InstanceGroupId <p>实例分组id</p>
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set <p>实例分组id</p>
     * @param InstanceGroupId <p>实例分组id</p>
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get <p>是否需要策略与入参过滤维度参数的对应关系，1：是  0：否，默认为0</p> 
     * @return NeedCorrespondence <p>是否需要策略与入参过滤维度参数的对应关系，1：是  0：否，默认为0</p>
     */
    public Long getNeedCorrespondence() {
        return this.NeedCorrespondence;
    }

    /**
     * Set <p>是否需要策略与入参过滤维度参数的对应关系，1：是  0：否，默认为0</p>
     * @param NeedCorrespondence <p>是否需要策略与入参过滤维度参数的对应关系，1：是  0：否，默认为0</p>
     */
    public void setNeedCorrespondence(Long NeedCorrespondence) {
        this.NeedCorrespondence = NeedCorrespondence;
    }

    /**
     * Get <p>按照触发任务（例如弹性伸缩）过滤策略。最多10个</p> 
     * @return TriggerTasks <p>按照触发任务（例如弹性伸缩）过滤策略。最多10个</p>
     */
    public AlarmPolicyTriggerTask [] getTriggerTasks() {
        return this.TriggerTasks;
    }

    /**
     * Set <p>按照触发任务（例如弹性伸缩）过滤策略。最多10个</p>
     * @param TriggerTasks <p>按照触发任务（例如弹性伸缩）过滤策略。最多10个</p>
     */
    public void setTriggerTasks(AlarmPolicyTriggerTask [] TriggerTasks) {
        this.TriggerTasks = TriggerTasks;
    }

    /**
     * Get <p>根据一键告警策略筛选 不传展示全部策略 ONECLICK=展示一键告警策略 NOT_ONECLICK=展示非一键告警策略</p> 
     * @return OneClickPolicyType <p>根据一键告警策略筛选 不传展示全部策略 ONECLICK=展示一键告警策略 NOT_ONECLICK=展示非一键告警策略</p>
     */
    public String [] getOneClickPolicyType() {
        return this.OneClickPolicyType;
    }

    /**
     * Set <p>根据一键告警策略筛选 不传展示全部策略 ONECLICK=展示一键告警策略 NOT_ONECLICK=展示非一键告警策略</p>
     * @param OneClickPolicyType <p>根据一键告警策略筛选 不传展示全部策略 ONECLICK=展示一键告警策略 NOT_ONECLICK=展示非一键告警策略</p>
     */
    public void setOneClickPolicyType(String [] OneClickPolicyType) {
        this.OneClickPolicyType = OneClickPolicyType;
    }

    /**
     * Get <p>返回结果过滤掉绑定全部对象的策略，1代表需要过滤，0则无需过滤</p> 
     * @return NotBindAll <p>返回结果过滤掉绑定全部对象的策略，1代表需要过滤，0则无需过滤</p>
     */
    public Long getNotBindAll() {
        return this.NotBindAll;
    }

    /**
     * Set <p>返回结果过滤掉绑定全部对象的策略，1代表需要过滤，0则无需过滤</p>
     * @param NotBindAll <p>返回结果过滤掉绑定全部对象的策略，1代表需要过滤，0则无需过滤</p>
     */
    public void setNotBindAll(Long NotBindAll) {
        this.NotBindAll = NotBindAll;
    }

    /**
     * Get <p>返回结果过滤掉关联实例为实例分组的策略，1代表需要过滤，0则无需过滤</p> 
     * @return NotInstanceGroup <p>返回结果过滤掉关联实例为实例分组的策略，1代表需要过滤，0则无需过滤</p>
     */
    public Long getNotInstanceGroup() {
        return this.NotInstanceGroup;
    }

    /**
     * Set <p>返回结果过滤掉关联实例为实例分组的策略，1代表需要过滤，0则无需过滤</p>
     * @param NotInstanceGroup <p>返回结果过滤掉关联实例为实例分组的策略，1代表需要过滤，0则无需过滤</p>
     */
    public void setNotInstanceGroup(Long NotInstanceGroup) {
        this.NotInstanceGroup = NotInstanceGroup;
    }

    /**
     * Get <p>策略根据标签过滤</p> 
     * @return Tags <p>策略根据标签过滤</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>策略根据标签过滤</p>
     * @param Tags <p>策略根据标签过滤</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>prom实例id，自定义指标策略时会用到</p> 
     * @return PromInsId <p>prom实例id，自定义指标策略时会用到</p>
     */
    public String getPromInsId() {
        return this.PromInsId;
    }

    /**
     * Set <p>prom实例id，自定义指标策略时会用到</p>
     * @param PromInsId <p>prom实例id，自定义指标策略时会用到</p>
     */
    public void setPromInsId(String PromInsId) {
        this.PromInsId = PromInsId;
    }

    /**
     * Get <p>根据排班表搜索</p> 
     * @return ReceiverOnCallFormIDs <p>根据排班表搜索</p>
     */
    public String [] getReceiverOnCallFormIDs() {
        return this.ReceiverOnCallFormIDs;
    }

    /**
     * Set <p>根据排班表搜索</p>
     * @param ReceiverOnCallFormIDs <p>根据排班表搜索</p>
     */
    public void setReceiverOnCallFormIDs(String [] ReceiverOnCallFormIDs) {
        this.ReceiverOnCallFormIDs = ReceiverOnCallFormIDs;
    }

    /**
     * Get <p>通知内容模板ID筛选</p> 
     * @return NoticeContentTmplIDs <p>通知内容模板ID筛选</p>
     */
    public String [] getNoticeContentTmplIDs() {
        return this.NoticeContentTmplIDs;
    }

    /**
     * Set <p>通知内容模板ID筛选</p>
     * @param NoticeContentTmplIDs <p>通知内容模板ID筛选</p>
     */
    public void setNoticeContentTmplIDs(String [] NoticeContentTmplIDs) {
        this.NoticeContentTmplIDs = NoticeContentTmplIDs;
    }

    /**
     * Get <p>是否为预设策略，1是，0否</p> 
     * @return IsPredefined <p>是否为预设策略，1是，0否</p>
     */
    public Long getIsPredefined() {
        return this.IsPredefined;
    }

    /**
     * Set <p>是否为预设策略，1是，0否</p>
     * @param IsPredefined <p>是否为预设策略，1是，0否</p>
     */
    public void setIsPredefined(Long IsPredefined) {
        this.IsPredefined = IsPredefined;
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
        if (source.NotBindAll != null) {
            this.NotBindAll = new Long(source.NotBindAll);
        }
        if (source.NotInstanceGroup != null) {
            this.NotInstanceGroup = new Long(source.NotInstanceGroup);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.PromInsId != null) {
            this.PromInsId = new String(source.PromInsId);
        }
        if (source.ReceiverOnCallFormIDs != null) {
            this.ReceiverOnCallFormIDs = new String[source.ReceiverOnCallFormIDs.length];
            for (int i = 0; i < source.ReceiverOnCallFormIDs.length; i++) {
                this.ReceiverOnCallFormIDs[i] = new String(source.ReceiverOnCallFormIDs[i]);
            }
        }
        if (source.NoticeContentTmplIDs != null) {
            this.NoticeContentTmplIDs = new String[source.NoticeContentTmplIDs.length];
            for (int i = 0; i < source.NoticeContentTmplIDs.length; i++) {
                this.NoticeContentTmplIDs[i] = new String(source.NoticeContentTmplIDs[i]);
            }
        }
        if (source.IsPredefined != null) {
            this.IsPredefined = new Long(source.IsPredefined);
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
        this.setParamSimple(map, prefix + "NotBindAll", this.NotBindAll);
        this.setParamSimple(map, prefix + "NotInstanceGroup", this.NotInstanceGroup);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PromInsId", this.PromInsId);
        this.setParamArraySimple(map, prefix + "ReceiverOnCallFormIDs.", this.ReceiverOnCallFormIDs);
        this.setParamArraySimple(map, prefix + "NoticeContentTmplIDs.", this.NoticeContentTmplIDs);
        this.setParamSimple(map, prefix + "IsPredefined", this.IsPredefined);

    }
}

