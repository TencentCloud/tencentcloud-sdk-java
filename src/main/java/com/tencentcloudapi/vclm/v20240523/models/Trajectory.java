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

public class Trajectory extends AbstractModel {

    /**
    * 轨迹点横坐标（在像素二维坐标系下，以输入图片image左下为原点的像素坐标）
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * 轨迹点纵坐标（在像素二维坐标系下，以输入图片image左下为原点的像素坐标）
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
     * Get 轨迹点横坐标（在像素二维坐标系下，以输入图片image左下为原点的像素坐标） 
     * @return X 轨迹点横坐标（在像素二维坐标系下，以输入图片image左下为原点的像素坐标）
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set 轨迹点横坐标（在像素二维坐标系下，以输入图片image左下为原点的像素坐标）
     * @param X 轨迹点横坐标（在像素二维坐标系下，以输入图片image左下为原点的像素坐标）
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get 轨迹点纵坐标（在像素二维坐标系下，以输入图片image左下为原点的像素坐标） 
     * @return Y 轨迹点纵坐标（在像素二维坐标系下，以输入图片image左下为原点的像素坐标）
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set 轨迹点纵坐标（在像素二维坐标系下，以输入图片image左下为原点的像素坐标）
     * @param Y 轨迹点纵坐标（在像素二维坐标系下，以输入图片image左下为原点的像素坐标）
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    public Trajectory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Trajectory(Trajectory source) {
        if (source.X != null) {
            this.X = new Long(source.X);
        }
        if (source.Y != null) {
            this.Y = new Long(source.Y);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);

    }
}

