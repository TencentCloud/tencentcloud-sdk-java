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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HstsConfig extends AbstractModel {

    /**
    * <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>有效期，秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxAge")
    @Expose
    private Long MaxAge;

    /**
    * <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncludeSubDomains")
    @Expose
    private String IncludeSubDomains;

    /**
    * <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Preload")
    @Expose
    private String Preload;

    /**
     * Get <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>有效期，秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxAge <p>有效期，秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set <p>有效期，秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxAge <p>有效期，秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxAge(Long MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncludeSubDomains <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIncludeSubDomains() {
        return this.IncludeSubDomains;
    }

    /**
     * Set <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncludeSubDomains <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncludeSubDomains(String IncludeSubDomains) {
        this.IncludeSubDomains = IncludeSubDomains;
    }

    /**
     * Get <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Preload <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPreload() {
        return this.Preload;
    }

    /**
     * Set <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Preload <p>on 或 off</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreload(String Preload) {
        this.Preload = Preload;
    }

    public HstsConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HstsConfig(HstsConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.MaxAge != null) {
            this.MaxAge = new Long(source.MaxAge);
        }
        if (source.IncludeSubDomains != null) {
            this.IncludeSubDomains = new String(source.IncludeSubDomains);
        }
        if (source.Preload != null) {
            this.Preload = new String(source.Preload);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "MaxAge", this.MaxAge);
        this.setParamSimple(map, prefix + "IncludeSubDomains", this.IncludeSubDomains);
        this.setParamSimple(map, prefix + "Preload", this.Preload);

    }
}

