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

public class CreateInstanceRequest extends AbstractModel {

    /**
    * <p>产品ID，不同产品ID表示不同的EMR产品版本。取值范围：<br>51:表示STARROCKS-V1.4.0<br>54:表示STARROCKS-V2.0.0<br>27:表示KAFKA-V1.0.0<br>50:表示KAFKA-V2.0.0<br>16:表示EMR-V2.3.0<br>20:表示EMR-V2.5.0<br>30:表示EMR-V2.6.0<br>38:表示EMR-V2.7.0<br>25:表示EMR-V3.1.0<br>33:表示EMR-V3.2.1<br>34:表示EMR-V3.3.0<br>37:表示EMR-V3.4.0<br>44:表示EMR-V3.5.0<br>53:表示EMR-V3.6.0<br>58:表示EMR-3.6.1<br>59:表示EMR-serverless-1.0.0<br>60:表示EMR-TKE-1.1.0<br>61:表示SR-V2.1.0<br>62:表示SR-V2.1.0-SharedData<br>63:表示SR-V2.1.0.tlinux<br>64:表示统一元数据管理项目<br>65:表示EMR-TKE-AI-1.0.0<br>66:表示RSS-1.0.0<br>67:表示SR-V2.2.0<br>68:表示SR-V2.2.0.tlinux<br>69:表示EMR-AI-1.1.0<br>70:表示SR-V2.2.1<br>71:表示EMR-3.7.0<br>72:表示EMR-serverless-1.0.1<br>73:表示KAFKA-2.0.1<br>74:表示SR-V2.2.2<br>75:表示EMR-TKE-AI-1.1.0<br>76:表示EMR-V3.7.1<br>77:表示SERVERLESS-TCBASE-1.0.0<br>78:表示EMR-V3.6.2<br>79:表示STARROCKS-V2.2.2<br>80:表示EMR-AI-V1.1.1</p>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * <p>部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：<a href="https://cloud.tencent.com/document/product/589/20279">组件版本</a> ；<br>填写实例值：hive、flink。</p>
    */
    @SerializedName("Software")
    @Expose
    private String [] Software;

    /**
    * <p>是否开启节点高可用。取值范围：</p><li>0：表示不开启节点高可用。</li><li>1：表示开启节点高可用。</li>
    */
    @SerializedName("SupportHA")
    @Expose
    private Long SupportHA;

    /**
    * <p>实例名称。</p><li>长度限制为6-36个字符。</li><li>只允许包含中文、字母、数字、-、_。</li>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>购买实例的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>购买实例的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。</p><li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li><li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
    * <p>节点资源的规格。</p>
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NewResourceSpec ResourceSpec;

    /**
    * <p>开启COS访问需要设置的参数。</p>
    */
    @SerializedName("COSSettings")
    @Expose
    private COSSettings COSSettings;

    /**
    * <p>实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。</p>
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * <p>实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p>
    */
    @SerializedName("SgId")
    @Expose
    private String SgId;

    /**
    * <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p>
    */
    @SerializedName("PreExecutedFileSettings")
    @Expose
    private PreExecuteFileSettings [] PreExecutedFileSettings;

    /**
    * <p>包年包月实例是否自动续费。取值范围：</p><li>0：表示不自动续费。</li><li>1：表示自动续费。</li>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>是否开启集群Master节点公网。取值范围：</p><li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li><li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。
    */
    @SerializedName("NeedMasterWan")
    @Expose
    private String NeedMasterWan;

    /**
    * <p>是否需要开启外网远程登录，即22号端口。在SgId不为空时，该参数无效。</p>
    */
    @SerializedName("RemoteLoginAtCreate")
    @Expose
    private Long RemoteLoginAtCreate;

    /**
    * <p>是否开启安全集群。0表示不开启，非0表示开启。</p>
    */
    @SerializedName("CheckSecurity")
    @Expose
    private Long CheckSecurity;

    /**
    * <p>访问外部文件系统。</p>
    */
    @SerializedName("ExtendFsField")
    @Expose
    private String ExtendFsField;

    /**
    * <p>标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/15486">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>集群维度CBS加密盘，默认0表示不加密，1表示加密</p>
    */
    @SerializedName("CbsEncrypt")
    @Expose
    private Long CbsEncrypt;

    /**
    * <p>hive共享元数据库类型。取值范围：</p><li>EMR_DEFAULT_META：表示集群默认创建</li><li>EMR_EXIST_META：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * <p>EMR-MetaDB实例</p>
    */
    @SerializedName("UnifyMetaInstanceId")
    @Expose
    private String UnifyMetaInstanceId;

