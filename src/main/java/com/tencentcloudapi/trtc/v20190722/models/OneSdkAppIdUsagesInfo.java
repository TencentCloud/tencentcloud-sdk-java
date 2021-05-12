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

public class OneSdkAppIdUsagesInfo extends AbstractModel{

    /**
    * 该 SdkAppId 对应的用量记录数长度
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 用量数组
    */
    @SerializedName("SdkAppIdTrtcTimeUsages")
    @Expose
    private SdkAppIdTrtcUsage [] SdkAppIdTrtcTimeUsages;

    /**
    * 应用ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
     * Get 该 SdkAppId 对应的用量记录数长度 
     * @return TotalNum 该 SdkAppId 对应的用量记录数长度
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 该 SdkAppId 对应的用量记录数长度
     * @param TotalNum 该 SdkAppId 对应的用量记录数长度
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 用量数组 
     * @return SdkAppIdTrtcTimeUsages 用量数组
     */
    public SdkAppIdTrtcUsage [] getSdkAppIdTrtcTimeUsages() {
        return this.SdkAppIdTrtcTimeUsages;
    }

    /**
     * Set 用量数组
     * @param SdkAppIdTrtcTimeUsages 用量数组
     */
    public void setSdkAppIdTrtcTimeUsages(SdkAppIdTrtcUsage [] SdkAppIdTrtcTimeUsages) {
        this.SdkAppIdTrtcTimeUsages = SdkAppIdTrtcTimeUsages;
    }

    /**
     * Get 应用ID 
     * @return SdkAppId 应用ID
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用ID
     * @param SdkAppId 应用ID
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    public OneSdkAppIdUsagesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OneSdkAppIdUsagesInfo(OneSdkAppIdUsagesInfo source) {
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.SdkAppIdTrtcTimeUsages != null) {
            this.SdkAppIdTrtcTimeUsages = new SdkAppIdTrtcUsage[source.SdkAppIdTrtcTimeUsages.length];
            for (int i = 0; i < source.SdkAppIdTrtcTimeUsages.length; i++) {
                this.SdkAppIdTrtcTimeUsages[i] = new SdkAppIdTrtcUsage(source.SdkAppIdTrtcTimeUsages[i]);
            }
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamArrayObj(map, prefix + "SdkAppIdTrtcTimeUsages.", this.SdkAppIdTrtcTimeUsages);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);

    }
}

