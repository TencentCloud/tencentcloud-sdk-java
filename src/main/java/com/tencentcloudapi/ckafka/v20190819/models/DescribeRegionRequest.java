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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegionRequest extends AbstractModel {

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回最大结果数</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>业务字段，可忽略</p><p>枚举值：</p><ul><li>ckafka： ckafka业务</li><li>cmq： cmq业务</li></ul><p>默认值：ckafka</p>
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * <p>cdc专有集群业务字段，可忽略</p>
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回最大结果数</p> 
     * @return Limit <p>返回最大结果数</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回最大结果数</p>
     * @param Limit <p>返回最大结果数</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>业务字段，可忽略</p><p>枚举值：</p><ul><li>ckafka： ckafka业务</li><li>cmq： cmq业务</li></ul><p>默认值：ckafka</p> 
     * @return Business <p>业务字段，可忽略</p><p>枚举值：</p><ul><li>ckafka： ckafka业务</li><li>cmq： cmq业务</li></ul><p>默认值：ckafka</p>
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>业务字段，可忽略</p><p>枚举值：</p><ul><li>ckafka： ckafka业务</li><li>cmq： cmq业务</li></ul><p>默认值：ckafka</p>
     * @param Business <p>业务字段，可忽略</p><p>枚举值：</p><ul><li>ckafka： ckafka业务</li><li>cmq： cmq业务</li></ul><p>默认值：ckafka</p>
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get <p>cdc专有集群业务字段，可忽略</p> 
     * @return CdcId <p>cdc专有集群业务字段，可忽略</p>
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>cdc专有集群业务字段，可忽略</p>
     * @param CdcId <p>cdc专有集群业务字段，可忽略</p>
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    public DescribeRegionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegionRequest(DescribeRegionRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

