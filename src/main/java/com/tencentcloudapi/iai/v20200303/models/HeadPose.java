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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HeadPose extends AbstractModel{

    /**
    * 上下偏移[-30,30]。
    */
    @SerializedName("Pitch")
    @Expose
    private Long Pitch;

    /**
    * 左右偏移[-30,30]。
    */
    @SerializedName("Yaw")
    @Expose
    private Long Yaw;

    /**
    * 平面旋转[-180,180]。
    */
    @SerializedName("Roll")
    @Expose
    private Long Roll;

    /**
     * Get 上下偏移[-30,30]。 
     * @return Pitch 上下偏移[-30,30]。
     */
    public Long getPitch() {
        return this.Pitch;
    }

    /**
     * Set 上下偏移[-30,30]。
     * @param Pitch 上下偏移[-30,30]。
     */
    public void setPitch(Long Pitch) {
        this.Pitch = Pitch;
    }

    /**
     * Get 左右偏移[-30,30]。 
     * @return Yaw 左右偏移[-30,30]。
     */
    public Long getYaw() {
        return this.Yaw;
    }

    /**
     * Set 左右偏移[-30,30]。
     * @param Yaw 左右偏移[-30,30]。
     */
    public void setYaw(Long Yaw) {
        this.Yaw = Yaw;
    }

    /**
     * Get 平面旋转[-180,180]。 
     * @return Roll 平面旋转[-180,180]。
     */
    public Long getRoll() {
        return this.Roll;
    }

    /**
     * Set 平面旋转[-180,180]。
     * @param Roll 平面旋转[-180,180]。
     */
    public void setRoll(Long Roll) {
        this.Roll = Roll;
    }

    public HeadPose() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HeadPose(HeadPose source) {
        if (source.Pitch != null) {
            this.Pitch = new Long(source.Pitch);
        }
        if (source.Yaw != null) {
            this.Yaw = new Long(source.Yaw);
        }
        if (source.Roll != null) {
            this.Roll = new Long(source.Roll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pitch", this.Pitch);
        this.setParamSimple(map, prefix + "Yaw", this.Yaw);
        this.setParamSimple(map, prefix + "Roll", this.Roll);

    }
}

