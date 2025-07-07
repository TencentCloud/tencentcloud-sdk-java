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

public class CreateAndDDLSupport extends AbstractModel {

    /**
    * 是否支持select
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportSelect")
    @Expose
    private Boolean SupportSelect;

    /**
    * 是否支持ddl
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportDdl")
    @Expose
    private Boolean SupportDdl;

    /**
     * Get 是否支持select
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportSelect 是否支持select
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportSelect() {
        return this.SupportSelect;
    }

    /**
     * Set 是否支持select
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportSelect 是否支持select
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportSelect(Boolean SupportSelect) {
        this.SupportSelect = SupportSelect;
    }

    /**
     * Get 是否支持ddl
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportDdl 是否支持ddl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportDdl() {
        return this.SupportDdl;
    }

    /**
     * Set 是否支持ddl
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportDdl 是否支持ddl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportDdl(Boolean SupportDdl) {
        this.SupportDdl = SupportDdl;
    }

    public CreateAndDDLSupport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndDDLSupport(CreateAndDDLSupport source) {
        if (source.SupportSelect != null) {
            this.SupportSelect = new Boolean(source.SupportSelect);
        }
        if (source.SupportDdl != null) {
            this.SupportDdl = new Boolean(source.SupportDdl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SupportSelect", this.SupportSelect);
        this.setParamSimple(map, prefix + "SupportDdl", this.SupportDdl);

    }
}