    /**
    * <p>自定义MetaDB信息</p>
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaInfo MetaDBInfo;

    /**
    * <p>自定义应用角色。</p>
    */
    @SerializedName("ApplicationRole")
    @Expose
    private String ApplicationRole;

    /**
    * <p>场景化取值：<br>Hadoop-Kudu<br>Hadoop-Zookeeper<br>Hadoop-Presto<br>Hadoop-Hbase</p>
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * <p>共享组件信息</p>
    */
    @SerializedName("ExternalService")
    @Expose
    private ExternalService [] ExternalService;

    /**
    * <p>如果为0，则MultiZone、MultiDeployStrategy、MultiZoneSettings是disable的状态，如果为1，则废弃ResourceSpec，使用MultiZoneSettings。</p>
    */
    @SerializedName("VersionID")
    @Expose
    private Long VersionID;

    /**
    * <p>true表示开启跨AZ部署；仅为新建集群时的用户参数，后续不支持调整。</p>
    */
    @SerializedName("MultiZone")
    @Expose
    private Boolean MultiZone;

    /**
    * <p>节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。</p>
    */
    @SerializedName("MultiZoneSettings")
    @Expose
    private MultiZoneSetting [] MultiZoneSettings;

    /**
    * <p>cos桶路径，创建StarRocks存算分离集群时用到</p>
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * <p>节点标识信息，目前只提供给tf平台使用</p>
    */
    @SerializedName("NodeMarks")
    @Expose
    private NodeMark [] NodeMarks;

    /**
    * <p>CLB id</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>数据库类型：mysql8/tdsql8</p>
    */
    @SerializedName("DefaultMetaVersion")
    @Expose
    private String DefaultMetaVersion;

    /**
    * <p>是否开通审计：0:不开通,1:开通</p>
    */
    @SerializedName("NeedCdbAudit")
    @Expose
    private Long NeedCdbAudit;

    /**
    * <p>安全组指定来源ip</p>
    */
    @SerializedName("SgIP")
    @Expose
    private String SgIP;

    /**
    * <p>分区置放群组分区</p>
    */
    @SerializedName("PartitionNumber")
    @Expose
    private Long PartitionNumber;

