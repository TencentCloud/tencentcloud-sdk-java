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

public class ImageVulBaseInfo extends AbstractModel {

    /**
    * <p>受影响的组件信息</p>
    */
    @SerializedName("AffectedComponents")
    @Expose
    private VulAffectedComponent [] AffectedComponents;

    /**
    * <p>漏洞名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>漏洞CVEID</p>
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * <p>漏洞类别</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>漏洞发布时间</p>
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * <p>漏洞检测方式</p>
    */
    @SerializedName("CheckMethod")
    @Expose
    private String CheckMethod;

    /**
    * <p>是否支持防御</p><p>枚举值：</p><ul><li>ENABLED： 支持防御</li><li>NOT_ENABLED： 不支持防御</li></ul>
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

    /**
    * <p>是否支持修复</p>
    */
    @SerializedName("SupportFix")
    @Expose
    private Boolean SupportFix;

    /**
    * <p>CVSS分数</p>
    */
    @SerializedName("CvssScore")
    @Expose
    private String CvssScore;

    /**
    * <p>漏洞危害描述</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>漏洞描述</p>
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * <p>危害等级</p>
    */
    @SerializedName("CVSSLevel")
    @Expose
    private String CVSSLevel;

    /**
    * <p>主要影响类型</p>
    */
    @SerializedName("VulAffect")
    @Expose
    private String VulAffect;

    /**
    * <p>是否存在在野利用</p>
    */
    @SerializedName("KVERecord")
    @Expose
    private Boolean KVERecord;

    /**
    * <p>EPSS 概率分数</p>
    */
    @SerializedName("EPSSScore")
    @Expose
    private Float EPSSScore;

    /**
    * <p>影响厂商</p>
    */
    @SerializedName("AffectVendor")
    @Expose
    private String AffectVendor;

    /**
    * <p>影响目标产品</p>
    */
    @SerializedName("AffectProduct")
    @Expose
    private String AffectProduct;

    /**
    * <p>漏洞原理</p>
    */
    @SerializedName("Mechanism")
    @Expose
    private String Mechanism;

    /**
    * <p>攻击前提条件</p>
    */
    @SerializedName("Precondition")
    @Expose
    private String Precondition;

    /**
    * <p>漏洞修复建议</p>
    */
    @SerializedName("FixSolution")
    @Expose
    private String FixSolution;

    /**
    * <p>漏洞相关链接</p>
    */
    @SerializedName("RefLink")
    @Expose
    private String RefLink;

    /**
    * <p>漏洞标签</p>
    */
    @SerializedName("Label")
    @Expose
    private String [] Label;

    /**
    * <p>漏洞Id</p>
    */
    @SerializedName("PocId")
    @Expose
    private String PocId;

    /**
     * Get <p>受影响的组件信息</p> 
     * @return AffectedComponents <p>受影响的组件信息</p>
     */
    public VulAffectedComponent [] getAffectedComponents() {
        return this.AffectedComponents;
    }

    /**
     * Set <p>受影响的组件信息</p>
     * @param AffectedComponents <p>受影响的组件信息</p>
     */
    public void setAffectedComponents(VulAffectedComponent [] AffectedComponents) {
        this.AffectedComponents = AffectedComponents;
    }

    /**
     * Get <p>漏洞名</p> 
     * @return Name <p>漏洞名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>漏洞名</p>
     * @param Name <p>漏洞名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>漏洞CVEID</p> 
     * @return CVEID <p>漏洞CVEID</p>
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set <p>漏洞CVEID</p>
     * @param CVEID <p>漏洞CVEID</p>
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get <p>漏洞类别</p> 
     * @return Category <p>漏洞类别</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>漏洞类别</p>
     * @param Category <p>漏洞类别</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>漏洞发布时间</p> 
     * @return PublishTime <p>漏洞发布时间</p>
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set <p>漏洞发布时间</p>
     * @param PublishTime <p>漏洞发布时间</p>
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get <p>漏洞检测方式</p> 
     * @return CheckMethod <p>漏洞检测方式</p>
     */
    public String getCheckMethod() {
        return this.CheckMethod;
    }

    /**
     * Set <p>漏洞检测方式</p>
     * @param CheckMethod <p>漏洞检测方式</p>
     */
    public void setCheckMethod(String CheckMethod) {
        this.CheckMethod = CheckMethod;
    }

