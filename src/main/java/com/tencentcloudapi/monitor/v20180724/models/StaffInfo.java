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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaffInfo extends AbstractModel {

    /**
    * 值班人员id组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StaffIDs")
    @Expose
    private String [] StaffIDs;

    /**
     * Get 值班人员id组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StaffIDs 值班人员id组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getStaffIDs() {
        return this.StaffIDs;
    }

    /**
     * Set 值班人员id组
注意：此字段可能返回 null，表示取不到有效值。
     * @param StaffIDs 值班人员id组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStaffIDs(String [] StaffIDs) {
        this.StaffIDs = StaffIDs;
    }

    public StaffInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffInfo(StaffInfo source) {
        if (source.StaffIDs != null) {
            this.StaffIDs = new String[source.StaffIDs.length];
            for (int i = 0; i < source.StaffIDs.length; i++) {
                this.StaffIDs[i] = new String(source.StaffIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "StaffIDs.", this.StaffIDs);

    }
}

