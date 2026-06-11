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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScoreInfoV2 extends AbstractModel {

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * <p>项目总分</p>
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * <p>API性能评分</p>
    */
    @SerializedName("ApiPerformanceScore")
    @Expose
    private Float ApiPerformanceScore;

    /**
    * <p>API可用性评分</p>
    */
    @SerializedName("ApiAvailableScore")
    @Expose
    private Float ApiAvailableScore;

    /**
    * <p>API调用总数</p>
    */
    @SerializedName("ApiNum")
    @Expose
    private Long ApiNum;

    /**
    * <p>API失败次数</p>
    */
    @SerializedName("ApiFail")
    @Expose
    private Long ApiFail;

    /**
    * <p>API平均持续时间</p>
    */
    @SerializedName("ApiDuration")
    @Expose
    private Float ApiDuration;

    /**
    * <p>页面性能评分</p>
    */
    @SerializedName("PagePerformanceScore")
    @Expose
    private Float PagePerformanceScore;

    /**
    * <p>页面浏览量</p>
    */
    @SerializedName("PagePv")
    @Expose
    private Long PagePv;

    /**
    * <p>独立访客数</p>
    */
    @SerializedName("PageUv")
    @Expose
    private Long PageUv;

    /**
    * <p>页面错误数</p>
    */
    @SerializedName("PageError")
    @Expose
    private Long PageError;

    /**
    * <p>首屏时间</p>
    */
    @SerializedName("PageDuration")
    @Expose
    private Float PageDuration;

    /**
    * <p>平均 LCP</p>
    */
    @SerializedName("PageLCP")
    @Expose
    private Float PageLCP;

    /**
    * <p>平均 FID</p>
    */
    @SerializedName("PageFID")
    @Expose
    private Float PageFID;

    /**
    * <p>平均 CLS</p>
    */
    @SerializedName("PageCLS")
    @Expose
    private Float PageCLS;

    /**
    * <p>平均 FCP</p>
    */
    @SerializedName("PageFCP")
    @Expose
    private Float PageFCP;

    /**
    * <p>平均 INP</p>
    */
    @SerializedName("PageINP")
    @Expose
    private Float PageINP;

    /**
    * <p>JavaScript错误评分</p>
    */
    @SerializedName("JsErrorScore")
    @Expose
    private Float JsErrorScore;

    /**
    * <p>静态资源可用性评分</p>
    */
    @SerializedName("StaticAvailableScore")
    @Expose
    private Float StaticAvailableScore;

    /**
    * <p>静态资源性能评分</p>
    */
    @SerializedName("StaticPerformanceScore")
    @Expose
    private Float StaticPerformanceScore;

    /**
    * <p>静态资源请求总数</p>
    */
    @SerializedName("StaticNum")
    @Expose
    private Long StaticNum;

    /**
    * <p>静态资源加载失败数</p>
    */
    @SerializedName("StaticFail")
    @Expose
    private Long StaticFail;

    /**
    * <p>静态资源加载时间</p>
    */
    @SerializedName("StaticDuration")
    @Expose
    private Float StaticDuration;

    /**
    * <p>忽略的配置项</p>
    */
    @SerializedName("Exclusion")
    @Expose
    private String Exclusion;

    /**
     * Get <p>项目id</p> 
     * @return ProjectID <p>项目id</p>
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set <p>项目id</p>
     * @param ProjectID <p>项目id</p>
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get <p>项目总分</p> 
     * @return Score <p>项目总分</p>
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set <p>项目总分</p>
     * @param Score <p>项目总分</p>
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get <p>API性能评分</p> 
     * @return ApiPerformanceScore <p>API性能评分</p>
     */
    public Float getApiPerformanceScore() {
        return this.ApiPerformanceScore;
    }

    /**
     * Set <p>API性能评分</p>
     * @param ApiPerformanceScore <p>API性能评分</p>
     */
    public void setApiPerformanceScore(Float ApiPerformanceScore) {
        this.ApiPerformanceScore = ApiPerformanceScore;
    }

    /**
     * Get <p>API可用性评分</p> 
     * @return ApiAvailableScore <p>API可用性评分</p>
     */
    public Float getApiAvailableScore() {
        return this.ApiAvailableScore;
    }

    /**
     * Set <p>API可用性评分</p>
     * @param ApiAvailableScore <p>API可用性评分</p>
     */
    public void setApiAvailableScore(Float ApiAvailableScore) {
        this.ApiAvailableScore = ApiAvailableScore;
    }

    /**
     * Get <p>API调用总数</p> 
     * @return ApiNum <p>API调用总数</p>
     */
    public Long getApiNum() {
        return this.ApiNum;
    }

    /**
     * Set <p>API调用总数</p>
     * @param ApiNum <p>API调用总数</p>
     */
    public void setApiNum(Long ApiNum) {
        this.ApiNum = ApiNum;
    }

    /**
     * Get <p>API失败次数</p> 
     * @return ApiFail <p>API失败次数</p>
     */
    public Long getApiFail() {
        return this.ApiFail;
    }

    /**
     * Set <p>API失败次数</p>
     * @param ApiFail <p>API失败次数</p>
     */
    public void setApiFail(Long ApiFail) {
        this.ApiFail = ApiFail;
    }

    /**
     * Get <p>API平均持续时间</p> 
     * @return ApiDuration <p>API平均持续时间</p>
     */
    public Float getApiDuration() {
        return this.ApiDuration;
    }

    /**
     * Set <p>API平均持续时间</p>
     * @param ApiDuration <p>API平均持续时间</p>
     */
    public void setApiDuration(Float ApiDuration) {
        this.ApiDuration = ApiDuration;
    }

    /**
     * Get <p>页面性能评分</p> 
     * @return PagePerformanceScore <p>页面性能评分</p>
     */
    public Float getPagePerformanceScore() {
        return this.PagePerformanceScore;
    }

    /**
     * Set <p>页面性能评分</p>
     * @param PagePerformanceScore <p>页面性能评分</p>
     */
    public void setPagePerformanceScore(Float PagePerformanceScore) {
        this.PagePerformanceScore = PagePerformanceScore;
    }

    /**
     * Get <p>页面浏览量</p> 
     * @return PagePv <p>页面浏览量</p>
     */
    public Long getPagePv() {
        return this.PagePv;
    }

    /**
     * Set <p>页面浏览量</p>
     * @param PagePv <p>页面浏览量</p>
     */
    public void setPagePv(Long PagePv) {
        this.PagePv = PagePv;
    }

    /**
     * Get <p>独立访客数</p> 
     * @return PageUv <p>独立访客数</p>
     */
    public Long getPageUv() {
        return this.PageUv;
    }

    /**
     * Set <p>独立访客数</p>
     * @param PageUv <p>独立访客数</p>
     */
    public void setPageUv(Long PageUv) {
        this.PageUv = PageUv;
    }

    /**
     * Get <p>页面错误数</p> 
     * @return PageError <p>页面错误数</p>
     */
    public Long getPageError() {
        return this.PageError;
    }

    /**
     * Set <p>页面错误数</p>
     * @param PageError <p>页面错误数</p>
     */
    public void setPageError(Long PageError) {
        this.PageError = PageError;
    }

    /**
     * Get <p>首屏时间</p> 
     * @return PageDuration <p>首屏时间</p>
     */
    public Float getPageDuration() {
        return this.PageDuration;
    }

    /**
     * Set <p>首屏时间</p>
     * @param PageDuration <p>首屏时间</p>
     */
    public void setPageDuration(Float PageDuration) {
        this.PageDuration = PageDuration;
    }

    /**
     * Get <p>平均 LCP</p> 
     * @return PageLCP <p>平均 LCP</p>
     */
    public Float getPageLCP() {
        return this.PageLCP;
    }

    /**
     * Set <p>平均 LCP</p>
     * @param PageLCP <p>平均 LCP</p>
     */
    public void setPageLCP(Float PageLCP) {
        this.PageLCP = PageLCP;
    }

    /**
     * Get <p>平均 FID</p> 
     * @return PageFID <p>平均 FID</p>
     */
    public Float getPageFID() {
        return this.PageFID;
    }

    /**
     * Set <p>平均 FID</p>
     * @param PageFID <p>平均 FID</p>
     */
    public void setPageFID(Float PageFID) {
        this.PageFID = PageFID;
    }

    /**
     * Get <p>平均 CLS</p> 
     * @return PageCLS <p>平均 CLS</p>
     */
    public Float getPageCLS() {
        return this.PageCLS;
    }

    /**
     * Set <p>平均 CLS</p>
     * @param PageCLS <p>平均 CLS</p>
     */
    public void setPageCLS(Float PageCLS) {
        this.PageCLS = PageCLS;
    }

    /**
     * Get <p>平均 FCP</p> 
     * @return PageFCP <p>平均 FCP</p>
     */
    public Float getPageFCP() {
        return this.PageFCP;
    }

    /**
     * Set <p>平均 FCP</p>
     * @param PageFCP <p>平均 FCP</p>
     */
    public void setPageFCP(Float PageFCP) {
        this.PageFCP = PageFCP;
    }

    /**
     * Get <p>平均 INP</p> 
     * @return PageINP <p>平均 INP</p>
     */
    public Float getPageINP() {
        return this.PageINP;
    }

    /**
     * Set <p>平均 INP</p>
     * @param PageINP <p>平均 INP</p>
     */
    public void setPageINP(Float PageINP) {
        this.PageINP = PageINP;
    }

    /**
     * Get <p>JavaScript错误评分</p> 
     * @return JsErrorScore <p>JavaScript错误评分</p>
     */
    public Float getJsErrorScore() {
        return this.JsErrorScore;
    }

    /**
     * Set <p>JavaScript错误评分</p>
     * @param JsErrorScore <p>JavaScript错误评分</p>
     */
    public void setJsErrorScore(Float JsErrorScore) {
        this.JsErrorScore = JsErrorScore;
    }

    /**
     * Get <p>静态资源可用性评分</p> 
     * @return StaticAvailableScore <p>静态资源可用性评分</p>
     */
    public Float getStaticAvailableScore() {
        return this.StaticAvailableScore;
    }

    /**
     * Set <p>静态资源可用性评分</p>
     * @param StaticAvailableScore <p>静态资源可用性评分</p>
     */
    public void setStaticAvailableScore(Float StaticAvailableScore) {
        this.StaticAvailableScore = StaticAvailableScore;
    }

    /**
     * Get <p>静态资源性能评分</p> 
     * @return StaticPerformanceScore <p>静态资源性能评分</p>
     */
    public Float getStaticPerformanceScore() {
        return this.StaticPerformanceScore;
    }

    /**
     * Set <p>静态资源性能评分</p>
     * @param StaticPerformanceScore <p>静态资源性能评分</p>
     */
    public void setStaticPerformanceScore(Float StaticPerformanceScore) {
        this.StaticPerformanceScore = StaticPerformanceScore;
    }

    /**
     * Get <p>静态资源请求总数</p> 
     * @return StaticNum <p>静态资源请求总数</p>
     */
    public Long getStaticNum() {
        return this.StaticNum;
    }

    /**
     * Set <p>静态资源请求总数</p>
     * @param StaticNum <p>静态资源请求总数</p>
     */
    public void setStaticNum(Long StaticNum) {
        this.StaticNum = StaticNum;
    }

    /**
     * Get <p>静态资源加载失败数</p> 
     * @return StaticFail <p>静态资源加载失败数</p>
     */
    public Long getStaticFail() {
        return this.StaticFail;
    }

    /**
     * Set <p>静态资源加载失败数</p>
     * @param StaticFail <p>静态资源加载失败数</p>
     */
    public void setStaticFail(Long StaticFail) {
        this.StaticFail = StaticFail;
    }

    /**
     * Get <p>静态资源加载时间</p> 
     * @return StaticDuration <p>静态资源加载时间</p>
     */
    public Float getStaticDuration() {
        return this.StaticDuration;
    }

    /**
     * Set <p>静态资源加载时间</p>
     * @param StaticDuration <p>静态资源加载时间</p>
     */
    public void setStaticDuration(Float StaticDuration) {
        this.StaticDuration = StaticDuration;
    }

    /**
     * Get <p>忽略的配置项</p> 
     * @return Exclusion <p>忽略的配置项</p>
     */
    public String getExclusion() {
        return this.Exclusion;
    }

    /**
     * Set <p>忽略的配置项</p>
     * @param Exclusion <p>忽略的配置项</p>
     */
    public void setExclusion(String Exclusion) {
        this.Exclusion = Exclusion;
    }

    public ScoreInfoV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScoreInfoV2(ScoreInfoV2 source) {
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.ApiPerformanceScore != null) {
            this.ApiPerformanceScore = new Float(source.ApiPerformanceScore);
        }
        if (source.ApiAvailableScore != null) {
            this.ApiAvailableScore = new Float(source.ApiAvailableScore);
        }
        if (source.ApiNum != null) {
            this.ApiNum = new Long(source.ApiNum);
        }
        if (source.ApiFail != null) {
            this.ApiFail = new Long(source.ApiFail);
        }
        if (source.ApiDuration != null) {
            this.ApiDuration = new Float(source.ApiDuration);
        }
        if (source.PagePerformanceScore != null) {
            this.PagePerformanceScore = new Float(source.PagePerformanceScore);
        }
        if (source.PagePv != null) {
            this.PagePv = new Long(source.PagePv);
        }
        if (source.PageUv != null) {
            this.PageUv = new Long(source.PageUv);
        }
        if (source.PageError != null) {
            this.PageError = new Long(source.PageError);
        }
        if (source.PageDuration != null) {
            this.PageDuration = new Float(source.PageDuration);
        }
        if (source.PageLCP != null) {
            this.PageLCP = new Float(source.PageLCP);
        }
        if (source.PageFID != null) {
            this.PageFID = new Float(source.PageFID);
        }
        if (source.PageCLS != null) {
            this.PageCLS = new Float(source.PageCLS);
        }
        if (source.PageFCP != null) {
            this.PageFCP = new Float(source.PageFCP);
        }
        if (source.PageINP != null) {
            this.PageINP = new Float(source.PageINP);
        }
        if (source.JsErrorScore != null) {
            this.JsErrorScore = new Float(source.JsErrorScore);
        }
        if (source.StaticAvailableScore != null) {
            this.StaticAvailableScore = new Float(source.StaticAvailableScore);
        }
        if (source.StaticPerformanceScore != null) {
            this.StaticPerformanceScore = new Float(source.StaticPerformanceScore);
        }
        if (source.StaticNum != null) {
            this.StaticNum = new Long(source.StaticNum);
        }
        if (source.StaticFail != null) {
            this.StaticFail = new Long(source.StaticFail);
        }
        if (source.StaticDuration != null) {
            this.StaticDuration = new Float(source.StaticDuration);
        }
        if (source.Exclusion != null) {
            this.Exclusion = new String(source.Exclusion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "ApiPerformanceScore", this.ApiPerformanceScore);
        this.setParamSimple(map, prefix + "ApiAvailableScore", this.ApiAvailableScore);
        this.setParamSimple(map, prefix + "ApiNum", this.ApiNum);
        this.setParamSimple(map, prefix + "ApiFail", this.ApiFail);
        this.setParamSimple(map, prefix + "ApiDuration", this.ApiDuration);
        this.setParamSimple(map, prefix + "PagePerformanceScore", this.PagePerformanceScore);
        this.setParamSimple(map, prefix + "PagePv", this.PagePv);
        this.setParamSimple(map, prefix + "PageUv", this.PageUv);
        this.setParamSimple(map, prefix + "PageError", this.PageError);
        this.setParamSimple(map, prefix + "PageDuration", this.PageDuration);
        this.setParamSimple(map, prefix + "PageLCP", this.PageLCP);
        this.setParamSimple(map, prefix + "PageFID", this.PageFID);
        this.setParamSimple(map, prefix + "PageCLS", this.PageCLS);
        this.setParamSimple(map, prefix + "PageFCP", this.PageFCP);
        this.setParamSimple(map, prefix + "PageINP", this.PageINP);
        this.setParamSimple(map, prefix + "JsErrorScore", this.JsErrorScore);
        this.setParamSimple(map, prefix + "StaticAvailableScore", this.StaticAvailableScore);
        this.setParamSimple(map, prefix + "StaticPerformanceScore", this.StaticPerformanceScore);
        this.setParamSimple(map, prefix + "StaticNum", this.StaticNum);
        this.setParamSimple(map, prefix + "StaticFail", this.StaticFail);
        this.setParamSimple(map, prefix + "StaticDuration", this.StaticDuration);
        this.setParamSimple(map, prefix + "Exclusion", this.Exclusion);

    }
}

