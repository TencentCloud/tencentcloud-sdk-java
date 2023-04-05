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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class License extends AbstractModel{

    /**
    * 该类型的license个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * license状态：0:未绑定；1:已绑定；2:已停服；3:已退费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 到期时间戳：s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 服务时长：s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 剩余天数：天
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemainDay")
    @Expose
    private Long RemainDay;

    /**
    * 该类型的licenseId列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LicenseIds")
    @Expose
    private String [] LicenseIds;

    /**
     * Get 该类型的license个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 该类型的license个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 该类型的license个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 该类型的license个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get license状态：0:未绑定；1:已绑定；2:已停服；3:已退费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status license状态：0:未绑定；1:已绑定；2:已停服；3:已退费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set license状态：0:未绑定；1:已绑定；2:已停服；3:已退费
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status license状态：0:未绑定；1:已绑定；2:已停服；3:已退费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 到期时间戳：s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 到期时间戳：s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间戳：s
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 到期时间戳：s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 服务时长：s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 服务时长：s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 服务时长：s
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 服务时长：s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 剩余天数：天
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemainDay 剩余天数：天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRemainDay() {
        return this.RemainDay;
    }

    /**
     * Set 剩余天数：天
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemainDay 剩余天数：天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemainDay(Long RemainDay) {
        this.RemainDay = RemainDay;
    }

    /**
     * Get 该类型的licenseId列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LicenseIds 该类型的licenseId列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLicenseIds() {
        return this.LicenseIds;
    }

    /**
     * Set 该类型的licenseId列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param LicenseIds 该类型的licenseId列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLicenseIds(String [] LicenseIds) {
        this.LicenseIds = LicenseIds;
    }

    public License() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public License(License source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.RemainDay != null) {
            this.RemainDay = new Long(source.RemainDay);
        }
        if (source.LicenseIds != null) {
            this.LicenseIds = new String[source.LicenseIds.length];
            for (int i = 0; i < source.LicenseIds.length; i++) {
                this.LicenseIds[i] = new String(source.LicenseIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "RemainDay", this.RemainDay);
        this.setParamArraySimple(map, prefix + "LicenseIds.", this.LicenseIds);

    }
}

