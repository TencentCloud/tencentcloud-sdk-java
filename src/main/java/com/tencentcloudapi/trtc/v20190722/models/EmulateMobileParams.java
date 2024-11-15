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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmulateMobileParams extends AbstractModel {

    /**
    * 移动设备类型，
0: 手机
1: 平板
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MobileDeviceType")
    @Expose
    private Long MobileDeviceType;

    /**
    * 屏幕方向，
0: 竖屏，
1: 横屏
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScreenOrientation")
    @Expose
    private Long ScreenOrientation;

    /**
     * Get 移动设备类型，
0: 手机
1: 平板
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MobileDeviceType 移动设备类型，
0: 手机
1: 平板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMobileDeviceType() {
        return this.MobileDeviceType;
    }

    /**
     * Set 移动设备类型，
0: 手机
1: 平板
注意：此字段可能返回 null，表示取不到有效值。
     * @param MobileDeviceType 移动设备类型，
0: 手机
1: 平板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMobileDeviceType(Long MobileDeviceType) {
        this.MobileDeviceType = MobileDeviceType;
    }

    /**
     * Get 屏幕方向，
0: 竖屏，
1: 横屏
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScreenOrientation 屏幕方向，
0: 竖屏，
1: 横屏
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScreenOrientation() {
        return this.ScreenOrientation;
    }

    /**
     * Set 屏幕方向，
0: 竖屏，
1: 横屏
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScreenOrientation 屏幕方向，
0: 竖屏，
1: 横屏
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScreenOrientation(Long ScreenOrientation) {
        this.ScreenOrientation = ScreenOrientation;
    }

    public EmulateMobileParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmulateMobileParams(EmulateMobileParams source) {
        if (source.MobileDeviceType != null) {
            this.MobileDeviceType = new Long(source.MobileDeviceType);
        }
        if (source.ScreenOrientation != null) {
            this.ScreenOrientation = new Long(source.ScreenOrientation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MobileDeviceType", this.MobileDeviceType);
        this.setParamSimple(map, prefix + "ScreenOrientation", this.ScreenOrientation);

    }
}

