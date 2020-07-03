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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosDataSource extends AbstractModel{

    /**
    * cos桶
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * cos文件key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyPrefix")
    @Expose
    private String KeyPrefix;

    /**
    * 分布式数据下载方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataDistributionType")
    @Expose
    private String DataDistributionType;

    /**
    * 数据类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
     * Get cos桶
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bucket cos桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set cos桶
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bucket cos桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get cos文件key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyPrefix cos文件key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyPrefix() {
        return this.KeyPrefix;
    }

    /**
     * Set cos文件key
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyPrefix cos文件key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyPrefix(String KeyPrefix) {
        this.KeyPrefix = KeyPrefix;
    }

    /**
     * Get 分布式数据下载方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataDistributionType 分布式数据下载方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataDistributionType() {
        return this.DataDistributionType;
    }

    /**
     * Set 分布式数据下载方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataDistributionType 分布式数据下载方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataDistributionType(String DataDistributionType) {
        this.DataDistributionType = DataDistributionType;
    }

    /**
     * Get 数据类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataType 数据类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataType 数据类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "KeyPrefix", this.KeyPrefix);
        this.setParamSimple(map, prefix + "DataDistributionType", this.DataDistributionType);
        this.setParamSimple(map, prefix + "DataType", this.DataType);

    }
}

