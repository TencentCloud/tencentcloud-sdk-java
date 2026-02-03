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

public class CloudBaseGWAPI extends AbstractModel {

    /**
    * 服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API ID
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * API Path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API 类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * API 名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * API创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 自定义值通用字段：
Type为1时，该值为空。
Type为2时，该值为容器的代理IP:PORT数组。
    */
    @SerializedName("Custom")
    @Expose
    private String Custom;

    /**
    * 表示是否开启认证
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableAuth")
    @Expose
    private Boolean EnableAuth;

    /**
    * 云开发环境ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 访问类型（该参数暂不对外暴露）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 统一发布状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnionStatus")
    @Expose
    private Long UnionStatus;

    /**
    * 域名（*表示所有域名）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 是否有路径冲突
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConflictFlag")
    @Expose
    private Boolean ConflictFlag;

    /**
    * 域名状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainStatus")
    @Expose
    private Long DomainStatus;

    /**
    * 是否开启路径透传，默认true表示短路径，即不开启(已弃用)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsShortPath")
    @Expose
    private Boolean IsShortPath;

    /**
    * 路径透传，默认0关闭，1开启，2关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathTransmission")
    @Expose
    private Long PathTransmission;

    /**
    * 跨域校验，默认0开启，1开启，2关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableCheckAcrossDomain")
    @Expose
    private Long EnableCheckAcrossDomain;

    /**
    * 静态托管文件目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StaticFileDirectory")
    @Expose
    private String StaticFileDirectory;

    /**
    * QPS策略
    */
    @SerializedName("QPSPolicy")
    @Expose
    private CloudBaseGWAPIQPSPolicy QPSPolicy;

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
     * Get API ID 
     * @return APIId API ID
     */
    public String getAPIId() {
        return this.APIId;
    }

    /**
     * Set API ID
     * @param APIId API ID
     */
    public void setAPIId(String APIId) {
        this.APIId = APIId;
    }

    /**
     * Get API Path 
     * @return Path API Path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API Path
     * @param Path API Path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API 类型 
     * @return Type API 类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set API 类型
     * @param Type API 类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get API 名 
     * @return Name API 名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set API 名
     * @param Name API 名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get API创建时间 
     * @return CreateTime API创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set API创建时间
     * @param CreateTime API创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 自定义值通用字段：
Type为1时，该值为空。
Type为2时，该值为容器的代理IP:PORT数组。 
     * @return Custom 自定义值通用字段：
Type为1时，该值为空。
Type为2时，该值为容器的代理IP:PORT数组。
     */
    public String getCustom() {
        return this.Custom;
    }

    /**
     * Set 自定义值通用字段：
Type为1时，该值为空。
Type为2时，该值为容器的代理IP:PORT数组。
     * @param Custom 自定义值通用字段：
Type为1时，该值为空。
Type为2时，该值为容器的代理IP:PORT数组。
     */
    public void setCustom(String Custom) {
        this.Custom = Custom;
    }

