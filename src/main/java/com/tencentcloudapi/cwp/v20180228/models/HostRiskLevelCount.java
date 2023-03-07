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

public class HostRiskLevelCount extends AbstractModel{

    /**
    * 主机ID
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 主机名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 严重个数
    */
    @SerializedName("SeriousCount")
    @Expose
    private Long SeriousCount;

    /**
    * 高危个数
    */
    @SerializedName("HighCount")
    @Expose
    private Long HighCount;

    /**
    * 中危个数
    */
    @SerializedName("MediumCount")
    @Expose
    private Long MediumCount;

    /**
    * 低危个数
    */
    @SerializedName("LowCount")
    @Expose
    private Long LowCount;

    /**
     * Get 主机ID 
     * @return HostId 主机ID
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 主机ID
     * @param HostId 主机ID
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 主机名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName 主机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName 主机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 严重个数 
     * @return SeriousCount 严重个数
     */
    public Long getSeriousCount() {
        return this.SeriousCount;
    }

    /**
     * Set 严重个数
     * @param SeriousCount 严重个数
     */
    public void setSeriousCount(Long SeriousCount) {
        this.SeriousCount = SeriousCount;
    }

    /**
     * Get 高危个数 
     * @return HighCount 高危个数
     */
    public Long getHighCount() {
        return this.HighCount;
    }

    /**
     * Set 高危个数
     * @param HighCount 高危个数
     */
    public void setHighCount(Long HighCount) {
        this.HighCount = HighCount;
    }

    /**
     * Get 中危个数 
     * @return MediumCount 中危个数
     */
    public Long getMediumCount() {
        return this.MediumCount;
    }

    /**
     * Set 中危个数
     * @param MediumCount 中危个数
     */
    public void setMediumCount(Long MediumCount) {
        this.MediumCount = MediumCount;
    }

    /**
     * Get 低危个数 
     * @return LowCount 低危个数
     */
    public Long getLowCount() {
        return this.LowCount;
    }

    /**
     * Set 低危个数
     * @param LowCount 低危个数
     */
    public void setLowCount(Long LowCount) {
        this.LowCount = LowCount;
    }

    public HostRiskLevelCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostRiskLevelCount(HostRiskLevelCount source) {
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.SeriousCount != null) {
            this.SeriousCount = new Long(source.SeriousCount);
        }
        if (source.HighCount != null) {
            this.HighCount = new Long(source.HighCount);
        }
        if (source.MediumCount != null) {
            this.MediumCount = new Long(source.MediumCount);
        }
        if (source.LowCount != null) {
            this.LowCount = new Long(source.LowCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "SeriousCount", this.SeriousCount);
        this.setParamSimple(map, prefix + "HighCount", this.HighCount);
        this.setParamSimple(map, prefix + "MediumCount", this.MediumCount);
        this.setParamSimple(map, prefix + "LowCount", this.LowCount);

    }
}

