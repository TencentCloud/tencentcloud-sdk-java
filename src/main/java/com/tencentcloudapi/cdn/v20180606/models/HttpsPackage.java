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

public class HttpsPackage extends AbstractModel{

    /**
    * HTTPS请求包 Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * HTTPS请求包类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * HTTPS请求包大小（单位为：次）
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 已消耗HTTPS请求包（单位为：次）
    */
    @SerializedName("SizeUsed")
    @Expose
    private Long SizeUsed;

    /**
    * HTTPS请求包状态
enabled：已启用
expired：已过期
disabled：未启用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * HTTPS请求包发放时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * HTTPS请求包生效时间
    */
    @SerializedName("EnableTime")
    @Expose
    private String EnableTime;

    /**
    * HTTPS请求包过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * HTTPS请求包来源
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * HTTPS请求包生命周期月数
    */
    @SerializedName("LifeTimeMonth")
    @Expose
    private Long LifeTimeMonth;

    /**
    * HTTPS请求包是否支持退费
    */
    @SerializedName("RefundAvailable")
    @Expose
    private Boolean RefundAvailable;

    /**
    * HTTPS请求包类型id
    */
    @SerializedName("ConfigId")
    @Expose
    private Long ConfigId;

    /**
    * HTTPS请求包实际生效时间
    */
    @SerializedName("TrueEnableTime")
    @Expose
    private String TrueEnableTime;

    /**
    * HTTPS请求包实际过期时间
    */
    @SerializedName("TrueExpireTime")
    @Expose
    private String TrueExpireTime;

    /**
    * HTTPS请求包生效区域 
global：全球
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * HTTPS请求包是否续订
    */
    @SerializedName("ContractExtension")
    @Expose
    private Boolean ContractExtension;

    /**
    * HTTPS请求包是否支持续订
    */
    @SerializedName("ExtensionAvailable")
    @Expose
    private Boolean ExtensionAvailable;

    /**
    * HTTPS请求包当前续订模式
0：未续订
1：到期续订
2：用完续订
3：到期或用完续订
    */
    @SerializedName("ExtensionMode")
    @Expose
    private Long ExtensionMode;

    /**
    * HTTPS请求包是否自动续订
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoExtension")
    @Expose
    private Boolean AutoExtension;

    /**
     * Get HTTPS请求包 Id 
     * @return Id HTTPS请求包 Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set HTTPS请求包 Id
     * @param Id HTTPS请求包 Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get HTTPS请求包类型 
     * @return Type HTTPS请求包类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set HTTPS请求包类型
     * @param Type HTTPS请求包类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get HTTPS请求包大小（单位为：次） 
     * @return Size HTTPS请求包大小（单位为：次）
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set HTTPS请求包大小（单位为：次）
     * @param Size HTTPS请求包大小（单位为：次）
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 已消耗HTTPS请求包（单位为：次） 
     * @return SizeUsed 已消耗HTTPS请求包（单位为：次）
     */
    public Long getSizeUsed() {
        return this.SizeUsed;
    }

    /**
     * Set 已消耗HTTPS请求包（单位为：次）
     * @param SizeUsed 已消耗HTTPS请求包（单位为：次）
     */
    public void setSizeUsed(Long SizeUsed) {
        this.SizeUsed = SizeUsed;
    }

    /**
     * Get HTTPS请求包状态
enabled：已启用
expired：已过期
disabled：未启用 
     * @return Status HTTPS请求包状态
enabled：已启用
expired：已过期
disabled：未启用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set HTTPS请求包状态
enabled：已启用
expired：已过期
disabled：未启用
     * @param Status HTTPS请求包状态
enabled：已启用
expired：已过期
disabled：未启用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get HTTPS请求包发放时间 
     * @return CreateTime HTTPS请求包发放时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set HTTPS请求包发放时间
     * @param CreateTime HTTPS请求包发放时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get HTTPS请求包生效时间 
     * @return EnableTime HTTPS请求包生效时间
     */
    public String getEnableTime() {
        return this.EnableTime;
    }

    /**
     * Set HTTPS请求包生效时间
     * @param EnableTime HTTPS请求包生效时间
     */
    public void setEnableTime(String EnableTime) {
        this.EnableTime = EnableTime;
    }

    /**
     * Get HTTPS请求包过期时间 
     * @return ExpireTime HTTPS请求包过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set HTTPS请求包过期时间
     * @param ExpireTime HTTPS请求包过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get HTTPS请求包来源 
     * @return Channel HTTPS请求包来源
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set HTTPS请求包来源
     * @param Channel HTTPS请求包来源
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get HTTPS请求包生命周期月数 
     * @return LifeTimeMonth HTTPS请求包生命周期月数
     */
    public Long getLifeTimeMonth() {
        return this.LifeTimeMonth;
    }

    /**
     * Set HTTPS请求包生命周期月数
     * @param LifeTimeMonth HTTPS请求包生命周期月数
     */
    public void setLifeTimeMonth(Long LifeTimeMonth) {
        this.LifeTimeMonth = LifeTimeMonth;
    }

    /**
     * Get HTTPS请求包是否支持退费 
     * @return RefundAvailable HTTPS请求包是否支持退费
     */
    public Boolean getRefundAvailable() {
        return this.RefundAvailable;
    }

    /**
     * Set HTTPS请求包是否支持退费
     * @param RefundAvailable HTTPS请求包是否支持退费
     */
    public void setRefundAvailable(Boolean RefundAvailable) {
        this.RefundAvailable = RefundAvailable;
    }

