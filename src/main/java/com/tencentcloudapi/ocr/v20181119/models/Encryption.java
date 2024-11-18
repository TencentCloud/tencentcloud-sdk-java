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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Encryption extends AbstractModel {

    /**
    * 有加密需求的用户，接入传入kms的CiphertextBlob（Base64编码），关于数据加密可查阅[敏感数据加密指引](https://cloud.tencent.com/document/product/866/106048)文档。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CiphertextBlob")
    @Expose
    private String CiphertextBlob;

    /**
    * 有加密需求的用户，传入CBC加密的初始向量（客户自定义字符串，长度16字符，Base64编码）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Iv")
    @Expose
    private String Iv;

    /**
    * 加密使用的算法（支持'AES-256-CBC'、'SM4-GCM'），不传默认为'AES-256-CBC'
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * SM4-GCM算法生成的消息摘要（校验消息完整性时使用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
    * 在使用加密服务时，指定要被加密的字段。本接口默认为EncryptedBody
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncryptList")
    @Expose
    private String [] EncryptList;

    /**
     * Get 有加密需求的用户，接入传入kms的CiphertextBlob（Base64编码），关于数据加密可查阅[敏感数据加密指引](https://cloud.tencent.com/document/product/866/106048)文档。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CiphertextBlob 有加密需求的用户，接入传入kms的CiphertextBlob（Base64编码），关于数据加密可查阅[敏感数据加密指引](https://cloud.tencent.com/document/product/866/106048)文档。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCiphertextBlob() {
        return this.CiphertextBlob;
    }

    /**
     * Set 有加密需求的用户，接入传入kms的CiphertextBlob（Base64编码），关于数据加密可查阅[敏感数据加密指引](https://cloud.tencent.com/document/product/866/106048)文档。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CiphertextBlob 有加密需求的用户，接入传入kms的CiphertextBlob（Base64编码），关于数据加密可查阅[敏感数据加密指引](https://cloud.tencent.com/document/product/866/106048)文档。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCiphertextBlob(String CiphertextBlob) {
        this.CiphertextBlob = CiphertextBlob;
    }

    /**
     * Get 有加密需求的用户，传入CBC加密的初始向量（客户自定义字符串，长度16字符，Base64编码）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Iv 有加密需求的用户，传入CBC加密的初始向量（客户自定义字符串，长度16字符，Base64编码）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIv() {
        return this.Iv;
    }

    /**
     * Set 有加密需求的用户，传入CBC加密的初始向量（客户自定义字符串，长度16字符，Base64编码）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Iv 有加密需求的用户，传入CBC加密的初始向量（客户自定义字符串，长度16字符，Base64编码）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIv(String Iv) {
        this.Iv = Iv;
    }

    /**
     * Get 加密使用的算法（支持'AES-256-CBC'、'SM4-GCM'），不传默认为'AES-256-CBC'
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Algorithm 加密使用的算法（支持'AES-256-CBC'、'SM4-GCM'），不传默认为'AES-256-CBC'
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 加密使用的算法（支持'AES-256-CBC'、'SM4-GCM'），不传默认为'AES-256-CBC'
注意：此字段可能返回 null，表示取不到有效值。
     * @param Algorithm 加密使用的算法（支持'AES-256-CBC'、'SM4-GCM'），不传默认为'AES-256-CBC'
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get SM4-GCM算法生成的消息摘要（校验消息完整性时使用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagList SM4-GCM算法生成的消息摘要（校验消息完整性时使用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set SM4-GCM算法生成的消息摘要（校验消息完整性时使用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagList SM4-GCM算法生成的消息摘要（校验消息完整性时使用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 在使用加密服务时，指定要被加密的字段。本接口默认为EncryptedBody
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncryptList 在使用加密服务时，指定要被加密的字段。本接口默认为EncryptedBody
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEncryptList() {
        return this.EncryptList;
    }

    /**
     * Set 在使用加密服务时，指定要被加密的字段。本接口默认为EncryptedBody
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncryptList 在使用加密服务时，指定要被加密的字段。本接口默认为EncryptedBody
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryptList(String [] EncryptList) {
        this.EncryptList = EncryptList;
    }

    public Encryption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Encryption(Encryption source) {
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
        if (source.EncryptList != null) {
            this.EncryptList = new String[source.EncryptList.length];
            for (int i = 0; i < source.EncryptList.length; i++) {
                this.EncryptList[i] = new String(source.EncryptList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CiphertextBlob", this.CiphertextBlob);
        this.setParamSimple(map, prefix + "Iv", this.Iv);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamArraySimple(map, prefix + "TagList.", this.TagList);
        this.setParamArraySimple(map, prefix + "EncryptList.", this.EncryptList);

    }
}

