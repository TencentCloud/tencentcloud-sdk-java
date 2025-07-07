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

public class ScoreInfo extends AbstractModel {

    /**
    * duration
    */
    @SerializedName("StaticDuration")
    @Expose
    private String StaticDuration;

    /**
    * pv
    */
    @SerializedName("PagePv")
    @Expose
    private String PagePv;

    /**
    * 失败
    */
    @SerializedName("ApiFail")
    @Expose
    private String ApiFail;

    /**
    * 请求
    */
    @SerializedName("ApiNum")
    @Expose
    private String ApiNum;

    /**
    * fail
    */
    @SerializedName("StaticFail")
    @Expose
    private String StaticFail;

    /**
    * 项目id
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * uv
    */
    @SerializedName("PageUv")
    @Expose
    private String PageUv;

    /**
    * 请求次数
    */
    @SerializedName("ApiDuration")
    @Expose
    private String ApiDuration;

    /**
    * 项目总分
    */
    @SerializedName("Score")
    @Expose
    private String Score;

    /**
    * error
    */
    @SerializedName("PageError")
    @Expose
    private String PageError;

    /**
    * num
    */
    @SerializedName("StaticNum")
    @Expose
    private String StaticNum;

    /**
    * num
    */
    @SerializedName("RecordNum")
    @Expose
    private Long RecordNum;

    /**
    * Duration
    */
    @SerializedName("PageDuration")
    @Expose
    private String PageDuration;

    /**
    * 时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 页面性能评分
    */
    @SerializedName("PagePerformanceScore")
    @Expose
    private String PagePerformanceScore;

    /**
    * js错误评分
    */
    @SerializedName("JsErrorScore")
    @Expose
    private String JsErrorScore;

    /**
    * API性能评分
    */
    @SerializedName("ApiPerformanceScore")
    @Expose
    private String ApiPerformanceScore;

    /**
    * API可用性评分
    */
    @SerializedName("ApiAvaliableScore")
    @Expose
    private String ApiAvaliableScore;

    /**
    * 静态资源性能评分
    */
    @SerializedName("StaticPerformanceScore")
    @Expose
    private String StaticPerformanceScore;

    /**
    * 静态资源可用性评分
    */
    @SerializedName("StaticAvaliableScore")
    @Expose
    private String StaticAvaliableScore;

    /**
     * Get duration 
     * @return StaticDuration duration
     */
    public String getStaticDuration() {
        return this.StaticDuration;
    }

    /**
     * Set duration
     * @param StaticDuration duration
     */
    public void setStaticDuration(String StaticDuration) {
        this.StaticDuration = StaticDuration;
    }

    /**
     * Get pv 
     * @return PagePv pv
     */
    public String getPagePv() {
        return this.PagePv;
    }

    /**
     * Set pv
     * @param PagePv pv
     */
    public void setPagePv(String PagePv) {
        this.PagePv = PagePv;
    }

    /**
     * Get 失败 
     * @return ApiFail 失败
     */
    public String getApiFail() {
        return this.ApiFail;
    }

    /**
     * Set 失败
     * @param ApiFail 失败
     */
    public void setApiFail(String ApiFail) {
        this.ApiFail = ApiFail;
    }

    /**
     * Get 请求 
     * @return ApiNum 请求
     */
    public String getApiNum() {
        return this.ApiNum;
    }

    /**
     * Set 请求
     * @param ApiNum 请求
     */
    public void setApiNum(String ApiNum) {
        this.ApiNum = ApiNum;
    }

    /**
     * Get fail 
     * @return StaticFail fail
     */
    public String getStaticFail() {
        return this.StaticFail;
    }

    /**
     * Set fail
     * @param StaticFail fail
     */
    public void setStaticFail(String StaticFail) {
        this.StaticFail = StaticFail;
    }

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
     * Get uv 
     * @return PageUv uv
     */
    public String getPageUv() {
        return this.PageUv;
    }

