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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FwGroupIdName extends AbstractModel {

    /**
    * 防火墙(组)ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * 防火墙(组)名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwGroupName")
    @Expose
    private String FwGroupName;

    /**
     * Get 防火墙(组)ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwGroupId 防火墙(组)ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set 防火墙(组)ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwGroupId 防火墙(组)ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get 防火墙(组)名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwGroupName 防火墙(组)名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFwGroupName() {
        return this.FwGroupName;
    }

    /**
     * Set 防火墙(组)名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwGroupName 防火墙(组)名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwGroupName(String FwGroupName) {
        this.FwGroupName = FwGroupName;
    }

    public FwGroupIdName() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FwGroupIdName(FwGroupIdName source) {
        if (source.FwGroupId != null) {
            this.FwGroupId = new String(source.FwGroupId);
        }
        if (source.FwGroupName != null) {
            this.FwGroupName = new String(source.FwGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FwGroupId", this.FwGroupId);
        this.setParamSimple(map, prefix + "FwGroupName", this.FwGroupName);

    }
}

