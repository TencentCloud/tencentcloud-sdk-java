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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBEndpointInfo extends AbstractModel{

    /**
    * 实例所在地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例网络接入类型，如：extranet(外网)、ipv6(公网ipv6)、cvm(云主机自建)、dcg(专线接入)、vpncloud(vpn接入的实例)、cdb(云数据库)、ccn(云联网)、intranet(自研上云)、vpc(私有网络)等，注意具体可选值依赖当前链路
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * 实例数据库类型，如：mysql,redis,mongodb,postgresql,mariadb,percona 等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseType")
    @Expose
    private String DatabaseType;

    /**
    * 节点类型，为空或者"simple":表示普通节点，"cluster": 集群节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 数据库信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Info")
    @Expose
    private DBInfo [] Info;

    /**
    * 实例服务提供商，如:"aliyun","others"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Supplier")
    @Expose
    private String Supplier;

    /**
    * MongoDB可定义如下的参数: 	['AuthDatabase':'admin', 
'AuthFlag': "1",	'AuthMechanism':"SCRAM-SHA-1"]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraAttr")
    @Expose
    private KeyValuePairOption [] ExtraAttr;

    /**
    * 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseNetEnv")
    @Expose
    private String DatabaseNetEnv;

    /**
     * Get 实例所在地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 实例所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所在地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 实例所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例网络接入类型，如：extranet(外网)、ipv6(公网ipv6)、cvm(云主机自建)、dcg(专线接入)、vpncloud(vpn接入的实例)、cdb(云数据库)、ccn(云联网)、intranet(自研上云)、vpc(私有网络)等，注意具体可选值依赖当前链路
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessType 实例网络接入类型，如：extranet(外网)、ipv6(公网ipv6)、cvm(云主机自建)、dcg(专线接入)、vpncloud(vpn接入的实例)、cdb(云数据库)、ccn(云联网)、intranet(自研上云)、vpc(私有网络)等，注意具体可选值依赖当前链路
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 实例网络接入类型，如：extranet(外网)、ipv6(公网ipv6)、cvm(云主机自建)、dcg(专线接入)、vpncloud(vpn接入的实例)、cdb(云数据库)、ccn(云联网)、intranet(自研上云)、vpc(私有网络)等，注意具体可选值依赖当前链路
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessType 实例网络接入类型，如：extranet(外网)、ipv6(公网ipv6)、cvm(云主机自建)、dcg(专线接入)、vpncloud(vpn接入的实例)、cdb(云数据库)、ccn(云联网)、intranet(自研上云)、vpc(私有网络)等，注意具体可选值依赖当前链路
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 实例数据库类型，如：mysql,redis,mongodb,postgresql,mariadb,percona 等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseType 实例数据库类型，如：mysql,redis,mongodb,postgresql,mariadb,percona 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * Set 实例数据库类型，如：mysql,redis,mongodb,postgresql,mariadb,percona 等
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseType 实例数据库类型，如：mysql,redis,mongodb,postgresql,mariadb,percona 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseType(String DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * Get 节点类型，为空或者"simple":表示普通节点，"cluster": 集群节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeType 节点类型，为空或者"simple":表示普通节点，"cluster": 集群节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型，为空或者"simple":表示普通节点，"cluster": 集群节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeType 节点类型，为空或者"simple":表示普通节点，"cluster": 集群节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 数据库信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Info 数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DBInfo [] getInfo() {
        return this.Info;
    }

    /**
     * Set 数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Info 数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfo(DBInfo [] Info) {
        this.Info = Info;
    }

    /**
     * Get 实例服务提供商，如:"aliyun","others"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Supplier 实例服务提供商，如:"aliyun","others"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSupplier() {
        return this.Supplier;
    }

    /**
     * Set 实例服务提供商，如:"aliyun","others"
注意：此字段可能返回 null，表示取不到有效值。
     * @param Supplier 实例服务提供商，如:"aliyun","others"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    /**
     * Get MongoDB可定义如下的参数: 	['AuthDatabase':'admin', 
'AuthFlag': "1",	'AuthMechanism':"SCRAM-SHA-1"]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraAttr MongoDB可定义如下的参数: 	['AuthDatabase':'admin', 
'AuthFlag': "1",	'AuthMechanism':"SCRAM-SHA-1"]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValuePairOption [] getExtraAttr() {
        return this.ExtraAttr;
    }

    /**
     * Set MongoDB可定义如下的参数: 	['AuthDatabase':'admin', 
'AuthFlag': "1",	'AuthMechanism':"SCRAM-SHA-1"]
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraAttr MongoDB可定义如下的参数: 	['AuthDatabase':'admin', 
'AuthFlag': "1",	'AuthMechanism':"SCRAM-SHA-1"]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraAttr(KeyValuePairOption [] ExtraAttr) {
        this.ExtraAttr = ExtraAttr;
    }

    /**
     * Get 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseNetEnv 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseNetEnv() {
        return this.DatabaseNetEnv;
    }

    /**
     * Set 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseNetEnv 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseNetEnv(String DatabaseNetEnv) {
        this.DatabaseNetEnv = DatabaseNetEnv;
    }

    public DBEndpointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBEndpointInfo(DBEndpointInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.DatabaseType != null) {
            this.DatabaseType = new String(source.DatabaseType);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Info != null) {
            this.Info = new DBInfo[source.Info.length];
            for (int i = 0; i < source.Info.length; i++) {
                this.Info[i] = new DBInfo(source.Info[i]);
            }
        }
        if (source.Supplier != null) {
            this.Supplier = new String(source.Supplier);
        }
        if (source.ExtraAttr != null) {
            this.ExtraAttr = new KeyValuePairOption[source.ExtraAttr.length];
            for (int i = 0; i < source.ExtraAttr.length; i++) {
                this.ExtraAttr[i] = new KeyValuePairOption(source.ExtraAttr[i]);
            }
        }
        if (source.DatabaseNetEnv != null) {
            this.DatabaseNetEnv = new String(source.DatabaseNetEnv);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "DatabaseType", this.DatabaseType);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArrayObj(map, prefix + "Info.", this.Info);
        this.setParamSimple(map, prefix + "Supplier", this.Supplier);
        this.setParamArrayObj(map, prefix + "ExtraAttr.", this.ExtraAttr);
        this.setParamSimple(map, prefix + "DatabaseNetEnv", this.DatabaseNetEnv);

    }
}

