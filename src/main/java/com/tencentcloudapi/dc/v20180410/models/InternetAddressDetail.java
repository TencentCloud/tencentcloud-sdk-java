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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetAddressDetail extends AbstractModel{

    /**
    * 互联网地址ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 互联网网络地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subnet")
    @Expose
    private String Subnet;

    /**
    * 网络地址掩码长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaskLen")
    @Expose
    private Long MaskLen;

    /**
    * 0:BGP
1:电信
2:移动
3:联通
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddrType")
    @Expose
    private Long AddrType;

    /**
    * 0:使用中
1:已停用
2:已退还
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 申请时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * 停用时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StopTime")
    @Expose
    private String StopTime;

    /**
    * 退还时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseTime")
    @Expose
    private String ReleaseTime;

    /**
    * 地域信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 0:IPv4 1:IPv6
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddrProto")
    @Expose
    private Long AddrProto;

    /**
    * 释放状态的IP地址保留的天数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReserveTime")
    @Expose
    private Long ReserveTime;

    /**
     * Get 互联网地址ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 互联网地址ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 互联网地址ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 互联网地址ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 互联网网络地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subnet 互联网网络地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnet() {
        return this.Subnet;
    }

    /**
     * Set 互联网网络地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subnet 互联网网络地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnet(String Subnet) {
        this.Subnet = Subnet;
    }

    /**
     * Get 网络地址掩码长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaskLen 网络地址掩码长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaskLen() {
        return this.MaskLen;
    }

    /**
     * Set 网络地址掩码长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaskLen 网络地址掩码长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaskLen(Long MaskLen) {
        this.MaskLen = MaskLen;
    }

    /**
     * Get 0:BGP
1:电信
2:移动
3:联通
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddrType 0:BGP
1:电信
2:移动
3:联通
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAddrType() {
        return this.AddrType;
    }

    /**
     * Set 0:BGP
1:电信
2:移动
3:联通
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddrType 0:BGP
1:电信
2:移动
3:联通
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddrType(Long AddrType) {
        this.AddrType = AddrType;
    }

    /**
     * Get 0:使用中
1:已停用
2:已退还 
     * @return Status 0:使用中
1:已停用
2:已退还
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0:使用中
1:已停用
2:已退还
     * @param Status 0:使用中
1:已停用
2:已退还
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 申请时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplyTime 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplyTime 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get 停用时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StopTime 停用时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStopTime() {
        return this.StopTime;
    }

    /**
     * Set 停用时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StopTime 停用时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStopTime(String StopTime) {
        this.StopTime = StopTime;
    }

    /**
     * Get 退还时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseTime 退还时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set 退还时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseTime 退还时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseTime(String ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
    }

    /**
     * Get 地域信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 0:IPv4 1:IPv6
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddrProto 0:IPv4 1:IPv6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAddrProto() {
        return this.AddrProto;
    }

    /**
     * Set 0:IPv4 1:IPv6
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddrProto 0:IPv4 1:IPv6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddrProto(Long AddrProto) {
        this.AddrProto = AddrProto;
    }

    /**
     * Get 释放状态的IP地址保留的天数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReserveTime 释放状态的IP地址保留的天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReserveTime() {
        return this.ReserveTime;
    }

    /**
     * Set 释放状态的IP地址保留的天数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReserveTime 释放状态的IP地址保留的天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReserveTime(Long ReserveTime) {
        this.ReserveTime = ReserveTime;
    }

    public InternetAddressDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternetAddressDetail(InternetAddressDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Subnet != null) {
            this.Subnet = new String(source.Subnet);
        }
        if (source.MaskLen != null) {
            this.MaskLen = new Long(source.MaskLen);
        }
        if (source.AddrType != null) {
            this.AddrType = new Long(source.AddrType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.StopTime != null) {
            this.StopTime = new String(source.StopTime);
        }
        if (source.ReleaseTime != null) {
            this.ReleaseTime = new String(source.ReleaseTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AddrProto != null) {
            this.AddrProto = new Long(source.AddrProto);
        }
        if (source.ReserveTime != null) {
            this.ReserveTime = new Long(source.ReserveTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Subnet", this.Subnet);
        this.setParamSimple(map, prefix + "MaskLen", this.MaskLen);
        this.setParamSimple(map, prefix + "AddrType", this.AddrType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "StopTime", this.StopTime);
        this.setParamSimple(map, prefix + "ReleaseTime", this.ReleaseTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AddrProto", this.AddrProto);
        this.setParamSimple(map, prefix + "ReserveTime", this.ReserveTime);

    }
}

