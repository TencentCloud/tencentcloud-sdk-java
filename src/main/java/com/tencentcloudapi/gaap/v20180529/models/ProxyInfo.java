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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyInfo  extends AbstractModel{

    /**
    * （旧参数，请使用ProxyId）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 创建时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 通道名称。
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * 接入地域。
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * 源站地域。
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * 带宽，单位：Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 并发，单位：个/秒。
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
    * 通道状态。其中：
RUNNING，运行中；
CREATING，创建中；
DESTROYING，销毁中；
OPENING，开启中；
CLOSING，关闭中；
CLOSED，已关闭；
ADJUSTING，配置变更中；
ISOLATING，隔离中（欠费触发）；
ISOLATED，已隔离（欠费触发）；
CLONING，复制中；
UNKNOWN，未知状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 接入域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 接入IP。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 通道版本号：1.0，2.0，3.0。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * （新参数）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 1，该通道可缩扩容；0，该通道无法缩扩容。
    */
    @SerializedName("Scalarable")
    @Expose
    private Long Scalarable;

    /**
    * 支持的协议类型。
    */
    @SerializedName("SupportProtocols")
    @Expose
    private String [] SupportProtocols;

    /**
    * 通道组ID，当通道归属于某一通道组时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 安全策略ID，当设置了安全策略时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 接入地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessRegionInfo")
    @Expose
    private RegionDetail AccessRegionInfo;

    /**
    * 源站地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealServerRegionInfo")
    @Expose
    private RegionDetail RealServerRegionInfo;

    /**
    * 通道转发IP
    */
    @SerializedName("ForwardIP")
    @Expose
    private String ForwardIP;

    /**
    * 标签列表，不存在标签时，该字段为空列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
     * 获取（旧参数，请使用ProxyId）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @return InstanceId （旧参数，请使用ProxyId）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置（旧参数，请使用ProxyId）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId （旧参数，请使用ProxyId）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取创建时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     * @return CreateTime 创建时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     * @param CreateTime 创建时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取项目ID。
     * @return ProjectId 项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取通道名称。
     * @return ProxyName 通道名称。
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * 设置通道名称。
     * @param ProxyName 通道名称。
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * 获取接入地域。
     * @return AccessRegion 接入地域。
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * 设置接入地域。
     * @param AccessRegion 接入地域。
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * 获取源站地域。
     * @return RealServerRegion 源站地域。
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * 设置源站地域。
     * @param RealServerRegion 源站地域。
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * 获取带宽，单位：Mbps。
     * @return Bandwidth 带宽，单位：Mbps。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * 设置带宽，单位：Mbps。
     * @param Bandwidth 带宽，单位：Mbps。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * 获取并发，单位：个/秒。
     * @return Concurrent 并发，单位：个/秒。
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * 设置并发，单位：个/秒。
     * @param Concurrent 并发，单位：个/秒。
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    /**
     * 获取通道状态。其中：
RUNNING，运行中；
CREATING，创建中；
DESTROYING，销毁中；
OPENING，开启中；
CLOSING，关闭中；
CLOSED，已关闭；
ADJUSTING，配置变更中；
ISOLATING，隔离中（欠费触发）；
ISOLATED，已隔离（欠费触发）；
CLONING，复制中；
UNKNOWN，未知状态。
     * @return Status 通道状态。其中：
RUNNING，运行中；
CREATING，创建中；
DESTROYING，销毁中；
OPENING，开启中；
CLOSING，关闭中；
CLOSED，已关闭；
ADJUSTING，配置变更中；
ISOLATING，隔离中（欠费触发）；
ISOLATED，已隔离（欠费触发）；
CLONING，复制中；
UNKNOWN，未知状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置通道状态。其中：
RUNNING，运行中；
CREATING，创建中；
DESTROYING，销毁中；
OPENING，开启中；
CLOSING，关闭中；
CLOSED，已关闭；
ADJUSTING，配置变更中；
ISOLATING，隔离中（欠费触发）；
ISOLATED，已隔离（欠费触发）；
CLONING，复制中；
UNKNOWN，未知状态。
     * @param Status 通道状态。其中：
RUNNING，运行中；
CREATING，创建中；
DESTROYING，销毁中；
OPENING，开启中；
CLOSING，关闭中；
CLOSED，已关闭；
ADJUSTING，配置变更中；
ISOLATING，隔离中（欠费触发）；
ISOLATED，已隔离（欠费触发）；
CLONING，复制中；
UNKNOWN，未知状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取接入域名。
     * @return Domain 接入域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置接入域名。
     * @param Domain 接入域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取接入IP。
     * @return IP 接入IP。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * 设置接入IP。
     * @param IP 接入IP。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * 获取通道版本号：1.0，2.0，3.0。
     * @return Version 通道版本号：1.0，2.0，3.0。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * 设置通道版本号：1.0，2.0，3.0。
     * @param Version 通道版本号：1.0，2.0，3.0。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * 获取（新参数）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ProxyId （新参数）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * 设置（新参数）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyId （新参数）通道实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * 获取1，该通道可缩扩容；0，该通道无法缩扩容。
     * @return Scalarable 1，该通道可缩扩容；0，该通道无法缩扩容。
     */
    public Long getScalarable() {
        return this.Scalarable;
    }

    /**
     * 设置1，该通道可缩扩容；0，该通道无法缩扩容。
     * @param Scalarable 1，该通道可缩扩容；0，该通道无法缩扩容。
     */
    public void setScalarable(Long Scalarable) {
        this.Scalarable = Scalarable;
    }

    /**
     * 获取支持的协议类型。
     * @return SupportProtocols 支持的协议类型。
     */
    public String [] getSupportProtocols() {
        return this.SupportProtocols;
    }

    /**
     * 设置支持的协议类型。
     * @param SupportProtocols 支持的协议类型。
     */
    public void setSupportProtocols(String [] SupportProtocols) {
        this.SupportProtocols = SupportProtocols;
    }

    /**
     * 获取通道组ID，当通道归属于某一通道组时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @return GroupId 通道组ID，当通道归属于某一通道组时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * 设置通道组ID，当通道归属于某一通道组时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 通道组ID，当通道归属于某一通道组时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * 获取安全策略ID，当设置了安全策略时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @return PolicyId 安全策略ID，当设置了安全策略时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * 设置安全策略ID，当设置了安全策略时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyId 安全策略ID，当设置了安全策略时，存在该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * 获取接入地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AccessRegionInfo 接入地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegionDetail getAccessRegionInfo() {
        return this.AccessRegionInfo;
    }

    /**
     * 设置接入地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessRegionInfo 接入地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessRegionInfo(RegionDetail AccessRegionInfo) {
        this.AccessRegionInfo = AccessRegionInfo;
    }

    /**
     * 获取源站地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @return RealServerRegionInfo 源站地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegionDetail getRealServerRegionInfo() {
        return this.RealServerRegionInfo;
    }

    /**
     * 设置源站地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealServerRegionInfo 源站地域详细信息，包括地域ID和地域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealServerRegionInfo(RegionDetail RealServerRegionInfo) {
        this.RealServerRegionInfo = RealServerRegionInfo;
    }

    /**
     * 获取通道转发IP
     * @return ForwardIP 通道转发IP
     */
    public String getForwardIP() {
        return this.ForwardIP;
    }

    /**
     * 设置通道转发IP
     * @param ForwardIP 通道转发IP
     */
    public void setForwardIP(String ForwardIP) {
        this.ForwardIP = ForwardIP;
    }

    /**
     * 获取标签列表，不存在标签时，该字段为空列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @return TagSet 标签列表，不存在标签时，该字段为空列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * 设置标签列表，不存在标签时，该字段为空列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 标签列表，不存在标签时，该字段为空列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "RealServerRegion", this.RealServerRegion);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "Scalarable", this.Scalarable);
        this.setParamArraySimple(map, prefix + "SupportProtocols.", this.SupportProtocols);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamObj(map, prefix + "AccessRegionInfo.", this.AccessRegionInfo);
        this.setParamObj(map, prefix + "RealServerRegionInfo.", this.RealServerRegionInfo);
        this.setParamSimple(map, prefix + "ForwardIP", this.ForwardIP);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

