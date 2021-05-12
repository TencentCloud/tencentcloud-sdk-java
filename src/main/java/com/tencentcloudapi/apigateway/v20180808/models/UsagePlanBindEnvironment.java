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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsagePlanBindEnvironment extends AbstractModel{

    /**
    * 环境名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 服务唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
     * Get 环境名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentName 环境名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 环境名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentName 环境名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 服务唯一ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceId 服务唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceId 服务唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public UsagePlanBindEnvironment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsagePlanBindEnvironment(UsagePlanBindEnvironment source) {
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);

    }
}

