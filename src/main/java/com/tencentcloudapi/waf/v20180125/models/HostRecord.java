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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostRecord extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名唯一ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 主域名，入参时为空
    */
    @SerializedName("MainDomain")
    @Expose
    private String MainDomain;

    /**
    * 规则引擎防护模式。
0：观察模式
1：拦截模式
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * waf和负载均衡器的绑定关系。
0：未绑定
1：已绑定
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * clbwaf域名监听器状态。
0：操作成功
4：正在绑定LB
6：正在解绑LB 
7：解绑LB失败 
8：绑定LB失败 
10：内部错误
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式
    */
    @SerializedName("Engine")
    @Expose
    private Long Engine;

    /**
    * waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP
    */
    @SerializedName("IsCdn")
    @Expose
    private Long IsCdn;

    /**
    * 绑定的负载均衡器信息列表
    */
    @SerializedName("LoadBalancerSet")
    @Expose
    private LoadBalancer [] LoadBalancerSet;

    /**
    * 域名绑定的LB的地域，以逗号分割多个地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 域名所属实例类型。负载均衡型WAF为"clb-waf"
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 负载均衡型WAF域名的流量模式。
1：清洗模式
0：镜像模式
    */
    @SerializedName("FlowMode")
    @Expose
    private Long FlowMode;

    /**
    * 是否开启访问日志。
1：开启
0：关闭
    */
    @SerializedName("ClsStatus")
    @Expose
    private Long ClsStatus;

    /**
    * 防护等级，可选值100,200,300
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 域名需要下发到的cdc集群列表。仅CDC场景下填充
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdcClusters")
    @Expose
    private String [] CdcClusters;

    /**
    * 应用型负载均衡类型，默认clb。 
clb：七层负载均衡器类型 
apisix：apisix网关型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
    * IsCdn=3时，需要填此参数，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * 规则引擎类型。
1: menshen
2: tiga
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineType")
    @Expose
    private Long EngineType;

    /**
    * 云类型。
public:公有云
private:私有云
hybrid:混合云
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloudType")
    @Expose
    private String CloudType;

    /**
    * 域名备注信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名唯一ID 
     * @return DomainId 域名唯一ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名唯一ID
     * @param DomainId 域名唯一ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 主域名，入参时为空 
     * @return MainDomain 主域名，入参时为空
     */
    public String getMainDomain() {
        return this.MainDomain;
    }

    /**
     * Set 主域名，入参时为空
     * @param MainDomain 主域名，入参时为空
     */
    public void setMainDomain(String MainDomain) {
        this.MainDomain = MainDomain;
    }

    /**
     * Get 规则引擎防护模式。
0：观察模式
1：拦截模式 
     * @return Mode 规则引擎防护模式。
0：观察模式
1：拦截模式
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 规则引擎防护模式。
0：观察模式
1：拦截模式
     * @param Mode 规则引擎防护模式。
0：观察模式
1：拦截模式
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get waf和负载均衡器的绑定关系。
0：未绑定
1：已绑定 
     * @return Status waf和负载均衡器的绑定关系。
0：未绑定
1：已绑定
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set waf和负载均衡器的绑定关系。
0：未绑定
1：已绑定
     * @param Status waf和负载均衡器的绑定关系。
0：未绑定
1：已绑定
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get clbwaf域名监听器状态。
0：操作成功
4：正在绑定LB
6：正在解绑LB 
7：解绑LB失败 
8：绑定LB失败 
10：内部错误 
     * @return State clbwaf域名监听器状态。
0：操作成功
4：正在绑定LB
6：正在解绑LB 
7：解绑LB失败 
8：绑定LB失败 
10：内部错误
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set clbwaf域名监听器状态。
0：操作成功
4：正在绑定LB
6：正在解绑LB 
7：解绑LB失败 
8：绑定LB失败 
10：内部错误
     * @param State clbwaf域名监听器状态。
0：操作成功
4：正在绑定LB
6：正在解绑LB 
7：解绑LB失败 
8：绑定LB失败 
10：内部错误
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式 
     * @return Engine 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式
     */
    public Long getEngine() {
        return this.Engine;
    }

    /**
     * Set 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式
     * @param Engine 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式
     */
    public void setEngine(Long Engine) {
        this.Engine = Engine;
    }

    /**
     * Get waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP 
     * @return IsCdn waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP
     */
    public Long getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP
     * @param IsCdn waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP
     */
    public void setIsCdn(Long IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get 绑定的负载均衡器信息列表 
     * @return LoadBalancerSet 绑定的负载均衡器信息列表
     */
    public LoadBalancer [] getLoadBalancerSet() {
        return this.LoadBalancerSet;
    }

    /**
     * Set 绑定的负载均衡器信息列表
     * @param LoadBalancerSet 绑定的负载均衡器信息列表
     */
    public void setLoadBalancerSet(LoadBalancer [] LoadBalancerSet) {
        this.LoadBalancerSet = LoadBalancerSet;
    }

    /**
     * Get 域名绑定的LB的地域，以逗号分割多个地域 
     * @return Region 域名绑定的LB的地域，以逗号分割多个地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 域名绑定的LB的地域，以逗号分割多个地域
     * @param Region 域名绑定的LB的地域，以逗号分割多个地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 域名所属实例类型。负载均衡型WAF为"clb-waf" 
     * @return Edition 域名所属实例类型。负载均衡型WAF为"clb-waf"
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 域名所属实例类型。负载均衡型WAF为"clb-waf"
     * @param Edition 域名所属实例类型。负载均衡型WAF为"clb-waf"
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 负载均衡型WAF域名的流量模式。
1：清洗模式
0：镜像模式 
     * @return FlowMode 负载均衡型WAF域名的流量模式。
1：清洗模式
0：镜像模式
     */
    public Long getFlowMode() {
        return this.FlowMode;
    }

    /**
     * Set 负载均衡型WAF域名的流量模式。
1：清洗模式
0：镜像模式
     * @param FlowMode 负载均衡型WAF域名的流量模式。
1：清洗模式
0：镜像模式
     */
    public void setFlowMode(Long FlowMode) {
        this.FlowMode = FlowMode;
    }

    /**
     * Get 是否开启访问日志。
1：开启
0：关闭 
     * @return ClsStatus 是否开启访问日志。
1：开启
0：关闭
     */
    public Long getClsStatus() {
        return this.ClsStatus;
    }

    /**
     * Set 是否开启访问日志。
1：开启
0：关闭
     * @param ClsStatus 是否开启访问日志。
1：开启
0：关闭
     */
    public void setClsStatus(Long ClsStatus) {
        this.ClsStatus = ClsStatus;
    }

    /**
     * Get 防护等级，可选值100,200,300
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 防护等级，可选值100,200,300
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 防护等级，可选值100,200,300
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 防护等级，可选值100,200,300
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 域名需要下发到的cdc集群列表。仅CDC场景下填充
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdcClusters 域名需要下发到的cdc集群列表。仅CDC场景下填充
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCdcClusters() {
        return this.CdcClusters;
    }

    /**
     * Set 域名需要下发到的cdc集群列表。仅CDC场景下填充
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdcClusters 域名需要下发到的cdc集群列表。仅CDC场景下填充
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdcClusters(String [] CdcClusters) {
        this.CdcClusters = CdcClusters;
    }

    /**
     * Get 应用型负载均衡类型，默认clb。 
clb：七层负载均衡器类型 
apisix：apisix网关型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlbType 应用型负载均衡类型，默认clb。 
clb：七层负载均衡器类型 
apisix：apisix网关型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set 应用型负载均衡类型，默认clb。 
clb：七层负载均衡器类型 
apisix：apisix网关型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlbType 应用型负载均衡类型，默认clb。 
clb：七层负载均衡器类型 
apisix：apisix网关型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    /**
     * Get IsCdn=3时，需要填此参数，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpHeaders IsCdn=3时，需要填此参数，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set IsCdn=3时，需要填此参数，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpHeaders IsCdn=3时，需要填此参数，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get 规则引擎类型。
1: menshen
2: tiga
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineType 规则引擎类型。
1: menshen
2: tiga
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 规则引擎类型。
1: menshen
2: tiga
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineType 规则引擎类型。
1: menshen
2: tiga
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineType(Long EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 云类型。
public:公有云
private:私有云
hybrid:混合云
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloudType 云类型。
public:公有云
private:私有云
hybrid:混合云
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCloudType() {
        return this.CloudType;
    }

    /**
     * Set 云类型。
public:公有云
private:私有云
hybrid:混合云
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloudType 云类型。
public:公有云
private:私有云
hybrid:混合云
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloudType(String CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get 域名备注信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Note 域名备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 域名备注信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Note 域名备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    public HostRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostRecord(HostRecord source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.MainDomain != null) {
            this.MainDomain = new String(source.MainDomain);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.Engine != null) {
            this.Engine = new Long(source.Engine);
        }
        if (source.IsCdn != null) {
            this.IsCdn = new Long(source.IsCdn);
        }
        if (source.LoadBalancerSet != null) {
            this.LoadBalancerSet = new LoadBalancer[source.LoadBalancerSet.length];
            for (int i = 0; i < source.LoadBalancerSet.length; i++) {
                this.LoadBalancerSet[i] = new LoadBalancer(source.LoadBalancerSet[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.FlowMode != null) {
            this.FlowMode = new Long(source.FlowMode);
        }
        if (source.ClsStatus != null) {
            this.ClsStatus = new Long(source.ClsStatus);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.CdcClusters != null) {
            this.CdcClusters = new String[source.CdcClusters.length];
            for (int i = 0; i < source.CdcClusters.length; i++) {
                this.CdcClusters[i] = new String(source.CdcClusters[i]);
            }
        }
        if (source.AlbType != null) {
            this.AlbType = new String(source.AlbType);
        }
        if (source.IpHeaders != null) {
            this.IpHeaders = new String[source.IpHeaders.length];
            for (int i = 0; i < source.IpHeaders.length; i++) {
                this.IpHeaders[i] = new String(source.IpHeaders[i]);
            }
        }
        if (source.EngineType != null) {
            this.EngineType = new Long(source.EngineType);
        }
        if (source.CloudType != null) {
            this.CloudType = new String(source.CloudType);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "MainDomain", this.MainDomain);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "IsCdn", this.IsCdn);
        this.setParamArrayObj(map, prefix + "LoadBalancerSet.", this.LoadBalancerSet);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "FlowMode", this.FlowMode);
        this.setParamSimple(map, prefix + "ClsStatus", this.ClsStatus);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArraySimple(map, prefix + "CdcClusters.", this.CdcClusters);
        this.setParamSimple(map, prefix + "AlbType", this.AlbType);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "Note", this.Note);

    }
}

