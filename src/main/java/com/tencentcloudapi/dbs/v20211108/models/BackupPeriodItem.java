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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupPeriodItem extends AbstractModel {

    /**
    * 全量备份频率。目前仅支持"Weekly" - 每星期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * 全量备份周期。取值范围为：["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Day")
    @Expose
    private String [] Day;

    /**
     * Get 全量备份频率。目前仅支持"Weekly" - 每星期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodType 全量备份频率。目前仅支持"Weekly" - 每星期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set 全量备份频率。目前仅支持"Weekly" - 每星期
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodType 全量备份频率。目前仅支持"Weekly" - 每星期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get 全量备份周期。取值范围为：["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Day 全量备份周期。取值范围为：["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDay() {
        return this.Day;
    }

    /**
     * Set 全量备份周期。取值范围为：["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Day 全量备份周期。取值范围为：["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDay(String [] Day) {
        this.Day = Day;
    }

    public BackupPeriodItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupPeriodItem(BackupPeriodItem source) {
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
        if (source.Day != null) {
            this.Day = new String[source.Day.length];
            for (int i = 0; i < source.Day.length; i++) {
                this.Day[i] = new String(source.Day[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamArraySimple(map, prefix + "Day.", this.Day);

    }
}

