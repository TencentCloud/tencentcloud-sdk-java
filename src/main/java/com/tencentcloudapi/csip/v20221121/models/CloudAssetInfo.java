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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudAssetInfo extends AbstractModel {

    /**
    * 云厂商类型
枚举值：
tencent：腾讯云
aliyun：阿里云
aws：AWS
huawei：华为云
azure：Azure
    */
    @SerializedName("CloudType")
    @Expose
    private String CloudType;

    /**
    * 该云厂商的资产数量
取值范围：[0, +∞)
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 云厂商类型
枚举值：
tencent：腾讯云
aliyun：阿里云
aws：AWS
huawei：华为云
azure：Azure 
     * @return CloudType 云厂商类型
枚举值：
tencent：腾讯云
aliyun：阿里云
aws：AWS
huawei：华为云
azure：Azure
     */
    public String getCloudType() {
        return this.CloudType;
    }

    /**
     * Set 云厂商类型
枚举值：
tencent：腾讯云
aliyun：阿里云
aws：AWS
huawei：华为云
azure：Azure
     * @param CloudType 云厂商类型
枚举值：
tencent：腾讯云
aliyun：阿里云
aws：AWS
huawei：华为云
azure：Azure
     */
    public void setCloudType(String CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get 该云厂商的资产数量
取值范围：[0, +∞) 
     * @return Count 该云厂商的资产数量
取值范围：[0, +∞)
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 该云厂商的资产数量
取值范围：[0, +∞)
     * @param Count 该云厂商的资产数量
取值范围：[0, +∞)
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public CloudAssetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudAssetInfo(CloudAssetInfo source) {
        if (source.CloudType != null) {
            this.CloudType = new String(source.CloudType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

