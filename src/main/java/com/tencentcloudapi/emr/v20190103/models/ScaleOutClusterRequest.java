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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleOutClusterRequest extends AbstractModel {

    /**
    * <p>节点计费模式。取值范围：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：按小时后付费。</li><li>SPOTPAID：竞价付费（仅支持TASK节点）。</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>集群实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>扩容节点类型以及数量</p>
    */
    @SerializedName("ScaleOutNodeConfig")
    @Expose
    private ScaleOutNodeConfig ScaleOutNodeConfig;

    /**
    * <p>唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p>
    */
    @SerializedName("ScriptBootstrapActionConfig")
    @Expose
    private ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig;

    /**
    * <p>扩容部署服务，新增节点将默认继承当前节点类型中所部署服务，部署服务含默认可选服务，该参数仅支持可选服务填写，如：存量task节点已部署HDFS、YARN、impala；使用api扩容task节不部署impala时，部署服务仅填写HDFS、YARN。<a href="https://cloud.tencent.com/document/product/589/98760">组件名对应的映射关系表</a>。</p>
    */
    @SerializedName("SoftDeployInfo")
    @Expose
    private Long [] SoftDeployInfo;

    /**
    * <p>部署进程，默认部署扩容服务的全部进程，支持修改部署进程，如：当前task节点部署服务为：HDFS、YARN、impala，默认部署服务为：DataNode,NodeManager,ImpalaServer，若用户需修改部署进程信息，部署进程：    DataNode,NodeManager,ImpalaServerCoordinator或DataNode,NodeManager,ImpalaServerExecutor。<a href="https://cloud.tencent.com/document/product/589/98760">进程名对应的映射关系表</a>。</p>
    */
    @SerializedName("ServiceNodeInfo")
    @Expose
    private Long [] ServiceNodeInfo;

    /**
    * <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>的返回值中的DisasterRecoverGroupId字段来获取。</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>扩容节点绑定标签列表。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>扩容所选资源类型，可选范围为&quot;HOST&quot;,&quot;POD&quot;,&quot;MNode&quot;，HOST为普通的CVM资源，POD为TKE集群或EKS集群提供的资源,MNode为全托管资源类型</p>
    */
    @SerializedName("HardwareSourceType")
    @Expose
    private String HardwareSourceType;

    /**
    * <p>Pod相关资源信息</p>
    */
    @SerializedName("PodSpecInfo")
    @Expose
    private PodSpecInfo PodSpecInfo;

    /**
    * <p>使用clickhouse集群扩容时，选择的机器分组名称</p>
    */
    @SerializedName("ClickHouseClusterName")
    @Expose
    private String ClickHouseClusterName;

    /**
    * <p>使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组</p>
    */
    @SerializedName("ClickHouseClusterType")
    @Expose
    private String ClickHouseClusterType;

    /**
    * <p>扩容指定 Yarn Node Label</p>
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * <p>扩容后是否启动服务，默认取值否</p><li>true：是</li><li>false：否</li>
    */
    @SerializedName("EnableStartServiceFlag")
    @Expose
    private Boolean EnableStartServiceFlag;

    /**
    * <p>规格设置</p>
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NodeResourceSpec ResourceSpec;

    /**
    * <p>实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用<a href="https://cloud.tencent.com/document/product/213/15707">DescribeZones</a> 的返回值中的Zone字段来获取。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>子网，默认是集群创建时的子网</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>扩容指定配置组</p>
    */
    @SerializedName("ScaleOutServiceConfGroupsInfo")
    @Expose
    private ScaleOutServiceConfGroupsInfo [] ScaleOutServiceConfGroupsInfo;

    /**
    * <p>节点标记信息，当前只提供给tf平台使用</p>
    */
    @SerializedName("NodeMarks")
    @Expose
    private NodeMark NodeMarks;

    /**
    * <p>扩容指定计算组名称</p>
    */
    @SerializedName("WarehouseName")
    @Expose
    private String WarehouseName;

    /**
    * <p>分区置放群组分区</p>
    */
    @SerializedName("PartitionNumber")
    @Expose
    private Long PartitionNumber;

    /**
     * Get <p>节点计费模式。取值范围：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：按小时后付费。</li><li>SPOTPAID：竞价付费（仅支持TASK节点）。</li> 
     * @return InstanceChargeType <p>节点计费模式。取值范围：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：按小时后付费。</li><li>SPOTPAID：竞价付费（仅支持TASK节点）。</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>节点计费模式。取值范围：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：按小时后付费。</li><li>SPOTPAID：竞价付费（仅支持TASK节点）。</li>
     * @param InstanceChargeType <p>节点计费模式。取值范围：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：按小时后付费。</li><li>SPOTPAID：竞价付费（仅支持TASK节点）。</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>集群实例ID。</p> 
     * @return InstanceId <p>集群实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群实例ID。</p>
     * @param InstanceId <p>集群实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>扩容节点类型以及数量</p> 
     * @return ScaleOutNodeConfig <p>扩容节点类型以及数量</p>
     */
    public ScaleOutNodeConfig getScaleOutNodeConfig() {
        return this.ScaleOutNodeConfig;
    }

    /**
     * Set <p>扩容节点类型以及数量</p>
     * @param ScaleOutNodeConfig <p>扩容节点类型以及数量</p>
     */
    public void setScaleOutNodeConfig(ScaleOutNodeConfig ScaleOutNodeConfig) {
        this.ScaleOutNodeConfig = ScaleOutNodeConfig;
    }

    /**
     * Get <p>唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280</p> 
     * @return ClientToken <p>唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280</p>
     * @param ClientToken <p>唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p> 
     * @return InstanceChargePrepaid <p>即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     * @param InstanceChargePrepaid <p>即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p> 
     * @return ScriptBootstrapActionConfig <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p>
     */
    public ScriptBootstrapActionConfig [] getScriptBootstrapActionConfig() {
        return this.ScriptBootstrapActionConfig;
    }

    /**
     * Set <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p>
     * @param ScriptBootstrapActionConfig <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p>
     */
    public void setScriptBootstrapActionConfig(ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig) {
        this.ScriptBootstrapActionConfig = ScriptBootstrapActionConfig;
    }

    /**
     * Get <p>扩容部署服务，新增节点将默认继承当前节点类型中所部署服务，部署服务含默认可选服务，该参数仅支持可选服务填写，如：存量task节点已部署HDFS、YARN、impala；使用api扩容task节不部署impala时，部署服务仅填写HDFS、YARN。<a href="https://cloud.tencent.com/document/product/589/98760">组件名对应的映射关系表</a>。</p> 
     * @return SoftDeployInfo <p>扩容部署服务，新增节点将默认继承当前节点类型中所部署服务，部署服务含默认可选服务，该参数仅支持可选服务填写，如：存量task节点已部署HDFS、YARN、impala；使用api扩容task节不部署impala时，部署服务仅填写HDFS、YARN。<a href="https://cloud.tencent.com/document/product/589/98760">组件名对应的映射关系表</a>。</p>
     */
    public Long [] getSoftDeployInfo() {
        return this.SoftDeployInfo;
    }

    /**
     * Set <p>扩容部署服务，新增节点将默认继承当前节点类型中所部署服务，部署服务含默认可选服务，该参数仅支持可选服务填写，如：存量task节点已部署HDFS、YARN、impala；使用api扩容task节不部署impala时，部署服务仅填写HDFS、YARN。<a href="https://cloud.tencent.com/document/product/589/98760">组件名对应的映射关系表</a>。</p>
     * @param SoftDeployInfo <p>扩容部署服务，新增节点将默认继承当前节点类型中所部署服务，部署服务含默认可选服务，该参数仅支持可选服务填写，如：存量task节点已部署HDFS、YARN、impala；使用api扩容task节不部署impala时，部署服务仅填写HDFS、YARN。<a href="https://cloud.tencent.com/document/product/589/98760">组件名对应的映射关系表</a>。</p>
     */
    public void setSoftDeployInfo(Long [] SoftDeployInfo) {
        this.SoftDeployInfo = SoftDeployInfo;
    }

    /**
     * Get <p>部署进程，默认部署扩容服务的全部进程，支持修改部署进程，如：当前task节点部署服务为：HDFS、YARN、impala，默认部署服务为：DataNode,NodeManager,ImpalaServer，若用户需修改部署进程信息，部署进程：    DataNode,NodeManager,ImpalaServerCoordinator或DataNode,NodeManager,ImpalaServerExecutor。<a href="https://cloud.tencent.com/document/product/589/98760">进程名对应的映射关系表</a>。</p> 
     * @return ServiceNodeInfo <p>部署进程，默认部署扩容服务的全部进程，支持修改部署进程，如：当前task节点部署服务为：HDFS、YARN、impala，默认部署服务为：DataNode,NodeManager,ImpalaServer，若用户需修改部署进程信息，部署进程：    DataNode,NodeManager,ImpalaServerCoordinator或DataNode,NodeManager,ImpalaServerExecutor。<a href="https://cloud.tencent.com/document/product/589/98760">进程名对应的映射关系表</a>。</p>
     */
    public Long [] getServiceNodeInfo() {
        return this.ServiceNodeInfo;
    }

    /**
     * Set <p>部署进程，默认部署扩容服务的全部进程，支持修改部署进程，如：当前task节点部署服务为：HDFS、YARN、impala，默认部署服务为：DataNode,NodeManager,ImpalaServer，若用户需修改部署进程信息，部署进程：    DataNode,NodeManager,ImpalaServerCoordinator或DataNode,NodeManager,ImpalaServerExecutor。<a href="https://cloud.tencent.com/document/product/589/98760">进程名对应的映射关系表</a>。</p>
     * @param ServiceNodeInfo <p>部署进程，默认部署扩容服务的全部进程，支持修改部署进程，如：当前task节点部署服务为：HDFS、YARN、impala，默认部署服务为：DataNode,NodeManager,ImpalaServer，若用户需修改部署进程信息，部署进程：    DataNode,NodeManager,ImpalaServerCoordinator或DataNode,NodeManager,ImpalaServerExecutor。<a href="https://cloud.tencent.com/document/product/589/98760">进程名对应的映射关系表</a>。</p>
     */
    public void setServiceNodeInfo(Long [] ServiceNodeInfo) {
        this.ServiceNodeInfo = ServiceNodeInfo;
    }

    /**
     * Get <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>的返回值中的DisasterRecoverGroupId字段来获取。</p> 
     * @return DisasterRecoverGroupIds <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>的返回值中的DisasterRecoverGroupId字段来获取。</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>的返回值中的DisasterRecoverGroupId字段来获取。</p>
     * @param DisasterRecoverGroupIds <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/17810">DescribeDisasterRecoverGroups</a>的返回值中的DisasterRecoverGroupId字段来获取。</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>扩容节点绑定标签列表。</p> 
     * @return Tags <p>扩容节点绑定标签列表。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>扩容节点绑定标签列表。</p>
     * @param Tags <p>扩容节点绑定标签列表。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>扩容所选资源类型，可选范围为&quot;HOST&quot;,&quot;POD&quot;,&quot;MNode&quot;，HOST为普通的CVM资源，POD为TKE集群或EKS集群提供的资源,MNode为全托管资源类型</p> 
     * @return HardwareSourceType <p>扩容所选资源类型，可选范围为&quot;HOST&quot;,&quot;POD&quot;,&quot;MNode&quot;，HOST为普通的CVM资源，POD为TKE集群或EKS集群提供的资源,MNode为全托管资源类型</p>
     */
    public String getHardwareSourceType() {
        return this.HardwareSourceType;
    }

    /**
     * Set <p>扩容所选资源类型，可选范围为&quot;HOST&quot;,&quot;POD&quot;,&quot;MNode&quot;，HOST为普通的CVM资源，POD为TKE集群或EKS集群提供的资源,MNode为全托管资源类型</p>
     * @param HardwareSourceType <p>扩容所选资源类型，可选范围为&quot;HOST&quot;,&quot;POD&quot;,&quot;MNode&quot;，HOST为普通的CVM资源，POD为TKE集群或EKS集群提供的资源,MNode为全托管资源类型</p>
     */
    public void setHardwareSourceType(String HardwareSourceType) {
        this.HardwareSourceType = HardwareSourceType;
    }

    /**
     * Get <p>Pod相关资源信息</p> 
     * @return PodSpecInfo <p>Pod相关资源信息</p>
     */
    public PodSpecInfo getPodSpecInfo() {
        return this.PodSpecInfo;
    }

    /**
     * Set <p>Pod相关资源信息</p>
     * @param PodSpecInfo <p>Pod相关资源信息</p>
     */
    public void setPodSpecInfo(PodSpecInfo PodSpecInfo) {
        this.PodSpecInfo = PodSpecInfo;
    }

    /**
     * Get <p>使用clickhouse集群扩容时，选择的机器分组名称</p> 
     * @return ClickHouseClusterName <p>使用clickhouse集群扩容时，选择的机器分组名称</p>
     */
    public String getClickHouseClusterName() {
        return this.ClickHouseClusterName;
    }

    /**
     * Set <p>使用clickhouse集群扩容时，选择的机器分组名称</p>
     * @param ClickHouseClusterName <p>使用clickhouse集群扩容时，选择的机器分组名称</p>
     */
    public void setClickHouseClusterName(String ClickHouseClusterName) {
        this.ClickHouseClusterName = ClickHouseClusterName;
    }

    /**
     * Get <p>使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组</p> 
     * @return ClickHouseClusterType <p>使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组</p>
     */
    public String getClickHouseClusterType() {
        return this.ClickHouseClusterType;
    }

    /**
     * Set <p>使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组</p>
     * @param ClickHouseClusterType <p>使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组</p>
     */
    public void setClickHouseClusterType(String ClickHouseClusterType) {
        this.ClickHouseClusterType = ClickHouseClusterType;
    }

    /**
     * Get <p>扩容指定 Yarn Node Label</p> 
     * @return YarnNodeLabel <p>扩容指定 Yarn Node Label</p>
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set <p>扩容指定 Yarn Node Label</p>
     * @param YarnNodeLabel <p>扩容指定 Yarn Node Label</p>
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get <p>扩容后是否启动服务，默认取值否</p><li>true：是</li><li>false：否</li> 
     * @return EnableStartServiceFlag <p>扩容后是否启动服务，默认取值否</p><li>true：是</li><li>false：否</li>
     */
    public Boolean getEnableStartServiceFlag() {
        return this.EnableStartServiceFlag;
    }

    /**
     * Set <p>扩容后是否启动服务，默认取值否</p><li>true：是</li><li>false：否</li>
     * @param EnableStartServiceFlag <p>扩容后是否启动服务，默认取值否</p><li>true：是</li><li>false：否</li>
     */
    public void setEnableStartServiceFlag(Boolean EnableStartServiceFlag) {
        this.EnableStartServiceFlag = EnableStartServiceFlag;
    }

    /**
     * Get <p>规格设置</p> 
     * @return ResourceSpec <p>规格设置</p>
     */
    public NodeResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set <p>规格设置</p>
     * @param ResourceSpec <p>规格设置</p>
     */
    public void setResourceSpec(NodeResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get <p>实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用<a href="https://cloud.tencent.com/document/product/213/15707">DescribeZones</a> 的返回值中的Zone字段来获取。</p> 
     * @return Zone <p>实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用<a href="https://cloud.tencent.com/document/product/213/15707">DescribeZones</a> 的返回值中的Zone字段来获取。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用<a href="https://cloud.tencent.com/document/product/213/15707">DescribeZones</a> 的返回值中的Zone字段来获取。</p>
     * @param Zone <p>实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用<a href="https://cloud.tencent.com/document/product/213/15707">DescribeZones</a> 的返回值中的Zone字段来获取。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>子网，默认是集群创建时的子网</p> 
     * @return SubnetId <p>子网，默认是集群创建时的子网</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网，默认是集群创建时的子网</p>
     * @param SubnetId <p>子网，默认是集群创建时的子网</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>扩容指定配置组</p> 
     * @return ScaleOutServiceConfGroupsInfo <p>扩容指定配置组</p>
     */
    public ScaleOutServiceConfGroupsInfo [] getScaleOutServiceConfGroupsInfo() {
        return this.ScaleOutServiceConfGroupsInfo;
    }

    /**
     * Set <p>扩容指定配置组</p>
     * @param ScaleOutServiceConfGroupsInfo <p>扩容指定配置组</p>
     */
    public void setScaleOutServiceConfGroupsInfo(ScaleOutServiceConfGroupsInfo [] ScaleOutServiceConfGroupsInfo) {
        this.ScaleOutServiceConfGroupsInfo = ScaleOutServiceConfGroupsInfo;
    }

    /**
     * Get <p>节点标记信息，当前只提供给tf平台使用</p> 
     * @return NodeMarks <p>节点标记信息，当前只提供给tf平台使用</p>
     */
    public NodeMark getNodeMarks() {
        return this.NodeMarks;
    }

    /**
     * Set <p>节点标记信息，当前只提供给tf平台使用</p>
     * @param NodeMarks <p>节点标记信息，当前只提供给tf平台使用</p>
     */
    public void setNodeMarks(NodeMark NodeMarks) {
        this.NodeMarks = NodeMarks;
    }

    /**
     * Get <p>扩容指定计算组名称</p> 
     * @return WarehouseName <p>扩容指定计算组名称</p>
     */
    public String getWarehouseName() {
        return this.WarehouseName;
    }

    /**
     * Set <p>扩容指定计算组名称</p>
     * @param WarehouseName <p>扩容指定计算组名称</p>
     */
    public void setWarehouseName(String WarehouseName) {
        this.WarehouseName = WarehouseName;
    }

    /**
     * Get <p>分区置放群组分区</p> 
     * @return PartitionNumber <p>分区置放群组分区</p>
     */
    public Long getPartitionNumber() {
        return this.PartitionNumber;
    }

    /**
     * Set <p>分区置放群组分区</p>
     * @param PartitionNumber <p>分区置放群组分区</p>
     */
    public void setPartitionNumber(Long PartitionNumber) {
        this.PartitionNumber = PartitionNumber;
    }

    public ScaleOutClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleOutClusterRequest(ScaleOutClusterRequest source) {
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ScaleOutNodeConfig != null) {
            this.ScaleOutNodeConfig = new ScaleOutNodeConfig(source.ScaleOutNodeConfig);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.ScriptBootstrapActionConfig != null) {
            this.ScriptBootstrapActionConfig = new ScriptBootstrapActionConfig[source.ScriptBootstrapActionConfig.length];
            for (int i = 0; i < source.ScriptBootstrapActionConfig.length; i++) {
                this.ScriptBootstrapActionConfig[i] = new ScriptBootstrapActionConfig(source.ScriptBootstrapActionConfig[i]);
            }
        }
        if (source.SoftDeployInfo != null) {
            this.SoftDeployInfo = new Long[source.SoftDeployInfo.length];
            for (int i = 0; i < source.SoftDeployInfo.length; i++) {
                this.SoftDeployInfo[i] = new Long(source.SoftDeployInfo[i]);
            }
        }
        if (source.ServiceNodeInfo != null) {
            this.ServiceNodeInfo = new Long[source.ServiceNodeInfo.length];
            for (int i = 0; i < source.ServiceNodeInfo.length; i++) {
                this.ServiceNodeInfo[i] = new Long(source.ServiceNodeInfo[i]);
            }
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HardwareSourceType != null) {
            this.HardwareSourceType = new String(source.HardwareSourceType);
        }
        if (source.PodSpecInfo != null) {
            this.PodSpecInfo = new PodSpecInfo(source.PodSpecInfo);
        }
        if (source.ClickHouseClusterName != null) {
            this.ClickHouseClusterName = new String(source.ClickHouseClusterName);
        }
        if (source.ClickHouseClusterType != null) {
            this.ClickHouseClusterType = new String(source.ClickHouseClusterType);
        }
        if (source.YarnNodeLabel != null) {
            this.YarnNodeLabel = new String(source.YarnNodeLabel);
        }
        if (source.EnableStartServiceFlag != null) {
            this.EnableStartServiceFlag = new Boolean(source.EnableStartServiceFlag);
        }
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new NodeResourceSpec(source.ResourceSpec);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ScaleOutServiceConfGroupsInfo != null) {
            this.ScaleOutServiceConfGroupsInfo = new ScaleOutServiceConfGroupsInfo[source.ScaleOutServiceConfGroupsInfo.length];
            for (int i = 0; i < source.ScaleOutServiceConfGroupsInfo.length; i++) {
                this.ScaleOutServiceConfGroupsInfo[i] = new ScaleOutServiceConfGroupsInfo(source.ScaleOutServiceConfGroupsInfo[i]);
            }
        }
        if (source.NodeMarks != null) {
            this.NodeMarks = new NodeMark(source.NodeMarks);
        }
        if (source.WarehouseName != null) {
            this.WarehouseName = new String(source.WarehouseName);
        }
        if (source.PartitionNumber != null) {
            this.PartitionNumber = new Long(source.PartitionNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "ScaleOutNodeConfig.", this.ScaleOutNodeConfig);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamArrayObj(map, prefix + "ScriptBootstrapActionConfig.", this.ScriptBootstrapActionConfig);
        this.setParamArraySimple(map, prefix + "SoftDeployInfo.", this.SoftDeployInfo);
        this.setParamArraySimple(map, prefix + "ServiceNodeInfo.", this.ServiceNodeInfo);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HardwareSourceType", this.HardwareSourceType);
        this.setParamObj(map, prefix + "PodSpecInfo.", this.PodSpecInfo);
        this.setParamSimple(map, prefix + "ClickHouseClusterName", this.ClickHouseClusterName);
        this.setParamSimple(map, prefix + "ClickHouseClusterType", this.ClickHouseClusterType);
        this.setParamSimple(map, prefix + "YarnNodeLabel", this.YarnNodeLabel);
        this.setParamSimple(map, prefix + "EnableStartServiceFlag", this.EnableStartServiceFlag);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "ScaleOutServiceConfGroupsInfo.", this.ScaleOutServiceConfGroupsInfo);
        this.setParamObj(map, prefix + "NodeMarks.", this.NodeMarks);
        this.setParamSimple(map, prefix + "WarehouseName", this.WarehouseName);
        this.setParamSimple(map, prefix + "PartitionNumber", this.PartitionNumber);

    }
}

