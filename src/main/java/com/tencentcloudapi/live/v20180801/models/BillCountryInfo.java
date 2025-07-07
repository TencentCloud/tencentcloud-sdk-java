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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillCountryInfo extends AbstractModel {

    /**
    * 国家名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 带宽明细数据信息。
    */
    @SerializedName("BandInfoList")
    @Expose
    private BillDataInfo [] BandInfoList;

    /**
     * Get 国家名称 
     * @return Name 国家名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 国家名称
     * @param Name 国家名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 带宽明细数据信息。 
     * @return BandInfoList 带宽明细数据信息。
     */
    public BillDataInfo [] getBandInfoList() {
        return this.BandInfoList;
    }

    /**
     * Set 带宽明细数据信息。
     * @param BandInfoList 带宽明细数据信息。
     */
    public void setBandInfoList(BillDataInfo [] BandInfoList) {
        this.BandInfoList = BandInfoList;
    }

    public BillCountryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillCountryInfo(BillCountryInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BandInfoList != null) {
            this.BandInfoList = new BillDataInfo[source.BandInfoList.length];
            for (int i = 0; i < source.BandInfoList.length; i++) {
                this.BandInfoList[i] = new BillDataInfo(source.BandInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "BandInfoList.", this.BandInfoList);

    }
}

