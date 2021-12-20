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

public class AddRecordBatch extends AbstractModel{

    /**
    * 记录类型, 详见 DescribeRecordType 接口。
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 记录值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 子域名(主机记录)，默认为@。
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 解析记录的线路，详见 DescribeRecordLineList 接口，RecordLine和RecordLineId都未填时，默认为「默认」线路。
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * 解析记录的线路 ID，RecordLine和RecordLineId都有时，系统优先取 RecordLineId。
    */
    @SerializedName("RecordLineId")
    @Expose
    private String RecordLineId;

    /**
    * 记录权重值(暂未支持)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 记录的 MX 记录值，非 MX 记录类型，默认为 0，MX记录则必选。
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
    * 记录的 TTL 值，默认600。
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * 记录状态(暂未支持)。0表示禁用，1表示启用。默认启用。
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * 记录备注(暂未支持)。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
     * Get 子域名(主机记录)，默认为@。 
     * @return SubDomain 子域名(主机记录)，默认为@。
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 子域名(主机记录)，默认为@。
     * @param SubDomain 子域名(主机记录)，默认为@。
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 解析记录的线路，详见 DescribeRecordLineList 接口，RecordLine和RecordLineId都未填时，默认为「默认」线路。 
     * @return RecordLine 解析记录的线路，详见 DescribeRecordLineList 接口，RecordLine和RecordLineId都未填时，默认为「默认」线路。
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set 解析记录的线路，详见 DescribeRecordLineList 接口，RecordLine和RecordLineId都未填时，默认为「默认」线路。
     * @param RecordLine 解析记录的线路，详见 DescribeRecordLineList 接口，RecordLine和RecordLineId都未填时，默认为「默认」线路。
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get 解析记录的线路 ID，RecordLine和RecordLineId都有时，系统优先取 RecordLineId。 
     * @return RecordLineId 解析记录的线路 ID，RecordLine和RecordLineId都有时，系统优先取 RecordLineId。
     */
    public String getRecordLineId() {
        return this.RecordLineId;
    }

    /**
     * Set 解析记录的线路 ID，RecordLine和RecordLineId都有时，系统优先取 RecordLineId。
     * @param RecordLineId 解析记录的线路 ID，RecordLine和RecordLineId都有时，系统优先取 RecordLineId。
     */
    public void setRecordLineId(String RecordLineId) {
        this.RecordLineId = RecordLineId;
    }

    /**
     * Get 记录权重值(暂未支持)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 记录权重值(暂未支持)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 记录权重值(暂未支持)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 记录权重值(暂未支持)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 记录的 MX 记录值，非 MX 记录类型，默认为 0，MX记录则必选。 
     * @return MX 记录的 MX 记录值，非 MX 记录类型，默认为 0，MX记录则必选。
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set 记录的 MX 记录值，非 MX 记录类型，默认为 0，MX记录则必选。
     * @param MX 记录的 MX 记录值，非 MX 记录类型，默认为 0，MX记录则必选。
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    /**
     * Get 记录的 TTL 值，默认600。 
     * @return TTL 记录的 TTL 值，默认600。
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 记录的 TTL 值，默认600。
     * @param TTL 记录的 TTL 值，默认600。
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get 记录状态(暂未支持)。0表示禁用，1表示启用。默认启用。 
     * @return Enabled 记录状态(暂未支持)。0表示禁用，1表示启用。默认启用。
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 记录状态(暂未支持)。0表示禁用，1表示启用。默认启用。
     * @param Enabled 记录状态(暂未支持)。0表示禁用，1表示启用。默认启用。
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 记录备注(暂未支持)。 
     * @return Remark 记录备注(暂未支持)。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 记录备注(暂未支持)。
     * @param Remark 记录备注(暂未支持)。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public AddRecordBatch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddRecordBatch(AddRecordBatch source) {
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.RecordLine != null) {
            this.RecordLine = new String(source.RecordLine);
        }
        if (source.RecordLineId != null) {
            this.RecordLineId = new String(source.RecordLineId);
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
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordLine", this.RecordLine);
        this.setParamSimple(map, prefix + "RecordLineId", this.RecordLineId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "MX", this.MX);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