    /**
     * Set uv
     * @param PageUv uv
     */
    public void setPageUv(String PageUv) {
        this.PageUv = PageUv;
    }

    /**
     * Get 请求次数 
     * @return ApiDuration 请求次数
     */
    public String getApiDuration() {
        return this.ApiDuration;
    }

    /**
     * Set 请求次数
     * @param ApiDuration 请求次数
     */
    public void setApiDuration(String ApiDuration) {
        this.ApiDuration = ApiDuration;
    }

    /**
     * Get 项目总分 
     * @return Score 项目总分
     */
    public String getScore() {
        return this.Score;
    }

    /**
     * Set 项目总分
     * @param Score 项目总分
     */
    public void setScore(String Score) {
        this.Score = Score;
    }

    /**
     * Get error 
     * @return PageError error
     */
    public String getPageError() {
        return this.PageError;
    }

    /**
     * Set error
     * @param PageError error
     */
    public void setPageError(String PageError) {
        this.PageError = PageError;
    }

    /**
     * Get num 
     * @return StaticNum num
     */
    public String getStaticNum() {
        return this.StaticNum;
    }

    /**
     * Set num
     * @param StaticNum num
     */
    public void setStaticNum(String StaticNum) {
        this.StaticNum = StaticNum;
    }

    /**
     * Get num 
     * @return RecordNum num
     */
    public Long getRecordNum() {
        return this.RecordNum;
    }

    /**
     * Set num
     * @param RecordNum num
     */
    public void setRecordNum(Long RecordNum) {
        this.RecordNum = RecordNum;
    }

    /**
     * Get Duration 
     * @return PageDuration Duration
     */
    public String getPageDuration() {
        return this.PageDuration;
    }

    /**
     * Set Duration
     * @param PageDuration Duration
     */
    public void setPageDuration(String PageDuration) {
        this.PageDuration = PageDuration;
    }

    /**
     * Get 时间 
     * @return CreateTime 时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 时间
     * @param CreateTime 时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 页面性能评分 
     * @return PagePerformanceScore 页面性能评分
     */
    public String getPagePerformanceScore() {
        return this.PagePerformanceScore;
    }

    /**
     * Set 页面性能评分
     * @param PagePerformanceScore 页面性能评分
     */
    public void setPagePerformanceScore(String PagePerformanceScore) {
        this.PagePerformanceScore = PagePerformanceScore;
    }

    /**
     * Get js错误评分 
     * @return JsErrorScore js错误评分
     */
    public String getJsErrorScore() {
        return this.JsErrorScore;
    }

    /**
     * Set js错误评分
     * @param JsErrorScore js错误评分
     */
    public void setJsErrorScore(String JsErrorScore) {
        this.JsErrorScore = JsErrorScore;
    }

    /**
     * Get API性能评分 
     * @return ApiPerformanceScore API性能评分
     */
    public String getApiPerformanceScore() {
        return this.ApiPerformanceScore;
    }

    /**
     * Set API性能评分
     * @param ApiPerformanceScore API性能评分
     */
    public void setApiPerformanceScore(String ApiPerformanceScore) {
        this.ApiPerformanceScore = ApiPerformanceScore;
    }

    /**
     * Get API可用性评分 
     * @return ApiAvaliableScore API可用性评分
     */
    public String getApiAvaliableScore() {
        return this.ApiAvaliableScore;
    }

    /**
     * Set API可用性评分
     * @param ApiAvaliableScore API可用性评分
     */
    public void setApiAvaliableScore(String ApiAvaliableScore) {
        this.ApiAvaliableScore = ApiAvaliableScore;
    }

    /**
     * Get 静态资源性能评分 
     * @return StaticPerformanceScore 静态资源性能评分
     */
    public String getStaticPerformanceScore() {
        return this.StaticPerformanceScore;
    }

