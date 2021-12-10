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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficPackage extends AbstractModel{

    /**
    * 流量包 Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 流量包类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 流量包大小（单位为 Byte）
    */
    @SerializedName("Bytes")
    @Expose
    private Long Bytes;

    /**
    * 已消耗流量（单位为 Byte）
    */
    @SerializedName("BytesUsed")
    @Expose
    private Long BytesUsed;

    /**
    * 流量包状态
enabled：已启用
expired：已过期
disabled：未启用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 流量包发放时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 流量包生效时间
    */
    @SerializedName("EnableTime")
    @Expose
    private String EnableTime;

    /**
    * 流量包过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 流量包是否续订
    */
    @SerializedName("ContractExtension")
    @Expose
    private Boolean ContractExtension;

    /**
    * 流量包是否自动续订
    */
    @SerializedName("AutoExtension")
    @Expose
    private Boolean AutoExtension;

    /**
    * 流量包来源
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 流量包生效区域，mainland或overseas
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 流量包生命周期月数
    */
    @SerializedName("LifeTimeMonth")
    @Expose
    private Long LifeTimeMonth;

    /**
    * 流量包是否支持续订
    */
    @SerializedName("ExtensionAvailable")
    @Expose
    private Boolean ExtensionAvailable;

    /**
    * 流量包是否支持退费
    */
    @SerializedName("RefundAvailable")
    @Expose
    private Boolean RefundAvailable;

    /**
    * 流量包生效区域
0：中国大陆
1：亚太一区
2：亚太二区
3：亚太三区
4：中东
5：北美
6：欧洲
7：南美
8：非洲
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private Long Region;

    /**
    * 流量包类型id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigId")
    @Expose
    private Long ConfigId;

    /**
    * 流量包当前续订模式，0 未续订、1到期续订、2用完续订、3到期或用完续订
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtensionMode")
    @Expose
    private Long ExtensionMode;

    /**
     * Get 流量包 Id 
     * @return Id 流量包 Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 流量包 Id
     * @param Id 流量包 Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 流量包类型 
     * @return Type 流量包类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 流量包类型
     * @param Type 流量包类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 流量包大小（单位为 Byte） 
     * @return Bytes 流量包大小（单位为 Byte）
     */
    public Long getBytes() {
        return this.Bytes;
    }

    /**
     * Set 流量包大小（单位为 Byte）
     * @param Bytes 流量包大小（单位为 Byte）
     */
    public void setBytes(Long Bytes) {
        this.Bytes = Bytes;
    }

    /**
     * Get 已消耗流量（单位为 Byte） 
     * @return BytesUsed 已消耗流量（单位为 Byte）
     */
    public Long getBytesUsed() {
        return this.BytesUsed;
    }

    /**
     * Set 已消耗流量（单位为 Byte）
     * @param BytesUsed 已消耗流量（单位为 Byte）
     */
    public void setBytesUsed(Long BytesUsed) {
        this.BytesUsed = BytesUsed;
    }

    /**
     * Get 流量包状态
enabled：已启用
expired：已过期
disabled：未启用 
     * @return Status 流量包状态
enabled：已启用
expired：已过期
disabled：未启用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 流量包状态
enabled：已启用
expired：已过期
disabled：未启用
     * @param Status 流量包状态
enabled：已启用
expired：已过期
disabled：未启用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 流量包发放时间 
     * @return CreateTime 流量包发放时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 流量包发放时间
     * @param CreateTime 流量包发放时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 流量包生效时间 
     * @return EnableTime 流量包生效时间
     */
    public String getEnableTime() {
        return this.EnableTime;
    }

    /**
     * Set 流量包生效时间
     * @param EnableTime 流量包生效时间
     */
    public void setEnableTime(String EnableTime) {
        this.EnableTime = EnableTime;
    }

    /**
     * Get 流量包过期时间 
     * @return ExpireTime 流量包过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 流量包过期时间
     * @param ExpireTime 流量包过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 流量包是否续订 
     * @return ContractExtension 流量包是否续订
     */
    public Boolean getContractExtension() {
        return this.ContractExtension;
    }

    /**
     * Set 流量包是否续订
     * @param ContractExtension 流量包是否续订
     */
    public void setContractExtension(Boolean ContractExtension) {
        this.ContractExtension = ContractExtension;
    }

    /**
     * Get 流量包是否自动续订 
     * @return AutoExtension 流量包是否自动续订
     */
    public Boolean getAutoExtension() {
        return this.AutoExtension;
    }

    /**
     * Set 流量包是否自动续订
     * @param AutoExtension 流量包是否自动续订
     */
    public void setAutoExtension(Boolean AutoExtension) {
        this.AutoExtension = AutoExtension;
    }

    /**
     * Get 流量包来源 
     * @return Channel 流量包来源
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 流量包来源
     * @param Channel 流量包来源
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 流量包生效区域，mainland或overseas 
     * @return Area 流量包生效区域，mainland或overseas
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 流量包生效区域，mainland或overseas
     * @param Area 流量包生效区域，mainland或overseas
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 流量包生命周期月数 
     * @return LifeTimeMonth 流量包生命周期月数
     */
    public Long getLifeTimeMonth() {
        return this.LifeTimeMonth;
    }

    /**
     * Set 流量包生命周期月数
     * @param LifeTimeMonth 流量包生命周期月数
     */
    public void setLifeTimeMonth(Long LifeTimeMonth) {
        this.LifeTimeMonth = LifeTimeMonth;
    }

    /**
     * Get 流量包是否支持续订 
     * @return ExtensionAvailable 流量包是否支持续订
     */
    public Boolean getExtensionAvailable() {
        return this.ExtensionAvailable;
    }

    /**
     * Set 流量包是否支持续订
     * @param ExtensionAvailable 流量包是否支持续订
     */
    public void setExtensionAvailable(Boolean ExtensionAvailable) {
        this.ExtensionAvailable = ExtensionAvailable;
    }

    /**
     * Get 流量包是否支持退费 
     * @return RefundAvailable 流量包是否支持退费
     */
    public Boolean getRefundAvailable() {
        return this.RefundAvailable;
    }

    /**
     * Set 流量包是否支持退费
     * @param RefundAvailable 流量包是否支持退费
     */
    public void setRefundAvailable(Boolean RefundAvailable) {
        this.RefundAvailable = RefundAvailable;
    }

    /**
     * Get 流量包生效区域
0：中国大陆
1：亚太一区
2：亚太二区
3：亚太三区
4：中东
5：北美
6：欧洲
7：南美
8：非洲
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 流量包生效区域
0：中国大陆
1：亚太一区
2：亚太二区
3：亚太三区
4：中东
5：北美
6：欧洲
7：南美
8：非洲
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegion() {
        return this.Region;
    }

    /**
     * Set 流量包生效区域
0：中国大陆
1：亚太一区
2：亚太二区
3：亚太三区
4：中东
5：北美
6：欧洲
7：南美
8：非洲
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 流量包生效区域
0：中国大陆
1：亚太一区
2：亚太二区
3：亚太三区
4：中东
5：北美
6：欧洲
7：南美
8：非洲
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(Long Region) {
        this.Region = Region;
    }

    /**
     * Get 流量包类型id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigId 流量包类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 流量包类型id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigId 流量包类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigId(Long ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 流量包当前续订模式，0 未续订、1到期续订、2用完续订、3到期或用完续订
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtensionMode 流量包当前续订模式，0 未续订、1到期续订、2用完续订、3到期或用完续订
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExtensionMode() {
        return this.ExtensionMode;
    }

    /**
     * Set 流量包当前续订模式，0 未续订、1到期续订、2用完续订、3到期或用完续订
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtensionMode 流量包当前续订模式，0 未续订、1到期续订、2用完续订、3到期或用完续订
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtensionMode(Long ExtensionMode) {
        this.ExtensionMode = ExtensionMode;
    }

    public TrafficPackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficPackage(TrafficPackage source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Bytes != null) {
            this.Bytes = new Long(source.Bytes);
        }
        if (source.BytesUsed != null) {
            this.BytesUsed = new Long(source.BytesUsed);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EnableTime != null) {
            this.EnableTime = new String(source.EnableTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ContractExtension != null) {
            this.ContractExtension = new Boolean(source.ContractExtension);
        }
        if (source.AutoExtension != null) {
            this.AutoExtension = new Boolean(source.AutoExtension);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.LifeTimeMonth != null) {
            this.LifeTimeMonth = new Long(source.LifeTimeMonth);
        }
        if (source.ExtensionAvailable != null) {
            this.ExtensionAvailable = new Boolean(source.ExtensionAvailable);
        }
        if (source.RefundAvailable != null) {
            this.RefundAvailable = new Boolean(source.RefundAvailable);
        }
        if (source.Region != null) {
            this.Region = new Long(source.Region);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new Long(source.ConfigId);
        }
        if (source.ExtensionMode != null) {
            this.ExtensionMode = new Long(source.ExtensionMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Bytes", this.Bytes);
        this.setParamSimple(map, prefix + "BytesUsed", this.BytesUsed);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EnableTime", this.EnableTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ContractExtension", this.ContractExtension);
        this.setParamSimple(map, prefix + "AutoExtension", this.AutoExtension);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LifeTimeMonth", this.LifeTimeMonth);
        this.setParamSimple(map, prefix + "ExtensionAvailable", this.ExtensionAvailable);
        this.setParamSimple(map, prefix + "RefundAvailable", this.RefundAvailable);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "ExtensionMode", this.ExtensionMode);

    }
}

