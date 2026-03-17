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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportScanDetailRequest extends AbstractModel {

    /**
    * <p>请求参数</p>
    */
    @SerializedName("ScanDetails")
    @Expose
    private ScanDetailItem [] ScanDetails;

    /**
     * Get <p>请求参数</p> 
     * @return ScanDetails <p>请求参数</p>
     */
    public ScanDetailItem [] getScanDetails() {
        return this.ScanDetails;
    }

    /**
     * Set <p>请求参数</p>
     * @param ScanDetails <p>请求参数</p>
     */
    public void setScanDetails(ScanDetailItem [] ScanDetails) {
        this.ScanDetails = ScanDetails;
    }

    public ReportScanDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportScanDetailRequest(ReportScanDetailRequest source) {
        if (source.ScanDetails != null) {
            this.ScanDetails = new ScanDetailItem[source.ScanDetails.length];
            for (int i = 0; i < source.ScanDetails.length; i++) {
                this.ScanDetails[i] = new ScanDetailItem(source.ScanDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ScanDetails.", this.ScanDetails);

    }
}

