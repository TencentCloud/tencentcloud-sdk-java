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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTrafficPackagesRequest extends AbstractModel{

    /**
    * 流量包规格。可选值:
<li>10: 10GB流量，有效期一个月</li>
<li>50: 50GB流量，有效期一个月</li>
<li>512: 512GB流量，有效期一个月</li>
<li>1024: 1TB流量，有效期一个月</li>
<li>5120: 5TB流量，有效期一个月</li>
<li>51200: 50TB流量，有效期一个月</li>
<li>60: 60GB流量，有效期半年</li>
<li>300: 300GB流量，有效期半年</li>
<li>600: 600GB流量，有效期半年</li>
<li>3072: 3TB流量，有效期半年</li>
<li>6144: 6TB流量，有效期半年</li>
<li>30720: 30TB流量，有效期半年</li>
<li>61440: 60TB流量，有效期半年</li>
<li>307200: 300TB流量，有效期半年</li>
    */
    @SerializedName("TrafficAmount")
    @Expose
    private Long TrafficAmount;

    /**
    * 流量包数量，可选范围 1~20。
    */
    @SerializedName("TrafficPackageCount")
    @Expose
    private Long TrafficPackageCount;

    /**
     * Get 流量包规格。可选值:
<li>10: 10GB流量，有效期一个月</li>
<li>50: 50GB流量，有效期一个月</li>
<li>512: 512GB流量，有效期一个月</li>
<li>1024: 1TB流量，有效期一个月</li>
<li>5120: 5TB流量，有效期一个月</li>
<li>51200: 50TB流量，有效期一个月</li>
<li>60: 60GB流量，有效期半年</li>
<li>300: 300GB流量，有效期半年</li>
<li>600: 600GB流量，有效期半年</li>
<li>3072: 3TB流量，有效期半年</li>
<li>6144: 6TB流量，有效期半年</li>
<li>30720: 30TB流量，有效期半年</li>
<li>61440: 60TB流量，有效期半年</li>
<li>307200: 300TB流量，有效期半年</li> 
     * @return TrafficAmount 流量包规格。可选值:
<li>10: 10GB流量，有效期一个月</li>
<li>50: 50GB流量，有效期一个月</li>
<li>512: 512GB流量，有效期一个月</li>
<li>1024: 1TB流量，有效期一个月</li>
<li>5120: 5TB流量，有效期一个月</li>
<li>51200: 50TB流量，有效期一个月</li>
<li>60: 60GB流量，有效期半年</li>
<li>300: 300GB流量，有效期半年</li>
<li>600: 600GB流量，有效期半年</li>
<li>3072: 3TB流量，有效期半年</li>
<li>6144: 6TB流量，有效期半年</li>
<li>30720: 30TB流量，有效期半年</li>
<li>61440: 60TB流量，有效期半年</li>
<li>307200: 300TB流量，有效期半年</li>
     */
    public Long getTrafficAmount() {
        return this.TrafficAmount;
    }

    /**
     * Set 流量包规格。可选值:
<li>10: 10GB流量，有效期一个月</li>
<li>50: 50GB流量，有效期一个月</li>
<li>512: 512GB流量，有效期一个月</li>
<li>1024: 1TB流量，有效期一个月</li>
<li>5120: 5TB流量，有效期一个月</li>
<li>51200: 50TB流量，有效期一个月</li>
<li>60: 60GB流量，有效期半年</li>
<li>300: 300GB流量，有效期半年</li>
<li>600: 600GB流量，有效期半年</li>
<li>3072: 3TB流量，有效期半年</li>
<li>6144: 6TB流量，有效期半年</li>
<li>30720: 30TB流量，有效期半年</li>
<li>61440: 60TB流量，有效期半年</li>
<li>307200: 300TB流量，有效期半年</li>
     * @param TrafficAmount 流量包规格。可选值:
<li>10: 10GB流量，有效期一个月</li>
<li>50: 50GB流量，有效期一个月</li>
<li>512: 512GB流量，有效期一个月</li>
<li>1024: 1TB流量，有效期一个月</li>
<li>5120: 5TB流量，有效期一个月</li>
<li>51200: 50TB流量，有效期一个月</li>
<li>60: 60GB流量，有效期半年</li>
<li>300: 300GB流量，有效期半年</li>
<li>600: 600GB流量，有效期半年</li>
<li>3072: 3TB流量，有效期半年</li>
<li>6144: 6TB流量，有效期半年</li>
<li>30720: 30TB流量，有效期半年</li>
<li>61440: 60TB流量，有效期半年</li>
<li>307200: 300TB流量，有效期半年</li>
     */
    public void setTrafficAmount(Long TrafficAmount) {
        this.TrafficAmount = TrafficAmount;
    }

    /**
     * Get 流量包数量，可选范围 1~20。 
     * @return TrafficPackageCount 流量包数量，可选范围 1~20。
     */
    public Long getTrafficPackageCount() {
        return this.TrafficPackageCount;
    }

    /**
     * Set 流量包数量，可选范围 1~20。
     * @param TrafficPackageCount 流量包数量，可选范围 1~20。
     */
    public void setTrafficPackageCount(Long TrafficPackageCount) {
        this.TrafficPackageCount = TrafficPackageCount;
    }

    public CreateTrafficPackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTrafficPackagesRequest(CreateTrafficPackagesRequest source) {
        if (source.TrafficAmount != null) {
            this.TrafficAmount = new Long(source.TrafficAmount);
        }
        if (source.TrafficPackageCount != null) {
            this.TrafficPackageCount = new Long(source.TrafficPackageCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficAmount", this.TrafficAmount);
        this.setParamSimple(map, prefix + "TrafficPackageCount", this.TrafficPackageCount);

    }
}

