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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineLicenseDetail extends AbstractModel {

    /**
    * 主机quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * xx
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * xxx
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * xxx
    */
    @SerializedName("InquireKey")
    @Expose
    private String InquireKey;

    /**
    * xxx
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
     * Get 主机quuid 
     * @return Quuid 主机quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机quuid
     * @param Quuid 主机quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get xx 
     * @return PayMode xx
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set xx
     * @param PayMode xx
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get xxx 
     * @return ResourceId xxx
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set xxx
     * @param ResourceId xxx
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get xxx 
     * @return InquireKey xxx
     */
    public String getInquireKey() {
        return this.InquireKey;
    }

    /**
     * Set xxx
     * @param InquireKey xxx
     */
    public void setInquireKey(String InquireKey) {
        this.InquireKey = InquireKey;
    }

    /**
     * Get xxx 
     * @return SourceType xxx
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set xxx
     * @param SourceType xxx
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    public MachineLicenseDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineLicenseDetail(MachineLicenseDetail source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.InquireKey != null) {
            this.InquireKey = new String(source.InquireKey);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "InquireKey", this.InquireKey);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

