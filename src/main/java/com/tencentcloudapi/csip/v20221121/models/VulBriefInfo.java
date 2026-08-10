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

public class VulBriefInfo extends AbstractModel {

    /**
    * 漏洞 ID（vul_vuls.id）
    */
    @SerializedName("VulID")
    @Expose
    private Long VulID;

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * CVE 编号
参数格式：形如 CVE-2018-5377
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * VPR 风险标签列表
    */
    @SerializedName("Label")
    @Expose
    private VPRLabel [] Label;

    /**
    * CVSS 评分
取值范围：[0.0, 10.0]
    */
    @SerializedName("CvssScore")
    @Expose
    private Float CvssScore;

    /**
    * 威胁等级
枚举值：
INVALID：无效
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 漏洞披露时间
参数格式：YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
     * Get 漏洞 ID（vul_vuls.id） 
     * @return VulID 漏洞 ID（vul_vuls.id）
     */
    public Long getVulID() {
        return this.VulID;
    }

    /**
     * Set 漏洞 ID（vul_vuls.id）
     * @param VulID 漏洞 ID（vul_vuls.id）
     */
    public void setVulID(Long VulID) {
        this.VulID = VulID;
    }

    /**
     * Get 漏洞名称 
     * @return VulName 漏洞名称
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称
     * @param VulName 漏洞名称
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get CVE 编号
参数格式：形如 CVE-2018-5377 
     * @return CVEID CVE 编号
参数格式：形如 CVE-2018-5377
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set CVE 编号
参数格式：形如 CVE-2018-5377
     * @param CVEID CVE 编号
参数格式：形如 CVE-2018-5377
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get VPR 风险标签列表 
     * @return Label VPR 风险标签列表
     */
    public VPRLabel [] getLabel() {
        return this.Label;
    }

    /**
     * Set VPR 风险标签列表
     * @param Label VPR 风险标签列表
     */
    public void setLabel(VPRLabel [] Label) {
        this.Label = Label;
    }

    /**
     * Get CVSS 评分
取值范围：[0.0, 10.0] 
     * @return CvssScore CVSS 评分
取值范围：[0.0, 10.0]
     */
    public Float getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set CVSS 评分
取值范围：[0.0, 10.0]
     * @param CvssScore CVSS 评分
取值范围：[0.0, 10.0]
     */
    public void setCvssScore(Float CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get 威胁等级
枚举值：
INVALID：无效
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重 
     * @return Level 威胁等级
枚举值：
INVALID：无效
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 威胁等级
枚举值：
INVALID：无效
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
     * @param Level 威胁等级
枚举值：
INVALID：无效
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 漏洞披露时间
参数格式：YYYY-MM-DD HH:mm:ss 
     * @return PublishTime 漏洞披露时间
参数格式：YYYY-MM-DD HH:mm:ss
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 漏洞披露时间
参数格式：YYYY-MM-DD HH:mm:ss
     * @param PublishTime 漏洞披露时间
参数格式：YYYY-MM-DD HH:mm:ss
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    public VulBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulBriefInfo(VulBriefInfo source) {
        if (source.VulID != null) {
            this.VulID = new Long(source.VulID);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.Label != null) {
            this.Label = new VPRLabel[source.Label.length];
            for (int i = 0; i < source.Label.length; i++) {
                this.Label[i] = new VPRLabel(source.Label[i]);
            }
        }
        if (source.CvssScore != null) {
            this.CvssScore = new Float(source.CvssScore);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulID", this.VulID);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamArrayObj(map, prefix + "Label.", this.Label);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);

    }
}

