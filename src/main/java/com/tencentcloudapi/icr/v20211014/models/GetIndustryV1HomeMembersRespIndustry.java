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
package com.tencentcloudapi.icr.v20211014.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetIndustryV1HomeMembersRespIndustry extends AbstractModel{

    /**
    * 行业ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 行业名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndustryName")
    @Expose
    private String IndustryName;

    /**
     * Get 行业ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 行业ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 行业ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 行业ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 行业名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndustryName 行业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndustryName() {
        return this.IndustryName;
    }

    /**
     * Set 行业名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndustryName 行业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndustryName(String IndustryName) {
        this.IndustryName = IndustryName;
    }

    public GetIndustryV1HomeMembersRespIndustry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetIndustryV1HomeMembersRespIndustry(GetIndustryV1HomeMembersRespIndustry source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.IndustryName != null) {
            this.IndustryName = new String(source.IndustryName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "IndustryName", this.IndustryName);

    }
}

