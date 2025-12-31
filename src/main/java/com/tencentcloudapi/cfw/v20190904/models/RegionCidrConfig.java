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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionCidrConfig extends AbstractModel {

    /**
    * 引流地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * CIDR模式：0-跳过，1-自动，2-自定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CidrMode")
    @Expose
    private Long CidrMode;

    /**
    * 自定义CIDR（CidrMode=2时必填），其它时候为空字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomCidr")
    @Expose
    private String CustomCidr;

    /**
     * Get 引流地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 引流地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 引流地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 引流地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get CIDR模式：0-跳过，1-自动，2-自定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CidrMode CIDR模式：0-跳过，1-自动，2-自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCidrMode() {
        return this.CidrMode;
    }

    /**
     * Set CIDR模式：0-跳过，1-自动，2-自定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param CidrMode CIDR模式：0-跳过，1-自动，2-自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCidrMode(Long CidrMode) {
        this.CidrMode = CidrMode;
    }

    /**
     * Get 自定义CIDR（CidrMode=2时必填），其它时候为空字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomCidr 自定义CIDR（CidrMode=2时必填），其它时候为空字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomCidr() {
        return this.CustomCidr;
    }

    /**
     * Set 自定义CIDR（CidrMode=2时必填），其它时候为空字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomCidr 自定义CIDR（CidrMode=2时必填），其它时候为空字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomCidr(String CustomCidr) {
        this.CustomCidr = CustomCidr;
    }

    public RegionCidrConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionCidrConfig(RegionCidrConfig source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CidrMode != null) {
            this.CidrMode = new Long(source.CidrMode);
        }
        if (source.CustomCidr != null) {
            this.CustomCidr = new String(source.CustomCidr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CidrMode", this.CidrMode);
        this.setParamSimple(map, prefix + "CustomCidr", this.CustomCidr);

    }
}

