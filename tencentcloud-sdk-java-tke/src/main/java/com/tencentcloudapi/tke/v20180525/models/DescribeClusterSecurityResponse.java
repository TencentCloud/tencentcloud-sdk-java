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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterSecurityResponse extends AbstractModel{

    /**
    * 集群的账号名称
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 集群的访问密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 集群访问CA证书
    */
    @SerializedName("CertificationAuthority")
    @Expose
    private String CertificationAuthority;

    /**
    * 集群访问的地址
    */
    @SerializedName("ClusterExternalEndpoint")
    @Expose
    private String ClusterExternalEndpoint;

    /**
    * 集群访问的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 集群Endpoint地址
    */
    @SerializedName("PgwEndpoint")
    @Expose
    private String PgwEndpoint;

    /**
    * 集群访问策略组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityPolicy")
    @Expose
    private String [] SecurityPolicy;

    /**
    * 集群Kubeconfig文件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Kubeconfig")
    @Expose
    private String Kubeconfig;

    /**
    * 集群JnsGw的访问地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JnsGwEndpoint")
    @Expose
    private String JnsGwEndpoint;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群的账号名称 
     * @return UserName 集群的账号名称
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 集群的账号名称
     * @param UserName 集群的账号名称
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 集群的访问密码 
     * @return Password 集群的访问密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 集群的访问密码
     * @param Password 集群的访问密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 集群访问CA证书 
     * @return CertificationAuthority 集群访问CA证书
     */
    public String getCertificationAuthority() {
        return this.CertificationAuthority;
    }

    /**
     * Set 集群访问CA证书
     * @param CertificationAuthority 集群访问CA证书
     */
    public void setCertificationAuthority(String CertificationAuthority) {
        this.CertificationAuthority = CertificationAuthority;
    }

    /**
     * Get 集群访问的地址 
     * @return ClusterExternalEndpoint 集群访问的地址
     */
    public String getClusterExternalEndpoint() {
        return this.ClusterExternalEndpoint;
    }

    /**
     * Set 集群访问的地址
     * @param ClusterExternalEndpoint 集群访问的地址
     */
    public void setClusterExternalEndpoint(String ClusterExternalEndpoint) {
        this.ClusterExternalEndpoint = ClusterExternalEndpoint;
    }

    /**
     * Get 集群访问的域名 
     * @return Domain 集群访问的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 集群访问的域名
     * @param Domain 集群访问的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 集群Endpoint地址 
     * @return PgwEndpoint 集群Endpoint地址
     */
    public String getPgwEndpoint() {
        return this.PgwEndpoint;
    }

    /**
     * Set 集群Endpoint地址
     * @param PgwEndpoint 集群Endpoint地址
     */
    public void setPgwEndpoint(String PgwEndpoint) {
        this.PgwEndpoint = PgwEndpoint;
    }

    /**
     * Get 集群访问策略组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityPolicy 集群访问策略组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityPolicy() {
        return this.SecurityPolicy;
    }

    /**
     * Set 集群访问策略组
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityPolicy 集群访问策略组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityPolicy(String [] SecurityPolicy) {
        this.SecurityPolicy = SecurityPolicy;
    }

    /**
     * Get 集群Kubeconfig文件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Kubeconfig 集群Kubeconfig文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKubeconfig() {
        return this.Kubeconfig;
    }

    /**
     * Set 集群Kubeconfig文件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Kubeconfig 集群Kubeconfig文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKubeconfig(String Kubeconfig) {
        this.Kubeconfig = Kubeconfig;
    }

    /**
     * Get 集群JnsGw的访问地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JnsGwEndpoint 集群JnsGw的访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJnsGwEndpoint() {
        return this.JnsGwEndpoint;
    }

    /**
     * Set 集群JnsGw的访问地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param JnsGwEndpoint 集群JnsGw的访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJnsGwEndpoint(String JnsGwEndpoint) {
        this.JnsGwEndpoint = JnsGwEndpoint;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "CertificationAuthority", this.CertificationAuthority);
        this.setParamSimple(map, prefix + "ClusterExternalEndpoint", this.ClusterExternalEndpoint);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "PgwEndpoint", this.PgwEndpoint);
        this.setParamArraySimple(map, prefix + "SecurityPolicy.", this.SecurityPolicy);
        this.setParamSimple(map, prefix + "Kubeconfig", this.Kubeconfig);
        this.setParamSimple(map, prefix + "JnsGwEndpoint", this.JnsGwEndpoint);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

