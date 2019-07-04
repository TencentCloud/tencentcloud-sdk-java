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

public class FacePoseResult  extends AbstractModel{

    /**
    * 正脸或侧脸的消息
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * Pitch
    */
    @SerializedName("Pitch")
    @Expose
    private Float Pitch;

    /**
    * Roll
    */
    @SerializedName("Roll")
    @Expose
    private Float Roll;

    /**
    * 角度信息选填
    */
    @SerializedName("Yaw")
    @Expose
    private Float Yaw;

    /**
     * 获取正脸或侧脸的消息
     * @return Direction 正脸或侧脸的消息
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * 设置正脸或侧脸的消息
     * @param Direction 正脸或侧脸的消息
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * 获取Pitch
     * @return Pitch Pitch
     */
    public Float getPitch() {
        return this.Pitch;
    }

    /**
     * 设置Pitch
     * @param Pitch Pitch
     */
    public void setPitch(Float Pitch) {
        this.Pitch = Pitch;
    }

    /**
     * 获取Roll
     * @return Roll Roll
     */
    public Float getRoll() {
        return this.Roll;
    }

    /**
     * 设置Roll
     * @param Roll Roll
     */
    public void setRoll(Float Roll) {
        this.Roll = Roll;
    }

    /**
     * 获取角度信息选填
     * @return Yaw 角度信息选填
     */
    public Float getYaw() {
        return this.Yaw;
    }

    /**
     * 设置角度信息选填
     * @param Yaw 角度信息选填
     */
    public void setYaw(Float Yaw) {
        this.Yaw = Yaw;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Pitch", this.Pitch);
        this.setParamSimple(map, prefix + "Roll", this.Roll);
        this.setParamSimple(map, prefix + "Yaw", this.Yaw);

    }
}

