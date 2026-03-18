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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PasswordUpdateLoginConfig extends AbstractModel {

    /**
    * 首次登录强制修改密码开关。开启后，用户首次登录时将强制要求修改密码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstLoginUpdate")
    @Expose
    private Boolean FirstLoginUpdate;

    /**
    * 定期强制修改密码开关。开启后，用户需按照 PeriodValue 和 PeriodType 指定的周期定期修改密码，超过周期未修改将在登录时强制要求修改。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodUpdate")
    @Expose
    private Boolean PeriodUpdate;

    /**
    * 定期修改密码的周期数值，与 PeriodType 配合使用。例如 PeriodValue 为 6，PeriodType 为 MONTH，表示每 6 个月需修改一次密码。当 PeriodUpdate 为 true 时必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodValue")
    @Expose
    private Long PeriodValue;

    /**
    * 定期修改密码的周期时间单位，与 PeriodValue 配合使用。取值范围：
WEEK：周
MONTH：月
YEAR：年
当 PeriodUpdate 为 true 时必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
     * Get 首次登录强制修改密码开关。开启后，用户首次登录时将强制要求修改密码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstLoginUpdate 首次登录强制修改密码开关。开启后，用户首次登录时将强制要求修改密码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getFirstLoginUpdate() {
        return this.FirstLoginUpdate;
    }

    /**
     * Set 首次登录强制修改密码开关。开启后，用户首次登录时将强制要求修改密码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstLoginUpdate 首次登录强制修改密码开关。开启后，用户首次登录时将强制要求修改密码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstLoginUpdate(Boolean FirstLoginUpdate) {
        this.FirstLoginUpdate = FirstLoginUpdate;
    }

    /**
     * Get 定期强制修改密码开关。开启后，用户需按照 PeriodValue 和 PeriodType 指定的周期定期修改密码，超过周期未修改将在登录时强制要求修改。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodUpdate 定期强制修改密码开关。开启后，用户需按照 PeriodValue 和 PeriodType 指定的周期定期修改密码，超过周期未修改将在登录时强制要求修改。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPeriodUpdate() {
        return this.PeriodUpdate;
    }

    /**
     * Set 定期强制修改密码开关。开启后，用户需按照 PeriodValue 和 PeriodType 指定的周期定期修改密码，超过周期未修改将在登录时强制要求修改。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodUpdate 定期强制修改密码开关。开启后，用户需按照 PeriodValue 和 PeriodType 指定的周期定期修改密码，超过周期未修改将在登录时强制要求修改。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodUpdate(Boolean PeriodUpdate) {
        this.PeriodUpdate = PeriodUpdate;
    }

    /**
     * Get 定期修改密码的周期数值，与 PeriodType 配合使用。例如 PeriodValue 为 6，PeriodType 为 MONTH，表示每 6 个月需修改一次密码。当 PeriodUpdate 为 true 时必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodValue 定期修改密码的周期数值，与 PeriodType 配合使用。例如 PeriodValue 为 6，PeriodType 为 MONTH，表示每 6 个月需修改一次密码。当 PeriodUpdate 为 true 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriodValue() {
        return this.PeriodValue;
    }

    /**
     * Set 定期修改密码的周期数值，与 PeriodType 配合使用。例如 PeriodValue 为 6，PeriodType 为 MONTH，表示每 6 个月需修改一次密码。当 PeriodUpdate 为 true 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodValue 定期修改密码的周期数值，与 PeriodType 配合使用。例如 PeriodValue 为 6，PeriodType 为 MONTH，表示每 6 个月需修改一次密码。当 PeriodUpdate 为 true 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodValue(Long PeriodValue) {
        this.PeriodValue = PeriodValue;
    }

    /**
     * Get 定期修改密码的周期时间单位，与 PeriodValue 配合使用。取值范围：
WEEK：周
MONTH：月
YEAR：年
当 PeriodUpdate 为 true 时必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodType 定期修改密码的周期时间单位，与 PeriodValue 配合使用。取值范围：
WEEK：周
MONTH：月
YEAR：年
当 PeriodUpdate 为 true 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set 定期修改密码的周期时间单位，与 PeriodValue 配合使用。取值范围：
WEEK：周
MONTH：月
YEAR：年
当 PeriodUpdate 为 true 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodType 定期修改密码的周期时间单位，与 PeriodValue 配合使用。取值范围：
WEEK：周
MONTH：月
YEAR：年
当 PeriodUpdate 为 true 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    public PasswordUpdateLoginConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PasswordUpdateLoginConfig(PasswordUpdateLoginConfig source) {
        if (source.FirstLoginUpdate != null) {
            this.FirstLoginUpdate = new Boolean(source.FirstLoginUpdate);
        }
        if (source.PeriodUpdate != null) {
            this.PeriodUpdate = new Boolean(source.PeriodUpdate);
        }
        if (source.PeriodValue != null) {
            this.PeriodValue = new Long(source.PeriodValue);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstLoginUpdate", this.FirstLoginUpdate);
        this.setParamSimple(map, prefix + "PeriodUpdate", this.PeriodUpdate);
        this.setParamSimple(map, prefix + "PeriodValue", this.PeriodValue);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);

    }
}

