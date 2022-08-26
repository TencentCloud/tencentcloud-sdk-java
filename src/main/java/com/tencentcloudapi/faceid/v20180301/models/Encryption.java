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

public class Encryption extends AbstractModel{

    /**
    * 在使用加密服务时，填入要被加密的字段。本接口中可填入加密后的一个或多个字段
    */
    @SerializedName("EncryptList")
    @Expose
    private String [] EncryptList;

    /**
    * 有加密需求的用户，接入传入kms的CiphertextBlob，关于数据加密可查阅<a href="https://cloud.tencent.com/document/product/1007/47180">数据加密</a> 文档。
    */
    @SerializedName("CiphertextBlob")
    @Expose
    private String CiphertextBlob;

    /**
    * 有加密需求的用户，传入CBC加密的初始向量（客户自定义字符串，长度16字符）。
    */
    @SerializedName("Iv")
    @Expose
    private String Iv;

    /**
    * 加密使用的算法（支持'AES-256-CBC'、'SM4-GCM'），不传默认为'AES-256-CBC'
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * SM4-GCM算法生成的消息摘要（校验消息完整性时使用）
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
     * Get 在使用加密服务时，填入要被加密的字段。本接口中可填入加密后的一个或多个字段 
     * @return EncryptList 在使用加密服务时，填入要被加密的字段。本接口中可填入加密后的一个或多个字段
     */
    public String [] getEncryptList() {
        return this.EncryptList;
    }

    /**
     * Set 在使用加密服务时，填入要被加密的字段。本接口中可填入加密后的一个或多个字段
     * @param EncryptList 在使用加密服务时，填入要被加密的字段。本接口中可填入加密后的一个或多个字段
     */
    public void setEncryptList(String [] EncryptList) {
        this.EncryptList = EncryptList;
    }

    /**
     * Get 有加密需求的用户，接入传入kms的CiphertextBlob，关于数据加密可查阅<a href="https://cloud.tencent.com/document/product/1007/47180">数据加密</a> 文档。 
     * @return CiphertextBlob 有加密需求的用户，接入传入kms的CiphertextBlob，关于数据加密可查阅<a href="https://cloud.tencent.com/document/product/1007/47180">数据加密</a> 文档。
     */
    public String getCiphertextBlob() {
        return this.CiphertextBlob;
    }

    /**
     * Set 有加密需求的用户，接入传入kms的CiphertextBlob，关于数据加密可查阅<a href="https://cloud.tencent.com/document/product/1007/47180">数据加密</a> 文档。
     * @param CiphertextBlob 有加密需求的用户，接入传入kms的CiphertextBlob，关于数据加密可查阅<a href="https://cloud.tencent.com/document/product/1007/47180">数据加密</a> 文档。
     */
    public void setCiphertextBlob(String CiphertextBlob) {
        this.CiphertextBlob = CiphertextBlob;
    }

    /**
     * Get 有加密需求的用户，传入CBC加密的初始向量（客户自定义字符串，长度16字符）。 
     * @return Iv 有加密需求的用户，传入CBC加密的初始向量（客户自定义字符串，长度16字符）。
     */
    public String getIv() {
        return this.Iv;
    }

    /**
     * Set 有加密需求的用户，传入CBC加密的初始向量（客户自定义字符串，长度16字符）。
     * @param Iv 有加密需求的用户，传入CBC加密的初始向量（客户自定义字符串，长度16字符）。
     */
    public void setIv(String Iv) {
        this.Iv = Iv;
    }

    /**
     * Get 加密使用的算法（支持'AES-256-CBC'、'SM4-GCM'），不传默认为'AES-256-CBC' 
     * @return Algorithm 加密使用的算法（支持'AES-256-CBC'、'SM4-GCM'），不传默认为'AES-256-CBC'
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 加密使用的算法（支持'AES-256-CBC'、'SM4-GCM'），不传默认为'AES-256-CBC'
     * @param Algorithm 加密使用的算法（支持'AES-256-CBC'、'SM4-GCM'），不传默认为'AES-256-CBC'
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get SM4-GCM算法生成的消息摘要（校验消息完整性时使用） 
     * @return TagList SM4-GCM算法生成的消息摘要（校验消息完整性时使用）
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set SM4-GCM算法生成的消息摘要（校验消息完整性时使用）
     * @param TagList SM4-GCM算法生成的消息摘要（校验消息完整性时使用）
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    public Encryption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Encryption(Encryption source) {
        if (source.EncryptList != null) {
            this.EncryptList = new String[source.EncryptList.length];
            for (int i = 0; i < source.EncryptList.length; i++) {
                this.EncryptList[i] = new String(source.EncryptList[i]);
            }
        }
        if (source.CiphertextBlob != null) {
            this.CiphertextBlob = new String(source.CiphertextBlob);
        }
        if (source.Iv != null) {
            this.Iv = new String(source.Iv);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.TagList != null) {
            this.TagList = new String[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new String(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EncryptList.", this.EncryptList);
        this.setParamSimple(map, prefix + "CiphertextBlob", this.CiphertextBlob);
        this.setParamSimple(map, prefix + "Iv", this.Iv);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamArraySimple(map, prefix + "TagList.", this.TagList);

    }
}

