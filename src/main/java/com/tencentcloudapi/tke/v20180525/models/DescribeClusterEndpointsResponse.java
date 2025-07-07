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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterEndpointsResponse extends AbstractModel {

    /**
    * 集群APIServer的CA证书
    */
    @SerializedName("CertificationAuthority")
    @Expose
    private String CertificationAuthority;

    /**
    * 集群APIServer的外网访问地址
    */
    @SerializedName("ClusterExternalEndpoint")
    @Expose
    private String ClusterExternalEndpoint;

    /**
    * 集群APIServer的内网访问地址
    */
    @SerializedName("ClusterIntranetEndpoint")
    @Expose
    private String ClusterIntranetEndpoint;

    /**
    * 集群APIServer的域名
    */
    @SerializedName("ClusterDomain")
    @Expose
    private String ClusterDomain;

    /**
    * 集群APIServer的外网访问ACL列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterExternalACL")
    @Expose
    private String [] ClusterExternalACL;

    /**
    * 外网域名
    */
    @SerializedName("ClusterExternalDomain")
    @Expose
    private String ClusterExternalDomain;

    /**
    * 内网域名
    */
    @SerializedName("ClusterIntranetDomain")
    @Expose
    private String ClusterIntranetDomain;

    /**
    * 外网安全组
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
    * 内网访问所属子网
    */
    @SerializedName("ClusterIntranetSubnetId")
    @Expose
    private String ClusterIntranetSubnetId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群APIServer的CA证书 
     * @return CertificationAuthority 集群APIServer的CA证书
     */
    public String getCertificationAuthority() {
        return this.CertificationAuthority;
    }

    /**
     * Set 集群APIServer的CA证书
     * @param CertificationAuthority 集群APIServer的CA证书
     */
    public void setCertificationAuthority(String CertificationAuthority) {
        this.CertificationAuthority = CertificationAuthority;
    }

    /**
     * Get 集群APIServer的外网访问地址 
     * @return ClusterExternalEndpoint 集群APIServer的外网访问地址
     */
    public String getClusterExternalEndpoint() {
        return this.ClusterExternalEndpoint;
    }

    /**
     * Set 集群APIServer的外网访问地址
     * @param ClusterExternalEndpoint 集群APIServer的外网访问地址
     */
    public void setClusterExternalEndpoint(String ClusterExternalEndpoint) {
        this.ClusterExternalEndpoint = ClusterExternalEndpoint;
    }

    /**
     * Get 集群APIServer的内网访问地址 
     * @return ClusterIntranetEndpoint 集群APIServer的内网访问地址
     */
    public String getClusterIntranetEndpoint() {
        return this.ClusterIntranetEndpoint;
    }

    /**
     * Set 集群APIServer的内网访问地址
     * @param ClusterIntranetEndpoint 集群APIServer的内网访问地址
     */
    public void setClusterIntranetEndpoint(String ClusterIntranetEndpoint) {
        this.ClusterIntranetEndpoint = ClusterIntranetEndpoint;
    }

    /**
     * Get 集群APIServer的域名 
     * @return ClusterDomain 集群APIServer的域名
     */
    public String getClusterDomain() {
        return this.ClusterDomain;
    }

    /**
     * Set 集群APIServer的域名
     * @param ClusterDomain 集群APIServer的域名
     */
    public void setClusterDomain(String ClusterDomain) {
        this.ClusterDomain = ClusterDomain;
    }

    /**
     * Get 集群APIServer的外网访问ACL列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterExternalACL 集群APIServer的外网访问ACL列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getClusterExternalACL() {
        return this.ClusterExternalACL;
    }

    /**
     * Set 集群APIServer的外网访问ACL列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterExternalACL 集群APIServer的外网访问ACL列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterExternalACL(String [] ClusterExternalACL) {
        this.ClusterExternalACL = ClusterExternalACL;
    }

    /**
     * Get 外网域名 
     * @return ClusterExternalDomain 外网域名
     */
    public String getClusterExternalDomain() {
        return this.ClusterExternalDomain;
    }

    /**
     * Set 外网域名
     * @param ClusterExternalDomain 外网域名
     */
    public void setClusterExternalDomain(String ClusterExternalDomain) {
        this.ClusterExternalDomain = ClusterExternalDomain;
    }

    /**
     * Get 内网域名 
     * @return ClusterIntranetDomain 内网域名
     */
    public String getClusterIntranetDomain() {
        return this.ClusterIntranetDomain;
    }

    /**
     * Set 内网域名
     * @param ClusterIntranetDomain 内网域名
     */
    public void setClusterIntranetDomain(String ClusterIntranetDomain) {
        this.ClusterIntranetDomain = ClusterIntranetDomain;
    }

    /**
     * Get 外网安全组 
     * @return SecurityGroup 外网安全组
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 外网安全组
     * @param SecurityGroup 外网安全组
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get 内网访问所属子网 
     * @return ClusterIntranetSubnetId 内网访问所属子网
     */
    public String getClusterIntranetSubnetId() {
        return this.ClusterIntranetSubnetId;
    }

    /**
     * Set 内网访问所属子网
     * @param ClusterIntranetSubnetId 内网访问所属子网
     */
    public void setClusterIntranetSubnetId(String ClusterIntranetSubnetId) {
        this.ClusterIntranetSubnetId = ClusterIntranetSubnetId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterEndpointsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterEndpointsResponse(DescribeClusterEndpointsResponse source) {
        if (source.CertificationAuthority != null) {
            this.CertificationAuthority = new String(source.CertificationAuthority);
        }
        if (source.ClusterExternalEndpoint != null) {
            this.ClusterExternalEndpoint = new String(source.ClusterExternalEndpoint);
        }
        if (source.ClusterIntranetEndpoint != null) {
            this.ClusterIntranetEndpoint = new String(source.ClusterIntranetEndpoint);
        }
        if (source.ClusterDomain != null) {
            this.ClusterDomain = new String(source.ClusterDomain);
        }
        if (source.ClusterExternalACL != null) {
            this.ClusterExternalACL = new String[source.ClusterExternalACL.length];
            for (int i = 0; i < source.ClusterExternalACL.length; i++) {
                this.ClusterExternalACL[i] = new String(source.ClusterExternalACL[i]);
            }
        }
        if (source.ClusterExternalDomain != null) {
            this.ClusterExternalDomain = new String(source.ClusterExternalDomain);
        }
        if (source.ClusterIntranetDomain != null) {
            this.ClusterIntranetDomain = new String(source.ClusterIntranetDomain);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String(source.SecurityGroup);
        }
        if (source.ClusterIntranetSubnetId != null) {
            this.ClusterIntranetSubnetId = new String(source.ClusterIntranetSubnetId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificationAuthority", this.CertificationAuthority);
        this.setParamSimple(map, prefix + "ClusterExternalEndpoint", this.ClusterExternalEndpoint);
        this.setParamSimple(map, prefix + "ClusterIntranetEndpoint", this.ClusterIntranetEndpoint);
        this.setParamSimple(map, prefix + "ClusterDomain", this.ClusterDomain);
        this.setParamArraySimple(map, prefix + "ClusterExternalACL.", this.ClusterExternalACL);
        this.setParamSimple(map, prefix + "ClusterExternalDomain", this.ClusterExternalDomain);
        this.setParamSimple(map, prefix + "ClusterIntranetDomain", this.ClusterIntranetDomain);
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);
        this.setParamSimple(map, prefix + "ClusterIntranetSubnetId", this.ClusterIntranetSubnetId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

