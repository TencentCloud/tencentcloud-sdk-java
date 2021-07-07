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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAIModelChannelRequest extends AbstractModel{

    /**
    * 模型ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 推送类型。ckafka：消息队列；forward：http/https推送
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 第三方推送地址
    */
    @SerializedName("ForwardAddress")
    @Expose
    private String ForwardAddress;

    /**
    * 第三方推送密钥，不填写则腾讯云自动生成。
    */
    @SerializedName("ForwardKey")
    @Expose
    private String ForwardKey;

    /**
    * ckafka地域
    */
    @SerializedName("CKafkaRegion")
    @Expose
    private String CKafkaRegion;

    /**
    * ckafka实例
    */
    @SerializedName("CKafkaInstance")
    @Expose
    private String CKafkaInstance;

    /**
    * ckafka订阅主题
    */
    @SerializedName("CKafkaTopic")
    @Expose
    private String CKafkaTopic;

    /**
     * Get 模型ID 
     * @return ModelId 模型ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型ID
     * @param ModelId 模型ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 推送类型。ckafka：消息队列；forward：http/https推送 
     * @return Type 推送类型。ckafka：消息队列；forward：http/https推送
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 推送类型。ckafka：消息队列；forward：http/https推送
     * @param Type 推送类型。ckafka：消息队列；forward：http/https推送
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 第三方推送地址 
     * @return ForwardAddress 第三方推送地址
     */
    public String getForwardAddress() {
        return this.ForwardAddress;
    }

    /**
     * Set 第三方推送地址
     * @param ForwardAddress 第三方推送地址
     */
    public void setForwardAddress(String ForwardAddress) {
        this.ForwardAddress = ForwardAddress;
    }

    /**
     * Get 第三方推送密钥，不填写则腾讯云自动生成。 
     * @return ForwardKey 第三方推送密钥，不填写则腾讯云自动生成。
     */
    public String getForwardKey() {
        return this.ForwardKey;
    }

    /**
     * Set 第三方推送密钥，不填写则腾讯云自动生成。
     * @param ForwardKey 第三方推送密钥，不填写则腾讯云自动生成。
     */
    public void setForwardKey(String ForwardKey) {
        this.ForwardKey = ForwardKey;
    }

    /**
     * Get ckafka地域 
     * @return CKafkaRegion ckafka地域
     */
    public String getCKafkaRegion() {
        return this.CKafkaRegion;
    }

    /**
     * Set ckafka地域
     * @param CKafkaRegion ckafka地域
     */
    public void setCKafkaRegion(String CKafkaRegion) {
        this.CKafkaRegion = CKafkaRegion;
    }

    /**
     * Get ckafka实例 
     * @return CKafkaInstance ckafka实例
     */
    public String getCKafkaInstance() {
        return this.CKafkaInstance;
    }

    /**
     * Set ckafka实例
     * @param CKafkaInstance ckafka实例
     */
    public void setCKafkaInstance(String CKafkaInstance) {
        this.CKafkaInstance = CKafkaInstance;
    }

    /**
     * Get ckafka订阅主题 
     * @return CKafkaTopic ckafka订阅主题
     */
    public String getCKafkaTopic() {
        return this.CKafkaTopic;
    }

    /**
     * Set ckafka订阅主题
     * @param CKafkaTopic ckafka订阅主题
     */
    public void setCKafkaTopic(String CKafkaTopic) {
        this.CKafkaTopic = CKafkaTopic;
    }

    public UpdateAIModelChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAIModelChannelRequest(UpdateAIModelChannelRequest source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ForwardAddress != null) {
            this.ForwardAddress = new String(source.ForwardAddress);
        }
        if (source.ForwardKey != null) {
            this.ForwardKey = new String(source.ForwardKey);
        }
        if (source.CKafkaRegion != null) {
            this.CKafkaRegion = new String(source.CKafkaRegion);
        }
        if (source.CKafkaInstance != null) {
            this.CKafkaInstance = new String(source.CKafkaInstance);
        }
        if (source.CKafkaTopic != null) {
            this.CKafkaTopic = new String(source.CKafkaTopic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ForwardAddress", this.ForwardAddress);
        this.setParamSimple(map, prefix + "ForwardKey", this.ForwardKey);
        this.setParamSimple(map, prefix + "CKafkaRegion", this.CKafkaRegion);
        this.setParamSimple(map, prefix + "CKafkaInstance", this.CKafkaInstance);
        this.setParamSimple(map, prefix + "CKafkaTopic", this.CKafkaTopic);

    }
}

