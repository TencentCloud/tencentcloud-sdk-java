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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyPresentationRequest extends AbstractModel {

    /**
    * VP持有人的did标识
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * 可验证表达内容
    */
    @SerializedName("PresentationData")
    @Expose
    private String PresentationData;

    /**
    * DID应用id
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
    * 随机验证码
    */
    @SerializedName("VerifyCode")
    @Expose
    private String VerifyCode;

    /**
     * Get VP持有人的did标识 
     * @return Did VP持有人的did标识
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set VP持有人的did标识
     * @param Did VP持有人的did标识
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get 可验证表达内容 
     * @return PresentationData 可验证表达内容
     */
    public String getPresentationData() {
        return this.PresentationData;
    }

    /**
     * Set 可验证表达内容
     * @param PresentationData 可验证表达内容
     */
    public void setPresentationData(String PresentationData) {
        this.PresentationData = PresentationData;
    }

    /**
     * Get DID应用id 
     * @return DAPId DID应用id
     */
    public Long getDAPId() {
        return this.DAPId;
    }

    /**
     * Set DID应用id
     * @param DAPId DID应用id
     */
    public void setDAPId(Long DAPId) {
        this.DAPId = DAPId;
    }

    /**
     * Get 随机验证码 
     * @return VerifyCode 随机验证码
     */
    public String getVerifyCode() {
        return this.VerifyCode;
    }

    /**
     * Set 随机验证码
     * @param VerifyCode 随机验证码
     */
    public void setVerifyCode(String VerifyCode) {
        this.VerifyCode = VerifyCode;
    }

    public VerifyPresentationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyPresentationRequest(VerifyPresentationRequest source) {
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.PresentationData != null) {
            this.PresentationData = new String(source.PresentationData);
        }
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
        if (source.VerifyCode != null) {
            this.VerifyCode = new String(source.VerifyCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "PresentationData", this.PresentationData);
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);
        this.setParamSimple(map, prefix + "VerifyCode", this.VerifyCode);

    }
}

