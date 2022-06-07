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

public class SdkAppIdNewTrtcTimeUsage extends AbstractModel{

    /**
    * SdkAppId的值。
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * 统计的时间点数据。
    */
    @SerializedName("TrtcTimeUsages")
    @Expose
    private TrtcTimeNewUsage [] TrtcTimeUsages;

    /**
    * 统计的麦下用量的时间点数据。
    */
    @SerializedName("AudienceTrtcTimeUsages")
    @Expose
    private TrtcTimeNewUsage [] AudienceTrtcTimeUsages;

    /**
     * Get SdkAppId的值。 
     * @return SdkAppId SdkAppId的值。
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId的值。
     * @param SdkAppId SdkAppId的值。
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 统计的时间点数据。 
     * @return TrtcTimeUsages 统计的时间点数据。
     */
    public TrtcTimeNewUsage [] getTrtcTimeUsages() {
        return this.TrtcTimeUsages;
    }

    /**
     * Set 统计的时间点数据。
     * @param TrtcTimeUsages 统计的时间点数据。
     */
    public void setTrtcTimeUsages(TrtcTimeNewUsage [] TrtcTimeUsages) {
        this.TrtcTimeUsages = TrtcTimeUsages;
    }

    /**
     * Get 统计的麦下用量的时间点数据。 
     * @return AudienceTrtcTimeUsages 统计的麦下用量的时间点数据。
     */
    public TrtcTimeNewUsage [] getAudienceTrtcTimeUsages() {
        return this.AudienceTrtcTimeUsages;
    }

    /**
     * Set 统计的麦下用量的时间点数据。
     * @param AudienceTrtcTimeUsages 统计的麦下用量的时间点数据。
     */
    public void setAudienceTrtcTimeUsages(TrtcTimeNewUsage [] AudienceTrtcTimeUsages) {
        this.AudienceTrtcTimeUsages = AudienceTrtcTimeUsages;
    }

    public SdkAppIdNewTrtcTimeUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SdkAppIdNewTrtcTimeUsage(SdkAppIdNewTrtcTimeUsage source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.TrtcTimeUsages != null) {
            this.TrtcTimeUsages = new TrtcTimeNewUsage[source.TrtcTimeUsages.length];
            for (int i = 0; i < source.TrtcTimeUsages.length; i++) {
                this.TrtcTimeUsages[i] = new TrtcTimeNewUsage(source.TrtcTimeUsages[i]);
            }
        }
        if (source.AudienceTrtcTimeUsages != null) {
            this.AudienceTrtcTimeUsages = new TrtcTimeNewUsage[source.AudienceTrtcTimeUsages.length];
            for (int i = 0; i < source.AudienceTrtcTimeUsages.length; i++) {
                this.AudienceTrtcTimeUsages[i] = new TrtcTimeNewUsage(source.AudienceTrtcTimeUsages[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArrayObj(map, prefix + "TrtcTimeUsages.", this.TrtcTimeUsages);
        this.setParamArrayObj(map, prefix + "AudienceTrtcTimeUsages.", this.AudienceTrtcTimeUsages);

    }
}

