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

public class ImagePornDetect extends AbstractModel{

    /**
    * 恶意类型
100：正常
20002：色情
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 处置判定 0：正常 1：可疑
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * 关键词明细
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 色情标签：色情特征中文描述
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * 色情分：分值范围 0-100，分数越高色情倾向越明显
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * Get 恶意类型
100：正常
20002：色情 
     * @return EvilType 恶意类型
100：正常
20002：色情
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * Set 恶意类型
100：正常
20002：色情
     * @param EvilType 恶意类型
100：正常
20002：色情
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * Get 处置判定 0：正常 1：可疑 
     * @return HitFlag 处置判定 0：正常 1：可疑
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set 处置判定 0：正常 1：可疑
     * @param HitFlag 处置判定 0：正常 1：可疑
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get 关键词明细 
     * @return Keywords 关键词明细
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 关键词明细
     * @param Keywords 关键词明细
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 色情标签：色情特征中文描述 
     * @return Labels 色情标签：色情特征中文描述
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 色情标签：色情特征中文描述
     * @param Labels 色情标签：色情特征中文描述
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 色情分：分值范围 0-100，分数越高色情倾向越明显 
     * @return Score 色情分：分值范围 0-100，分数越高色情倾向越明显
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 色情分：分值范围 0-100，分数越高色情倾向越明显
     * @param Score 色情分：分值范围 0-100，分数越高色情倾向越明显
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

