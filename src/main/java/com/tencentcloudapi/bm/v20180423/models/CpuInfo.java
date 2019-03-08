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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CpuInfo  extends AbstractModel{

    /**
    * CPU的ID
    */
    @SerializedName("CpuId")
    @Expose
    private Integer CpuId;

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
    private Integer Series;

    /**
    * 支持的RAID方式，0：有RAID卡，1：没有RAID卡
    */
    @SerializedName("ContainRaidCard")
    @Expose
    private Integer [] ContainRaidCard;

    /**
     * 获取CPU的ID
     * @return CpuId CPU的ID
     */
    public Integer getCpuId() {
        return this.CpuId;
    }

    /**
     * 设置CPU的ID
     * @param CpuId CPU的ID
     */
    public void setCpuId(Integer CpuId) {
        this.CpuId = CpuId;
    }

    /**
     * 获取CPU型号描述
     * @return CpuDescription CPU型号描述
     */
    public String getCpuDescription() {
        return this.CpuDescription;
    }

    /**
     * 设置CPU型号描述
     * @param CpuDescription CPU型号描述
     */
    public void setCpuDescription(String CpuDescription) {
        this.CpuDescription = CpuDescription;
    }

    /**
     * 获取机型序列
     * @return Series 机型序列
     */
    public Integer getSeries() {
        return this.Series;
    }

    /**
     * 设置机型序列
     * @param Series 机型序列
     */
    public void setSeries(Integer Series) {
        this.Series = Series;
    }

    /**
     * 获取支持的RAID方式，0：有RAID卡，1：没有RAID卡
     * @return ContainRaidCard 支持的RAID方式，0：有RAID卡，1：没有RAID卡
     */
    public Integer [] getContainRaidCard() {
        return this.ContainRaidCard;
    }

    /**
     * 设置支持的RAID方式，0：有RAID卡，1：没有RAID卡
     * @param ContainRaidCard 支持的RAID方式，0：有RAID卡，1：没有RAID卡
     */
    public void setContainRaidCard(Integer [] ContainRaidCard) {
        this.ContainRaidCard = ContainRaidCard;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuId", this.CpuId);
        this.setParamSimple(map, prefix + "CpuDescription", this.CpuDescription);
        this.setParamSimple(map, prefix + "Series", this.Series);
        this.setParamArraySimple(map, prefix + "ContainRaidCard.", this.ContainRaidCard);

    }
}