    /**
     * Set 静态资源性能评分
     * @param StaticPerformanceScore 静态资源性能评分
     */
    public void setStaticPerformanceScore(String StaticPerformanceScore) {
        this.StaticPerformanceScore = StaticPerformanceScore;
    }

    /**
     * Get 静态资源可用性评分 
     * @return StaticAvaliableScore 静态资源可用性评分
     */
    public String getStaticAvaliableScore() {
        return this.StaticAvaliableScore;
    }

    /**
     * Set 静态资源可用性评分
     * @param StaticAvaliableScore 静态资源可用性评分
     */
    public void setStaticAvaliableScore(String StaticAvaliableScore) {
        this.StaticAvaliableScore = StaticAvaliableScore;
    }

    public ScoreInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScoreInfo(ScoreInfo source) {
        if (source.StaticDuration != null) {
            this.StaticDuration = new String(source.StaticDuration);
        }
        if (source.PagePv != null) {
            this.PagePv = new String(source.PagePv);
        }
        if (source.ApiFail != null) {
            this.ApiFail = new String(source.ApiFail);
        }
        if (source.ApiNum != null) {
            this.ApiNum = new String(source.ApiNum);
        }
        if (source.StaticFail != null) {
            this.StaticFail = new String(source.StaticFail);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.PageUv != null) {
            this.PageUv = new String(source.PageUv);
        }
        if (source.ApiDuration != null) {
            this.ApiDuration = new String(source.ApiDuration);
        }
        if (source.Score != null) {
            this.Score = new String(source.Score);
        }
        if (source.PageError != null) {
            this.PageError = new String(source.PageError);
        }
        if (source.StaticNum != null) {
            this.StaticNum = new String(source.StaticNum);
        }
        if (source.RecordNum != null) {
            this.RecordNum = new Long(source.RecordNum);
        }
        if (source.PageDuration != null) {
            this.PageDuration = new String(source.PageDuration);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PagePerformanceScore != null) {
            this.PagePerformanceScore = new String(source.PagePerformanceScore);
        }
        if (source.JsErrorScore != null) {
            this.JsErrorScore = new String(source.JsErrorScore);
        }
        if (source.ApiPerformanceScore != null) {
            this.ApiPerformanceScore = new String(source.ApiPerformanceScore);
        }
        if (source.ApiAvaliableScore != null) {
            this.ApiAvaliableScore = new String(source.ApiAvaliableScore);
        }
        if (source.StaticPerformanceScore != null) {
            this.StaticPerformanceScore = new String(source.StaticPerformanceScore);
        }
        if (source.StaticAvaliableScore != null) {
            this.StaticAvaliableScore = new String(source.StaticAvaliableScore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StaticDuration", this.StaticDuration);
        this.setParamSimple(map, prefix + "PagePv", this.PagePv);
        this.setParamSimple(map, prefix + "ApiFail", this.ApiFail);
        this.setParamSimple(map, prefix + "ApiNum", this.ApiNum);
        this.setParamSimple(map, prefix + "StaticFail", this.StaticFail);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "PageUv", this.PageUv);
        this.setParamSimple(map, prefix + "ApiDuration", this.ApiDuration);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "PageError", this.PageError);
        this.setParamSimple(map, prefix + "StaticNum", this.StaticNum);
        this.setParamSimple(map, prefix + "RecordNum", this.RecordNum);
        this.setParamSimple(map, prefix + "PageDuration", this.PageDuration);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PagePerformanceScore", this.PagePerformanceScore);
        this.setParamSimple(map, prefix + "JsErrorScore", this.JsErrorScore);
        this.setParamSimple(map, prefix + "ApiPerformanceScore", this.ApiPerformanceScore);
        this.setParamSimple(map, prefix + "ApiAvaliableScore", this.ApiAvaliableScore);
        this.setParamSimple(map, prefix + "StaticPerformanceScore", this.StaticPerformanceScore);
        this.setParamSimple(map, prefix + "StaticAvaliableScore", this.StaticAvaliableScore);

    }
}

