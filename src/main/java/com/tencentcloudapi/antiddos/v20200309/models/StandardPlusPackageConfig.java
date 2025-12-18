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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandardPlusPackageConfig extends AbstractModel {

    /**
    * 购买高防包所属地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 防护次数：TWO_TIMES:两次全力防 UNLIMITED无限次防
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectCount")
    @Expose
    private String ProtectCount;

    /**
    * 防护IP数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectIpCount")
    @Expose
    private Long ProtectIpCount;

    /**
    * 防护带宽50Mbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 是否开启弹性业务带宽
true 开启
false 不开启 
默认不开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElasticBandwidthFlag")
    @Expose
    private Boolean ElasticBandwidthFlag;

    /**
     * Get 购买高防包所属地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 购买高防包所属地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 购买高防包所属地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 购买高防包所属地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 防护次数：TWO_TIMES:两次全力防 UNLIMITED无限次防
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectCount 防护次数：TWO_TIMES:两次全力防 UNLIMITED无限次防
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtectCount() {
        return this.ProtectCount;
    }

    /**
     * Set 防护次数：TWO_TIMES:两次全力防 UNLIMITED无限次防
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectCount 防护次数：TWO_TIMES:两次全力防 UNLIMITED无限次防
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectCount(String ProtectCount) {
        this.ProtectCount = ProtectCount;
    }

    /**
     * Get 防护IP数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectIpCount 防护IP数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProtectIpCount() {
        return this.ProtectIpCount;
    }

    /**
     * Set 防护IP数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectIpCount 防护IP数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectIpCount(Long ProtectIpCount) {
        this.ProtectIpCount = ProtectIpCount;
    }

    /**
     * Get 防护带宽50Mbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bandwidth 防护带宽50Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 防护带宽50Mbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bandwidth 防护带宽50Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 是否开启弹性业务带宽
true 开启
false 不开启 
默认不开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElasticBandwidthFlag 是否开启弹性业务带宽
true 开启
false 不开启 
默认不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getElasticBandwidthFlag() {
        return this.ElasticBandwidthFlag;
    }

    /**
     * Set 是否开启弹性业务带宽
true 开启
false 不开启 
默认不开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElasticBandwidthFlag 是否开启弹性业务带宽
true 开启
false 不开启 
默认不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElasticBandwidthFlag(Boolean ElasticBandwidthFlag) {
        this.ElasticBandwidthFlag = ElasticBandwidthFlag;
    }

    public StandardPlusPackageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandardPlusPackageConfig(StandardPlusPackageConfig source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ProtectCount != null) {
            this.ProtectCount = new String(source.ProtectCount);
        }
        if (source.ProtectIpCount != null) {
            this.ProtectIpCount = new Long(source.ProtectIpCount);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.ElasticBandwidthFlag != null) {
            this.ElasticBandwidthFlag = new Boolean(source.ElasticBandwidthFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ProtectCount", this.ProtectCount);
        this.setParamSimple(map, prefix + "ProtectIpCount", this.ProtectIpCount);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "ElasticBandwidthFlag", this.ElasticBandwidthFlag);

    }
}

