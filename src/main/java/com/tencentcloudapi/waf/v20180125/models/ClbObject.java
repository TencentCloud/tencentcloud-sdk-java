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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbObject extends AbstractModel{

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

    }
}

