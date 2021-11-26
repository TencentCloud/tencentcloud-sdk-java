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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PhoneVerificationRequest extends AbstractModel{

    /**
    * 身份证号
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 手机号
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 有加密需求的用户，传入kms的CiphertextBlob，关于数据加密可查阅 <a href="https://cloud.tencent.com/document/product/1007/47180">数据加密</a> 文档。
    */
    @SerializedName("CiphertextBlob")
    @Expose
    private String CiphertextBlob;

    /**
    * 在使用加密服务时，填入要被加密的字段。本接口中可填入加密后的IdCard，Name，Phone中的一个或多个。
    */
    @SerializedName("EncryptList")
    @Expose
    private String [] EncryptList;

    /**
    * 有加密需求的用户，传入CBC加密的初始向量。
    */
    @SerializedName("Iv")
    @Expose
    private String Iv;

    /**
     * Get 身份证号 
     * @return IdCard 身份证号
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 身份证号
     * @param IdCard 身份证号
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 手机号 
     * @return Phone 手机号
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号
     * @param Phone 手机号
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 有加密需求的用户，传入kms的CiphertextBlob，关于数据加密可查阅 <a href="https://cloud.tencent.com/document/product/1007/47180">数据加密</a> 文档。 
     * @return CiphertextBlob 有加密需求的用户，传入kms的CiphertextBlob，关于数据加密可查阅 <a href="https://cloud.tencent.com/document/product/1007/47180">数据加密</a> 文档。
     */
    public String getCiphertextBlob() {
        return this.CiphertextBlob;
    }

    /**
     * Set 有加密需求的用户，传入kms的CiphertextBlob，关于数据加密可查阅 <a href="https://cloud.tencent.com/document/product/1007/47180">数据加密</a> 文档。
     * @param CiphertextBlob 有加密需求的用户，传入kms的CiphertextBlob，关于数据加密可查阅 <a href="https://cloud.tencent.com/document/product/1007/47180">数据加密</a> 文档。
     */
    public void setCiphertextBlob(String CiphertextBlob) {
        this.CiphertextBlob = CiphertextBlob;
    }

    /**
     * Get 在使用加密服务时，填入要被加密的字段。本接口中可填入加密后的IdCard，Name，Phone中的一个或多个。 
     * @return EncryptList 在使用加密服务时，填入要被加密的字段。本接口中可填入加密后的IdCard，Name，Phone中的一个或多个。
     */
    public String [] getEncryptList() {
        return this.EncryptList;
    }

    /**
     * Set 在使用加密服务时，填入要被加密的字段。本接口中可填入加密后的IdCard，Name，Phone中的一个或多个。
     * @param EncryptList 在使用加密服务时，填入要被加密的字段。本接口中可填入加密后的IdCard，Name，Phone中的一个或多个。
     */
    public void setEncryptList(String [] EncryptList) {
        this.EncryptList = EncryptList;
    }

    /**
     * Get 有加密需求的用户，传入CBC加密的初始向量。 
     * @return Iv 有加密需求的用户，传入CBC加密的初始向量。
     */
    public String getIv() {
        return this.Iv;
    }

    /**
     * Set 有加密需求的用户，传入CBC加密的初始向量。
     * @param Iv 有加密需求的用户，传入CBC加密的初始向量。
     */
    public void setIv(String Iv) {
        this.Iv = Iv;
    }

    public PhoneVerificationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhoneVerificationRequest(PhoneVerificationRequest source) {
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.CiphertextBlob != null) {
            this.CiphertextBlob = new String(source.CiphertextBlob);
        }
        if (source.EncryptList != null) {
            this.EncryptList = new String[source.EncryptList.length];
            for (int i = 0; i < source.EncryptList.length; i++) {
                this.EncryptList[i] = new String(source.EncryptList[i]);
            }
        }
        if (source.Iv != null) {
            this.Iv = new String(source.Iv);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "CiphertextBlob", this.CiphertextBlob);
        this.setParamArraySimple(map, prefix + "EncryptList.", this.EncryptList);
        this.setParamSimple(map, prefix + "Iv", this.Iv);

    }
}

