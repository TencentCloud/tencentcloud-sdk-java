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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonIdOpsDto extends AbstractModel {

    /**
    * 返回补录计划名称_ok
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 补录计划Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MakeId")
    @Expose
    private String MakeId;

    /**
     * Get 返回补录计划名称_ok
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 返回补录计划名称_ok
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 返回补录计划名称_ok
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 返回补录计划名称_ok
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 补录计划Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MakeId 补录计划Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMakeId() {
        return this.MakeId;
    }

    /**
     * Set 补录计划Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param MakeId 补录计划Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMakeId(String MakeId) {
        this.MakeId = MakeId;
    }

    public CommonIdOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonIdOpsDto(CommonIdOpsDto source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.MakeId != null) {
            this.MakeId = new String(source.MakeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MakeId", this.MakeId);

    }
}

