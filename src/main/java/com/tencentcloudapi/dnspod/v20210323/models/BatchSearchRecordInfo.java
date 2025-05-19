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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchSearchRecordInfo extends AbstractModel {

    /**
    * 解析记录 ID
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * 解析线路
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 记录备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * TTL(秒)
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * 记录类型
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 记录是否启用
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * 权重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 记录分组 ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 子域名
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 解析值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * MX优先级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
     * Get 解析记录 ID 
     * @return RecordId 解析记录 ID
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 解析记录 ID
     * @param RecordId 解析记录 ID
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 解析线路 
     * @return Area 解析线路
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 解析线路
     * @param Area 解析线路
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 记录备注 
     * @return Remark 记录备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 记录备注
     * @param Remark 记录备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get TTL(秒) 
     * @return TTL TTL(秒)
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set TTL(秒)
     * @param TTL TTL(秒)
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get 记录类型 
     * @return RecordType 记录类型
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 记录类型
     * @param RecordType 记录类型
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 记录是否启用 
     * @return Enabled 记录是否启用
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 记录是否启用
     * @param Enabled 记录是否启用
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 权重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 记录分组 ID 
     * @return GroupId 记录分组 ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 记录分组 ID
     * @param GroupId 记录分组 ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 子域名 
     * @return SubDomain 子域名
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 子域名
     * @param SubDomain 子域名
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 解析值 
     * @return Value 解析值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 解析值
     * @param Value 解析值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get MX优先级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MX MX优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set MX优先级
注意：此字段可能返回 null，表示取不到有效值。
     * @param MX MX优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    public BatchSearchRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchSearchRecordInfo(BatchSearchRecordInfo source) {
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.Enabled != null) {
            this.Enabled = new Long(source.Enabled);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.MX != null) {
            this.MX = new Long(source.MX);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "MX", this.MX);

    }
}

