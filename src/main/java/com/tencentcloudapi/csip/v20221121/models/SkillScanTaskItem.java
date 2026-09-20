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

public class SkillScanTaskItem extends AbstractModel {

    /**
    * 上传时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * Skill 名称
    */
    @SerializedName("SkillName")
    @Expose
    private String SkillName;

    /**
    * 消耗次数（总消耗次数）
    */
    @SerializedName("DeductCount")
    @Expose
    private Long DeductCount;

    /**
     * Get 上传时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return InsertTime 上传时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 上传时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param InsertTime 上传时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get Skill 名称 
     * @return SkillName Skill 名称
     */
    public String getSkillName() {
        return this.SkillName;
    }

    /**
     * Set Skill 名称
     * @param SkillName Skill 名称
     */
    public void setSkillName(String SkillName) {
        this.SkillName = SkillName;
    }

    /**
     * Get 消耗次数（总消耗次数） 
     * @return DeductCount 消耗次数（总消耗次数）
     */
    public Long getDeductCount() {
        return this.DeductCount;
    }

    /**
     * Set 消耗次数（总消耗次数）
     * @param DeductCount 消耗次数（总消耗次数）
     */
    public void setDeductCount(Long DeductCount) {
        this.DeductCount = DeductCount;
    }

    public SkillScanTaskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillScanTaskItem(SkillScanTaskItem source) {
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.SkillName != null) {
            this.SkillName = new String(source.SkillName);
        }
        if (source.DeductCount != null) {
            this.DeductCount = new Long(source.DeductCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "SkillName", this.SkillName);
        this.setParamSimple(map, prefix + "DeductCount", this.DeductCount);

    }
}

