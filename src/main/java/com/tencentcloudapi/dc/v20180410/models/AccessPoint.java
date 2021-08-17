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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessPoint extends AbstractModel{

    /**
    * 接入点的名称。
    */
    @SerializedName("AccessPointName")
    @Expose
    private String AccessPointName;

    /**
    * 接入点唯一ID。
    */
    @SerializedName("AccessPointId")
    @Expose
    private String AccessPointId;

    /**
    * 接入点的状态。可用，不可用。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 接入点的位置。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 接入点支持的运营商列表。
    */
    @SerializedName("LineOperator")
    @Expose
    private String [] LineOperator;

    /**
    * 接入点管理的大区ID。
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 接入点可用的端口类型列表。1000BASE-T代表千兆电口，1000BASE-LX代表千兆单模光口10km，1000BASE-ZX代表千兆单模光口80km,10GBASE-LR代表万兆单模光口10km,10GBASE-ZR代表万兆单模光口80km,10GBASE-LH代表万兆单模光口40km,100GBASE-LR4代表100G单模光口10km
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailablePortType")
    @Expose
    private String [] AvailablePortType;

    /**
    * 接入点经纬度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Coordinate")
    @Expose
    private Coordinate Coordinate;

    /**
    * 接入点所在城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 接入点地域名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 接入点类型。VXLAN/QCPL/QCAR
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessPointType")
    @Expose
    private String AccessPointType;

    /**
     * Get 接入点的名称。 
     * @return AccessPointName 接入点的名称。
     */
    public String getAccessPointName() {
        return this.AccessPointName;
    }

    /**
     * Set 接入点的名称。
     * @param AccessPointName 接入点的名称。
     */
    public void setAccessPointName(String AccessPointName) {
        this.AccessPointName = AccessPointName;
    }

    /**
     * Get 接入点唯一ID。 
     * @return AccessPointId 接入点唯一ID。
     */
    public String getAccessPointId() {
        return this.AccessPointId;
    }

    /**
     * Set 接入点唯一ID。
     * @param AccessPointId 接入点唯一ID。
     */
    public void setAccessPointId(String AccessPointId) {
        this.AccessPointId = AccessPointId;
    }

    /**
     * Get 接入点的状态。可用，不可用。 
     * @return State 接入点的状态。可用，不可用。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 接入点的状态。可用，不可用。
     * @param State 接入点的状态。可用，不可用。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 接入点的位置。 
     * @return Location 接入点的位置。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 接入点的位置。
     * @param Location 接入点的位置。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 接入点支持的运营商列表。 
     * @return LineOperator 接入点支持的运营商列表。
     */
    public String [] getLineOperator() {
        return this.LineOperator;
    }

    /**
     * Set 接入点支持的运营商列表。
     * @param LineOperator 接入点支持的运营商列表。
     */
    public void setLineOperator(String [] LineOperator) {
        this.LineOperator = LineOperator;
    }

    /**
     * Get 接入点管理的大区ID。 
     * @return RegionId 接入点管理的大区ID。
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 接入点管理的大区ID。
     * @param RegionId 接入点管理的大区ID。
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 接入点可用的端口类型列表。1000BASE-T代表千兆电口，1000BASE-LX代表千兆单模光口10km，1000BASE-ZX代表千兆单模光口80km,10GBASE-LR代表万兆单模光口10km,10GBASE-ZR代表万兆单模光口80km,10GBASE-LH代表万兆单模光口40km,100GBASE-LR4代表100G单模光口10km
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailablePortType 接入点可用的端口类型列表。1000BASE-T代表千兆电口，1000BASE-LX代表千兆单模光口10km，1000BASE-ZX代表千兆单模光口80km,10GBASE-LR代表万兆单模光口10km,10GBASE-ZR代表万兆单模光口80km,10GBASE-LH代表万兆单模光口40km,100GBASE-LR4代表100G单模光口10km
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAvailablePortType() {
        return this.AvailablePortType;
    }

    /**
     * Set 接入点可用的端口类型列表。1000BASE-T代表千兆电口，1000BASE-LX代表千兆单模光口10km，1000BASE-ZX代表千兆单模光口80km,10GBASE-LR代表万兆单模光口10km,10GBASE-ZR代表万兆单模光口80km,10GBASE-LH代表万兆单模光口40km,100GBASE-LR4代表100G单模光口10km
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailablePortType 接入点可用的端口类型列表。1000BASE-T代表千兆电口，1000BASE-LX代表千兆单模光口10km，1000BASE-ZX代表千兆单模光口80km,10GBASE-LR代表万兆单模光口10km,10GBASE-ZR代表万兆单模光口80km,10GBASE-LH代表万兆单模光口40km,100GBASE-LR4代表100G单模光口10km
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailablePortType(String [] AvailablePortType) {
        this.AvailablePortType = AvailablePortType;
    }

    /**
     * Get 接入点经纬度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Coordinate 接入点经纬度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Coordinate getCoordinate() {
        return this.Coordinate;
    }

    /**
     * Set 接入点经纬度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Coordinate 接入点经纬度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoordinate(Coordinate Coordinate) {
        this.Coordinate = Coordinate;
    }

    /**
     * Get 接入点所在城市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return City 接入点所在城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 接入点所在城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param City 接入点所在城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 接入点地域名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Area 接入点地域名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 接入点地域名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Area 接入点地域名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 接入点类型。VXLAN/QCPL/QCAR
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessPointType 接入点类型。VXLAN/QCPL/QCAR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessPointType() {
        return this.AccessPointType;
    }

    /**
     * Set 接入点类型。VXLAN/QCPL/QCAR
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessPointType 接入点类型。VXLAN/QCPL/QCAR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessPointType(String AccessPointType) {
        this.AccessPointType = AccessPointType;
    }

    public AccessPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessPoint(AccessPoint source) {
        if (source.AccessPointName != null) {
            this.AccessPointName = new String(source.AccessPointName);
        }
        if (source.AccessPointId != null) {
            this.AccessPointId = new String(source.AccessPointId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.LineOperator != null) {
            this.LineOperator = new String[source.LineOperator.length];
            for (int i = 0; i < source.LineOperator.length; i++) {
                this.LineOperator[i] = new String(source.LineOperator[i]);
            }
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.AvailablePortType != null) {
            this.AvailablePortType = new String[source.AvailablePortType.length];
            for (int i = 0; i < source.AvailablePortType.length; i++) {
                this.AvailablePortType[i] = new String(source.AvailablePortType[i]);
            }
        }
        if (source.Coordinate != null) {
            this.Coordinate = new Coordinate(source.Coordinate);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.AccessPointType != null) {
            this.AccessPointType = new String(source.AccessPointType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessPointName", this.AccessPointName);
        this.setParamSimple(map, prefix + "AccessPointId", this.AccessPointId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamArraySimple(map, prefix + "LineOperator.", this.LineOperator);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamArraySimple(map, prefix + "AvailablePortType.", this.AvailablePortType);
        this.setParamObj(map, prefix + "Coordinate.", this.Coordinate);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "AccessPointType", this.AccessPointType);

    }
}

