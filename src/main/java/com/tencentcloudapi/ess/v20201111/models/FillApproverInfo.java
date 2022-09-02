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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FillApproverInfo extends AbstractModel{

    /**
    * 签署人签署Id
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 签署人来源
WEWORKAPP: 企业微信
    */
    @SerializedName("ApproverSource")
    @Expose
    private String ApproverSource;

    /**
    * 企业自定义账号Id
WEWORKAPP场景下指企业自有应用获取企微明文的userid
    */
    @SerializedName("CustomUserId")
    @Expose
    private String CustomUserId;

    /**
     * Get 签署人签署Id 
     * @return RecipientId 签署人签署Id
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署人签署Id
     * @param RecipientId 签署人签署Id
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 签署人来源
WEWORKAPP: 企业微信 
     * @return ApproverSource 签署人来源
WEWORKAPP: 企业微信
     */
    public String getApproverSource() {
        return this.ApproverSource;
    }

    /**
     * Set 签署人来源
WEWORKAPP: 企业微信
     * @param ApproverSource 签署人来源
WEWORKAPP: 企业微信
     */
    public void setApproverSource(String ApproverSource) {
        this.ApproverSource = ApproverSource;
    }

    /**
     * Get 企业自定义账号Id
WEWORKAPP场景下指企业自有应用获取企微明文的userid 
     * @return CustomUserId 企业自定义账号Id
WEWORKAPP场景下指企业自有应用获取企微明文的userid
     */
    public String getCustomUserId() {
        return this.CustomUserId;
    }

    /**
     * Set 企业自定义账号Id
WEWORKAPP场景下指企业自有应用获取企微明文的userid
     * @param CustomUserId 企业自定义账号Id
WEWORKAPP场景下指企业自有应用获取企微明文的userid
     */
    public void setCustomUserId(String CustomUserId) {
        this.CustomUserId = CustomUserId;
    }

    public FillApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FillApproverInfo(FillApproverInfo source) {
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.ApproverSource != null) {
            this.ApproverSource = new String(source.ApproverSource);
        }
        if (source.CustomUserId != null) {
            this.CustomUserId = new String(source.CustomUserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "ApproverSource", this.ApproverSource);
        this.setParamSimple(map, prefix + "CustomUserId", this.CustomUserId);

    }
}

