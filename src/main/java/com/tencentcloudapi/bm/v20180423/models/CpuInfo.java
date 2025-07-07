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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CpuInfo extends AbstractModel {

    /**
    * CPU的ID
    */
    @SerializedName("CpuId")
    @Expose
    private Long CpuId;

    /**
    * CPU型号描述
    */
    @SerializedName("CpuDescription")
    @Expose
    private String CpuDescription;

    /**
    * 机型序列
    */
    @SerializedName("Series")
    @Expose
    private Long Series;

    /**
    * 支持的RAID方式，0：有RAID卡，1：没有RAID卡
    */
    @SerializedName("ContainRaidCard")
    @Expose
    private Long [] ContainRaidCard;

    /**
     * Get CPU的ID 
     * @return CpuId CPU的ID
     */
    public Long getCpuId() {
        return this.CpuId;
    }

    /**
     * Set CPU的ID
     * @param CpuId CPU的ID
     */
    public void setCpuId(Long CpuId) {
        this.CpuId = CpuId;
    }

    /**
     * Get CPU型号描述 
     * @return CpuDescription CPU型号描述
     */
    public String getCpuDescription() {
        return this.CpuDescription;
    }

    /**
     * Set CPU型号描述
     * @param CpuDescription CPU型号描述
     */
    public void setCpuDescription(String CpuDescription) {
        this.CpuDescription = CpuDescription;
    }

    /**
     * Get 机型序列 
     * @return Series 机型序列
     */
    public Long getSeries() {
        return this.Series;
    }

    /**
     * Set 机型序列
     * @param Series 机型序列
     */
    public void setSeries(Long Series) {
        this.Series = Series;
    }

    /**
     * Get 支持的RAID方式，0：有RAID卡，1：没有RAID卡 
     * @return ContainRaidCard 支持的RAID方式，0：有RAID卡，1：没有RAID卡
     */
    public Long [] getContainRaidCard() {
        return this.ContainRaidCard;
    }

    /**
     * Set 支持的RAID方式，0：有RAID卡，1：没有RAID卡
     * @param ContainRaidCard 支持的RAID方式，0：有RAID卡，1：没有RAID卡
     */
    public void setContainRaidCard(Long [] ContainRaidCard) {
        this.ContainRaidCard = ContainRaidCard;
    }

    public CpuInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CpuInfo(CpuInfo source) {
        if (source.CpuId != null) {
            this.CpuId = new Long(source.CpuId);
        }
        if (source.CpuDescription != null) {
            this.CpuDescription = new String(source.CpuDescription);
        }
        if (source.Series != null) {
            this.Series = new Long(source.Series);
        }
        if (source.ContainRaidCard != null) {
            this.ContainRaidCard = new Long[source.ContainRaidCard.length];
            for (int i = 0; i < source.ContainRaidCard.length; i++) {
                this.ContainRaidCard[i] = new Long(source.ContainRaidCard[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuId", this.CpuId);
        this.setParamSimple(map, prefix + "CpuDescription", this.CpuDescription);
        this.setParamSimple(map, prefix + "Series", this.Series);
        this.setParamArraySimple(map, prefix + "ContainRaidCard.", this.ContainRaidCard);

    }
}

