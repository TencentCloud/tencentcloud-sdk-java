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

public class ModifyCcnRegionBandwidthLimitsTypeRequest extends AbstractModel {

    /**
    * 云联网实例ID。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 云联网限速类型，INTER_REGION_LIMIT：地域间限速，OUTER_REGION_LIMIT：地域出口限速。默认值：OUTER_REGION_LIMIT。
    */
    @SerializedName("BandwidthLimitType")
    @Expose
    private String BandwidthLimitType;

    /**
     * Get 云联网实例ID。 
     * @return CcnId 云联网实例ID。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网实例ID。
     * @param CcnId 云联网实例ID。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 云联网限速类型，INTER_REGION_LIMIT：地域间限速，OUTER_REGION_LIMIT：地域出口限速。默认值：OUTER_REGION_LIMIT。 
     * @return BandwidthLimitType 云联网限速类型，INTER_REGION_LIMIT：地域间限速，OUTER_REGION_LIMIT：地域出口限速。默认值：OUTER_REGION_LIMIT。
     */
    public String getBandwidthLimitType() {
        return this.BandwidthLimitType;
    }

    /**
     * Set 云联网限速类型，INTER_REGION_LIMIT：地域间限速，OUTER_REGION_LIMIT：地域出口限速。默认值：OUTER_REGION_LIMIT。
     * @param BandwidthLimitType 云联网限速类型，INTER_REGION_LIMIT：地域间限速，OUTER_REGION_LIMIT：地域出口限速。默认值：OUTER_REGION_LIMIT。
     */
    public void setBandwidthLimitType(String BandwidthLimitType) {
        this.BandwidthLimitType = BandwidthLimitType;
    }

    public ModifyCcnRegionBandwidthLimitsTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCcnRegionBandwidthLimitsTypeRequest(ModifyCcnRegionBandwidthLimitsTypeRequest source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.BandwidthLimitType != null) {
            this.BandwidthLimitType = new String(source.BandwidthLimitType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "BandwidthLimitType", this.BandwidthLimitType);

    }
}

