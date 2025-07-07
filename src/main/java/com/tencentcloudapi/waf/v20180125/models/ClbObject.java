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
    * 对象ID
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 精准域名列表
    */
    @SerializedName("PreciseDomains")
    @Expose
    private String [] PreciseDomains;

    /**
    * WAF功能开关状态，0关闭1开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * WAF日志开关状态，0关闭1开启
    */
    @SerializedName("ClsStatus")
    @Expose
    private Long ClsStatus;

    /**
    * CLB对象对应的虚拟域名
    */
    @SerializedName("VirtualDomain")
    @Expose
    private String VirtualDomain;

    /**
    * 对象名称
    */
    @SerializedName("ObjectName")
    @Expose
    private String ObjectName;

    /**
    * 公网地址
    */
    @SerializedName("PublicIp")
    @Expose
    private String [] PublicIp;

    /**
    * 内网地址
    */
    @SerializedName("PrivateIp")
    @Expose
    private String [] PrivateIp;

    /**
    * VPC名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VPC ID
    */
    @SerializedName("Vpc")
    @Expose
    private String Vpc;

    /**
    * waf实例等级，如果未绑定实例为0
    */
    @SerializedName("InstanceLevel")
    @Expose
    private Long InstanceLevel;

    /**
    * clb投递开关
    */
    @SerializedName("PostCLSStatus")
    @Expose
    private Long PostCLSStatus;

    /**
    * kafka投递开关
    */
    @SerializedName("PostCKafkaStatus")
    @Expose
    private Long PostCKafkaStatus;

    /**
    * 对象类型：CLB:负载均衡器，TSE:云原生网关
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 对象地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 代理状态: 0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出
    */
    @SerializedName("Proxy")
    @Expose
    private Long Proxy;

    /**
    * 指定获取客户端IP的头部字段列表。IsCdn为3时有效
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * bot防护开关
    */
    @SerializedName("BotStatus")
    @Expose
    private Long BotStatus;

    /**
    * api防护开关
    */
    @SerializedName("ApiStatus")
    @Expose
    private Long ApiStatus;

    /**
    * 对象接入模式，0表示镜像模式，1表示清洗模式，2表示体检模式，默认为清洗模式
    */
    @SerializedName("ObjectFlowMode")
    @Expose
    private Long ObjectFlowMode;

    /**
    * 数值形式的私有网络 ID
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
     * Get 对象ID 
     * @return ObjectId 对象ID
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 对象ID
     * @param ObjectId 对象ID
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 精准域名列表 
     * @return PreciseDomains 精准域名列表
     */
    public String [] getPreciseDomains() {
        return this.PreciseDomains;
    }

    /**
     * Set 精准域名列表
     * @param PreciseDomains 精准域名列表
     */
    public void setPreciseDomains(String [] PreciseDomains) {
        this.PreciseDomains = PreciseDomains;
    }

    /**
     * Get WAF功能开关状态，0关闭1开启 
     * @return Status WAF功能开关状态，0关闭1开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set WAF功能开关状态，0关闭1开启
     * @param Status WAF功能开关状态，0关闭1开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get WAF日志开关状态，0关闭1开启 
     * @return ClsStatus WAF日志开关状态，0关闭1开启
     */
    public Long getClsStatus() {
        return this.ClsStatus;
    }

    /**
     * Set WAF日志开关状态，0关闭1开启
     * @param ClsStatus WAF日志开关状态，0关闭1开启
     */
    public void setClsStatus(Long ClsStatus) {
        this.ClsStatus = ClsStatus;
    }

    /**
     * Get CLB对象对应的虚拟域名 
     * @return VirtualDomain CLB对象对应的虚拟域名
     */
    public String getVirtualDomain() {
        return this.VirtualDomain;
    }

    /**
     * Set CLB对象对应的虚拟域名
     * @param VirtualDomain CLB对象对应的虚拟域名
     */
    public void setVirtualDomain(String VirtualDomain) {
        this.VirtualDomain = VirtualDomain;
    }

    /**
     * Get 对象名称 
     * @return ObjectName 对象名称
     */
    public String getObjectName() {
        return this.ObjectName;
    }

    /**
     * Set 对象名称
     * @param ObjectName 对象名称
     */
    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    /**
     * Get 公网地址 
     * @return PublicIp 公网地址
     */
    public String [] getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网地址
     * @param PublicIp 公网地址
     */
    public void setPublicIp(String [] PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 内网地址 
     * @return PrivateIp 内网地址
     */
    public String [] getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网地址
     * @param PrivateIp 内网地址
     */
    public void setPrivateIp(String [] PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get VPC名称 
     * @return VpcName VPC名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC名称
     * @param VpcName VPC名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get VPC ID 
     * @return Vpc VPC ID
     */
    public String getVpc() {
        return this.Vpc;
    }

    /**
     * Set VPC ID
     * @param Vpc VPC ID
     */
    public void setVpc(String Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get waf实例等级，如果未绑定实例为0 
     * @return InstanceLevel waf实例等级，如果未绑定实例为0
     */
    public Long getInstanceLevel() {
        return this.InstanceLevel;
    }

    /**
     * Set waf实例等级，如果未绑定实例为0
     * @param InstanceLevel waf实例等级，如果未绑定实例为0
     */
    public void setInstanceLevel(Long InstanceLevel) {
        this.InstanceLevel = InstanceLevel;
    }

    /**
     * Get clb投递开关 
     * @return PostCLSStatus clb投递开关
     */
    public Long getPostCLSStatus() {
        return this.PostCLSStatus;
    }

    /**
     * Set clb投递开关
     * @param PostCLSStatus clb投递开关
     */
    public void setPostCLSStatus(Long PostCLSStatus) {
        this.PostCLSStatus = PostCLSStatus;
    }

    /**
     * Get kafka投递开关 
     * @return PostCKafkaStatus kafka投递开关
     */
    public Long getPostCKafkaStatus() {
        return this.PostCKafkaStatus;
    }

    /**
     * Set kafka投递开关
     * @param PostCKafkaStatus kafka投递开关
     */
    public void setPostCKafkaStatus(Long PostCKafkaStatus) {
        this.PostCKafkaStatus = PostCKafkaStatus;
    }

    /**
     * Get 对象类型：CLB:负载均衡器，TSE:云原生网关 
     * @return Type 对象类型：CLB:负载均衡器，TSE:云原生网关
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 对象类型：CLB:负载均衡器，TSE:云原生网关
     * @param Type 对象类型：CLB:负载均衡器，TSE:云原生网关
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 对象地域 
     * @return Region 对象地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 对象地域
     * @param Region 对象地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 代理状态: 0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出 
     * @return Proxy 代理状态: 0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出
     */
    public Long getProxy() {
        return this.Proxy;
    }

    /**
     * Set 代理状态: 0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出
     * @param Proxy 代理状态: 0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出
     */
    public void setProxy(Long Proxy) {
        this.Proxy = Proxy;
    }

    /**
     * Get 指定获取客户端IP的头部字段列表。IsCdn为3时有效 
     * @return IpHeaders 指定获取客户端IP的头部字段列表。IsCdn为3时有效
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set 指定获取客户端IP的头部字段列表。IsCdn为3时有效
     * @param IpHeaders 指定获取客户端IP的头部字段列表。IsCdn为3时有效
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get bot防护开关 
     * @return BotStatus bot防护开关
     */
    public Long getBotStatus() {
        return this.BotStatus;
    }

    /**
     * Set bot防护开关
     * @param BotStatus bot防护开关
     */
    public void setBotStatus(Long BotStatus) {
        this.BotStatus = BotStatus;
    }

    /**
     * Get api防护开关 
     * @return ApiStatus api防护开关
     */
    public Long getApiStatus() {
        return this.ApiStatus;
    }

    /**
     * Set api防护开关
     * @param ApiStatus api防护开关
     */
    public void setApiStatus(Long ApiStatus) {
        this.ApiStatus = ApiStatus;
    }

    /**
     * Get 对象接入模式，0表示镜像模式，1表示清洗模式，2表示体检模式，默认为清洗模式 
     * @return ObjectFlowMode 对象接入模式，0表示镜像模式，1表示清洗模式，2表示体检模式，默认为清洗模式
     */
    public Long getObjectFlowMode() {
        return this.ObjectFlowMode;
    }

    /**
     * Set 对象接入模式，0表示镜像模式，1表示清洗模式，2表示体检模式，默认为清洗模式
     * @param ObjectFlowMode 对象接入模式，0表示镜像模式，1表示清洗模式，2表示体检模式，默认为清洗模式
     */
    public void setObjectFlowMode(Long ObjectFlowMode) {
        this.ObjectFlowMode = ObjectFlowMode;
    }

    /**
     * Get 数值形式的私有网络 ID 
     * @return NumericalVpcId 数值形式的私有网络 ID
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set 数值形式的私有网络 ID
     * @param NumericalVpcId 数值形式的私有网络 ID
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 创建时间 
     * @return AddTime 创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 创建时间
     * @param AddTime 创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
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

    }
}