    /**
     * Get <p>产品ID，不同产品ID表示不同的EMR产品版本。取值范围：<br>51:表示STARROCKS-V1.4.0<br>54:表示STARROCKS-V2.0.0<br>27:表示KAFKA-V1.0.0<br>50:表示KAFKA-V2.0.0<br>16:表示EMR-V2.3.0<br>20:表示EMR-V2.5.0<br>30:表示EMR-V2.6.0<br>38:表示EMR-V2.7.0<br>25:表示EMR-V3.1.0<br>33:表示EMR-V3.2.1<br>34:表示EMR-V3.3.0<br>37:表示EMR-V3.4.0<br>44:表示EMR-V3.5.0<br>53:表示EMR-V3.6.0<br>58:表示EMR-3.6.1<br>59:表示EMR-serverless-1.0.0<br>60:表示EMR-TKE-1.1.0<br>61:表示SR-V2.1.0<br>62:表示SR-V2.1.0-SharedData<br>63:表示SR-V2.1.0.tlinux<br>64:表示统一元数据管理项目<br>65:表示EMR-TKE-AI-1.0.0<br>66:表示RSS-1.0.0<br>67:表示SR-V2.2.0<br>68:表示SR-V2.2.0.tlinux<br>69:表示EMR-AI-1.1.0<br>70:表示SR-V2.2.1<br>71:表示EMR-3.7.0<br>72:表示EMR-serverless-1.0.1<br>73:表示KAFKA-2.0.1<br>74:表示SR-V2.2.2<br>75:表示EMR-TKE-AI-1.1.0<br>76:表示EMR-V3.7.1<br>77:表示SERVERLESS-TCBASE-1.0.0<br>78:表示EMR-V3.6.2<br>79:表示STARROCKS-V2.2.2<br>80:表示EMR-AI-V1.1.1</p> 
     * @return ProductId <p>产品ID，不同产品ID表示不同的EMR产品版本。取值范围：<br>51:表示STARROCKS-V1.4.0<br>54:表示STARROCKS-V2.0.0<br>27:表示KAFKA-V1.0.0<br>50:表示KAFKA-V2.0.0<br>16:表示EMR-V2.3.0<br>20:表示EMR-V2.5.0<br>30:表示EMR-V2.6.0<br>38:表示EMR-V2.7.0<br>25:表示EMR-V3.1.0<br>33:表示EMR-V3.2.1<br>34:表示EMR-V3.3.0<br>37:表示EMR-V3.4.0<br>44:表示EMR-V3.5.0<br>53:表示EMR-V3.6.0<br>58:表示EMR-3.6.1<br>59:表示EMR-serverless-1.0.0<br>60:表示EMR-TKE-1.1.0<br>61:表示SR-V2.1.0<br>62:表示SR-V2.1.0-SharedData<br>63:表示SR-V2.1.0.tlinux<br>64:表示统一元数据管理项目<br>65:表示EMR-TKE-AI-1.0.0<br>66:表示RSS-1.0.0<br>67:表示SR-V2.2.0<br>68:表示SR-V2.2.0.tlinux<br>69:表示EMR-AI-1.1.0<br>70:表示SR-V2.2.1<br>71:表示EMR-3.7.0<br>72:表示EMR-serverless-1.0.1<br>73:表示KAFKA-2.0.1<br>74:表示SR-V2.2.2<br>75:表示EMR-TKE-AI-1.1.0<br>76:表示EMR-V3.7.1<br>77:表示SERVERLESS-TCBASE-1.0.0<br>78:表示EMR-V3.6.2<br>79:表示STARROCKS-V2.2.2<br>80:表示EMR-AI-V1.1.1</p>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品ID，不同产品ID表示不同的EMR产品版本。取值范围：<br>51:表示STARROCKS-V1.4.0<br>54:表示STARROCKS-V2.0.0<br>27:表示KAFKA-V1.0.0<br>50:表示KAFKA-V2.0.0<br>16:表示EMR-V2.3.0<br>20:表示EMR-V2.5.0<br>30:表示EMR-V2.6.0<br>38:表示EMR-V2.7.0<br>25:表示EMR-V3.1.0<br>33:表示EMR-V3.2.1<br>34:表示EMR-V3.3.0<br>37:表示EMR-V3.4.0<br>44:表示EMR-V3.5.0<br>53:表示EMR-V3.6.0<br>58:表示EMR-3.6.1<br>59:表示EMR-serverless-1.0.0<br>60:表示EMR-TKE-1.1.0<br>61:表示SR-V2.1.0<br>62:表示SR-V2.1.0-SharedData<br>63:表示SR-V2.1.0.tlinux<br>64:表示统一元数据管理项目<br>65:表示EMR-TKE-AI-1.0.0<br>66:表示RSS-1.0.0<br>67:表示SR-V2.2.0<br>68:表示SR-V2.2.0.tlinux<br>69:表示EMR-AI-1.1.0<br>70:表示SR-V2.2.1<br>71:表示EMR-3.7.0<br>72:表示EMR-serverless-1.0.1<br>73:表示KAFKA-2.0.1<br>74:表示SR-V2.2.2<br>75:表示EMR-TKE-AI-1.1.0<br>76:表示EMR-V3.7.1<br>77:表示SERVERLESS-TCBASE-1.0.0<br>78:表示EMR-V3.6.2<br>79:表示STARROCKS-V2.2.2<br>80:表示EMR-AI-V1.1.1</p>
     * @param ProductId <p>产品ID，不同产品ID表示不同的EMR产品版本。取值范围：<br>51:表示STARROCKS-V1.4.0<br>54:表示STARROCKS-V2.0.0<br>27:表示KAFKA-V1.0.0<br>50:表示KAFKA-V2.0.0<br>16:表示EMR-V2.3.0<br>20:表示EMR-V2.5.0<br>30:表示EMR-V2.6.0<br>38:表示EMR-V2.7.0<br>25:表示EMR-V3.1.0<br>33:表示EMR-V3.2.1<br>34:表示EMR-V3.3.0<br>37:表示EMR-V3.4.0<br>44:表示EMR-V3.5.0<br>53:表示EMR-V3.6.0<br>58:表示EMR-3.6.1<br>59:表示EMR-serverless-1.0.0<br>60:表示EMR-TKE-1.1.0<br>61:表示SR-V2.1.0<br>62:表示SR-V2.1.0-SharedData<br>63:表示SR-V2.1.0.tlinux<br>64:表示统一元数据管理项目<br>65:表示EMR-TKE-AI-1.0.0<br>66:表示RSS-1.0.0<br>67:表示SR-V2.2.0<br>68:表示SR-V2.2.0.tlinux<br>69:表示EMR-AI-1.1.0<br>70:表示SR-V2.2.1<br>71:表示EMR-3.7.0<br>72:表示EMR-serverless-1.0.1<br>73:表示KAFKA-2.0.1<br>74:表示SR-V2.2.2<br>75:表示EMR-TKE-AI-1.1.0<br>76:表示EMR-V3.7.1<br>77:表示SERVERLESS-TCBASE-1.0.0<br>78:表示EMR-V3.6.2<br>79:表示STARROCKS-V2.2.2<br>80:表示EMR-AI-V1.1.1</p>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：<a href="https://cloud.tencent.com/document/product/589/20279">组件版本</a> ；<br>填写实例值：hive、flink。</p> 
     * @return Software <p>部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：<a href="https://cloud.tencent.com/document/product/589/20279">组件版本</a> ；<br>填写实例值：hive、flink。</p>
     */
    public String [] getSoftware() {
        return this.Software;
    }