    /**
     * Get HTTPS请求包类型id 
     * @return ConfigId HTTPS请求包类型id
     */
    public Long getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set HTTPS请求包类型id
     * @param ConfigId HTTPS请求包类型id
     */
    public void setConfigId(Long ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get HTTPS请求包实际生效时间 
     * @return TrueEnableTime HTTPS请求包实际生效时间
     */
    public String getTrueEnableTime() {
        return this.TrueEnableTime;
    }

    /**
     * Set HTTPS请求包实际生效时间
     * @param TrueEnableTime HTTPS请求包实际生效时间
     */
    public void setTrueEnableTime(String TrueEnableTime) {
        this.TrueEnableTime = TrueEnableTime;
    }

    /**
     * Get HTTPS请求包实际过期时间 
     * @return TrueExpireTime HTTPS请求包实际过期时间
     */
    public String getTrueExpireTime() {
        return this.TrueExpireTime;
    }

    /**
     * Set HTTPS请求包实际过期时间
     * @param TrueExpireTime HTTPS请求包实际过期时间
     */
    public void setTrueExpireTime(String TrueExpireTime) {
        this.TrueExpireTime = TrueExpireTime;
    }

    /**
     * Get HTTPS请求包生效区域 
global：全球 
     * @return Area HTTPS请求包生效区域 
global：全球
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set HTTPS请求包生效区域 
global：全球
     * @param Area HTTPS请求包生效区域 
global：全球
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get HTTPS请求包是否续订 
     * @return ContractExtension HTTPS请求包是否续订
     */
    public Boolean getContractExtension() {
        return this.ContractExtension;
    }

    /**
     * Set HTTPS请求包是否续订
     * @param ContractExtension HTTPS请求包是否续订
     */
    public void setContractExtension(Boolean ContractExtension) {
        this.ContractExtension = ContractExtension;
    }

    /**
     * Get HTTPS请求包是否支持续订 
     * @return ExtensionAvailable HTTPS请求包是否支持续订
     */
    public Boolean getExtensionAvailable() {
        return this.ExtensionAvailable;
    }

    /**
     * Set HTTPS请求包是否支持续订
     * @param ExtensionAvailable HTTPS请求包是否支持续订
     */
    public void setExtensionAvailable(Boolean ExtensionAvailable) {
        this.ExtensionAvailable = ExtensionAvailable;
    }

    /**
     * Get HTTPS请求包当前续订模式
0：未续订
1：到期续订
2：用完续订
3：到期或用完续订 
     * @return ExtensionMode HTTPS请求包当前续订模式
0：未续订
1：到期续订
2：用完续订
3：到期或用完续订
     */
    public Long getExtensionMode() {
        return this.ExtensionMode;
    }

    /**
     * Set HTTPS请求包当前续订模式
0：未续订
1：到期续订
2：用完续订
3：到期或用完续订
     * @param ExtensionMode HTTPS请求包当前续订模式
0：未续订
1：到期续订
2：用完续订
3：到期或用完续订
     */
    public void setExtensionMode(Long ExtensionMode) {
        this.ExtensionMode = ExtensionMode;
    }

    /**
     * Get HTTPS请求包是否自动续订
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoExtension HTTPS请求包是否自动续订
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoExtension() {
        return this.AutoExtension;
    }

    /**
     * Set HTTPS请求包是否自动续订
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoExtension HTTPS请求包是否自动续订
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoExtension(Boolean AutoExtension) {
        this.AutoExtension = AutoExtension;
    }

    public HttpsPackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpsPackage(HttpsPackage source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.SizeUsed != null) {
            this.SizeUsed = new Long(source.SizeUsed);
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
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.LifeTimeMonth != null) {
            this.LifeTimeMonth = new Long(source.LifeTimeMonth);
        }
        if (source.RefundAvailable != null) {
            this.RefundAvailable = new Boolean(source.RefundAvailable);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new Long(source.ConfigId);
        }
        if (source.TrueEnableTime != null) {
            this.TrueEnableTime = new String(source.TrueEnableTime);
        }
        if (source.TrueExpireTime != null) {
            this.TrueExpireTime = new String(source.TrueExpireTime);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.ContractExtension != null) {
            this.ContractExtension = new Boolean(source.ContractExtension);
        }
        if (source.ExtensionAvailable != null) {
            this.ExtensionAvailable = new Boolean(source.ExtensionAvailable);
        }
        if (source.ExtensionMode != null) {
            this.ExtensionMode = new Long(source.ExtensionMode);
        }
        if (source.AutoExtension != null) {
            this.AutoExtension = new Boolean(source.AutoExtension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "SizeUsed", this.SizeUsed);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EnableTime", this.EnableTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "LifeTimeMonth", this.LifeTimeMonth);
        this.setParamSimple(map, prefix + "RefundAvailable", this.RefundAvailable);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "TrueEnableTime", this.TrueEnableTime);
        this.setParamSimple(map, prefix + "TrueExpireTime", this.TrueExpireTime);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "ContractExtension", this.ContractExtension);
        this.setParamSimple(map, prefix + "ExtensionAvailable", this.ExtensionAvailable);
        this.setParamSimple(map, prefix + "ExtensionMode", this.ExtensionMode);
        this.setParamSimple(map, prefix + "AutoExtension", this.AutoExtension);

    }
}

