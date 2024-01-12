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

public class SetTDidAttributeRequest extends AbstractModel {

    /**
    * DID标识符
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * 属性名值对数组
    */
    @SerializedName("Attributes")
    @Expose
    private DidAttribute [] Attributes;

    /**
    * DID应用Id
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
    * 操作鉴权凭证
    */
    @SerializedName("OperateCredential")
    @Expose
    private String OperateCredential;

    /**
     * Get DID标识符 
     * @return Did DID标识符
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set DID标识符
     * @param Did DID标识符
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get 属性名值对数组 
     * @return Attributes 属性名值对数组
     */
    public DidAttribute [] getAttributes() {
        return this.Attributes;
    }

    /**
     * Set 属性名值对数组
     * @param Attributes 属性名值对数组
     */
    public void setAttributes(DidAttribute [] Attributes) {
        this.Attributes = Attributes;
    }

    /**
     * Get DID应用Id 
     * @return DAPId DID应用Id
     */
    public Long getDAPId() {
        return this.DAPId;
    }

    /**
     * Set DID应用Id
     * @param DAPId DID应用Id
     */
    public void setDAPId(Long DAPId) {
        this.DAPId = DAPId;
    }

    /**
     * Get 操作鉴权凭证 
     * @return OperateCredential 操作鉴权凭证
     */
    public String getOperateCredential() {
        return this.OperateCredential;
    }

    /**
     * Set 操作鉴权凭证
     * @param OperateCredential 操作鉴权凭证
     */
    public void setOperateCredential(String OperateCredential) {
        this.OperateCredential = OperateCredential;
    }

    public SetTDidAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetTDidAttributeRequest(SetTDidAttributeRequest source) {
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.Attributes != null) {
            this.Attributes = new DidAttribute[source.Attributes.length];
            for (int i = 0; i < source.Attributes.length; i++) {
                this.Attributes[i] = new DidAttribute(source.Attributes[i]);
            }
        }
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
        if (source.OperateCredential != null) {
            this.OperateCredential = new String(source.OperateCredential);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamArrayObj(map, prefix + "Attributes.", this.Attributes);
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);
        this.setParamSimple(map, prefix + "OperateCredential", this.OperateCredential);

    }
}

