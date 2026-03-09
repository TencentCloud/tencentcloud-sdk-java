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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RelateVulInfo extends AbstractModel {

    /**
    * CVEid
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * 漏洞名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 漏洞标签
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 漏洞等级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * CVSS评分
    */
    @SerializedName("CVSS")
    @Expose
    private Float CVSS;

    /**
    * 漏洞披露时间
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * 漏洞id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get CVEid 
     * @return CveId CVEid
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set CVEid
     * @param CveId CVEid
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get 漏洞名 
     * @return Name 漏洞名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 漏洞名
     * @param Name 漏洞名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 漏洞标签 
     * @return Label 漏洞标签
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 漏洞标签
     * @param Label 漏洞标签
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 漏洞等级 
     * @return Level 漏洞等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 漏洞等级
     * @param Level 漏洞等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get CVSS评分 
     * @return CVSS CVSS评分
     */
    public Float getCVSS() {
        return this.CVSS;
    }

    /**
     * Set CVSS评分
     * @param CVSS CVSS评分
     */
    public void setCVSS(Float CVSS) {
        this.CVSS = CVSS;
    }

    /**
     * Get 漏洞披露时间 
     * @return PublishTime 漏洞披露时间
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 漏洞披露时间
     * @param PublishTime 漏洞披露时间
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get 漏洞id 
     * @return Id 漏洞id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 漏洞id
     * @param Id 漏洞id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public RelateVulInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelateVulInfo(RelateVulInfo source) {
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.CVSS != null) {
            this.CVSS = new Float(source.CVSS);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "CVSS", this.CVSS);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

