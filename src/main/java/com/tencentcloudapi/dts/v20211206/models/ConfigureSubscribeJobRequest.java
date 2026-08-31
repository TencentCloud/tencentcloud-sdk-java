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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigureSubscribeJobRequest extends AbstractModel {

    /**
    * <p>数据订阅实例的 ID，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * <p>数据订阅的类型，当 DatabaseType 不为 mongodb 时，枚举值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 DatabaseType 为 mongodb 时，枚举值为 all-全实例更新；database-订阅单库；collection-订阅单集合</p>
    */
    @SerializedName("SubscribeMode")
    @Expose
    private String SubscribeMode;

    /**
    * <p>源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力</p>
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * <p>数据库节点信息</p>
    */
    @SerializedName("Endpoints")
    @Expose
    private EndpointItem [] Endpoints;

    /**
    * <p>Kafka配置</p>
    */
    @SerializedName("KafkaConfig")
    @Expose
    private SubscribeKafkaConfig KafkaConfig;

    /**
    * <p>订阅的数据库表信息，当 SubscribeMode 不为 all和ddl 时，SubscribeObjects 为必选参数</p>
    */
    @SerializedName("SubscribeObjects")
    @Expose
    private SubscribeObject [] SubscribeObjects;

    /**
    * <p>订阅数据格式，如：protobuf、json、avro。注意具体可选值依赖当前链路支持能力，数据格式详情参考官网的消费demo文档</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>mongo选填参数：输出聚合设置。</p>
    */
    @SerializedName("PipelineInfo")
    @Expose
    private PipelineInfo [] PipelineInfo;

    /**
    * <p>为业务添加的额外信息。参数名作key，参数值作value。<br>mysql选填参数：ProcessXA-是否处理XA事务，填true处理，不填或填其他值不处理。<br>mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream，不填也是默认changeStream。<br>其他业务暂没有可选参数。</p>
    */
    @SerializedName("ExtraAttr")
    @Expose
    private KeyValuePairOption [] ExtraAttr;

    /**
    * <p>vpc id</p>
    */
    @SerializedName("ConsumerVpcId")
    @Expose
    private String ConsumerVpcId;

    /**
    * <p>subnet id</p>
    */
    @SerializedName("ConsumerSubnetId")
    @Expose
    private String ConsumerSubnetId;

    /**
     * Get <p>数据订阅实例的 ID，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p> 
     * @return SubscribeId <p>数据订阅实例的 ID，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set <p>数据订阅实例的 ID，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     * @param SubscribeId <p>数据订阅实例的 ID，可通过<a href="https://cloud.tencent.com/document/product/571/82103">DescribeSyncJobs</a>接口获取。</p>
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get <p>数据订阅的类型，当 DatabaseType 不为 mongodb 时，枚举值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 DatabaseType 为 mongodb 时，枚举值为 all-全实例更新；database-订阅单库；collection-订阅单集合</p> 
     * @return SubscribeMode <p>数据订阅的类型，当 DatabaseType 不为 mongodb 时，枚举值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 DatabaseType 为 mongodb 时，枚举值为 all-全实例更新；database-订阅单库；collection-订阅单集合</p>
     */
    public String getSubscribeMode() {
        return this.SubscribeMode;
    }

    /**
     * Set <p>数据订阅的类型，当 DatabaseType 不为 mongodb 时，枚举值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 DatabaseType 为 mongodb 时，枚举值为 all-全实例更新；database-订阅单库；collection-订阅单集合</p>
     * @param SubscribeMode <p>数据订阅的类型，当 DatabaseType 不为 mongodb 时，枚举值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 DatabaseType 为 mongodb 时，枚举值为 all-全实例更新；database-订阅单库；collection-订阅单集合</p>
     */
    public void setSubscribeMode(String SubscribeMode) {
        this.SubscribeMode = SubscribeMode;
    }

    /**
     * Get <p>源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力</p> 
     * @return AccessType <p>源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力</p>
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力</p>
     * @param AccessType <p>源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力</p>
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>数据库节点信息</p> 
     * @return Endpoints <p>数据库节点信息</p>
     */
    public EndpointItem [] getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set <p>数据库节点信息</p>
     * @param Endpoints <p>数据库节点信息</p>
     */
    public void setEndpoints(EndpointItem [] Endpoints) {
        this.Endpoints = Endpoints;
    }

    /**
     * Get <p>Kafka配置</p> 
     * @return KafkaConfig <p>Kafka配置</p>
     */
    public SubscribeKafkaConfig getKafkaConfig() {
        return this.KafkaConfig;
    }

    /**
     * Set <p>Kafka配置</p>
     * @param KafkaConfig <p>Kafka配置</p>
     */
    public void setKafkaConfig(SubscribeKafkaConfig KafkaConfig) {
        this.KafkaConfig = KafkaConfig;
    }

    /**
     * Get <p>订阅的数据库表信息，当 SubscribeMode 不为 all和ddl 时，SubscribeObjects 为必选参数</p> 
     * @return SubscribeObjects <p>订阅的数据库表信息，当 SubscribeMode 不为 all和ddl 时，SubscribeObjects 为必选参数</p>
     */
    public SubscribeObject [] getSubscribeObjects() {
        return this.SubscribeObjects;
    }

    /**
     * Set <p>订阅的数据库表信息，当 SubscribeMode 不为 all和ddl 时，SubscribeObjects 为必选参数</p>
     * @param SubscribeObjects <p>订阅的数据库表信息，当 SubscribeMode 不为 all和ddl 时，SubscribeObjects 为必选参数</p>
     */
    public void setSubscribeObjects(SubscribeObject [] SubscribeObjects) {
        this.SubscribeObjects = SubscribeObjects;
    }

    /**
     * Get <p>订阅数据格式，如：protobuf、json、avro。注意具体可选值依赖当前链路支持能力，数据格式详情参考官网的消费demo文档</p> 
     * @return Protocol <p>订阅数据格式，如：protobuf、json、avro。注意具体可选值依赖当前链路支持能力，数据格式详情参考官网的消费demo文档</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>订阅数据格式，如：protobuf、json、avro。注意具体可选值依赖当前链路支持能力，数据格式详情参考官网的消费demo文档</p>
     * @param Protocol <p>订阅数据格式，如：protobuf、json、avro。注意具体可选值依赖当前链路支持能力，数据格式详情参考官网的消费demo文档</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>mongo选填参数：输出聚合设置。</p> 
     * @return PipelineInfo <p>mongo选填参数：输出聚合设置。</p>
     */
    public PipelineInfo [] getPipelineInfo() {
        return this.PipelineInfo;
    }

    /**
     * Set <p>mongo选填参数：输出聚合设置。</p>
     * @param PipelineInfo <p>mongo选填参数：输出聚合设置。</p>
     */
    public void setPipelineInfo(PipelineInfo [] PipelineInfo) {
        this.PipelineInfo = PipelineInfo;
    }

    /**
     * Get <p>为业务添加的额外信息。参数名作key，参数值作value。<br>mysql选填参数：ProcessXA-是否处理XA事务，填true处理，不填或填其他值不处理。<br>mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream，不填也是默认changeStream。<br>其他业务暂没有可选参数。</p> 
     * @return ExtraAttr <p>为业务添加的额外信息。参数名作key，参数值作value。<br>mysql选填参数：ProcessXA-是否处理XA事务，填true处理，不填或填其他值不处理。<br>mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream，不填也是默认changeStream。<br>其他业务暂没有可选参数。</p>
     */
    public KeyValuePairOption [] getExtraAttr() {
        return this.ExtraAttr;
    }

    /**
     * Set <p>为业务添加的额外信息。参数名作key，参数值作value。<br>mysql选填参数：ProcessXA-是否处理XA事务，填true处理，不填或填其他值不处理。<br>mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream，不填也是默认changeStream。<br>其他业务暂没有可选参数。</p>
     * @param ExtraAttr <p>为业务添加的额外信息。参数名作key，参数值作value。<br>mysql选填参数：ProcessXA-是否处理XA事务，填true处理，不填或填其他值不处理。<br>mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream，不填也是默认changeStream。<br>其他业务暂没有可选参数。</p>
     */
    public void setExtraAttr(KeyValuePairOption [] ExtraAttr) {
        this.ExtraAttr = ExtraAttr;
    }

    /**
     * Get <p>vpc id</p> 
     * @return ConsumerVpcId <p>vpc id</p>
     */
    public String getConsumerVpcId() {
        return this.ConsumerVpcId;
    }

    /**
     * Set <p>vpc id</p>
     * @param ConsumerVpcId <p>vpc id</p>
     */
    public void setConsumerVpcId(String ConsumerVpcId) {
        this.ConsumerVpcId = ConsumerVpcId;
    }

    /**
     * Get <p>subnet id</p> 
     * @return ConsumerSubnetId <p>subnet id</p>
     */
    public String getConsumerSubnetId() {
        return this.ConsumerSubnetId;
    }

    /**
     * Set <p>subnet id</p>
     * @param ConsumerSubnetId <p>subnet id</p>
     */
    public void setConsumerSubnetId(String ConsumerSubnetId) {
        this.ConsumerSubnetId = ConsumerSubnetId;
    }

    public ConfigureSubscribeJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigureSubscribeJobRequest(ConfigureSubscribeJobRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.SubscribeMode != null) {
            this.SubscribeMode = new String(source.SubscribeMode);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.Endpoints != null) {
            this.Endpoints = new EndpointItem[source.Endpoints.length];
            for (int i = 0; i < source.Endpoints.length; i++) {
                this.Endpoints[i] = new EndpointItem(source.Endpoints[i]);
            }
        }
        if (source.KafkaConfig != null) {
            this.KafkaConfig = new SubscribeKafkaConfig(source.KafkaConfig);
        }
        if (source.SubscribeObjects != null) {
            this.SubscribeObjects = new SubscribeObject[source.SubscribeObjects.length];
            for (int i = 0; i < source.SubscribeObjects.length; i++) {
                this.SubscribeObjects[i] = new SubscribeObject(source.SubscribeObjects[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.PipelineInfo != null) {
            this.PipelineInfo = new PipelineInfo[source.PipelineInfo.length];
            for (int i = 0; i < source.PipelineInfo.length; i++) {
                this.PipelineInfo[i] = new PipelineInfo(source.PipelineInfo[i]);
            }
        }
        if (source.ExtraAttr != null) {
            this.ExtraAttr = new KeyValuePairOption[source.ExtraAttr.length];
            for (int i = 0; i < source.ExtraAttr.length; i++) {
                this.ExtraAttr[i] = new KeyValuePairOption(source.ExtraAttr[i]);
            }
        }
        if (source.ConsumerVpcId != null) {
            this.ConsumerVpcId = new String(source.ConsumerVpcId);
        }
        if (source.ConsumerSubnetId != null) {
            this.ConsumerSubnetId = new String(source.ConsumerSubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "SubscribeMode", this.SubscribeMode);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArrayObj(map, prefix + "Endpoints.", this.Endpoints);
        this.setParamObj(map, prefix + "KafkaConfig.", this.KafkaConfig);
        this.setParamArrayObj(map, prefix + "SubscribeObjects.", this.SubscribeObjects);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "PipelineInfo.", this.PipelineInfo);
        this.setParamArrayObj(map, prefix + "ExtraAttr.", this.ExtraAttr);
        this.setParamSimple(map, prefix + "ConsumerVpcId", this.ConsumerVpcId);
        this.setParamSimple(map, prefix + "ConsumerSubnetId", this.ConsumerSubnetId);

    }
}

