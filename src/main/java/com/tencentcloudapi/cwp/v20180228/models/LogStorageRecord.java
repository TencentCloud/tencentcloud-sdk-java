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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogStorageRecord extends AbstractModel{

    /**
    * 年月份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * 存储量，字节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedSize")
    @Expose
    private Long UsedSize;

    /**
    * 总量，字节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InquireSize")
    @Expose
    private Long InquireSize;

    /**
     * Get 年月份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Month 年月份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 年月份
注意：此字段可能返回 null，表示取不到有效值。
     * @param Month 年月份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get 存储量，字节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedSize 存储量，字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUsedSize() {
        return this.UsedSize;
    }

    /**
     * Set 存储量，字节
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedSize 存储量，字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedSize(Long UsedSize) {
        this.UsedSize = UsedSize;
    }

    /**
     * Get 总量，字节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InquireSize 总量，字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInquireSize() {
        return this.InquireSize;
    }

    /**
     * Set 总量，字节
注意：此字段可能返回 null，表示取不到有效值。
     * @param InquireSize 总量，字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInquireSize(Long InquireSize) {
        this.InquireSize = InquireSize;
    }

    public LogStorageRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogStorageRecord(LogStorageRecord source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.UsedSize != null) {
            this.UsedSize = new Long(source.UsedSize);
        }
        if (source.InquireSize != null) {
            this.InquireSize = new Long(source.InquireSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "UsedSize", this.UsedSize);
        this.setParamSimple(map, prefix + "InquireSize", this.InquireSize);

    }
}

