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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TmpInstance extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例备注
    */
    @SerializedName("InstanceRemark")
    @Expose
    private String InstanceRemark;

    /**
    * 0:非临时实例 ,1:无效临时实例, 2:回档成功的有效临时实例
    */
    @SerializedName("TempType")
    @Expose
    private Long TempType;

    /**
    * 实例状态,0:待初始化,1:流程处理中,2:有效状态,-1:已隔离，-2：已下线
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例 ID，形如：tdsql-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例虚IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 实例虚端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 有效期结束时间
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 源实例 ID，形如：tdsql-ow728lmc。
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * 实例状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 实例所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例所在可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例虚IPv6
    */
    @SerializedName("Vipv6")
    @Expose
    private String Vipv6;

    /**
    * 实例IPv6标志
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
     * Get 应用ID 
     * @return AppId 应用ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用ID
     * @param AppId 应用ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例备注 
     * @return InstanceRemark 实例备注
     */
    public String getInstanceRemark() {
        return this.InstanceRemark;
    }

    /**
     * Set 实例备注
     * @param InstanceRemark 实例备注
     */
    public void setInstanceRemark(String InstanceRemark) {
        this.InstanceRemark = InstanceRemark;
    }

    /**
     * Get 0:非临时实例 ,1:无效临时实例, 2:回档成功的有效临时实例 
     * @return TempType 0:非临时实例 ,1:无效临时实例, 2:回档成功的有效临时实例
     */
    public Long getTempType() {
        return this.TempType;
    }

    /**
     * Set 0:非临时实例 ,1:无效临时实例, 2:回档成功的有效临时实例
     * @param TempType 0:非临时实例 ,1:无效临时实例, 2:回档成功的有效临时实例
     */
    public void setTempType(Long TempType) {
        this.TempType = TempType;
    }

    /**
     * Get 实例状态,0:待初始化,1:流程处理中,2:有效状态,-1:已隔离，-2：已下线 
     * @return Status 实例状态,0:待初始化,1:流程处理中,2:有效状态,-1:已隔离，-2：已下线
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态,0:待初始化,1:流程处理中,2:有效状态,-1:已隔离，-2：已下线
     * @param Status 实例状态,0:待初始化,1:流程处理中,2:有效状态,-1:已隔离，-2：已下线
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例 ID，形如：tdsql-ow728lmc。 
     * @return InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，形如：tdsql-ow728lmc。
     * @param InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例虚IP 
     * @return Vip 实例虚IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例虚IP
     * @param Vip 实例虚IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 实例虚端口 
     * @return Vport 实例虚端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 实例虚端口
     * @param Vport 实例虚端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 有效期结束时间 
     * @return PeriodEndTime 有效期结束时间
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set 有效期结束时间
     * @param PeriodEndTime 有效期结束时间
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get 源实例 ID，形如：tdsql-ow728lmc。 
     * @return SrcInstanceId 源实例 ID，形如：tdsql-ow728lmc。
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set 源实例 ID，形如：tdsql-ow728lmc。
     * @param SrcInstanceId 源实例 ID，形如：tdsql-ow728lmc。
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get 实例状态描述 
     * @return StatusDesc 实例状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 实例状态描述
     * @param StatusDesc 实例状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 实例所在地域 
     * @return Region 实例所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所在地域
     * @param Region 实例所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例所在可用区 
     * @return Zone 实例所在可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所在可用区
     * @param Zone 实例所在可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例虚IPv6 
     * @return Vipv6 实例虚IPv6
     */
    public String getVipv6() {
        return this.Vipv6;
    }

    /**
     * Set 实例虚IPv6
     * @param Vipv6 实例虚IPv6
     */
    public void setVipv6(String Vipv6) {
        this.Vipv6 = Vipv6;
    }

    /**
     * Get 实例IPv6标志 
     * @return Ipv6Flag 实例IPv6标志
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set 实例IPv6标志
     * @param Ipv6Flag 实例IPv6标志
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    public TmpInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TmpInstance(TmpInstance source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InstanceRemark != null) {
            this.InstanceRemark = new String(source.InstanceRemark);
        }
        if (source.TempType != null) {
            this.TempType = new Long(source.TempType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Vipv6 != null) {
            this.Vipv6 = new String(source.Vipv6);
        }
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Long(source.Ipv6Flag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InstanceRemark", this.InstanceRemark);
        this.setParamSimple(map, prefix + "TempType", this.TempType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Vipv6", this.Vipv6);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);

    }
}

