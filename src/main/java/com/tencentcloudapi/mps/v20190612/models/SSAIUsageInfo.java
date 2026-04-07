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

public class SSAIUsageInfo extends AbstractModel {

    /**
    * 广告请求成功次数
    */
    @SerializedName("AdRequestSuccess")
    @Expose
    private Long AdRequestSuccess;

    /**
    * 广告请求失败次数
    */
    @SerializedName("AdRequestFail")
    @Expose
    private Long AdRequestFail;

    /**
    * 曝光次数
    */
    @SerializedName("Impression")
    @Expose
    private Long Impression;

    /**
    * 中贴个性化广告填充率
    */
    @SerializedName("MidFillRate")
    @Expose
    private Float MidFillRate;

    /**
    * 中贴广告标记时间
    */
    @SerializedName("AdMarkerTime")
    @Expose
    private Float AdMarkerTime;

    /**
    * 中贴个性化替换时间
    */
    @SerializedName("ReplacedTime")
    @Expose
    private Float ReplacedTime;

    /**
    * 前贴广告替换率
    */
    @SerializedName("PreReplaceRate")
    @Expose
    private Float PreReplaceRate;

    /**
    * 前贴广告请求数
    */
    @SerializedName("PreReqNum")
    @Expose
    private Long PreReqNum;

    /**
    * 前贴广告替换数
    */
    @SerializedName("PreReplacedNum")
    @Expose
    private Long PreReplacedNum;

    /**
    * 各广告配置用量详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsageDetails")
    @Expose
    private UsageDetail [] UsageDetails;

    /**
     * Get 广告请求成功次数 
     * @return AdRequestSuccess 广告请求成功次数
     */
    public Long getAdRequestSuccess() {
        return this.AdRequestSuccess;
    }

    /**
     * Set 广告请求成功次数
     * @param AdRequestSuccess 广告请求成功次数
     */
    public void setAdRequestSuccess(Long AdRequestSuccess) {
        this.AdRequestSuccess = AdRequestSuccess;
    }

    /**
     * Get 广告请求失败次数 
     * @return AdRequestFail 广告请求失败次数
     */
    public Long getAdRequestFail() {
        return this.AdRequestFail;
    }

    /**
     * Set 广告请求失败次数
     * @param AdRequestFail 广告请求失败次数
     */
    public void setAdRequestFail(Long AdRequestFail) {
        this.AdRequestFail = AdRequestFail;
    }

    /**
     * Get 曝光次数 
     * @return Impression 曝光次数
     */
    public Long getImpression() {
        return this.Impression;
    }

    /**
     * Set 曝光次数
     * @param Impression 曝光次数
     */
    public void setImpression(Long Impression) {
        this.Impression = Impression;
    }

    /**
     * Get 中贴个性化广告填充率 
     * @return MidFillRate 中贴个性化广告填充率
     */
    public Float getMidFillRate() {
        return this.MidFillRate;
    }

    /**
     * Set 中贴个性化广告填充率
     * @param MidFillRate 中贴个性化广告填充率
     */
    public void setMidFillRate(Float MidFillRate) {
        this.MidFillRate = MidFillRate;
    }

    /**
     * Get 中贴广告标记时间 
     * @return AdMarkerTime 中贴广告标记时间
     */
    public Float getAdMarkerTime() {
        return this.AdMarkerTime;
    }

    /**
     * Set 中贴广告标记时间
     * @param AdMarkerTime 中贴广告标记时间
     */
    public void setAdMarkerTime(Float AdMarkerTime) {
        this.AdMarkerTime = AdMarkerTime;
    }

    /**
     * Get 中贴个性化替换时间 
     * @return ReplacedTime 中贴个性化替换时间
     */
    public Float getReplacedTime() {
        return this.ReplacedTime;
    }

    /**
     * Set 中贴个性化替换时间
     * @param ReplacedTime 中贴个性化替换时间
     */
    public void setReplacedTime(Float ReplacedTime) {
        this.ReplacedTime = ReplacedTime;
    }

