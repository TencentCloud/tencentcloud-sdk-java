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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupCosInfo extends AbstractModel {

    /**
    * 备份文件所在的cos桶
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * 备份文件所在的完整cos路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
    * 备份文件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapShotPath")
    @Expose
    private String SnapShotPath;

    /**
     * Get 备份文件所在的cos桶
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucket 备份文件所在的cos桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set 备份文件所在的cos桶
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucket 备份文件所在的cos桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get 备份文件所在的完整cos路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosPath 备份文件所在的完整cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosPath() {
        return this.CosPath;
    }

    /**
     * Set 备份文件所在的完整cos路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosPath 备份文件所在的完整cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosPath(String CosPath) {
        this.CosPath = CosPath;
    }

    /**
     * Get 备份文件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapShotPath 备份文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapShotPath() {
        return this.SnapShotPath;
    }

    /**
     * Set 备份文件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapShotPath 备份文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapShotPath(String SnapShotPath) {
        this.SnapShotPath = SnapShotPath;
    }

    public BackupCosInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupCosInfo(BackupCosInfo source) {
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.CosPath != null) {
            this.CosPath = new String(source.CosPath);
        }
        if (source.SnapShotPath != null) {
            this.SnapShotPath = new String(source.SnapShotPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);
        this.setParamSimple(map, prefix + "SnapShotPath", this.SnapShotPath);

    }
}

