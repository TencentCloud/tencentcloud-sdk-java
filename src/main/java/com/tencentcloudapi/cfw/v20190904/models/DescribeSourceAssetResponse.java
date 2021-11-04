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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSourceAssetResponse extends AbstractModel{

    /**
    * 地域集合
    */
    @SerializedName("ZoneList")
    @Expose
    private AssetZone [] ZoneList;

    /**
    * 数据
    */
    @SerializedName("Data")
    @Expose
    private InstanceInfo [] Data;

    /**
    * 返回数据总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 地域集合 
     * @return ZoneList 地域集合
     */
    public AssetZone [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set 地域集合
     * @param ZoneList 地域集合
     */
    public void setZoneList(AssetZone [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get 数据 
     * @return Data 数据
     */
    public InstanceInfo [] getData() {
        return this.Data;
    }

    /**
     * Set 数据
     * @param Data 数据
     */
    public void setData(InstanceInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get 返回数据总数 
     * @return Total 返回数据总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 返回数据总数
     * @param Total 返回数据总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSourceAssetResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSourceAssetResponse(DescribeSourceAssetResponse source) {
        if (source.ZoneList != null) {
            this.ZoneList = new AssetZone[source.ZoneList.length];
            for (int i = 0; i < source.ZoneList.length; i++) {
                this.ZoneList[i] = new AssetZone(source.ZoneList[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new InstanceInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new InstanceInfo(source.Data[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

