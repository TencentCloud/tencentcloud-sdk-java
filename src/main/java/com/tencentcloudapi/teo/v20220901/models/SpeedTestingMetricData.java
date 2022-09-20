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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeedTestingMetricData extends AbstractModel{

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点名称。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 源站拨测信息。
    */
    @SerializedName("OriginSpeedTestingInfo")
    @Expose
    private SpeedTestingInfo [] OriginSpeedTestingInfo;

    /**
    * EO 拨测信息。
    */
    @SerializedName("ProxySpeedTestingInfo")
    @Expose
    private SpeedTestingInfo [] ProxySpeedTestingInfo;

    /**
    * 站点状态。
    */
    @SerializedName("SpeedTestingStatus")
    @Expose
    private SpeedTestingStatus SpeedTestingStatus;

    /**
    * 优化建议。
    */
    @SerializedName("OptimizeAction")
    @Expose
    private OptimizeAction [] OptimizeAction;

    /**
    * EO 整体性能，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyLoadTime")
    @Expose
    private Long ProxyLoadTime;

    /**
    * 源站整体性能，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginLoadTime")
    @Expose
    private Long OriginLoadTime;

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 站点名称。 
     * @return ZoneName 站点名称。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称。
     * @param ZoneName 站点名称。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 源站拨测信息。 
     * @return OriginSpeedTestingInfo 源站拨测信息。
     */
    public SpeedTestingInfo [] getOriginSpeedTestingInfo() {
        return this.OriginSpeedTestingInfo;
    }

    /**
     * Set 源站拨测信息。
     * @param OriginSpeedTestingInfo 源站拨测信息。
     */
    public void setOriginSpeedTestingInfo(SpeedTestingInfo [] OriginSpeedTestingInfo) {
        this.OriginSpeedTestingInfo = OriginSpeedTestingInfo;
    }

    /**
     * Get EO 拨测信息。 
     * @return ProxySpeedTestingInfo EO 拨测信息。
     */
    public SpeedTestingInfo [] getProxySpeedTestingInfo() {
        return this.ProxySpeedTestingInfo;
    }

    /**
     * Set EO 拨测信息。
     * @param ProxySpeedTestingInfo EO 拨测信息。
     */
    public void setProxySpeedTestingInfo(SpeedTestingInfo [] ProxySpeedTestingInfo) {
        this.ProxySpeedTestingInfo = ProxySpeedTestingInfo;
    }

    /**
     * Get 站点状态。 
     * @return SpeedTestingStatus 站点状态。
     */
    public SpeedTestingStatus getSpeedTestingStatus() {
        return this.SpeedTestingStatus;
    }

    /**
     * Set 站点状态。
     * @param SpeedTestingStatus 站点状态。
     */
    public void setSpeedTestingStatus(SpeedTestingStatus SpeedTestingStatus) {
        this.SpeedTestingStatus = SpeedTestingStatus;
    }

    /**
     * Get 优化建议。 
     * @return OptimizeAction 优化建议。
     */
    public OptimizeAction [] getOptimizeAction() {
        return this.OptimizeAction;
    }

    /**
     * Set 优化建议。
     * @param OptimizeAction 优化建议。
     */
    public void setOptimizeAction(OptimizeAction [] OptimizeAction) {
        this.OptimizeAction = OptimizeAction;
    }

    /**
     * Get EO 整体性能，单位ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyLoadTime EO 整体性能，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProxyLoadTime() {
        return this.ProxyLoadTime;
    }

    /**
     * Set EO 整体性能，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyLoadTime EO 整体性能，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyLoadTime(Long ProxyLoadTime) {
        this.ProxyLoadTime = ProxyLoadTime;
    }

    /**
     * Get 源站整体性能，单位ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginLoadTime 源站整体性能，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOriginLoadTime() {
        return this.OriginLoadTime;
    }

    /**
     * Set 源站整体性能，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginLoadTime 源站整体性能，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginLoadTime(Long OriginLoadTime) {
        this.OriginLoadTime = OriginLoadTime;
    }

    public SpeedTestingMetricData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedTestingMetricData(SpeedTestingMetricData source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.OriginSpeedTestingInfo != null) {
            this.OriginSpeedTestingInfo = new SpeedTestingInfo[source.OriginSpeedTestingInfo.length];
            for (int i = 0; i < source.OriginSpeedTestingInfo.length; i++) {
                this.OriginSpeedTestingInfo[i] = new SpeedTestingInfo(source.OriginSpeedTestingInfo[i]);
            }
        }
        if (source.ProxySpeedTestingInfo != null) {
            this.ProxySpeedTestingInfo = new SpeedTestingInfo[source.ProxySpeedTestingInfo.length];
            for (int i = 0; i < source.ProxySpeedTestingInfo.length; i++) {
                this.ProxySpeedTestingInfo[i] = new SpeedTestingInfo(source.ProxySpeedTestingInfo[i]);
            }
        }
        if (source.SpeedTestingStatus != null) {
            this.SpeedTestingStatus = new SpeedTestingStatus(source.SpeedTestingStatus);
        }
        if (source.OptimizeAction != null) {
            this.OptimizeAction = new OptimizeAction[source.OptimizeAction.length];
            for (int i = 0; i < source.OptimizeAction.length; i++) {
                this.OptimizeAction[i] = new OptimizeAction(source.OptimizeAction[i]);
            }
        }
        if (source.ProxyLoadTime != null) {
            this.ProxyLoadTime = new Long(source.ProxyLoadTime);
        }
        if (source.OriginLoadTime != null) {
            this.OriginLoadTime = new Long(source.OriginLoadTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamArrayObj(map, prefix + "OriginSpeedTestingInfo.", this.OriginSpeedTestingInfo);
        this.setParamArrayObj(map, prefix + "ProxySpeedTestingInfo.", this.ProxySpeedTestingInfo);
        this.setParamObj(map, prefix + "SpeedTestingStatus.", this.SpeedTestingStatus);
        this.setParamArrayObj(map, prefix + "OptimizeAction.", this.OptimizeAction);
        this.setParamSimple(map, prefix + "ProxyLoadTime", this.ProxyLoadTime);
        this.setParamSimple(map, prefix + "OriginLoadTime", this.OriginLoadTime);

    }
}