    /**
     * Get 表示是否开启认证
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableAuth 表示是否开启认证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableAuth() {
        return this.EnableAuth;
    }

    /**
     * Set 表示是否开启认证
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableAuth 表示是否开启认证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableAuth(Boolean EnableAuth) {
        this.EnableAuth = EnableAuth;
    }

    /**
     * Get 云开发环境ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvId 云开发环境ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 云开发环境ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvId 云开发环境ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 访问类型（该参数暂不对外暴露）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessType 访问类型（该参数暂不对外暴露）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 访问类型（该参数暂不对外暴露）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessType 访问类型（该参数暂不对外暴露）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 统一发布状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnionStatus 统一发布状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnionStatus() {
        return this.UnionStatus;
    }

    /**
     * Set 统一发布状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnionStatus 统一发布状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnionStatus(Long UnionStatus) {
        this.UnionStatus = UnionStatus;
    }

    /**
     * Get 域名（*表示所有域名）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名（*表示所有域名）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名（*表示所有域名）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名（*表示所有域名）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 是否有路径冲突
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConflictFlag 是否有路径冲突
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getConflictFlag() {
        return this.ConflictFlag;
    }

    /**
     * Set 是否有路径冲突
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConflictFlag 是否有路径冲突
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConflictFlag(Boolean ConflictFlag) {
        this.ConflictFlag = ConflictFlag;
    }

    /**
     * Get 域名状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainStatus 域名状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set 域名状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainStatus 域名状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainStatus(Long DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    /**
     * Get 是否开启路径透传，默认true表示短路径，即不开启(已弃用)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsShortPath 是否开启路径透传，默认true表示短路径，即不开启(已弃用)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsShortPath() {
        return this.IsShortPath;
    }

    /**
     * Set 是否开启路径透传，默认true表示短路径，即不开启(已弃用)
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsShortPath 是否开启路径透传，默认true表示短路径，即不开启(已弃用)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsShortPath(Boolean IsShortPath) {
        this.IsShortPath = IsShortPath;
    }

    /**
     * Get 路径透传，默认0关闭，1开启，2关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathTransmission 路径透传，默认0关闭，1开启，2关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPathTransmission() {
        return this.PathTransmission;
    }

    /**
     * Set 路径透传，默认0关闭，1开启，2关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathTransmission 路径透传，默认0关闭，1开启，2关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathTransmission(Long PathTransmission) {
        this.PathTransmission = PathTransmission;
    }

    /**
     * Get 跨域校验，默认0开启，1开启，2关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableCheckAcrossDomain 跨域校验，默认0开启，1开启，2关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableCheckAcrossDomain() {
        return this.EnableCheckAcrossDomain;
    }

    /**
     * Set 跨域校验，默认0开启，1开启，2关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableCheckAcrossDomain 跨域校验，默认0开启，1开启，2关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableCheckAcrossDomain(Long EnableCheckAcrossDomain) {
        this.EnableCheckAcrossDomain = EnableCheckAcrossDomain;
    }

    /**
     * Get 静态托管文件目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StaticFileDirectory 静态托管文件目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStaticFileDirectory() {
        return this.StaticFileDirectory;
    }

    /**
     * Set 静态托管文件目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param StaticFileDirectory 静态托管文件目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStaticFileDirectory(String StaticFileDirectory) {
        this.StaticFileDirectory = StaticFileDirectory;
    }

    /**
     * Get QPS策略 
     * @return QPSPolicy QPS策略
     */
    public CloudBaseGWAPIQPSPolicy getQPSPolicy() {
        return this.QPSPolicy;
    }

    /**
     * Set QPS策略
     * @param QPSPolicy QPS策略
     */
    public void setQPSPolicy(CloudBaseGWAPIQPSPolicy QPSPolicy) {
        this.QPSPolicy = QPSPolicy;
    }

    public CloudBaseGWAPI() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseGWAPI(CloudBaseGWAPI source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.APIId != null) {
            this.APIId = new String(source.APIId);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Custom != null) {
            this.Custom = new String(source.Custom);
        }
        if (source.EnableAuth != null) {
            this.EnableAuth = new Boolean(source.EnableAuth);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.UnionStatus != null) {
            this.UnionStatus = new Long(source.UnionStatus);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ConflictFlag != null) {
            this.ConflictFlag = new Boolean(source.ConflictFlag);
        }
        if (source.DomainStatus != null) {
            this.DomainStatus = new Long(source.DomainStatus);
        }
        if (source.IsShortPath != null) {
            this.IsShortPath = new Boolean(source.IsShortPath);
        }
        if (source.PathTransmission != null) {
            this.PathTransmission = new Long(source.PathTransmission);
        }
        if (source.EnableCheckAcrossDomain != null) {
            this.EnableCheckAcrossDomain = new Long(source.EnableCheckAcrossDomain);
        }
        if (source.StaticFileDirectory != null) {
            this.StaticFileDirectory = new String(source.StaticFileDirectory);
        }
        if (source.QPSPolicy != null) {
            this.QPSPolicy = new CloudBaseGWAPIQPSPolicy(source.QPSPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "APIId", this.APIId);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Custom", this.Custom);
        this.setParamSimple(map, prefix + "EnableAuth", this.EnableAuth);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "UnionStatus", this.UnionStatus);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ConflictFlag", this.ConflictFlag);
        this.setParamSimple(map, prefix + "DomainStatus", this.DomainStatus);
        this.setParamSimple(map, prefix + "IsShortPath", this.IsShortPath);
        this.setParamSimple(map, prefix + "PathTransmission", this.PathTransmission);
        this.setParamSimple(map, prefix + "EnableCheckAcrossDomain", this.EnableCheckAcrossDomain);
        this.setParamSimple(map, prefix + "StaticFileDirectory", this.StaticFileDirectory);
        this.setParamObj(map, prefix + "QPSPolicy.", this.QPSPolicy);

    }
}

