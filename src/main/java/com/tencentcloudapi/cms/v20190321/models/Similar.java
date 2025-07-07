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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Similar extends AbstractModel {

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
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SeedUrl 返回的种子url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeedUrl() {
        return this.SeedUrl;
    }

    /**
     * Set 返回的种子url
注意：此字段可能返回 null，表示取不到有效值。
     * @param SeedUrl 返回的种子url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeedUrl(String SeedUrl) {
        this.SeedUrl = SeedUrl;
    }

    public Similar() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Similar(Similar source) {
        if (source.EvilType != null) {
            this.EvilType = new Long(source.EvilType);
        }
        if (source.HitFlag != null) {
            this.HitFlag = new Long(source.HitFlag);
        }
        if (source.SeedUrl != null) {
            this.SeedUrl = new String(source.SeedUrl);
        }
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

