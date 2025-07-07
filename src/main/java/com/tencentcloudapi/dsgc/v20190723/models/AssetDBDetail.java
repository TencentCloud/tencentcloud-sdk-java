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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetDBDetail extends AbstractModel {

    /**
    * 数据源id
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 数据库名称
    */
    @SerializedName("DdName")
    @Expose
    private String DdName;

    /**
    * 数据库类型
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * 表的数量
    */
    @SerializedName("TableNums")
    @Expose
    private Long TableNums;

    /**
    * 敏感表数量
    */
    @SerializedName("SensitiveTableNums")
    @Expose
    private Long SensitiveTableNums;

    /**
    * 字段的数量
    */
    @SerializedName("FieldNums")
    @Expose
    private Long FieldNums;

    /**
    * 敏感字段的数量
    */
    @SerializedName("SensitiveFieldNums")
    @Expose
    private Long SensitiveFieldNums;

    /**
    * 敏感数据分布
    */
    @SerializedName("DistributionData")
    @Expose
    private Note [] DistributionData;

    /**
     * Get 数据源id 
     * @return DataSourceId 数据源id
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源id
     * @param DataSourceId 数据源id
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 数据库名称 
     * @return DdName 数据库名称
     */
    public String getDdName() {
        return this.DdName;
    }

    /**
     * Set 数据库名称
     * @param DdName 数据库名称
     */
    public void setDdName(String DdName) {
        this.DdName = DdName;
    }

    /**
     * Get 数据库类型 
     * @return DataType 数据库类型
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据库类型
     * @param DataType 数据库类型
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get 表的数量 
     * @return TableNums 表的数量
     */
    public Long getTableNums() {
        return this.TableNums;
    }

    /**
     * Set 表的数量
     * @param TableNums 表的数量
     */
    public void setTableNums(Long TableNums) {
        this.TableNums = TableNums;
    }

    /**
     * Get 敏感表数量 
     * @return SensitiveTableNums 敏感表数量
     */
    public Long getSensitiveTableNums() {
        return this.SensitiveTableNums;
    }

    /**
     * Set 敏感表数量
     * @param SensitiveTableNums 敏感表数量
     */
    public void setSensitiveTableNums(Long SensitiveTableNums) {
        this.SensitiveTableNums = SensitiveTableNums;
    }

    /**
     * Get 字段的数量 
     * @return FieldNums 字段的数量
     */
    public Long getFieldNums() {
        return this.FieldNums;
    }

    /**
     * Set 字段的数量
     * @param FieldNums 字段的数量
     */
    public void setFieldNums(Long FieldNums) {
        this.FieldNums = FieldNums;
    }

    /**
     * Get 敏感字段的数量 
     * @return SensitiveFieldNums 敏感字段的数量
     */
    public Long getSensitiveFieldNums() {
        return this.SensitiveFieldNums;
    }

    /**
     * Set 敏感字段的数量
     * @param SensitiveFieldNums 敏感字段的数量
     */
    public void setSensitiveFieldNums(Long SensitiveFieldNums) {
        this.SensitiveFieldNums = SensitiveFieldNums;
    }

    /**
     * Get 敏感数据分布 
     * @return DistributionData 敏感数据分布
     */
    public Note [] getDistributionData() {
        return this.DistributionData;
    }

    /**
     * Set 敏感数据分布
     * @param DistributionData 敏感数据分布
     */
    public void setDistributionData(Note [] DistributionData) {
        this.DistributionData = DistributionData;
    }

    public AssetDBDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetDBDetail(AssetDBDetail source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.DdName != null) {
            this.DdName = new String(source.DdName);
        }
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
        if (source.TableNums != null) {
            this.TableNums = new Long(source.TableNums);
        }
        if (source.SensitiveTableNums != null) {
            this.SensitiveTableNums = new Long(source.SensitiveTableNums);
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
        this.setParamSimple(map, prefix + "TableNums", this.TableNums);
        this.setParamSimple(map, prefix + "SensitiveTableNums", this.SensitiveTableNums);
        this.setParamSimple(map, prefix + "FieldNums", this.FieldNums);
        this.setParamSimple(map, prefix + "SensitiveFieldNums", this.SensitiveFieldNums);
        this.setParamArrayObj(map, prefix + "DistributionData.", this.DistributionData);

    }
}

