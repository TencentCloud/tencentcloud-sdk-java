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

public class LevelItem extends AbstractModel {

    /**
    * 分级ID
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * 分级组ID
    */
    @SerializedName("LevelGroupId")
    @Expose
    private Long LevelGroupId;

    /**
    * 分级标识名称，支持内置分级，内置分级取值：高，中，低，也可以自定义
    */
    @SerializedName("LevelRiskName")
    @Expose
    private String LevelRiskName;

    /**
    * 分级风险分数，1-10，最小值为1，最大值为10
    */
    @SerializedName("LevelRiskScore")
    @Expose
    private Long LevelRiskScore;

    /**
     * Get 分级ID 
     * @return LevelId 分级ID
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 分级ID
     * @param LevelId 分级ID
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 分级组ID 
     * @return LevelGroupId 分级组ID
     */
    public Long getLevelGroupId() {
        return this.LevelGroupId;
    }

    /**
     * Set 分级组ID
     * @param LevelGroupId 分级组ID
     */
    public void setLevelGroupId(Long LevelGroupId) {
        this.LevelGroupId = LevelGroupId;
    }

    /**
     * Get 分级标识名称，支持内置分级，内置分级取值：高，中，低，也可以自定义 
     * @return LevelRiskName 分级标识名称，支持内置分级，内置分级取值：高，中，低，也可以自定义
     */
    public String getLevelRiskName() {
        return this.LevelRiskName;
    }

    /**
     * Set 分级标识名称，支持内置分级，内置分级取值：高，中，低，也可以自定义
     * @param LevelRiskName 分级标识名称，支持内置分级，内置分级取值：高，中，低，也可以自定义
     */
    public void setLevelRiskName(String LevelRiskName) {
        this.LevelRiskName = LevelRiskName;
    }

    /**
     * Get 分级风险分数，1-10，最小值为1，最大值为10 
     * @return LevelRiskScore 分级风险分数，1-10，最小值为1，最大值为10
     */
    public Long getLevelRiskScore() {
        return this.LevelRiskScore;
    }

    /**
     * Set 分级风险分数，1-10，最小值为1，最大值为10
     * @param LevelRiskScore 分级风险分数，1-10，最小值为1，最大值为10
     */
    public void setLevelRiskScore(Long LevelRiskScore) {
        this.LevelRiskScore = LevelRiskScore;
    }

    public LevelItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LevelItem(LevelItem source) {
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.LevelGroupId != null) {
            this.LevelGroupId = new Long(source.LevelGroupId);
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
        this.setParamSimple(map, prefix + "LevelGroupId", this.LevelGroupId);
        this.setParamSimple(map, prefix + "LevelRiskName", this.LevelRiskName);
        this.setParamSimple(map, prefix + "LevelRiskScore", this.LevelRiskScore);

    }
}

