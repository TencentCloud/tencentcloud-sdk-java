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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleOutClusterRequest extends AbstractModel{

    /**
    * 节点计费模式。取值范围：
<li>PREPAID：预付费，即包年包月。</li>
<li>POSTPAID_BY_HOUR：按小时后付费。</li>
<li>SPOTPAID：竞价付费（仅支持TASK节点）。</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 集群实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 扩容节点类型以及数量
    */
    @SerializedName("ScaleOutNodeConfig")
    @Expose
    private ScaleOutNodeConfig ScaleOutNodeConfig;

    /**
    * 唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-751a-41b6-aad6-fae36063280
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * [引导操作](https://cloud.tencent.com/document/product/589/35656)脚本设置。
    */
    @SerializedName("ScriptBootstrapActionConfig")
    @Expose
    private ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig;

    /**
    * 扩容部署服务，新增节点将默认继承当前节点类型中所部署服务，部署服务含默认可选服务，该参数仅支持可选服务填写，如：存量task节点已部署HDFS、YARN、impala；使用api扩容task节不部署impala时，此参数仅填写HDFS、YARN
    */
    @SerializedName("SoftDeployInfo")
    @Expose
    private Long [] SoftDeployInfo;

    /**
    * 部署进程，默认部署扩容服务的全部进程，支持修改部署进程，如：当前task节点部署服务为：HDFS、YARN、impala，默认部署服务为：DataNode,NodeManager,ImpalaServer，若用户需修改部署进程信息，此参数信息可填写：	DataNode,NodeManager,ImpalaServerCoordinator或DataNode,NodeManager,ImpalaServerExecutor
    */
    @SerializedName("ServiceNodeInfo")
    @Expose
    private Long [] ServiceNodeInfo;

    /**
    * 分散置放群组ID列表，当前只支持指定一个。
该参数可以通过调用 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810)的返回值中的DisasterRecoverGroupId字段来获取。
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * 扩容节点绑定标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 扩容所选资源类型，可选范围为"host","pod"，host为普通的CVM资源，Pod为TKE集群或EKS集群提供的资源
    */
    @SerializedName("HardwareSourceType")
    @Expose
    private String HardwareSourceType;

    /**
    * Pod相关资源信息
    */
    @SerializedName("PodSpecInfo")
    @Expose
    private PodSpecInfo PodSpecInfo;

    /**
    * 使用clickhouse集群扩容时，选择的机器分组名称
    */
    @SerializedName("ClickHouseClusterName")
    @Expose
    private String ClickHouseClusterName;

    /**
    * 使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组
    */
    @SerializedName("ClickHouseClusterType")
    @Expose
    private String ClickHouseClusterType;

    /**
    * 扩容指定 Yarn Node Label
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * 扩容后是否启动服务，默认取值否
<li>true：是</li>
<li>false：否</li>
    */
    @SerializedName("EnableStartServiceFlag")
    @Expose
    private Boolean EnableStartServiceFlag;

    /**
    * 规格设置
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NodeResourceSpec ResourceSpec;

    /**
    * 实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用[DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 子网，默认是集群创建时的子网
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get 节点计费模式。取值范围：
<li>PREPAID：预付费，即包年包月。</li>
<li>POSTPAID_BY_HOUR：按小时后付费。</li>
<li>SPOTPAID：竞价付费（仅支持TASK节点）。</li> 
     * @return InstanceChargeType 节点计费模式。取值范围：
<li>PREPAID：预付费，即包年包月。</li>
<li>POSTPAID_BY_HOUR：按小时后付费。</li>
<li>SPOTPAID：竞价付费（仅支持TASK节点）。</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 节点计费模式。取值范围：
<li>PREPAID：预付费，即包年包月。</li>
<li>POSTPAID_BY_HOUR：按小时后付费。</li>
<li>SPOTPAID：竞价付费（仅支持TASK节点）。</li>
     * @param InstanceChargeType 节点计费模式。取值范围：
<li>PREPAID：预付费，即包年包月。</li>
<li>POSTPAID_BY_HOUR：按小时后付费。</li>
<li>SPOTPAID：竞价付费（仅支持TASK节点）。</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 集群实例ID。 
     * @return InstanceId 集群实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例ID。
     * @param InstanceId 集群实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 扩容节点类型以及数量 
     * @return ScaleOutNodeConfig 扩容节点类型以及数量
     */
    public ScaleOutNodeConfig getScaleOutNodeConfig() {
        return this.ScaleOutNodeConfig;
    }

    /**
     * Set 扩容节点类型以及数量
     * @param ScaleOutNodeConfig 扩容节点类型以及数量
     */
    public void setScaleOutNodeConfig(ScaleOutNodeConfig ScaleOutNodeConfig) {
        this.ScaleOutNodeConfig = ScaleOutNodeConfig;
    }

    /**
     * Get 唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-751a-41b6-aad6-fae36063280 
     * @return ClientToken 唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-751a-41b6-aad6-fae36063280
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-751a-41b6-aad6-fae36063280
     * @param ClientToken 唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-751a-41b6-aad6-fae36063280
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。 
     * @return InstanceChargePrepaid 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     * @param InstanceChargePrepaid 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get [引导操作](https://cloud.tencent.com/document/product/589/35656)脚本设置。 
     * @return ScriptBootstrapActionConfig [引导操作](https://cloud.tencent.com/document/product/589/35656)脚本设置。
     */
    public ScriptBootstrapActionConfig [] getScriptBootstrapActionConfig() {
        return this.ScriptBootstrapActionConfig;
    }

    /**
     * Set [引导操作](https://cloud.tencent.com/document/product/589/35656)脚本设置。
     * @param ScriptBootstrapActionConfig [引导操作](https://cloud.tencent.com/document/product/589/35656)脚本设置。
     */
    public void setScriptBootstrapActionConfig(ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig) {
        this.ScriptBootstrapActionConfig = ScriptBootstrapActionConfig;
    }

    /**
     * Get 扩容部署服务，新增节点将默认继承当前节点类型中所部署服务，部署服务含默认可选服务，该参数仅支持可选服务填写，如：存量task节点已部署HDFS、YARN、impala；使用api扩容task节不部署impala时，此参数仅填写HDFS、YARN 
     * @return SoftDeployInfo 扩容部署服务，新增节点将默认继承当前节点类型中所部署服务，部署服务含默认可选服务，该参数仅支持可选服务填写，如：存量task节点已部署HDFS、YARN、impala；使用api扩容task节不部署impala时，此参数仅填写HDFS、YARN
     */
    public Long [] getSoftDeployInfo() {
        return this.SoftDeployInfo;
    }

    /**
     * Set 扩容部署服务，新增节点将默认继承当前节点类型中所部署服务，部署服务含默认可选服务，该参数仅支持可选服务填写，如：存量task节点已部署HDFS、YARN、impala；使用api扩容task节不部署impala时，此参数仅填写HDFS、YARN
     * @param SoftDeployInfo 扩容部署服务，新增节点将默认继承当前节点类型中所部署服务，部署服务含默认可选服务，该参数仅支持可选服务填写，如：存量task节点已部署HDFS、YARN、impala；使用api扩容task节不部署impala时，此参数仅填写HDFS、YARN
     */
    public void setSoftDeployInfo(Long [] SoftDeployInfo) {
        this.SoftDeployInfo = SoftDeployInfo;
    }

    /**
     * Get 部署进程，默认部署扩容服务的全部进程，支持修改部署进程，如：当前task节点部署服务为：HDFS、YARN、impala，默认部署服务为：DataNode,NodeManager,ImpalaServer，若用户需修改部署进程信息，此参数信息可填写：	DataNode,NodeManager,ImpalaServerCoordinator或DataNode,NodeManager,ImpalaServerExecutor 
     * @return ServiceNodeInfo 部署进程，默认部署扩容服务的全部进程，支持修改部署进程，如：当前task节点部署服务为：HDFS、YARN、impala，默认部署服务为：DataNode,NodeManager,ImpalaServer，若用户需修改部署进程信息，此参数信息可填写：	DataNode,NodeManager,ImpalaServerCoordinator或DataNode,NodeManager,ImpalaServerExecutor
     */
    public Long [] getServiceNodeInfo() {
        return this.ServiceNodeInfo;
    }

    /**
     * Set 部署进程，默认部署扩容服务的全部进程，支持修改部署进程，如：当前task节点部署服务为：HDFS、YARN、impala，默认部署服务为：DataNode,NodeManager,ImpalaServer，若用户需修改部署进程信息，此参数信息可填写：	DataNode,NodeManager,ImpalaServerCoordinator或DataNode,NodeManager,ImpalaServerExecutor
     * @param ServiceNodeInfo 部署进程，默认部署扩容服务的全部进程，支持修改部署进程，如：当前task节点部署服务为：HDFS、YARN、impala，默认部署服务为：DataNode,NodeManager,ImpalaServer，若用户需修改部署进程信息，此参数信息可填写：	DataNode,NodeManager,ImpalaServerCoordinator或DataNode,NodeManager,ImpalaServerExecutor
     */
    public void setServiceNodeInfo(Long [] ServiceNodeInfo) {
        this.ServiceNodeInfo = ServiceNodeInfo;
    }

    /**
     * Get 分散置放群组ID列表，当前只支持指定一个。
该参数可以通过调用 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810)的返回值中的DisasterRecoverGroupId字段来获取。 
     * @return DisasterRecoverGroupIds 分散置放群组ID列表，当前只支持指定一个。
该参数可以通过调用 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810)的返回值中的DisasterRecoverGroupId字段来获取。
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set 分散置放群组ID列表，当前只支持指定一个。
该参数可以通过调用 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810)的返回值中的DisasterRecoverGroupId字段来获取。
     * @param DisasterRecoverGroupIds 分散置放群组ID列表，当前只支持指定一个。
该参数可以通过调用 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810)的返回值中的DisasterRecoverGroupId字段来获取。
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get 扩容节点绑定标签列表。 
     * @return Tags 扩容节点绑定标签列表。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 扩容节点绑定标签列表。
     * @param Tags 扩容节点绑定标签列表。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 扩容所选资源类型，可选范围为"host","pod"，host为普通的CVM资源，Pod为TKE集群或EKS集群提供的资源 
     * @return HardwareSourceType 扩容所选资源类型，可选范围为"host","pod"，host为普通的CVM资源，Pod为TKE集群或EKS集群提供的资源
     */
    public String getHardwareSourceType() {
        return this.HardwareSourceType;
    }

    /**
     * Set 扩容所选资源类型，可选范围为"host","pod"，host为普通的CVM资源，Pod为TKE集群或EKS集群提供的资源
     * @param HardwareSourceType 扩容所选资源类型，可选范围为"host","pod"，host为普通的CVM资源，Pod为TKE集群或EKS集群提供的资源
     */
    public void setHardwareSourceType(String HardwareSourceType) {
        this.HardwareSourceType = HardwareSourceType;
    }

    /**
     * Get Pod相关资源信息 
     * @return PodSpecInfo Pod相关资源信息
     */
    public PodSpecInfo getPodSpecInfo() {
        return this.PodSpecInfo;
    }

    /**
     * Set Pod相关资源信息
     * @param PodSpecInfo Pod相关资源信息
     */
    public void setPodSpecInfo(PodSpecInfo PodSpecInfo) {
        this.PodSpecInfo = PodSpecInfo;
    }

    /**
     * Get 使用clickhouse集群扩容时，选择的机器分组名称 
     * @return ClickHouseClusterName 使用clickhouse集群扩容时，选择的机器分组名称
     */
    public String getClickHouseClusterName() {
        return this.ClickHouseClusterName;
    }

    /**
     * Set 使用clickhouse集群扩容时，选择的机器分组名称
     * @param ClickHouseClusterName 使用clickhouse集群扩容时，选择的机器分组名称
     */
    public void setClickHouseClusterName(String ClickHouseClusterName) {
        this.ClickHouseClusterName = ClickHouseClusterName;
    }

    /**
     * Get 使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组 
     * @return ClickHouseClusterType 使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组
     */
    public String getClickHouseClusterType() {
        return this.ClickHouseClusterType;
    }

    /**
     * Set 使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组
     * @param ClickHouseClusterType 使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组
     */
    public void setClickHouseClusterType(String ClickHouseClusterType) {
        this.ClickHouseClusterType = ClickHouseClusterType;
    }

    /**
     * Get 扩容指定 Yarn Node Label 
     * @return YarnNodeLabel 扩容指定 Yarn Node Label
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set 扩容指定 Yarn Node Label
     * @param YarnNodeLabel 扩容指定 Yarn Node Label
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get 扩容后是否启动服务，默认取值否
<li>true：是</li>
<li>false：否</li> 
     * @return EnableStartServiceFlag 扩容后是否启动服务，默认取值否
<li>true：是</li>
<li>false：否</li>
     */
    public Boolean getEnableStartServiceFlag() {
        return this.EnableStartServiceFlag;
    }

    /**
     * Set 扩容后是否启动服务，默认取值否
<li>true：是</li>
<li>false：否</li>
     * @param EnableStartServiceFlag 扩容后是否启动服务，默认取值否
<li>true：是</li>
<li>false：否</li>
     */
    public void setEnableStartServiceFlag(Boolean EnableStartServiceFlag) {
        this.EnableStartServiceFlag = EnableStartServiceFlag;
    }

    /**
     * Get 规格设置 
     * @return ResourceSpec 规格设置
     */
    public NodeResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set 规格设置
     * @param ResourceSpec 规格设置
     */
    public void setResourceSpec(NodeResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get 实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用[DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。 
     * @return Zone 实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用[DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用[DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。
     * @param Zone 实例所属的可用区，例如ap-guangzhou-1。该参数也可以通过调用[DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 子网，默认是集群创建时的子网 
     * @return SubnetId 子网，默认是集群创建时的子网
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网，默认是集群创建时的子网
     * @param SubnetId 子网，默认是集群创建时的子网
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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

    }
}

