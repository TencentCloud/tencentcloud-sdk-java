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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMerchantRequest extends AbstractModel {

    /**
    * 商户名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 商户标识码
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 码包来源 0:自建, 1:第三方码包，暂不支持修改
    */
    @SerializedName("CodeType")
    @Expose
    private Long CodeType;

    /**
    * 码包前缀地址 第三方码包时必填
    */
    @SerializedName("CodeUrl")
    @Expose
    private String CodeUrl;

    /**
     * Get 商户名称 
     * @return Name 商户名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 商户名称
     * @param Name 商户名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 商户标识码 
     * @return MerchantId 商户标识码
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户标识码
     * @param MerchantId 商户标识码
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 码包来源 0:自建, 1:第三方码包，暂不支持修改 
     * @return CodeType 码包来源 0:自建, 1:第三方码包，暂不支持修改
     */
    public Long getCodeType() {
        return this.CodeType;
    }

    /**
     * Set 码包来源 0:自建, 1:第三方码包，暂不支持修改
     * @param CodeType 码包来源 0:自建, 1:第三方码包，暂不支持修改
     */
    public void setCodeType(Long CodeType) {
        this.CodeType = CodeType;
    }

    /**
     * Get 码包前缀地址 第三方码包时必填 
     * @return CodeUrl 码包前缀地址 第三方码包时必填
     */
    public String getCodeUrl() {
        return this.CodeUrl;
    }

    /**
     * Set 码包前缀地址 第三方码包时必填
     * @param CodeUrl 码包前缀地址 第三方码包时必填
     */
    public void setCodeUrl(String CodeUrl) {
        this.CodeUrl = CodeUrl;
    }

    public ModifyMerchantRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMerchantRequest(ModifyMerchantRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.CodeType != null) {
            this.CodeType = new Long(source.CodeType);
        }
        if (source.CodeUrl != null) {
            this.CodeUrl = new String(source.CodeUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "CodeType", this.CodeType);
        this.setParamSimple(map, prefix + "CodeUrl", this.CodeUrl);

    }
}

