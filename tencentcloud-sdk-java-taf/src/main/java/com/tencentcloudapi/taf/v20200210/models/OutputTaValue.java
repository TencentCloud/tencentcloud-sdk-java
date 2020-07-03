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

public class OutputTaValue extends AbstractModel{

    /**
    * 是否查得[0：未查得；1：查得]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCheck")
    @Expose
    private Long IsCheck;

    /**
    * 是否符合[0：不符合；1：符合]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsMatch")
    @Expose
    private Long IsMatch;

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
     * Get 是否符合[0：不符合；1：符合]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsMatch 是否符合[0：不符合；1：符合]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsMatch() {
        return this.IsMatch;
    }

    /**
     * Set 是否符合[0：不符合；1：符合]
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsMatch 是否符合[0：不符合；1：符合]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsMatch(Long IsMatch) {
        this.IsMatch = IsMatch;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsCheck", this.IsCheck);
        this.setParamSimple(map, prefix + "IsMatch", this.IsMatch);

    }
}

