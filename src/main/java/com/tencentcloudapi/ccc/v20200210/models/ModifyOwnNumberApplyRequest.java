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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOwnNumberApplyRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 线路相关参数
    */
    @SerializedName("DetailList")
    @Expose
    private OwnNumberApplyDetailItem [] DetailList;

    /**
    * 审批单号
    */
    @SerializedName("ApplyId")
    @Expose
    private Long ApplyId;

    /**
    * 送号前缀
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 线路相关参数 
     * @return DetailList 线路相关参数
     */
    public OwnNumberApplyDetailItem [] getDetailList() {
        return this.DetailList;
    }

    /**
     * Set 线路相关参数
     * @param DetailList 线路相关参数
     */
    public void setDetailList(OwnNumberApplyDetailItem [] DetailList) {
        this.DetailList = DetailList;
    }

    /**
     * Get 审批单号 
     * @return ApplyId 审批单号
     */
    public Long getApplyId() {
        return this.ApplyId;
    }

    /**
     * Set 审批单号
     * @param ApplyId 审批单号
     */
    public void setApplyId(Long ApplyId) {
        this.ApplyId = ApplyId;
    }

    /**
     * Get 送号前缀 
     * @return Prefix 送号前缀
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set 送号前缀
     * @param Prefix 送号前缀
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    public ModifyOwnNumberApplyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOwnNumberApplyRequest(ModifyOwnNumberApplyRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.DetailList != null) {
            this.DetailList = new OwnNumberApplyDetailItem[source.DetailList.length];
            for (int i = 0; i < source.DetailList.length; i++) {
                this.DetailList[i] = new OwnNumberApplyDetailItem(source.DetailList[i]);
            }
        }
        if (source.ApplyId != null) {
            this.ApplyId = new Long(source.ApplyId);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArrayObj(map, prefix + "DetailList.", this.DetailList);
        this.setParamSimple(map, prefix + "ApplyId", this.ApplyId);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);

    }
}

