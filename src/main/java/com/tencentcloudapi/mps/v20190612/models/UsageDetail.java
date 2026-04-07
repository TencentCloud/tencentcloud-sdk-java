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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageDetail extends AbstractModel {

    /**
    * <p>广告配置uniq_id</p>
    */
    @SerializedName("UniqId")
    @Expose
    private String UniqId;

    /**
    * <p>广告配置id</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>广告配置名称</p>
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * <p>广告类型</p>
    */
    @SerializedName("AdType")
    @Expose
    private String AdType;

    /**
    * <p>广告请求成功数</p>
    */
    @SerializedName("AdRequestSuccess")
    @Expose
    private Long AdRequestSuccess;

    /**
    * <p>广告请求失败数</p>
    */
    @SerializedName("AdRequestFail")
    @Expose
    private Long AdRequestFail;

    /**
    * <p>广告曝光数</p>
    */
    @SerializedName("Impression")
    @Expose
    private Long Impression;

    /**
    * <p>广告开始播放数</p>
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * <p>广告播放到1/4处数</p>
    */
    @SerializedName("FirstQuarter")
    @Expose
    private Long FirstQuarter;

    /**
    * <p>广告播放到1/2处数</p>
    */
    @SerializedName("Midpoint")
    @Expose
    private Long Midpoint;

    /**
    * <p>广告播放到3/4处数</p>
    */
    @SerializedName("ThirdQuarter")
    @Expose
    private Long ThirdQuarter;

    /**
    * <p>广告播放完成数</p>
    */
    @SerializedName("Complete")
    @Expose
    private Long Complete;

    /**
    * <p>中贴广告标记时间</p>
    */
    @SerializedName("AdMarkerTime")
    @Expose
    private Float AdMarkerTime;

    /**
    * <p>中贴个性化替换时间</p>
    */
    @SerializedName("ReplacedTime")
    @Expose
    private Float ReplacedTime;

    /**
    * <p>中贴个性化广告填充率</p>
    */
    @SerializedName("MidFillRate")
    @Expose
    private Float MidFillRate;

    /**
    * <p>前贴广告请求数</p>
    */
    @SerializedName("PreReqNum")
    @Expose
    private Long PreReqNum;

    /**
    * <p>前贴广告替换数</p>
    */
    @SerializedName("PreReplacedNum")
    @Expose
    private Long PreReplacedNum;

    /**
    * <p>前贴广告替换率</p>
    */
    @SerializedName("PreReplaceRate")
    @Expose
    private Float PreReplaceRate;

    /**
    * <p>在清单中发现了广告标记次数</p>
    */
    @SerializedName("ADMarkerFound")
    @Expose
    private Long ADMarkerFound;

    /**
    * <p>向ADS请求广告次数</p>
    */
    @SerializedName("MakeAdsRequest")
    @Expose
    private Long MakeAdsRequest;

    /**
    * <p>从ADS收到VAST返回次数</p>
    */
    @SerializedName("VASTResponse")
    @Expose
    private Long VASTResponse;

    /**
    * <p>成功填充了广告次数</p>
    */
    @SerializedName("FilledAvail")
    @Expose
    private Long FilledAvail;

    /**
    * <p>执行广告替换时遇到问题次数</p>
    */
    @SerializedName("WarningNoAd")
    @Expose
    private Long WarningNoAd;

    /**
    * <p>ADS返回超时次数</p>
    */
    @SerializedName("ErrorAdsTimeout")
    @Expose
    private Long ErrorAdsTimeout;

    /**
    * <p>ADS 返回了一个空的 VAST 响应次数</p>
    */
    @SerializedName("EmptyVASTResponse")
    @Expose
    private Long EmptyVASTResponse;

    /**
    * <p>ADS 返回了一个空的VMAP 响应次数</p>
    */
    @SerializedName("EmptyVMAPResponse")
    @Expose
    private Long EmptyVMAPResponse;

    /**
    * <p>日期</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>广告配置uniq_id</p> 
     * @return UniqId <p>广告配置uniq_id</p>
     */
    public String getUniqId() {
        return this.UniqId;
    }

    /**
     * Set <p>广告配置uniq_id</p>
     * @param UniqId <p>广告配置uniq_id</p>
     */
    public void setUniqId(String UniqId) {
        this.UniqId = UniqId;
    }

    /**
     * Get <p>广告配置id</p> 
     * @return ChannelId <p>广告配置id</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>广告配置id</p>
     * @param ChannelId <p>广告配置id</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>广告配置名称</p> 
     * @return ChannelName <p>广告配置名称</p>
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set <p>广告配置名称</p>
     * @param ChannelName <p>广告配置名称</p>
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get <p>广告类型</p> 
     * @return AdType <p>广告类型</p>
     */
    public String getAdType() {
        return this.AdType;
    }

    /**
     * Set <p>广告类型</p>
     * @param AdType <p>广告类型</p>
     */
    public void setAdType(String AdType) {
        this.AdType = AdType;
    }

    /**
     * Get <p>广告请求成功数</p> 
     * @return AdRequestSuccess <p>广告请求成功数</p>
     */
    public Long getAdRequestSuccess() {
        return this.AdRequestSuccess;
    }

    /**
     * Set <p>广告请求成功数</p>
     * @param AdRequestSuccess <p>广告请求成功数</p>
     */
    public void setAdRequestSuccess(Long AdRequestSuccess) {
        this.AdRequestSuccess = AdRequestSuccess;
    }

    /**
     * Get <p>广告请求失败数</p> 
     * @return AdRequestFail <p>广告请求失败数</p>
     */
    public Long getAdRequestFail() {
        return this.AdRequestFail;
    }

    /**
     * Set <p>广告请求失败数</p>
     * @param AdRequestFail <p>广告请求失败数</p>
     */
    public void setAdRequestFail(Long AdRequestFail) {
        this.AdRequestFail = AdRequestFail;
    }

    /**
     * Get <p>广告曝光数</p> 
     * @return Impression <p>广告曝光数</p>
     */
    public Long getImpression() {
        return this.Impression;
    }

    /**
     * Set <p>广告曝光数</p>
     * @param Impression <p>广告曝光数</p>
     */
    public void setImpression(Long Impression) {
        this.Impression = Impression;
    }

    /**
     * Get <p>广告开始播放数</p> 
     * @return Start <p>广告开始播放数</p>
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set <p>广告开始播放数</p>
     * @param Start <p>广告开始播放数</p>
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get <p>广告播放到1/4处数</p> 
     * @return FirstQuarter <p>广告播放到1/4处数</p>
     */
    public Long getFirstQuarter() {
        return this.FirstQuarter;
    }

    /**
     * Set <p>广告播放到1/4处数</p>
     * @param FirstQuarter <p>广告播放到1/4处数</p>
     */
    public void setFirstQuarter(Long FirstQuarter) {
        this.FirstQuarter = FirstQuarter;
    }

    /**
     * Get <p>广告播放到1/2处数</p> 
     * @return Midpoint <p>广告播放到1/2处数</p>
     */
    public Long getMidpoint() {
        return this.Midpoint;
    }

    /**
     * Set <p>广告播放到1/2处数</p>
     * @param Midpoint <p>广告播放到1/2处数</p>
     */
    public void setMidpoint(Long Midpoint) {
        this.Midpoint = Midpoint;
    }

    /**
     * Get <p>广告播放到3/4处数</p> 
     * @return ThirdQuarter <p>广告播放到3/4处数</p>
     */
    public Long getThirdQuarter() {
        return this.ThirdQuarter;
    }

    /**
     * Set <p>广告播放到3/4处数</p>
     * @param ThirdQuarter <p>广告播放到3/4处数</p>
     */
    public void setThirdQuarter(Long ThirdQuarter) {
        this.ThirdQuarter = ThirdQuarter;
    }

    /**
     * Get <p>广告播放完成数</p> 
     * @return Complete <p>广告播放完成数</p>
     */
    public Long getComplete() {
        return this.Complete;
    }

    /**
     * Set <p>广告播放完成数</p>
     * @param Complete <p>广告播放完成数</p>
     */
    public void setComplete(Long Complete) {
        this.Complete = Complete;
    }

    /**
     * Get <p>中贴广告标记时间</p> 
     * @return AdMarkerTime <p>中贴广告标记时间</p>
     */
    public Float getAdMarkerTime() {
        return this.AdMarkerTime;
    }

    /**
     * Set <p>中贴广告标记时间</p>
     * @param AdMarkerTime <p>中贴广告标记时间</p>
     */
    public void setAdMarkerTime(Float AdMarkerTime) {
        this.AdMarkerTime = AdMarkerTime;
    }

    /**
     * Get <p>中贴个性化替换时间</p> 
     * @return ReplacedTime <p>中贴个性化替换时间</p>
     */
    public Float getReplacedTime() {
        return this.ReplacedTime;
    }

    /**
     * Set <p>中贴个性化替换时间</p>
     * @param ReplacedTime <p>中贴个性化替换时间</p>
     */
    public void setReplacedTime(Float ReplacedTime) {
        this.ReplacedTime = ReplacedTime;
    }

    /**
     * Get <p>中贴个性化广告填充率</p> 
     * @return MidFillRate <p>中贴个性化广告填充率</p>
     */
    public Float getMidFillRate() {
        return this.MidFillRate;
    }

    /**
     * Set <p>中贴个性化广告填充率</p>
     * @param MidFillRate <p>中贴个性化广告填充率</p>
     */
    public void setMidFillRate(Float MidFillRate) {
        this.MidFillRate = MidFillRate;
    }

    /**
     * Get <p>前贴广告请求数</p> 
     * @return PreReqNum <p>前贴广告请求数</p>
     */
    public Long getPreReqNum() {
        return this.PreReqNum;
    }

    /**
     * Set <p>前贴广告请求数</p>
     * @param PreReqNum <p>前贴广告请求数</p>
     */
    public void setPreReqNum(Long PreReqNum) {
        this.PreReqNum = PreReqNum;
    }

    /**
     * Get <p>前贴广告替换数</p> 
     * @return PreReplacedNum <p>前贴广告替换数</p>
     */
    public Long getPreReplacedNum() {
        return this.PreReplacedNum;
    }

    /**
     * Set <p>前贴广告替换数</p>
     * @param PreReplacedNum <p>前贴广告替换数</p>
     */
    public void setPreReplacedNum(Long PreReplacedNum) {
        this.PreReplacedNum = PreReplacedNum;
    }

    /**
     * Get <p>前贴广告替换率</p> 
     * @return PreReplaceRate <p>前贴广告替换率</p>
     */
    public Float getPreReplaceRate() {
        return this.PreReplaceRate;
    }

    /**
     * Set <p>前贴广告替换率</p>
     * @param PreReplaceRate <p>前贴广告替换率</p>
     */
    public void setPreReplaceRate(Float PreReplaceRate) {
        this.PreReplaceRate = PreReplaceRate;
    }

    /**
     * Get <p>在清单中发现了广告标记次数</p> 
     * @return ADMarkerFound <p>在清单中发现了广告标记次数</p>
     */
    public Long getADMarkerFound() {
        return this.ADMarkerFound;
    }

    /**
     * Set <p>在清单中发现了广告标记次数</p>
     * @param ADMarkerFound <p>在清单中发现了广告标记次数</p>
     */
    public void setADMarkerFound(Long ADMarkerFound) {
        this.ADMarkerFound = ADMarkerFound;
    }

    /**
     * Get <p>向ADS请求广告次数</p> 
     * @return MakeAdsRequest <p>向ADS请求广告次数</p>
     */
    public Long getMakeAdsRequest() {
        return this.MakeAdsRequest;
    }

    /**
     * Set <p>向ADS请求广告次数</p>
     * @param MakeAdsRequest <p>向ADS请求广告次数</p>
     */
    public void setMakeAdsRequest(Long MakeAdsRequest) {
        this.MakeAdsRequest = MakeAdsRequest;
    }

    /**
     * Get <p>从ADS收到VAST返回次数</p> 
     * @return VASTResponse <p>从ADS收到VAST返回次数</p>
     */
    public Long getVASTResponse() {
        return this.VASTResponse;
    }

    /**
     * Set <p>从ADS收到VAST返回次数</p>
     * @param VASTResponse <p>从ADS收到VAST返回次数</p>
     */
    public void setVASTResponse(Long VASTResponse) {
        this.VASTResponse = VASTResponse;
    }

    /**
     * Get <p>成功填充了广告次数</p> 
     * @return FilledAvail <p>成功填充了广告次数</p>
     */
    public Long getFilledAvail() {
        return this.FilledAvail;
    }

    /**
     * Set <p>成功填充了广告次数</p>
     * @param FilledAvail <p>成功填充了广告次数</p>
     */
    public void setFilledAvail(Long FilledAvail) {
        this.FilledAvail = FilledAvail;
    }

    /**
     * Get <p>执行广告替换时遇到问题次数</p> 
     * @return WarningNoAd <p>执行广告替换时遇到问题次数</p>
     */
    public Long getWarningNoAd() {
        return this.WarningNoAd;
    }

    /**
     * Set <p>执行广告替换时遇到问题次数</p>
     * @param WarningNoAd <p>执行广告替换时遇到问题次数</p>
     */
    public void setWarningNoAd(Long WarningNoAd) {
        this.WarningNoAd = WarningNoAd;
    }

    /**
     * Get <p>ADS返回超时次数</p> 
     * @return ErrorAdsTimeout <p>ADS返回超时次数</p>
     */
    public Long getErrorAdsTimeout() {
        return this.ErrorAdsTimeout;
    }

    /**
     * Set <p>ADS返回超时次数</p>
     * @param ErrorAdsTimeout <p>ADS返回超时次数</p>
     */
    public void setErrorAdsTimeout(Long ErrorAdsTimeout) {
        this.ErrorAdsTimeout = ErrorAdsTimeout;
    }

    /**
     * Get <p>ADS 返回了一个空的 VAST 响应次数</p> 
     * @return EmptyVASTResponse <p>ADS 返回了一个空的 VAST 响应次数</p>
     */
    public Long getEmptyVASTResponse() {
        return this.EmptyVASTResponse;
    }

    /**
     * Set <p>ADS 返回了一个空的 VAST 响应次数</p>
     * @param EmptyVASTResponse <p>ADS 返回了一个空的 VAST 响应次数</p>
     */
    public void setEmptyVASTResponse(Long EmptyVASTResponse) {
        this.EmptyVASTResponse = EmptyVASTResponse;
    }

    /**
     * Get <p>ADS 返回了一个空的VMAP 响应次数</p> 
     * @return EmptyVMAPResponse <p>ADS 返回了一个空的VMAP 响应次数</p>
     */
    public Long getEmptyVMAPResponse() {
        return this.EmptyVMAPResponse;
    }

    /**
     * Set <p>ADS 返回了一个空的VMAP 响应次数</p>
     * @param EmptyVMAPResponse <p>ADS 返回了一个空的VMAP 响应次数</p>
     */
    public void setEmptyVMAPResponse(Long EmptyVMAPResponse) {
        this.EmptyVMAPResponse = EmptyVMAPResponse;
    }

    /**
     * Get <p>日期</p> 
     * @return Date <p>日期</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>日期</p>
     * @param Date <p>日期</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public UsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageDetail(UsageDetail source) {
        if (source.UniqId != null) {
            this.UniqId = new String(source.UniqId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.AdType != null) {
            this.AdType = new String(source.AdType);
        }
        if (source.AdRequestSuccess != null) {
            this.AdRequestSuccess = new Long(source.AdRequestSuccess);
        }
        if (source.AdRequestFail != null) {
            this.AdRequestFail = new Long(source.AdRequestFail);
        }
        if (source.Impression != null) {
            this.Impression = new Long(source.Impression);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.FirstQuarter != null) {
            this.FirstQuarter = new Long(source.FirstQuarter);
        }
        if (source.Midpoint != null) {
            this.Midpoint = new Long(source.Midpoint);
        }
        if (source.ThirdQuarter != null) {
            this.ThirdQuarter = new Long(source.ThirdQuarter);
        }
        if (source.Complete != null) {
            this.Complete = new Long(source.Complete);
        }
        if (source.AdMarkerTime != null) {
            this.AdMarkerTime = new Float(source.AdMarkerTime);
        }
        if (source.ReplacedTime != null) {
            this.ReplacedTime = new Float(source.ReplacedTime);
        }
        if (source.MidFillRate != null) {
            this.MidFillRate = new Float(source.MidFillRate);
        }
        if (source.PreReqNum != null) {
            this.PreReqNum = new Long(source.PreReqNum);
        }
        if (source.PreReplacedNum != null) {
            this.PreReplacedNum = new Long(source.PreReplacedNum);
        }
        if (source.PreReplaceRate != null) {
            this.PreReplaceRate = new Float(source.PreReplaceRate);
        }
        if (source.ADMarkerFound != null) {
            this.ADMarkerFound = new Long(source.ADMarkerFound);
        }
        if (source.MakeAdsRequest != null) {
            this.MakeAdsRequest = new Long(source.MakeAdsRequest);
        }
        if (source.VASTResponse != null) {
            this.VASTResponse = new Long(source.VASTResponse);
        }
        if (source.FilledAvail != null) {
            this.FilledAvail = new Long(source.FilledAvail);
        }
        if (source.WarningNoAd != null) {
            this.WarningNoAd = new Long(source.WarningNoAd);
        }
        if (source.ErrorAdsTimeout != null) {
            this.ErrorAdsTimeout = new Long(source.ErrorAdsTimeout);
        }
        if (source.EmptyVASTResponse != null) {
            this.EmptyVASTResponse = new Long(source.EmptyVASTResponse);
        }
        if (source.EmptyVMAPResponse != null) {
            this.EmptyVMAPResponse = new Long(source.EmptyVMAPResponse);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqId", this.UniqId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "AdType", this.AdType);
        this.setParamSimple(map, prefix + "AdRequestSuccess", this.AdRequestSuccess);
        this.setParamSimple(map, prefix + "AdRequestFail", this.AdRequestFail);
        this.setParamSimple(map, prefix + "Impression", this.Impression);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "FirstQuarter", this.FirstQuarter);
        this.setParamSimple(map, prefix + "Midpoint", this.Midpoint);
        this.setParamSimple(map, prefix + "ThirdQuarter", this.ThirdQuarter);
        this.setParamSimple(map, prefix + "Complete", this.Complete);
        this.setParamSimple(map, prefix + "AdMarkerTime", this.AdMarkerTime);
        this.setParamSimple(map, prefix + "ReplacedTime", this.ReplacedTime);
        this.setParamSimple(map, prefix + "MidFillRate", this.MidFillRate);
        this.setParamSimple(map, prefix + "PreReqNum", this.PreReqNum);
        this.setParamSimple(map, prefix + "PreReplacedNum", this.PreReplacedNum);
        this.setParamSimple(map, prefix + "PreReplaceRate", this.PreReplaceRate);
        this.setParamSimple(map, prefix + "ADMarkerFound", this.ADMarkerFound);
        this.setParamSimple(map, prefix + "MakeAdsRequest", this.MakeAdsRequest);
        this.setParamSimple(map, prefix + "VASTResponse", this.VASTResponse);
        this.setParamSimple(map, prefix + "FilledAvail", this.FilledAvail);
        this.setParamSimple(map, prefix + "WarningNoAd", this.WarningNoAd);
        this.setParamSimple(map, prefix + "ErrorAdsTimeout", this.ErrorAdsTimeout);
        this.setParamSimple(map, prefix + "EmptyVASTResponse", this.EmptyVASTResponse);
        this.setParamSimple(map, prefix + "EmptyVMAPResponse", this.EmptyVMAPResponse);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

