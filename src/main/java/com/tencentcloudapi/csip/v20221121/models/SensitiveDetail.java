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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SensitiveDetail extends AbstractModel {

    /**
    * 字段分类
    */
    @SerializedName("CategoryRule")
    @Expose
    private String CategoryRule;

    /**
    * 字段分级
    */
    @SerializedName("LevelRisk")
    @Expose
    private String LevelRisk;

    /**
    * 1:敏感信息字段
0:非敏感字段
    */
    @SerializedName("IsSensitive")
    @Expose
    private Long IsSensitive;

    /**
     * Get 字段分类 
     * @return CategoryRule 字段分类
     */
    public String getCategoryRule() {
        return this.CategoryRule;
    }

    /**
     * Set 字段分类
     * @param CategoryRule 字段分类
     */
    public void setCategoryRule(String CategoryRule) {
        this.CategoryRule = CategoryRule;
    }

    /**
     * Get 字段分级 
     * @return LevelRisk 字段分级
     */
    public String getLevelRisk() {
        return this.LevelRisk;
    }

    /**
     * Set 字段分级
     * @param LevelRisk 字段分级
     */
    public void setLevelRisk(String LevelRisk) {
        this.LevelRisk = LevelRisk;
    }

    /**
     * Get 1:敏感信息字段
0:非敏感字段 
     * @return IsSensitive 1:敏感信息字段
0:非敏感字段
     */
    public Long getIsSensitive() {
        return this.IsSensitive;
    }

    /**
     * Set 1:敏感信息字段
0:非敏感字段
     * @param IsSensitive 1:敏感信息字段
0:非敏感字段
     */
    public void setIsSensitive(Long IsSensitive) {
        this.IsSensitive = IsSensitive;
    }

    public SensitiveDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SensitiveDetail(SensitiveDetail source) {
        if (source.CategoryRule != null) {
            this.CategoryRule = new String(source.CategoryRule);
        }
        if (source.LevelRisk != null) {
            this.LevelRisk = new String(source.LevelRisk);
        }
        if (source.IsSensitive != null) {
            this.IsSensitive = new Long(source.IsSensitive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryRule", this.CategoryRule);
        this.setParamSimple(map, prefix + "LevelRisk", this.LevelRisk);
        this.setParamSimple(map, prefix + "IsSensitive", this.IsSensitive);

    }
}

