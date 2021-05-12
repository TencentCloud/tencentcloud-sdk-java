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

public class QueryOrderRequest extends AbstractModel{

    /**
    * 聚鑫分配的支付主 MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 用户ID，长度不小于5位， 仅支持字母和数字的组合
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * type=by_order根据订单号 查订单；
type=by_user根据用户id 查订单 。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 聚鑫分配的安全ID
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * 按照聚鑫安全密钥计算的签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
    * 每页返回的记录数。根据用户 号码查询订单列表时需要传。 用于分页展示。Type=by_order时必填
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 记录数偏移量，默认从0开 始。根据用户号码查询订单列 表时需要传。用于分页展示。Type=by_order时必填
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询开始时间，Unix时间戳。Type=by_order时必填
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间，Unix时间戳。Type=by_order时必填
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 业务订单号，OutTradeNo与 TransactionId不能同时为 空，都传优先使用 OutTradeNo
    */
    @SerializedName("OutTradeNo")
    @Expose
    private String OutTradeNo;

    /**
    * 聚鑫订单号，OutTradeNo与 TransactionId不能同时为 空，都传优先使用 OutTradeNo
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
     * Get 聚鑫分配的支付主 MidasAppId 
     * @return MidasAppId 聚鑫分配的支付主 MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 聚鑫分配的支付主 MidasAppId
     * @param MidasAppId 聚鑫分配的支付主 MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 用户ID，长度不小于5位， 仅支持字母和数字的组合 
     * @return UserId 用户ID，长度不小于5位， 仅支持字母和数字的组合
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID，长度不小于5位， 仅支持字母和数字的组合
     * @param UserId 用户ID，长度不小于5位， 仅支持字母和数字的组合
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get type=by_order根据订单号 查订单；
type=by_user根据用户id 查订单 。 
     * @return Type type=by_order根据订单号 查订单；
type=by_user根据用户id 查订单 。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set type=by_order根据订单号 查订单；
type=by_user根据用户id 查订单 。
     * @param Type type=by_order根据订单号 查订单；
type=by_user根据用户id 查订单 。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 聚鑫分配的安全ID 
     * @return MidasSecretId 聚鑫分配的安全ID
     */
    public String getMidasSecretId() {
        return this.MidasSecretId;
    }

    /**
     * Set 聚鑫分配的安全ID
     * @param MidasSecretId 聚鑫分配的安全ID
     */
    public void setMidasSecretId(String MidasSecretId) {
        this.MidasSecretId = MidasSecretId;
    }

    /**
     * Get 按照聚鑫安全密钥计算的签名 
     * @return MidasSignature 按照聚鑫安全密钥计算的签名
     */
    public String getMidasSignature() {
        return this.MidasSignature;
    }

    /**
     * Set 按照聚鑫安全密钥计算的签名
     * @param MidasSignature 按照聚鑫安全密钥计算的签名
     */
    public void setMidasSignature(String MidasSignature) {
        this.MidasSignature = MidasSignature;
    }

    /**
     * Get 每页返回的记录数。根据用户 号码查询订单列表时需要传。 用于分页展示。Type=by_order时必填 
     * @return Count 每页返回的记录数。根据用户 号码查询订单列表时需要传。 用于分页展示。Type=by_order时必填
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 每页返回的记录数。根据用户 号码查询订单列表时需要传。 用于分页展示。Type=by_order时必填
     * @param Count 每页返回的记录数。根据用户 号码查询订单列表时需要传。 用于分页展示。Type=by_order时必填
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 记录数偏移量，默认从0开 始。根据用户号码查询订单列 表时需要传。用于分页展示。Type=by_order时必填 
     * @return Offset 记录数偏移量，默认从0开 始。根据用户号码查询订单列 表时需要传。用于分页展示。Type=by_order时必填
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 记录数偏移量，默认从0开 始。根据用户号码查询订单列 表时需要传。用于分页展示。Type=by_order时必填
     * @param Offset 记录数偏移量，默认从0开 始。根据用户号码查询订单列 表时需要传。用于分页展示。Type=by_order时必填
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询开始时间，Unix时间戳。Type=by_order时必填 
     * @return StartTime 查询开始时间，Unix时间戳。Type=by_order时必填
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间，Unix时间戳。Type=by_order时必填
     * @param StartTime 查询开始时间，Unix时间戳。Type=by_order时必填
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间，Unix时间戳。Type=by_order时必填 
     * @return EndTime 查询结束时间，Unix时间戳。Type=by_order时必填
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，Unix时间戳。Type=by_order时必填
     * @param EndTime 查询结束时间，Unix时间戳。Type=by_order时必填
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 业务订单号，OutTradeNo与 TransactionId不能同时为 空，都传优先使用 OutTradeNo 
     * @return OutTradeNo 业务订单号，OutTradeNo与 TransactionId不能同时为 空，都传优先使用 OutTradeNo
     */
    public String getOutTradeNo() {
        return this.OutTradeNo;
    }

    /**
     * Set 业务订单号，OutTradeNo与 TransactionId不能同时为 空，都传优先使用 OutTradeNo
     * @param OutTradeNo 业务订单号，OutTradeNo与 TransactionId不能同时为 空，都传优先使用 OutTradeNo
     */
    public void setOutTradeNo(String OutTradeNo) {
        this.OutTradeNo = OutTradeNo;
    }

    /**
     * Get 聚鑫订单号，OutTradeNo与 TransactionId不能同时为 空，都传优先使用 OutTradeNo 
     * @return TransactionId 聚鑫订单号，OutTradeNo与 TransactionId不能同时为 空，都传优先使用 OutTradeNo
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set 聚鑫订单号，OutTradeNo与 TransactionId不能同时为 空，都传优先使用 OutTradeNo
     * @param TransactionId 聚鑫订单号，OutTradeNo与 TransactionId不能同时为 空，都传优先使用 OutTradeNo
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release 
     * @return MidasEnvironment 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     * @param MidasEnvironment 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
    }

    public QueryOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOrderRequest(QueryOrderRequest source) {
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MidasSecretId != null) {
            this.MidasSecretId = new String(source.MidasSecretId);
        }
        if (source.MidasSignature != null) {
            this.MidasSignature = new String(source.MidasSignature);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.OutTradeNo != null) {
            this.OutTradeNo = new String(source.OutTradeNo);
        }
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "OutTradeNo", this.OutTradeNo);
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);

    }
}

