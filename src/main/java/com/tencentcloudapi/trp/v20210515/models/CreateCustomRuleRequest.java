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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCustomRuleRequest extends AbstractModel{

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 商户ID
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 码长度
    */
    @SerializedName("CodeLength")
    @Expose
    private Long CodeLength;

    /**
    * 码段配置
    */
    @SerializedName("CodeParts")
    @Expose
    private CodePart [] CodeParts;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 商户ID 
     * @return MerchantId 商户ID
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户ID
     * @param MerchantId 商户ID
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 码长度 
     * @return CodeLength 码长度
     */
    public Long getCodeLength() {
        return this.CodeLength;
    }

    /**
     * Set 码长度
     * @param CodeLength 码长度
     */
    public void setCodeLength(Long CodeLength) {
        this.CodeLength = CodeLength;
    }

    /**
     * Get 码段配置 
     * @return CodeParts 码段配置
     */
    public CodePart [] getCodeParts() {
        return this.CodeParts;
    }

    /**
     * Set 码段配置
     * @param CodeParts 码段配置
     */
    public void setCodeParts(CodePart [] CodeParts) {
        this.CodeParts = CodeParts;
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

    public CreateCustomRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomRuleRequest(CreateCustomRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.CodeLength != null) {
            this.CodeLength = new Long(source.CodeLength);
        }
        if (source.CodeParts != null) {
            this.CodeParts = new CodePart[source.CodeParts.length];
            for (int i = 0; i < source.CodeParts.length; i++) {
                this.CodeParts[i] = new CodePart(source.CodeParts[i]);
            }
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "CodeLength", this.CodeLength);
        this.setParamArrayObj(map, prefix + "CodeParts.", this.CodeParts);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);

    }
}

