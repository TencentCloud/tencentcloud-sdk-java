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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulDetailInfo extends AbstractModel{

    /**
    * 漏洞ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞级别
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 漏洞名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * cve编号
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 0= 应急漏洞
    */
    @SerializedName("VulCategory")
    @Expose
    private Long VulCategory;

    /**
    * 漏洞描述
    */
    @SerializedName("Descript")
    @Expose
    private String Descript;

    /**
    * 修复建议
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * 参考链接
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * CVSS评分
    */
    @SerializedName("CvssScore")
    @Expose
    private Float CvssScore;

    /**
    * CVSS详情
    */
    @SerializedName("Cvss")
    @Expose
    private String Cvss;

    /**
    * 发布时间
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
     * Get 漏洞ID 
     * @return VulId 漏洞ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞ID
     * @param VulId 漏洞ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 漏洞级别 
     * @return Level 漏洞级别
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 漏洞级别
     * @param Level 漏洞级别
     */
    public void setLevel(Long Level) {
        this.Level = Level;
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
     * Get cve编号 
     * @return CveId cve编号
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set cve编号
     * @param CveId cve编号
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 0= 应急漏洞 
     * @return VulCategory 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 0= 应急漏洞
     */
    public Long getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 0= 应急漏洞
     * @param VulCategory 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 0= 应急漏洞
     */
    public void setVulCategory(Long VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get 漏洞描述 
     * @return Descript 漏洞描述
     */
    public String getDescript() {
        return this.Descript;
    }

    /**
     * Set 漏洞描述
     * @param Descript 漏洞描述
     */
    public void setDescript(String Descript) {
        this.Descript = Descript;
    }

    /**
     * Get 修复建议 
     * @return Fix 修复建议
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set 修复建议
     * @param Fix 修复建议
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get 参考链接 
     * @return Reference 参考链接
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set 参考链接
     * @param Reference 参考链接
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get CVSS评分 
     * @return CvssScore CVSS评分
     */
    public Float getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set CVSS评分
     * @param CvssScore CVSS评分
     */
    public void setCvssScore(Float CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get CVSS详情 
     * @return Cvss CVSS详情
     */
    public String getCvss() {
        return this.Cvss;
    }

    /**
     * Set CVSS详情
     * @param Cvss CVSS详情
     */
    public void setCvss(String Cvss) {
        this.Cvss = Cvss;
    }

    /**
     * Get 发布时间 
     * @return PublishTime 发布时间
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 发布时间
     * @param PublishTime 发布时间
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    public VulDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDetailInfo(VulDetailInfo source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new Long(source.VulCategory);
        }
        if (source.Descript != null) {
            this.Descript = new String(source.Descript);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
        if (source.CvssScore != null) {
            this.CvssScore = new Float(source.CvssScore);
        }
        if (source.Cvss != null) {
            this.Cvss = new String(source.Cvss);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "Descript", this.Descript);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "Cvss", this.Cvss);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);

    }
}

