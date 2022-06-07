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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataConfig extends AbstractModel{

    /**
    * 映射路径
    */
    @SerializedName("MappingPath")
    @Expose
    private String MappingPath;

    /**
    * DATASET、COS、CFS、HDFS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 来自数据集的数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSetSource")
    @Expose
    private DataSetConfig DataSetSource;

    /**
    * 来自cos的数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("COSSource")
    @Expose
    private CosPathInfo COSSource;

    /**
    * 来自CFS的数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFSSource")
    @Expose
    private CFSConfig CFSSource;

    /**
    * 来自HDFS的数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HDFSSource")
    @Expose
    private HDFSConfig HDFSSource;

    /**
     * Get 映射路径 
     * @return MappingPath 映射路径
     */
    public String getMappingPath() {
        return this.MappingPath;
    }

    /**
     * Set 映射路径
     * @param MappingPath 映射路径
     */
    public void setMappingPath(String MappingPath) {
        this.MappingPath = MappingPath;
    }

    /**
     * Get DATASET、COS、CFS、HDFS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceType DATASET、COS、CFS、HDFS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set DATASET、COS、CFS、HDFS
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceType DATASET、COS、CFS、HDFS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get 来自数据集的数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSetSource 来自数据集的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataSetConfig getDataSetSource() {
        return this.DataSetSource;
    }

    /**
     * Set 来自数据集的数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSetSource 来自数据集的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSetSource(DataSetConfig DataSetSource) {
        this.DataSetSource = DataSetSource;
    }

    /**
     * Get 来自cos的数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return COSSource 来自cos的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosPathInfo getCOSSource() {
        return this.COSSource;
    }

    /**
     * Set 来自cos的数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param COSSource 来自cos的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCOSSource(CosPathInfo COSSource) {
        this.COSSource = COSSource;
    }

    /**
     * Get 来自CFS的数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFSSource 来自CFS的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CFSConfig getCFSSource() {
        return this.CFSSource;
    }

    /**
     * Set 来自CFS的数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFSSource 来自CFS的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFSSource(CFSConfig CFSSource) {
        this.CFSSource = CFSSource;
    }

    /**
     * Get 来自HDFS的数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HDFSSource 来自HDFS的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HDFSConfig getHDFSSource() {
        return this.HDFSSource;
    }

    /**
     * Set 来自HDFS的数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param HDFSSource 来自HDFS的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHDFSSource(HDFSConfig HDFSSource) {
        this.HDFSSource = HDFSSource;
    }

    public DataConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataConfig(DataConfig source) {
        if (source.MappingPath != null) {
            this.MappingPath = new String(source.MappingPath);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.DataSetSource != null) {
            this.DataSetSource = new DataSetConfig(source.DataSetSource);
        }
        if (source.COSSource != null) {
            this.COSSource = new CosPathInfo(source.COSSource);
        }
        if (source.CFSSource != null) {
            this.CFSSource = new CFSConfig(source.CFSSource);
        }
        if (source.HDFSSource != null) {
            this.HDFSSource = new HDFSConfig(source.HDFSSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MappingPath", this.MappingPath);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamObj(map, prefix + "DataSetSource.", this.DataSetSource);
        this.setParamObj(map, prefix + "COSSource.", this.COSSource);
        this.setParamObj(map, prefix + "CFSSource.", this.CFSSource);
        this.setParamObj(map, prefix + "HDFSSource.", this.HDFSSource);

    }
}

