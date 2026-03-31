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
    * <p>可用区名称，例如ap-beijing-1，请参考 <a href="https://cloud.tencent.com/document/product/582/13225">概览</a> 文档中的地域与可用区列表</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>网络类型，可选值为 VPC，CCN；其中 VPC 为私有网络， CCN 为云联网。通用标准型/性能型请选择VPC，Turbo标准型/性能型请选择CCN。</p>
    */
    @SerializedName("NetInterface")
    @Expose
    private String NetInterface;

    /**
    * <p>权限组 ID,pgroupbasic 是默认权限组，通过控制查询权限组列表接口获取<a href="https://cloud.tencent.com/document/product/582/38157">DescribeCfsPGroups</a></p>
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * <p>文件系统协议类型， 值为 NFS、CIFS、TURBO ; 若留空则默认为 NFS协议，turbo系列必须选择TURBO，不支持NFS、CIFS</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>文件系统存储类型，默认值为 SD ；其中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填.通过查询私有网络接口获取，<br><a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a></p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网 ID，若网络类型选择的是VPC，该字段为必填。通过查询子网接口获取，<br><a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a></p>
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
    * <p>云联网ID， 若网络类型选择的是CCN，该字段为必填;通过查询云联网列表接口获取，通过接口<br><a href="https://cloud.tencent.com/document/product/215/19199">DescribeCcns</a></p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>云联网中CFS使用的网段， 若网络类型选择的是Ccn，该字段为必填，且不能和Ccn中已经绑定的网段冲突</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>文件系统容量，turbo系列必填，单位为GiB。 turbo标准型单位GB，起售20TiB，即20480 GiB；扩容步长10TiB，即10240 GiB。turbo性能型起售10TiB，即10240 GiB；扩容步长10TiB，10240 GiB。</p>
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * <p>文件系统快照ID，通过查询快照列表获取该参数，<br><a href="https://cloud.tencent.com/document/product/582/80206">DescribeCfsSnapshots</a></p>
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * <p>定期快照策略ID，通过查询快照策略信息获取,<br><a href="https://cloud.tencent.com/document/product/582/38157">DescribeAutoSnapshotPolicies</a></p>
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * <p>是否开启默认扩容，仅turbo类型文件存储支持</p>
    */
    @SerializedName("EnableAutoScaleUp")
    @Expose
    private Boolean EnableAutoScaleUp;

    /**
    * <p>v1.5：创建普通版的通用文件系统；<br>v3.1：创建增强版的通用文件系统<br>说明：增强版的通用系统需要开通白名单才能使用，如有需要请提交工单与我们联系。</p>
    */
    @SerializedName("CfsVersion")
    @Expose
    private String CfsVersion;

    /**
    * <p>turbo文件系统元数据属性<br>basic：创建标准型的元数据<br>enhanced：创建增强型的元数据</p>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
     * Get <p>可用区名称，例如ap-beijing-1，请参考 <a href="https://cloud.tencent.com/document/product/582/13225">概览</a> 文档中的地域与可用区列表</p> 
     * @return Zone <p>可用区名称，例如ap-beijing-1，请参考 <a href="https://cloud.tencent.com/document/product/582/13225">概览</a> 文档中的地域与可用区列表</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区名称，例如ap-beijing-1，请参考 <a href="https://cloud.tencent.com/document/product/582/13225">概览</a> 文档中的地域与可用区列表</p>
     * @param Zone <p>可用区名称，例如ap-beijing-1，请参考 <a href="https://cloud.tencent.com/document/product/582/13225">概览</a> 文档中的地域与可用区列表</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>网络类型，可选值为 VPC，CCN；其中 VPC 为私有网络， CCN 为云联网。通用标准型/性能型请选择VPC，Turbo标准型/性能型请选择CCN。</p> 
     * @return NetInterface <p>网络类型，可选值为 VPC，CCN；其中 VPC 为私有网络， CCN 为云联网。通用标准型/性能型请选择VPC，Turbo标准型/性能型请选择CCN。</p>
     */
    public String getNetInterface() {
        return this.NetInterface;
    }

    /**
     * Set <p>网络类型，可选值为 VPC，CCN；其中 VPC 为私有网络， CCN 为云联网。通用标准型/性能型请选择VPC，Turbo标准型/性能型请选择CCN。</p>
     * @param NetInterface <p>网络类型，可选值为 VPC，CCN；其中 VPC 为私有网络， CCN 为云联网。通用标准型/性能型请选择VPC，Turbo标准型/性能型请选择CCN。</p>
     */
    public void setNetInterface(String NetInterface) {
        this.NetInterface = NetInterface;
    }

    /**
     * Get <p>权限组 ID,pgroupbasic 是默认权限组，通过控制查询权限组列表接口获取<a href="https://cloud.tencent.com/document/product/582/38157">DescribeCfsPGroups</a></p> 
     * @return PGroupId <p>权限组 ID,pgroupbasic 是默认权限组，通过控制查询权限组列表接口获取<a href="https://cloud.tencent.com/document/product/582/38157">DescribeCfsPGroups</a></p>
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set <p>权限组 ID,pgroupbasic 是默认权限组，通过控制查询权限组列表接口获取<a href="https://cloud.tencent.com/document/product/582/38157">DescribeCfsPGroups</a></p>
     * @param PGroupId <p>权限组 ID,pgroupbasic 是默认权限组，通过控制查询权限组列表接口获取<a href="https://cloud.tencent.com/document/product/582/38157">DescribeCfsPGroups</a></p>
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get <p>文件系统协议类型， 值为 NFS、CIFS、TURBO ; 若留空则默认为 NFS协议，turbo系列必须选择TURBO，不支持NFS、CIFS</p> 
     * @return Protocol <p>文件系统协议类型， 值为 NFS、CIFS、TURBO ; 若留空则默认为 NFS协议，turbo系列必须选择TURBO，不支持NFS、CIFS</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>文件系统协议类型， 值为 NFS、CIFS、TURBO ; 若留空则默认为 NFS协议，turbo系列必须选择TURBO，不支持NFS、CIFS</p>
     * @param Protocol <p>文件系统协议类型， 值为 NFS、CIFS、TURBO ; 若留空则默认为 NFS协议，turbo系列必须选择TURBO，不支持NFS、CIFS</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>文件系统存储类型，默认值为 SD ；其中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p> 
     * @return StorageType <p>文件系统存储类型，默认值为 SD ；其中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>文件系统存储类型，默认值为 SD ；其中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p>
     * @param StorageType <p>文件系统存储类型，默认值为 SD ；其中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填.通过查询私有网络接口获取，<br><a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a></p> 
     * @return VpcId <p>私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填.通过查询私有网络接口获取，<br><a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a></p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填.通过查询私有网络接口获取，<br><a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a></p>
     * @param VpcId <p>私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填.通过查询私有网络接口获取，<br><a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a></p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网 ID，若网络类型选择的是VPC，该字段为必填。通过查询子网接口获取，<br><a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a></p> 
     * @return SubnetId <p>子网 ID，若网络类型选择的是VPC，该字段为必填。通过查询子网接口获取，<br><a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a></p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID，若网络类型选择的是VPC，该字段为必填。通过查询子网接口获取，<br><a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a></p>
     * @param SubnetId <p>子网 ID，若网络类型选择的是VPC，该字段为必填。通过查询子网接口获取，<br><a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a></p>
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
     * Get <p>云联网ID， 若网络类型选择的是CCN，该字段为必填;通过查询云联网列表接口获取，通过接口<br><a href="https://cloud.tencent.com/document/product/215/19199">DescribeCcns</a></p> 
     * @return CcnId <p>云联网ID， 若网络类型选择的是CCN，该字段为必填;通过查询云联网列表接口获取，通过接口<br><a href="https://cloud.tencent.com/document/product/215/19199">DescribeCcns</a></p>
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>云联网ID， 若网络类型选择的是CCN，该字段为必填;通过查询云联网列表接口获取，通过接口<br><a href="https://cloud.tencent.com/document/product/215/19199">DescribeCcns</a></p>
     * @param CcnId <p>云联网ID， 若网络类型选择的是CCN，该字段为必填;通过查询云联网列表接口获取，通过接口<br><a href="https://cloud.tencent.com/document/product/215/19199">DescribeCcns</a></p>
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>云联网中CFS使用的网段， 若网络类型选择的是Ccn，该字段为必填，且不能和Ccn中已经绑定的网段冲突</p> 
     * @return CidrBlock <p>云联网中CFS使用的网段， 若网络类型选择的是Ccn，该字段为必填，且不能和Ccn中已经绑定的网段冲突</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>云联网中CFS使用的网段， 若网络类型选择的是Ccn，该字段为必填，且不能和Ccn中已经绑定的网段冲突</p>
     * @param CidrBlock <p>云联网中CFS使用的网段， 若网络类型选择的是Ccn，该字段为必填，且不能和Ccn中已经绑定的网段冲突</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>文件系统容量，turbo系列必填，单位为GiB。 turbo标准型单位GB，起售20TiB，即20480 GiB；扩容步长10TiB，即10240 GiB。turbo性能型起售10TiB，即10240 GiB；扩容步长10TiB，10240 GiB。</p> 
     * @return Capacity <p>文件系统容量，turbo系列必填，单位为GiB。 turbo标准型单位GB，起售20TiB，即20480 GiB；扩容步长10TiB，即10240 GiB。turbo性能型起售10TiB，即10240 GiB；扩容步长10TiB，10240 GiB。</p>
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set <p>文件系统容量，turbo系列必填，单位为GiB。 turbo标准型单位GB，起售20TiB，即20480 GiB；扩容步长10TiB，即10240 GiB。turbo性能型起售10TiB，即10240 GiB；扩容步长10TiB，10240 GiB。</p>
     * @param Capacity <p>文件系统容量，turbo系列必填，单位为GiB。 turbo标准型单位GB，起售20TiB，即20480 GiB；扩容步长10TiB，即10240 GiB。turbo性能型起售10TiB，即10240 GiB；扩容步长10TiB，10240 GiB。</p>
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get <p>文件系统快照ID，通过查询快照列表获取该参数，<br><a href="https://cloud.tencent.com/document/product/582/80206">DescribeCfsSnapshots</a></p> 
     * @return SnapshotId <p>文件系统快照ID，通过查询快照列表获取该参数，<br><a href="https://cloud.tencent.com/document/product/582/80206">DescribeCfsSnapshots</a></p>
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>文件系统快照ID，通过查询快照列表获取该参数，<br><a href="https://cloud.tencent.com/document/product/582/80206">DescribeCfsSnapshots</a></p>
     * @param SnapshotId <p>文件系统快照ID，通过查询快照列表获取该参数，<br><a href="https://cloud.tencent.com/document/product/582/80206">DescribeCfsSnapshots</a></p>
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <p>定期快照策略ID，通过查询快照策略信息获取,<br><a href="https://cloud.tencent.com/document/product/582/38157">DescribeAutoSnapshotPolicies</a></p> 
     * @return AutoSnapshotPolicyId <p>定期快照策略ID，通过查询快照策略信息获取,<br><a href="https://cloud.tencent.com/document/product/582/38157">DescribeAutoSnapshotPolicies</a></p>
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set <p>定期快照策略ID，通过查询快照策略信息获取,<br><a href="https://cloud.tencent.com/document/product/582/38157">DescribeAutoSnapshotPolicies</a></p>
     * @param AutoSnapshotPolicyId <p>定期快照策略ID，通过查询快照策略信息获取,<br><a href="https://cloud.tencent.com/document/product/582/38157">DescribeAutoSnapshotPolicies</a></p>
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get <p>是否开启默认扩容，仅turbo类型文件存储支持</p> 
     * @return EnableAutoScaleUp <p>是否开启默认扩容，仅turbo类型文件存储支持</p>
     */
    public Boolean getEnableAutoScaleUp() {
        return this.EnableAutoScaleUp;
    }

    /**
     * Set <p>是否开启默认扩容，仅turbo类型文件存储支持</p>
     * @param EnableAutoScaleUp <p>是否开启默认扩容，仅turbo类型文件存储支持</p>
     */
    public void setEnableAutoScaleUp(Boolean EnableAutoScaleUp) {
        this.EnableAutoScaleUp = EnableAutoScaleUp;
    }

    /**
     * Get <p>v1.5：创建普通版的通用文件系统；<br>v3.1：创建增强版的通用文件系统<br>说明：增强版的通用系统需要开通白名单才能使用，如有需要请提交工单与我们联系。</p> 
     * @return CfsVersion <p>v1.5：创建普通版的通用文件系统；<br>v3.1：创建增强版的通用文件系统<br>说明：增强版的通用系统需要开通白名单才能使用，如有需要请提交工单与我们联系。</p>
     */
    public String getCfsVersion() {
        return this.CfsVersion;
    }

    /**
     * Set <p>v1.5：创建普通版的通用文件系统；<br>v3.1：创建增强版的通用文件系统<br>说明：增强版的通用系统需要开通白名单才能使用，如有需要请提交工单与我们联系。</p>
     * @param CfsVersion <p>v1.5：创建普通版的通用文件系统；<br>v3.1：创建增强版的通用文件系统<br>说明：增强版的通用系统需要开通白名单才能使用，如有需要请提交工单与我们联系。</p>
     */
    public void setCfsVersion(String CfsVersion) {
        this.CfsVersion = CfsVersion;
    }

    /**
     * Get <p>turbo文件系统元数据属性<br>basic：创建标准型的元数据<br>enhanced：创建增强型的元数据</p> 
     * @return MetaType <p>turbo文件系统元数据属性<br>basic：创建标准型的元数据<br>enhanced：创建增强型的元数据</p>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set <p>turbo文件系统元数据属性<br>basic：创建标准型的元数据<br>enhanced：创建增强型的元数据</p>
     * @param MetaType <p>turbo文件系统元数据属性<br>basic：创建标准型的元数据<br>enhanced：创建增强型的元数据</p>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
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

    }
}

