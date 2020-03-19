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

public class OutputDataConfig extends AbstractModel{

    /**
    * cos桶
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosOutputBucket")
    @Expose
    private String CosOutputBucket;

    /**
    * cos文件key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosOutputKeyPrefix")
    @Expose
    private String CosOutputKeyPrefix;

    /**
     * Get cos桶
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosOutputBucket cos桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosOutputBucket() {
        return this.CosOutputBucket;
    }

    /**
     * Set cos桶
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosOutputBucket cos桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosOutputBucket(String CosOutputBucket) {
        this.CosOutputBucket = CosOutputBucket;
    }

    /**
     * Get cos文件key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosOutputKeyPrefix cos文件key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosOutputKeyPrefix() {
        return this.CosOutputKeyPrefix;
    }

    /**
     * Set cos文件key
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosOutputKeyPrefix cos文件key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosOutputKeyPrefix(String CosOutputKeyPrefix) {
        this.CosOutputKeyPrefix = CosOutputKeyPrefix;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosOutputBucket", this.CosOutputBucket);
        this.setParamSimple(map, prefix + "CosOutputKeyPrefix", this.CosOutputKeyPrefix);

    }
}

