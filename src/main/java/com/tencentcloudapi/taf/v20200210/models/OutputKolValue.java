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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputKolValue extends AbstractModel{

    /**
    * KOL账号ID[比如微信公众号ID]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 是否查得[0：未查得；1：查得]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCheck")
    @Expose
    private Long IsCheck;

    /**
    * 作弊的可能性[0～100]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FraudPScore")
    @Expose
    private Long FraudPScore;

    /**
    * 作弊的严重性[0～100]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EvilPScore")
    @Expose
    private Long EvilPScore;

    /**
     * Get KOL账号ID[比如微信公众号ID]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id KOL账号ID[比如微信公众号ID]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set KOL账号ID[比如微信公众号ID]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id KOL账号ID[比如微信公众号ID]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 是否查得[0：未查得；1：查得]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCheck 是否查得[0：未查得；1：查得]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsCheck() {
        return this.IsCheck;
    }

    /**
     * Set 是否查得[0：未查得；1：查得]
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCheck 是否查得[0：未查得；1：查得]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCheck(Long IsCheck) {
        this.IsCheck = IsCheck;
    }

    /**
     * Get 作弊的可能性[0～100]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FraudPScore 作弊的可能性[0～100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFraudPScore() {
        return this.FraudPScore;
    }

    /**
     * Set 作弊的可能性[0～100]
注意：此字段可能返回 null，表示取不到有效值。
     * @param FraudPScore 作弊的可能性[0～100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFraudPScore(Long FraudPScore) {
        this.FraudPScore = FraudPScore;
    }

    /**
     * Get 作弊的严重性[0～100]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EvilPScore 作弊的严重性[0～100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEvilPScore() {
        return this.EvilPScore;
    }

    /**
     * Set 作弊的严重性[0～100]
注意：此字段可能返回 null，表示取不到有效值。
     * @param EvilPScore 作弊的严重性[0～100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvilPScore(Long EvilPScore) {
        this.EvilPScore = EvilPScore;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IsCheck", this.IsCheck);
        this.setParamSimple(map, prefix + "FraudPScore", this.FraudPScore);
        this.setParamSimple(map, prefix + "EvilPScore", this.EvilPScore);

    }
}

