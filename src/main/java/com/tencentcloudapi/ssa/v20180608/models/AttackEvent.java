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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttackEvent extends AbstractModel {

    /**
    * 来源ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaSrcIp")
    @Expose
    private String SsaSrcIp;

    /**
    * 目标ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaDstIp")
    @Expose
    private String SsaDstIp;

    /**
    * 目标省份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaDstProvince")
    @Expose
    private String SsaDstProvince;

    /**
    * 目标城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaDstCity")
    @Expose
    private String SsaDstCity;

    /**
    * 目标国家
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaDstCountry")
    @Expose
    private String SsaDstCountry;

    /**
    * 来源省份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaSrcProvince")
    @Expose
    private String SsaSrcProvince;

    /**
    * 来源国家
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaSrcCountry")
    @Expose
    private String SsaSrcCountry;

    /**
    * 来源城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaSrcCity")
    @Expose
    private String SsaSrcCity;

    /**
     * Get 来源ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaSrcIp 来源ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaSrcIp() {
        return this.SsaSrcIp;
    }

    /**
     * Set 来源ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaSrcIp 来源ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaSrcIp(String SsaSrcIp) {
        this.SsaSrcIp = SsaSrcIp;
    }

    /**
     * Get 目标ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaDstIp 目标ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaDstIp() {
        return this.SsaDstIp;
    }

    /**
     * Set 目标ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaDstIp 目标ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaDstIp(String SsaDstIp) {
        this.SsaDstIp = SsaDstIp;
    }

    /**
     * Get 目标省份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaDstProvince 目标省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaDstProvince() {
        return this.SsaDstProvince;
    }

    /**
     * Set 目标省份
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaDstProvince 目标省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaDstProvince(String SsaDstProvince) {
        this.SsaDstProvince = SsaDstProvince;
    }

    /**
     * Get 目标城市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaDstCity 目标城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaDstCity() {
        return this.SsaDstCity;
    }

    /**
     * Set 目标城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaDstCity 目标城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaDstCity(String SsaDstCity) {
        this.SsaDstCity = SsaDstCity;
    }

    /**
     * Get 目标国家
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaDstCountry 目标国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaDstCountry() {
        return this.SsaDstCountry;
    }

    /**
     * Set 目标国家
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaDstCountry 目标国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaDstCountry(String SsaDstCountry) {
        this.SsaDstCountry = SsaDstCountry;
    }

    /**
     * Get 来源省份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaSrcProvince 来源省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaSrcProvince() {
        return this.SsaSrcProvince;
    }

    /**
     * Set 来源省份
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaSrcProvince 来源省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaSrcProvince(String SsaSrcProvince) {
        this.SsaSrcProvince = SsaSrcProvince;
    }

    /**
     * Get 来源国家
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaSrcCountry 来源国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaSrcCountry() {
        return this.SsaSrcCountry;
    }

    /**
     * Set 来源国家
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaSrcCountry 来源国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaSrcCountry(String SsaSrcCountry) {
        this.SsaSrcCountry = SsaSrcCountry;
    }

    /**
     * Get 来源城市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaSrcCity 来源城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaSrcCity() {
        return this.SsaSrcCity;
    }

    /**
     * Set 来源城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaSrcCity 来源城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaSrcCity(String SsaSrcCity) {
        this.SsaSrcCity = SsaSrcCity;
    }

    public AttackEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttackEvent(AttackEvent source) {
        if (source.SsaSrcIp != null) {
            this.SsaSrcIp = new String(source.SsaSrcIp);
        }
        if (source.SsaDstIp != null) {
            this.SsaDstIp = new String(source.SsaDstIp);
        }
        if (source.SsaDstProvince != null) {
            this.SsaDstProvince = new String(source.SsaDstProvince);
        }
        if (source.SsaDstCity != null) {
            this.SsaDstCity = new String(source.SsaDstCity);
        }
        if (source.SsaDstCountry != null) {
            this.SsaDstCountry = new String(source.SsaDstCountry);
        }
        if (source.SsaSrcProvince != null) {
            this.SsaSrcProvince = new String(source.SsaSrcProvince);
        }
        if (source.SsaSrcCountry != null) {
            this.SsaSrcCountry = new String(source.SsaSrcCountry);
        }
        if (source.SsaSrcCity != null) {
            this.SsaSrcCity = new String(source.SsaSrcCity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SsaSrcIp", this.SsaSrcIp);
        this.setParamSimple(map, prefix + "SsaDstIp", this.SsaDstIp);
        this.setParamSimple(map, prefix + "SsaDstProvince", this.SsaDstProvince);
        this.setParamSimple(map, prefix + "SsaDstCity", this.SsaDstCity);
        this.setParamSimple(map, prefix + "SsaDstCountry", this.SsaDstCountry);
        this.setParamSimple(map, prefix + "SsaSrcProvince", this.SsaSrcProvince);
        this.setParamSimple(map, prefix + "SsaSrcCountry", this.SsaSrcCountry);
        this.setParamSimple(map, prefix + "SsaSrcCity", this.SsaSrcCity);

    }
}

