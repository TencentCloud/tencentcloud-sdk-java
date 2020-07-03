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

public class BodyMovementResult extends AbstractModel{

    /**
    * 置信度
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 识别结果高度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 识别结果左坐标
    */
    @SerializedName("Left")
    @Expose
    private Long Left;

    /**
    * 老师动作识别结果，包含
1、teach_on_positive_attitude 正面讲解
2、point_to_the_blackboard 指黑板
3、writing_blackboard 写板书
4、other 其他
    */
    @SerializedName("Movements")
    @Expose
    private String Movements;

    /**
    * 识别结果顶坐标
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * 识别结果宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
     * Get 置信度 
     * @return Confidence 置信度
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度
     * @param Confidence 置信度
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 识别结果高度 
     * @return Height 识别结果高度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 识别结果高度
     * @param Height 识别结果高度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 识别结果左坐标 
     * @return Left 识别结果左坐标
     */
    public Long getLeft() {
        return this.Left;
    }

    /**
     * Set 识别结果左坐标
     * @param Left 识别结果左坐标
     */
    public void setLeft(Long Left) {
        this.Left = Left;
    }

    /**
     * Get 老师动作识别结果，包含
1、teach_on_positive_attitude 正面讲解
2、point_to_the_blackboard 指黑板
3、writing_blackboard 写板书
4、other 其他 
     * @return Movements 老师动作识别结果，包含
1、teach_on_positive_attitude 正面讲解
2、point_to_the_blackboard 指黑板
3、writing_blackboard 写板书
4、other 其他
     */
    public String getMovements() {
        return this.Movements;
    }

    /**
     * Set 老师动作识别结果，包含
1、teach_on_positive_attitude 正面讲解
2、point_to_the_blackboard 指黑板
3、writing_blackboard 写板书
4、other 其他
     * @param Movements 老师动作识别结果，包含
1、teach_on_positive_attitude 正面讲解
2、point_to_the_blackboard 指黑板
3、writing_blackboard 写板书
4、other 其他
     */
    public void setMovements(String Movements) {
        this.Movements = Movements;
    }

    /**
     * Get 识别结果顶坐标 
     * @return Top 识别结果顶坐标
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set 识别结果顶坐标
     * @param Top 识别结果顶坐标
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get 识别结果宽度 
     * @return Width 识别结果宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 识别结果宽度
     * @param Width 识别结果宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Left", this.Left);
        this.setParamSimple(map, prefix + "Movements", this.Movements);
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "Width", this.Width);

    }
}

