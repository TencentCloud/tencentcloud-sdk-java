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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcFwInstanceShow extends AbstractModel {

    /**
    * VPC防火墙实例ID
    */
    @SerializedName("FwInsId")
    @Expose
    private String FwInsId;

    /**
    * VPC防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwInsName")
    @Expose
    private String FwInsName;

    /**
    * 网络经过VPC防火墙CVM所在地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwInsRegion")
    @Expose
    private String FwInsRegion;

    /**
     * Get VPC防火墙实例ID 
     * @return FwInsId VPC防火墙实例ID
     */
    public String getFwInsId() {
        return this.FwInsId;
    }

    /**
     * Set VPC防火墙实例ID
     * @param FwInsId VPC防火墙实例ID
     */
    public void setFwInsId(String FwInsId) {
        this.FwInsId = FwInsId;
    }

    /**
     * Get VPC防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwInsName VPC防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFwInsName() {
        return this.FwInsName;
    }

    /**
     * Set VPC防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwInsName VPC防火墙实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwInsName(String FwInsName) {
        this.FwInsName = FwInsName;
    }

    /**
     * Get 网络经过VPC防火墙CVM所在地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwInsRegion 网络经过VPC防火墙CVM所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFwInsRegion() {
        return this.FwInsRegion;
    }

    /**
     * Set 网络经过VPC防火墙CVM所在地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwInsRegion 网络经过VPC防火墙CVM所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwInsRegion(String FwInsRegion) {
        this.FwInsRegion = FwInsRegion;
    }

    public VpcFwInstanceShow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcFwInstanceShow(VpcFwInstanceShow source) {
        if (source.FwInsId != null) {
            this.FwInsId = new String(source.FwInsId);
        }
        if (source.FwInsName != null) {
            this.FwInsName = new String(source.FwInsName);
        }
        if (source.FwInsRegion != null) {
            this.FwInsRegion = new String(source.FwInsRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FwInsId", this.FwInsId);
        this.setParamSimple(map, prefix + "FwInsName", this.FwInsName);
        this.setParamSimple(map, prefix + "FwInsRegion", this.FwInsRegion);

    }
}

