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

public class ActionInfo extends AbstractModel{

    /**
    * 躯体动作识别结果，包含坐着（sit）、站立（stand）和趴睡（sleep）
    */
    @SerializedName("BodyPosture")
    @Expose
    private ActionType BodyPosture;

    /**
    * 举手识别结果，包含举手（hand）和未检测到举手（nothand）
    */
    @SerializedName("Handup")
    @Expose
    private ActionType Handup;

    /**
    * 是否低头识别结果，包含抬头（lookingahead）和未检测到抬头（notlookingahead）
    */
    @SerializedName("LookHead")
    @Expose
    private ActionType LookHead;

    /**
    * 是否写字识别结果，包含写字（write）和未检测到写字（notlookingahead）
    */
    @SerializedName("Writing")
    @Expose
    private ActionType Writing;

    /**
    * 动作图像高度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 动作出现图像的左侧起始坐标位置
    */
    @SerializedName("Left")
    @Expose
    private Long Left;

    /**
    * 动作出现图像的上侧起始侧坐标位置
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * 动作图像宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
     * Get 躯体动作识别结果，包含坐着（sit）、站立（stand）和趴睡（sleep） 
     * @return BodyPosture 躯体动作识别结果，包含坐着（sit）、站立（stand）和趴睡（sleep）
     */
    public ActionType getBodyPosture() {
        return this.BodyPosture;
    }

    /**
     * Set 躯体动作识别结果，包含坐着（sit）、站立（stand）和趴睡（sleep）
     * @param BodyPosture 躯体动作识别结果，包含坐着（sit）、站立（stand）和趴睡（sleep）
     */
    public void setBodyPosture(ActionType BodyPosture) {
        this.BodyPosture = BodyPosture;
    }

    /**
     * Get 举手识别结果，包含举手（hand）和未检测到举手（nothand） 
     * @return Handup 举手识别结果，包含举手（hand）和未检测到举手（nothand）
     */
    public ActionType getHandup() {
        return this.Handup;
    }

    /**
     * Set 举手识别结果，包含举手（hand）和未检测到举手（nothand）
     * @param Handup 举手识别结果，包含举手（hand）和未检测到举手（nothand）
     */
    public void setHandup(ActionType Handup) {
        this.Handup = Handup;
    }

    /**
     * Get 是否低头识别结果，包含抬头（lookingahead）和未检测到抬头（notlookingahead） 
     * @return LookHead 是否低头识别结果，包含抬头（lookingahead）和未检测到抬头（notlookingahead）
     */
    public ActionType getLookHead() {
        return this.LookHead;
    }

    /**
     * Set 是否低头识别结果，包含抬头（lookingahead）和未检测到抬头（notlookingahead）
     * @param LookHead 是否低头识别结果，包含抬头（lookingahead）和未检测到抬头（notlookingahead）
     */
    public void setLookHead(ActionType LookHead) {
        this.LookHead = LookHead;
    }

    /**
     * Get 是否写字识别结果，包含写字（write）和未检测到写字（notlookingahead） 
     * @return Writing 是否写字识别结果，包含写字（write）和未检测到写字（notlookingahead）
     */
    public ActionType getWriting() {
        return this.Writing;
    }

    /**
     * Set 是否写字识别结果，包含写字（write）和未检测到写字（notlookingahead）
     * @param Writing 是否写字识别结果，包含写字（write）和未检测到写字（notlookingahead）
     */
    public void setWriting(ActionType Writing) {
        this.Writing = Writing;
    }

    /**
     * Get 动作图像高度 
     * @return Height 动作图像高度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 动作图像高度
     * @param Height 动作图像高度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 动作出现图像的左侧起始坐标位置 
     * @return Left 动作出现图像的左侧起始坐标位置
     */
    public Long getLeft() {
        return this.Left;
    }

    /**
     * Set 动作出现图像的左侧起始坐标位置
     * @param Left 动作出现图像的左侧起始坐标位置
     */
    public void setLeft(Long Left) {
        this.Left = Left;
    }

    /**
     * Get 动作出现图像的上侧起始侧坐标位置 
     * @return Top 动作出现图像的上侧起始侧坐标位置
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set 动作出现图像的上侧起始侧坐标位置
     * @param Top 动作出现图像的上侧起始侧坐标位置
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get 动作图像宽度 
     * @return Width 动作图像宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 动作图像宽度
     * @param Width 动作图像宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BodyPosture.", this.BodyPosture);
        this.setParamObj(map, prefix + "Handup.", this.Handup);
        this.setParamObj(map, prefix + "LookHead.", this.LookHead);
        this.setParamObj(map, prefix + "Writing.", this.Writing);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Left", this.Left);
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "Width", this.Width);

    }
}

