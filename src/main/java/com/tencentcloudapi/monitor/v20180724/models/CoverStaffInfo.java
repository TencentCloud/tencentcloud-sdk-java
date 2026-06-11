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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CoverStaffInfo extends AbstractModel {

    /**
    * 轮班人员id组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverStaffIDs")
    @Expose
    private String [] CoverStaffIDs;

    /**
    * 轮班开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverStartTime")
    @Expose
    private Long CoverStartTime;

    /**
    * 轮班结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverEndTime")
    @Expose
    private Long CoverEndTime;

    /**
     * Get 轮班人员id组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoverStaffIDs 轮班人员id组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCoverStaffIDs() {
        return this.CoverStaffIDs;
    }

    /**
     * Set 轮班人员id组
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverStaffIDs 轮班人员id组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverStaffIDs(String [] CoverStaffIDs) {
        this.CoverStaffIDs = CoverStaffIDs;
    }

    /**
     * Get 轮班开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoverStartTime 轮班开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCoverStartTime() {
        return this.CoverStartTime;
    }

    /**
     * Set 轮班开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverStartTime 轮班开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverStartTime(Long CoverStartTime) {
        this.CoverStartTime = CoverStartTime;
    }

    /**
     * Get 轮班结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoverEndTime 轮班结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCoverEndTime() {
        return this.CoverEndTime;
    }

    /**
     * Set 轮班结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverEndTime 轮班结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverEndTime(Long CoverEndTime) {
        this.CoverEndTime = CoverEndTime;
    }

    public CoverStaffInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoverStaffInfo(CoverStaffInfo source) {
        if (source.CoverStaffIDs != null) {
            this.CoverStaffIDs = new String[source.CoverStaffIDs.length];
            for (int i = 0; i < source.CoverStaffIDs.length; i++) {
                this.CoverStaffIDs[i] = new String(source.CoverStaffIDs[i]);
            }
        }
        if (source.CoverStartTime != null) {
            this.CoverStartTime = new Long(source.CoverStartTime);
        }
        if (source.CoverEndTime != null) {
            this.CoverEndTime = new Long(source.CoverEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CoverStaffIDs.", this.CoverStaffIDs);
        this.setParamSimple(map, prefix + "CoverStartTime", this.CoverStartTime);
        this.setParamSimple(map, prefix + "CoverEndTime", this.CoverEndTime);

    }
}

