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

public class StudentBodyMovementResult extends AbstractModel{

    /**
    * 置信度（已废弃）
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 举手识别结果置信度
    */
    @SerializedName("HandupConfidence")
    @Expose
    private Float HandupConfidence;

    /**
    * 举手识别结果，包含举手（handup）和未举手（nothandup）
    */
    @SerializedName("HandupStatus")
    @Expose
    private String HandupStatus;

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
    * 动作识别结果（已废弃）
    */
    @SerializedName("Movements")
    @Expose
    private String Movements;

    /**
    * 站立识别结果置信度
    */
    @SerializedName("StandConfidence")
    @Expose
    private Float StandConfidence;

    /**
    * 站立识别结果，包含站立（stand）和坐着（sit）
    */
    @SerializedName("StandStatus")
    @Expose
    private String StandStatus;

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
     * Get 置信度（已废弃） 
     * @return Confidence 置信度（已废弃）
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度（已废弃）
     * @param Confidence 置信度（已废弃）
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 举手识别结果置信度 
     * @return HandupConfidence 举手识别结果置信度
     */
    public Float getHandupConfidence() {
        return this.HandupConfidence;
    }

    /**
     * Set 举手识别结果置信度
     * @param HandupConfidence 举手识别结果置信度
     */
    public void setHandupConfidence(Float HandupConfidence) {
        this.HandupConfidence = HandupConfidence;
    }

    /**
     * Get 举手识别结果，包含举手（handup）和未举手（nothandup） 
     * @return HandupStatus 举手识别结果，包含举手（handup）和未举手（nothandup）
     */
    public String getHandupStatus() {
        return this.HandupStatus;
    }

    /**
     * Set 举手识别结果，包含举手（handup）和未举手（nothandup）
     * @param HandupStatus 举手识别结果，包含举手（handup）和未举手（nothandup）
     */
    public void setHandupStatus(String HandupStatus) {
        this.HandupStatus = HandupStatus;
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
     * Get 动作识别结果（已废弃） 
     * @return Movements 动作识别结果（已废弃）
     */
    public String getMovements() {
        return this.Movements;
    }

    /**
     * Set 动作识别结果（已废弃）
     * @param Movements 动作识别结果（已废弃）
     */
    public void setMovements(String Movements) {
        this.Movements = Movements;
    }

    /**
     * Get 站立识别结果置信度 
     * @return StandConfidence 站立识别结果置信度
     */
    public Float getStandConfidence() {
        return this.StandConfidence;
    }

    /**
     * Set 站立识别结果置信度
     * @param StandConfidence 站立识别结果置信度
     */
    public void setStandConfidence(Float StandConfidence) {
        this.StandConfidence = StandConfidence;
    }

    /**
     * Get 站立识别结果，包含站立（stand）和坐着（sit） 
     * @return StandStatus 站立识别结果，包含站立（stand）和坐着（sit）
     */
    public String getStandStatus() {
        return this.StandStatus;
    }

    /**
     * Set 站立识别结果，包含站立（stand）和坐着（sit）
     * @param StandStatus 站立识别结果，包含站立（stand）和坐着（sit）
     */
    public void setStandStatus(String StandStatus) {
        this.StandStatus = StandStatus;
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
        this.setParamSimple(map, prefix + "HandupConfidence", this.HandupConfidence);
        this.setParamSimple(map, prefix + "HandupStatus", this.HandupStatus);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Left", this.Left);
        this.setParamSimple(map, prefix + "Movements", this.Movements);
        this.setParamSimple(map, prefix + "StandConfidence", this.StandConfidence);
        this.setParamSimple(map, prefix + "StandStatus", this.StandStatus);
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "Width", this.Width);

    }
}

