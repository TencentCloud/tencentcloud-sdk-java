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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LimitWindow extends AbstractModel {

    /**
    * 每秒允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Second")
    @Expose
    private Long Second;

    /**
    * 每分钟允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Minute")
    @Expose
    private Long Minute;

    /**
    * 每小时允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hour")
    @Expose
    private Long Hour;

    /**
    * 是否共享配额，只有当对象为URL时有效，false表示URL独享配额，true表示所有URL共享配额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuotaShare")
    @Expose
    private Boolean QuotaShare;

    /**
     * Get 每秒允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Second 每秒允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSecond() {
        return this.Second;
    }

    /**
     * Set 每秒允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Second 每秒允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecond(Long Second) {
        this.Second = Second;
    }

    /**
     * Get 每分钟允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Minute 每分钟允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinute() {
        return this.Minute;
    }

    /**
     * Set 每分钟允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Minute 每分钟允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinute(Long Minute) {
        this.Minute = Minute;
    }

    /**
     * Get 每小时允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hour 每小时允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHour() {
        return this.Hour;
    }

    /**
     * Set 每小时允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hour 每小时允许通过的最大请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHour(Long Hour) {
        this.Hour = Hour;
    }

    /**
     * Get 是否共享配额，只有当对象为URL时有效，false表示URL独享配额，true表示所有URL共享配额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuotaShare 是否共享配额，只有当对象为URL时有效，false表示URL独享配额，true表示所有URL共享配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getQuotaShare() {
        return this.QuotaShare;
    }

    /**
     * Set 是否共享配额，只有当对象为URL时有效，false表示URL独享配额，true表示所有URL共享配额
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuotaShare 是否共享配额，只有当对象为URL时有效，false表示URL独享配额，true表示所有URL共享配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuotaShare(Boolean QuotaShare) {
        this.QuotaShare = QuotaShare;
    }

    public LimitWindow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LimitWindow(LimitWindow source) {
        if (source.Second != null) {
            this.Second = new Long(source.Second);
        }
        if (source.Minute != null) {
            this.Minute = new Long(source.Minute);
        }
        if (source.Hour != null) {
            this.Hour = new Long(source.Hour);
        }
        if (source.QuotaShare != null) {
            this.QuotaShare = new Boolean(source.QuotaShare);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Second", this.Second);
        this.setParamSimple(map, prefix + "Minute", this.Minute);
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "QuotaShare", this.QuotaShare);

    }
}