    /**
     * Get <p>是否支持防御</p><p>枚举值：</p><ul><li>ENABLED： 支持防御</li><li>NOT_ENABLED： 不支持防御</li></ul> 
     * @return DefendStatus <p>是否支持防御</p><p>枚举值：</p><ul><li>ENABLED： 支持防御</li><li>NOT_ENABLED： 不支持防御</li></ul>
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set <p>是否支持防御</p><p>枚举值：</p><ul><li>ENABLED： 支持防御</li><li>NOT_ENABLED： 不支持防御</li></ul>
     * @param DefendStatus <p>是否支持防御</p><p>枚举值：</p><ul><li>ENABLED： 支持防御</li><li>NOT_ENABLED： 不支持防御</li></ul>
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    /**
     * Get <p>是否支持修复</p> 
     * @return SupportFix <p>是否支持修复</p>
     */
    public Boolean getSupportFix() {
        return this.SupportFix;
    }

    /**
     * Set <p>是否支持修复</p>
     * @param SupportFix <p>是否支持修复</p>
     */
    public void setSupportFix(Boolean SupportFix) {
        this.SupportFix = SupportFix;
    }

    /**
     * Get <p>CVSS分数</p> 
     * @return CvssScore <p>CVSS分数</p>
     */
    public String getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set <p>CVSS分数</p>
     * @param CvssScore <p>CVSS分数</p>
     */
    public void setCvssScore(String CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get <p>漏洞危害描述</p> 
     * @return Remark <p>漏洞危害描述</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>漏洞危害描述</p>
     * @param Remark <p>漏洞危害描述</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>漏洞描述</p> 
     * @return Summary <p>漏洞描述</p>
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>漏洞描述</p>
     * @param Summary <p>漏洞描述</p>
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get <p>危害等级</p> 
     * @return CVSSLevel <p>危害等级</p>
     */
    public String getCVSSLevel() {
        return this.CVSSLevel;
    }

    /**
     * Set <p>危害等级</p>
     * @param CVSSLevel <p>危害等级</p>
     */
    public void setCVSSLevel(String CVSSLevel) {
        this.CVSSLevel = CVSSLevel;
    }

    /**
     * Get <p>主要影响类型</p> 
     * @return VulAffect <p>主要影响类型</p>
     */
    public String getVulAffect() {
        return this.VulAffect;
    }

    /**
     * Set <p>主要影响类型</p>
     * @param VulAffect <p>主要影响类型</p>
     */
    public void setVulAffect(String VulAffect) {
        this.VulAffect = VulAffect;
    }

    /**
     * Get <p>是否存在在野利用</p> 
     * @return KVERecord <p>是否存在在野利用</p>
     */
    public Boolean getKVERecord() {
        return this.KVERecord;
    }

    /**
     * Set <p>是否存在在野利用</p>
     * @param KVERecord <p>是否存在在野利用</p>
     */
    public void setKVERecord(Boolean KVERecord) {
        this.KVERecord = KVERecord;
    }

    /**
     * Get <p>EPSS 概率分数</p> 
     * @return EPSSScore <p>EPSS 概率分数</p>
     */
    public Float getEPSSScore() {
        return this.EPSSScore;
    }

    /**
     * Set <p>EPSS 概率分数</p>
     * @param EPSSScore <p>EPSS 概率分数</p>
     */
    public void setEPSSScore(Float EPSSScore) {
        this.EPSSScore = EPSSScore;
    }

    /**
     * Get <p>影响厂商</p> 
     * @return AffectVendor <p>影响厂商</p>
     */
    public String getAffectVendor() {
        return this.AffectVendor;
    }

    /**
     * Set <p>影响厂商</p>
     * @param AffectVendor <p>影响厂商</p>
     */
    public void setAffectVendor(String AffectVendor) {
        this.AffectVendor = AffectVendor;
    }

    /**
     * Get <p>影响目标产品</p> 
     * @return AffectProduct <p>影响目标产品</p>
     */
    public String getAffectProduct() {
        return this.AffectProduct;
    }

    /**
     * Set <p>影响目标产品</p>
     * @param AffectProduct <p>影响目标产品</p>
     */
    public void setAffectProduct(String AffectProduct) {
        this.AffectProduct = AffectProduct;
    }

    /**
     * Get <p>漏洞原理</p> 
     * @return Mechanism <p>漏洞原理</p>
     */
    public String getMechanism() {
        return this.Mechanism;
    }

    /**
     * Set <p>漏洞原理</p>
     * @param Mechanism <p>漏洞原理</p>
     */
    public void setMechanism(String Mechanism) {
        this.Mechanism = Mechanism;
    }

    /**
     * Get <p>攻击前提条件</p> 
     * @return Precondition <p>攻击前提条件</p>
     */
    public String getPrecondition() {
        return this.Precondition;
    }

    /**
     * Set <p>攻击前提条件</p>
     * @param Precondition <p>攻击前提条件</p>
     */
    public void setPrecondition(String Precondition) {
        this.Precondition = Precondition;
    }

    /**
     * Get <p>漏洞修复建议</p> 
     * @return FixSolution <p>漏洞修复建议</p>
     */
    public String getFixSolution() {
        return this.FixSolution;
    }

    /**
     * Set <p>漏洞修复建议</p>
     * @param FixSolution <p>漏洞修复建议</p>
     */
    public void setFixSolution(String FixSolution) {
        this.FixSolution = FixSolution;
    }

    /**
     * Get <p>漏洞相关链接</p> 
     * @return RefLink <p>漏洞相关链接</p>
     */
    public String getRefLink() {
        return this.RefLink;
    }

    /**
     * Set <p>漏洞相关链接</p>
     * @param RefLink <p>漏洞相关链接</p>
     */
    public void setRefLink(String RefLink) {
        this.RefLink = RefLink;
    }

    /**
     * Get <p>漏洞标签</p> 
     * @return Label <p>漏洞标签</p>
     */
    public String [] getLabel() {
        return this.Label;
    }

    /**
     * Set <p>漏洞标签</p>
     * @param Label <p>漏洞标签</p>
     */
    public void setLabel(String [] Label) {
        this.Label = Label;
    }

    /**
     * Get <p>漏洞Id</p> 
     * @return PocId <p>漏洞Id</p>
     */
    public String getPocId() {
        return this.PocId;
    }

    /**
     * Set <p>漏洞Id</p>
     * @param PocId <p>漏洞Id</p>
     */
    public void setPocId(String PocId) {
        this.PocId = PocId;
    }

    public ImageVulBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageVulBaseInfo(ImageVulBaseInfo source) {
        if (source.AffectedComponents != null) {
            this.AffectedComponents = new VulAffectedComponent[source.AffectedComponents.length];
            for (int i = 0; i < source.AffectedComponents.length; i++) {
                this.AffectedComponents[i] = new VulAffectedComponent(source.AffectedComponents[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.CheckMethod != null) {
            this.CheckMethod = new String(source.CheckMethod);
        }
        if (source.DefendStatus != null) {
            this.DefendStatus = new String(source.DefendStatus);
        }
        if (source.SupportFix != null) {
            this.SupportFix = new Boolean(source.SupportFix);
        }
        if (source.CvssScore != null) {
            this.CvssScore = new String(source.CvssScore);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.CVSSLevel != null) {
            this.CVSSLevel = new String(source.CVSSLevel);
        }
        if (source.VulAffect != null) {
            this.VulAffect = new String(source.VulAffect);
        }
        if (source.KVERecord != null) {
            this.KVERecord = new Boolean(source.KVERecord);
        }
        if (source.EPSSScore != null) {
            this.EPSSScore = new Float(source.EPSSScore);
        }
        if (source.AffectVendor != null) {
            this.AffectVendor = new String(source.AffectVendor);
        }
        if (source.AffectProduct != null) {
            this.AffectProduct = new String(source.AffectProduct);
        }
        if (source.Mechanism != null) {
            this.Mechanism = new String(source.Mechanism);
        }
        if (source.Precondition != null) {
            this.Precondition = new String(source.Precondition);
        }
        if (source.FixSolution != null) {
            this.FixSolution = new String(source.FixSolution);
        }
        if (source.RefLink != null) {
            this.RefLink = new String(source.RefLink);
        }
        if (source.Label != null) {
            this.Label = new String[source.Label.length];
            for (int i = 0; i < source.Label.length; i++) {
                this.Label[i] = new String(source.Label[i]);
            }
        }
        if (source.PocId != null) {
            this.PocId = new String(source.PocId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AffectedComponents.", this.AffectedComponents);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "CheckMethod", this.CheckMethod);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);
        this.setParamSimple(map, prefix + "SupportFix", this.SupportFix);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "CVSSLevel", this.CVSSLevel);
        this.setParamSimple(map, prefix + "VulAffect", this.VulAffect);
        this.setParamSimple(map, prefix + "KVERecord", this.KVERecord);
        this.setParamSimple(map, prefix + "EPSSScore", this.EPSSScore);
        this.setParamSimple(map, prefix + "AffectVendor", this.AffectVendor);
        this.setParamSimple(map, prefix + "AffectProduct", this.AffectProduct);
        this.setParamSimple(map, prefix + "Mechanism", this.Mechanism);
        this.setParamSimple(map, prefix + "Precondition", this.Precondition);
        this.setParamSimple(map, prefix + "FixSolution", this.FixSolution);
        this.setParamSimple(map, prefix + "RefLink", this.RefLink);
        this.setParamArraySimple(map, prefix + "Label.", this.Label);
        this.setParamSimple(map, prefix + "PocId", this.PocId);

    }
}

