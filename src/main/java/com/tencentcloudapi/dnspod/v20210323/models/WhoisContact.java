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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhoisContact extends AbstractModel{

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Admin")
    @Expose
    private WhoisContactAddress Admin;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Billing")
    @Expose
    private WhoisContactAddress Billing;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Registrant")
    @Expose
    private WhoisContactAddress Registrant;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tech")
    @Expose
    private WhoisContactAddress Tech;

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Admin 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WhoisContactAddress getAdmin() {
        return this.Admin;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param Admin 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdmin(WhoisContactAddress Admin) {
        this.Admin = Admin;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Billing 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WhoisContactAddress getBilling() {
        return this.Billing;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param Billing 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBilling(WhoisContactAddress Billing) {
        this.Billing = Billing;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Registrant 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WhoisContactAddress getRegistrant() {
        return this.Registrant;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param Registrant 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistrant(WhoisContactAddress Registrant) {
        this.Registrant = Registrant;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tech 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WhoisContactAddress getTech() {
        return this.Tech;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tech 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTech(WhoisContactAddress Tech) {
        this.Tech = Tech;
    }

    public WhoisContact() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhoisContact(WhoisContact source) {
        if (source.Admin != null) {
            this.Admin = new WhoisContactAddress(source.Admin);
        }
        if (source.Billing != null) {
            this.Billing = new WhoisContactAddress(source.Billing);
        }
        if (source.Registrant != null) {
            this.Registrant = new WhoisContactAddress(source.Registrant);
        }
        if (source.Tech != null) {
            this.Tech = new WhoisContactAddress(source.Tech);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Admin.", this.Admin);
        this.setParamObj(map, prefix + "Billing.", this.Billing);
        this.setParamObj(map, prefix + "Registrant.", this.Registrant);
        this.setParamObj(map, prefix + "Tech.", this.Tech);

    }
}

