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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RackUsage extends AbstractModel {

    /**
    * 机架ID
    */
    @SerializedName("RackId")
    @Expose
    private Long RackId;

    /**
    * 已使用的机位数量
    */
    @SerializedName("UsedNum")
    @Expose
    private Long UsedNum;

    /**
    * 空闲机位数量
    */
    @SerializedName("UnusedNum")
    @Expose
    private Long UnusedNum;

    /**
    * 机架简称
    */
    @SerializedName("RackShortName")
    @Expose
    private String RackShortName;

    /**
    * 机位总数
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 机位使用率
    */
    @SerializedName("UsedRate")
    @Expose
    private Float UsedRate;

    /**
     * Get 机架ID 
     * @return RackId 机架ID
     */
    public Long getRackId() {
        return this.RackId;
    }

    /**
     * Set 机架ID
     * @param RackId 机架ID
     */
    public void setRackId(Long RackId) {
        this.RackId = RackId;
    }

    /**
     * Get 已使用的机位数量 
     * @return UsedNum 已使用的机位数量
     */
    public Long getUsedNum() {
        return this.UsedNum;
    }

    /**
     * Set 已使用的机位数量
     * @param UsedNum 已使用的机位数量
     */
    public void setUsedNum(Long UsedNum) {
        this.UsedNum = UsedNum;
    }

    /**
     * Get 空闲机位数量 
     * @return UnusedNum 空闲机位数量
     */
    public Long getUnusedNum() {
        return this.UnusedNum;
    }

    /**
     * Set 空闲机位数量
     * @param UnusedNum 空闲机位数量
     */
    public void setUnusedNum(Long UnusedNum) {
        this.UnusedNum = UnusedNum;
    }

    /**
     * Get 机架简称 
     * @return RackShortName 机架简称
     */
    public String getRackShortName() {
        return this.RackShortName;
    }

    /**
     * Set 机架简称
     * @param RackShortName 机架简称
     */
    public void setRackShortName(String RackShortName) {
        this.RackShortName = RackShortName;
    }

    /**
     * Get 机位总数 
     * @return TotalNum 机位总数
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 机位总数
     * @param TotalNum 机位总数
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 机位使用率 
     * @return UsedRate 机位使用率
     */
    public Float getUsedRate() {
        return this.UsedRate;
    }

    /**
     * Set 机位使用率
     * @param UsedRate 机位使用率
     */
    public void setUsedRate(Float UsedRate) {
        this.UsedRate = UsedRate;
    }

    public RackUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RackUsage(RackUsage source) {
        if (source.RackId != null) {
            this.RackId = new Long(source.RackId);
        }
        if (source.UsedNum != null) {
            this.UsedNum = new Long(source.UsedNum);
        }
        if (source.UnusedNum != null) {
            this.UnusedNum = new Long(source.UnusedNum);
        }
        if (source.RackShortName != null) {
            this.RackShortName = new String(source.RackShortName);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.UsedRate != null) {
            this.UsedRate = new Float(source.UsedRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RackId", this.RackId);
        this.setParamSimple(map, prefix + "UsedNum", this.UsedNum);
        this.setParamSimple(map, prefix + "UnusedNum", this.UnusedNum);
        this.setParamSimple(map, prefix + "RackShortName", this.RackShortName);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "UsedRate", this.UsedRate);

    }
}

