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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatLevel extends AbstractModel {

    /**
    * 汇总数。在线（正常+故障） + 离线
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 正常数
    */
    @SerializedName("NormalSum")
    @Expose
    private Long NormalSum;

    /**
    * 离线数
    */
    @SerializedName("OfflineSum")
    @Expose
    private Long OfflineSum;

    /**
    * 故障数
    */
    @SerializedName("FaultSum")
    @Expose
    private Long FaultSum;

    /**
    * 空间id
    */
    @SerializedName("SpaceCode")
    @Expose
    private String SpaceCode;

    /**
    * 设备类型统计列表
    */
    @SerializedName("StatDeviceTypeSet")
    @Expose
    private StatDeviceType [] StatDeviceTypeSet;

    /**
     * Get 汇总数。在线（正常+故障） + 离线 
     * @return Total 汇总数。在线（正常+故障） + 离线
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 汇总数。在线（正常+故障） + 离线
     * @param Total 汇总数。在线（正常+故障） + 离线
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 正常数 
     * @return NormalSum 正常数
     */
    public Long getNormalSum() {
        return this.NormalSum;
    }

    /**
     * Set 正常数
     * @param NormalSum 正常数
     */
    public void setNormalSum(Long NormalSum) {
        this.NormalSum = NormalSum;
    }

    /**
     * Get 离线数 
     * @return OfflineSum 离线数
     */
    public Long getOfflineSum() {
        return this.OfflineSum;
    }

    /**
     * Set 离线数
     * @param OfflineSum 离线数
     */
    public void setOfflineSum(Long OfflineSum) {
        this.OfflineSum = OfflineSum;
    }

    /**
     * Get 故障数 
     * @return FaultSum 故障数
     */
    public Long getFaultSum() {
        return this.FaultSum;
    }

    /**
     * Set 故障数
     * @param FaultSum 故障数
     */
    public void setFaultSum(Long FaultSum) {
        this.FaultSum = FaultSum;
    }

    /**
     * Get 空间id 
     * @return SpaceCode 空间id
     */
    public String getSpaceCode() {
        return this.SpaceCode;
    }

    /**
     * Set 空间id
     * @param SpaceCode 空间id
     */
    public void setSpaceCode(String SpaceCode) {
        this.SpaceCode = SpaceCode;
    }

    /**
     * Get 设备类型统计列表 
     * @return StatDeviceTypeSet 设备类型统计列表
     */
    public StatDeviceType [] getStatDeviceTypeSet() {
        return this.StatDeviceTypeSet;
    }

    /**
     * Set 设备类型统计列表
     * @param StatDeviceTypeSet 设备类型统计列表
     */
    public void setStatDeviceTypeSet(StatDeviceType [] StatDeviceTypeSet) {
        this.StatDeviceTypeSet = StatDeviceTypeSet;
    }

    public StatLevel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatLevel(StatLevel source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.NormalSum != null) {
            this.NormalSum = new Long(source.NormalSum);
        }
        if (source.OfflineSum != null) {
            this.OfflineSum = new Long(source.OfflineSum);
        }
        if (source.FaultSum != null) {
            this.FaultSum = new Long(source.FaultSum);
        }
        if (source.SpaceCode != null) {
            this.SpaceCode = new String(source.SpaceCode);
        }
        if (source.StatDeviceTypeSet != null) {
            this.StatDeviceTypeSet = new StatDeviceType[source.StatDeviceTypeSet.length];
            for (int i = 0; i < source.StatDeviceTypeSet.length; i++) {
                this.StatDeviceTypeSet[i] = new StatDeviceType(source.StatDeviceTypeSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "NormalSum", this.NormalSum);
        this.setParamSimple(map, prefix + "OfflineSum", this.OfflineSum);
        this.setParamSimple(map, prefix + "FaultSum", this.FaultSum);
        this.setParamSimple(map, prefix + "SpaceCode", this.SpaceCode);
        this.setParamArrayObj(map, prefix + "StatDeviceTypeSet.", this.StatDeviceTypeSet);

    }
}

