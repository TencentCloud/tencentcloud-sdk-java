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
package com.tencentcloudapi.ecc.v20181213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Aspect extends AbstractModel{

    /**
    * 维度名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 维度得分
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 维度分数占比
    */
    @SerializedName("Percentage")
    @Expose
    private Float Percentage;

    /**
     * Get 维度名字 
     * @return Name 维度名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 维度名字
     * @param Name 维度名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 维度得分 
     * @return Score 维度得分
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 维度得分
     * @param Score 维度得分
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 维度分数占比 
     * @return Percentage 维度分数占比
     */
    public Float getPercentage() {
        return this.Percentage;
    }

    /**
     * Set 维度分数占比
     * @param Percentage 维度分数占比
     */
    public void setPercentage(Float Percentage) {
        this.Percentage = Percentage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);

    }
}

