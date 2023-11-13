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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceShadowInfo extends AbstractModel {

    /**
    * 设备ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WID")
    @Expose
    private String WID;

    /**
    * 设备影子数据,返回有效数据为"x-json:"后字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceShadow")
    @Expose
    private String DeviceShadow;

    /**
    * 设备影子更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceShadowUpdateTime")
    @Expose
    private String DeviceShadowUpdateTime;

    /**
     * Get 设备ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WID 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWID() {
        return this.WID;
    }

    /**
     * Set 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WID 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWID(String WID) {
        this.WID = WID;
    }

    /**
     * Get 设备影子数据,返回有效数据为"x-json:"后字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceShadow 设备影子数据,返回有效数据为"x-json:"后字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceShadow() {
        return this.DeviceShadow;
    }

    /**
     * Set 设备影子数据,返回有效数据为"x-json:"后字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceShadow 设备影子数据,返回有效数据为"x-json:"后字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceShadow(String DeviceShadow) {
        this.DeviceShadow = DeviceShadow;
    }

    /**
     * Get 设备影子更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceShadowUpdateTime 设备影子更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceShadowUpdateTime() {
        return this.DeviceShadowUpdateTime;
    }

    /**
     * Set 设备影子更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceShadowUpdateTime 设备影子更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceShadowUpdateTime(String DeviceShadowUpdateTime) {
        this.DeviceShadowUpdateTime = DeviceShadowUpdateTime;
    }

    public DeviceShadowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceShadowInfo(DeviceShadowInfo source) {
        if (source.WID != null) {
            this.WID = new String(source.WID);
        }
        if (source.DeviceShadow != null) {
            this.DeviceShadow = new String(source.DeviceShadow);
        }
        if (source.DeviceShadowUpdateTime != null) {
            this.DeviceShadowUpdateTime = new String(source.DeviceShadowUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WID", this.WID);
        this.setParamSimple(map, prefix + "DeviceShadow", this.DeviceShadow);
        this.setParamSimple(map, prefix + "DeviceShadowUpdateTime", this.DeviceShadowUpdateTime);

    }
}

