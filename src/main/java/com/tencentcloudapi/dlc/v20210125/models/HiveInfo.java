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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HiveInfo extends AbstractModel {

    /**
    * hive metastore的地址
    */
    @SerializedName("MetaStoreUrl")
    @Expose
    private String MetaStoreUrl;

    /**
    * hive数据源类型，代表数据储存的位置，COS或者HDFS
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据源所在的私有网络信息
    */
    @SerializedName("Location")
    @Expose
    private DatasourceConnectionLocation Location;

    /**
    * 如果类型为HDFS，需要传一个用户名
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 如果类型为HDFS，需要选择是否高可用
    */
    @SerializedName("HighAvailability")
    @Expose
    private Boolean HighAvailability;

    /**
    * 如果类型为COS，需要填写COS桶连接
    */
    @SerializedName("BucketUrl")
    @Expose
    private String BucketUrl;

    /**
    * json字符串。如果类型为HDFS，需要填写该字段
    */
    @SerializedName("HdfsProperties")
    @Expose
    private String HdfsProperties;

    /**
    * Hive的元数据库信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mysql")
    @Expose
    private MysqlInfo Mysql;

    /**
    * emr集群Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * emr集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * EMR集群中hive组件的版本号
    */
    @SerializedName("HiveVersion")
    @Expose
    private String HiveVersion;

    /**
    * Kerberos详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KerberosInfo")
    @Expose
    private KerberosInfo KerberosInfo;

    /**
    * 是否开启Kerberos
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KerberosEnable")
    @Expose
    private Boolean KerberosEnable;

    /**
     * Get hive metastore的地址 
     * @return MetaStoreUrl hive metastore的地址
     */
    public String getMetaStoreUrl() {
        return this.MetaStoreUrl;
    }

    /**
     * Set hive metastore的地址
     * @param MetaStoreUrl hive metastore的地址
     */
    public void setMetaStoreUrl(String MetaStoreUrl) {
        this.MetaStoreUrl = MetaStoreUrl;
    }

    /**
     * Get hive数据源类型，代表数据储存的位置，COS或者HDFS 
     * @return Type hive数据源类型，代表数据储存的位置，COS或者HDFS
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set hive数据源类型，代表数据储存的位置，COS或者HDFS
     * @param Type hive数据源类型，代表数据储存的位置，COS或者HDFS
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据源所在的私有网络信息 
     * @return Location 数据源所在的私有网络信息
     */
    public DatasourceConnectionLocation getLocation() {
        return this.Location;
    }

    /**
     * Set 数据源所在的私有网络信息
     * @param Location 数据源所在的私有网络信息
     */
    public void setLocation(DatasourceConnectionLocation Location) {
        this.Location = Location;
    }

    /**
     * Get 如果类型为HDFS，需要传一个用户名 
     * @return User 如果类型为HDFS，需要传一个用户名
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 如果类型为HDFS，需要传一个用户名
     * @param User 如果类型为HDFS，需要传一个用户名
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 如果类型为HDFS，需要选择是否高可用 
     * @return HighAvailability 如果类型为HDFS，需要选择是否高可用
     */
    public Boolean getHighAvailability() {
        return this.HighAvailability;
    }

    /**
     * Set 如果类型为HDFS，需要选择是否高可用
     * @param HighAvailability 如果类型为HDFS，需要选择是否高可用
     */
    public void setHighAvailability(Boolean HighAvailability) {
        this.HighAvailability = HighAvailability;
    }

    /**
     * Get 如果类型为COS，需要填写COS桶连接 
     * @return BucketUrl 如果类型为COS，需要填写COS桶连接
     */
    public String getBucketUrl() {
        return this.BucketUrl;
    }

    /**
     * Set 如果类型为COS，需要填写COS桶连接
     * @param BucketUrl 如果类型为COS，需要填写COS桶连接
     */
    public void setBucketUrl(String BucketUrl) {
        this.BucketUrl = BucketUrl;
    }

    /**
     * Get json字符串。如果类型为HDFS，需要填写该字段 
     * @return HdfsProperties json字符串。如果类型为HDFS，需要填写该字段
     */
    public String getHdfsProperties() {
        return this.HdfsProperties;
    }

    /**
     * Set json字符串。如果类型为HDFS，需要填写该字段
     * @param HdfsProperties json字符串。如果类型为HDFS，需要填写该字段
     */
    public void setHdfsProperties(String HdfsProperties) {
        this.HdfsProperties = HdfsProperties;
    }

    /**
     * Get Hive的元数据库信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mysql Hive的元数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MysqlInfo getMysql() {
        return this.Mysql;
    }

    /**
     * Set Hive的元数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mysql Hive的元数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMysql(MysqlInfo Mysql) {
        this.Mysql = Mysql;
    }

    /**
     * Get emr集群Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId emr集群Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set emr集群Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId emr集群Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get emr集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName emr集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set emr集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName emr集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get EMR集群中hive组件的版本号 
     * @return HiveVersion EMR集群中hive组件的版本号
     */
    public String getHiveVersion() {
        return this.HiveVersion;
    }

    /**
     * Set EMR集群中hive组件的版本号
     * @param HiveVersion EMR集群中hive组件的版本号
     */
    public void setHiveVersion(String HiveVersion) {
        this.HiveVersion = HiveVersion;
    }

    /**
     * Get Kerberos详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KerberosInfo Kerberos详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KerberosInfo getKerberosInfo() {
        return this.KerberosInfo;
    }

    /**
     * Set Kerberos详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param KerberosInfo Kerberos详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKerberosInfo(KerberosInfo KerberosInfo) {
        this.KerberosInfo = KerberosInfo;
    }

    /**
     * Get 是否开启Kerberos
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KerberosEnable 是否开启Kerberos
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getKerberosEnable() {
        return this.KerberosEnable;
    }

    /**
     * Set 是否开启Kerberos
注意：此字段可能返回 null，表示取不到有效值。
     * @param KerberosEnable 是否开启Kerberos
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKerberosEnable(Boolean KerberosEnable) {
        this.KerberosEnable = KerberosEnable;
    }

    public HiveInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HiveInfo(HiveInfo source) {
        if (source.MetaStoreUrl != null) {
            this.MetaStoreUrl = new String(source.MetaStoreUrl);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Location != null) {
            this.Location = new DatasourceConnectionLocation(source.Location);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.HighAvailability != null) {
            this.HighAvailability = new Boolean(source.HighAvailability);
        }
        if (source.BucketUrl != null) {
            this.BucketUrl = new String(source.BucketUrl);
        }
        if (source.HdfsProperties != null) {
            this.HdfsProperties = new String(source.HdfsProperties);
        }
        if (source.Mysql != null) {
            this.Mysql = new MysqlInfo(source.Mysql);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.HiveVersion != null) {
            this.HiveVersion = new String(source.HiveVersion);
        }
        if (source.KerberosInfo != null) {
            this.KerberosInfo = new KerberosInfo(source.KerberosInfo);
        }
        if (source.KerberosEnable != null) {
            this.KerberosEnable = new Boolean(source.KerberosEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetaStoreUrl", this.MetaStoreUrl);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "HighAvailability", this.HighAvailability);
        this.setParamSimple(map, prefix + "BucketUrl", this.BucketUrl);
        this.setParamSimple(map, prefix + "HdfsProperties", this.HdfsProperties);
        this.setParamObj(map, prefix + "Mysql.", this.Mysql);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "HiveVersion", this.HiveVersion);
        this.setParamObj(map, prefix + "KerberosInfo.", this.KerberosInfo);
        this.setParamSimple(map, prefix + "KerberosEnable", this.KerberosEnable);

    }
}

