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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeChatMessagesRequest extends AbstractModel{

    /**
    * 实例 ID（废弃）
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 服务记录ID
    */
    @SerializedName("CdrId")
    @Expose
    private String CdrId;

    /**
    * 返回记录条数 最大为100默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 返回记录偏移 默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 1为从早到晚，2为从晚到早，默认为2
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 服务记录SessionID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get 实例 ID（废弃） 
     * @return InstanceId 实例 ID（废弃）
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID（废弃）
     * @param InstanceId 实例 ID（废弃）
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 服务记录ID 
     * @return CdrId 服务记录ID
     */
    public String getCdrId() {
        return this.CdrId;
    }

    /**
     * Set 服务记录ID
     * @param CdrId 服务记录ID
     */
    public void setCdrId(String CdrId) {
        this.CdrId = CdrId;
    }

    /**
     * Get 返回记录条数 最大为100默认20 
     * @return Limit 返回记录条数 最大为100默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数 最大为100默认20
     * @param Limit 返回记录条数 最大为100默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 返回记录偏移 默认为0 
     * @return Offset 返回记录偏移 默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回记录偏移 默认为0
     * @param Offset 返回记录偏移 默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 1为从早到晚，2为从晚到早，默认为2 
     * @return Order 1为从早到晚，2为从晚到早，默认为2
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 1为从早到晚，2为从晚到早，默认为2
     * @param Order 1为从早到晚，2为从晚到早，默认为2
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 服务记录SessionID 
     * @return SessionId 服务记录SessionID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 服务记录SessionID
     * @param SessionId 服务记录SessionID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public DescribeChatMessagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChatMessagesRequest(DescribeChatMessagesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.CdrId != null) {
            this.CdrId = new String(source.CdrId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "CdrId", this.CdrId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

