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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisCommonInstanceList extends AbstractModel {

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 实例所属项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 实例接入区域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例接入可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例私有网络 ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络所属子网 ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例状态信息。
- 1-流程中。
- 2-运行中。
- -2-实例已隔离。
- -3-实例待回收。
- -4-实例已删除。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例私有网络 IP 地址。
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * 实例网络端口。
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 实例创建时间。
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;

    /**
    * 计费类型。
- 0：按量计费。
- 1：包年包月。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 网络类型。
- 0：基础网络。
- 1：VPC 网络。
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。 
     * @return AppId 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。
     * @param AppId 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 实例所属项目 ID。 
     * @return ProjectId 实例所属项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 实例所属项目 ID。
     * @param ProjectId 实例所属项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例接入区域。 
     * @return Region 实例接入区域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例接入区域。
     * @param Region 实例接入区域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例接入可用区。 
     * @return Zone 实例接入可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例接入可用区。
     * @param Zone 实例接入可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例私有网络 ID。 
     * @return VpcId 实例私有网络 ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 实例私有网络 ID。
     * @param VpcId 实例私有网络 ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络所属子网 ID。 
     * @return SubnetId 私有网络所属子网 ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络所属子网 ID。
     * @param SubnetId 私有网络所属子网 ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例状态信息。
- 1-流程中。
- 2-运行中。
- -2-实例已隔离。
- -3-实例待回收。
- -4-实例已删除。 
     * @return Status 实例状态信息。
- 1-流程中。
- 2-运行中。
- -2-实例已隔离。
- -3-实例待回收。
- -4-实例已删除。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态信息。
- 1-流程中。
- 2-运行中。
- -2-实例已隔离。
- -3-实例待回收。
- -4-实例已删除。
     * @param Status 实例状态信息。
- 1-流程中。
- 2-运行中。
- -2-实例已隔离。
- -3-实例待回收。
- -4-实例已删除。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例私有网络 IP 地址。 
     * @return Vips 实例私有网络 IP 地址。
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set 实例私有网络 IP 地址。
     * @param Vips 实例私有网络 IP 地址。
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get 实例网络端口。 
     * @return Vport 实例网络端口。
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 实例网络端口。
     * @param Vport 实例网络端口。
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 实例创建时间。 
     * @return Createtime 实例创建时间。
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set 实例创建时间。
     * @param Createtime 实例创建时间。
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get 计费类型。
- 0：按量计费。
- 1：包年包月。 
     * @return PayMode 计费类型。
- 0：按量计费。
- 1：包年包月。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费类型。
- 0：按量计费。
- 1：包年包月。
     * @param PayMode 计费类型。
- 0：按量计费。
- 1：包年包月。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 网络类型。
- 0：基础网络。
- 1：VPC 网络。 
     * @return NetType 网络类型。
- 0：基础网络。
- 1：VPC 网络。
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型。
- 0：基础网络。
- 1：VPC 网络。
     * @param NetType 网络类型。
- 0：基础网络。
- 1：VPC 网络。
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    public RedisCommonInstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisCommonInstanceList(RedisCommonInstanceList source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Vips != null) {
            this.Vips = new String[source.Vips.length];
            for (int i = 0; i < source.Vips.length; i++) {
                this.Vips[i] = new String(source.Vips[i]);
            }
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Createtime != null) {
            this.Createtime = new String(source.Createtime);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Vips.", this.Vips);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Createtime", this.Createtime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "NetType", this.NetType);

    }
}

