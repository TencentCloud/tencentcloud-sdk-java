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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Box extends AbstractModel{

    /**
    * 图像主体区域。
    */
    @SerializedName("Rect")
    @Expose
    private ImageRect Rect;

    /**
    * 置信度。
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
     * Get 图像主体区域。 
     * @return Rect 图像主体区域。
     */
    public ImageRect getRect() {
        return this.Rect;
    }

    /**
     * Set 图像主体区域。
     * @param Rect 图像主体区域。
     */
    public void setRect(ImageRect Rect) {
        this.Rect = Rect;
    }

    /**
     * Get 置信度。 
     * @return Score 置信度。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 置信度。
     * @param Score 置信度。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    public Box() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Box(Box source) {
        if (source.Rect != null) {
            this.Rect = new ImageRect(source.Rect);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Rect.", this.Rect);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

