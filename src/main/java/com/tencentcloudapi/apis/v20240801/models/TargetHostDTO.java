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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetHostDTO extends AbstractModel {

    /**
    * 服务器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 权重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rank")
    @Expose
    private Long Rank;

    /**
     * Get 服务器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host 服务器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 服务器
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host 服务器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 权重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rank 权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRank() {
        return this.Rank;
    }

    /**
     * Set 权重
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rank 权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRank(Long Rank) {
        this.Rank = Rank;
    }

    public TargetHostDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetHostDTO(TargetHostDTO source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Rank != null) {
            this.Rank = new Long(source.Rank);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Rank", this.Rank);

    }
}

