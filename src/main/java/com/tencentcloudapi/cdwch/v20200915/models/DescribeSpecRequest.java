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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpecRequest extends AbstractModel{

    /**
    * 地域信息，例如"ap-guangzhou-1"
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 计费类型，PREPAID 包年包月，POSTPAID_BY_HOUR 按量计费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 是否弹性ck
    */
    @SerializedName("IsElastic")
    @Expose
    private Boolean IsElastic;

    /**
     * Get 地域信息，例如"ap-guangzhou-1" 
     * @return Zone 地域信息，例如"ap-guangzhou-1"
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 地域信息，例如"ap-guangzhou-1"
     * @param Zone 地域信息，例如"ap-guangzhou-1"
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 计费类型，PREPAID 包年包月，POSTPAID_BY_HOUR 按量计费 
     * @return PayMode 计费类型，PREPAID 包年包月，POSTPAID_BY_HOUR 按量计费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费类型，PREPAID 包年包月，POSTPAID_BY_HOUR 按量计费
     * @param PayMode 计费类型，PREPAID 包年包月，POSTPAID_BY_HOUR 按量计费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 是否弹性ck 
     * @return IsElastic 是否弹性ck
     */
    public Boolean getIsElastic() {
        return this.IsElastic;
    }

    /**
     * Set 是否弹性ck
     * @param IsElastic 是否弹性ck
     */
    public void setIsElastic(Boolean IsElastic) {
        this.IsElastic = IsElastic;
    }

    public DescribeSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpecRequest(DescribeSpecRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.IsElastic != null) {
            this.IsElastic = new Boolean(source.IsElastic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "IsElastic", this.IsElastic);

    }
}

