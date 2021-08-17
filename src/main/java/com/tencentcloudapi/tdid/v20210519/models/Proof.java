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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Proof extends AbstractModel{

    /**
    * 创建时间
    */
    @SerializedName("Created")
    @Expose
    private Long Created;

    /**
    * 创建着did
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * salt值
    */
    @SerializedName("SaltJson")
    @Expose
    private String SaltJson;

    /**
    * 签名
    */
    @SerializedName("SignatureValue")
    @Expose
    private String SignatureValue;

    /**
    * type类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 创建时间 
     * @return Created 创建时间
     */
    public Long getCreated() {
        return this.Created;
    }

    /**
     * Set 创建时间
     * @param Created 创建时间
     */
    public void setCreated(Long Created) {
        this.Created = Created;
    }

    /**
     * Get 创建着did 
     * @return Creator 创建着did
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建着did
     * @param Creator 创建着did
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get salt值 
     * @return SaltJson salt值
     */
    public String getSaltJson() {
        return this.SaltJson;
    }

    /**
     * Set salt值
     * @param SaltJson salt值
     */
    public void setSaltJson(String SaltJson) {
        this.SaltJson = SaltJson;
    }

    /**
     * Get 签名 
     * @return SignatureValue 签名
     */
    public String getSignatureValue() {
        return this.SignatureValue;
    }

    /**
     * Set 签名
     * @param SignatureValue 签名
     */
    public void setSignatureValue(String SignatureValue) {
        this.SignatureValue = SignatureValue;
    }

    /**
     * Get type类型 
     * @return Type type类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set type类型
     * @param Type type类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public Proof() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Proof(Proof source) {
        if (source.Created != null) {
            this.Created = new Long(source.Created);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.SaltJson != null) {
            this.SaltJson = new String(source.SaltJson);
        }
        if (source.SignatureValue != null) {
            this.SignatureValue = new String(source.SignatureValue);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Created", this.Created);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "SaltJson", this.SaltJson);
        this.setParamSimple(map, prefix + "SignatureValue", this.SignatureValue);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

