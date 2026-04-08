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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAddressesBandwidthRequest extends AbstractModel {

    /**
    * <p>EIP唯一标识ID列表，形如&#39;eip-xxxx&#39;，可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p>
    */
    @SerializedName("AddressIds")
    @Expose
    private String [] AddressIds;

    /**
    * <p>调整带宽目标值，可调整的带宽上限值参考产品文档<a href="https://cloud.tencent.com/document/product/1199/48333">带宽上限</a>。</p>
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * <p>包月带宽起始时间(已废弃，输入无效)</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>包月带宽结束时间(已废弃，输入无效)</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>EIP唯一标识ID列表，形如&#39;eip-xxxx&#39;，可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p> 
     * @return AddressIds <p>EIP唯一标识ID列表，形如&#39;eip-xxxx&#39;，可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p>
     */
    public String [] getAddressIds() {
        return this.AddressIds;
    }

    /**
     * Set <p>EIP唯一标识ID列表，形如&#39;eip-xxxx&#39;，可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p>
     * @param AddressIds <p>EIP唯一标识ID列表，形如&#39;eip-xxxx&#39;，可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p>
     */
    public void setAddressIds(String [] AddressIds) {
        this.AddressIds = AddressIds;
    }

    /**
     * Get <p>调整带宽目标值，可调整的带宽上限值参考产品文档<a href="https://cloud.tencent.com/document/product/1199/48333">带宽上限</a>。</p> 
     * @return InternetMaxBandwidthOut <p>调整带宽目标值，可调整的带宽上限值参考产品文档<a href="https://cloud.tencent.com/document/product/1199/48333">带宽上限</a>。</p>
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set <p>调整带宽目标值，可调整的带宽上限值参考产品文档<a href="https://cloud.tencent.com/document/product/1199/48333">带宽上限</a>。</p>
     * @param InternetMaxBandwidthOut <p>调整带宽目标值，可调整的带宽上限值参考产品文档<a href="https://cloud.tencent.com/document/product/1199/48333">带宽上限</a>。</p>
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get <p>包月带宽起始时间(已废弃，输入无效)</p> 
     * @return StartTime <p>包月带宽起始时间(已废弃，输入无效)</p>
     * @deprecated
     */
    @Deprecated
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>包月带宽起始时间(已废弃，输入无效)</p>
     * @param StartTime <p>包月带宽起始时间(已废弃，输入无效)</p>
     * @deprecated
     */
    @Deprecated
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>包月带宽结束时间(已废弃，输入无效)</p> 
     * @return EndTime <p>包月带宽结束时间(已废弃，输入无效)</p>
     * @deprecated
     */
    @Deprecated
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>包月带宽结束时间(已废弃，输入无效)</p>
     * @param EndTime <p>包月带宽结束时间(已废弃，输入无效)</p>
     * @deprecated
     */
    @Deprecated
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ModifyAddressesBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAddressesBandwidthRequest(ModifyAddressesBandwidthRequest source) {
        if (source.AddressIds != null) {
            this.AddressIds = new String[source.AddressIds.length];
            for (int i = 0; i < source.AddressIds.length; i++) {
                this.AddressIds[i] = new String(source.AddressIds[i]);
            }
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressIds.", this.AddressIds);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

