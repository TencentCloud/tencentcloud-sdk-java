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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClientUploadAccelerationUsageDataRequest extends AbstractModel{

    /**
    * 起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束日期，需大于等于起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 客户端上传加速类型，取值有：
<li> AccelerationWithHTTP：HTTP 传输方式的上传加速。</li>
<li> AccelerationWithQUIC：QUIC 传输方式的上传加速。</li>
默认查询所有加速类型的用量 。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。 
     * @return StartTime 起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
     * @param StartTime 起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束日期，需大于等于起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。 
     * @return EndTime 结束日期，需大于等于起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束日期，需大于等于起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
     * @param EndTime 结束日期，需大于等于起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b> 
     * @return SubAppId <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     * @param SubAppId <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 客户端上传加速类型，取值有：
<li> AccelerationWithHTTP：HTTP 传输方式的上传加速。</li>
<li> AccelerationWithQUIC：QUIC 传输方式的上传加速。</li>
默认查询所有加速类型的用量 。 
     * @return Type 客户端上传加速类型，取值有：
<li> AccelerationWithHTTP：HTTP 传输方式的上传加速。</li>
<li> AccelerationWithQUIC：QUIC 传输方式的上传加速。</li>
默认查询所有加速类型的用量 。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 客户端上传加速类型，取值有：
<li> AccelerationWithHTTP：HTTP 传输方式的上传加速。</li>
<li> AccelerationWithQUIC：QUIC 传输方式的上传加速。</li>
默认查询所有加速类型的用量 。
     * @param Type 客户端上传加速类型，取值有：
<li> AccelerationWithHTTP：HTTP 传输方式的上传加速。</li>
<li> AccelerationWithQUIC：QUIC 传输方式的上传加速。</li>
默认查询所有加速类型的用量 。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeClientUploadAccelerationUsageDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClientUploadAccelerationUsageDataRequest(DescribeClientUploadAccelerationUsageDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

