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

public class AssetCosDetail extends AbstractModel {

    /**
    * 桶的名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * 文件的个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileNums")
    @Expose
    private Long FileNums;

    /**
    * 敏感的文件个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveFileNums")
    @Expose
    private Long SensitiveFileNums;

    /**
    * 敏感分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DistributionData")
    @Expose
    private Note [] DistributionData;

    /**
    * cos文件的敏感数据个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchedNum")
    @Expose
    private Long MatchedNum;

    /**
     * Get 桶的名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bucket 桶的名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 桶的名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bucket 桶的名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get 文件的个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileNums 文件的个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileNums() {
        return this.FileNums;
    }

    /**
     * Set 文件的个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileNums 文件的个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileNums(Long FileNums) {
        this.FileNums = FileNums;
    }

    /**
     * Get 敏感的文件个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveFileNums 敏感的文件个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveFileNums() {
        return this.SensitiveFileNums;
    }

    /**
     * Set 敏感的文件个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveFileNums 敏感的文件个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveFileNums(Long SensitiveFileNums) {
        this.SensitiveFileNums = SensitiveFileNums;
    }

    /**
     * Get 敏感分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DistributionData 敏感分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Note [] getDistributionData() {
        return this.DistributionData;
    }

    /**
     * Set 敏感分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param DistributionData 敏感分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDistributionData(Note [] DistributionData) {
        this.DistributionData = DistributionData;
    }

    /**
     * Get cos文件的敏感数据个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchedNum cos文件的敏感数据个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMatchedNum() {
        return this.MatchedNum;
    }

    /**
     * Set cos文件的敏感数据个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchedNum cos文件的敏感数据个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchedNum(Long MatchedNum) {
        this.MatchedNum = MatchedNum;
    }

    public AssetCosDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetCosDetail(AssetCosDetail source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
        if (source.FileNums != null) {
            this.FileNums = new Long(source.FileNums);
        }
        if (source.SensitiveFileNums != null) {
            this.SensitiveFileNums = new Long(source.SensitiveFileNums);
        }
        if (source.DistributionData != null) {
            this.DistributionData = new Note[source.DistributionData.length];
            for (int i = 0; i < source.DistributionData.length; i++) {
                this.DistributionData[i] = new Note(source.DistributionData[i]);
            }
        }
        if (source.MatchedNum != null) {
            this.MatchedNum = new Long(source.MatchedNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "FileNums", this.FileNums);
        this.setParamSimple(map, prefix + "SensitiveFileNums", this.SensitiveFileNums);
        this.setParamArrayObj(map, prefix + "DistributionData.", this.DistributionData);
        this.setParamSimple(map, prefix + "MatchedNum", this.MatchedNum);

    }
}

