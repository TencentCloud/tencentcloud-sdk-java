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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Addon extends AbstractModel{

    /**
    * addon名称
    */
    @SerializedName("AddonName")
    @Expose
    private String AddonName;

    /**
    * addon的版本
    */
    @SerializedName("AddonVersion")
    @Expose
    private String AddonVersion;

    /**
    * addon的参数，是一个json格式的base64转码后的字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RawValues")
    @Expose
    private String RawValues;

    /**
    * addon的状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * addon失败的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get addon名称 
     * @return AddonName addon名称
     */
    public String getAddonName() {
        return this.AddonName;
    }

    /**
     * Set addon名称
     * @param AddonName addon名称
     */
    public void setAddonName(String AddonName) {
        this.AddonName = AddonName;
    }

    /**
     * Get addon的版本 
     * @return AddonVersion addon的版本
     */
    public String getAddonVersion() {
        return this.AddonVersion;
    }

    /**
     * Set addon的版本
     * @param AddonVersion addon的版本
     */
    public void setAddonVersion(String AddonVersion) {
        this.AddonVersion = AddonVersion;
    }

    /**
     * Get addon的参数，是一个json格式的base64转码后的字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RawValues addon的参数，是一个json格式的base64转码后的字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRawValues() {
        return this.RawValues;
    }

    /**
     * Set addon的参数，是一个json格式的base64转码后的字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param RawValues addon的参数，是一个json格式的base64转码后的字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRawValues(String RawValues) {
        this.RawValues = RawValues;
    }

    /**
     * Get addon的状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Phase addon的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set addon的状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Phase addon的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get addon失败的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason addon失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set addon失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason addon失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public Addon() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Addon(Addon source) {
        if (source.AddonName != null) {
            this.AddonName = new String(source.AddonName);
        }
        if (source.AddonVersion != null) {
            this.AddonVersion = new String(source.AddonVersion);
        }
        if (source.RawValues != null) {
            this.RawValues = new String(source.RawValues);
        }
        if (source.Phase != null) {
            this.Phase = new String(source.Phase);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddonName", this.AddonName);
        this.setParamSimple(map, prefix + "AddonVersion", this.AddonVersion);
        this.setParamSimple(map, prefix + "RawValues", this.RawValues);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

