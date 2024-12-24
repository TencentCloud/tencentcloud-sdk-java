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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TieringDetailInfo extends AbstractModel {

    /**
    * 低频存储容量
    */
    @SerializedName("TieringSizeInBytes")
    @Expose
    private Long TieringSizeInBytes;

    /**
    * 冷存储容量
    */
    @SerializedName("SecondaryTieringSizeInBytes")
    @Expose
    private Long SecondaryTieringSizeInBytes;

    /**
     * Get 低频存储容量 
     * @return TieringSizeInBytes 低频存储容量
     */
    public Long getTieringSizeInBytes() {
        return this.TieringSizeInBytes;
    }

    /**
     * Set 低频存储容量
     * @param TieringSizeInBytes 低频存储容量
     */
    public void setTieringSizeInBytes(Long TieringSizeInBytes) {
        this.TieringSizeInBytes = TieringSizeInBytes;
    }

    /**
     * Get 冷存储容量 
     * @return SecondaryTieringSizeInBytes 冷存储容量
     */
    public Long getSecondaryTieringSizeInBytes() {
        return this.SecondaryTieringSizeInBytes;
    }

    /**
     * Set 冷存储容量
     * @param SecondaryTieringSizeInBytes 冷存储容量
     */
    public void setSecondaryTieringSizeInBytes(Long SecondaryTieringSizeInBytes) {
        this.SecondaryTieringSizeInBytes = SecondaryTieringSizeInBytes;
    }

    public TieringDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TieringDetailInfo(TieringDetailInfo source) {
        if (source.TieringSizeInBytes != null) {
            this.TieringSizeInBytes = new Long(source.TieringSizeInBytes);
        }
        if (source.SecondaryTieringSizeInBytes != null) {
            this.SecondaryTieringSizeInBytes = new Long(source.SecondaryTieringSizeInBytes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TieringSizeInBytes", this.TieringSizeInBytes);
        this.setParamSimple(map, prefix + "SecondaryTieringSizeInBytes", this.SecondaryTieringSizeInBytes);

    }
}

