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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicy extends AbstractModel {

    /**
    * ip或者网段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Route")
    @Expose
    private String Route;

    /**
    * 策略 true就是允许，白名单或者 false 拒绝 黑名单

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Policy")
    @Expose
    private Boolean Policy;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get ip或者网段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Route ip或者网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoute() {
        return this.Route;
    }

    /**
     * Set ip或者网段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Route ip或者网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoute(String Route) {
        this.Route = Route;
    }

    /**
     * Get 策略 true就是允许，白名单或者 false 拒绝 黑名单

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Policy 策略 true就是允许，白名单或者 false 拒绝 黑名单

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPolicy() {
        return this.Policy;
    }

    /**
     * Set 策略 true就是允许，白名单或者 false 拒绝 黑名单

注意：此字段可能返回 null，表示取不到有效值。
     * @param Policy 策略 true就是允许，白名单或者 false 拒绝 黑名单

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicy(Boolean Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public SecurityPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicy(SecurityPolicy source) {
        if (source.Route != null) {
            this.Route = new String(source.Route);
        }
        if (source.Policy != null) {
            this.Policy = new Boolean(source.Policy);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Route", this.Route);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

