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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordInfo extends AbstractModel{

    /**
    * 记录 ID 。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 子域名(主机记录)。
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 记录类型, 详见 DescribeRecordType 接口。
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 解析记录的线路，详见 DescribeRecordLineList 接口。
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * 解析记录的线路 ID ，详见 DescribeRecordLineList 接口。
    */
    @SerializedName("RecordLineId")
    @Expose
    private String RecordLineId;

    /**
    * 记录值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 记录权重值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 记录的 MX 记录值，非 MX 记录类型，默认为 0。
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
    * 记录的 TTL 值。
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * 记录状态。0表示禁用，1表示启用。
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * 该记录的 D 监控状态。
"Ok" : 服务器正常。
"Warn" : 该记录有报警, 服务器返回 4XX。
"Down" : 服务器宕机。
"" : 该记录未开启 D 监控。
    */
    @SerializedName("MonitorStatus")
    @Expose
    private String MonitorStatus;

    /**
    * 记录的备注。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 记录最后更新时间。
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * 域名 ID 。
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
     * Get 记录 ID 。 
     * @return Id 记录 ID 。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 记录 ID 。
     * @param Id 记录 ID 。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 子域名(主机记录)。 
     * @return SubDomain 子域名(主机记录)。
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 子域名(主机记录)。
     * @param SubDomain 子域名(主机记录)。
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 记录类型, 详见 DescribeRecordType 接口。 
     * @return RecordType 记录类型, 详见 DescribeRecordType 接口。
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 记录类型, 详见 DescribeRecordType 接口。
     * @param RecordType 记录类型, 详见 DescribeRecordType 接口。
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 解析记录的线路，详见 DescribeRecordLineList 接口。 
     * @return RecordLine 解析记录的线路，详见 DescribeRecordLineList 接口。
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set 解析记录的线路，详见 DescribeRecordLineList 接口。
     * @param RecordLine 解析记录的线路，详见 DescribeRecordLineList 接口。
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get 解析记录的线路 ID ，详见 DescribeRecordLineList 接口。 
     * @return RecordLineId 解析记录的线路 ID ，详见 DescribeRecordLineList 接口。
     */
    public String getRecordLineId() {
        return this.RecordLineId;
    }

    /**
     * Set 解析记录的线路 ID ，详见 DescribeRecordLineList 接口。
     * @param RecordLineId 解析记录的线路 ID ，详见 DescribeRecordLineList 接口。
     */
    public void setRecordLineId(String RecordLineId) {
        this.RecordLineId = RecordLineId;
    }

    /**
     * Get 记录值。 
     * @return Value 记录值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 记录值。
     * @param Value 记录值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 记录权重值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 记录权重值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 记录权重值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 记录权重值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 记录的 MX 记录值，非 MX 记录类型，默认为 0。 
     * @return MX 记录的 MX 记录值，非 MX 记录类型，默认为 0。
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set 记录的 MX 记录值，非 MX 记录类型，默认为 0。
     * @param MX 记录的 MX 记录值，非 MX 记录类型，默认为 0。
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    /**
     * Get 记录的 TTL 值。 
     * @return TTL 记录的 TTL 值。
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 记录的 TTL 值。
     * @param TTL 记录的 TTL 值。
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get 记录状态。0表示禁用，1表示启用。 
     * @return Enabled 记录状态。0表示禁用，1表示启用。
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 记录状态。0表示禁用，1表示启用。
     * @param Enabled 记录状态。0表示禁用，1表示启用。
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 该记录的 D 监控状态。
"Ok" : 服务器正常。
"Warn" : 该记录有报警, 服务器返回 4XX。
"Down" : 服务器宕机。
"" : 该记录未开启 D 监控。 
     * @return MonitorStatus 该记录的 D 监控状态。
"Ok" : 服务器正常。
"Warn" : 该记录有报警, 服务器返回 4XX。
"Down" : 服务器宕机。
"" : 该记录未开启 D 监控。
     */
    public String getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 该记录的 D 监控状态。
"Ok" : 服务器正常。
"Warn" : 该记录有报警, 服务器返回 4XX。
"Down" : 服务器宕机。
"" : 该记录未开启 D 监控。
     * @param MonitorStatus 该记录的 D 监控状态。
"Ok" : 服务器正常。
"Warn" : 该记录有报警, 服务器返回 4XX。
"Down" : 服务器宕机。
"" : 该记录未开启 D 监控。
     */
    public void setMonitorStatus(String MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get 记录的备注。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 记录的备注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 记录的备注。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 记录的备注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 记录最后更新时间。 
     * @return UpdatedOn 记录最后更新时间。
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 记录最后更新时间。
     * @param UpdatedOn 记录最后更新时间。
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get 域名 ID 。 
     * @return DomainId 域名 ID 。
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名 ID 。
     * @param DomainId 域名 ID 。
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public RecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordInfo(RecordInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordLine != null) {
            this.RecordLine = new String(source.RecordLine);
        }
        if (source.RecordLineId != null) {
            this.RecordLineId = new String(source.RecordLineId);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.MX != null) {
            this.MX = new Long(source.MX);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Enabled != null) {
            this.Enabled = new Long(source.Enabled);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new String(source.MonitorStatus);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordLine", this.RecordLine);
        this.setParamSimple(map, prefix + "RecordLineId", this.RecordLineId);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "MX", this.MX);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

