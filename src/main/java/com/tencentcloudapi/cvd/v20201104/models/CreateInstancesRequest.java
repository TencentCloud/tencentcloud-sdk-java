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
    * <p>实例类型。<li>  S3L.MEDIUM4: 云桌面-标准S3_2核4G </li><li> S3L.LARGE8: 云桌面-标准S3_4核8G </li><li> S3L.LARGE16: 云桌面-标准S3_4核16G </li><li> S3L.2XLARGE16: 云桌面-标准S3_8核16G </li><li> S1L.LARGE8：云桌面-标准S1_4核8G </li><li> S1L.LARGE16：标准S1_4核16G </li><li> S2L.2XLARGE16：标准S2_8核16G </li><li> G1L.LARGE16：图形G1_4核16G  </li><li> G1L.2XLARGE32：图形G1_8核32G </li><li> G1L.4XLARGE64：图形G1_16核64G </li><li> G2L.LARGE24: 云桌面-图形G2_6核24G </li><li> G2L.3XLARGE58: 云桌面-图形G2_14核58G </li><li> G2L.3XLARGE44: 云桌面-图形G2_12核44G </li><li> G3L.LARGE16: 云桌面-图形G3_4核16G </li><li> G3L.5XMEDIUM40: 云桌面-图形G3_10核40G </li><li> G3L.5XLARGE80: 云桌面-图形G3_20核80G </li><li> G4L.5XMEDIUM40: 云桌面-图形G4_10核40G </li><li> G4L.11XMEDIUM80: 云桌面-图形G4_22核80G </li><li> G4L.11XLARGE160: 云桌面-图形G4_44核160G </li><li> G5L.5XMEDIUM40: 云桌面-图形G5_10核40G </li><li> G5L.5XLARGE80: 云桌面-图形G5_22核80G </li><li> G5L.21XMEDIUM160: 云桌面-图形G5_42核160G </li><li> G5L.21XLARGE320: 云桌面-图形G5_84核320G </li><li> G6L.8XLARGE96: 云桌面-图形G6_32核96G </li></p><li> G6L.16XLARGE192: 云桌面-图形G6_64核192G </li><li> G6L.24XLARGE288: 云桌面-图形G6_96核288G </li><li> G6L.32XLARGE384: 云桌面-图形G6_128核384G </li><li> G6L.48XLARGE576: 云桌面-图形G6_192核576G </li><li> G6L.64XLARGE768: 云桌面-图形G6_256核768G </li><li> G6L.96XLARGE1152: 云桌面-图形G6_384核1152G </li><li> G6L.96XLARGE1536: 云桌面-图形G6_384核1536G </li><li> G6L.192XLARGE2304: 云桌面-图形G6_768核2304G </li><li> G6Ls.8XLARGE96: 云桌面-图形G6s_32核96G </li><li> G6Ls.16XLARGE192: 云桌面-图形G6s_64核192G </li><li> G6Ls.24XLARGE288: 云桌面-图形G6s_96核288G </li><li> G6Ls.32XLARGE384: 云桌面-图形G6s_128核384G </li><li> G6Ls.48XLARGE576: 云桌面-图形G6s_192核576G </li><li> G6Ls.64XLARGE768: 云桌面-图形G6s_256核768G </li><li> G6Ls.96XLARGE1152: 云桌面-图形G6s_384核1152G </li><li> G6Ls.96XLARGE1536: 云桌面-图形G6s_384核1536G </li><li> G6Ls.192XLARGE2304: 云桌面-图形G6s_768核2304G </li><li> G8L.8XLARGE96: 云桌面-图形G8_32核96G </li><li> G8L.12XLARGE192: 云桌面-图形G8_48核192G </li><li> G8L.16XLARGE192: 云桌面-图形G8_64核192G </li><li> G8L.24XLARGE384: 云桌面-图形G8_96核384G </li><li> G8L.32XLARGE384: 云桌面-图形G8_128核384G </li><li> G8L.48XLARGE768: 云桌面-图形G8_192核768G </li><li> G8L.64XLARGE768: 云桌面-图形G8_256核768G </li><li> G8L.96XLARGE1536: 云桌面-图形G8_384核1536G </li><li> G9L.12XLARGE192: 云桌面-图形G9_48核192G </li><li> G9L.24XLARGE384: 云桌面-图形G9_96核384G </li><li> G9L.48XLARGE768: 云桌面-图形G9_192核768G </li><li> G9L.96XLARGE1536: 云桌面-图形G9_384核1536G </li><p>枚举值：</p><ul><li>S3L.MEDIUM4： 云桌面-标准S3_2核4G</li><li>S3L.LARGE8： 云桌面-标准S3_4核8G</li><li>S3L.LARGE16： 云桌面-标准S3_4核16G</li><li>S3L.2XLARGE16： 云桌面-标准S3_8核16G</li><li>S1L.LARGE8： 云桌面-标准S1_4核8G</li><li>S1L.LARGE16： 标准S1_4核16G</li><li>S2L.2XLARGE16： 标准S2_8核16G</li><li>G1L.LARGE16： 图形G1_4核16G</li><li>G1L.2XLARGE32： 图形G1_8核32G</li><li>G1L.4XLARGE64： 图形G1_16核64G</li><li>G2L.LARGE24： 云桌面-图形G2_6核24G</li><li>G2L.3XLARGE58： 云桌面-图形G2_14核58G</li><li>G2L.3XLARGE44： 云桌面-图形G2_12核44G</li><li>G3L.LARGE16： 云桌面-图形G3_4核16G</li><li>G3L.5XMEDIUM40： 云桌面-图形G3_10核40G</li><li>G3L.5XLARGE80： 云桌面-图形G3_20核80G</li><li>G4L.5XMEDIUM40： 云桌面-图形G4_10核40G</li><li>G4L.11XMEDIUM80： 云桌面-图形G4_22核80G</li><li>G4L.11XLARGE160： 云桌面-图形G4_44核160G</li><li>G5L.5XMEDIUM40： 云桌面-图形G5_10核40G</li><li>G5L.5XLARGE80： 云桌面-图形G5_22核80G</li><li>G5L.21XMEDIUM160： 云桌面-图形G5_42核160G</li><li>G5L.21XLARGE320： 云桌面-图形G5_84核320G</li><li>G6L.8XLARGE96： 云桌面-图形G6_32核96G</li><li>G6L.16XLARGE192： 云桌面-图形G6_64核192G</li><li>G6L.24XLARGE288： 云桌面-图形G6_96核288G</li><li>G6L.32XLARGE384： 云桌面-图形G6_128核384G</li><li>G6L.48XLARGE576： 云桌面-图形G6_192核576G</li><li>G6L.64XLARGE768： 云桌面-图形G6_256核768G</li><li>G6L.96XLARGE1152： 云桌面-图形G6_384核1152G</li><li>G6L.96XLARGE1536： 云桌面-图形G6_384核1536G</li><li>G6L.192XLARGE2304： 云桌面-图形G6_768核2304G</li><li>G6Ls.8XLARGE96： 云桌面-图形G6s_32核96G</li><li>G6Ls.16XLARGE192： 云桌面-图形G6s_64核192G</li><li>G6Ls.24XLARGE288： 云桌面-图形G6s_96核288G</li><li>G6Ls.32XLARGE384： 云桌面-图形G6s_128核384G</li><li>G6Ls.48XLARGE576： 云桌面-图形G6s_192核576G</li><li>G6Ls.64XLARGE768： 云桌面-图形G6s_256核768G</li><li>G6Ls.96XLARGE1152： 云桌面-图形G6s_384核1152G</li><li>G6Ls.96XLARGE1536： 云桌面-图形G6s_384核1536G</li><li>G6Ls.192XLARGE2304： 云桌面-图形G6s_768核2304G</li><li>G8L.8XLARGE96： 云桌面-图形G8_32核96G</li><li>G8L.12XLARGE192： 云桌面-图形G8_48核192G</li><li>G8L.16XLARGE192： 云桌面-图形G8_64核192G</li><li>G8L.24XLARGE384： 云桌面-图形G8_96核384G</li><li>G8L.32XLARGE384： 云桌面-图形G8_128核384G</li><li>G8L.48XLARGE768： 云桌面-图形G8_192核768G</li><li>G8L.64XLARGE768： 云桌面-图形G8_256核768G</li><li>G8L.96XLARGE1536： 云桌面-图形G8_384核1536G</li><li>G9L.12XLARGE192： 云桌面-图形G9_48核192G</li><li>G9L.24XLARGE384： 云桌面-图形G9_96核384G</li><li>G9L.48XLARGE768： 云桌面-图形G9_192核768G</li><li>G9L.96XLARGE1536： 云桌面-图形G9_384核1536G</li></ul>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>系统盘信息</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private Disk SystemDisk;

    /**
    * <p>镜像ID</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * <p>实例显示名称。</p><li> 如果该字段为空，则采用默认格式：云桌面型号+月日+三位随机数+镜像ID。</li><li> 购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server_{R:3}，购买1台时，实例显示名称为server_3；购买2台时，实例显示名称分别为server_3，server_4。支持指定多个模式串{R:x}。</li><li> 购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server_1，server_2。</li><li> 最多支持60个字符（包含模式串）。</li>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>购买实例数量。取值范围[1,50]。默认为1</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>数据盘信息。目前只支持一块数据盘。</p>
    */
    @SerializedName("DataDisks")
    @Expose
    private Disk [] DataDisks;

    /**
    * <p>实例计费类型。</p><li> PREPAID：预付费，即包年包月</li><li> POSTPAID_BY_HOUR：按小时后付费</li>默认为PREPAID
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
    */
    @SerializedName("ChargePrepaid")
    @Expose
    private ChargePrepaid ChargePrepaid;

    /**
    * <p>是否只预检此次请求。</p><li> true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。如果检查通过，则返回的错误码为DryRunOperation；如果返回其他错误码表示检查没有通过；</li><li> false（默认）：发送正常请求，通过检查后直接创建实例</li>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>允许绑定用户前的匿名访问。默认值：false。</p>
    */
    @SerializedName("AnonymousAccess")
    @Expose
    private Boolean AnonymousAccess;

    /**
    * <p>关联的安全组ID列表</p>
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * <p>桌面池ID</p>
    */
    @SerializedName("PoolId")
    @Expose
    private String PoolId;

    /**
    * <p>域名管控策略ID</p>
    */
    @SerializedName("DomainControlPolicies")
    @Expose
    private String [] DomainControlPolicies;

    /**
    * <p>标签，最多10个</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get <p>实例类型。<li>  S3L.MEDIUM4: 云桌面-标准S3_2核4G </li><li> S3L.LARGE8: 云桌面-标准S3_4核8G </li><li> S3L.LARGE16: 云桌面-标准S3_4核16G </li><li> S3L.2XLARGE16: 云桌面-标准S3_8核16G </li><li> S1L.LARGE8：云桌面-标准S1_4核8G </li><li> S1L.LARGE16：标准S1_4核16G </li><li> S2L.2XLARGE16：标准S2_8核16G </li><li> G1L.LARGE16：图形G1_4核16G  </li><li> G1L.2XLARGE32：图形G1_8核32G </li><li> G1L.4XLARGE64：图形G1_16核64G </li><li> G2L.LARGE24: 云桌面-图形G2_6核24G </li><li> G2L.3XLARGE58: 云桌面-图形G2_14核58G </li><li> G2L.3XLARGE44: 云桌面-图形G2_12核44G </li><li> G3L.LARGE16: 云桌面-图形G3_4核16G </li><li> G3L.5XMEDIUM40: 云桌面-图形G3_10核40G </li><li> G3L.5XLARGE80: 云桌面-图形G3_20核80G </li><li> G4L.5XMEDIUM40: 云桌面-图形G4_10核40G </li><li> G4L.11XMEDIUM80: 云桌面-图形G4_22核80G </li><li> G4L.11XLARGE160: 云桌面-图形G4_44核160G </li><li> G5L.5XMEDIUM40: 云桌面-图形G5_10核40G </li><li> G5L.5XLARGE80: 云桌面-图形G5_22核80G </li><li> G5L.21XMEDIUM160: 云桌面-图形G5_42核160G </li><li> G5L.21XLARGE320: 云桌面-图形G5_84核320G </li><li> G6L.8XLARGE96: 云桌面-图形G6_32核96G </li></p><li> G6L.16XLARGE192: 云桌面-图形G6_64核192G </li><li> G6L.24XLARGE288: 云桌面-图形G6_96核288G </li><li> G6L.32XLARGE384: 云桌面-图形G6_128核384G </li><li> G6L.48XLARGE576: 云桌面-图形G6_192核576G </li><li> G6L.64XLARGE768: 云桌面-图形G6_256核768G </li><li> G6L.96XLARGE1152: 云桌面-图形G6_384核1152G </li><li> G6L.96XLARGE1536: 云桌面-图形G6_384核1536G </li><li> G6L.192XLARGE2304: 云桌面-图形G6_768核2304G </li><li> G6Ls.8XLARGE96: 云桌面-图形G6s_32核96G </li><li> G6Ls.16XLARGE192: 云桌面-图形G6s_64核192G </li><li> G6Ls.24XLARGE288: 云桌面-图形G6s_96核288G </li><li> G6Ls.32XLARGE384: 云桌面-图形G6s_128核384G </li><li> G6Ls.48XLARGE576: 云桌面-图形G6s_192核576G </li><li> G6Ls.64XLARGE768: 云桌面-图形G6s_256核768G </li><li> G6Ls.96XLARGE1152: 云桌面-图形G6s_384核1152G </li><li> G6Ls.96XLARGE1536: 云桌面-图形G6s_384核1536G </li><li> G6Ls.192XLARGE2304: 云桌面-图形G6s_768核2304G </li><li> G8L.8XLARGE96: 云桌面-图形G8_32核96G </li><li> G8L.12XLARGE192: 云桌面-图形G8_48核192G </li><li> G8L.16XLARGE192: 云桌面-图形G8_64核192G </li><li> G8L.24XLARGE384: 云桌面-图形G8_96核384G </li><li> G8L.32XLARGE384: 云桌面-图形G8_128核384G </li><li> G8L.48XLARGE768: 云桌面-图形G8_192核768G </li><li> G8L.64XLARGE768: 云桌面-图形G8_256核768G </li><li> G8L.96XLARGE1536: 云桌面-图形G8_384核1536G </li><li> G9L.12XLARGE192: 云桌面-图形G9_48核192G </li><li> G9L.24XLARGE384: 云桌面-图形G9_96核384G </li><li> G9L.48XLARGE768: 云桌面-图形G9_192核768G </li><li> G9L.96XLARGE1536: 云桌面-图形G9_384核1536G </li><p>枚举值：</p><ul><li>S3L.MEDIUM4： 云桌面-标准S3_2核4G</li><li>S3L.LARGE8： 云桌面-标准S3_4核8G</li><li>S3L.LARGE16： 云桌面-标准S3_4核16G</li><li>S3L.2XLARGE16： 云桌面-标准S3_8核16G</li><li>S1L.LARGE8： 云桌面-标准S1_4核8G</li><li>S1L.LARGE16： 标准S1_4核16G</li><li>S2L.2XLARGE16： 标准S2_8核16G</li><li>G1L.LARGE16： 图形G1_4核16G</li><li>G1L.2XLARGE32： 图形G1_8核32G</li><li>G1L.4XLARGE64： 图形G1_16核64G</li><li>G2L.LARGE24： 云桌面-图形G2_6核24G</li><li>G2L.3XLARGE58： 云桌面-图形G2_14核58G</li><li>G2L.3XLARGE44： 云桌面-图形G2_12核44G</li><li>G3L.LARGE16： 云桌面-图形G3_4核16G</li><li>G3L.5XMEDIUM40： 云桌面-图形G3_10核40G</li><li>G3L.5XLARGE80： 云桌面-图形G3_20核80G</li><li>G4L.5XMEDIUM40： 云桌面-图形G4_10核40G</li><li>G4L.11XMEDIUM80： 云桌面-图形G4_22核80G</li><li>G4L.11XLARGE160： 云桌面-图形G4_44核160G</li><li>G5L.5XMEDIUM40： 云桌面-图形G5_10核40G</li><li>G5L.5XLARGE80： 云桌面-图形G5_22核80G</li><li>G5L.21XMEDIUM160： 云桌面-图形G5_42核160G</li><li>G5L.21XLARGE320： 云桌面-图形G5_84核320G</li><li>G6L.8XLARGE96： 云桌面-图形G6_32核96G</li><li>G6L.16XLARGE192： 云桌面-图形G6_64核192G</li><li>G6L.24XLARGE288： 云桌面-图形G6_96核288G</li><li>G6L.32XLARGE384： 云桌面-图形G6_128核384G</li><li>G6L.48XLARGE576： 云桌面-图形G6_192核576G</li><li>G6L.64XLARGE768： 云桌面-图形G6_256核768G</li><li>G6L.96XLARGE1152： 云桌面-图形G6_384核1152G</li><li>G6L.96XLARGE1536： 云桌面-图形G6_384核1536G</li><li>G6L.192XLARGE2304： 云桌面-图形G6_768核2304G</li><li>G6Ls.8XLARGE96： 云桌面-图形G6s_32核96G</li><li>G6Ls.16XLARGE192： 云桌面-图形G6s_64核192G</li><li>G6Ls.24XLARGE288： 云桌面-图形G6s_96核288G</li><li>G6Ls.32XLARGE384： 云桌面-图形G6s_128核384G</li><li>G6Ls.48XLARGE576： 云桌面-图形G6s_192核576G</li><li>G6Ls.64XLARGE768： 云桌面-图形G6s_256核768G</li><li>G6Ls.96XLARGE1152： 云桌面-图形G6s_384核1152G</li><li>G6Ls.96XLARGE1536： 云桌面-图形G6s_384核1536G</li><li>G6Ls.192XLARGE2304： 云桌面-图形G6s_768核2304G</li><li>G8L.8XLARGE96： 云桌面-图形G8_32核96G</li><li>G8L.12XLARGE192： 云桌面-图形G8_48核192G</li><li>G8L.16XLARGE192： 云桌面-图形G8_64核192G</li><li>G8L.24XLARGE384： 云桌面-图形G8_96核384G</li><li>G8L.32XLARGE384： 云桌面-图形G8_128核384G</li><li>G8L.48XLARGE768： 云桌面-图形G8_192核768G</li><li>G8L.64XLARGE768： 云桌面-图形G8_256核768G</li><li>G8L.96XLARGE1536： 云桌面-图形G8_384核1536G</li><li>G9L.12XLARGE192： 云桌面-图形G9_48核192G</li><li>G9L.24XLARGE384： 云桌面-图形G9_96核384G</li><li>G9L.48XLARGE768： 云桌面-图形G9_192核768G</li><li>G9L.96XLARGE1536： 云桌面-图形G9_384核1536G</li></ul> 
     * @return InstanceType <p>实例类型。<li>  S3L.MEDIUM4: 云桌面-标准S3_2核4G </li><li> S3L.LARGE8: 云桌面-标准S3_4核8G </li><li> S3L.LARGE16: 云桌面-标准S3_4核16G </li><li> S3L.2XLARGE16: 云桌面-标准S3_8核16G </li><li> S1L.LARGE8：云桌面-标准S1_4核8G </li><li> S1L.LARGE16：标准S1_4核16G </li><li> S2L.2XLARGE16：标准S2_8核16G </li><li> G1L.LARGE16：图形G1_4核16G  </li><li> G1L.2XLARGE32：图形G1_8核32G </li><li> G1L.4XLARGE64：图形G1_16核64G </li><li> G2L.LARGE24: 云桌面-图形G2_6核24G </li><li> G2L.3XLARGE58: 云桌面-图形G2_14核58G </li><li> G2L.3XLARGE44: 云桌面-图形G2_12核44G </li><li> G3L.LARGE16: 云桌面-图形G3_4核16G </li><li> G3L.5XMEDIUM40: 云桌面-图形G3_10核40G </li><li> G3L.5XLARGE80: 云桌面-图形G3_20核80G </li><li> G4L.5XMEDIUM40: 云桌面-图形G4_10核40G </li><li> G4L.11XMEDIUM80: 云桌面-图形G4_22核80G </li><li> G4L.11XLARGE160: 云桌面-图形G4_44核160G </li><li> G5L.5XMEDIUM40: 云桌面-图形G5_10核40G </li><li> G5L.5XLARGE80: 云桌面-图形G5_22核80G </li><li> G5L.21XMEDIUM160: 云桌面-图形G5_42核160G </li><li> G5L.21XLARGE320: 云桌面-图形G5_84核320G </li><li> G6L.8XLARGE96: 云桌面-图形G6_32核96G </li></p><li> G6L.16XLARGE192: 云桌面-图形G6_64核192G </li><li> G6L.24XLARGE288: 云桌面-图形G6_96核288G </li><li> G6L.32XLARGE384: 云桌面-图形G6_128核384G </li><li> G6L.48XLARGE576: 云桌面-图形G6_192核576G </li><li> G6L.64XLARGE768: 云桌面-图形G6_256核768G </li><li> G6L.96XLARGE1152: 云桌面-图形G6_384核1152G </li><li> G6L.96XLARGE1536: 云桌面-图形G6_384核1536G </li><li> G6L.192XLARGE2304: 云桌面-图形G6_768核2304G </li><li> G6Ls.8XLARGE96: 云桌面-图形G6s_32核96G </li><li> G6Ls.16XLARGE192: 云桌面-图形G6s_64核192G </li><li> G6Ls.24XLARGE288: 云桌面-图形G6s_96核288G </li><li> G6Ls.32XLARGE384: 云桌面-图形G6s_128核384G </li><li> G6Ls.48XLARGE576: 云桌面-图形G6s_192核576G </li><li> G6Ls.64XLARGE768: 云桌面-图形G6s_256核768G </li><li> G6Ls.96XLARGE1152: 云桌面-图形G6s_384核1152G </li><li> G6Ls.96XLARGE1536: 云桌面-图形G6s_384核1536G </li><li> G6Ls.192XLARGE2304: 云桌面-图形G6s_768核2304G </li><li> G8L.8XLARGE96: 云桌面-图形G8_32核96G </li><li> G8L.12XLARGE192: 云桌面-图形G8_48核192G </li><li> G8L.16XLARGE192: 云桌面-图形G8_64核192G </li><li> G8L.24XLARGE384: 云桌面-图形G8_96核384G </li><li> G8L.32XLARGE384: 云桌面-图形G8_128核384G </li><li> G8L.48XLARGE768: 云桌面-图形G8_192核768G </li><li> G8L.64XLARGE768: 云桌面-图形G8_256核768G </li><li> G8L.96XLARGE1536: 云桌面-图形G8_384核1536G </li><li> G9L.12XLARGE192: 云桌面-图形G9_48核192G </li><li> G9L.24XLARGE384: 云桌面-图形G9_96核384G </li><li> G9L.48XLARGE768: 云桌面-图形G9_192核768G </li><li> G9L.96XLARGE1536: 云桌面-图形G9_384核1536G </li><p>枚举值：</p><ul><li>S3L.MEDIUM4： 云桌面-标准S3_2核4G</li><li>S3L.LARGE8： 云桌面-标准S3_4核8G</li><li>S3L.LARGE16： 云桌面-标准S3_4核16G</li><li>S3L.2XLARGE16： 云桌面-标准S3_8核16G</li><li>S1L.LARGE8： 云桌面-标准S1_4核8G</li><li>S1L.LARGE16： 标准S1_4核16G</li><li>S2L.2XLARGE16： 标准S2_8核16G</li><li>G1L.LARGE16： 图形G1_4核16G</li><li>G1L.2XLARGE32： 图形G1_8核32G</li><li>G1L.4XLARGE64： 图形G1_16核64G</li><li>G2L.LARGE24： 云桌面-图形G2_6核24G</li><li>G2L.3XLARGE58： 云桌面-图形G2_14核58G</li><li>G2L.3XLARGE44： 云桌面-图形G2_12核44G</li><li>G3L.LARGE16： 云桌面-图形G3_4核16G</li><li>G3L.5XMEDIUM40： 云桌面-图形G3_10核40G</li><li>G3L.5XLARGE80： 云桌面-图形G3_20核80G</li><li>G4L.5XMEDIUM40： 云桌面-图形G4_10核40G</li><li>G4L.11XMEDIUM80： 云桌面-图形G4_22核80G</li><li>G4L.11XLARGE160： 云桌面-图形G4_44核160G</li><li>G5L.5XMEDIUM40： 云桌面-图形G5_10核40G</li><li>G5L.5XLARGE80： 云桌面-图形G5_22核80G</li><li>G5L.21XMEDIUM160： 云桌面-图形G5_42核160G</li><li>G5L.21XLARGE320： 云桌面-图形G5_84核320G</li><li>G6L.8XLARGE96： 云桌面-图形G6_32核96G</li><li>G6L.16XLARGE192： 云桌面-图形G6_64核192G</li><li>G6L.24XLARGE288： 云桌面-图形G6_96核288G</li><li>G6L.32XLARGE384： 云桌面-图形G6_128核384G</li><li>G6L.48XLARGE576： 云桌面-图形G6_192核576G</li><li>G6L.64XLARGE768： 云桌面-图形G6_256核768G</li><li>G6L.96XLARGE1152： 云桌面-图形G6_384核1152G</li><li>G6L.96XLARGE1536： 云桌面-图形G6_384核1536G</li><li>G6L.192XLARGE2304： 云桌面-图形G6_768核2304G</li><li>G6Ls.8XLARGE96： 云桌面-图形G6s_32核96G</li><li>G6Ls.16XLARGE192： 云桌面-图形G6s_64核192G</li><li>G6Ls.24XLARGE288： 云桌面-图形G6s_96核288G</li><li>G6Ls.32XLARGE384： 云桌面-图形G6s_128核384G</li><li>G6Ls.48XLARGE576： 云桌面-图形G6s_192核576G</li><li>G6Ls.64XLARGE768： 云桌面-图形G6s_256核768G</li><li>G6Ls.96XLARGE1152： 云桌面-图形G6s_384核1152G</li><li>G6Ls.96XLARGE1536： 云桌面-图形G6s_384核1536G</li><li>G6Ls.192XLARGE2304： 云桌面-图形G6s_768核2304G</li><li>G8L.8XLARGE96： 云桌面-图形G8_32核96G</li><li>G8L.12XLARGE192： 云桌面-图形G8_48核192G</li><li>G8L.16XLARGE192： 云桌面-图形G8_64核192G</li><li>G8L.24XLARGE384： 云桌面-图形G8_96核384G</li><li>G8L.32XLARGE384： 云桌面-图形G8_128核384G</li><li>G8L.48XLARGE768： 云桌面-图形G8_192核768G</li><li>G8L.64XLARGE768： 云桌面-图形G8_256核768G</li><li>G8L.96XLARGE1536： 云桌面-图形G8_384核1536G</li><li>G9L.12XLARGE192： 云桌面-图形G9_48核192G</li><li>G9L.24XLARGE384： 云桌面-图形G9_96核384G</li><li>G9L.48XLARGE768： 云桌面-图形G9_192核768G</li><li>G9L.96XLARGE1536： 云桌面-图形G9_384核1536G</li></ul>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型。<li>  S3L.MEDIUM4: 云桌面-标准S3_2核4G </li><li> S3L.LARGE8: 云桌面-标准S3_4核8G </li><li> S3L.LARGE16: 云桌面-标准S3_4核16G </li><li> S3L.2XLARGE16: 云桌面-标准S3_8核16G </li><li> S1L.LARGE8：云桌面-标准S1_4核8G </li><li> S1L.LARGE16：标准S1_4核16G </li><li> S2L.2XLARGE16：标准S2_8核16G </li><li> G1L.LARGE16：图形G1_4核16G  </li><li> G1L.2XLARGE32：图形G1_8核32G </li><li> G1L.4XLARGE64：图形G1_16核64G </li><li> G2L.LARGE24: 云桌面-图形G2_6核24G </li><li> G2L.3XLARGE58: 云桌面-图形G2_14核58G </li><li> G2L.3XLARGE44: 云桌面-图形G2_12核44G </li><li> G3L.LARGE16: 云桌面-图形G3_4核16G </li><li> G3L.5XMEDIUM40: 云桌面-图形G3_10核40G </li><li> G3L.5XLARGE80: 云桌面-图形G3_20核80G </li><li> G4L.5XMEDIUM40: 云桌面-图形G4_10核40G </li><li> G4L.11XMEDIUM80: 云桌面-图形G4_22核80G </li><li> G4L.11XLARGE160: 云桌面-图形G4_44核160G </li><li> G5L.5XMEDIUM40: 云桌面-图形G5_10核40G </li><li> G5L.5XLARGE80: 云桌面-图形G5_22核80G </li><li> G5L.21XMEDIUM160: 云桌面-图形G5_42核160G </li><li> G5L.21XLARGE320: 云桌面-图形G5_84核320G </li><li> G6L.8XLARGE96: 云桌面-图形G6_32核96G </li></p><li> G6L.16XLARGE192: 云桌面-图形G6_64核192G </li><li> G6L.24XLARGE288: 云桌面-图形G6_96核288G </li><li> G6L.32XLARGE384: 云桌面-图形G6_128核384G </li><li> G6L.48XLARGE576: 云桌面-图形G6_192核576G </li><li> G6L.64XLARGE768: 云桌面-图形G6_256核768G </li><li> G6L.96XLARGE1152: 云桌面-图形G6_384核1152G </li><li> G6L.96XLARGE1536: 云桌面-图形G6_384核1536G </li><li> G6L.192XLARGE2304: 云桌面-图形G6_768核2304G </li><li> G6Ls.8XLARGE96: 云桌面-图形G6s_32核96G </li><li> G6Ls.16XLARGE192: 云桌面-图形G6s_64核192G </li><li> G6Ls.24XLARGE288: 云桌面-图形G6s_96核288G </li><li> G6Ls.32XLARGE384: 云桌面-图形G6s_128核384G </li><li> G6Ls.48XLARGE576: 云桌面-图形G6s_192核576G </li><li> G6Ls.64XLARGE768: 云桌面-图形G6s_256核768G </li><li> G6Ls.96XLARGE1152: 云桌面-图形G6s_384核1152G </li><li> G6Ls.96XLARGE1536: 云桌面-图形G6s_384核1536G </li><li> G6Ls.192XLARGE2304: 云桌面-图形G6s_768核2304G </li><li> G8L.8XLARGE96: 云桌面-图形G8_32核96G </li><li> G8L.12XLARGE192: 云桌面-图形G8_48核192G </li><li> G8L.16XLARGE192: 云桌面-图形G8_64核192G </li><li> G8L.24XLARGE384: 云桌面-图形G8_96核384G </li><li> G8L.32XLARGE384: 云桌面-图形G8_128核384G </li><li> G8L.48XLARGE768: 云桌面-图形G8_192核768G </li><li> G8L.64XLARGE768: 云桌面-图形G8_256核768G </li><li> G8L.96XLARGE1536: 云桌面-图形G8_384核1536G </li><li> G9L.12XLARGE192: 云桌面-图形G9_48核192G </li><li> G9L.24XLARGE384: 云桌面-图形G9_96核384G </li><li> G9L.48XLARGE768: 云桌面-图形G9_192核768G </li><li> G9L.96XLARGE1536: 云桌面-图形G9_384核1536G </li><p>枚举值：</p><ul><li>S3L.MEDIUM4： 云桌面-标准S3_2核4G</li><li>S3L.LARGE8： 云桌面-标准S3_4核8G</li><li>S3L.LARGE16： 云桌面-标准S3_4核16G</li><li>S3L.2XLARGE16： 云桌面-标准S3_8核16G</li><li>S1L.LARGE8： 云桌面-标准S1_4核8G</li><li>S1L.LARGE16： 标准S1_4核16G</li><li>S2L.2XLARGE16： 标准S2_8核16G</li><li>G1L.LARGE16： 图形G1_4核16G</li><li>G1L.2XLARGE32： 图形G1_8核32G</li><li>G1L.4XLARGE64： 图形G1_16核64G</li><li>G2L.LARGE24： 云桌面-图形G2_6核24G</li><li>G2L.3XLARGE58： 云桌面-图形G2_14核58G</li><li>G2L.3XLARGE44： 云桌面-图形G2_12核44G</li><li>G3L.LARGE16： 云桌面-图形G3_4核16G</li><li>G3L.5XMEDIUM40： 云桌面-图形G3_10核40G</li><li>G3L.5XLARGE80： 云桌面-图形G3_20核80G</li><li>G4L.5XMEDIUM40： 云桌面-图形G4_10核40G</li><li>G4L.11XMEDIUM80： 云桌面-图形G4_22核80G</li><li>G4L.11XLARGE160： 云桌面-图形G4_44核160G</li><li>G5L.5XMEDIUM40： 云桌面-图形G5_10核40G</li><li>G5L.5XLARGE80： 云桌面-图形G5_22核80G</li><li>G5L.21XMEDIUM160： 云桌面-图形G5_42核160G</li><li>G5L.21XLARGE320： 云桌面-图形G5_84核320G</li><li>G6L.8XLARGE96： 云桌面-图形G6_32核96G</li><li>G6L.16XLARGE192： 云桌面-图形G6_64核192G</li><li>G6L.24XLARGE288： 云桌面-图形G6_96核288G</li><li>G6L.32XLARGE384： 云桌面-图形G6_128核384G</li><li>G6L.48XLARGE576： 云桌面-图形G6_192核576G</li><li>G6L.64XLARGE768： 云桌面-图形G6_256核768G</li><li>G6L.96XLARGE1152： 云桌面-图形G6_384核1152G</li><li>G6L.96XLARGE1536： 云桌面-图形G6_384核1536G</li><li>G6L.192XLARGE2304： 云桌面-图形G6_768核2304G</li><li>G6Ls.8XLARGE96： 云桌面-图形G6s_32核96G</li><li>G6Ls.16XLARGE192： 云桌面-图形G6s_64核192G</li><li>G6Ls.24XLARGE288： 云桌面-图形G6s_96核288G</li><li>G6Ls.32XLARGE384： 云桌面-图形G6s_128核384G</li><li>G6Ls.48XLARGE576： 云桌面-图形G6s_192核576G</li><li>G6Ls.64XLARGE768： 云桌面-图形G6s_256核768G</li><li>G6Ls.96XLARGE1152： 云桌面-图形G6s_384核1152G</li><li>G6Ls.96XLARGE1536： 云桌面-图形G6s_384核1536G</li><li>G6Ls.192XLARGE2304： 云桌面-图形G6s_768核2304G</li><li>G8L.8XLARGE96： 云桌面-图形G8_32核96G</li><li>G8L.12XLARGE192： 云桌面-图形G8_48核192G</li><li>G8L.16XLARGE192： 云桌面-图形G8_64核192G</li><li>G8L.24XLARGE384： 云桌面-图形G8_96核384G</li><li>G8L.32XLARGE384： 云桌面-图形G8_128核384G</li><li>G8L.48XLARGE768： 云桌面-图形G8_192核768G</li><li>G8L.64XLARGE768： 云桌面-图形G8_256核768G</li><li>G8L.96XLARGE1536： 云桌面-图形G8_384核1536G</li><li>G9L.12XLARGE192： 云桌面-图形G9_48核192G</li><li>G9L.24XLARGE384： 云桌面-图形G9_96核384G</li><li>G9L.48XLARGE768： 云桌面-图形G9_192核768G</li><li>G9L.96XLARGE1536： 云桌面-图形G9_384核1536G</li></ul>
     * @param InstanceType <p>实例类型。<li>  S3L.MEDIUM4: 云桌面-标准S3_2核4G </li><li> S3L.LARGE8: 云桌面-标准S3_4核8G </li><li> S3L.LARGE16: 云桌面-标准S3_4核16G </li><li> S3L.2XLARGE16: 云桌面-标准S3_8核16G </li><li> S1L.LARGE8：云桌面-标准S1_4核8G </li><li> S1L.LARGE16：标准S1_4核16G </li><li> S2L.2XLARGE16：标准S2_8核16G </li><li> G1L.LARGE16：图形G1_4核16G  </li><li> G1L.2XLARGE32：图形G1_8核32G </li><li> G1L.4XLARGE64：图形G1_16核64G </li><li> G2L.LARGE24: 云桌面-图形G2_6核24G </li><li> G2L.3XLARGE58: 云桌面-图形G2_14核58G </li><li> G2L.3XLARGE44: 云桌面-图形G2_12核44G </li><li> G3L.LARGE16: 云桌面-图形G3_4核16G </li><li> G3L.5XMEDIUM40: 云桌面-图形G3_10核40G </li><li> G3L.5XLARGE80: 云桌面-图形G3_20核80G </li><li> G4L.5XMEDIUM40: 云桌面-图形G4_10核40G </li><li> G4L.11XMEDIUM80: 云桌面-图形G4_22核80G </li><li> G4L.11XLARGE160: 云桌面-图形G4_44核160G </li><li> G5L.5XMEDIUM40: 云桌面-图形G5_10核40G </li><li> G5L.5XLARGE80: 云桌面-图形G5_22核80G </li><li> G5L.21XMEDIUM160: 云桌面-图形G5_42核160G </li><li> G5L.21XLARGE320: 云桌面-图形G5_84核320G </li><li> G6L.8XLARGE96: 云桌面-图形G6_32核96G </li></p><li> G6L.16XLARGE192: 云桌面-图形G6_64核192G </li><li> G6L.24XLARGE288: 云桌面-图形G6_96核288G </li><li> G6L.32XLARGE384: 云桌面-图形G6_128核384G </li><li> G6L.48XLARGE576: 云桌面-图形G6_192核576G </li><li> G6L.64XLARGE768: 云桌面-图形G6_256核768G </li><li> G6L.96XLARGE1152: 云桌面-图形G6_384核1152G </li><li> G6L.96XLARGE1536: 云桌面-图形G6_384核1536G </li><li> G6L.192XLARGE2304: 云桌面-图形G6_768核2304G </li><li> G6Ls.8XLARGE96: 云桌面-图形G6s_32核96G </li><li> G6Ls.16XLARGE192: 云桌面-图形G6s_64核192G </li><li> G6Ls.24XLARGE288: 云桌面-图形G6s_96核288G </li><li> G6Ls.32XLARGE384: 云桌面-图形G6s_128核384G </li><li> G6Ls.48XLARGE576: 云桌面-图形G6s_192核576G </li><li> G6Ls.64XLARGE768: 云桌面-图形G6s_256核768G </li><li> G6Ls.96XLARGE1152: 云桌面-图形G6s_384核1152G </li><li> G6Ls.96XLARGE1536: 云桌面-图形G6s_384核1536G </li><li> G6Ls.192XLARGE2304: 云桌面-图形G6s_768核2304G </li><li> G8L.8XLARGE96: 云桌面-图形G8_32核96G </li><li> G8L.12XLARGE192: 云桌面-图形G8_48核192G </li><li> G8L.16XLARGE192: 云桌面-图形G8_64核192G </li><li> G8L.24XLARGE384: 云桌面-图形G8_96核384G </li><li> G8L.32XLARGE384: 云桌面-图形G8_128核384G </li><li> G8L.48XLARGE768: 云桌面-图形G8_192核768G </li><li> G8L.64XLARGE768: 云桌面-图形G8_256核768G </li><li> G8L.96XLARGE1536: 云桌面-图形G8_384核1536G </li><li> G9L.12XLARGE192: 云桌面-图形G9_48核192G </li><li> G9L.24XLARGE384: 云桌面-图形G9_96核384G </li><li> G9L.48XLARGE768: 云桌面-图形G9_192核768G </li><li> G9L.96XLARGE1536: 云桌面-图形G9_384核1536G </li><p>枚举值：</p><ul><li>S3L.MEDIUM4： 云桌面-标准S3_2核4G</li><li>S3L.LARGE8： 云桌面-标准S3_4核8G</li><li>S3L.LARGE16： 云桌面-标准S3_4核16G</li><li>S3L.2XLARGE16： 云桌面-标准S3_8核16G</li><li>S1L.LARGE8： 云桌面-标准S1_4核8G</li><li>S1L.LARGE16： 标准S1_4核16G</li><li>S2L.2XLARGE16： 标准S2_8核16G</li><li>G1L.LARGE16： 图形G1_4核16G</li><li>G1L.2XLARGE32： 图形G1_8核32G</li><li>G1L.4XLARGE64： 图形G1_16核64G</li><li>G2L.LARGE24： 云桌面-图形G2_6核24G</li><li>G2L.3XLARGE58： 云桌面-图形G2_14核58G</li><li>G2L.3XLARGE44： 云桌面-图形G2_12核44G</li><li>G3L.LARGE16： 云桌面-图形G3_4核16G</li><li>G3L.5XMEDIUM40： 云桌面-图形G3_10核40G</li><li>G3L.5XLARGE80： 云桌面-图形G3_20核80G</li><li>G4L.5XMEDIUM40： 云桌面-图形G4_10核40G</li><li>G4L.11XMEDIUM80： 云桌面-图形G4_22核80G</li><li>G4L.11XLARGE160： 云桌面-图形G4_44核160G</li><li>G5L.5XMEDIUM40： 云桌面-图形G5_10核40G</li><li>G5L.5XLARGE80： 云桌面-图形G5_22核80G</li><li>G5L.21XMEDIUM160： 云桌面-图形G5_42核160G</li><li>G5L.21XLARGE320： 云桌面-图形G5_84核320G</li><li>G6L.8XLARGE96： 云桌面-图形G6_32核96G</li><li>G6L.16XLARGE192： 云桌面-图形G6_64核192G</li><li>G6L.24XLARGE288： 云桌面-图形G6_96核288G</li><li>G6L.32XLARGE384： 云桌面-图形G6_128核384G</li><li>G6L.48XLARGE576： 云桌面-图形G6_192核576G</li><li>G6L.64XLARGE768： 云桌面-图形G6_256核768G</li><li>G6L.96XLARGE1152： 云桌面-图形G6_384核1152G</li><li>G6L.96XLARGE1536： 云桌面-图形G6_384核1536G</li><li>G6L.192XLARGE2304： 云桌面-图形G6_768核2304G</li><li>G6Ls.8XLARGE96： 云桌面-图形G6s_32核96G</li><li>G6Ls.16XLARGE192： 云桌面-图形G6s_64核192G</li><li>G6Ls.24XLARGE288： 云桌面-图形G6s_96核288G</li><li>G6Ls.32XLARGE384： 云桌面-图形G6s_128核384G</li><li>G6Ls.48XLARGE576： 云桌面-图形G6s_192核576G</li><li>G6Ls.64XLARGE768： 云桌面-图形G6s_256核768G</li><li>G6Ls.96XLARGE1152： 云桌面-图形G6s_384核1152G</li><li>G6Ls.96XLARGE1536： 云桌面-图形G6s_384核1536G</li><li>G6Ls.192XLARGE2304： 云桌面-图形G6s_768核2304G</li><li>G8L.8XLARGE96： 云桌面-图形G8_32核96G</li><li>G8L.12XLARGE192： 云桌面-图形G8_48核192G</li><li>G8L.16XLARGE192： 云桌面-图形G8_64核192G</li><li>G8L.24XLARGE384： 云桌面-图形G8_96核384G</li><li>G8L.32XLARGE384： 云桌面-图形G8_128核384G</li><li>G8L.48XLARGE768： 云桌面-图形G8_192核768G</li><li>G8L.64XLARGE768： 云桌面-图形G8_256核768G</li><li>G8L.96XLARGE1536： 云桌面-图形G8_384核1536G</li><li>G9L.12XLARGE192： 云桌面-图形G9_48核192G</li><li>G9L.24XLARGE384： 云桌面-图形G9_96核384G</li><li>G9L.48XLARGE768： 云桌面-图形G9_192核768G</li><li>G9L.96XLARGE1536： 云桌面-图形G9_384核1536G</li></ul>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>系统盘信息</p> 
     * @return SystemDisk <p>系统盘信息</p>
     */
    public Disk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>系统盘信息</p>
     * @param SystemDisk <p>系统盘信息</p>
     */
    public void setSystemDisk(Disk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>镜像ID</p> 
     * @return ImageId <p>镜像ID</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像ID</p>
     * @param ImageId <p>镜像ID</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p> 
     * @return VirtualPrivateCloud <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
     * @param VirtualPrivateCloud <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get <p>实例显示名称。</p><li> 如果该字段为空，则采用默认格式：云桌面型号+月日+三位随机数+镜像ID。</li><li> 购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server_{R:3}，购买1台时，实例显示名称为server_3；购买2台时，实例显示名称分别为server_3，server_4。支持指定多个模式串{R:x}。</li><li> 购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server_1，server_2。</li><li> 最多支持60个字符（包含模式串）。</li> 
     * @return InstanceName <p>实例显示名称。</p><li> 如果该字段为空，则采用默认格式：云桌面型号+月日+三位随机数+镜像ID。</li><li> 购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server_{R:3}，购买1台时，实例显示名称为server_3；购买2台时，实例显示名称分别为server_3，server_4。支持指定多个模式串{R:x}。</li><li> 购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server_1，server_2。</li><li> 最多支持60个字符（包含模式串）。</li>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例显示名称。</p><li> 如果该字段为空，则采用默认格式：云桌面型号+月日+三位随机数+镜像ID。</li><li> 购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server_{R:3}，购买1台时，实例显示名称为server_3；购买2台时，实例显示名称分别为server_3，server_4。支持指定多个模式串{R:x}。</li><li> 购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server_1，server_2。</li><li> 最多支持60个字符（包含模式串）。</li>
     * @param InstanceName <p>实例显示名称。</p><li> 如果该字段为空，则采用默认格式：云桌面型号+月日+三位随机数+镜像ID。</li><li> 购买多台实例，如果指定模式串{R:x}，表示生成数字[x, x+n-1]，其中n表示购买实例的数量，例如server_{R:3}，购买1台时，实例显示名称为server_3；购买2台时，实例显示名称分别为server_3，server_4。支持指定多个模式串{R:x}。</li><li> 购买多台实例，如果不指定模式串，则在实例显示名称添加后缀1、2...n，其中n表示购买实例的数量，例如server_，购买2台时，实例显示名称分别为server_1，server_2。</li><li> 最多支持60个字符（包含模式串）。</li>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>购买实例数量。取值范围[1,50]。默认为1</p> 
     * @return InstanceCount <p>购买实例数量。取值范围[1,50]。默认为1</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>购买实例数量。取值范围[1,50]。默认为1</p>
     * @param InstanceCount <p>购买实例数量。取值范围[1,50]。默认为1</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>数据盘信息。目前只支持一块数据盘。</p> 
     * @return DataDisks <p>数据盘信息。目前只支持一块数据盘。</p>
     */
    public Disk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>数据盘信息。目前只支持一块数据盘。</p>
     * @param DataDisks <p>数据盘信息。目前只支持一块数据盘。</p>
     */
    public void setDataDisks(Disk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get <p>实例计费类型。</p><li> PREPAID：预付费，即包年包月</li><li> POSTPAID_BY_HOUR：按小时后付费</li>默认为PREPAID 
     * @return ChargeType <p>实例计费类型。</p><li> PREPAID：预付费，即包年包月</li><li> POSTPAID_BY_HOUR：按小时后付费</li>默认为PREPAID
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>实例计费类型。</p><li> PREPAID：预付费，即包年包月</li><li> POSTPAID_BY_HOUR：按小时后付费</li>默认为PREPAID
     * @param ChargeType <p>实例计费类型。</p><li> PREPAID：预付费，即包年包月</li><li> POSTPAID_BY_HOUR：按小时后付费</li>默认为PREPAID
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p> 
     * @return ChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     */
    public ChargePrepaid getChargePrepaid() {
        return this.ChargePrepaid;
    }

    /**
     * Set <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     * @param ChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     */
    public void setChargePrepaid(ChargePrepaid ChargePrepaid) {
        this.ChargePrepaid = ChargePrepaid;
    }

    /**
     * Get <p>是否只预检此次请求。</p><li> true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。如果检查通过，则返回的错误码为DryRunOperation；如果返回其他错误码表示检查没有通过；</li><li> false（默认）：发送正常请求，通过检查后直接创建实例</li> 
     * @return DryRun <p>是否只预检此次请求。</p><li> true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。如果检查通过，则返回的错误码为DryRunOperation；如果返回其他错误码表示检查没有通过；</li><li> false（默认）：发送正常请求，通过检查后直接创建实例</li>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>是否只预检此次请求。</p><li> true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。如果检查通过，则返回的错误码为DryRunOperation；如果返回其他错误码表示检查没有通过；</li><li> false（默认）：发送正常请求，通过检查后直接创建实例</li>
     * @param DryRun <p>是否只预检此次请求。</p><li> true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。如果检查通过，则返回的错误码为DryRunOperation；如果返回其他错误码表示检查没有通过；</li><li> false（默认）：发送正常请求，通过检查后直接创建实例</li>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get <p>允许绑定用户前的匿名访问。默认值：false。</p> 
     * @return AnonymousAccess <p>允许绑定用户前的匿名访问。默认值：false。</p>
     */
    public Boolean getAnonymousAccess() {
        return this.AnonymousAccess;
    }

    /**
     * Set <p>允许绑定用户前的匿名访问。默认值：false。</p>
     * @param AnonymousAccess <p>允许绑定用户前的匿名访问。默认值：false。</p>
     */
    public void setAnonymousAccess(Boolean AnonymousAccess) {
        this.AnonymousAccess = AnonymousAccess;
    }

    /**
     * Get <p>关联的安全组ID列表</p> 
     * @return SecurityGroups <p>关联的安全组ID列表</p>
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set <p>关联的安全组ID列表</p>
     * @param SecurityGroups <p>关联的安全组ID列表</p>
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get <p>桌面池ID</p> 
     * @return PoolId <p>桌面池ID</p>
     */
    public String getPoolId() {
        return this.PoolId;
    }

    /**
     * Set <p>桌面池ID</p>
     * @param PoolId <p>桌面池ID</p>
     */
    public void setPoolId(String PoolId) {
        this.PoolId = PoolId;
    }

    /**
     * Get <p>域名管控策略ID</p> 
     * @return DomainControlPolicies <p>域名管控策略ID</p>
     */
    public String [] getDomainControlPolicies() {
        return this.DomainControlPolicies;
    }

    /**
     * Set <p>域名管控策略ID</p>
     * @param DomainControlPolicies <p>域名管控策略ID</p>
     */
    public void setDomainControlPolicies(String [] DomainControlPolicies) {
        this.DomainControlPolicies = DomainControlPolicies;
    }

    /**
     * Get <p>标签，最多10个</p> 
     * @return Tags <p>标签，最多10个</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签，最多10个</p>
     * @param Tags <p>标签，最多10个</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
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

