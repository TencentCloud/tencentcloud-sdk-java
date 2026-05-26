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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbObject extends AbstractModel {

    /**
    * <p>对象ID</p>
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>精准域名列表</p>
    */
    @SerializedName("PreciseDomains")
    @Expose
    private String [] PreciseDomains;

    /**
    * <p>WAF功能开关状态，0关闭1开启</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>WAF日志开关状态，0关闭1开启</p>
    */
    @SerializedName("ClsStatus")
    @Expose
    private Long ClsStatus;

    /**
    * <p>CLB对象对应的虚拟域名</p>
    */
    @SerializedName("VirtualDomain")
    @Expose
    private String VirtualDomain;

    /**
    * <p>对象名称</p>
    */
    @SerializedName("ObjectName")
    @Expose
    private String ObjectName;

    /**
    * <p>公网地址</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String [] PublicIp;

    /**
    * <p>内网地址</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String [] PrivateIp;

    /**
    * <p>VPC名称</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>VPC ID</p>
    */
    @SerializedName("Vpc")
    @Expose
    private String Vpc;

    /**
    * <p>waf实例等级，如果未绑定实例为0</p>
    */
    @SerializedName("InstanceLevel")
    @Expose
    private Long InstanceLevel;

    /**
    * <p>clb投递开关</p>
    */
    @SerializedName("PostCLSStatus")
    @Expose
    private Long PostCLSStatus;

    /**
    * <p>kafka投递开关</p>
    */
    @SerializedName("PostCKafkaStatus")
    @Expose
    private Long PostCKafkaStatus;

    /**
    * <p>对象类型：CLB:负载均衡器，TSE:云原生网关</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>对象地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>代理状态: 0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出</p>
    */
    @SerializedName("Proxy")
    @Expose
    private Long Proxy;

    /**
    * <p>指定获取客户端IP的头部字段列表。IsCdn为3时有效</p>
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * <p>bot防护开关</p>
    */
    @SerializedName("BotStatus")
    @Expose
    private Long BotStatus;

    /**
    * <p>api防护开关</p>
    */
    @SerializedName("ApiStatus")
    @Expose
    private Long ApiStatus;

    /**
    * <p>对象接入模式，0表示镜像模式，1表示清洗模式，2表示体检模式，默认为清洗模式</p>
    */
    @SerializedName("ObjectFlowMode")
    @Expose
    private Long ObjectFlowMode;

    /**
    * <p>数值形式的私有网络 ID</p>
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * <p>跨账号时，表示成员账号的appid</p>
    */
    @SerializedName("MemberAppId")
    @Expose
    private Long MemberAppId;

    /**
    * <p>跨账号时，表示成员账号的uin</p>
    */
    @SerializedName("MemberUin")
    @Expose
    private String MemberUin;

    /**
    * <p>跨账号时，表示成员账号的昵称</p>
    */
    @SerializedName("MemberNickName")
    @Expose
    private String MemberNickName;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("TagInfos")
    @Expose
    private TagInfo [] TagInfos;

    /**
    * <p>精准域名信息</p>
    */
    @SerializedName("PreciseDomainDetails")
    @Expose
    private DomainInfo [] PreciseDomainDetails;

    /**
    * <p>waf接入状态</p>
    */
    @SerializedName("WafAccessStatus")
    @Expose
    private Long WafAccessStatus;

    /**
     * Get <p>对象ID</p> 
     * @return ObjectId <p>对象ID</p>
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set <p>对象ID</p>
     * @param ObjectId <p>对象ID</p>
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>精准域名列表</p> 
     * @return PreciseDomains <p>精准域名列表</p>
     */
    public String [] getPreciseDomains() {
        return this.PreciseDomains;
    }

    /**
     * Set <p>精准域名列表</p>
     * @param PreciseDomains <p>精准域名列表</p>
     */
    public void setPreciseDomains(String [] PreciseDomains) {
        this.PreciseDomains = PreciseDomains;
    }

    /**
     * Get <p>WAF功能开关状态，0关闭1开启</p> 
     * @return Status <p>WAF功能开关状态，0关闭1开启</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>WAF功能开关状态，0关闭1开启</p>
     * @param Status <p>WAF功能开关状态，0关闭1开启</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>WAF日志开关状态，0关闭1开启</p> 
     * @return ClsStatus <p>WAF日志开关状态，0关闭1开启</p>
     */
    public Long getClsStatus() {
        return this.ClsStatus;
    }

    /**
     * Set <p>WAF日志开关状态，0关闭1开启</p>
     * @param ClsStatus <p>WAF日志开关状态，0关闭1开启</p>
     */
    public void setClsStatus(Long ClsStatus) {
        this.ClsStatus = ClsStatus;
    }

    /**
     * Get <p>CLB对象对应的虚拟域名</p> 
     * @return VirtualDomain <p>CLB对象对应的虚拟域名</p>
     */
    public String getVirtualDomain() {
        return this.VirtualDomain;
    }

    /**
     * Set <p>CLB对象对应的虚拟域名</p>
     * @param VirtualDomain <p>CLB对象对应的虚拟域名</p>
     */
    public void setVirtualDomain(String VirtualDomain) {
        this.VirtualDomain = VirtualDomain;
    }

    /**
     * Get <p>对象名称</p> 
     * @return ObjectName <p>对象名称</p>
     */
    public String getObjectName() {
        return this.ObjectName;
    }

    /**
     * Set <p>对象名称</p>
     * @param ObjectName <p>对象名称</p>
     */
    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    /**
     * Get <p>公网地址</p> 
     * @return PublicIp <p>公网地址</p>
     */
    public String [] getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>公网地址</p>
     * @param PublicIp <p>公网地址</p>
     */
    public void setPublicIp(String [] PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>内网地址</p> 
     * @return PrivateIp <p>内网地址</p>
     */
    public String [] getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>内网地址</p>
     * @param PrivateIp <p>内网地址</p>
     */
    public void setPrivateIp(String [] PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>VPC名称</p> 
     * @return VpcName <p>VPC名称</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>VPC名称</p>
     * @param VpcName <p>VPC名称</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>VPC ID</p> 
     * @return Vpc <p>VPC ID</p>
     */
    public String getVpc() {
        return this.Vpc;
    }

    /**
     * Set <p>VPC ID</p>
     * @param Vpc <p>VPC ID</p>
     */
    public void setVpc(String Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get <p>waf实例等级，如果未绑定实例为0</p> 
     * @return InstanceLevel <p>waf实例等级，如果未绑定实例为0</p>
     */
    public Long getInstanceLevel() {
        return this.InstanceLevel;
    }

    /**
     * Set <p>waf实例等级，如果未绑定实例为0</p>
     * @param InstanceLevel <p>waf实例等级，如果未绑定实例为0</p>
     */
    public void setInstanceLevel(Long InstanceLevel) {
        this.InstanceLevel = InstanceLevel;
    }

    /**
     * Get <p>clb投递开关</p> 
     * @return PostCLSStatus <p>clb投递开关</p>
     */
    public Long getPostCLSStatus() {
        return this.PostCLSStatus;
    }

    /**
     * Set <p>clb投递开关</p>
     * @param PostCLSStatus <p>clb投递开关</p>
     */
    public void setPostCLSStatus(Long PostCLSStatus) {
        this.PostCLSStatus = PostCLSStatus;
    }

    /**
     * Get <p>kafka投递开关</p> 
     * @return PostCKafkaStatus <p>kafka投递开关</p>
     */
    public Long getPostCKafkaStatus() {
        return this.PostCKafkaStatus;
    }

    /**
     * Set <p>kafka投递开关</p>
     * @param PostCKafkaStatus <p>kafka投递开关</p>
     */
    public void setPostCKafkaStatus(Long PostCKafkaStatus) {
        this.PostCKafkaStatus = PostCKafkaStatus;
    }

    /**
     * Get <p>对象类型：CLB:负载均衡器，TSE:云原生网关</p> 
     * @return Type <p>对象类型：CLB:负载均衡器，TSE:云原生网关</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>对象类型：CLB:负载均衡器，TSE:云原生网关</p>
     * @param Type <p>对象类型：CLB:负载均衡器，TSE:云原生网关</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>对象地域</p> 
     * @return Region <p>对象地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>对象地域</p>
     * @param Region <p>对象地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>代理状态: 0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出</p> 
     * @return Proxy <p>代理状态: 0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出</p>
     */
    public Long getProxy() {
        return this.Proxy;
    }

    /**
     * Set <p>代理状态: 0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出</p>
     * @param Proxy <p>代理状态: 0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出</p>
     */
    public void setProxy(Long Proxy) {
        this.Proxy = Proxy;
    }

    /**
     * Get <p>指定获取客户端IP的头部字段列表。IsCdn为3时有效</p> 
     * @return IpHeaders <p>指定获取客户端IP的头部字段列表。IsCdn为3时有效</p>
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set <p>指定获取客户端IP的头部字段列表。IsCdn为3时有效</p>
     * @param IpHeaders <p>指定获取客户端IP的头部字段列表。IsCdn为3时有效</p>
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get <p>bot防护开关</p> 
     * @return BotStatus <p>bot防护开关</p>
     */
    public Long getBotStatus() {
        return this.BotStatus;
    }

    /**
     * Set <p>bot防护开关</p>
     * @param BotStatus <p>bot防护开关</p>
     */
    public void setBotStatus(Long BotStatus) {
        this.BotStatus = BotStatus;
    }

    /**
     * Get <p>api防护开关</p> 
     * @return ApiStatus <p>api防护开关</p>
     */
    public Long getApiStatus() {
        return this.ApiStatus;
    }

    /**
     * Set <p>api防护开关</p>
     * @param ApiStatus <p>api防护开关</p>
     */
    public void setApiStatus(Long ApiStatus) {
        this.ApiStatus = ApiStatus;
    }

    /**
     * Get <p>对象接入模式，0表示镜像模式，1表示清洗模式，2表示体检模式，默认为清洗模式</p> 
     * @return ObjectFlowMode <p>对象接入模式，0表示镜像模式，1表示清洗模式，2表示体检模式，默认为清洗模式</p>
     */
    public Long getObjectFlowMode() {
        return this.ObjectFlowMode;
    }

    /**
     * Set <p>对象接入模式，0表示镜像模式，1表示清洗模式，2表示体检模式，默认为清洗模式</p>
     * @param ObjectFlowMode <p>对象接入模式，0表示镜像模式，1表示清洗模式，2表示体检模式，默认为清洗模式</p>
     */
    public void setObjectFlowMode(Long ObjectFlowMode) {
        this.ObjectFlowMode = ObjectFlowMode;
    }

    /**
     * Get <p>数值形式的私有网络 ID</p> 
     * @return NumericalVpcId <p>数值形式的私有网络 ID</p>
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set <p>数值形式的私有网络 ID</p>
     * @param NumericalVpcId <p>数值形式的私有网络 ID</p>
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    /**
     * Get <p>修改时间</p> 
     * @return ModifyTime <p>修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModifyTime <p>修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>创建时间</p> 
     * @return AddTime <p>创建时间</p>
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param AddTime <p>创建时间</p>
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get <p>跨账号时，表示成员账号的appid</p> 
     * @return MemberAppId <p>跨账号时，表示成员账号的appid</p>
     */
    public Long getMemberAppId() {
        return this.MemberAppId;
    }

    /**
     * Set <p>跨账号时，表示成员账号的appid</p>
     * @param MemberAppId <p>跨账号时，表示成员账号的appid</p>
     */
    public void setMemberAppId(Long MemberAppId) {
        this.MemberAppId = MemberAppId;
    }

    /**
     * Get <p>跨账号时，表示成员账号的uin</p> 
     * @return MemberUin <p>跨账号时，表示成员账号的uin</p>
     */
    public String getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set <p>跨账号时，表示成员账号的uin</p>
     * @param MemberUin <p>跨账号时，表示成员账号的uin</p>
     */
    public void setMemberUin(String MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get <p>跨账号时，表示成员账号的昵称</p> 
     * @return MemberNickName <p>跨账号时，表示成员账号的昵称</p>
     */
    public String getMemberNickName() {
        return this.MemberNickName;
    }

    /**
     * Set <p>跨账号时，表示成员账号的昵称</p>
     * @param MemberNickName <p>跨账号时，表示成员账号的昵称</p>
     */
    public void setMemberNickName(String MemberNickName) {
        this.MemberNickName = MemberNickName;
    }

    /**
     * Get <p>标签信息</p> 
     * @return TagInfos <p>标签信息</p>
     */
    public TagInfo [] getTagInfos() {
        return this.TagInfos;
    }

    /**
     * Set <p>标签信息</p>
     * @param TagInfos <p>标签信息</p>
     */
    public void setTagInfos(TagInfo [] TagInfos) {
        this.TagInfos = TagInfos;
    }

    /**
     * Get <p>精准域名信息</p> 
     * @return PreciseDomainDetails <p>精准域名信息</p>
     */
    public DomainInfo [] getPreciseDomainDetails() {
        return this.PreciseDomainDetails;
    }

    /**
     * Set <p>精准域名信息</p>
     * @param PreciseDomainDetails <p>精准域名信息</p>
     */
    public void setPreciseDomainDetails(DomainInfo [] PreciseDomainDetails) {
        this.PreciseDomainDetails = PreciseDomainDetails;
    }

    /**
     * Get <p>waf接入状态</p> 
     * @return WafAccessStatus <p>waf接入状态</p>
     */
    public Long getWafAccessStatus() {
        return this.WafAccessStatus;
    }

    /**
     * Set <p>waf接入状态</p>
     * @param WafAccessStatus <p>waf接入状态</p>
     */
    public void setWafAccessStatus(Long WafAccessStatus) {
        this.WafAccessStatus = WafAccessStatus;
    }

    public ClbObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbObject(ClbObject source) {
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PreciseDomains != null) {
            this.PreciseDomains = new String[source.PreciseDomains.length];
            for (int i = 0; i < source.PreciseDomains.length; i++) {
                this.PreciseDomains[i] = new String(source.PreciseDomains[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ClsStatus != null) {
            this.ClsStatus = new Long(source.ClsStatus);
        }
        if (source.VirtualDomain != null) {
            this.VirtualDomain = new String(source.VirtualDomain);
        }
        if (source.ObjectName != null) {
            this.ObjectName = new String(source.ObjectName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String[source.PublicIp.length];
            for (int i = 0; i < source.PublicIp.length; i++) {
                this.PublicIp[i] = new String(source.PublicIp[i]);
            }
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String[source.PrivateIp.length];
            for (int i = 0; i < source.PrivateIp.length; i++) {
                this.PrivateIp[i] = new String(source.PrivateIp[i]);
            }
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.Vpc != null) {
            this.Vpc = new String(source.Vpc);
        }
        if (source.InstanceLevel != null) {
            this.InstanceLevel = new Long(source.InstanceLevel);
        }
        if (source.PostCLSStatus != null) {
            this.PostCLSStatus = new Long(source.PostCLSStatus);
        }
        if (source.PostCKafkaStatus != null) {
            this.PostCKafkaStatus = new Long(source.PostCKafkaStatus);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Proxy != null) {
            this.Proxy = new Long(source.Proxy);
        }
        if (source.IpHeaders != null) {
            this.IpHeaders = new String[source.IpHeaders.length];
            for (int i = 0; i < source.IpHeaders.length; i++) {
                this.IpHeaders[i] = new String(source.IpHeaders[i]);
            }
        }
        if (source.BotStatus != null) {
            this.BotStatus = new Long(source.BotStatus);
        }
        if (source.ApiStatus != null) {
            this.ApiStatus = new Long(source.ApiStatus);
        }
        if (source.ObjectFlowMode != null) {
            this.ObjectFlowMode = new Long(source.ObjectFlowMode);
        }
        if (source.NumericalVpcId != null) {
            this.NumericalVpcId = new Long(source.NumericalVpcId);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.MemberAppId != null) {
            this.MemberAppId = new Long(source.MemberAppId);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new String(source.MemberUin);
        }
        if (source.MemberNickName != null) {
            this.MemberNickName = new String(source.MemberNickName);
        }
        if (source.TagInfos != null) {
            this.TagInfos = new TagInfo[source.TagInfos.length];
            for (int i = 0; i < source.TagInfos.length; i++) {
                this.TagInfos[i] = new TagInfo(source.TagInfos[i]);
            }
        }
        if (source.PreciseDomainDetails != null) {
            this.PreciseDomainDetails = new DomainInfo[source.PreciseDomainDetails.length];
            for (int i = 0; i < source.PreciseDomainDetails.length; i++) {
                this.PreciseDomainDetails[i] = new DomainInfo(source.PreciseDomainDetails[i]);
            }
        }
        if (source.WafAccessStatus != null) {
            this.WafAccessStatus = new Long(source.WafAccessStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "PreciseDomains.", this.PreciseDomains);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClsStatus", this.ClsStatus);
        this.setParamSimple(map, prefix + "VirtualDomain", this.VirtualDomain);
        this.setParamSimple(map, prefix + "ObjectName", this.ObjectName);
        this.setParamArraySimple(map, prefix + "PublicIp.", this.PublicIp);
        this.setParamArraySimple(map, prefix + "PrivateIp.", this.PrivateIp);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "Vpc", this.Vpc);
        this.setParamSimple(map, prefix + "InstanceLevel", this.InstanceLevel);
        this.setParamSimple(map, prefix + "PostCLSStatus", this.PostCLSStatus);
        this.setParamSimple(map, prefix + "PostCKafkaStatus", this.PostCKafkaStatus);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Proxy", this.Proxy);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "BotStatus", this.BotStatus);
        this.setParamSimple(map, prefix + "ApiStatus", this.ApiStatus);
        this.setParamSimple(map, prefix + "ObjectFlowMode", this.ObjectFlowMode);
        this.setParamSimple(map, prefix + "NumericalVpcId", this.NumericalVpcId);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "MemberAppId", this.MemberAppId);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "MemberNickName", this.MemberNickName);
        this.setParamArrayObj(map, prefix + "TagInfos.", this.TagInfos);
        this.setParamArrayObj(map, prefix + "PreciseDomainDetails.", this.PreciseDomainDetails);
        this.setParamSimple(map, prefix + "WafAccessStatus", this.WafAccessStatus);

    }
}

