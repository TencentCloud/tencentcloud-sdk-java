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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OneSdkAppIdTranscodeTimeUsagesInfo extends AbstractModel{

    /**
    * 旁路转码时长查询结果数组
    */
    @SerializedName("SdkAppIdTranscodeTimeUsages")
    @Expose
    private SdkAppIdTrtcMcuTranscodeTimeUsage [] SdkAppIdTranscodeTimeUsages;

    /**
    * 查询记录数量
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 所查询的应用ID，可能值为:1-应用的应用ID，2-total，显示为total则表示查询的是所有应用的用量合计值。
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
     * Get 旁路转码时长查询结果数组 
     * @return SdkAppIdTranscodeTimeUsages 旁路转码时长查询结果数组
     */
    public SdkAppIdTrtcMcuTranscodeTimeUsage [] getSdkAppIdTranscodeTimeUsages() {
        return this.SdkAppIdTranscodeTimeUsages;
    }

    /**
     * Set 旁路转码时长查询结果数组
     * @param SdkAppIdTranscodeTimeUsages 旁路转码时长查询结果数组
     */
    public void setSdkAppIdTranscodeTimeUsages(SdkAppIdTrtcMcuTranscodeTimeUsage [] SdkAppIdTranscodeTimeUsages) {
        this.SdkAppIdTranscodeTimeUsages = SdkAppIdTranscodeTimeUsages;
    }

    /**
     * Get 查询记录数量 
     * @return TotalNum 查询记录数量
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 查询记录数量
     * @param TotalNum 查询记录数量
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 所查询的应用ID，可能值为:1-应用的应用ID，2-total，显示为total则表示查询的是所有应用的用量合计值。 
     * @return SdkAppId 所查询的应用ID，可能值为:1-应用的应用ID，2-total，显示为total则表示查询的是所有应用的用量合计值。
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 所查询的应用ID，可能值为:1-应用的应用ID，2-total，显示为total则表示查询的是所有应用的用量合计值。
     * @param SdkAppId 所查询的应用ID，可能值为:1-应用的应用ID，2-total，显示为total则表示查询的是所有应用的用量合计值。
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    public OneSdkAppIdTranscodeTimeUsagesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OneSdkAppIdTranscodeTimeUsagesInfo(OneSdkAppIdTranscodeTimeUsagesInfo source) {
        if (source.SdkAppIdTranscodeTimeUsages != null) {
            this.SdkAppIdTranscodeTimeUsages = new SdkAppIdTrtcMcuTranscodeTimeUsage[source.SdkAppIdTranscodeTimeUsages.length];
            for (int i = 0; i < source.SdkAppIdTranscodeTimeUsages.length; i++) {
                this.SdkAppIdTranscodeTimeUsages[i] = new SdkAppIdTrtcMcuTranscodeTimeUsage(source.SdkAppIdTranscodeTimeUsages[i]);
            }
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SdkAppIdTranscodeTimeUsages.", this.SdkAppIdTranscodeTimeUsages);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);

    }
}

