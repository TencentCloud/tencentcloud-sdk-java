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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCloudChannelDataRequest extends AbstractModel{

    /**
    * 米大师分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 业务订单号，外部订单号
    */
    @SerializedName("OutOrderNo")
    @Expose
    private String OutOrderNo;

    /**
    * 数据类型
PAYMENT:支付
    */
    @SerializedName("ExternalChannelDataType")
    @Expose
    private String ExternalChannelDataType;

    /**
    * 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
    * 子应用ID
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 渠道订单号
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 渠道名称，指定渠道查询
wechat:微信支付
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
     * Get 米大师分配的支付主MidasAppId 
     * @return MidasAppId 米大师分配的支付主MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 米大师分配的支付主MidasAppId
     * @param MidasAppId 米大师分配的支付主MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 业务订单号，外部订单号 
     * @return OutOrderNo 业务订单号，外部订单号
     */
    public String getOutOrderNo() {
        return this.OutOrderNo;
    }

    /**
     * Set 业务订单号，外部订单号
     * @param OutOrderNo 业务订单号，外部订单号
     */
    public void setOutOrderNo(String OutOrderNo) {
        this.OutOrderNo = OutOrderNo;
    }

    /**
     * Get 数据类型
PAYMENT:支付 
     * @return ExternalChannelDataType 数据类型
PAYMENT:支付
     */
    public String getExternalChannelDataType() {
        return this.ExternalChannelDataType;
    }

    /**
     * Set 数据类型
PAYMENT:支付
     * @param ExternalChannelDataType 数据类型
PAYMENT:支付
     */
    public void setExternalChannelDataType(String ExternalChannelDataType) {
        this.ExternalChannelDataType = ExternalChannelDataType;
    }

    /**
     * Get 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_ 
     * @return MidasEnvironment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     * @param MidasEnvironment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
    }

    /**
     * Get 子应用ID 
     * @return SubAppId 子应用ID
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 子应用ID
     * @param SubAppId 子应用ID
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 渠道订单号 
     * @return ChannelOrderId 渠道订单号
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 渠道订单号
     * @param ChannelOrderId 渠道订单号
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 渠道名称，指定渠道查询
wechat:微信支付 
     * @return Channel 渠道名称，指定渠道查询
wechat:微信支付
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 渠道名称，指定渠道查询
wechat:微信支付
     * @param Channel 渠道名称，指定渠道查询
wechat:微信支付
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    public QueryCloudChannelDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCloudChannelDataRequest(QueryCloudChannelDataRequest source) {
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.OutOrderNo != null) {
            this.OutOrderNo = new String(source.OutOrderNo);
        }
        if (source.ExternalChannelDataType != null) {
            this.ExternalChannelDataType = new String(source.ExternalChannelDataType);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.ChannelOrderId != null) {
            this.ChannelOrderId = new String(source.ChannelOrderId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "OutOrderNo", this.OutOrderNo);
        this.setParamSimple(map, prefix + "ExternalChannelDataType", this.ExternalChannelDataType);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

