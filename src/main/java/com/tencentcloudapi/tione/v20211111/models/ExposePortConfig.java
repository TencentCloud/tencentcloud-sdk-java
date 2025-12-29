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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExposePortConfig extends AbstractModel {

    /**
    * 是否开启暴露容器服务端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * vpc id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * clb id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClbId")
    @Expose
    private String ClbId;

    /**
    * clb domain
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClbHost")
    @Expose
    private String ClbHost;

    /**
     * Get 是否开启暴露容器服务端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 是否开启暴露容器服务端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启暴露容器服务端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 是否开启暴露容器服务端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get vpc id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get clb id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClbId clb id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClbId() {
        return this.ClbId;
    }

    /**
     * Set clb id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClbId clb id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClbId(String ClbId) {
        this.ClbId = ClbId;
    }

    /**
     * Get clb domain
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClbHost clb domain
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClbHost() {
        return this.ClbHost;
    }

    /**
     * Set clb domain
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClbHost clb domain
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClbHost(String ClbHost) {
        this.ClbHost = ClbHost;
    }

    public ExposePortConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExposePortConfig(ExposePortConfig source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ClbId != null) {
            this.ClbId = new String(source.ClbId);
        }
        if (source.ClbHost != null) {
            this.ClbHost = new String(source.ClbHost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ClbId", this.ClbId);
        this.setParamSimple(map, prefix + "ClbHost", this.ClbHost);

    }
}