    /**
     * Set <p>部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：<a href="https://cloud.tencent.com/document/product/589/20279">组件版本</a> ；<br>填写实例值：hive、flink。</p>
     * @param Software <p>部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）对应不同可选组件列表，不同产品版本可选组件列表查询：<a href="https://cloud.tencent.com/document/product/589/20279">组件版本</a> ；<br>填写实例值：hive、flink。</p>
     */
    public void setSoftware(String [] Software) {
        this.Software = Software;
    }

    /**
     * Get <p>是否开启节点高可用。取值范围：</p><li>0：表示不开启节点高可用。</li><li>1：表示开启节点高可用。</li> 
     * @return SupportHA <p>是否开启节点高可用。取值范围：</p><li>0：表示不开启节点高可用。</li><li>1：表示开启节点高可用。</li>
     */
    public Long getSupportHA() {
        return this.SupportHA;
    }

    /**
     * Set <p>是否开启节点高可用。取值范围：</p><li>0：表示不开启节点高可用。</li><li>1：表示开启节点高可用。</li>
     * @param SupportHA <p>是否开启节点高可用。取值范围：</p><li>0：表示不开启节点高可用。</li><li>1：表示开启节点高可用。</li>
     */
    public void setSupportHA(Long SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * Get <p>实例名称。</p><li>长度限制为6-36个字符。</li><li>只允许包含中文、字母、数字、-、_。</li> 
     * @return InstanceName <p>实例名称。</p><li>长度限制为6-36个字符。</li><li>只允许包含中文、字母、数字、-、_。</li>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称。</p><li>长度限制为6-36个字符。</li><li>只允许包含中文、字母、数字、-、_。</li>
     * @param InstanceName <p>实例名称。</p><li>长度限制为6-36个字符。</li><li>只允许包含中文、字母、数字、-、_。</li>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li> 
     * @return PayMode <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
     * @param PayMode <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>购买实例的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li> 
     * @return TimeSpan <p>购买实例的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>购买实例的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     * @param TimeSpan <p>购买实例的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>购买实例的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li> 
     * @return TimeUnit <p>购买实例的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>购买实例的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     * @param TimeUnit <p>购买实例的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。</p><li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li><li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li> 
     * @return LoginSettings <p>实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。</p><li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li><li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。</p><li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li><li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li>
     * @param LoginSettings <p>实例登录设置。通过该参数可以设置所购买节点的登录方式密码或者密钥。</p><li>设置密钥时，密码仅用于组件原生WebUI快捷入口登录。</li><li>未设置密钥时，密码用于登录所购节点以及组件原生WebUI快捷入口登录。</li>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p> 
     * @return VPCSettings <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * Set <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
     * @param VPCSettings <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
    }

