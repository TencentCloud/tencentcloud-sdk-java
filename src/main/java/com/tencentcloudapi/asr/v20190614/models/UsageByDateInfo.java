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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageByDateInfo extends AbstractModel {

    /**
    * 业务类型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizName")
    @Expose
    private String BizName;

    /**
    * 识别次数
单位：次
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 识别时长
单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get 业务类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizName 业务类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizName() {
        return this.BizName;
    }

    /**
     * Set 业务类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizName 业务类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizName(String BizName) {
        this.BizName = BizName;
    }

    /**
     * Get 识别次数
单位：次
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 识别次数
单位：次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 识别次数
单位：次
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 识别次数
单位：次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 识别时长
单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 识别时长
单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 识别时长
单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 识别时长
单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public UsageByDateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageByDateInfo(UsageByDateInfo source) {
        if (source.BizName != null) {
            this.BizName = new String(source.BizName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizName", this.BizName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

