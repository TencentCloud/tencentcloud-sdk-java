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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderQuotaInfo extends AbstractModel {

    /**
    * 配额键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuotaKey")
    @Expose
    private String QuotaKey;

    /**
    * 配额总量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuotaNum")
    @Expose
    private Long QuotaNum;

    /**
    * 配额已使用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuotaUsed")
    @Expose
    private Long QuotaUsed;

    /**
     * Get 配额键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuotaKey 配额键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuotaKey() {
        return this.QuotaKey;
    }

    /**
     * Set 配额键
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuotaKey 配额键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuotaKey(String QuotaKey) {
        this.QuotaKey = QuotaKey;
    }

    /**
     * Get 配额总量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuotaNum 配额总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQuotaNum() {
        return this.QuotaNum;
    }

    /**
     * Set 配额总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuotaNum 配额总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuotaNum(Long QuotaNum) {
        this.QuotaNum = QuotaNum;
    }

    /**
     * Get 配额已使用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuotaUsed 配额已使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQuotaUsed() {
        return this.QuotaUsed;
    }

    /**
     * Set 配额已使用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuotaUsed 配额已使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuotaUsed(Long QuotaUsed) {
        this.QuotaUsed = QuotaUsed;
    }

    public OrderQuotaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderQuotaInfo(OrderQuotaInfo source) {
        if (source.QuotaKey != null) {
            this.QuotaKey = new String(source.QuotaKey);
        }
        if (source.QuotaNum != null) {
            this.QuotaNum = new Long(source.QuotaNum);
        }
        if (source.QuotaUsed != null) {
            this.QuotaUsed = new Long(source.QuotaUsed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaKey", this.QuotaKey);
        this.setParamSimple(map, prefix + "QuotaNum", this.QuotaNum);
        this.setParamSimple(map, prefix + "QuotaUsed", this.QuotaUsed);

    }
}

