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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancesRequest extends AbstractModel {

    /**
    * 实例类型。<li>  S3L.MEDIUM4: 云桌面-标准S3_2核4G </li><li> S3L.LARGE8: 云桌面-标准S3_4核8G </li><li> S3L.LARGE16: 云桌面-标准S3_4核16G </li><li> S3L.2XLARGE16: 云桌面-标准S3_8核16G </li><li> S1L.LARGE8：云桌面-标准S1_4核8G </li><li> S1L.LARGE16：标准S1_4核16G </li><li> S2L.2XLARGE16：标准S2_8核16G </li><li> G1L.LARGE16：图形G1_4核16G  </li><li> G1L.2XLARGE32：图形G1_8核32G </li><li> G1L.4XLARGE64：图形G1_16核64G </li><li> G2L.LARGE24: 云桌面-图形G2_6核24G </li><li> G2L.3XLARGE58: 云桌面-图形G2_14核58G </li><li> G2L.3XLARGE44: 云桌面-图形G2_12核44G </li><li> G3L.LARGE16: 云桌面-图形G3_4核16G </li><li> G3L.5XMEDIUM40: 云桌面-图形G3_10核40G </li><li> G3L.5XLARGE80: 云桌面-图形G3_20核80G </li><li> G4L.5XMEDIUM40: 云桌面-图形G4_10核40G </li><li> G4L.11XMEDIUM80: 云桌面-图形G4_22核80G </li><li> G4L.11XLARGE160: 云桌面-图形G4_44核160G </li><li> G5L.5XMEDIUM40: 云桌面-图形G5_10核40G </li><li> G5L.5XLARGE80: 云桌面-图形G5_22核80G </li><li> G5L.21XMEDIUM160: 云桌面-图形G5_42核160G </li><li> G5L.21XLARGE320: 云桌面-图形G5_84核320G </li>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 系统盘信息
    */
    @SerializedName("SystemDisk")
    @Expose
    private Disk SystemDisk;

    /**
    * 镜像ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * 实例显示名称。
<li> 如果该字段为空，则采用默认格式：云桌面型号+月日+三位随机数+镜像ID。</li>
<li> 购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server_{R:3}，购买1台时，实例显示名称为server_3；购买2台时，实例显示名称分别为server_3，server_4。支持指定多个模式串{R:x}。</li>
<li> 购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server_1，server_2。</li>
<li> 最多支持60个字符（包含模式串）。</li>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 购买实例数量。取值范围[1,50]。默认为1
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 数据盘信息。目前只支持一块数据盘。
    */
    @SerializedName("DataDisks")
    @Expose
    private Disk [] DataDisks;

    /**
    * 实例计费类型。
<li> PREPAID：预付费，即包年包月</li>
<li> POSTPAID_BY_HOUR：按小时后付费</li>
默认为PREPAID
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
    */
    @SerializedName("ChargePrepaid")
    @Expose
    private ChargePrepaid ChargePrepaid;

    /**
    * 是否只预检此次请求。
<li> true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。
如果检查通过，则返回的错误码为DryRunOperation；如果返回其他错误码表示检查没有通过；</li>
<li> false（默认）：发送正常请求，通过检查后直接创建实例</li>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 允许绑定用户前的匿名访问。默认值：false。
    */
    @SerializedName("AnonymousAccess")
    @Expose
    private Boolean AnonymousAccess;

    /**
    * 关联的安全组ID列表
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * 桌面池ID
    */
    @SerializedName("PoolId")
    @Expose
    private String PoolId;

    /**
    * 域名管控策略ID
    */
    @SerializedName("DomainControlPolicies")
    @Expose
    private String [] DomainControlPolicies;

    /**
    * 标签，最多10个
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 实例类型。<li>  S3L.MEDIUM4: 云桌面-标准S3_2核4G </li><li> S3L.LARGE8: 云桌面-标准S3_4核8G </li><li> S3L.LARGE16: 云桌面-标准S3_4核16G </li><li> S3L.2XLARGE16: 云桌面-标准S3_8核16G </li><li> S1L.LARGE8：云桌面-标准S1_4核8G </li><li> S1L.LARGE16：标准S1_4核16G </li><li> S2L.2XLARGE16：标准S2_8核16G </li><li> G1L.LARGE16：图形G1_4核16G  </li><li> G1L.2XLARGE32：图形G1_8核32G </li><li> G1L.4XLARGE64：图形G1_16核64G </li><li> G2L.LARGE24: 云桌面-图形G2_6核24G </li><li> G2L.3XLARGE58: 云桌面-图形G2_14核58G </li><li> G2L.3XLARGE44: 云桌面-图形G2_12核44G </li><li> G3L.LARGE16: 云桌面-图形G3_4核16G </li><li> G3L.5XMEDIUM40: 云桌面-图形G3_10核40G </li><li> G3L.5XLARGE80: 云桌面-图形G3_20核80G </li><li> G4L.5XMEDIUM40: 云桌面-图形G4_10核40G </li><li> G4L.11XMEDIUM80: 云桌面-图形G4_22核80G </li><li> G4L.11XLARGE160: 云桌面-图形G4_44核160G </li><li> G5L.5XMEDIUM40: 云桌面-图形G5_10核40G </li><li> G5L.5XLARGE80: 云桌面-图形G5_22核80G </li><li> G5L.21XMEDIUM160: 云桌面-图形G5_42核160G </li><li> G5L.21XLARGE320: 云桌面-图形G5_84核320G </li> 
     * @return InstanceType 实例类型。<li>  S3L.MEDIUM4: 云桌面-标准S3_2核4G </li><li> S3L.LARGE8: 云桌面-标准S3_4核8G </li><li> S3L.LARGE16: 云桌面-标准S3_4核16G </li><li> S3L.2XLARGE16: 云桌面-标准S3_8核16G </li><li> S1L.LARGE8：云桌面-标准S1_4核8G </li><li> S1L.LARGE16：标准S1_4核16G </li><li> S2L.2XLARGE16：标准S2_8核16G </li><li> G1L.LARGE16：图形G1_4核16G  </li><li> G1L.2XLARGE32：图形G1_8核32G </li><li> G1L.4XLARGE64：图形G1_16核64G </li><li> G2L.LARGE24: 云桌面-图形G2_6核24G </li><li> G2L.3XLARGE58: 云桌面-图形G2_14核58G </li><li> G2L.3XLARGE44: 云桌面-图形G2_12核44G </li><li> G3L.LARGE16: 云桌面-图形G3_4核16G </li><li> G3L.5XMEDIUM40: 云桌面-图形G3_10核40G </li><li> G3L.5XLARGE80: 云桌面-图形G3_20核80G </li><li> G4L.5XMEDIUM40: 云桌面-图形G4_10核40G </li><li> G4L.11XMEDIUM80: 云桌面-图形G4_22核80G </li><li> G4L.11XLARGE160: 云桌面-图形G4_44核160G </li><li> G5L.5XMEDIUM40: 云桌面-图形G5_10核40G </li><li> G5L.5XLARGE80: 云桌面-图形G5_22核80G </li><li> G5L.21XMEDIUM160: 云桌面-图形G5_42核160G </li><li> G5L.21XLARGE320: 云桌面-图形G5_84核320G </li>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型。<li>  S3L.MEDIUM4: 云桌面-标准S3_2核4G </li><li> S3L.LARGE8: 云桌面-标准S3_4核8G </li><li> S3L.LARGE16: 云桌面-标准S3_4核16G </li><li> S3L.2XLARGE16: 云桌面-标准S3_8核16G </li><li> S1L.LARGE8：云桌面-标准S1_4核8G </li><li> S1L.LARGE16：标准S1_4核16G </li><li> S2L.2XLARGE16：标准S2_8核16G </li><li> G1L.LARGE16：图形G1_4核16G  </li><li> G1L.2XLARGE32：图形G1_8核32G </li><li> G1L.4XLARGE64：图形G1_16核64G </li><li> G2L.LARGE24: 云桌面-图形G2_6核24G </li><li> G2L.3XLARGE58: 云桌面-图形G2_14核58G </li><li> G2L.3XLARGE44: 云桌面-图形G2_12核44G </li><li> G3L.LARGE16: 云桌面-图形G3_4核16G </li><li> G3L.5XMEDIUM40: 云桌面-图形G3_10核40G </li><li> G3L.5XLARGE80: 云桌面-图形G3_20核80G </li><li> G4L.5XMEDIUM40: 云桌面-图形G4_10核40G </li><li> G4L.11XMEDIUM80: 云桌面-图形G4_22核80G </li><li> G4L.11XLARGE160: 云桌面-图形G4_44核160G </li><li> G5L.5XMEDIUM40: 云桌面-图形G5_10核40G </li><li> G5L.5XLARGE80: 云桌面-图形G5_22核80G </li><li> G5L.21XMEDIUM160: 云桌面-图形G5_42核160G </li><li> G5L.21XLARGE320: 云桌面-图形G5_84核320G </li>
     * @param InstanceType 实例类型。<li>  S3L.MEDIUM4: 云桌面-标准S3_2核4G </li><li> S3L.LARGE8: 云桌面-标准S3_4核8G </li><li> S3L.LARGE16: 云桌面-标准S3_4核16G </li><li> S3L.2XLARGE16: 云桌面-标准S3_8核16G </li><li> S1L.LARGE8：云桌面-标准S1_4核8G </li><li> S1L.LARGE16：标准S1_4核16G </li><li> S2L.2XLARGE16：标准S2_8核16G </li><li> G1L.LARGE16：图形G1_4核16G  </li><li> G1L.2XLARGE32：图形G1_8核32G </li><li> G1L.4XLARGE64：图形G1_16核64G </li><li> G2L.LARGE24: 云桌面-图形G2_6核24G </li><li> G2L.3XLARGE58: 云桌面-图形G2_14核58G </li><li> G2L.3XLARGE44: 云桌面-图形G2_12核44G </li><li> G3L.LARGE16: 云桌面-图形G3_4核16G </li><li> G3L.5XMEDIUM40: 云桌面-图形G3_10核40G </li><li> G3L.5XLARGE80: 云桌面-图形G3_20核80G </li><li> G4L.5XMEDIUM40: 云桌面-图形G4_10核40G </li><li> G4L.11XMEDIUM80: 云桌面-图形G4_22核80G </li><li> G4L.11XLARGE160: 云桌面-图形G4_44核160G </li><li> G5L.5XMEDIUM40: 云桌面-图形G5_10核40G </li><li> G5L.5XLARGE80: 云桌面-图形G5_22核80G </li><li> G5L.21XMEDIUM160: 云桌面-图形G5_42核160G </li><li> G5L.21XLARGE320: 云桌面-图形G5_84核320G </li>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 系统盘信息 
     * @return SystemDisk 系统盘信息
     */
    public Disk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 系统盘信息
     * @param SystemDisk 系统盘信息
     */
    public void setSystemDisk(Disk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 镜像ID 
     * @return ImageId 镜像ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID
     * @param ImageId 镜像ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。 
     * @return VirtualPrivateCloud 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
     * @param VirtualPrivateCloud 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get 实例显示名称。
<li> 如果该字段为空，则采用默认格式：云桌面型号+月日+三位随机数+镜像ID。</li>
<li> 购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server_{R:3}，购买1台时，实例显示名称为server_3；购买2台时，实例显示名称分别为server_3，server_4。支持指定多个模式串{R:x}。</li>
<li> 购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server_1，server_2。</li>
<li> 最多支持60个字符（包含模式串）。</li> 
     * @return InstanceName 实例显示名称。
<li> 如果该字段为空，则采用默认格式：云桌面型号+月日+三位随机数+镜像ID。</li>
<li> 购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server_{R:3}，购买1台时，实例显示名称为server_3；购买2台时，实例显示名称分别为server_3，server_4。支持指定多个模式串{R:x}。</li>
<li> 购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server_1，server_2。</li>
<li> 最多支持60个字符（包含模式串）。</li>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例显示名称。
<li> 如果该字段为空，则采用默认格式：云桌面型号+月日+三位随机数+镜像ID。</li>
<li> 购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server_{R:3}，购买1台时，实例显示名称为server_3；购买2台时，实例显示名称分别为server_3，server_4。支持指定多个模式串{R:x}。</li>
<li> 购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server_1，server_2。</li>
<li> 最多支持60个字符（包含模式串）。</li>
     * @param InstanceName 实例显示名称。
<li> 如果该字段为空，则采用默认格式：云桌面型号+月日+三位随机数+镜像ID。</li>
<li> 购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server_{R:3}，购买1台时，实例显示名称为server_3；购买2台时，实例显示名称分别为server_3，server_4。支持指定多个模式串{R:x}。</li>
<li> 购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server_1，server_2。</li>
<li> 最多支持60个字符（包含模式串）。</li>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 购买实例数量。取值范围[1,50]。默认为1 
     * @return InstanceCount 购买实例数量。取值范围[1,50]。默认为1
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 购买实例数量。取值范围[1,50]。默认为1
     * @param InstanceCount 购买实例数量。取值范围[1,50]。默认为1
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 数据盘信息。目前只支持一块数据盘。 
     * @return DataDisks 数据盘信息。目前只支持一块数据盘。
     */
    public Disk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set 数据盘信息。目前只支持一块数据盘。
     * @param DataDisks 数据盘信息。目前只支持一块数据盘。
     */
    public void setDataDisks(Disk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get 实例计费类型。
<li> PREPAID：预付费，即包年包月</li>
<li> POSTPAID_BY_HOUR：按小时后付费</li>
默认为PREPAID 
     * @return ChargeType 实例计费类型。
<li> PREPAID：预付费，即包年包月</li>
<li> POSTPAID_BY_HOUR：按小时后付费</li>
默认为PREPAID
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 实例计费类型。
<li> PREPAID：预付费，即包年包月</li>
<li> POSTPAID_BY_HOUR：按小时后付费</li>
默认为PREPAID
     * @param ChargeType 实例计费类型。
<li> PREPAID：预付费，即包年包月</li>
<li> POSTPAID_BY_HOUR：按小时后付费</li>
默认为PREPAID
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。 
     * @return ChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public ChargePrepaid getChargePrepaid() {
        return this.ChargePrepaid;
    }

    /**
     * Set 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     * @param ChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public void setChargePrepaid(ChargePrepaid ChargePrepaid) {
        this.ChargePrepaid = ChargePrepaid;
    }

    /**
     * Get 是否只预检此次请求。
<li> true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。
如果检查通过，则返回的错误码为DryRunOperation；如果返回其他错误码表示检查没有通过；</li>
<li> false（默认）：发送正常请求，通过检查后直接创建实例</li> 
     * @return DryRun 是否只预检此次请求。
<li> true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。
如果检查通过，则返回的错误码为DryRunOperation；如果返回其他错误码表示检查没有通过；</li>
<li> false（默认）：发送正常请求，通过检查后直接创建实例</li>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否只预检此次请求。
<li> true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。
如果检查通过，则返回的错误码为DryRunOperation；如果返回其他错误码表示检查没有通过；</li>
<li> false（默认）：发送正常请求，通过检查后直接创建实例</li>
     * @param DryRun 是否只预检此次请求。
<li> true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。
如果检查通过，则返回的错误码为DryRunOperation；如果返回其他错误码表示检查没有通过；</li>
<li> false（默认）：发送正常请求，通过检查后直接创建实例</li>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 允许绑定用户前的匿名访问。默认值：false。 
     * @return AnonymousAccess 允许绑定用户前的匿名访问。默认值：false。
     */
    public Boolean getAnonymousAccess() {
        return this.AnonymousAccess;
    }

    /**
     * Set 允许绑定用户前的匿名访问。默认值：false。
     * @param AnonymousAccess 允许绑定用户前的匿名访问。默认值：false。
     */
    public void setAnonymousAccess(Boolean AnonymousAccess) {
        this.AnonymousAccess = AnonymousAccess;
    }

    /**
     * Get 关联的安全组ID列表 
     * @return SecurityGroups 关联的安全组ID列表
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set 关联的安全组ID列表
     * @param SecurityGroups 关联的安全组ID列表
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get 桌面池ID 
     * @return PoolId 桌面池ID
     */
    public String getPoolId() {
        return this.PoolId;
    }

    /**
     * Set 桌面池ID
     * @param PoolId 桌面池ID
     */
    public void setPoolId(String PoolId) {
        this.PoolId = PoolId;
    }

    /**
     * Get 域名管控策略ID 
     * @return DomainControlPolicies 域名管控策略ID
     */
    public String [] getDomainControlPolicies() {
        return this.DomainControlPolicies;
    }

    /**
     * Set 域名管控策略ID
     * @param DomainControlPolicies 域名管控策略ID
     */
    public void setDomainControlPolicies(String [] DomainControlPolicies) {
        this.DomainControlPolicies = DomainControlPolicies;
    }

    /**
     * Get 标签，最多10个 
     * @return Tags 标签，最多10个
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签，最多10个
     * @param Tags 标签，最多10个
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public CreateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancesRequest(CreateInstancesRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new Disk(source.SystemDisk);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new Disk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new Disk(source.DataDisks[i]);
            }
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ChargePrepaid != null) {
            this.ChargePrepaid = new ChargePrepaid(source.ChargePrepaid);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.AnonymousAccess != null) {
            this.AnonymousAccess = new Boolean(source.AnonymousAccess);
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
        if (source.PoolId != null) {
            this.PoolId = new String(source.PoolId);
        }
        if (source.DomainControlPolicies != null) {
            this.DomainControlPolicies = new String[source.DomainControlPolicies.length];
            for (int i = 0; i < source.DomainControlPolicies.length; i++) {
                this.DomainControlPolicies[i] = new String(source.DomainControlPolicies[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamObj(map, prefix + "ChargePrepaid.", this.ChargePrepaid);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "AnonymousAccess", this.AnonymousAccess);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);
        this.setParamSimple(map, prefix + "PoolId", this.PoolId);
        this.setParamArraySimple(map, prefix + "DomainControlPolicies.", this.DomainControlPolicies);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

