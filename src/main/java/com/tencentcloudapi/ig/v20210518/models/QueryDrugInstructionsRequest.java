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
package com.tencentcloudapi.ig.v20210518.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryDrugInstructionsRequest extends AbstractModel {

    /**
    * <p>合作方ID</p>
    */
    @SerializedName("PartnerId")
    @Expose
    private String PartnerId;

    /**
    * <p>合作方密钥</p>
    */
    @SerializedName("PartnerSecret")
    @Expose
    private String PartnerSecret;

    /**
    * <p>医院应用ID</p>
    */
    @SerializedName("HospitalAppId")
    @Expose
    private String HospitalAppId;

    /**
    * <p>本次问答用户输入的问题，（最大长度1000）</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get <p>合作方ID</p> 
     * @return PartnerId <p>合作方ID</p>
     */
    public String getPartnerId() {
        return this.PartnerId;
    }

    /**
     * Set <p>合作方ID</p>
     * @param PartnerId <p>合作方ID</p>
     */
    public void setPartnerId(String PartnerId) {
        this.PartnerId = PartnerId;
    }

    /**
     * Get <p>合作方密钥</p> 
     * @return PartnerSecret <p>合作方密钥</p>
     */
    public String getPartnerSecret() {
        return this.PartnerSecret;
    }

    /**
     * Set <p>合作方密钥</p>
     * @param PartnerSecret <p>合作方密钥</p>
     */
    public void setPartnerSecret(String PartnerSecret) {
        this.PartnerSecret = PartnerSecret;
    }

    /**
     * Get <p>医院应用ID</p> 
     * @return HospitalAppId <p>医院应用ID</p>
     */
    public String getHospitalAppId() {
        return this.HospitalAppId;
    }

    /**
     * Set <p>医院应用ID</p>
     * @param HospitalAppId <p>医院应用ID</p>
     */
    public void setHospitalAppId(String HospitalAppId) {
        this.HospitalAppId = HospitalAppId;
    }

    /**
     * Get <p>本次问答用户输入的问题，（最大长度1000）</p> 
     * @return Message <p>本次问答用户输入的问题，（最大长度1000）</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>本次问答用户输入的问题，（最大长度1000）</p>
     * @param Message <p>本次问答用户输入的问题，（最大长度1000）</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public QueryDrugInstructionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryDrugInstructionsRequest(QueryDrugInstructionsRequest source) {
        if (source.PartnerId != null) {
            this.PartnerId = new String(source.PartnerId);
        }
        if (source.PartnerSecret != null) {
            this.PartnerSecret = new String(source.PartnerSecret);
        }
        if (source.HospitalAppId != null) {
            this.HospitalAppId = new String(source.HospitalAppId);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartnerId", this.PartnerId);
        this.setParamSimple(map, prefix + "PartnerSecret", this.PartnerSecret);
        this.setParamSimple(map, prefix + "HospitalAppId", this.HospitalAppId);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

