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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEngineRequest extends AbstractModel {

    /**
    * 引擎类型。参考值：
- zookeeper
- nacos
- consul
- apollo
- eureka
- polaris
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 引擎的开源版本。每种引擎支持的开源版本不同，请参考产品文档或者控制台购买页
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 引擎的产品版本。参考值：
- STANDARD： 标准版
- PROFESSIONAL: 专业版（Zookeeper）/企业版（PolarisMesh）

引擎各版本及可选择的规格、节点数说明：
apollo - STANDARD版本
规格列表：1C2G、2C4G、4C8G、8C16G、16C32G
节点数：1，2，3，4，5

eureka - STANDARD版本
规格列表：1C2G、2C4G、4C8G、8C16G、16C32G
节点数：3，4，5

polarismesh - STANDARD版本
规格列表：NUM50、NUM100、NUM200、NUM500、NUM1000、NUM5000、NUM10000、NUM50000

兼容原spec-xxxxxx形式的规格ID
    */
    @SerializedName("EngineProductVersion")
    @Expose
    private String EngineProductVersion;

    /**
    * 引擎所在地域。参考值说明：
中国区 参考值：
- ap-guangzhou：广州
- ap-beijing：北京
- ap-chengdu：成都
- ap-chongqing：重庆
- ap-nanjing：南京
- ap-shanghai：上海
- ap-hongkong：香港
- ap-taipei：台北
亚太区 参考值：
- ap-jakarta：雅加达
- ap-singapore：新加坡
北美区 参考值
- na-siliconvalley：硅谷
- na-ashburn: 弗吉尼亚
金融专区 参考值
- ap-beijing-fsi：北京金融
- ap-shanghai-fsi：上海金融
- ap-shenzhen-fsi：深圳金融
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * 引擎名称。参考值：
- eurek-test
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * 付费类型。参考值：
- 0：后付费
- 1：预付费（接口暂不支持创建预付费实例）
    */
    @SerializedName("TradeType")
    @Expose
    private Long TradeType;

    /**
    * 引擎的节点规格 ID。参见EngineProductVersion字段说明
    */
    @SerializedName("EngineResourceSpec")
    @Expose
    private String EngineResourceSpec;

    /**
    * 引擎的节点数量。参见EngineProductVersion字段说明
    */
    @SerializedName("EngineNodeNum")
    @Expose
    private Long EngineNodeNum;

    /**
    * VPC ID。在 VPC 的子网内分配一个 IP 作为引擎的访问地址。参考值：
- vpc-conz6aix
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网 ID。在 VPC 的子网内分配一个 IP 作为引擎的访问地址。参考值：
- subnet-ahde9me9
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Apollo 环境配置参数列表。参数说明：
如果创建Apollo类型，此参数为必填的环境信息列表，最多可选4个环境。环境信息参数说明：
- Name：环境名。参考值：prod, dev, fat, uat
- EngineResourceSpec：环境内引擎的节点规格ID。参见EngineProductVersion参数说明
- EngineNodeNum：环境内引擎的节点数量。参见EngineProductVersion参数说明，其中prod环境支持的节点数为2，3，4，5
- StorageCapacity：配置存储空间大小，以GB为单位，步长为5.参考值：35
- VpcId：VPC ID。参考值：vpc-conz6aix
- SubnetId：子网 ID。参考值：subnet-ahde9me9
    */
    @SerializedName("ApolloEnvParams")
    @Expose
    private ApolloEnvParam [] ApolloEnvParams;

    /**
    * 引擎的标签列表。用户自定义的key/value形式，无参考值
    */
    @SerializedName("EngineTags")
    @Expose
    private InstanceTagInfo [] EngineTags;

    /**
    * 引擎的初始账号信息。可设置参数：
- Name：控制台初始用户名
- Password：控制台初始密码
- Token：引擎接口的管理员 Token
    */
    @SerializedName("EngineAdmin")
    @Expose
    private EngineAdmin EngineAdmin;

    /**
    * 预付费时长，以月为单位
    */
    @SerializedName("PrepaidPeriod")
    @Expose
    private Long PrepaidPeriod;

    /**
    * 自动续费标记，仅预付费使用。参考值：
- 0：不自动续费
- 1：自动续费
    */
    @SerializedName("PrepaidRenewFlag")
    @Expose
    private Long PrepaidRenewFlag;

    /**
    * 跨地域部署的引擎地域配置详情
zk标准版没有跨地域部署，请不要填写
zk专业版跨地域部署开启了固定Leader所在地域，需要满足以下条件
- 固定Leader所在地域当前仅支持跨两个地域
- leader地域的副本数必须是3/2 + 1，5/2+1，7/2+1，也就是 2，3，4
    */
    @SerializedName("EngineRegionInfos")
    @Expose
    private EngineRegionInfo [] EngineRegionInfos;

    /**
    * zk标准版请填CLOUD_PREMIUM，zk标准版无法选择磁盘类型和磁盘容量，默认为CLOUD_PREMIUM
zk专业版可以为：CLOUD_SSD,CLOUD_SSD_PLUS,CLOUD_PREMIUM
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * zk标准版请填50，zk标准版无法选择磁盘类型和磁盘容量，磁盘容量默认为50
    */
    @SerializedName("StorageCapacity")
    @Expose
    private Long StorageCapacity;

    /**
    * zk专业版至多有两个盘，且磁盘的容量在50-3200之间
如果只有一个磁盘，storageCapacity与storageOption里面的capacity应该一致
    */
    @SerializedName("StorageOption")
    @Expose
    private StorageOption [] StorageOption;

    /**
    * ZK引擎实例，可用区分布约束，STRICT:强约束，PERMISSIVE: 弱约束
    */
    @SerializedName("AffinityConstraint")
    @Expose
    private String AffinityConstraint;

    /**
    * 指定zone id列表
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * 地域特殊标签，用于区分相同地域，不通的业务属性
    */
    @SerializedName("EngineRegionTag")
    @Expose
    private String EngineRegionTag;

    /**
     * Get 引擎类型。参考值：
- zookeeper
- nacos
- consul
- apollo
- eureka
- polaris 
     * @return EngineType 引擎类型。参考值：
- zookeeper
- nacos
- consul
- apollo
- eureka
- polaris
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 引擎类型。参考值：
- zookeeper
- nacos
- consul
- apollo
- eureka
- polaris
     * @param EngineType 引擎类型。参考值：
- zookeeper
- nacos
- consul
- apollo
- eureka
- polaris
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 引擎的开源版本。每种引擎支持的开源版本不同，请参考产品文档或者控制台购买页 
     * @return EngineVersion 引擎的开源版本。每种引擎支持的开源版本不同，请参考产品文档或者控制台购买页
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 引擎的开源版本。每种引擎支持的开源版本不同，请参考产品文档或者控制台购买页
     * @param EngineVersion 引擎的开源版本。每种引擎支持的开源版本不同，请参考产品文档或者控制台购买页
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 引擎的产品版本。参考值：
- STANDARD： 标准版
- PROFESSIONAL: 专业版（Zookeeper）/企业版（PolarisMesh）

引擎各版本及可选择的规格、节点数说明：
apollo - STANDARD版本
规格列表：1C2G、2C4G、4C8G、8C16G、16C32G
节点数：1，2，3，4，5

eureka - STANDARD版本
规格列表：1C2G、2C4G、4C8G、8C16G、16C32G
节点数：3，4，5

polarismesh - STANDARD版本
规格列表：NUM50、NUM100、NUM200、NUM500、NUM1000、NUM5000、NUM10000、NUM50000

兼容原spec-xxxxxx形式的规格ID 
     * @return EngineProductVersion 引擎的产品版本。参考值：
- STANDARD： 标准版
- PROFESSIONAL: 专业版（Zookeeper）/企业版（PolarisMesh）

引擎各版本及可选择的规格、节点数说明：
apollo - STANDARD版本
规格列表：1C2G、2C4G、4C8G、8C16G、16C32G
节点数：1，2，3，4，5

eureka - STANDARD版本
规格列表：1C2G、2C4G、4C8G、8C16G、16C32G
节点数：3，4，5

polarismesh - STANDARD版本
规格列表：NUM50、NUM100、NUM200、NUM500、NUM1000、NUM5000、NUM10000、NUM50000

兼容原spec-xxxxxx形式的规格ID
     */
    public String getEngineProductVersion() {
        return this.EngineProductVersion;
    }

    /**
     * Set 引擎的产品版本。参考值：
- STANDARD： 标准版
- PROFESSIONAL: 专业版（Zookeeper）/企业版（PolarisMesh）

引擎各版本及可选择的规格、节点数说明：
apollo - STANDARD版本
规格列表：1C2G、2C4G、4C8G、8C16G、16C32G
节点数：1，2，3，4，5

eureka - STANDARD版本
规格列表：1C2G、2C4G、4C8G、8C16G、16C32G
节点数：3，4，5

polarismesh - STANDARD版本
规格列表：NUM50、NUM100、NUM200、NUM500、NUM1000、NUM5000、NUM10000、NUM50000

兼容原spec-xxxxxx形式的规格ID
     * @param EngineProductVersion 引擎的产品版本。参考值：
- STANDARD： 标准版
- PROFESSIONAL: 专业版（Zookeeper）/企业版（PolarisMesh）

引擎各版本及可选择的规格、节点数说明：
apollo - STANDARD版本
规格列表：1C2G、2C4G、4C8G、8C16G、16C32G
节点数：1，2，3，4，5

eureka - STANDARD版本
规格列表：1C2G、2C4G、4C8G、8C16G、16C32G
节点数：3，4，5

polarismesh - STANDARD版本
规格列表：NUM50、NUM100、NUM200、NUM500、NUM1000、NUM5000、NUM10000、NUM50000

兼容原spec-xxxxxx形式的规格ID
     */
    public void setEngineProductVersion(String EngineProductVersion) {
        this.EngineProductVersion = EngineProductVersion;
    }

    /**
     * Get 引擎所在地域。参考值说明：
中国区 参考值：
- ap-guangzhou：广州
- ap-beijing：北京
- ap-chengdu：成都
- ap-chongqing：重庆
- ap-nanjing：南京
- ap-shanghai：上海
- ap-hongkong：香港
- ap-taipei：台北
亚太区 参考值：
- ap-jakarta：雅加达
- ap-singapore：新加坡
北美区 参考值
- na-siliconvalley：硅谷
- na-ashburn: 弗吉尼亚
金融专区 参考值
- ap-beijing-fsi：北京金融
- ap-shanghai-fsi：上海金融
- ap-shenzhen-fsi：深圳金融 
     * @return EngineRegion 引擎所在地域。参考值说明：
中国区 参考值：
- ap-guangzhou：广州
- ap-beijing：北京
- ap-chengdu：成都
- ap-chongqing：重庆
- ap-nanjing：南京
- ap-shanghai：上海
- ap-hongkong：香港
- ap-taipei：台北
亚太区 参考值：
- ap-jakarta：雅加达
- ap-singapore：新加坡
北美区 参考值
- na-siliconvalley：硅谷
- na-ashburn: 弗吉尼亚
金融专区 参考值
- ap-beijing-fsi：北京金融
- ap-shanghai-fsi：上海金融
- ap-shenzhen-fsi：深圳金融
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set 引擎所在地域。参考值说明：
中国区 参考值：
- ap-guangzhou：广州
- ap-beijing：北京
- ap-chengdu：成都
- ap-chongqing：重庆
- ap-nanjing：南京
- ap-shanghai：上海
- ap-hongkong：香港
- ap-taipei：台北
亚太区 参考值：
- ap-jakarta：雅加达
- ap-singapore：新加坡
北美区 参考值
- na-siliconvalley：硅谷
- na-ashburn: 弗吉尼亚
金融专区 参考值
- ap-beijing-fsi：北京金融
- ap-shanghai-fsi：上海金融
- ap-shenzhen-fsi：深圳金融
     * @param EngineRegion 引擎所在地域。参考值说明：
中国区 参考值：
- ap-guangzhou：广州
- ap-beijing：北京
- ap-chengdu：成都
- ap-chongqing：重庆
- ap-nanjing：南京
- ap-shanghai：上海
- ap-hongkong：香港
- ap-taipei：台北
亚太区 参考值：
- ap-jakarta：雅加达
- ap-singapore：新加坡
北美区 参考值
- na-siliconvalley：硅谷
- na-ashburn: 弗吉尼亚
金融专区 参考值
- ap-beijing-fsi：北京金融
- ap-shanghai-fsi：上海金融
- ap-shenzhen-fsi：深圳金融
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get 引擎名称。参考值：
- eurek-test 
     * @return EngineName 引擎名称。参考值：
- eurek-test
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set 引擎名称。参考值：
- eurek-test
     * @param EngineName 引擎名称。参考值：
- eurek-test
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get 付费类型。参考值：
- 0：后付费
- 1：预付费（接口暂不支持创建预付费实例） 
     * @return TradeType 付费类型。参考值：
- 0：后付费
- 1：预付费（接口暂不支持创建预付费实例）
     */
    public Long getTradeType() {
        return this.TradeType;
    }

    /**
     * Set 付费类型。参考值：
- 0：后付费
- 1：预付费（接口暂不支持创建预付费实例）
     * @param TradeType 付费类型。参考值：
- 0：后付费
- 1：预付费（接口暂不支持创建预付费实例）
     */
    public void setTradeType(Long TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get 引擎的节点规格 ID。参见EngineProductVersion字段说明 
     * @return EngineResourceSpec 引擎的节点规格 ID。参见EngineProductVersion字段说明
     */
    public String getEngineResourceSpec() {
        return this.EngineResourceSpec;
    }

    /**
     * Set 引擎的节点规格 ID。参见EngineProductVersion字段说明
     * @param EngineResourceSpec 引擎的节点规格 ID。参见EngineProductVersion字段说明
     */
    public void setEngineResourceSpec(String EngineResourceSpec) {
        this.EngineResourceSpec = EngineResourceSpec;
    }

    /**
     * Get 引擎的节点数量。参见EngineProductVersion字段说明 
     * @return EngineNodeNum 引擎的节点数量。参见EngineProductVersion字段说明
     */
    public Long getEngineNodeNum() {
        return this.EngineNodeNum;
    }

    /**
     * Set 引擎的节点数量。参见EngineProductVersion字段说明
     * @param EngineNodeNum 引擎的节点数量。参见EngineProductVersion字段说明
     */
    public void setEngineNodeNum(Long EngineNodeNum) {
        this.EngineNodeNum = EngineNodeNum;
    }

    /**
     * Get VPC ID。在 VPC 的子网内分配一个 IP 作为引擎的访问地址。参考值：
- vpc-conz6aix 
     * @return VpcId VPC ID。在 VPC 的子网内分配一个 IP 作为引擎的访问地址。参考值：
- vpc-conz6aix
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID。在 VPC 的子网内分配一个 IP 作为引擎的访问地址。参考值：
- vpc-conz6aix
     * @param VpcId VPC ID。在 VPC 的子网内分配一个 IP 作为引擎的访问地址。参考值：
- vpc-conz6aix
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网 ID。在 VPC 的子网内分配一个 IP 作为引擎的访问地址。参考值：
- subnet-ahde9me9 
     * @return SubnetId 子网 ID。在 VPC 的子网内分配一个 IP 作为引擎的访问地址。参考值：
- subnet-ahde9me9
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网 ID。在 VPC 的子网内分配一个 IP 作为引擎的访问地址。参考值：
- subnet-ahde9me9
     * @param SubnetId 子网 ID。在 VPC 的子网内分配一个 IP 作为引擎的访问地址。参考值：
- subnet-ahde9me9
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Apollo 环境配置参数列表。参数说明：
如果创建Apollo类型，此参数为必填的环境信息列表，最多可选4个环境。环境信息参数说明：
- Name：环境名。参考值：prod, dev, fat, uat
- EngineResourceSpec：环境内引擎的节点规格ID。参见EngineProductVersion参数说明
- EngineNodeNum：环境内引擎的节点数量。参见EngineProductVersion参数说明，其中prod环境支持的节点数为2，3，4，5
- StorageCapacity：配置存储空间大小，以GB为单位，步长为5.参考值：35
- VpcId：VPC ID。参考值：vpc-conz6aix
- SubnetId：子网 ID。参考值：subnet-ahde9me9 
     * @return ApolloEnvParams Apollo 环境配置参数列表。参数说明：
如果创建Apollo类型，此参数为必填的环境信息列表，最多可选4个环境。环境信息参数说明：
- Name：环境名。参考值：prod, dev, fat, uat
- EngineResourceSpec：环境内引擎的节点规格ID。参见EngineProductVersion参数说明
- EngineNodeNum：环境内引擎的节点数量。参见EngineProductVersion参数说明，其中prod环境支持的节点数为2，3，4，5
- StorageCapacity：配置存储空间大小，以GB为单位，步长为5.参考值：35
- VpcId：VPC ID。参考值：vpc-conz6aix
- SubnetId：子网 ID。参考值：subnet-ahde9me9
     */
    public ApolloEnvParam [] getApolloEnvParams() {
        return this.ApolloEnvParams;
    }

    /**
     * Set Apollo 环境配置参数列表。参数说明：
如果创建Apollo类型，此参数为必填的环境信息列表，最多可选4个环境。环境信息参数说明：
- Name：环境名。参考值：prod, dev, fat, uat
- EngineResourceSpec：环境内引擎的节点规格ID。参见EngineProductVersion参数说明
- EngineNodeNum：环境内引擎的节点数量。参见EngineProductVersion参数说明，其中prod环境支持的节点数为2，3，4，5
- StorageCapacity：配置存储空间大小，以GB为单位，步长为5.参考值：35
- VpcId：VPC ID。参考值：vpc-conz6aix
- SubnetId：子网 ID。参考值：subnet-ahde9me9
     * @param ApolloEnvParams Apollo 环境配置参数列表。参数说明：
如果创建Apollo类型，此参数为必填的环境信息列表，最多可选4个环境。环境信息参数说明：
- Name：环境名。参考值：prod, dev, fat, uat
- EngineResourceSpec：环境内引擎的节点规格ID。参见EngineProductVersion参数说明
- EngineNodeNum：环境内引擎的节点数量。参见EngineProductVersion参数说明，其中prod环境支持的节点数为2，3，4，5
- StorageCapacity：配置存储空间大小，以GB为单位，步长为5.参考值：35
- VpcId：VPC ID。参考值：vpc-conz6aix
- SubnetId：子网 ID。参考值：subnet-ahde9me9
     */
    public void setApolloEnvParams(ApolloEnvParam [] ApolloEnvParams) {
        this.ApolloEnvParams = ApolloEnvParams;
    }

    /**
     * Get 引擎的标签列表。用户自定义的key/value形式，无参考值 
     * @return EngineTags 引擎的标签列表。用户自定义的key/value形式，无参考值
     */
    public InstanceTagInfo [] getEngineTags() {
        return this.EngineTags;
    }

    /**
     * Set 引擎的标签列表。用户自定义的key/value形式，无参考值
     * @param EngineTags 引擎的标签列表。用户自定义的key/value形式，无参考值
     */
    public void setEngineTags(InstanceTagInfo [] EngineTags) {
        this.EngineTags = EngineTags;
    }

    /**
     * Get 引擎的初始账号信息。可设置参数：
- Name：控制台初始用户名
- Password：控制台初始密码
- Token：引擎接口的管理员 Token 
     * @return EngineAdmin 引擎的初始账号信息。可设置参数：
- Name：控制台初始用户名
- Password：控制台初始密码
- Token：引擎接口的管理员 Token
     */
    public EngineAdmin getEngineAdmin() {
        return this.EngineAdmin;
    }

    /**
     * Set 引擎的初始账号信息。可设置参数：
- Name：控制台初始用户名
- Password：控制台初始密码
- Token：引擎接口的管理员 Token
     * @param EngineAdmin 引擎的初始账号信息。可设置参数：
- Name：控制台初始用户名
- Password：控制台初始密码
- Token：引擎接口的管理员 Token
     */
    public void setEngineAdmin(EngineAdmin EngineAdmin) {
        this.EngineAdmin = EngineAdmin;
    }

    /**
     * Get 预付费时长，以月为单位 
     * @return PrepaidPeriod 预付费时长，以月为单位
     */
    public Long getPrepaidPeriod() {
        return this.PrepaidPeriod;
    }

    /**
     * Set 预付费时长，以月为单位
     * @param PrepaidPeriod 预付费时长，以月为单位
     */
    public void setPrepaidPeriod(Long PrepaidPeriod) {
        this.PrepaidPeriod = PrepaidPeriod;
    }

    /**
     * Get 自动续费标记，仅预付费使用。参考值：
- 0：不自动续费
- 1：自动续费 
     * @return PrepaidRenewFlag 自动续费标记，仅预付费使用。参考值：
- 0：不自动续费
- 1：自动续费
     */
    public Long getPrepaidRenewFlag() {
        return this.PrepaidRenewFlag;
    }

    /**
     * Set 自动续费标记，仅预付费使用。参考值：
- 0：不自动续费
- 1：自动续费
     * @param PrepaidRenewFlag 自动续费标记，仅预付费使用。参考值：
- 0：不自动续费
- 1：自动续费
     */
    public void setPrepaidRenewFlag(Long PrepaidRenewFlag) {
        this.PrepaidRenewFlag = PrepaidRenewFlag;
    }

    /**
     * Get 跨地域部署的引擎地域配置详情
zk标准版没有跨地域部署，请不要填写
zk专业版跨地域部署开启了固定Leader所在地域，需要满足以下条件
- 固定Leader所在地域当前仅支持跨两个地域
- leader地域的副本数必须是3/2 + 1，5/2+1，7/2+1，也就是 2，3，4 
     * @return EngineRegionInfos 跨地域部署的引擎地域配置详情
zk标准版没有跨地域部署，请不要填写
zk专业版跨地域部署开启了固定Leader所在地域，需要满足以下条件
- 固定Leader所在地域当前仅支持跨两个地域
- leader地域的副本数必须是3/2 + 1，5/2+1，7/2+1，也就是 2，3，4
     */
    public EngineRegionInfo [] getEngineRegionInfos() {
        return this.EngineRegionInfos;
    }

    /**
     * Set 跨地域部署的引擎地域配置详情
zk标准版没有跨地域部署，请不要填写
zk专业版跨地域部署开启了固定Leader所在地域，需要满足以下条件
- 固定Leader所在地域当前仅支持跨两个地域
- leader地域的副本数必须是3/2 + 1，5/2+1，7/2+1，也就是 2，3，4
     * @param EngineRegionInfos 跨地域部署的引擎地域配置详情
zk标准版没有跨地域部署，请不要填写
zk专业版跨地域部署开启了固定Leader所在地域，需要满足以下条件
- 固定Leader所在地域当前仅支持跨两个地域
- leader地域的副本数必须是3/2 + 1，5/2+1，7/2+1，也就是 2，3，4
     */
    public void setEngineRegionInfos(EngineRegionInfo [] EngineRegionInfos) {
        this.EngineRegionInfos = EngineRegionInfos;
    }

    /**
     * Get zk标准版请填CLOUD_PREMIUM，zk标准版无法选择磁盘类型和磁盘容量，默认为CLOUD_PREMIUM
zk专业版可以为：CLOUD_SSD,CLOUD_SSD_PLUS,CLOUD_PREMIUM 
     * @return StorageType zk标准版请填CLOUD_PREMIUM，zk标准版无法选择磁盘类型和磁盘容量，默认为CLOUD_PREMIUM
zk专业版可以为：CLOUD_SSD,CLOUD_SSD_PLUS,CLOUD_PREMIUM
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set zk标准版请填CLOUD_PREMIUM，zk标准版无法选择磁盘类型和磁盘容量，默认为CLOUD_PREMIUM
zk专业版可以为：CLOUD_SSD,CLOUD_SSD_PLUS,CLOUD_PREMIUM
     * @param StorageType zk标准版请填CLOUD_PREMIUM，zk标准版无法选择磁盘类型和磁盘容量，默认为CLOUD_PREMIUM
zk专业版可以为：CLOUD_SSD,CLOUD_SSD_PLUS,CLOUD_PREMIUM
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get zk标准版请填50，zk标准版无法选择磁盘类型和磁盘容量，磁盘容量默认为50 
     * @return StorageCapacity zk标准版请填50，zk标准版无法选择磁盘类型和磁盘容量，磁盘容量默认为50
     */
    public Long getStorageCapacity() {
        return this.StorageCapacity;
    }

    /**
     * Set zk标准版请填50，zk标准版无法选择磁盘类型和磁盘容量，磁盘容量默认为50
     * @param StorageCapacity zk标准版请填50，zk标准版无法选择磁盘类型和磁盘容量，磁盘容量默认为50
     */
    public void setStorageCapacity(Long StorageCapacity) {
        this.StorageCapacity = StorageCapacity;
    }

    /**
     * Get zk专业版至多有两个盘，且磁盘的容量在50-3200之间
如果只有一个磁盘，storageCapacity与storageOption里面的capacity应该一致 
     * @return StorageOption zk专业版至多有两个盘，且磁盘的容量在50-3200之间
如果只有一个磁盘，storageCapacity与storageOption里面的capacity应该一致
     */
    public StorageOption [] getStorageOption() {
        return this.StorageOption;
    }

    /**
     * Set zk专业版至多有两个盘，且磁盘的容量在50-3200之间
如果只有一个磁盘，storageCapacity与storageOption里面的capacity应该一致
     * @param StorageOption zk专业版至多有两个盘，且磁盘的容量在50-3200之间
如果只有一个磁盘，storageCapacity与storageOption里面的capacity应该一致
     */
    public void setStorageOption(StorageOption [] StorageOption) {
        this.StorageOption = StorageOption;
    }

    /**
     * Get ZK引擎实例，可用区分布约束，STRICT:强约束，PERMISSIVE: 弱约束 
     * @return AffinityConstraint ZK引擎实例，可用区分布约束，STRICT:强约束，PERMISSIVE: 弱约束
     */
    public String getAffinityConstraint() {
        return this.AffinityConstraint;
    }

    /**
     * Set ZK引擎实例，可用区分布约束，STRICT:强约束，PERMISSIVE: 弱约束
     * @param AffinityConstraint ZK引擎实例，可用区分布约束，STRICT:强约束，PERMISSIVE: 弱约束
     */
    public void setAffinityConstraint(String AffinityConstraint) {
        this.AffinityConstraint = AffinityConstraint;
    }

    /**
     * Get 指定zone id列表 
     * @return ZoneIds 指定zone id列表
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 指定zone id列表
     * @param ZoneIds 指定zone id列表
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 地域特殊标签，用于区分相同地域，不通的业务属性 
     * @return EngineRegionTag 地域特殊标签，用于区分相同地域，不通的业务属性
     */
    public String getEngineRegionTag() {
        return this.EngineRegionTag;
    }

    /**
     * Set 地域特殊标签，用于区分相同地域，不通的业务属性
     * @param EngineRegionTag 地域特殊标签，用于区分相同地域，不通的业务属性
     */
    public void setEngineRegionTag(String EngineRegionTag) {
        this.EngineRegionTag = EngineRegionTag;
    }

    public CreateEngineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEngineRequest(CreateEngineRequest source) {
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.EngineProductVersion != null) {
            this.EngineProductVersion = new String(source.EngineProductVersion);
        }
        if (source.EngineRegion != null) {
            this.EngineRegion = new String(source.EngineRegion);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.TradeType != null) {
            this.TradeType = new Long(source.TradeType);
        }
        if (source.EngineResourceSpec != null) {
            this.EngineResourceSpec = new String(source.EngineResourceSpec);
        }
        if (source.EngineNodeNum != null) {
            this.EngineNodeNum = new Long(source.EngineNodeNum);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ApolloEnvParams != null) {
            this.ApolloEnvParams = new ApolloEnvParam[source.ApolloEnvParams.length];
            for (int i = 0; i < source.ApolloEnvParams.length; i++) {
                this.ApolloEnvParams[i] = new ApolloEnvParam(source.ApolloEnvParams[i]);
            }
        }
        if (source.EngineTags != null) {
            this.EngineTags = new InstanceTagInfo[source.EngineTags.length];
            for (int i = 0; i < source.EngineTags.length; i++) {
                this.EngineTags[i] = new InstanceTagInfo(source.EngineTags[i]);
            }
        }
        if (source.EngineAdmin != null) {
            this.EngineAdmin = new EngineAdmin(source.EngineAdmin);
        }
        if (source.PrepaidPeriod != null) {
            this.PrepaidPeriod = new Long(source.PrepaidPeriod);
        }
        if (source.PrepaidRenewFlag != null) {
            this.PrepaidRenewFlag = new Long(source.PrepaidRenewFlag);
        }
        if (source.EngineRegionInfos != null) {
            this.EngineRegionInfos = new EngineRegionInfo[source.EngineRegionInfos.length];
            for (int i = 0; i < source.EngineRegionInfos.length; i++) {
                this.EngineRegionInfos[i] = new EngineRegionInfo(source.EngineRegionInfos[i]);
            }
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.StorageCapacity != null) {
            this.StorageCapacity = new Long(source.StorageCapacity);
        }
        if (source.StorageOption != null) {
            this.StorageOption = new StorageOption[source.StorageOption.length];
            for (int i = 0; i < source.StorageOption.length; i++) {
                this.StorageOption[i] = new StorageOption(source.StorageOption[i]);
            }
        }
        if (source.AffinityConstraint != null) {
            this.AffinityConstraint = new String(source.AffinityConstraint);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.EngineRegionTag != null) {
            this.EngineRegionTag = new String(source.EngineRegionTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "EngineProductVersion", this.EngineProductVersion);
        this.setParamSimple(map, prefix + "EngineRegion", this.EngineRegion);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamSimple(map, prefix + "TradeType", this.TradeType);
        this.setParamSimple(map, prefix + "EngineResourceSpec", this.EngineResourceSpec);
        this.setParamSimple(map, prefix + "EngineNodeNum", this.EngineNodeNum);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "ApolloEnvParams.", this.ApolloEnvParams);
        this.setParamArrayObj(map, prefix + "EngineTags.", this.EngineTags);
        this.setParamObj(map, prefix + "EngineAdmin.", this.EngineAdmin);
        this.setParamSimple(map, prefix + "PrepaidPeriod", this.PrepaidPeriod);
        this.setParamSimple(map, prefix + "PrepaidRenewFlag", this.PrepaidRenewFlag);
        this.setParamArrayObj(map, prefix + "EngineRegionInfos.", this.EngineRegionInfos);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "StorageCapacity", this.StorageCapacity);
        this.setParamArrayObj(map, prefix + "StorageOption.", this.StorageOption);
        this.setParamSimple(map, prefix + "AffinityConstraint", this.AffinityConstraint);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "EngineRegionTag", this.EngineRegionTag);

    }
}

