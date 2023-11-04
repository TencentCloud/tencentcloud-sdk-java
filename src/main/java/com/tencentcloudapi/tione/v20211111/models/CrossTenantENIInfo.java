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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrossTenantENIInfo extends AbstractModel {

    /**
    * Pod IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrimaryIP")
    @Expose
    private String PrimaryIP;

    /**
    * Pod Port
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
     * Get Pod IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrimaryIP Pod IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrimaryIP() {
        return this.PrimaryIP;
    }

    /**
     * Set Pod IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrimaryIP Pod IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrimaryIP(String PrimaryIP) {
        this.PrimaryIP = PrimaryIP;
    }

    /**
     * Get Pod Port
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port Pod Port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Pod Port
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port Pod Port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    public CrossTenantENIInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossTenantENIInfo(CrossTenantENIInfo source) {
        if (source.PrimaryIP != null) {
            this.PrimaryIP = new String(source.PrimaryIP);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrimaryIP", this.PrimaryIP);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

