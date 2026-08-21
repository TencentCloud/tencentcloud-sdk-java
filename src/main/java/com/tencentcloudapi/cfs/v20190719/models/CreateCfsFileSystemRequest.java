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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCfsFileSystemRequest extends AbstractModel {

    /**
    * <p>可用区名称</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/213/15707?">查询可用区列表</a></p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>网络类型</p><p>枚举值：</p><ul><li><p>VPC： 私有网络</p></li><li><p>CCN： 云联网</p></li><li><p>通用标准型/性能型（含增强型）、吞吐型请选择VPC</p></li><li><p>Turbo标准型/性能型可选VPC或CCN</p></li><li><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS时无需传入，传入将被忽略。</p></li></ul>
    */
    @SerializedName("NetInterface")
    @Expose
    private String NetInterface;

    /**
    * <p>权限组 ID。权限组规定了一组可来访白名单及操作权限。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/38157">DescribeCfsPGroups</a></p><ul><li>pgroupbasic 为【默认权限组】，【默认权限组】允许所有IP地址访问及读写权限。 </li><li>注意：当 Scenario=AgentSandbox 时，即创建 AgentCFS ，必须传入 pgroupbasic【默认权限组】，传其他值报错。</li></ul>
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * <p>文件系统协议类型</p><p>枚举值：</p><ul><li>NFS： 通用标准型（含增强型）、通用性能型（含增强型）支持创建此协议的实例</li><li>CIFS： 即SMB协议，仅部分可用区的通用标准型、吞吐型支持此协议。</li><li>TURBO： Turbo标准型/Turbo性能型/AgentCFS是支持创建此协议的实例</li></ul><p>默认值：NFS</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>文件系统存储类型其中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p><p>枚举值：</p><ul><li>SD： 通用标准型（含增强型）。通用标准型 version = v1.5，通用标准型（增强型） version = v3.1。</li><li>HP： 通用性能型（含增强型）。通用性能型 version = v1.5，通用性能型（增强型） version = v3.1。</li><li>TB： Turbo标准型</li><li>TP： Turbo性能型</li><li>THP： 吞吐型</li></ul><p>默认值：SD</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/15778">查询VPC列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网 ID，若网络类型选择的是VPC，该字段为必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/15784">查询子网列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP，Turbo系列当前不支持指定</p>
    */
    @SerializedName("MountIP")
    @Expose
    private String MountIP;

    /**
    * <p>用户自定义文件系统名称</p>
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * <p>文件系统是否加密，若留空则默认为不加密</p>
    */
    @SerializedName("Encrypted")
    @Expose
    private Boolean Encrypted;

    /**
    * <p>文件系统标签</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
    * <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。用于保证请求幂等性的字符串失效时间为2小时。</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>云联网ID， 若网络类型选择的是CCN，该字段为必填</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/19199">查询CCN列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>云联网中CFS使用的网段， 若网络类型选择的是CCN，该字段为必填，且不能和Ccn中已经绑定的网段冲突</p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>文件系统容量，turbo系列必填</p><p>单位：GiB</p><p>Turbo标准型起售20TiB，即20480 GiB，扩容步长10TiB，即10240 GiB。Turbo性能型起售10TiB，即10240 GiB，扩容步长10TiB，即10240 GiB。</p>
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * <p>文件系统快照 ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/80206">DescribeCfsSnapshots</a></p>
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * <p>定期快照策略 ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/80208">DescribeAutoSnapshotPolicies</a></p>
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * <p>是否开启自动扩容策略，仅turbo类型文件存储支持</p>
    */
    @SerializedName("EnableAutoScaleUp")
    @Expose
    private Boolean EnableAutoScaleUp;

    /**
    * <p>文件系统版本号。</p><p>枚举值：</p><ul><li>v1.5： 创建通用标准型/通用性能型文件系统</li><li>v3.1： 创建通用标准型（增强型）/通用性能型（增强型）文件系统，如需创建增强型，此为必填项。</li><li>v4.0： 创建Turbo标准型、Turbo性能型、吞吐型文件系统，非必填项</li></ul><p>创建通用标准型（增强型）、通用性能型（增强型）须加白主账号，如需使用请联系我们。</p>
    */
    @SerializedName("CfsVersion")
    @Expose
    private String CfsVersion;

    /**
    * <p>turbo文件系统元数据类型</p><p>枚举值：</p><ul><li>basic： 创建标准版元数据。</li><li>enhanced： 创建增强版元数据</li></ul><p>详情参见<a href="https://cloud.tencent.com/document/product/582/116836">Turbo 文件系统元数据类型</a></p>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * <p>业务场景。</p><p>枚举值：</p><ul><li>AgentSandbox： 创建 AgentCFS 时必传</li></ul>
    */
    @SerializedName("Scenario")
    @Expose
    private String Scenario;

    /**
     * Get <p>可用区名称</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/213/15707?">查询可用区列表</a></p> 
     * @return Zone <p>可用区名称</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/213/15707?">查询可用区列表</a></p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区名称</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/213/15707?">查询可用区列表</a></p>
     * @param Zone <p>可用区名称</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/213/15707?">查询可用区列表</a></p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>网络类型</p><p>枚举值：</p><ul><li><p>VPC： 私有网络</p></li><li><p>CCN： 云联网</p></li><li><p>通用标准型/性能型（含增强型）、吞吐型请选择VPC</p></li><li><p>Turbo标准型/性能型可选VPC或CCN</p></li><li><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS时无需传入，传入将被忽略。</p></li></ul> 
     * @return NetInterface <p>网络类型</p><p>枚举值：</p><ul><li><p>VPC： 私有网络</p></li><li><p>CCN： 云联网</p></li><li><p>通用标准型/性能型（含增强型）、吞吐型请选择VPC</p></li><li><p>Turbo标准型/性能型可选VPC或CCN</p></li><li><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS时无需传入，传入将被忽略。</p></li></ul>
     */
    public String getNetInterface() {
        return this.NetInterface;
    }

    /**
     * Set <p>网络类型</p><p>枚举值：</p><ul><li><p>VPC： 私有网络</p></li><li><p>CCN： 云联网</p></li><li><p>通用标准型/性能型（含增强型）、吞吐型请选择VPC</p></li><li><p>Turbo标准型/性能型可选VPC或CCN</p></li><li><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS时无需传入，传入将被忽略。</p></li></ul>
     * @param NetInterface <p>网络类型</p><p>枚举值：</p><ul><li><p>VPC： 私有网络</p></li><li><p>CCN： 云联网</p></li><li><p>通用标准型/性能型（含增强型）、吞吐型请选择VPC</p></li><li><p>Turbo标准型/性能型可选VPC或CCN</p></li><li><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS时无需传入，传入将被忽略。</p></li></ul>
     */
    public void setNetInterface(String NetInterface) {
        this.NetInterface = NetInterface;
    }

    /**
     * Get <p>权限组 ID。权限组规定了一组可来访白名单及操作权限。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/38157">DescribeCfsPGroups</a></p><ul><li>pgroupbasic 为【默认权限组】，【默认权限组】允许所有IP地址访问及读写权限。 </li><li>注意：当 Scenario=AgentSandbox 时，即创建 AgentCFS ，必须传入 pgroupbasic【默认权限组】，传其他值报错。</li></ul> 
     * @return PGroupId <p>权限组 ID。权限组规定了一组可来访白名单及操作权限。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/38157">DescribeCfsPGroups</a></p><ul><li>pgroupbasic 为【默认权限组】，【默认权限组】允许所有IP地址访问及读写权限。 </li><li>注意：当 Scenario=AgentSandbox 时，即创建 AgentCFS ，必须传入 pgroupbasic【默认权限组】，传其他值报错。</li></ul>
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set <p>权限组 ID。权限组规定了一组可来访白名单及操作权限。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/38157">DescribeCfsPGroups</a></p><ul><li>pgroupbasic 为【默认权限组】，【默认权限组】允许所有IP地址访问及读写权限。 </li><li>注意：当 Scenario=AgentSandbox 时，即创建 AgentCFS ，必须传入 pgroupbasic【默认权限组】，传其他值报错。</li></ul>
     * @param PGroupId <p>权限组 ID。权限组规定了一组可来访白名单及操作权限。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/38157">DescribeCfsPGroups</a></p><ul><li>pgroupbasic 为【默认权限组】，【默认权限组】允许所有IP地址访问及读写权限。 </li><li>注意：当 Scenario=AgentSandbox 时，即创建 AgentCFS ，必须传入 pgroupbasic【默认权限组】，传其他值报错。</li></ul>
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get <p>文件系统协议类型</p><p>枚举值：</p><ul><li>NFS： 通用标准型（含增强型）、通用性能型（含增强型）支持创建此协议的实例</li><li>CIFS： 即SMB协议，仅部分可用区的通用标准型、吞吐型支持此协议。</li><li>TURBO： Turbo标准型/Turbo性能型/AgentCFS是支持创建此协议的实例</li></ul><p>默认值：NFS</p> 
     * @return Protocol <p>文件系统协议类型</p><p>枚举值：</p><ul><li>NFS： 通用标准型（含增强型）、通用性能型（含增强型）支持创建此协议的实例</li><li>CIFS： 即SMB协议，仅部分可用区的通用标准型、吞吐型支持此协议。</li><li>TURBO： Turbo标准型/Turbo性能型/AgentCFS是支持创建此协议的实例</li></ul><p>默认值：NFS</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>文件系统协议类型</p><p>枚举值：</p><ul><li>NFS： 通用标准型（含增强型）、通用性能型（含增强型）支持创建此协议的实例</li><li>CIFS： 即SMB协议，仅部分可用区的通用标准型、吞吐型支持此协议。</li><li>TURBO： Turbo标准型/Turbo性能型/AgentCFS是支持创建此协议的实例</li></ul><p>默认值：NFS</p>
     * @param Protocol <p>文件系统协议类型</p><p>枚举值：</p><ul><li>NFS： 通用标准型（含增强型）、通用性能型（含增强型）支持创建此协议的实例</li><li>CIFS： 即SMB协议，仅部分可用区的通用标准型、吞吐型支持此协议。</li><li>TURBO： Turbo标准型/Turbo性能型/AgentCFS是支持创建此协议的实例</li></ul><p>默认值：NFS</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>文件系统存储类型其中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p><p>枚举值：</p><ul><li>SD： 通用标准型（含增强型）。通用标准型 version = v1.5，通用标准型（增强型） version = v3.1。</li><li>HP： 通用性能型（含增强型）。通用性能型 version = v1.5，通用性能型（增强型） version = v3.1。</li><li>TB： Turbo标准型</li><li>TP： Turbo性能型</li><li>THP： 吞吐型</li></ul><p>默认值：SD</p> 
     * @return StorageType <p>文件系统存储类型其中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p><p>枚举值：</p><ul><li>SD： 通用标准型（含增强型）。通用标准型 version = v1.5，通用标准型（增强型） version = v3.1。</li><li>HP： 通用性能型（含增强型）。通用性能型 version = v1.5，通用性能型（增强型） version = v3.1。</li><li>TB： Turbo标准型</li><li>TP： Turbo性能型</li><li>THP： 吞吐型</li></ul><p>默认值：SD</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>文件系统存储类型其中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p><p>枚举值：</p><ul><li>SD： 通用标准型（含增强型）。通用标准型 version = v1.5，通用标准型（增强型） version = v3.1。</li><li>HP： 通用性能型（含增强型）。通用性能型 version = v1.5，通用性能型（增强型） version = v3.1。</li><li>TB： Turbo标准型</li><li>TP： Turbo性能型</li><li>THP： 吞吐型</li></ul><p>默认值：SD</p>
     * @param StorageType <p>文件系统存储类型其中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p><p>枚举值：</p><ul><li>SD： 通用标准型（含增强型）。通用标准型 version = v1.5，通用标准型（增强型） version = v3.1。</li><li>HP： 通用性能型（含增强型）。通用性能型 version = v1.5，通用性能型（增强型） version = v3.1。</li><li>TB： Turbo标准型</li><li>TP： Turbo性能型</li><li>THP： 吞吐型</li></ul><p>默认值：SD</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/15778">查询VPC列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略。</p> 
     * @return VpcId <p>私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/15778">查询VPC列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/15778">查询VPC列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略。</p>
     * @param VpcId <p>私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/15778">查询VPC列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网 ID，若网络类型选择的是VPC，该字段为必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/15784">查询子网列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略。</p> 
     * @return SubnetId <p>子网 ID，若网络类型选择的是VPC，该字段为必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/15784">查询子网列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID，若网络类型选择的是VPC，该字段为必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/15784">查询子网列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略。</p>
     * @param SubnetId <p>子网 ID，若网络类型选择的是VPC，该字段为必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/15784">查询子网列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP，Turbo系列当前不支持指定</p> 
     * @return MountIP <p>指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP，Turbo系列当前不支持指定</p>
     */
    public String getMountIP() {
        return this.MountIP;
    }

    /**
     * Set <p>指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP，Turbo系列当前不支持指定</p>
     * @param MountIP <p>指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP，Turbo系列当前不支持指定</p>
     */
    public void setMountIP(String MountIP) {
        this.MountIP = MountIP;
    }

    /**
     * Get <p>用户自定义文件系统名称</p> 
     * @return FsName <p>用户自定义文件系统名称</p>
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set <p>用户自定义文件系统名称</p>
     * @param FsName <p>用户自定义文件系统名称</p>
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get <p>文件系统是否加密，若留空则默认为不加密</p> 
     * @return Encrypted <p>文件系统是否加密，若留空则默认为不加密</p>
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set <p>文件系统是否加密，若留空则默认为不加密</p>
     * @param Encrypted <p>文件系统是否加密，若留空则默认为不加密</p>
     */
    public void setEncrypted(Boolean Encrypted) {
        this.Encrypted = Encrypted;
    }

    /**
     * Get <p>文件系统标签</p> 
     * @return ResourceTags <p>文件系统标签</p>
     */
    public TagInfo [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>文件系统标签</p>
     * @param ResourceTags <p>文件系统标签</p>
     */
    public void setResourceTags(TagInfo [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。用于保证请求幂等性的字符串失效时间为2小时。</p> 
     * @return ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。用于保证请求幂等性的字符串失效时间为2小时。</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。用于保证请求幂等性的字符串失效时间为2小时。</p>
     * @param ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。用于保证请求幂等性的字符串失效时间为2小时。</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>云联网ID， 若网络类型选择的是CCN，该字段为必填</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/19199">查询CCN列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略</p> 
     * @return CcnId <p>云联网ID， 若网络类型选择的是CCN，该字段为必填</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/19199">查询CCN列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略</p>
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>云联网ID， 若网络类型选择的是CCN，该字段为必填</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/19199">查询CCN列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略</p>
     * @param CcnId <p>云联网ID， 若网络类型选择的是CCN，该字段为必填</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/215/19199">查询CCN列表</a></p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略</p>
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>云联网中CFS使用的网段， 若网络类型选择的是CCN，该字段为必填，且不能和Ccn中已经绑定的网段冲突</p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略</p> 
     * @return CidrBlock <p>云联网中CFS使用的网段， 若网络类型选择的是CCN，该字段为必填，且不能和Ccn中已经绑定的网段冲突</p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>云联网中CFS使用的网段， 若网络类型选择的是CCN，该字段为必填，且不能和Ccn中已经绑定的网段冲突</p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略</p>
     * @param CidrBlock <p>云联网中CFS使用的网段， 若网络类型选择的是CCN，该字段为必填，且不能和Ccn中已经绑定的网段冲突</p><p>当 Scenario=AgentSandbox 时，即创建 AgentCFS 时无需传入，传入将被忽略</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>文件系统容量，turbo系列必填</p><p>单位：GiB</p><p>Turbo标准型起售20TiB，即20480 GiB，扩容步长10TiB，即10240 GiB。Turbo性能型起售10TiB，即10240 GiB，扩容步长10TiB，即10240 GiB。</p> 
     * @return Capacity <p>文件系统容量，turbo系列必填</p><p>单位：GiB</p><p>Turbo标准型起售20TiB，即20480 GiB，扩容步长10TiB，即10240 GiB。Turbo性能型起售10TiB，即10240 GiB，扩容步长10TiB，即10240 GiB。</p>
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set <p>文件系统容量，turbo系列必填</p><p>单位：GiB</p><p>Turbo标准型起售20TiB，即20480 GiB，扩容步长10TiB，即10240 GiB。Turbo性能型起售10TiB，即10240 GiB，扩容步长10TiB，即10240 GiB。</p>
     * @param Capacity <p>文件系统容量，turbo系列必填</p><p>单位：GiB</p><p>Turbo标准型起售20TiB，即20480 GiB，扩容步长10TiB，即10240 GiB。Turbo性能型起售10TiB，即10240 GiB，扩容步长10TiB，即10240 GiB。</p>
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get <p>文件系统快照 ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/80206">DescribeCfsSnapshots</a></p> 
     * @return SnapshotId <p>文件系统快照 ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/80206">DescribeCfsSnapshots</a></p>
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>文件系统快照 ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/80206">DescribeCfsSnapshots</a></p>
     * @param SnapshotId <p>文件系统快照 ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/80206">DescribeCfsSnapshots</a></p>
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <p>定期快照策略 ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/80208">DescribeAutoSnapshotPolicies</a></p> 
     * @return AutoSnapshotPolicyId <p>定期快照策略 ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/80208">DescribeAutoSnapshotPolicies</a></p>
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set <p>定期快照策略 ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/80208">DescribeAutoSnapshotPolicies</a></p>
     * @param AutoSnapshotPolicyId <p>定期快照策略 ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/582/80208">DescribeAutoSnapshotPolicies</a></p>
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get <p>是否开启自动扩容策略，仅turbo类型文件存储支持</p> 
     * @return EnableAutoScaleUp <p>是否开启自动扩容策略，仅turbo类型文件存储支持</p>
     */
    public Boolean getEnableAutoScaleUp() {
        return this.EnableAutoScaleUp;
    }

    /**
     * Set <p>是否开启自动扩容策略，仅turbo类型文件存储支持</p>
     * @param EnableAutoScaleUp <p>是否开启自动扩容策略，仅turbo类型文件存储支持</p>
     */
    public void setEnableAutoScaleUp(Boolean EnableAutoScaleUp) {
        this.EnableAutoScaleUp = EnableAutoScaleUp;
    }

    /**
     * Get <p>文件系统版本号。</p><p>枚举值：</p><ul><li>v1.5： 创建通用标准型/通用性能型文件系统</li><li>v3.1： 创建通用标准型（增强型）/通用性能型（增强型）文件系统，如需创建增强型，此为必填项。</li><li>v4.0： 创建Turbo标准型、Turbo性能型、吞吐型文件系统，非必填项</li></ul><p>创建通用标准型（增强型）、通用性能型（增强型）须加白主账号，如需使用请联系我们。</p> 
     * @return CfsVersion <p>文件系统版本号。</p><p>枚举值：</p><ul><li>v1.5： 创建通用标准型/通用性能型文件系统</li><li>v3.1： 创建通用标准型（增强型）/通用性能型（增强型）文件系统，如需创建增强型，此为必填项。</li><li>v4.0： 创建Turbo标准型、Turbo性能型、吞吐型文件系统，非必填项</li></ul><p>创建通用标准型（增强型）、通用性能型（增强型）须加白主账号，如需使用请联系我们。</p>
     */
    public String getCfsVersion() {
        return this.CfsVersion;
    }

    /**
     * Set <p>文件系统版本号。</p><p>枚举值：</p><ul><li>v1.5： 创建通用标准型/通用性能型文件系统</li><li>v3.1： 创建通用标准型（增强型）/通用性能型（增强型）文件系统，如需创建增强型，此为必填项。</li><li>v4.0： 创建Turbo标准型、Turbo性能型、吞吐型文件系统，非必填项</li></ul><p>创建通用标准型（增强型）、通用性能型（增强型）须加白主账号，如需使用请联系我们。</p>
     * @param CfsVersion <p>文件系统版本号。</p><p>枚举值：</p><ul><li>v1.5： 创建通用标准型/通用性能型文件系统</li><li>v3.1： 创建通用标准型（增强型）/通用性能型（增强型）文件系统，如需创建增强型，此为必填项。</li><li>v4.0： 创建Turbo标准型、Turbo性能型、吞吐型文件系统，非必填项</li></ul><p>创建通用标准型（增强型）、通用性能型（增强型）须加白主账号，如需使用请联系我们。</p>
     */
    public void setCfsVersion(String CfsVersion) {
        this.CfsVersion = CfsVersion;
    }

    /**
     * Get <p>turbo文件系统元数据类型</p><p>枚举值：</p><ul><li>basic： 创建标准版元数据。</li><li>enhanced： 创建增强版元数据</li></ul><p>详情参见<a href="https://cloud.tencent.com/document/product/582/116836">Turbo 文件系统元数据类型</a></p> 
     * @return MetaType <p>turbo文件系统元数据类型</p><p>枚举值：</p><ul><li>basic： 创建标准版元数据。</li><li>enhanced： 创建增强版元数据</li></ul><p>详情参见<a href="https://cloud.tencent.com/document/product/582/116836">Turbo 文件系统元数据类型</a></p>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set <p>turbo文件系统元数据类型</p><p>枚举值：</p><ul><li>basic： 创建标准版元数据。</li><li>enhanced： 创建增强版元数据</li></ul><p>详情参见<a href="https://cloud.tencent.com/document/product/582/116836">Turbo 文件系统元数据类型</a></p>
     * @param MetaType <p>turbo文件系统元数据类型</p><p>枚举值：</p><ul><li>basic： 创建标准版元数据。</li><li>enhanced： 创建增强版元数据</li></ul><p>详情参见<a href="https://cloud.tencent.com/document/product/582/116836">Turbo 文件系统元数据类型</a></p>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get <p>业务场景。</p><p>枚举值：</p><ul><li>AgentSandbox： 创建 AgentCFS 时必传</li></ul> 
     * @return Scenario <p>业务场景。</p><p>枚举值：</p><ul><li>AgentSandbox： 创建 AgentCFS 时必传</li></ul>
     */
    public String getScenario() {
        return this.Scenario;
    }

    /**
     * Set <p>业务场景。</p><p>枚举值：</p><ul><li>AgentSandbox： 创建 AgentCFS 时必传</li></ul>
     * @param Scenario <p>业务场景。</p><p>枚举值：</p><ul><li>AgentSandbox： 创建 AgentCFS 时必传</li></ul>
     */
    public void setScenario(String Scenario) {
        this.Scenario = Scenario;
    }

    public CreateCfsFileSystemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCfsFileSystemRequest(CreateCfsFileSystemRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NetInterface != null) {
            this.NetInterface = new String(source.NetInterface);
        }
        if (source.PGroupId != null) {
            this.PGroupId = new String(source.PGroupId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.MountIP != null) {
            this.MountIP = new String(source.MountIP);
        }
        if (source.FsName != null) {
            this.FsName = new String(source.FsName);
        }
        if (source.Encrypted != null) {
            this.Encrypted = new Boolean(source.Encrypted);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new TagInfo[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new TagInfo(source.ResourceTags[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
        if (source.EnableAutoScaleUp != null) {
            this.EnableAutoScaleUp = new Boolean(source.EnableAutoScaleUp);
        }
        if (source.CfsVersion != null) {
            this.CfsVersion = new String(source.CfsVersion);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.Scenario != null) {
            this.Scenario = new String(source.Scenario);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NetInterface", this.NetInterface);
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "MountIP", this.MountIP);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamSimple(map, prefix + "Encrypted", this.Encrypted);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamSimple(map, prefix + "EnableAutoScaleUp", this.EnableAutoScaleUp);
        this.setParamSimple(map, prefix + "CfsVersion", this.CfsVersion);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "Scenario", this.Scenario);

    }
}

