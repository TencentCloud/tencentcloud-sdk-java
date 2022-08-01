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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Stage extends AbstractModel{

    /**
    * 施压时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
    * 虚拟用户数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetVirtualUsers")
    @Expose
    private Long TargetVirtualUsers;

    /**
     * Get 施压时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DurationSeconds 施压时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set 施压时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DurationSeconds 施压时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    /**
     * Get 虚拟用户数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetVirtualUsers 虚拟用户数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetVirtualUsers() {
        return this.TargetVirtualUsers;
    }

    /**
     * Set 虚拟用户数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetVirtualUsers 虚拟用户数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetVirtualUsers(Long TargetVirtualUsers) {
        this.TargetVirtualUsers = TargetVirtualUsers;
    }

    public Stage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Stage(Stage source) {
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
        if (source.TargetVirtualUsers != null) {
            this.TargetVirtualUsers = new Long(source.TargetVirtualUsers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);
        this.setParamSimple(map, prefix + "TargetVirtualUsers", this.TargetVirtualUsers);

    }
}

