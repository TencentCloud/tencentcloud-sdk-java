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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataConfig extends AbstractModel {

    /**
    * <p>映射路径</p>
    */
    @SerializedName("MappingPath")
    @Expose
    private String MappingPath;

    /**
    * <p>存储用途<br>可选值为 BUILTIN_CODE, BUILTIN_DATA, BUILTIN_MODEL, USER_DATA, USER_CODE, USER_MODEL, OUTPUT, OTHER</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceUsage")
    @Expose
    private String DataSourceUsage;

    /**
    * <p>DATASET、COS、CFS、CFSTurbo、GooseFSx、HDFS、WEDATA_HDFS</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * <p>来自数据集的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSetSource")
    @Expose
    private DataSetConfig DataSetSource;

    /**
    * <p>来自cos的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("COSSource")
    @Expose
    private CosPathInfo COSSource;

    /**
    * <p>来自CFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFSSource")
    @Expose
    private CFSConfig CFSSource;

    /**
    * <p>来自HDFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HDFSSource")
    @Expose
    private HDFSConfig HDFSSource;

    /**
    * <p>配置GooseFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GooseFSSource")
    @Expose
    private GooseFS GooseFSSource;

    /**
    * <p>配置TurboFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFSTurboSource")
    @Expose
    private CFSTurbo CFSTurboSource;

    /**
    * <p>来自本地磁盘的信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalDiskSource")
    @Expose
    private LocalDisk LocalDiskSource;

    /**
    * <p>CBS配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CBSSource")
    @Expose
    private CBSConfig CBSSource;

    /**
    * <p>主机路径信息</p>
    */
    @SerializedName("HostPathSource")
    @Expose
    private HostPath HostPathSource;

    /**
    * <p>公有云数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicDataSource")
    @Expose
    private PublicDataSourceFS PublicDataSource;

    /**
     * Get <p>映射路径</p> 
     * @return MappingPath <p>映射路径</p>
     */
    public String getMappingPath() {
        return this.MappingPath;
    }

    /**
     * Set <p>映射路径</p>
     * @param MappingPath <p>映射路径</p>
     */
    public void setMappingPath(String MappingPath) {
        this.MappingPath = MappingPath;
    }

    /**
     * Get <p>存储用途<br>可选值为 BUILTIN_CODE, BUILTIN_DATA, BUILTIN_MODEL, USER_DATA, USER_CODE, USER_MODEL, OUTPUT, OTHER</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceUsage <p>存储用途<br>可选值为 BUILTIN_CODE, BUILTIN_DATA, BUILTIN_MODEL, USER_DATA, USER_CODE, USER_MODEL, OUTPUT, OTHER</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceUsage() {
        return this.DataSourceUsage;
    }

    /**
     * Set <p>存储用途<br>可选值为 BUILTIN_CODE, BUILTIN_DATA, BUILTIN_MODEL, USER_DATA, USER_CODE, USER_MODEL, OUTPUT, OTHER</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceUsage <p>存储用途<br>可选值为 BUILTIN_CODE, BUILTIN_DATA, BUILTIN_MODEL, USER_DATA, USER_CODE, USER_MODEL, OUTPUT, OTHER</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceUsage(String DataSourceUsage) {
        this.DataSourceUsage = DataSourceUsage;
    }

    /**
     * Get <p>DATASET、COS、CFS、CFSTurbo、GooseFSx、HDFS、WEDATA_HDFS</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceType <p>DATASET、COS、CFS、CFSTurbo、GooseFSx、HDFS、WEDATA_HDFS</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set <p>DATASET、COS、CFS、CFSTurbo、GooseFSx、HDFS、WEDATA_HDFS</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceType <p>DATASET、COS、CFS、CFSTurbo、GooseFSx、HDFS、WEDATA_HDFS</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get <p>来自数据集的数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSetSource <p>来自数据集的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataSetConfig getDataSetSource() {
        return this.DataSetSource;
    }

    /**
     * Set <p>来自数据集的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSetSource <p>来自数据集的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSetSource(DataSetConfig DataSetSource) {
        this.DataSetSource = DataSetSource;
    }

    /**
     * Get <p>来自cos的数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return COSSource <p>来自cos的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosPathInfo getCOSSource() {
        return this.COSSource;
    }

    /**
     * Set <p>来自cos的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param COSSource <p>来自cos的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCOSSource(CosPathInfo COSSource) {
        this.COSSource = COSSource;
    }

    /**
     * Get <p>来自CFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFSSource <p>来自CFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CFSConfig getCFSSource() {
        return this.CFSSource;
    }

    /**
     * Set <p>来自CFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFSSource <p>来自CFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFSSource(CFSConfig CFSSource) {
        this.CFSSource = CFSSource;
    }

    /**
     * Get <p>来自HDFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HDFSSource <p>来自HDFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HDFSConfig getHDFSSource() {
        return this.HDFSSource;
    }

    /**
     * Set <p>来自HDFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HDFSSource <p>来自HDFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHDFSSource(HDFSConfig HDFSSource) {
        this.HDFSSource = HDFSSource;
    }

    /**
     * Get <p>配置GooseFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GooseFSSource <p>配置GooseFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GooseFS getGooseFSSource() {
        return this.GooseFSSource;
    }

    /**
     * Set <p>配置GooseFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GooseFSSource <p>配置GooseFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGooseFSSource(GooseFS GooseFSSource) {
        this.GooseFSSource = GooseFSSource;
    }

    /**
     * Get <p>配置TurboFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFSTurboSource <p>配置TurboFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CFSTurbo getCFSTurboSource() {
        return this.CFSTurboSource;
    }

    /**
     * Set <p>配置TurboFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFSTurboSource <p>配置TurboFS的数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFSTurboSource(CFSTurbo CFSTurboSource) {
        this.CFSTurboSource = CFSTurboSource;
    }

    /**
     * Get <p>来自本地磁盘的信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalDiskSource <p>来自本地磁盘的信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LocalDisk getLocalDiskSource() {
        return this.LocalDiskSource;
    }

    /**
     * Set <p>来自本地磁盘的信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalDiskSource <p>来自本地磁盘的信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalDiskSource(LocalDisk LocalDiskSource) {
        this.LocalDiskSource = LocalDiskSource;
    }

    /**
     * Get <p>CBS配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CBSSource <p>CBS配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CBSConfig getCBSSource() {
        return this.CBSSource;
    }

    /**
     * Set <p>CBS配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CBSSource <p>CBS配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCBSSource(CBSConfig CBSSource) {
        this.CBSSource = CBSSource;
    }

    /**
     * Get <p>主机路径信息</p> 
     * @return HostPathSource <p>主机路径信息</p>
     */
    public HostPath getHostPathSource() {
        return this.HostPathSource;
    }

    /**
     * Set <p>主机路径信息</p>
     * @param HostPathSource <p>主机路径信息</p>
     */
    public void setHostPathSource(HostPath HostPathSource) {
        this.HostPathSource = HostPathSource;
    }

    /**
     * Get <p>公有云数据源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicDataSource <p>公有云数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PublicDataSourceFS getPublicDataSource() {
        return this.PublicDataSource;
    }

    /**
     * Set <p>公有云数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicDataSource <p>公有云数据源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicDataSource(PublicDataSourceFS PublicDataSource) {
        this.PublicDataSource = PublicDataSource;
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
        if (source.DataSourceUsage != null) {
            this.DataSourceUsage = new String(source.DataSourceUsage);
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
        if (source.GooseFSSource != null) {
            this.GooseFSSource = new GooseFS(source.GooseFSSource);
        }
        if (source.CFSTurboSource != null) {
            this.CFSTurboSource = new CFSTurbo(source.CFSTurboSource);
        }
        if (source.LocalDiskSource != null) {
            this.LocalDiskSource = new LocalDisk(source.LocalDiskSource);
        }
        if (source.CBSSource != null) {
            this.CBSSource = new CBSConfig(source.CBSSource);
        }
        if (source.HostPathSource != null) {
            this.HostPathSource = new HostPath(source.HostPathSource);
        }
        if (source.PublicDataSource != null) {
            this.PublicDataSource = new PublicDataSourceFS(source.PublicDataSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MappingPath", this.MappingPath);
        this.setParamSimple(map, prefix + "DataSourceUsage", this.DataSourceUsage);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamObj(map, prefix + "DataSetSource.", this.DataSetSource);
        this.setParamObj(map, prefix + "COSSource.", this.COSSource);
        this.setParamObj(map, prefix + "CFSSource.", this.CFSSource);
        this.setParamObj(map, prefix + "HDFSSource.", this.HDFSSource);
        this.setParamObj(map, prefix + "GooseFSSource.", this.GooseFSSource);
        this.setParamObj(map, prefix + "CFSTurboSource.", this.CFSTurboSource);
        this.setParamObj(map, prefix + "LocalDiskSource.", this.LocalDiskSource);
        this.setParamObj(map, prefix + "CBSSource.", this.CBSSource);
        this.setParamObj(map, prefix + "HostPathSource.", this.HostPathSource);
        this.setParamObj(map, prefix + "PublicDataSource.", this.PublicDataSource);

    }
}

