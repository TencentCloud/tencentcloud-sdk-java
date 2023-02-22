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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedRetentionPolicy extends AbstractModel{

    /**
    * 保留最新快照Days天内的每天最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Days")
    @Expose
    private Long Days;

    /**
    * 保留最新快照Weeks周内的每周最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weeks")
    @Expose
    private Long Weeks;

    /**
    * 保留最新快照Months月内的每月最新的一个快照， 取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Months")
    @Expose
    private Long Months;

    /**
    * 保留最新快照Years年内的每年最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Years")
    @Expose
    private Long Years;

    /**
     * Get 保留最新快照Days天内的每天最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Days 保留最新快照Days天内的每天最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDays() {
        return this.Days;
    }

    /**
     * Set 保留最新快照Days天内的每天最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Days 保留最新快照Days天内的每天最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDays(Long Days) {
        this.Days = Days;
    }

    /**
     * Get 保留最新快照Weeks周内的每周最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weeks 保留最新快照Weeks周内的每周最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeeks() {
        return this.Weeks;
    }

    /**
     * Set 保留最新快照Weeks周内的每周最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weeks 保留最新快照Weeks周内的每周最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeeks(Long Weeks) {
        this.Weeks = Weeks;
    }

    /**
     * Get 保留最新快照Months月内的每月最新的一个快照， 取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Months 保留最新快照Months月内的每月最新的一个快照， 取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonths() {
        return this.Months;
    }

    /**
     * Set 保留最新快照Months月内的每月最新的一个快照， 取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Months 保留最新快照Months月内的每月最新的一个快照， 取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonths(Long Months) {
        this.Months = Months;
    }

    /**
     * Get 保留最新快照Years年内的每年最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Years 保留最新快照Years年内的每年最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getYears() {
        return this.Years;
    }

    /**
     * Set 保留最新快照Years年内的每年最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Years 保留最新快照Years年内的每年最新的一个快照，取值范围：[0, 100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYears(Long Years) {
        this.Years = Years;
    }

    public AdvancedRetentionPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedRetentionPolicy(AdvancedRetentionPolicy source) {
        if (source.Days != null) {
            this.Days = new Long(source.Days);
        }
        if (source.Weeks != null) {
            this.Weeks = new Long(source.Weeks);
        }
        if (source.Months != null) {
            this.Months = new Long(source.Months);
        }
        if (source.Years != null) {
            this.Years = new Long(source.Years);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Days", this.Days);
        this.setParamSimple(map, prefix + "Weeks", this.Weeks);
        this.setParamSimple(map, prefix + "Months", this.Months);
        this.setParamSimple(map, prefix + "Years", this.Years);

    }
}

