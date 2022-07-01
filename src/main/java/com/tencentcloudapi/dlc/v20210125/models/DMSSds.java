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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DMSSds extends AbstractModel{

    /**
    * 存储地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 输入格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputFormat")
    @Expose
    private String InputFormat;

    /**
    * 输出格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
    * bucket数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumBuckets")
    @Expose
    private Long NumBuckets;

    /**
    * 是是否压缩
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Compressed")
    @Expose
    private Boolean Compressed;

    /**
    * 是否有子目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoredAsSubDirectories")
    @Expose
    private Boolean StoredAsSubDirectories;

    /**
    * 序列化lib
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerdeLib")
    @Expose
    private String SerdeLib;

    /**
    * 序列化名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerdeName")
    @Expose
    private String SerdeName;

    /**
    * 桶名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketCols")
    @Expose
    private String [] BucketCols;

    /**
    * 序列化参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerdeParams")
    @Expose
    private KVPair [] SerdeParams;

    /**
    * 附加参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private KVPair [] Params;

    /**
    * 列排序(Expired)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SortCols")
    @Expose
    private DMSColumnOrder SortCols;

    /**
    * 列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cols")
    @Expose
    private DMSColumn [] Cols;

    /**
    * 列排序字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SortColumns")
    @Expose
    private DMSColumnOrder [] SortColumns;

    /**
     * Get 存储地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location 存储地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 存储地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location 存储地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 输入格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputFormat 输入格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputFormat() {
        return this.InputFormat;
    }

    /**
     * Set 输入格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputFormat 输入格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputFormat(String InputFormat) {
        this.InputFormat = InputFormat;
    }

    /**
     * Get 输出格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputFormat 输出格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set 输出格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputFormat 输出格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get bucket数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumBuckets bucket数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNumBuckets() {
        return this.NumBuckets;
    }

    /**
     * Set bucket数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumBuckets bucket数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumBuckets(Long NumBuckets) {
        this.NumBuckets = NumBuckets;
    }

    /**
     * Get 是是否压缩
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Compressed 是是否压缩
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCompressed() {
        return this.Compressed;
    }

    /**
     * Set 是是否压缩
注意：此字段可能返回 null，表示取不到有效值。
     * @param Compressed 是是否压缩
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompressed(Boolean Compressed) {
        this.Compressed = Compressed;
    }

    /**
     * Get 是否有子目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoredAsSubDirectories 是否有子目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStoredAsSubDirectories() {
        return this.StoredAsSubDirectories;
    }

    /**
     * Set 是否有子目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoredAsSubDirectories 是否有子目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoredAsSubDirectories(Boolean StoredAsSubDirectories) {
        this.StoredAsSubDirectories = StoredAsSubDirectories;
    }

    /**
     * Get 序列化lib
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerdeLib 序列化lib
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerdeLib() {
        return this.SerdeLib;
    }

    /**
     * Set 序列化lib
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerdeLib 序列化lib
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerdeLib(String SerdeLib) {
        this.SerdeLib = SerdeLib;
    }

    /**
     * Get 序列化名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerdeName 序列化名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerdeName() {
        return this.SerdeName;
    }

    /**
     * Set 序列化名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerdeName 序列化名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerdeName(String SerdeName) {
        this.SerdeName = SerdeName;
    }

    /**
     * Get 桶名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketCols 桶名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBucketCols() {
        return this.BucketCols;
    }

    /**
     * Set 桶名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketCols 桶名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketCols(String [] BucketCols) {
        this.BucketCols = BucketCols;
    }

    /**
     * Get 序列化参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerdeParams 序列化参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVPair [] getSerdeParams() {
        return this.SerdeParams;
    }

    /**
     * Set 序列化参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerdeParams 序列化参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerdeParams(KVPair [] SerdeParams) {
        this.SerdeParams = SerdeParams;
    }

    /**
     * Get 附加参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 附加参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVPair [] getParams() {
        return this.Params;
    }

    /**
     * Set 附加参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 附加参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(KVPair [] Params) {
        this.Params = Params;
    }

    /**
     * Get 列排序(Expired)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SortCols 列排序(Expired)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DMSColumnOrder getSortCols() {
        return this.SortCols;
    }

    /**
     * Set 列排序(Expired)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SortCols 列排序(Expired)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSortCols(DMSColumnOrder SortCols) {
        this.SortCols = SortCols;
    }

    /**
     * Get 列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cols 列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DMSColumn [] getCols() {
        return this.Cols;
    }

    /**
     * Set 列
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cols 列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCols(DMSColumn [] Cols) {
        this.Cols = Cols;
    }

    /**
     * Get 列排序字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SortColumns 列排序字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DMSColumnOrder [] getSortColumns() {
        return this.SortColumns;
    }

    /**
     * Set 列排序字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param SortColumns 列排序字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSortColumns(DMSColumnOrder [] SortColumns) {
        this.SortColumns = SortColumns;
    }

    public DMSSds() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DMSSds(DMSSds source) {
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.InputFormat != null) {
            this.InputFormat = new String(source.InputFormat);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new String(source.OutputFormat);
        }
        if (source.NumBuckets != null) {
            this.NumBuckets = new Long(source.NumBuckets);
        }
        if (source.Compressed != null) {
            this.Compressed = new Boolean(source.Compressed);
        }
        if (source.StoredAsSubDirectories != null) {
            this.StoredAsSubDirectories = new Boolean(source.StoredAsSubDirectories);
        }
        if (source.SerdeLib != null) {
            this.SerdeLib = new String(source.SerdeLib);
        }
        if (source.SerdeName != null) {
            this.SerdeName = new String(source.SerdeName);
        }
        if (source.BucketCols != null) {
            this.BucketCols = new String[source.BucketCols.length];
            for (int i = 0; i < source.BucketCols.length; i++) {
                this.BucketCols[i] = new String(source.BucketCols[i]);
            }
        }
        if (source.SerdeParams != null) {
            this.SerdeParams = new KVPair[source.SerdeParams.length];
            for (int i = 0; i < source.SerdeParams.length; i++) {
                this.SerdeParams[i] = new KVPair(source.SerdeParams[i]);
            }
        }
        if (source.Params != null) {
            this.Params = new KVPair[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new KVPair(source.Params[i]);
            }
        }
        if (source.SortCols != null) {
            this.SortCols = new DMSColumnOrder(source.SortCols);
        }
        if (source.Cols != null) {
            this.Cols = new DMSColumn[source.Cols.length];
            for (int i = 0; i < source.Cols.length; i++) {
                this.Cols[i] = new DMSColumn(source.Cols[i]);
            }
        }
        if (source.SortColumns != null) {
            this.SortColumns = new DMSColumnOrder[source.SortColumns.length];
            for (int i = 0; i < source.SortColumns.length; i++) {
                this.SortColumns[i] = new DMSColumnOrder(source.SortColumns[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "InputFormat", this.InputFormat);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "NumBuckets", this.NumBuckets);
        this.setParamSimple(map, prefix + "Compressed", this.Compressed);
        this.setParamSimple(map, prefix + "StoredAsSubDirectories", this.StoredAsSubDirectories);
        this.setParamSimple(map, prefix + "SerdeLib", this.SerdeLib);
        this.setParamSimple(map, prefix + "SerdeName", this.SerdeName);
        this.setParamArraySimple(map, prefix + "BucketCols.", this.BucketCols);
        this.setParamArrayObj(map, prefix + "SerdeParams.", this.SerdeParams);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamObj(map, prefix + "SortCols.", this.SortCols);
        this.setParamArrayObj(map, prefix + "Cols.", this.Cols);
        this.setParamArrayObj(map, prefix + "SortColumns.", this.SortColumns);

    }
}

