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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterSetting extends AbstractModel{

    /**
    * 付费方式。
PREPAID 包年包月。
POSTPAID_BY_HOUR 按量计费，默认方式。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 是否为HA集群。
    */
    @SerializedName("SupportHA")
    @Expose
    private Boolean SupportHA;

    /**
    * 集群所使用的安全组，目前仅支持一个。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 实例位置。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 实例所在VPC。
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
    * 实例登录配置。
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * 实例标签。
    */
    @SerializedName("TagSpecification")
    @Expose
    private String [] TagSpecification;

    /**
    * 元数据库配置。
    */
    @SerializedName("MetaDB")
    @Expose
    private MetaDbInfo MetaDB;

    /**
    * 实例硬件配置。
    */
    @SerializedName("ResourceSpec")
    @Expose
    private JobFlowResourceSpec ResourceSpec;

    /**
    * 是否申请公网IP，默认为false。
    */
    @SerializedName("PublicIpAssigned")
    @Expose
    private Boolean PublicIpAssigned;

    /**
    * 包年包月配置，只对包年包月集群生效。
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * 集群置放群组。
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String DisasterRecoverGroupIds;

    /**
    * 是否使用cbs加密。
    */
    @SerializedName("CbsEncryptFlag")
    @Expose
    private Boolean CbsEncryptFlag;

    /**
    * 是否使用远程登录，默认为false。
    */
    @SerializedName("RemoteTcpDefaultPort")
    @Expose
    private Boolean RemoteTcpDefaultPort;

    /**
     * Get 付费方式。
PREPAID 包年包月。
POSTPAID_BY_HOUR 按量计费，默认方式。 
     * @return InstanceChargeType 付费方式。
PREPAID 包年包月。
POSTPAID_BY_HOUR 按量计费，默认方式。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 付费方式。
PREPAID 包年包月。
POSTPAID_BY_HOUR 按量计费，默认方式。
     * @param InstanceChargeType 付费方式。
PREPAID 包年包月。
POSTPAID_BY_HOUR 按量计费，默认方式。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 是否为HA集群。 
     * @return SupportHA 是否为HA集群。
     */
    public Boolean getSupportHA() {
        return this.SupportHA;
    }

    /**
     * Set 是否为HA集群。
     * @param SupportHA 是否为HA集群。
     */
    public void setSupportHA(Boolean SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * Get 集群所使用的安全组，目前仅支持一个。 
     * @return SecurityGroupIds 集群所使用的安全组，目前仅支持一个。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 集群所使用的安全组，目前仅支持一个。
     * @param SecurityGroupIds 集群所使用的安全组，目前仅支持一个。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 实例位置。 
     * @return Placement 实例位置。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 实例位置。
     * @param Placement 实例位置。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 实例所在VPC。 
     * @return VPCSettings 实例所在VPC。
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * Set 实例所在VPC。
     * @param VPCSettings 实例所在VPC。
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
    }

    /**
     * Get 实例登录配置。 
     * @return LoginSettings 实例登录配置。
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set 实例登录配置。
     * @param LoginSettings 实例登录配置。
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get 实例标签。 
     * @return TagSpecification 实例标签。
     */
    public String [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 实例标签。
     * @param TagSpecification 实例标签。
     */
    public void setTagSpecification(String [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 元数据库配置。 
     * @return MetaDB 元数据库配置。
     */
    public MetaDbInfo getMetaDB() {
        return this.MetaDB;
    }

    /**
     * Set 元数据库配置。
     * @param MetaDB 元数据库配置。
     */
    public void setMetaDB(MetaDbInfo MetaDB) {
        this.MetaDB = MetaDB;
    }

    /**
     * Get 实例硬件配置。 
     * @return ResourceSpec 实例硬件配置。
     */
    public JobFlowResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set 实例硬件配置。
     * @param ResourceSpec 实例硬件配置。
     */
    public void setResourceSpec(JobFlowResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get 是否申请公网IP，默认为false。 
     * @return PublicIpAssigned 是否申请公网IP，默认为false。
     */
    public Boolean getPublicIpAssigned() {
        return this.PublicIpAssigned;
    }

    /**
     * Set 是否申请公网IP，默认为false。
     * @param PublicIpAssigned 是否申请公网IP，默认为false。
     */
    public void setPublicIpAssigned(Boolean PublicIpAssigned) {
        this.PublicIpAssigned = PublicIpAssigned;
    }

    /**
     * Get 包年包月配置，只对包年包月集群生效。 
     * @return InstanceChargePrepaid 包年包月配置，只对包年包月集群生效。
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 包年包月配置，只对包年包月集群生效。
     * @param InstanceChargePrepaid 包年包月配置，只对包年包月集群生效。
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get 集群置放群组。 
     * @return DisasterRecoverGroupIds 集群置放群组。
     */
    public String getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set 集群置放群组。
     * @param DisasterRecoverGroupIds 集群置放群组。
     */
    public void setDisasterRecoverGroupIds(String DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get 是否使用cbs加密。 
     * @return CbsEncryptFlag 是否使用cbs加密。
     */
    public Boolean getCbsEncryptFlag() {
        return this.CbsEncryptFlag;
    }

    /**
     * Set 是否使用cbs加密。
     * @param CbsEncryptFlag 是否使用cbs加密。
     */
    public void setCbsEncryptFlag(Boolean CbsEncryptFlag) {
        this.CbsEncryptFlag = CbsEncryptFlag;
    }

    /**
     * Get 是否使用远程登录，默认为false。 
     * @return RemoteTcpDefaultPort 是否使用远程登录，默认为false。
     */
    public Boolean getRemoteTcpDefaultPort() {
        return this.RemoteTcpDefaultPort;
    }

    /**
     * Set 是否使用远程登录，默认为false。
     * @param RemoteTcpDefaultPort 是否使用远程登录，默认为false。
     */
    public void setRemoteTcpDefaultPort(Boolean RemoteTcpDefaultPort) {
        this.RemoteTcpDefaultPort = RemoteTcpDefaultPort;
    }

    public ClusterSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterSetting(ClusterSetting source) {
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.SupportHA != null) {
            this.SupportHA = new Boolean(source.SupportHA);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.VPCSettings != null) {
            this.VPCSettings = new VPCSettings(source.VPCSettings);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new String[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new String(source.TagSpecification[i]);
            }
        }
        if (source.MetaDB != null) {
            this.MetaDB = new MetaDbInfo(source.MetaDB);
        }
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new JobFlowResourceSpec(source.ResourceSpec);
        }
        if (source.PublicIpAssigned != null) {
            this.PublicIpAssigned = new Boolean(source.PublicIpAssigned);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String(source.DisasterRecoverGroupIds);
        }
        if (source.CbsEncryptFlag != null) {
            this.CbsEncryptFlag = new Boolean(source.CbsEncryptFlag);
        }
        if (source.RemoteTcpDefaultPort != null) {
            this.RemoteTcpDefaultPort = new Boolean(source.RemoteTcpDefaultPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "SupportHA", this.SupportHA);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArraySimple(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamObj(map, prefix + "MetaDB.", this.MetaDB);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamSimple(map, prefix + "PublicIpAssigned", this.PublicIpAssigned);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "DisasterRecoverGroupIds", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "CbsEncryptFlag", this.CbsEncryptFlag);
        this.setParamSimple(map, prefix + "RemoteTcpDefaultPort", this.RemoteTcpDefaultPort);

    }
}

