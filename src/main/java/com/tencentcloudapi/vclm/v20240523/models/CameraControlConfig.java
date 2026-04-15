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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CameraControlConfig extends AbstractModel {

    /**
    * 水平运镜，控制摄像机在水平方向上的移动量（沿x轴平移）

取值范围：[-10, 10]，负值表示向左平移，正值表示向右平移
    */
    @SerializedName("Horizontal")
    @Expose
    private Float Horizontal;

    /**
    * 垂直运镜，控制摄像机在垂直方向上的移动量（沿y轴平移）

取值范围：[-10, 10]，负值表示向下平移，正值表示向上平移
    */
    @SerializedName("Vertical")
    @Expose
    private Float Vertical;

    /**
    * 水平摇镜，控制摄像机在水平面上的旋转量（绕y轴旋转）

取值范围：[-10, 10]，负值表示绕y轴向左旋转，正值表示绕y轴向右旋转
    */
    @SerializedName("Pan")
    @Expose
    private Float Pan;

    /**
    * 垂直摇镜，控制摄像机在垂直面上的旋转量（沿x轴旋转）

取值范围：[-10, 10]，负值表示绕x轴向下旋转，正值表示绕x轴向上旋转
    */
    @SerializedName("Tilt")
    @Expose
    private Float Tilt;

    /**
    * 旋转运镜，控制摄像机的滚动量（绕z轴旋转）

取值范围：[-10, 10]，负值表示绕z轴逆时针旋转，正值表示绕z轴顺时针旋转
    */
    @SerializedName("Roll")
    @Expose
    private Float Roll;

    /**
    * 变焦，控制摄像机的焦距变化，影响视野的远近

取值范围：[-10, 10]，负值表示焦距变长、视野范围变小，正值表示焦距变短、视野范围变大
    */
    @SerializedName("Zoom")
    @Expose
    private Float Zoom;

    /**
     * Get 水平运镜，控制摄像机在水平方向上的移动量（沿x轴平移）

取值范围：[-10, 10]，负值表示向左平移，正值表示向右平移 
     * @return Horizontal 水平运镜，控制摄像机在水平方向上的移动量（沿x轴平移）

取值范围：[-10, 10]，负值表示向左平移，正值表示向右平移
     */
    public Float getHorizontal() {
        return this.Horizontal;
    }

    /**
     * Set 水平运镜，控制摄像机在水平方向上的移动量（沿x轴平移）

取值范围：[-10, 10]，负值表示向左平移，正值表示向右平移
     * @param Horizontal 水平运镜，控制摄像机在水平方向上的移动量（沿x轴平移）

取值范围：[-10, 10]，负值表示向左平移，正值表示向右平移
     */
    public void setHorizontal(Float Horizontal) {
        this.Horizontal = Horizontal;
    }

    /**
     * Get 垂直运镜，控制摄像机在垂直方向上的移动量（沿y轴平移）

取值范围：[-10, 10]，负值表示向下平移，正值表示向上平移 
     * @return Vertical 垂直运镜，控制摄像机在垂直方向上的移动量（沿y轴平移）

取值范围：[-10, 10]，负值表示向下平移，正值表示向上平移
     */
    public Float getVertical() {
        return this.Vertical;
    }

    /**
     * Set 垂直运镜，控制摄像机在垂直方向上的移动量（沿y轴平移）

取值范围：[-10, 10]，负值表示向下平移，正值表示向上平移
     * @param Vertical 垂直运镜，控制摄像机在垂直方向上的移动量（沿y轴平移）

取值范围：[-10, 10]，负值表示向下平移，正值表示向上平移
     */
    public void setVertical(Float Vertical) {
        this.Vertical = Vertical;
    }

    /**
     * Get 水平摇镜，控制摄像机在水平面上的旋转量（绕y轴旋转）

取值范围：[-10, 10]，负值表示绕y轴向左旋转，正值表示绕y轴向右旋转 
     * @return Pan 水平摇镜，控制摄像机在水平面上的旋转量（绕y轴旋转）

取值范围：[-10, 10]，负值表示绕y轴向左旋转，正值表示绕y轴向右旋转
     */
    public Float getPan() {
        return this.Pan;
    }

    /**
     * Set 水平摇镜，控制摄像机在水平面上的旋转量（绕y轴旋转）

取值范围：[-10, 10]，负值表示绕y轴向左旋转，正值表示绕y轴向右旋转
     * @param Pan 水平摇镜，控制摄像机在水平面上的旋转量（绕y轴旋转）

取值范围：[-10, 10]，负值表示绕y轴向左旋转，正值表示绕y轴向右旋转
     */
    public void setPan(Float Pan) {
        this.Pan = Pan;
    }

    /**
     * Get 垂直摇镜，控制摄像机在垂直面上的旋转量（沿x轴旋转）

取值范围：[-10, 10]，负值表示绕x轴向下旋转，正值表示绕x轴向上旋转 
     * @return Tilt 垂直摇镜，控制摄像机在垂直面上的旋转量（沿x轴旋转）

取值范围：[-10, 10]，负值表示绕x轴向下旋转，正值表示绕x轴向上旋转
     */
    public Float getTilt() {
        return this.Tilt;
    }

    /**
     * Set 垂直摇镜，控制摄像机在垂直面上的旋转量（沿x轴旋转）

取值范围：[-10, 10]，负值表示绕x轴向下旋转，正值表示绕x轴向上旋转
     * @param Tilt 垂直摇镜，控制摄像机在垂直面上的旋转量（沿x轴旋转）

取值范围：[-10, 10]，负值表示绕x轴向下旋转，正值表示绕x轴向上旋转
     */
    public void setTilt(Float Tilt) {
        this.Tilt = Tilt;
    }

    /**
     * Get 旋转运镜，控制摄像机的滚动量（绕z轴旋转）

取值范围：[-10, 10]，负值表示绕z轴逆时针旋转，正值表示绕z轴顺时针旋转 
     * @return Roll 旋转运镜，控制摄像机的滚动量（绕z轴旋转）

取值范围：[-10, 10]，负值表示绕z轴逆时针旋转，正值表示绕z轴顺时针旋转
     */
    public Float getRoll() {
        return this.Roll;
    }

    /**
     * Set 旋转运镜，控制摄像机的滚动量（绕z轴旋转）

取值范围：[-10, 10]，负值表示绕z轴逆时针旋转，正值表示绕z轴顺时针旋转
     * @param Roll 旋转运镜，控制摄像机的滚动量（绕z轴旋转）

取值范围：[-10, 10]，负值表示绕z轴逆时针旋转，正值表示绕z轴顺时针旋转
     */
    public void setRoll(Float Roll) {
        this.Roll = Roll;
    }

    /**
     * Get 变焦，控制摄像机的焦距变化，影响视野的远近

取值范围：[-10, 10]，负值表示焦距变长、视野范围变小，正值表示焦距变短、视野范围变大 
     * @return Zoom 变焦，控制摄像机的焦距变化，影响视野的远近

取值范围：[-10, 10]，负值表示焦距变长、视野范围变小，正值表示焦距变短、视野范围变大
     */
    public Float getZoom() {
        return this.Zoom;
    }

    /**
     * Set 变焦，控制摄像机的焦距变化，影响视野的远近

取值范围：[-10, 10]，负值表示焦距变长、视野范围变小，正值表示焦距变短、视野范围变大
     * @param Zoom 变焦，控制摄像机的焦距变化，影响视野的远近

取值范围：[-10, 10]，负值表示焦距变长、视野范围变小，正值表示焦距变短、视野范围变大
     */
    public void setZoom(Float Zoom) {
        this.Zoom = Zoom;
    }

    public CameraControlConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CameraControlConfig(CameraControlConfig source) {
        if (source.Horizontal != null) {
            this.Horizontal = new Float(source.Horizontal);
        }
        if (source.Vertical != null) {
            this.Vertical = new Float(source.Vertical);
        }
        if (source.Pan != null) {
            this.Pan = new Float(source.Pan);
        }
        if (source.Tilt != null) {
            this.Tilt = new Float(source.Tilt);
        }
        if (source.Roll != null) {
            this.Roll = new Float(source.Roll);
        }
        if (source.Zoom != null) {
            this.Zoom = new Float(source.Zoom);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Horizontal", this.Horizontal);
        this.setParamSimple(map, prefix + "Vertical", this.Vertical);
        this.setParamSimple(map, prefix + "Pan", this.Pan);
        this.setParamSimple(map, prefix + "Tilt", this.Tilt);
        this.setParamSimple(map, prefix + "Roll", this.Roll);
        this.setParamSimple(map, prefix + "Zoom", this.Zoom);

    }
}

