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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoLicenseEntity extends AbstractModel {

    /**
    * 激活码类型，取值范围如下：0_5_mbps、1_mbps、1_5_mbps、2_mbps
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 有效激活码总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 待使用的激活码数量
    */
    @SerializedName("UsedCount")
    @Expose
    private Long UsedCount;

    /**
    * 即将过期的激活码数量
    */
    @SerializedName("ExpiresSoonCount")
    @Expose
    private Long ExpiresSoonCount;

    /**
     * Get 激活码类型，取值范围如下：0_5_mbps、1_mbps、1_5_mbps、2_mbps 
     * @return Type 激活码类型，取值范围如下：0_5_mbps、1_mbps、1_5_mbps、2_mbps
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 激活码类型，取值范围如下：0_5_mbps、1_mbps、1_5_mbps、2_mbps
     * @param Type 激活码类型，取值范围如下：0_5_mbps、1_mbps、1_5_mbps、2_mbps
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 有效激活码总数 
     * @return TotalCount 有效激活码总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 有效激活码总数
     * @param TotalCount 有效激活码总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 待使用的激活码数量 
     * @return UsedCount 待使用的激活码数量
     */
    public Long getUsedCount() {
        return this.UsedCount;
    }

    /**
     * Set 待使用的激活码数量
     * @param UsedCount 待使用的激活码数量
     */
    public void setUsedCount(Long UsedCount) {
        this.UsedCount = UsedCount;
    }

    /**
     * Get 即将过期的激活码数量 
     * @return ExpiresSoonCount 即将过期的激活码数量
     */
    public Long getExpiresSoonCount() {
        return this.ExpiresSoonCount;
    }

    /**
     * Set 即将过期的激活码数量
     * @param ExpiresSoonCount 即将过期的激活码数量
     */
    public void setExpiresSoonCount(Long ExpiresSoonCount) {
        this.ExpiresSoonCount = ExpiresSoonCount;
    }

    public VideoLicenseEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoLicenseEntity(VideoLicenseEntity source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.UsedCount != null) {
            this.UsedCount = new Long(source.UsedCount);
        }
        if (source.ExpiresSoonCount != null) {
            this.ExpiresSoonCount = new Long(source.ExpiresSoonCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "UsedCount", this.UsedCount);
        this.setParamSimple(map, prefix + "ExpiresSoonCount", this.ExpiresSoonCount);

    }
}

