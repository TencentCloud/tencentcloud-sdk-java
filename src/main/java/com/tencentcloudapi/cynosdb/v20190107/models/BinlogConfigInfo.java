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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BinlogConfigInfo extends AbstractModel {

    /**
    * binlog保留时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BinlogSaveDays")
    @Expose
    private Long BinlogSaveDays;

    /**
    * binlog异地地域备份是否开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BinlogCrossRegionsEnable")
    @Expose
    private String BinlogCrossRegionsEnable;

    /**
    * binlog异地地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BinlogCrossRegions")
    @Expose
    private String [] BinlogCrossRegions;

    /**
     * Get binlog保留时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BinlogSaveDays binlog保留时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBinlogSaveDays() {
        return this.BinlogSaveDays;
    }

    /**
     * Set binlog保留时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BinlogSaveDays binlog保留时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBinlogSaveDays(Long BinlogSaveDays) {
        this.BinlogSaveDays = BinlogSaveDays;
    }

    /**
     * Get binlog异地地域备份是否开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BinlogCrossRegionsEnable binlog异地地域备份是否开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBinlogCrossRegionsEnable() {
        return this.BinlogCrossRegionsEnable;
    }

    /**
     * Set binlog异地地域备份是否开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param BinlogCrossRegionsEnable binlog异地地域备份是否开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBinlogCrossRegionsEnable(String BinlogCrossRegionsEnable) {
        this.BinlogCrossRegionsEnable = BinlogCrossRegionsEnable;
    }

    /**
     * Get binlog异地地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BinlogCrossRegions binlog异地地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBinlogCrossRegions() {
        return this.BinlogCrossRegions;
    }

    /**
     * Set binlog异地地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param BinlogCrossRegions binlog异地地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBinlogCrossRegions(String [] BinlogCrossRegions) {
        this.BinlogCrossRegions = BinlogCrossRegions;
    }

    public BinlogConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BinlogConfigInfo(BinlogConfigInfo source) {
        if (source.BinlogSaveDays != null) {
            this.BinlogSaveDays = new Long(source.BinlogSaveDays);
        }
        if (source.BinlogCrossRegionsEnable != null) {
            this.BinlogCrossRegionsEnable = new String(source.BinlogCrossRegionsEnable);
        }
        if (source.BinlogCrossRegions != null) {
            this.BinlogCrossRegions = new String[source.BinlogCrossRegions.length];
            for (int i = 0; i < source.BinlogCrossRegions.length; i++) {
                this.BinlogCrossRegions[i] = new String(source.BinlogCrossRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BinlogSaveDays", this.BinlogSaveDays);
        this.setParamSimple(map, prefix + "BinlogCrossRegionsEnable", this.BinlogCrossRegionsEnable);
        this.setParamArraySimple(map, prefix + "BinlogCrossRegions.", this.BinlogCrossRegions);

    }
}

