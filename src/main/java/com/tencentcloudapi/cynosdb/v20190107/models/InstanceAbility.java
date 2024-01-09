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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAbility extends AbstractModel {

    /**
    * 实例是否支持强制重启，可选值：yes：支持，no：不支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSupportForceRestart")
    @Expose
    private String IsSupportForceRestart;

    /**
    * 不支持强制重启的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NonsupportForceRestartReason")
    @Expose
    private String NonsupportForceRestartReason;

    /**
     * Get 实例是否支持强制重启，可选值：yes：支持，no：不支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSupportForceRestart 实例是否支持强制重启，可选值：yes：支持，no：不支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsSupportForceRestart() {
        return this.IsSupportForceRestart;
    }

    /**
     * Set 实例是否支持强制重启，可选值：yes：支持，no：不支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSupportForceRestart 实例是否支持强制重启，可选值：yes：支持，no：不支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSupportForceRestart(String IsSupportForceRestart) {
        this.IsSupportForceRestart = IsSupportForceRestart;
    }

    /**
     * Get 不支持强制重启的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NonsupportForceRestartReason 不支持强制重启的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNonsupportForceRestartReason() {
        return this.NonsupportForceRestartReason;
    }

    /**
     * Set 不支持强制重启的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param NonsupportForceRestartReason 不支持强制重启的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNonsupportForceRestartReason(String NonsupportForceRestartReason) {
        this.NonsupportForceRestartReason = NonsupportForceRestartReason;
    }

    public InstanceAbility() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAbility(InstanceAbility source) {
        if (source.IsSupportForceRestart != null) {
            this.IsSupportForceRestart = new String(source.IsSupportForceRestart);
        }
        if (source.NonsupportForceRestartReason != null) {
            this.NonsupportForceRestartReason = new String(source.NonsupportForceRestartReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSupportForceRestart", this.IsSupportForceRestart);
        this.setParamSimple(map, prefix + "NonsupportForceRestartReason", this.NonsupportForceRestartReason);

    }
}

