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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatisticItem extends AbstractModel{

    /**
    * 日期。格式【YYYY-MM-DD】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 统计数额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sum")
    @Expose
    private Float Sum;

    /**
     * Get 日期。格式【YYYY-MM-DD】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date 日期。格式【YYYY-MM-DD】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期。格式【YYYY-MM-DD】
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date 日期。格式【YYYY-MM-DD】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 统计数额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sum 统计数额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSum() {
        return this.Sum;
    }

    /**
     * Set 统计数额
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sum 统计数额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSum(Float Sum) {
        this.Sum = Sum;
    }

    public StatisticItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatisticItem(StatisticItem source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Sum != null) {
            this.Sum = new Float(source.Sum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Sum", this.Sum);

    }
}

