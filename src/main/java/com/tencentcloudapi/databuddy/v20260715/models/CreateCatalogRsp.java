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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCatalogRsp extends AbstractModel {

    /**
    * 新创建的数据目录的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogId")
    @Expose
    private String CatalogId;

    /**
     * Get 新创建的数据目录的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogId 新创建的数据目录的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogId() {
        return this.CatalogId;
    }

    /**
     * Set 新创建的数据目录的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogId 新创建的数据目录的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogId(String CatalogId) {
        this.CatalogId = CatalogId;
    }

    public CreateCatalogRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCatalogRsp(CreateCatalogRsp source) {
        if (source.CatalogId != null) {
            this.CatalogId = new String(source.CatalogId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogId", this.CatalogId);

    }
}

