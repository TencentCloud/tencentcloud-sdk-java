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

public class Similar extends AbstractModel{

    /**
    * 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 处置判定 0：未匹配到 1：恶意 2：白样本
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * 返回的种子url
    */
    @SerializedName("SeedUrl")
    @Expose
    private String SeedUrl;

    /**
     * Get 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐 
     * @return EvilType 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * Set 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐
     * @param EvilType 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
24001：暴恐
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * Get 处置判定 0：未匹配到 1：恶意 2：白样本 
     * @return HitFlag 处置判定 0：未匹配到 1：恶意 2：白样本
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set 处置判定 0：未匹配到 1：恶意 2：白样本
     * @param HitFlag 处置判定 0：未匹配到 1：恶意 2：白样本
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get 返回的种子url 
     * @return SeedUrl 返回的种子url
     */
    public String getSeedUrl() {
        return this.SeedUrl;
    }

    /**
     * Set 返回的种子url
     * @param SeedUrl 返回的种子url
     */
    public void setSeedUrl(String SeedUrl) {
        this.SeedUrl = SeedUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "SeedUrl", this.SeedUrl);

    }
}

