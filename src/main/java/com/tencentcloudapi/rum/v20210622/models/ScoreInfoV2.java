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
    * 项目id
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * 项目总分
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * API性能评分
    */
    @SerializedName("ApiPerformanceScore")
    @Expose
    private Float ApiPerformanceScore;

    /**
    * API可用性评分
    */
    @SerializedName("ApiAvailableScore")
    @Expose
    private Float ApiAvailableScore;

    /**
    * API调用总数
    */
    @SerializedName("ApiNum")
    @Expose
    private Long ApiNum;

    /**
    * API失败次数
    */
    @SerializedName("ApiFail")
    @Expose
    private Long ApiFail;

    /**
    * API平均持续时间
    */
    @SerializedName("ApiDuration")
    @Expose
    private Float ApiDuration;

    /**
    * 页面性能评分
    */
    @SerializedName("PagePerformanceScore")
    @Expose
    private Float PagePerformanceScore;

    /**
    * 页面浏览量
    */
    @SerializedName("PagePv")
    @Expose
    private Long PagePv;

    /**
    * 独立访客数
    */
    @SerializedName("PageUv")
    @Expose
    private Long PageUv;

    /**
    * 页面错误数
    */
    @SerializedName("PageError")
    @Expose
    private Long PageError;

    /**
    * 首屏时间
    */
    @SerializedName("PageDuration")
    @Expose
    private Float PageDuration;

    /**
    * 平均 LCP
    */
    @SerializedName("PageLCP")
    @Expose
    private Float PageLCP;

    /**
    * 平均 FID
    */
    @SerializedName("PageFID")
    @Expose
    private Float PageFID;

    /**
    * 平均 CLS
    */
    @SerializedName("PageCLS")
    @Expose
    private Float PageCLS;

    /**
    * 平均 FCP
    */
    @SerializedName("PageFCP")
    @Expose
    private Float PageFCP;

    /**
    * 平均 INP
    */
    @SerializedName("PageINP")
    @Expose
    private Float PageINP;

    /**
    * JavaScript错误评分
    */
    @SerializedName("JsErrorScore")
    @Expose
    private Float JsErrorScore;

    /**
    * 静态资源可用性评分
    */
    @SerializedName("StaticAvailableScore")
    @Expose
    private Float StaticAvailableScore;

    /**
    * 静态资源性能评分
    */
    @SerializedName("StaticPerformanceScore")
    @Expose
    private Float StaticPerformanceScore;

    /**
    * 静态资源请求总数
    */
    @SerializedName("StaticNum")
    @Expose
    private Long StaticNum;

    /**
    * 静态资源加载失败数
    */
    @SerializedName("StaticFail")
    @Expose
    private Long StaticFail;

    /**
    * 静态资源加载时间
    */
    @SerializedName("StaticDuration")
    @Expose
    private Float StaticDuration;

    /**
     * Get 项目id 
     * @return ProjectID 项目id
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set 项目id
     * @param ProjectID 项目id
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get 项目总分 
     * @return Score 项目总分
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 项目总分
     * @param Score 项目总分
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get API性能评分 
     * @return ApiPerformanceScore API性能评分
     */
    public Float getApiPerformanceScore() {
        return this.ApiPerformanceScore;
    }

    /**
     * Set API性能评分
     * @param ApiPerformanceScore API性能评分
     */
    public void setApiPerformanceScore(Float ApiPerformanceScore) {
        this.ApiPerformanceScore = ApiPerformanceScore;
    }

    /**
     * Get API可用性评分 
     * @return ApiAvailableScore API可用性评分
     */
    public Float getApiAvailableScore() {
        return this.ApiAvailableScore;
    }

    /**
     * Set API可用性评分
     * @param ApiAvailableScore API可用性评分
     */
    public void setApiAvailableScore(Float ApiAvailableScore) {
        this.ApiAvailableScore = ApiAvailableScore;
    }

    /**
     * Get API调用总数 
     * @return ApiNum API调用总数
     */
    public Long getApiNum() {
        return this.ApiNum;
    }

    /**
     * Set API调用总数
     * @param ApiNum API调用总数
     */
    public void setApiNum(Long ApiNum) {
        this.ApiNum = ApiNum;
    }

    /**
     * Get API失败次数 
     * @return ApiFail API失败次数
     */
    public Long getApiFail() {
        return this.ApiFail;
    }

    /**
     * Set API失败次数
     * @param ApiFail API失败次数
     */
    public void setApiFail(Long ApiFail) {
        this.ApiFail = ApiFail;
    }

    /**
     * Get API平均持续时间 
     * @return ApiDuration API平均持续时间
     */
    public Float getApiDuration() {
        return this.ApiDuration;
    }

    /**
     * Set API平均持续时间
     * @param ApiDuration API平均持续时间
     */
    public void setApiDuration(Float ApiDuration) {
        this.ApiDuration = ApiDuration;
    }

    /**
     * Get 页面性能评分 
     * @return PagePerformanceScore 页面性能评分
     */
    public Float getPagePerformanceScore() {
        return this.PagePerformanceScore;
    }

    /**
     * Set 页面性能评分
     * @param PagePerformanceScore 页面性能评分
     */
    public void setPagePerformanceScore(Float PagePerformanceScore) {
        this.PagePerformanceScore = PagePerformanceScore;
    }

    /**
     * Get 页面浏览量 
     * @return PagePv 页面浏览量
     */
    public Long getPagePv() {
        return this.PagePv;
    }

    /**
     * Set 页面浏览量
     * @param PagePv 页面浏览量
     */
    public void setPagePv(Long PagePv) {
        this.PagePv = PagePv;
    }

    /**
     * Get 独立访客数 
     * @return PageUv 独立访客数
     */
    public Long getPageUv() {
        return this.PageUv;
    }

    /**
     * Set 独立访客数
     * @param PageUv 独立访客数
     */
    public void setPageUv(Long PageUv) {
        this.PageUv = PageUv;
    }

    /**
     * Get 页面错误数 
     * @return PageError 页面错误数
     */
    public Long getPageError() {
        return this.PageError;
    }

    /**
     * Set 页面错误数
     * @param PageError 页面错误数
     */
    public void setPageError(Long PageError) {
        this.PageError = PageError;
    }

    /**
     * Get 首屏时间 
     * @return PageDuration 首屏时间
     */
    public Float getPageDuration() {
        return this.PageDuration;
    }

    /**
     * Set 首屏时间
     * @param PageDuration 首屏时间
     */
    public void setPageDuration(Float PageDuration) {
        this.PageDuration = PageDuration;
    }

    /**
     * Get 平均 LCP 
     * @return PageLCP 平均 LCP
     */
    public Float getPageLCP() {
        return this.PageLCP;
    }

    /**
     * Set 平均 LCP
     * @param PageLCP 平均 LCP
     */
    public void setPageLCP(Float PageLCP) {
        this.PageLCP = PageLCP;
    }

    /**
     * Get 平均 FID 
     * @return PageFID 平均 FID
     */
    public Float getPageFID() {
        return this.PageFID;
    }

    /**
     * Set 平均 FID
     * @param PageFID 平均 FID
     */
    public void setPageFID(Float PageFID) {
        this.PageFID = PageFID;
    }

    /**
     * Get 平均 CLS 
     * @return PageCLS 平均 CLS
     */
    public Float getPageCLS() {
        return this.PageCLS;
    }

    /**
     * Set 平均 CLS
     * @param PageCLS 平均 CLS
     */
    public void setPageCLS(Float PageCLS) {
        this.PageCLS = PageCLS;
    }

    /**
     * Get 平均 FCP 
     * @return PageFCP 平均 FCP
     */
    public Float getPageFCP() {
        return this.PageFCP;
    }

    /**
     * Set 平均 FCP
     * @param PageFCP 平均 FCP
     */
    public void setPageFCP(Float PageFCP) {
        this.PageFCP = PageFCP;
    }

    /**
     * Get 平均 INP 
     * @return PageINP 平均 INP
     */
    public Float getPageINP() {
        return this.PageINP;
    }

    /**
     * Set 平均 INP
     * @param PageINP 平均 INP
     */
    public void setPageINP(Float PageINP) {
        this.PageINP = PageINP;
    }

    /**
     * Get JavaScript错误评分 
     * @return JsErrorScore JavaScript错误评分
     */
    public Float getJsErrorScore() {
        return this.JsErrorScore;
    }

    /**
     * Set JavaScript错误评分
     * @param JsErrorScore JavaScript错误评分
     */
    public void setJsErrorScore(Float JsErrorScore) {
        this.JsErrorScore = JsErrorScore;
    }

    /**
     * Get 静态资源可用性评分 
     * @return StaticAvailableScore 静态资源可用性评分
     */
    public Float getStaticAvailableScore() {
        return this.StaticAvailableScore;
    }

    /**
     * Set 静态资源可用性评分
     * @param StaticAvailableScore 静态资源可用性评分
     */
    public void setStaticAvailableScore(Float StaticAvailableScore) {
        this.StaticAvailableScore = StaticAvailableScore;
    }

    /**
     * Get 静态资源性能评分 
     * @return StaticPerformanceScore 静态资源性能评分
     */
    public Float getStaticPerformanceScore() {
        return this.StaticPerformanceScore;
    }

    /**
     * Set 静态资源性能评分
     * @param StaticPerformanceScore 静态资源性能评分
     */
    public void setStaticPerformanceScore(Float StaticPerformanceScore) {
        this.StaticPerformanceScore = StaticPerformanceScore;
    }

    /**
     * Get 静态资源请求总数 
     * @return StaticNum 静态资源请求总数
     */
    public Long getStaticNum() {
        return this.StaticNum;
    }

    /**
     * Set 静态资源请求总数
     * @param StaticNum 静态资源请求总数
     */
    public void setStaticNum(Long StaticNum) {
        this.StaticNum = StaticNum;
    }

    /**
     * Get 静态资源加载失败数 
     * @return StaticFail 静态资源加载失败数
     */
    public Long getStaticFail() {
        return this.StaticFail;
    }

    /**
     * Set 静态资源加载失败数
     * @param StaticFail 静态资源加载失败数
     */
    public void setStaticFail(Long StaticFail) {
        this.StaticFail = StaticFail;
    }

    /**
     * Get 静态资源加载时间 
     * @return StaticDuration 静态资源加载时间
     */
    public Float getStaticDuration() {
        return this.StaticDuration;
    }

    /**
     * Set 静态资源加载时间
     * @param StaticDuration 静态资源加载时间
     */
    public void setStaticDuration(Float StaticDuration) {
        this.StaticDuration = StaticDuration;
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

    }
}

