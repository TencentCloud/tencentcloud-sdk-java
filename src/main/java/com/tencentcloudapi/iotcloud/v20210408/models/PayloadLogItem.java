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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PayloadLogItem extends AbstractModel{

    /**
    * 账号id
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 产品id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 来源类型
    */
    @SerializedName("SrcType")
    @Expose
    private String SrcType;

    /**
    * 来源名称
    */
    @SerializedName("SrcName")
    @Expose
    private String SrcName;

    /**
    * 消息topic
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 内容格式类型
    */
    @SerializedName("PayloadFormatType")
    @Expose
    private String PayloadFormatType;

    /**
    * 内容信息
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * 请求ID
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 日期时间
    */
    @SerializedName("DateTime")
    @Expose
    private String DateTime;

    /**
     * Get 账号id 
     * @return Uin 账号id
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 账号id
     * @param Uin 账号id
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 产品id 
     * @return ProductId 产品id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品id
     * @param ProductId 产品id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 来源类型 
     * @return SrcType 来源类型
     */
    public String getSrcType() {
        return this.SrcType;
    }

    /**
     * Set 来源类型
     * @param SrcType 来源类型
     */
    public void setSrcType(String SrcType) {
        this.SrcType = SrcType;
    }

    /**
     * Get 来源名称 
     * @return SrcName 来源名称
     */
    public String getSrcName() {
        return this.SrcName;
    }

    /**
     * Set 来源名称
     * @param SrcName 来源名称
     */
    public void setSrcName(String SrcName) {
        this.SrcName = SrcName;
    }

    /**
     * Get 消息topic 
     * @return Topic 消息topic
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 消息topic
     * @param Topic 消息topic
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 内容格式类型 
     * @return PayloadFormatType 内容格式类型
     */
    public String getPayloadFormatType() {
        return this.PayloadFormatType;
    }

    /**
     * Set 内容格式类型
     * @param PayloadFormatType 内容格式类型
     */
    public void setPayloadFormatType(String PayloadFormatType) {
        this.PayloadFormatType = PayloadFormatType;
    }

    /**
     * Get 内容信息 
     * @return Payload 内容信息
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set 内容信息
     * @param Payload 内容信息
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get 请求ID 
     * @return RequestId 请求ID
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 请求ID
     * @param RequestId 请求ID
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 日期时间 
     * @return DateTime 日期时间
     */
    public String getDateTime() {
        return this.DateTime;
    }

    /**
     * Set 日期时间
     * @param DateTime 日期时间
     */
    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    public PayloadLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayloadLogItem(PayloadLogItem source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.SrcType != null) {
            this.SrcType = new String(source.SrcType);
        }
        if (source.SrcName != null) {
            this.SrcName = new String(source.SrcName);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.PayloadFormatType != null) {
            this.PayloadFormatType = new String(source.PayloadFormatType);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.DateTime != null) {
            this.DateTime = new String(source.DateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "SrcType", this.SrcType);
        this.setParamSimple(map, prefix + "SrcName", this.SrcName);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "PayloadFormatType", this.PayloadFormatType);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "DateTime", this.DateTime);

    }
}

