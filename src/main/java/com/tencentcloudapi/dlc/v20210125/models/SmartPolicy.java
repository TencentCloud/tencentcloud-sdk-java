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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartPolicy extends AbstractModel {

    /**
    * 基础信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaseInfo")
    @Expose
    private SmartPolicyBaseInfo BaseInfo;

    /**
    * 策略描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Policy")
    @Expose
    private SmartOptimizerPolicy Policy;

    /**
     * Get 基础信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaseInfo 基础信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartPolicyBaseInfo getBaseInfo() {
        return this.BaseInfo;
    }

    /**
     * Set 基础信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaseInfo 基础信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaseInfo(SmartPolicyBaseInfo BaseInfo) {
        this.BaseInfo = BaseInfo;
    }

    /**
     * Get 策略描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Policy 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartOptimizerPolicy getPolicy() {
        return this.Policy;
    }

    /**
     * Set 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Policy 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicy(SmartOptimizerPolicy Policy) {
        this.Policy = Policy;
    }

    public SmartPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartPolicy(SmartPolicy source) {
        if (source.BaseInfo != null) {
            this.BaseInfo = new SmartPolicyBaseInfo(source.BaseInfo);
        }
        if (source.Policy != null) {
            this.Policy = new SmartOptimizerPolicy(source.Policy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BaseInfo.", this.BaseInfo);
        this.setParamObj(map, prefix + "Policy.", this.Policy);

    }
}

