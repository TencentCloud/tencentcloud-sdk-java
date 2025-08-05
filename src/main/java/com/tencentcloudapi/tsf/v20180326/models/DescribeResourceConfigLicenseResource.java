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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceConfigLicenseResource extends AbstractModel {

    /**
    * Name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Quota
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
     * Get Name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Quota
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quota Quota
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set Quota
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quota Quota
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
    }

    public DescribeResourceConfigLicenseResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceConfigLicenseResource(DescribeResourceConfigLicenseResource source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Quota != null) {
            this.Quota = new Long(source.Quota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Quota", this.Quota);

    }
}

