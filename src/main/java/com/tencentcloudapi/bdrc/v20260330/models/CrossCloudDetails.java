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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrossCloudDetails extends AbstractModel {

    /**
    * 源端云名称（跨云对端云名称）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceCloudName")
    @Expose
    private String SourceCloudName;

    /**
    * 目标端云名称（跨云本端云名称）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetCloudName")
    @Expose
    private String TargetCloudName;

    /**
    * 源端云AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceAppId")
    @Expose
    private Long SourceAppId;

    /**
    * 源端云主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceUin")
    @Expose
    private String SourceUin;

    /**
    * 源端云子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceSubAccountUin")
    @Expose
    private String SourceSubAccountUin;

    /**
    * 源端云用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceUserName")
    @Expose
    private String SourceUserName;

    /**
    * 目标端云AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetAppId")
    @Expose
    private Long TargetAppId;

    /**
    * 目标端云主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetUin")
    @Expose
    private String TargetUin;

    /**
    * 目标端云子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetSubAccountUin")
    @Expose
    private String TargetSubAccountUin;

    /**
    * 对端云的地域显示名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerRegionName")
    @Expose
    private String PeerRegionName;

    /**
    * 对端云的可用区显示名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerZoneName")
    @Expose
    private String PeerZoneName;

    /**
    * 对端云的VPC显示名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerVpcName")
    @Expose
    private String PeerVpcName;

    /**
     * Get 源端云名称（跨云对端云名称）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceCloudName 源端云名称（跨云对端云名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceCloudName() {
        return this.SourceCloudName;
    }

    /**
     * Set 源端云名称（跨云对端云名称）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceCloudName 源端云名称（跨云对端云名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceCloudName(String SourceCloudName) {
        this.SourceCloudName = SourceCloudName;
    }

    /**
     * Get 目标端云名称（跨云本端云名称）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetCloudName 目标端云名称（跨云本端云名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetCloudName() {
        return this.TargetCloudName;
    }

    /**
     * Set 目标端云名称（跨云本端云名称）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetCloudName 目标端云名称（跨云本端云名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetCloudName(String TargetCloudName) {
        this.TargetCloudName = TargetCloudName;
    }

    /**
     * Get 源端云AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceAppId 源端云AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceAppId() {
        return this.SourceAppId;
    }

    /**
     * Set 源端云AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceAppId 源端云AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceAppId(Long SourceAppId) {
        this.SourceAppId = SourceAppId;
    }

    /**
     * Get 源端云主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceUin 源端云主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceUin() {
        return this.SourceUin;
    }

    /**
     * Set 源端云主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceUin 源端云主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceUin(String SourceUin) {
        this.SourceUin = SourceUin;
    }

    /**
     * Get 源端云子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceSubAccountUin 源端云子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceSubAccountUin() {
        return this.SourceSubAccountUin;
    }

    /**
     * Set 源端云子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceSubAccountUin 源端云子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceSubAccountUin(String SourceSubAccountUin) {
        this.SourceSubAccountUin = SourceSubAccountUin;
    }

    /**
     * Get 源端云用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceUserName 源端云用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceUserName() {
        return this.SourceUserName;
    }

    /**
     * Set 源端云用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceUserName 源端云用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceUserName(String SourceUserName) {
        this.SourceUserName = SourceUserName;
    }

    /**
     * Get 目标端云AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetAppId 目标端云AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetAppId() {
        return this.TargetAppId;
    }

    /**
     * Set 目标端云AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetAppId 目标端云AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetAppId(Long TargetAppId) {
        this.TargetAppId = TargetAppId;
    }

    /**
     * Get 目标端云主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetUin 目标端云主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set 目标端云主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetUin 目标端云主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetUin(String TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get 目标端云子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetSubAccountUin 目标端云子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetSubAccountUin() {
        return this.TargetSubAccountUin;
    }

    /**
     * Set 目标端云子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetSubAccountUin 目标端云子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetSubAccountUin(String TargetSubAccountUin) {
        this.TargetSubAccountUin = TargetSubAccountUin;
    }

    /**
     * Get 对端云的地域显示名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeerRegionName 对端云的地域显示名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeerRegionName() {
        return this.PeerRegionName;
    }

    /**
     * Set 对端云的地域显示名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerRegionName 对端云的地域显示名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerRegionName(String PeerRegionName) {
        this.PeerRegionName = PeerRegionName;
    }

    /**
     * Get 对端云的可用区显示名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeerZoneName 对端云的可用区显示名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeerZoneName() {
        return this.PeerZoneName;
    }

    /**
     * Set 对端云的可用区显示名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerZoneName 对端云的可用区显示名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerZoneName(String PeerZoneName) {
        this.PeerZoneName = PeerZoneName;
    }

    /**
     * Get 对端云的VPC显示名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeerVpcName 对端云的VPC显示名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeerVpcName() {
        return this.PeerVpcName;
    }

    /**
     * Set 对端云的VPC显示名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerVpcName 对端云的VPC显示名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerVpcName(String PeerVpcName) {
        this.PeerVpcName = PeerVpcName;
    }

    public CrossCloudDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossCloudDetails(CrossCloudDetails source) {
        if (source.SourceCloudName != null) {
            this.SourceCloudName = new String(source.SourceCloudName);
        }
        if (source.TargetCloudName != null) {
            this.TargetCloudName = new String(source.TargetCloudName);
        }
        if (source.SourceAppId != null) {
            this.SourceAppId = new Long(source.SourceAppId);
        }
        if (source.SourceUin != null) {
            this.SourceUin = new String(source.SourceUin);
        }
        if (source.SourceSubAccountUin != null) {
            this.SourceSubAccountUin = new String(source.SourceSubAccountUin);
        }
        if (source.SourceUserName != null) {
            this.SourceUserName = new String(source.SourceUserName);
        }
        if (source.TargetAppId != null) {
            this.TargetAppId = new Long(source.TargetAppId);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new String(source.TargetUin);
        }
        if (source.TargetSubAccountUin != null) {
            this.TargetSubAccountUin = new String(source.TargetSubAccountUin);
        }
        if (source.PeerRegionName != null) {
            this.PeerRegionName = new String(source.PeerRegionName);
        }
        if (source.PeerZoneName != null) {
            this.PeerZoneName = new String(source.PeerZoneName);
        }
        if (source.PeerVpcName != null) {
            this.PeerVpcName = new String(source.PeerVpcName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceCloudName", this.SourceCloudName);
        this.setParamSimple(map, prefix + "TargetCloudName", this.TargetCloudName);
        this.setParamSimple(map, prefix + "SourceAppId", this.SourceAppId);
        this.setParamSimple(map, prefix + "SourceUin", this.SourceUin);
        this.setParamSimple(map, prefix + "SourceSubAccountUin", this.SourceSubAccountUin);
        this.setParamSimple(map, prefix + "SourceUserName", this.SourceUserName);
        this.setParamSimple(map, prefix + "TargetAppId", this.TargetAppId);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "TargetSubAccountUin", this.TargetSubAccountUin);
        this.setParamSimple(map, prefix + "PeerRegionName", this.PeerRegionName);
        this.setParamSimple(map, prefix + "PeerZoneName", this.PeerZoneName);
        this.setParamSimple(map, prefix + "PeerVpcName", this.PeerVpcName);

    }
}

