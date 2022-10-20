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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SupportDefenceVul extends AbstractModel{

    /**
    * 漏洞PocID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * 漏洞名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 漏洞标签
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 漏洞CVSS
    */
    @SerializedName("CVSSV3Score")
    @Expose
    private Float CVSSV3Score;

    /**
    * 漏洞威胁等级
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 漏洞CVEID
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * 漏洞披露时间
    */
    @SerializedName("SubmitTime")
    @Expose
    private String SubmitTime;

    /**
     * Get 漏洞PocID 
     * @return PocID 漏洞PocID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set 漏洞PocID
     * @param PocID 漏洞PocID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get 漏洞名称 
     * @return Name 漏洞名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 漏洞名称
     * @param Name 漏洞名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 漏洞标签 
     * @return Tags 漏洞标签
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 漏洞标签
     * @param Tags 漏洞标签
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 漏洞CVSS 
     * @return CVSSV3Score 漏洞CVSS
     */
    public Float getCVSSV3Score() {
        return this.CVSSV3Score;
    }

    /**
     * Set 漏洞CVSS
     * @param CVSSV3Score 漏洞CVSS
     */
    public void setCVSSV3Score(Float CVSSV3Score) {
        this.CVSSV3Score = CVSSV3Score;
    }

    /**
     * Get 漏洞威胁等级 
     * @return Level 漏洞威胁等级
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 漏洞威胁等级
     * @param Level 漏洞威胁等级
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 漏洞CVEID 
     * @return CVEID 漏洞CVEID
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set 漏洞CVEID
     * @param CVEID 漏洞CVEID
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
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

    public SupportDefenceVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SupportDefenceVul(SupportDefenceVul source) {
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.CVSSV3Score != null) {
            this.CVSSV3Score = new Float(source.CVSSV3Score);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.SubmitTime != null) {
            this.SubmitTime = new String(source.SubmitTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CVSSV3Score", this.CVSSV3Score);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "SubmitTime", this.SubmitTime);

    }
}

