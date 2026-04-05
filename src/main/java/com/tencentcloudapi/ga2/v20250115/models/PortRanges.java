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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PortRanges extends AbstractModel {

    /**
    * 起始端口。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromPort")
    @Expose
    private Long FromPort;

    /**
    * 终点端口。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ToPort")
    @Expose
    private Long ToPort;

    /**
     * Get 起始端口。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromPort 起始端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFromPort() {
        return this.FromPort;
    }

    /**
     * Set 起始端口。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromPort 起始端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromPort(Long FromPort) {
        this.FromPort = FromPort;
    }

    /**
     * Get 终点端口。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ToPort 终点端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getToPort() {
        return this.ToPort;
    }

    /**
     * Set 终点端口。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ToPort 终点端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToPort(Long ToPort) {
        this.ToPort = ToPort;
    }

    public PortRanges() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortRanges(PortRanges source) {
        if (source.FromPort != null) {
            this.FromPort = new Long(source.FromPort);
        }
        if (source.ToPort != null) {
            this.ToPort = new Long(source.ToPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromPort", this.FromPort);
        this.setParamSimple(map, prefix + "ToPort", this.ToPort);

    }
}