    /**
     * Get <p>节点资源的规格。</p> 
     * @return ResourceSpec <p>节点资源的规格。</p>
     */
    public NewResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set <p>节点资源的规格。</p>
     * @param ResourceSpec <p>节点资源的规格。</p>
     */
    public void setResourceSpec(NewResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get <p>开启COS访问需要设置的参数。</p> 
     * @return COSSettings <p>开启COS访问需要设置的参数。</p>
     */
    public COSSettings getCOSSettings() {
        return this.COSSettings;
    }

    /**
     * Set <p>开启COS访问需要设置的参数。</p>
     * @param COSSettings <p>开启COS访问需要设置的参数。</p>
     */
    public void setCOSSettings(COSSettings COSSettings) {
        this.COSSettings = COSSettings;
    }

    /**
     * Get <p>实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。</p> 
     * @return Placement <p>实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。</p>
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set <p>实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。</p>
     * @param Placement <p>实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。</p>
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get <p>实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p> 
     * @return SgId <p>实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p>
     */
    public String getSgId() {
        return this.SgId;
    }

    /**
     * Set <p>实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p>
     * @param SgId <p>实例所属安全组的ID，形如sg-xxxxxxxx。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p>
     */
    public void setSgId(String SgId) {
        this.SgId = SgId;
    }

    /**
     * Get <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p> 
     * @return PreExecutedFileSettings <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p>
     */
    public PreExecuteFileSettings [] getPreExecutedFileSettings() {
        return this.PreExecutedFileSettings;
    }

    /**
     * Set <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p>
     * @param PreExecutedFileSettings <p><a href="https://cloud.tencent.com/document/product/589/35656">引导操作</a>脚本设置。</p>
     */
    public void setPreExecutedFileSettings(PreExecuteFileSettings [] PreExecutedFileSettings) {
        this.PreExecutedFileSettings = PreExecutedFileSettings;
    }

    /**
     * Get <p>包年包月实例是否自动续费。取值范围：</p><li>0：表示不自动续费。</li><li>1：表示自动续费。</li> 
     * @return AutoRenew <p>包年包月实例是否自动续费。取值范围：</p><li>0：表示不自动续费。</li><li>1：表示自动续费。</li>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>包年包月实例是否自动续费。取值范围：</p><li>0：表示不自动续费。</li><li>1：表示自动续费。</li>
     * @param AutoRenew <p>包年包月实例是否自动续费。取值范围：</p><li>0：表示不自动续费。</li><li>1：表示自动续费。</li>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
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
     * Get <p>是否开启集群Master节点公网。取值范围：</p><li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li><li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。 
     * @return NeedMasterWan <p>是否开启集群Master节点公网。取值范围：</p><li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li><li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。
     */
    public String getNeedMasterWan() {
        return this.NeedMasterWan;
    }

    /**
     * Set <p>是否开启集群Master节点公网。取值范围：</p><li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li><li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。
     * @param NeedMasterWan <p>是否开启集群Master节点公网。取值范围：</p><li>NEED_MASTER_WAN：表示开启集群Master节点公网。</li><li>NOT_NEED_MASTER_WAN：表示不开启。</li>默认开启集群Master节点公网。
     */
    public void setNeedMasterWan(String NeedMasterWan) {
        this.NeedMasterWan = NeedMasterWan;
    }

    /**
     * Get <p>是否需要开启外网远程登录，即22号端口。在SgId不为空时，该参数无效。</p> 
     * @return RemoteLoginAtCreate <p>是否需要开启外网远程登录，即22号端口。在SgId不为空时，该参数无效。</p>
     */
    public Long getRemoteLoginAtCreate() {
        return this.RemoteLoginAtCreate;
    }

    /**
     * Set <p>是否需要开启外网远程登录，即22号端口。在SgId不为空时，该参数无效。</p>
     * @param RemoteLoginAtCreate <p>是否需要开启外网远程登录，即22号端口。在SgId不为空时，该参数无效。</p>
     */
    public void setRemoteLoginAtCreate(Long RemoteLoginAtCreate) {
        this.RemoteLoginAtCreate = RemoteLoginAtCreate;
    }

    /**
     * Get <p>是否开启安全集群。0表示不开启，非0表示开启。</p> 
     * @return CheckSecurity <p>是否开启安全集群。0表示不开启，非0表示开启。</p>
     */
    public Long getCheckSecurity() {
        return this.CheckSecurity;
    }

    /**
     * Set <p>是否开启安全集群。0表示不开启，非0表示开启。</p>
     * @param CheckSecurity <p>是否开启安全集群。0表示不开启，非0表示开启。</p>
     */
    public void setCheckSecurity(Long CheckSecurity) {
        this.CheckSecurity = CheckSecurity;
    }

    /**
     * Get <p>访问外部文件系统。</p> 
     * @return ExtendFsField <p>访问外部文件系统。</p>
     */
    public String getExtendFsField() {
        return this.ExtendFsField;
    }

    /**
     * Set <p>访问外部文件系统。</p>
     * @param ExtendFsField <p>访问外部文件系统。</p>
     */
    public void setExtendFsField(String ExtendFsField) {
        this.ExtendFsField = ExtendFsField;
    }

    /**
     * Get <p>标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。</p> 
     * @return Tags <p>标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。</p>
     * @param Tags <p>标签描述列表。通过指定该参数可以同时绑定标签到相应的实例。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/15486">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p> 
     * @return DisasterRecoverGroupIds <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/15486">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/15486">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p>
     * @param DisasterRecoverGroupIds <p>分散置放群组ID列表，当前只支持指定一个。<br>该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/213/15486">DescribeSecurityGroups</a> 的返回值中的SecurityGroupId字段来获取。</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>集群维度CBS加密盘，默认0表示不加密，1表示加密</p> 
     * @return CbsEncrypt <p>集群维度CBS加密盘，默认0表示不加密，1表示加密</p>
     */
    public Long getCbsEncrypt() {
        return this.CbsEncrypt;
    }

    /**
     * Set <p>集群维度CBS加密盘，默认0表示不加密，1表示加密</p>
     * @param CbsEncrypt <p>集群维度CBS加密盘，默认0表示不加密，1表示加密</p>
     */
    public void setCbsEncrypt(Long CbsEncrypt) {
        this.CbsEncrypt = CbsEncrypt;
    }

    /**
     * Get <p>hive共享元数据库类型。取值范围：</p><li>EMR_DEFAULT_META：表示集群默认创建</li><li>EMR_EXIST_META：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li> 
     * @return MetaType <p>hive共享元数据库类型。取值范围：</p><li>EMR_DEFAULT_META：表示集群默认创建</li><li>EMR_EXIST_META：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set <p>hive共享元数据库类型。取值范围：</p><li>EMR_DEFAULT_META：表示集群默认创建</li><li>EMR_EXIST_META：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     * @param MetaType <p>hive共享元数据库类型。取值范围：</p><li>EMR_DEFAULT_META：表示集群默认创建</li><li>EMR_EXIST_META：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get <p>EMR-MetaDB实例</p> 
     * @return UnifyMetaInstanceId <p>EMR-MetaDB实例</p>
     */
    public String getUnifyMetaInstanceId() {
        return this.UnifyMetaInstanceId;
    }

    /**
     * Set <p>EMR-MetaDB实例</p>
     * @param UnifyMetaInstanceId <p>EMR-MetaDB实例</p>
     */
    public void setUnifyMetaInstanceId(String UnifyMetaInstanceId) {
        this.UnifyMetaInstanceId = UnifyMetaInstanceId;
    }

    /**
     * Get <p>自定义MetaDB信息</p> 
     * @return MetaDBInfo <p>自定义MetaDB信息</p>
     */
    public CustomMetaInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set <p>自定义MetaDB信息</p>
     * @param MetaDBInfo <p>自定义MetaDB信息</p>
     */
    public void setMetaDBInfo(CustomMetaInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    /**
     * Get <p>自定义应用角色。</p> 
     * @return ApplicationRole <p>自定义应用角色。</p>
     */
    public String getApplicationRole() {
        return this.ApplicationRole;
    }

    /**
     * Set <p>自定义应用角色。</p>
     * @param ApplicationRole <p>自定义应用角色。</p>
     */
    public void setApplicationRole(String ApplicationRole) {
        this.ApplicationRole = ApplicationRole;
    }

    /**
     * Get <p>场景化取值：<br>Hadoop-Kudu<br>Hadoop-Zookeeper<br>Hadoop-Presto<br>Hadoop-Hbase</p> 
     * @return SceneName <p>场景化取值：<br>Hadoop-Kudu<br>Hadoop-Zookeeper<br>Hadoop-Presto<br>Hadoop-Hbase</p>
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set <p>场景化取值：<br>Hadoop-Kudu<br>Hadoop-Zookeeper<br>Hadoop-Presto<br>Hadoop-Hbase</p>
     * @param SceneName <p>场景化取值：<br>Hadoop-Kudu<br>Hadoop-Zookeeper<br>Hadoop-Presto<br>Hadoop-Hbase</p>
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get <p>共享组件信息</p> 
     * @return ExternalService <p>共享组件信息</p>
     */
    public ExternalService [] getExternalService() {
        return this.ExternalService;
    }

    /**
     * Set <p>共享组件信息</p>
     * @param ExternalService <p>共享组件信息</p>
     */
    public void setExternalService(ExternalService [] ExternalService) {
        this.ExternalService = ExternalService;
    }

    /**
     * Get <p>如果为0，则MultiZone、MultiDeployStrategy、MultiZoneSettings是disable的状态，如果为1，则废弃ResourceSpec，使用MultiZoneSettings。</p> 
     * @return VersionID <p>如果为0，则MultiZone、MultiDeployStrategy、MultiZoneSettings是disable的状态，如果为1，则废弃ResourceSpec，使用MultiZoneSettings。</p>
     */
    public Long getVersionID() {
        return this.VersionID;
    }

    /**
     * Set <p>如果为0，则MultiZone、MultiDeployStrategy、MultiZoneSettings是disable的状态，如果为1，则废弃ResourceSpec，使用MultiZoneSettings。</p>
     * @param VersionID <p>如果为0，则MultiZone、MultiDeployStrategy、MultiZoneSettings是disable的状态，如果为1，则废弃ResourceSpec，使用MultiZoneSettings。</p>
     */
    public void setVersionID(Long VersionID) {
        this.VersionID = VersionID;
    }

    /**
     * Get <p>true表示开启跨AZ部署；仅为新建集群时的用户参数，后续不支持调整。</p> 
     * @return MultiZone <p>true表示开启跨AZ部署；仅为新建集群时的用户参数，后续不支持调整。</p>
     */
    public Boolean getMultiZone() {
        return this.MultiZone;
    }

    /**
     * Set <p>true表示开启跨AZ部署；仅为新建集群时的用户参数，后续不支持调整。</p>
     * @param MultiZone <p>true表示开启跨AZ部署；仅为新建集群时的用户参数，后续不支持调整。</p>
     */
    public void setMultiZone(Boolean MultiZone) {
        this.MultiZone = MultiZone;
    }

    /**
     * Get <p>节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。</p> 
     * @return MultiZoneSettings <p>节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。</p>
     */
    public MultiZoneSetting [] getMultiZoneSettings() {
        return this.MultiZoneSettings;
    }

    /**
     * Set <p>节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。</p>
     * @param MultiZoneSettings <p>节点资源的规格，有几个可用区，就填几个，按顺序第一个为主可用区，第二个为备可用区，第三个为仲裁可用区。如果没有开启跨AZ，则长度为1即可。</p>
     */
    public void setMultiZoneSettings(MultiZoneSetting [] MultiZoneSettings) {
        this.MultiZoneSettings = MultiZoneSettings;
    }

    /**
     * Get <p>cos桶路径，创建StarRocks存算分离集群时用到</p> 
     * @return CosBucket <p>cos桶路径，创建StarRocks存算分离集群时用到</p>
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set <p>cos桶路径，创建StarRocks存算分离集群时用到</p>
     * @param CosBucket <p>cos桶路径，创建StarRocks存算分离集群时用到</p>
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get <p>节点标识信息，目前只提供给tf平台使用</p> 
     * @return NodeMarks <p>节点标识信息，目前只提供给tf平台使用</p>
     */
    public NodeMark [] getNodeMarks() {
        return this.NodeMarks;
    }

    /**
     * Set <p>节点标识信息，目前只提供给tf平台使用</p>
     * @param NodeMarks <p>节点标识信息，目前只提供给tf平台使用</p>
     */
    public void setNodeMarks(NodeMark [] NodeMarks) {
        this.NodeMarks = NodeMarks;
    }

    /**
     * Get <p>CLB id</p> 
     * @return LoadBalancerId <p>CLB id</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>CLB id</p>
     * @param LoadBalancerId <p>CLB id</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>数据库类型：mysql8/tdsql8</p> 
     * @return DefaultMetaVersion <p>数据库类型：mysql8/tdsql8</p>
     */
    public String getDefaultMetaVersion() {
        return this.DefaultMetaVersion;
    }

    /**
     * Set <p>数据库类型：mysql8/tdsql8</p>
     * @param DefaultMetaVersion <p>数据库类型：mysql8/tdsql8</p>
     */
    public void setDefaultMetaVersion(String DefaultMetaVersion) {
        this.DefaultMetaVersion = DefaultMetaVersion;
    }

    /**
     * Get <p>是否开通审计：0:不开通,1:开通</p> 
     * @return NeedCdbAudit <p>是否开通审计：0:不开通,1:开通</p>
     */
    public Long getNeedCdbAudit() {
        return this.NeedCdbAudit;
    }

    /**
     * Set <p>是否开通审计：0:不开通,1:开通</p>
     * @param NeedCdbAudit <p>是否开通审计：0:不开通,1:开通</p>
     */
    public void setNeedCdbAudit(Long NeedCdbAudit) {
        this.NeedCdbAudit = NeedCdbAudit;
    }

    /**
     * Get <p>安全组指定来源ip</p> 
     * @return SgIP <p>安全组指定来源ip</p>
     */
    public String getSgIP() {
        return this.SgIP;
    }

    /**
     * Set <p>安全组指定来源ip</p>
     * @param SgIP <p>安全组指定来源ip</p>
     */
    public void setSgIP(String SgIP) {
        this.SgIP = SgIP;
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

    public CreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceRequest(CreateInstanceRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.Software != null) {
            this.Software = new String[source.Software.length];
            for (int i = 0; i < source.Software.length; i++) {
                this.Software[i] = new String(source.Software[i]);
            }
        }
        if (source.SupportHA != null) {
            this.SupportHA = new Long(source.SupportHA);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.VPCSettings != null) {
            this.VPCSettings = new VPCSettings(source.VPCSettings);
        }
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new NewResourceSpec(source.ResourceSpec);
        }
        if (source.COSSettings != null) {
            this.COSSettings = new COSSettings(source.COSSettings);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.SgId != null) {
            this.SgId = new String(source.SgId);
        }
        if (source.PreExecutedFileSettings != null) {
            this.PreExecutedFileSettings = new PreExecuteFileSettings[source.PreExecutedFileSettings.length];
            for (int i = 0; i < source.PreExecutedFileSettings.length; i++) {
                this.PreExecutedFileSettings[i] = new PreExecuteFileSettings(source.PreExecutedFileSettings[i]);
            }
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.NeedMasterWan != null) {
            this.NeedMasterWan = new String(source.NeedMasterWan);
        }
        if (source.RemoteLoginAtCreate != null) {
            this.RemoteLoginAtCreate = new Long(source.RemoteLoginAtCreate);
        }
        if (source.CheckSecurity != null) {
            this.CheckSecurity = new Long(source.CheckSecurity);
        }
        if (source.ExtendFsField != null) {
            this.ExtendFsField = new String(source.ExtendFsField);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.CbsEncrypt != null) {
            this.CbsEncrypt = new Long(source.CbsEncrypt);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.UnifyMetaInstanceId != null) {
            this.UnifyMetaInstanceId = new String(source.UnifyMetaInstanceId);
        }
        if (source.MetaDBInfo != null) {
            this.MetaDBInfo = new CustomMetaInfo(source.MetaDBInfo);
        }
        if (source.ApplicationRole != null) {
            this.ApplicationRole = new String(source.ApplicationRole);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.ExternalService != null) {
            this.ExternalService = new ExternalService[source.ExternalService.length];
            for (int i = 0; i < source.ExternalService.length; i++) {
                this.ExternalService[i] = new ExternalService(source.ExternalService[i]);
            }
        }
        if (source.VersionID != null) {
            this.VersionID = new Long(source.VersionID);
        }
        if (source.MultiZone != null) {
            this.MultiZone = new Boolean(source.MultiZone);
        }
        if (source.MultiZoneSettings != null) {
            this.MultiZoneSettings = new MultiZoneSetting[source.MultiZoneSettings.length];
            for (int i = 0; i < source.MultiZoneSettings.length; i++) {
                this.MultiZoneSettings[i] = new MultiZoneSetting(source.MultiZoneSettings[i]);
            }
        }
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.NodeMarks != null) {
            this.NodeMarks = new NodeMark[source.NodeMarks.length];
            for (int i = 0; i < source.NodeMarks.length; i++) {
                this.NodeMarks[i] = new NodeMark(source.NodeMarks[i]);
            }
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.DefaultMetaVersion != null) {
            this.DefaultMetaVersion = new String(source.DefaultMetaVersion);
        }
        if (source.NeedCdbAudit != null) {
            this.NeedCdbAudit = new Long(source.NeedCdbAudit);
        }
        if (source.SgIP != null) {
            this.SgIP = new String(source.SgIP);
        }
        if (source.PartitionNumber != null) {
            this.PartitionNumber = new Long(source.PartitionNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamArraySimple(map, prefix + "Software.", this.Software);
        this.setParamSimple(map, prefix + "SupportHA", this.SupportHA);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamObj(map, prefix + "COSSettings.", this.COSSettings);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "SgId", this.SgId);
        this.setParamArrayObj(map, prefix + "PreExecutedFileSettings.", this.PreExecutedFileSettings);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "NeedMasterWan", this.NeedMasterWan);
        this.setParamSimple(map, prefix + "RemoteLoginAtCreate", this.RemoteLoginAtCreate);
        this.setParamSimple(map, prefix + "CheckSecurity", this.CheckSecurity);
        this.setParamSimple(map, prefix + "ExtendFsField", this.ExtendFsField);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "CbsEncrypt", this.CbsEncrypt);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "UnifyMetaInstanceId", this.UnifyMetaInstanceId);
        this.setParamObj(map, prefix + "MetaDBInfo.", this.MetaDBInfo);
        this.setParamSimple(map, prefix + "ApplicationRole", this.ApplicationRole);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamArrayObj(map, prefix + "ExternalService.", this.ExternalService);
        this.setParamSimple(map, prefix + "VersionID", this.VersionID);
        this.setParamSimple(map, prefix + "MultiZone", this.MultiZone);
        this.setParamArrayObj(map, prefix + "MultiZoneSettings.", this.MultiZoneSettings);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamArrayObj(map, prefix + "NodeMarks.", this.NodeMarks);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "DefaultMetaVersion", this.DefaultMetaVersion);
        this.setParamSimple(map, prefix + "NeedCdbAudit", this.NeedCdbAudit);
        this.setParamSimple(map, prefix + "SgIP", this.SgIP);
        this.setParamSimple(map, prefix + "PartitionNumber", this.PartitionNumber);

    }
}

