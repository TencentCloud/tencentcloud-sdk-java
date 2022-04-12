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

public class GetIndustryV1HomeMembersRespFeature extends AbstractModel{

    /**
    * 功能名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeatureName")
    @Expose
    private String FeatureName;

    /**
    * 功能ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
     * Get 功能名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeatureName 功能名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFeatureName() {
        return this.FeatureName;
    }

    /**
     * Set 功能名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeatureName 功能名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeatureName(String FeatureName) {
        this.FeatureName = FeatureName;
    }

    /**
     * Get 功能ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 功能ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 功能ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 功能ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    public GetIndustryV1HomeMembersRespFeature() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetIndustryV1HomeMembersRespFeature(GetIndustryV1HomeMembersRespFeature source) {
        if (source.FeatureName != null) {
            this.FeatureName = new String(source.FeatureName);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FeatureName", this.FeatureName);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

