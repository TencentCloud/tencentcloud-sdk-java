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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SensitiveLevel extends AbstractModel {

    /**
    * 分级标识ID
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * 分级标识统计
    */
    @SerializedName("LevelCnt")
    @Expose
    private Long LevelCnt;

    /**
    * 分级标识名称
    */
    @SerializedName("LevelRiskName")
    @Expose
    private String LevelRiskName;

    /**
    * 分级标识分数
    */
    @SerializedName("LevelRiskScore")
    @Expose
    private Long LevelRiskScore;

    /**
     * Get 分级标识ID 
     * @return LevelId 分级标识ID
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 分级标识ID
     * @param LevelId 分级标识ID
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 分级标识统计 
     * @return LevelCnt 分级标识统计
     */
    public Long getLevelCnt() {
        return this.LevelCnt;
    }

    /**
     * Set 分级标识统计
     * @param LevelCnt 分级标识统计
     */
    public void setLevelCnt(Long LevelCnt) {
        this.LevelCnt = LevelCnt;
    }

    /**
     * Get 分级标识名称 
     * @return LevelRiskName 分级标识名称
     */
    public String getLevelRiskName() {
        return this.LevelRiskName;
    }

    /**
     * Set 分级标识名称
     * @param LevelRiskName 分级标识名称
     */
    public void setLevelRiskName(String LevelRiskName) {
        this.LevelRiskName = LevelRiskName;
    }

    /**
     * Get 分级标识分数 
     * @return LevelRiskScore 分级标识分数
     */
    public Long getLevelRiskScore() {
        return this.LevelRiskScore;
    }

    /**
     * Set 分级标识分数
     * @param LevelRiskScore 分级标识分数
     */
    public void setLevelRiskScore(Long LevelRiskScore) {
        this.LevelRiskScore = LevelRiskScore;
    }

    public SensitiveLevel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SensitiveLevel(SensitiveLevel source) {
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.LevelCnt != null) {
            this.LevelCnt = new Long(source.LevelCnt);
        }
        if (source.LevelRiskName != null) {
            this.LevelRiskName = new String(source.LevelRiskName);
        }
        if (source.LevelRiskScore != null) {
            this.LevelRiskScore = new Long(source.LevelRiskScore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "LevelCnt", this.LevelCnt);
        this.setParamSimple(map, prefix + "LevelRiskName", this.LevelRiskName);
        this.setParamSimple(map, prefix + "LevelRiskScore", this.LevelRiskScore);

    }
}

