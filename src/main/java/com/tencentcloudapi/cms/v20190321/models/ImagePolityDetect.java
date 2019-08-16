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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImagePolityDetect  extends AbstractModel{

    /**
    * 恶意类型
100：正常 
20001：政治
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 处置判定  0：正常 1：可疑
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * 命中的人脸名称
    */
    @SerializedName("FaceNames")
    @Expose
    private String [] FaceNames;

    /**
    * 关键词明细
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 命中的政治物品名称
    */
    @SerializedName("PolityItems")
    @Expose
    private String [] PolityItems;

    /**
    * 政治（人脸）分：分值范围 0-100，分数越高可疑程度越高
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * 获取恶意类型
100：正常 
20001：政治
     * @return EvilType 恶意类型
100：正常 
20001：政治
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * 设置恶意类型
100：正常 
20001：政治
     * @param EvilType 恶意类型
100：正常 
20001：政治
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * 获取处置判定  0：正常 1：可疑
     * @return HitFlag 处置判定  0：正常 1：可疑
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * 设置处置判定  0：正常 1：可疑
     * @param HitFlag 处置判定  0：正常 1：可疑
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * 获取命中的人脸名称
     * @return FaceNames 命中的人脸名称
     */
    public String [] getFaceNames() {
        return this.FaceNames;
    }

    /**
     * 设置命中的人脸名称
     * @param FaceNames 命中的人脸名称
     */
    public void setFaceNames(String [] FaceNames) {
        this.FaceNames = FaceNames;
    }

    /**
     * 获取关键词明细
     * @return Keywords 关键词明细
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * 设置关键词明细
     * @param Keywords 关键词明细
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * 获取命中的政治物品名称
     * @return PolityItems 命中的政治物品名称
     */
    public String [] getPolityItems() {
        return this.PolityItems;
    }

    /**
     * 设置命中的政治物品名称
     * @param PolityItems 命中的政治物品名称
     */
    public void setPolityItems(String [] PolityItems) {
        this.PolityItems = PolityItems;
    }

    /**
     * 获取政治（人脸）分：分值范围 0-100，分数越高可疑程度越高
     * @return Score 政治（人脸）分：分值范围 0-100，分数越高可疑程度越高
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * 设置政治（人脸）分：分值范围 0-100，分数越高可疑程度越高
     * @param Score 政治（人脸）分：分值范围 0-100，分数越高可疑程度越高
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamArraySimple(map, prefix + "FaceNames.", this.FaceNames);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamArraySimple(map, prefix + "PolityItems.", this.PolityItems);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

