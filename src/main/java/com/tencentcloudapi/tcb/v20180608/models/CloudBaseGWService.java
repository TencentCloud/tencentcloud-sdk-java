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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseGWService extends AbstractModel {

    /**
    * 服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 服务域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 开启时间
    */
    @SerializedName("OpenTime")
    @Expose
    private Long OpenTime;

    /**
    * 绑定状态，1 绑定中；2绑定失败；3绑定成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否被抢占, 被抢占表示域名被其他环境绑定了，需要解绑或者重新绑定。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPreempted")
    @Expose
    private Boolean IsPreempted;

    /**
    * 是否开启多地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableRegion")
    @Expose
    private Boolean EnableRegion;

    /**
    * cdn CName地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 统一域名状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnionStatus")
    @Expose
    private Long UnionStatus;

    /**
    * CName状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CnameStatus")
    @Expose
    private Long CnameStatus;

    /**
    * 证书Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 是否强制https
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForceHttps")
    @Expose
    private Boolean ForceHttps;

    /**
    * icp黑名单封禁状态，0-未封禁，1-封禁
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IcpForbidStatus")
    @Expose
    private Long IcpForbidStatus;

    /**
    * 自定义路由规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomRoutingRules")
    @Expose
    private String CustomRoutingRules;

    /**
    * 绑定类型，1绑定cdn，2源站，4自定义
    */
    @SerializedName("BindFlag")
    @Expose
    private Long BindFlag;

    /**
    * TcbIngress源站cname
    */
    @SerializedName("OriginCname")
    @Expose
    private String OriginCname;

    /**
    * 自定义cname
    */
    @SerializedName("CustomCname")
    @Expose
    private String CustomCname;

    /**
     * Get 服务ID 
     * @return ServiceId 服务ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务ID
     * @param ServiceId 服务ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 服务域名 
     * @return Domain 服务域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 服务域名
     * @param Domain 服务域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 开启时间 
     * @return OpenTime 开启时间
     */
    public Long getOpenTime() {
        return this.OpenTime;
    }

    /**
     * Set 开启时间
     * @param OpenTime 开启时间
     */
    public void setOpenTime(Long OpenTime) {
        this.OpenTime = OpenTime;
    }

    /**
     * Get 绑定状态，1 绑定中；2绑定失败；3绑定成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 绑定状态，1 绑定中；2绑定失败；3绑定成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 绑定状态，1 绑定中；2绑定失败；3绑定成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 绑定状态，1 绑定中；2绑定失败；3绑定成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否被抢占, 被抢占表示域名被其他环境绑定了，需要解绑或者重新绑定。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPreempted 是否被抢占, 被抢占表示域名被其他环境绑定了，需要解绑或者重新绑定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPreempted() {
        return this.IsPreempted;
    }

    /**
     * Set 是否被抢占, 被抢占表示域名被其他环境绑定了，需要解绑或者重新绑定。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPreempted 是否被抢占, 被抢占表示域名被其他环境绑定了，需要解绑或者重新绑定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPreempted(Boolean IsPreempted) {
        this.IsPreempted = IsPreempted;
    }

    /**
     * Get 是否开启多地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableRegion 是否开启多地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableRegion() {
        return this.EnableRegion;
    }

    /**
     * Set 是否开启多地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableRegion 是否开启多地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableRegion(Boolean EnableRegion) {
        this.EnableRegion = EnableRegion;
    }

    /**
     * Get cdn CName地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cname cdn CName地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set cdn CName地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cname cdn CName地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 统一域名状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnionStatus 统一域名状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnionStatus() {
        return this.UnionStatus;
    }

    /**
     * Set 统一域名状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnionStatus 统一域名状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnionStatus(Long UnionStatus) {
        this.UnionStatus = UnionStatus;
    }

    /**
     * Get CName状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CnameStatus CName状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCnameStatus() {
        return this.CnameStatus;
    }

    /**
     * Set CName状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param CnameStatus CName状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCnameStatus(Long CnameStatus) {
        this.CnameStatus = CnameStatus;
    }

    /**
     * Get 证书Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertId 证书Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertId 证书Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 是否强制https
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForceHttps 是否强制https
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getForceHttps() {
        return this.ForceHttps;
    }

    /**
     * Set 是否强制https
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForceHttps 是否强制https
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForceHttps(Boolean ForceHttps) {
        this.ForceHttps = ForceHttps;
    }

    /**
     * Get icp黑名单封禁状态，0-未封禁，1-封禁
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IcpForbidStatus icp黑名单封禁状态，0-未封禁，1-封禁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIcpForbidStatus() {
        return this.IcpForbidStatus;
    }

    /**
     * Set icp黑名单封禁状态，0-未封禁，1-封禁
注意：此字段可能返回 null，表示取不到有效值。
     * @param IcpForbidStatus icp黑名单封禁状态，0-未封禁，1-封禁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIcpForbidStatus(Long IcpForbidStatus) {
        this.IcpForbidStatus = IcpForbidStatus;
    }

    /**
     * Get 自定义路由规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomRoutingRules 自定义路由规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomRoutingRules() {
        return this.CustomRoutingRules;
    }

    /**
     * Set 自定义路由规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomRoutingRules 自定义路由规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomRoutingRules(String CustomRoutingRules) {
        this.CustomRoutingRules = CustomRoutingRules;
    }

    /**
     * Get 绑定类型，1绑定cdn，2源站，4自定义 
     * @return BindFlag 绑定类型，1绑定cdn，2源站，4自定义
     */
    public Long getBindFlag() {
        return this.BindFlag;
    }

    /**
     * Set 绑定类型，1绑定cdn，2源站，4自定义
     * @param BindFlag 绑定类型，1绑定cdn，2源站，4自定义
     */
    public void setBindFlag(Long BindFlag) {
        this.BindFlag = BindFlag;
    }

    /**
     * Get TcbIngress源站cname 
     * @return OriginCname TcbIngress源站cname
     */
    public String getOriginCname() {
        return this.OriginCname;
    }

    /**
     * Set TcbIngress源站cname
     * @param OriginCname TcbIngress源站cname
     */
    public void setOriginCname(String OriginCname) {
        this.OriginCname = OriginCname;
    }

    /**
     * Get 自定义cname 
     * @return CustomCname 自定义cname
     */
    public String getCustomCname() {
        return this.CustomCname;
    }

    /**
     * Set 自定义cname
     * @param CustomCname 自定义cname
     */
    public void setCustomCname(String CustomCname) {
        this.CustomCname = CustomCname;
    }

    public CloudBaseGWService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseGWService(CloudBaseGWService source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.OpenTime != null) {
            this.OpenTime = new Long(source.OpenTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsPreempted != null) {
            this.IsPreempted = new Boolean(source.IsPreempted);
        }
        if (source.EnableRegion != null) {
            this.EnableRegion = new Boolean(source.EnableRegion);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.UnionStatus != null) {
            this.UnionStatus = new Long(source.UnionStatus);
        }
        if (source.CnameStatus != null) {
            this.CnameStatus = new Long(source.CnameStatus);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.ForceHttps != null) {
            this.ForceHttps = new Boolean(source.ForceHttps);
        }
        if (source.IcpForbidStatus != null) {
            this.IcpForbidStatus = new Long(source.IcpForbidStatus);
        }
        if (source.CustomRoutingRules != null) {
            this.CustomRoutingRules = new String(source.CustomRoutingRules);
        }
        if (source.BindFlag != null) {
            this.BindFlag = new Long(source.BindFlag);
        }
        if (source.OriginCname != null) {
            this.OriginCname = new String(source.OriginCname);
        }
        if (source.CustomCname != null) {
            this.CustomCname = new String(source.CustomCname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "OpenTime", this.OpenTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsPreempted", this.IsPreempted);
        this.setParamSimple(map, prefix + "EnableRegion", this.EnableRegion);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "UnionStatus", this.UnionStatus);
        this.setParamSimple(map, prefix + "CnameStatus", this.CnameStatus);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "ForceHttps", this.ForceHttps);
        this.setParamSimple(map, prefix + "IcpForbidStatus", this.IcpForbidStatus);
        this.setParamSimple(map, prefix + "CustomRoutingRules", this.CustomRoutingRules);
        this.setParamSimple(map, prefix + "BindFlag", this.BindFlag);
        this.setParamSimple(map, prefix + "OriginCname", this.OriginCname);
        this.setParamSimple(map, prefix + "CustomCname", this.CustomCname);

    }
}

