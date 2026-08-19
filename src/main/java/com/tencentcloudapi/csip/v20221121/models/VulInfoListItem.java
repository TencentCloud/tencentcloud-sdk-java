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

public class VulInfoListItem extends AbstractModel {

    /**
    * 风险等级
high 高危/ middle 中危 / low 低危 /info 提示
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 漏洞披露时间
    */
    @SerializedName("SubmitTime")
    @Expose
    private String SubmitTime;

    /**
    * 漏洞名
    */
    @SerializedName("VULName")
    @Expose
    private String VULName;

    /**
    * cveID/tvdID/ssvid
    */
    @SerializedName("VULID")
    @Expose
    private String VULID;

    /**
     * Get 风险等级
high 高危/ middle 中危 / low 低危 /info 提示 
     * @return Level 风险等级
high 高危/ middle 中危 / low 低危 /info 提示
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
high 高危/ middle 中危 / low 低危 /info 提示
     * @param Level 风险等级
high 高危/ middle 中危 / low 低危 /info 提示
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 漏洞披露时间 
     * @return SubmitTime 漏洞披露时间
     */
    public String getSubmitTime() {
        return this.SubmitTime;
    }

    /**
     * Set 漏洞披露时间
     * @param SubmitTime 漏洞披露时间
     */
    public void setSubmitTime(String SubmitTime) {
        this.SubmitTime = SubmitTime;
    }

    /**
     * Get 漏洞名 
     * @return VULName 漏洞名
     */
    public String getVULName() {
        return this.VULName;
    }

    /**
     * Set 漏洞名
     * @param VULName 漏洞名
     */
    public void setVULName(String VULName) {
        this.VULName = VULName;
    }

    /**
     * Get cveID/tvdID/ssvid 
     * @return VULID cveID/tvdID/ssvid
     */
    public String getVULID() {
        return this.VULID;
    }

    /**
     * Set cveID/tvdID/ssvid
     * @param VULID cveID/tvdID/ssvid
     */
    public void setVULID(String VULID) {
        this.VULID = VULID;
    }

    public VulInfoListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulInfoListItem(VulInfoListItem source) {
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.SubmitTime != null) {
            this.SubmitTime = new String(source.SubmitTime);
        }
        if (source.VULName != null) {
            this.VULName = new String(source.VULName);
        }
        if (source.VULID != null) {
            this.VULID = new String(source.VULID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "SubmitTime", this.SubmitTime);
        this.setParamSimple(map, prefix + "VULName", this.VULName);
        this.setParamSimple(map, prefix + "VULID", this.VULID);

    }
}

