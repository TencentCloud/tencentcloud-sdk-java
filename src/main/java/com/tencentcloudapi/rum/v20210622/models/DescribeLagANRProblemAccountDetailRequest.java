/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLagANRProblemAccountDetailRequest extends AbstractModel {

    /**
    * <p>产品Id</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>消息唯一标识</p>
    */
    @SerializedName("ClientIdentify")
    @Expose
    private String ClientIdentify;

    /**
    * <p>特征</p>
    */
    @SerializedName("Feature")
    @Expose
    private String Feature;

    /**
    * <p>事件开始时间</p>
    */
    @SerializedName("StartEventTime")
    @Expose
    private Long StartEventTime;

    /**
    * <p>事件结束时间</p>
    */
    @SerializedName("EndEventTime")
    @Expose
    private Long EndEventTime;

    /**
    * <p>拓展数据</p>
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
    * <p>请求头</p>
    */
    @SerializedName("RequestHeader")
    @Expose
    private String RequestHeader;

    /**
     * Get <p>产品Id</p> 
     * @return ProductId <p>产品Id</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品Id</p>
     * @param ProductId <p>产品Id</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>消息唯一标识</p> 
     * @return ClientIdentify <p>消息唯一标识</p>
     */
    public String getClientIdentify() {
        return this.ClientIdentify;
    }

    /**
     * Set <p>消息唯一标识</p>
     * @param ClientIdentify <p>消息唯一标识</p>
     */
    public void setClientIdentify(String ClientIdentify) {
        this.ClientIdentify = ClientIdentify;
    }

    /**
     * Get <p>特征</p> 
     * @return Feature <p>特征</p>
     */
    public String getFeature() {
        return this.Feature;
    }

    /**
     * Set <p>特征</p>
     * @param Feature <p>特征</p>
     */
    public void setFeature(String Feature) {
        this.Feature = Feature;
    }

    /**
     * Get <p>事件开始时间</p> 
     * @return StartEventTime <p>事件开始时间</p>
     */
    public Long getStartEventTime() {
        return this.StartEventTime;
    }

    /**
     * Set <p>事件开始时间</p>
     * @param StartEventTime <p>事件开始时间</p>
     */
    public void setStartEventTime(Long StartEventTime) {
        this.StartEventTime = StartEventTime;
    }

    /**
     * Get <p>事件结束时间</p> 
     * @return EndEventTime <p>事件结束时间</p>
     */
    public Long getEndEventTime() {
        return this.EndEventTime;
    }

    /**
     * Set <p>事件结束时间</p>
     * @param EndEventTime <p>事件结束时间</p>
     */
    public void setEndEventTime(Long EndEventTime) {
        this.EndEventTime = EndEventTime;
    }

    /**
     * Get <p>拓展数据</p> 
     * @return ExtraData <p>拓展数据</p>
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set <p>拓展数据</p>
     * @param ExtraData <p>拓展数据</p>
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    /**
     * Get <p>请求头</p> 
     * @return RequestHeader <p>请求头</p>
     */
    public String getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set <p>请求头</p>
     * @param RequestHeader <p>请求头</p>
     */
    public void setRequestHeader(String RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    public DescribeLagANRProblemAccountDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLagANRProblemAccountDetailRequest(DescribeLagANRProblemAccountDetailRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ClientIdentify != null) {
            this.ClientIdentify = new String(source.ClientIdentify);
        }
        if (source.Feature != null) {
            this.Feature = new String(source.Feature);
        }
        if (source.StartEventTime != null) {
            this.StartEventTime = new Long(source.StartEventTime);
        }
        if (source.EndEventTime != null) {
            this.EndEventTime = new Long(source.EndEventTime);
        }
        if (source.ExtraData != null) {
            this.ExtraData = new String(source.ExtraData);
        }
        if (source.RequestHeader != null) {
            this.RequestHeader = new String(source.RequestHeader);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ClientIdentify", this.ClientIdentify);
        this.setParamSimple(map, prefix + "Feature", this.Feature);
        this.setParamSimple(map, prefix + "StartEventTime", this.StartEventTime);
        this.setParamSimple(map, prefix + "EndEventTime", this.EndEventTime);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);
        this.setParamSimple(map, prefix + "RequestHeader", this.RequestHeader);

    }
}

