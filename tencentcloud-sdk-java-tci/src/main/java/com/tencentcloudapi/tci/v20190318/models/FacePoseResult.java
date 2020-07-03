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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FacePoseResult extends AbstractModel{

    /**
    * 正脸或侧脸的消息
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 围绕Z轴旋转角度，俯仰角
    */
    @SerializedName("Pitch")
    @Expose
    private Float Pitch;

    /**
    * 围绕X轴旋转角度，翻滚角
    */
    @SerializedName("Roll")
    @Expose
    private Float Roll;

    /**
    * 围绕Y轴旋转角度，偏航角
    */
    @SerializedName("Yaw")
    @Expose
    private Float Yaw;

    /**
     * Get 正脸或侧脸的消息 
     * @return Direction 正脸或侧脸的消息
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 正脸或侧脸的消息
     * @param Direction 正脸或侧脸的消息
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 围绕Z轴旋转角度，俯仰角 
     * @return Pitch 围绕Z轴旋转角度，俯仰角
     */
    public Float getPitch() {
        return this.Pitch;
    }

    /**
     * Set 围绕Z轴旋转角度，俯仰角
     * @param Pitch 围绕Z轴旋转角度，俯仰角
     */
    public void setPitch(Float Pitch) {
        this.Pitch = Pitch;
    }

    /**
     * Get 围绕X轴旋转角度，翻滚角 
     * @return Roll 围绕X轴旋转角度，翻滚角
     */
    public Float getRoll() {
        return this.Roll;
    }

    /**
     * Set 围绕X轴旋转角度，翻滚角
     * @param Roll 围绕X轴旋转角度，翻滚角
     */
    public void setRoll(Float Roll) {
        this.Roll = Roll;
    }

    /**
     * Get 围绕Y轴旋转角度，偏航角 
     * @return Yaw 围绕Y轴旋转角度，偏航角
     */
    public Float getYaw() {
        return this.Yaw;
    }

    /**
     * Set 围绕Y轴旋转角度，偏航角
     * @param Yaw 围绕Y轴旋转角度，偏航角
     */
    public void setYaw(Float Yaw) {
        this.Yaw = Yaw;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Pitch", this.Pitch);
        this.setParamSimple(map, prefix + "Roll", this.Roll);
        this.setParamSimple(map, prefix + "Yaw", this.Yaw);

    }
}

