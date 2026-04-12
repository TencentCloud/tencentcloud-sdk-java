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

public class DescribeExceptionDetailRequest extends AbstractModel {

    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 消息唯一标识
    */
    @SerializedName("ClientIdentify")
    @Expose
    private String ClientIdentify;

    /**
    * 集群堆栈类型
    */
    @SerializedName("ClusterStackType")
    @Expose
    private Long ClusterStackType;

    /**
    * 特征
    */
    @SerializedName("Feature")
    @Expose
    private String Feature;

    /**
    * 问题类型
    */
    @SerializedName("IssueType")
    @Expose
    private Long IssueType;

    /**
    * 事件开始时间
    */
    @SerializedName("StartEventTime")
    @Expose
    private Long StartEventTime;

    /**
    * 事件结束时间
    */
    @SerializedName("EndEventTime")
    @Expose
    private Long EndEventTime;

    /**
    * 拓展数据
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
    * 请求头
    */
    @SerializedName("RequestHeader")
    @Expose
    private String RequestHeader;

    /**
     * Get 产品Id 
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 消息唯一标识 
     * @return ClientIdentify 消息唯一标识
     */
    public String getClientIdentify() {
        return this.ClientIdentify;
    }

    /**
     * Set 消息唯一标识
     * @param ClientIdentify 消息唯一标识
     */
    public void setClientIdentify(String ClientIdentify) {
        this.ClientIdentify = ClientIdentify;
    }

    /**
     * Get 集群堆栈类型 
     * @return ClusterStackType 集群堆栈类型
     */
    public Long getClusterStackType() {
        return this.ClusterStackType;
    }

    /**
     * Set 集群堆栈类型
     * @param ClusterStackType 集群堆栈类型
     */
    public void setClusterStackType(Long ClusterStackType) {
        this.ClusterStackType = ClusterStackType;
    }

    /**
     * Get 特征 
     * @return Feature 特征
     */
    public String getFeature() {
        return this.Feature;
    }

    /**
     * Set 特征
     * @param Feature 特征
     */
    public void setFeature(String Feature) {
        this.Feature = Feature;
    }

    /**
     * Get 问题类型 
     * @return IssueType 问题类型
     */
    public Long getIssueType() {
        return this.IssueType;
    }

    /**
     * Set 问题类型
     * @param IssueType 问题类型
     */
    public void setIssueType(Long IssueType) {
        this.IssueType = IssueType;
    }

    /**
     * Get 事件开始时间 
     * @return StartEventTime 事件开始时间
     */
    public Long getStartEventTime() {
        return this.StartEventTime;
    }

    /**
     * Set 事件开始时间
     * @param StartEventTime 事件开始时间
     */
    public void setStartEventTime(Long StartEventTime) {
        this.StartEventTime = StartEventTime;
    }

    /**
     * Get 事件结束时间 
     * @return EndEventTime 事件结束时间
     */
    public Long getEndEventTime() {
        return this.EndEventTime;
    }

    /**
     * Set 事件结束时间
     * @param EndEventTime 事件结束时间
     */
    public void setEndEventTime(Long EndEventTime) {
        this.EndEventTime = EndEventTime;
    }

    /**
     * Get 拓展数据 
     * @return ExtraData 拓展数据
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set 拓展数据
     * @param ExtraData 拓展数据
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    /**
     * Get 请求头 
     * @return RequestHeader 请求头
     */
    public String getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set 请求头
     * @param RequestHeader 请求头
     */
    public void setRequestHeader(String RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    public DescribeExceptionDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExceptionDetailRequest(DescribeExceptionDetailRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ClientIdentify != null) {
            this.ClientIdentify = new String(source.ClientIdentify);
        }
        if (source.ClusterStackType != null) {
            this.ClusterStackType = new Long(source.ClusterStackType);
        }
        if (source.Feature != null) {
            this.Feature = new String(source.Feature);
        }
        if (source.IssueType != null) {
            this.IssueType = new Long(source.IssueType);
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
        this.setParamSimple(map, prefix + "ClusterStackType", this.ClusterStackType);
        this.setParamSimple(map, prefix + "Feature", this.Feature);
        this.setParamSimple(map, prefix + "IssueType", this.IssueType);
        this.setParamSimple(map, prefix + "StartEventTime", this.StartEventTime);
        this.setParamSimple(map, prefix + "EndEventTime", this.EndEventTime);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);
        this.setParamSimple(map, prefix + "RequestHeader", this.RequestHeader);

    }
}

