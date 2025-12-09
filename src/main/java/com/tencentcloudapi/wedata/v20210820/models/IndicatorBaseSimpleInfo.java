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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndicatorBaseSimpleInfo extends AbstractModel {

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MeasureUnit")
    @Expose
    private Long MeasureUnit;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndicatorCode")
    @Expose
    private String IndicatorCode;

    /**
    * 业务负责人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizOwnerName")
    @Expose
    private String BizOwnerName;

    /**
    * 技术服务站名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TechOwnerName")
    @Expose
    private String TechOwnerName;

    /**
    * 业务口径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizCaliber")
    @Expose
    private String BizCaliber;

    /**
    * 指标类型（1-原子指标 2-衍生指标 3-复合指标）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndicatorType")
    @Expose
    private Long IndicatorType;

    /**
     * Get ID 
     * @return Id ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MeasureUnit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMeasureUnit() {
        return this.MeasureUnit;
    }

    /**
     * Set 单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param MeasureUnit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMeasureUnit(Long MeasureUnit) {
        this.MeasureUnit = MeasureUnit;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndicatorCode 编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndicatorCode() {
        return this.IndicatorCode;
    }

    /**
     * Set 编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndicatorCode 编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndicatorCode(String IndicatorCode) {
        this.IndicatorCode = IndicatorCode;
    }

    /**
     * Get 业务负责人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizOwnerName 业务负责人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizOwnerName() {
        return this.BizOwnerName;
    }

    /**
     * Set 业务负责人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizOwnerName 业务负责人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizOwnerName(String BizOwnerName) {
        this.BizOwnerName = BizOwnerName;
    }

    /**
     * Get 技术服务站名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TechOwnerName 技术服务站名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTechOwnerName() {
        return this.TechOwnerName;
    }

    /**
     * Set 技术服务站名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TechOwnerName 技术服务站名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTechOwnerName(String TechOwnerName) {
        this.TechOwnerName = TechOwnerName;
    }

    /**
     * Get 业务口径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizCaliber 业务口径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizCaliber() {
        return this.BizCaliber;
    }

    /**
     * Set 业务口径
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizCaliber 业务口径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizCaliber(String BizCaliber) {
        this.BizCaliber = BizCaliber;
    }

    /**
     * Get 指标类型（1-原子指标 2-衍生指标 3-复合指标）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndicatorType 指标类型（1-原子指标 2-衍生指标 3-复合指标）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndicatorType() {
        return this.IndicatorType;
    }

    /**
     * Set 指标类型（1-原子指标 2-衍生指标 3-复合指标）
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndicatorType 指标类型（1-原子指标 2-衍生指标 3-复合指标）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndicatorType(Long IndicatorType) {
        this.IndicatorType = IndicatorType;
    }

    public IndicatorBaseSimpleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndicatorBaseSimpleInfo(IndicatorBaseSimpleInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MeasureUnit != null) {
            this.MeasureUnit = new Long(source.MeasureUnit);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IndicatorCode != null) {
            this.IndicatorCode = new String(source.IndicatorCode);
        }
        if (source.BizOwnerName != null) {
            this.BizOwnerName = new String(source.BizOwnerName);
        }
        if (source.TechOwnerName != null) {
            this.TechOwnerName = new String(source.TechOwnerName);
        }
        if (source.BizCaliber != null) {
            this.BizCaliber = new String(source.BizCaliber);
        }
        if (source.IndicatorType != null) {
            this.IndicatorType = new Long(source.IndicatorType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MeasureUnit", this.MeasureUnit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IndicatorCode", this.IndicatorCode);
        this.setParamSimple(map, prefix + "BizOwnerName", this.BizOwnerName);
        this.setParamSimple(map, prefix + "TechOwnerName", this.TechOwnerName);
        this.setParamSimple(map, prefix + "BizCaliber", this.BizCaliber);
        this.setParamSimple(map, prefix + "IndicatorType", this.IndicatorType);

    }
}

