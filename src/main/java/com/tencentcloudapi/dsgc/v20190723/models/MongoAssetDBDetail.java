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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MongoAssetDBDetail extends AbstractModel {

    /**
    * 数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdName")
    @Expose
    private String DdName;

    /**
    * 数据库类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * 集合的数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColNums")
    @Expose
    private Long ColNums;

    /**
    * 敏感集合数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveColNums")
    @Expose
    private Long SensitiveColNums;

    /**
    * 字段的数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldNums")
    @Expose
    private Long FieldNums;

    /**
    * 敏感字段的数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveFieldNums")
    @Expose
    private Long SensitiveFieldNums;

    /**
    * 敏感数据分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DistributionData")
    @Expose
    private Note [] DistributionData;

    /**
     * Get 数据源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDdName() {
        return this.DdName;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdName(String DdName) {
        this.DdName = DdName;
    }

    /**
     * Get 数据库类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataType 数据库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据库类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataType 数据库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get 集合的数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColNums 集合的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColNums() {
        return this.ColNums;
    }

    /**
     * Set 集合的数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColNums 集合的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColNums(Long ColNums) {
        this.ColNums = ColNums;
    }

    /**
     * Get 敏感集合数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveColNums 敏感集合数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveColNums() {
        return this.SensitiveColNums;
    }

    /**
     * Set 敏感集合数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveColNums 敏感集合数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveColNums(Long SensitiveColNums) {
        this.SensitiveColNums = SensitiveColNums;
    }

    /**
     * Get 字段的数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldNums 字段的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFieldNums() {
        return this.FieldNums;
    }

    /**
     * Set 字段的数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldNums 字段的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldNums(Long FieldNums) {
        this.FieldNums = FieldNums;
    }

    /**
     * Get 敏感字段的数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveFieldNums 敏感字段的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveFieldNums() {
        return this.SensitiveFieldNums;
    }

    /**
     * Set 敏感字段的数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveFieldNums 敏感字段的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveFieldNums(Long SensitiveFieldNums) {
        this.SensitiveFieldNums = SensitiveFieldNums;
    }

    /**
     * Get 敏感数据分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DistributionData 敏感数据分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Note [] getDistributionData() {
        return this.DistributionData;
    }

    /**
     * Set 敏感数据分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param DistributionData 敏感数据分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDistributionData(Note [] DistributionData) {
        this.DistributionData = DistributionData;
    }

    public MongoAssetDBDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MongoAssetDBDetail(MongoAssetDBDetail source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.DdName != null) {
            this.DdName = new String(source.DdName);
        }
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
        if (source.ColNums != null) {
            this.ColNums = new Long(source.ColNums);
        }
        if (source.SensitiveColNums != null) {
            this.SensitiveColNums = new Long(source.SensitiveColNums);
        }
        if (source.FieldNums != null) {
            this.FieldNums = new Long(source.FieldNums);
        }
        if (source.SensitiveFieldNums != null) {
            this.SensitiveFieldNums = new Long(source.SensitiveFieldNums);
        }
        if (source.DistributionData != null) {
            this.DistributionData = new Note[source.DistributionData.length];
            for (int i = 0; i < source.DistributionData.length; i++) {
                this.DistributionData[i] = new Note(source.DistributionData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "DdName", this.DdName);
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "ColNums", this.ColNums);
        this.setParamSimple(map, prefix + "SensitiveColNums", this.SensitiveColNums);
        this.setParamSimple(map, prefix + "FieldNums", this.FieldNums);
        this.setParamSimple(map, prefix + "SensitiveFieldNums", this.SensitiveFieldNums);
        this.setParamArrayObj(map, prefix + "DistributionData.", this.DistributionData);

    }
}