    /**
     * Get 前贴广告替换率 
     * @return PreReplaceRate 前贴广告替换率
     */
    public Float getPreReplaceRate() {
        return this.PreReplaceRate;
    }

    /**
     * Set 前贴广告替换率
     * @param PreReplaceRate 前贴广告替换率
     */
    public void setPreReplaceRate(Float PreReplaceRate) {
        this.PreReplaceRate = PreReplaceRate;
    }

    /**
     * Get 前贴广告请求数 
     * @return PreReqNum 前贴广告请求数
     */
    public Long getPreReqNum() {
        return this.PreReqNum;
    }

    /**
     * Set 前贴广告请求数
     * @param PreReqNum 前贴广告请求数
     */
    public void setPreReqNum(Long PreReqNum) {
        this.PreReqNum = PreReqNum;
    }

    /**
     * Get 前贴广告替换数 
     * @return PreReplacedNum 前贴广告替换数
     */
    public Long getPreReplacedNum() {
        return this.PreReplacedNum;
    }

    /**
     * Set 前贴广告替换数
     * @param PreReplacedNum 前贴广告替换数
     */
    public void setPreReplacedNum(Long PreReplacedNum) {
        this.PreReplacedNum = PreReplacedNum;
    }

    /**
     * Get 各广告配置用量详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsageDetails 各广告配置用量详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UsageDetail [] getUsageDetails() {
        return this.UsageDetails;
    }

    /**
     * Set 各广告配置用量详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsageDetails 各广告配置用量详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsageDetails(UsageDetail [] UsageDetails) {
        this.UsageDetails = UsageDetails;
    }

    public SSAIUsageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SSAIUsageInfo(SSAIUsageInfo source) {
        if (source.AdRequestSuccess != null) {
            this.AdRequestSuccess = new Long(source.AdRequestSuccess);
        }
        if (source.AdRequestFail != null) {
            this.AdRequestFail = new Long(source.AdRequestFail);
        }
        if (source.Impression != null) {
            this.Impression = new Long(source.Impression);
        }
        if (source.MidFillRate != null) {
            this.MidFillRate = new Float(source.MidFillRate);
        }
        if (source.AdMarkerTime != null) {
            this.AdMarkerTime = new Float(source.AdMarkerTime);
        }
        if (source.ReplacedTime != null) {
            this.ReplacedTime = new Float(source.ReplacedTime);
        }
        if (source.PreReplaceRate != null) {
            this.PreReplaceRate = new Float(source.PreReplaceRate);
        }
        if (source.PreReqNum != null) {
            this.PreReqNum = new Long(source.PreReqNum);
        }
        if (source.PreReplacedNum != null) {
            this.PreReplacedNum = new Long(source.PreReplacedNum);
        }
        if (source.UsageDetails != null) {
            this.UsageDetails = new UsageDetail[source.UsageDetails.length];
            for (int i = 0; i < source.UsageDetails.length; i++) {
                this.UsageDetails[i] = new UsageDetail(source.UsageDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AdRequestSuccess", this.AdRequestSuccess);
        this.setParamSimple(map, prefix + "AdRequestFail", this.AdRequestFail);
        this.setParamSimple(map, prefix + "Impression", this.Impression);
        this.setParamSimple(map, prefix + "MidFillRate", this.MidFillRate);
        this.setParamSimple(map, prefix + "AdMarkerTime", this.AdMarkerTime);
        this.setParamSimple(map, prefix + "ReplacedTime", this.ReplacedTime);
        this.setParamSimple(map, prefix + "PreReplaceRate", this.PreReplaceRate);
        this.setParamSimple(map, prefix + "PreReqNum", this.PreReqNum);
        this.setParamSimple(map, prefix + "PreReplacedNum", this.PreReplacedNum);
        this.setParamArrayObj(map, prefix + "UsageDetails.", this.UsageDetails);

    }
}

