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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneConfig extends AbstractModel{

    /**
    * 点位ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 点位名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 点位类型:
1: 场门
3: 层门
5: 特殊区域
7: 门店
8: 补位
10: 开放式门店
11: 品类区
12: 公共区
    */
    @SerializedName("ZoneType")
    @Expose
    private Long ZoneType;

    /**
    * 铺位编码
    */
    @SerializedName("BunkCodes")
    @Expose
    private String BunkCodes;

    /**
    * 楼层名称
    */
    @SerializedName("FloorName")
    @Expose
    private String FloorName;

    /**
    * 楼层ID
    */
    @SerializedName("FloorId")
    @Expose
    private Long FloorId;

    /**
    * 绑定数
    */
    @SerializedName("BindNum")
    @Expose
    private Long BindNum;

    /**
    * 调试数
    */
    @SerializedName("DebugNum")
    @Expose
    private Long DebugNum;

    /**
    * 下发状态:
1: 不可下发
2: 可下发
3: 已下发
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
     * Get 点位ID 
     * @return ZoneId 点位ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 点位ID
     * @param ZoneId 点位ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 点位名称 
     * @return ZoneName 点位名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 点位名称
     * @param ZoneName 点位名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 点位类型:
1: 场门
3: 层门
5: 特殊区域
7: 门店
8: 补位
10: 开放式门店
11: 品类区
12: 公共区 
     * @return ZoneType 点位类型:
1: 场门
3: 层门
5: 特殊区域
7: 门店
8: 补位
10: 开放式门店
11: 品类区
12: 公共区
     */
    public Long getZoneType() {
        return this.ZoneType;
    }

    /**
     * Set 点位类型:
1: 场门
3: 层门
5: 特殊区域
7: 门店
8: 补位
10: 开放式门店
11: 品类区
12: 公共区
     * @param ZoneType 点位类型:
1: 场门
3: 层门
5: 特殊区域
7: 门店
8: 补位
10: 开放式门店
11: 品类区
12: 公共区
     */
    public void setZoneType(Long ZoneType) {
        this.ZoneType = ZoneType;
    }

    /**
     * Get 铺位编码 
     * @return BunkCodes 铺位编码
     */
    public String getBunkCodes() {
        return this.BunkCodes;
    }

    /**
     * Set 铺位编码
     * @param BunkCodes 铺位编码
     */
    public void setBunkCodes(String BunkCodes) {
        this.BunkCodes = BunkCodes;
    }

    /**
     * Get 楼层名称 
     * @return FloorName 楼层名称
     */
    public String getFloorName() {
        return this.FloorName;
    }

    /**
     * Set 楼层名称
     * @param FloorName 楼层名称
     */
    public void setFloorName(String FloorName) {
        this.FloorName = FloorName;
    }

    /**
     * Get 楼层ID 
     * @return FloorId 楼层ID
     */
    public Long getFloorId() {
        return this.FloorId;
    }

    /**
     * Set 楼层ID
     * @param FloorId 楼层ID
     */
    public void setFloorId(Long FloorId) {
        this.FloorId = FloorId;
    }

    /**
     * Get 绑定数 
     * @return BindNum 绑定数
     */
    public Long getBindNum() {
        return this.BindNum;
    }

    /**
     * Set 绑定数
     * @param BindNum 绑定数
     */
    public void setBindNum(Long BindNum) {
        this.BindNum = BindNum;
    }

    /**
     * Get 调试数 
     * @return DebugNum 调试数
     */
    public Long getDebugNum() {
        return this.DebugNum;
    }

    /**
     * Set 调试数
     * @param DebugNum 调试数
     */
    public void setDebugNum(Long DebugNum) {
        this.DebugNum = DebugNum;
    }

    /**
     * Get 下发状态:
1: 不可下发
2: 可下发
3: 已下发 
     * @return State 下发状态:
1: 不可下发
2: 可下发
3: 已下发
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 下发状态:
1: 不可下发
2: 可下发
3: 已下发
     * @param State 下发状态:
1: 不可下发
2: 可下发
3: 已下发
     */
    public void setState(Long State) {
        this.State = State;
    }

    public ZoneConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneConfig(ZoneConfig source) {
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ZoneType != null) {
            this.ZoneType = new Long(source.ZoneType);
        }
        if (source.BunkCodes != null) {
            this.BunkCodes = new String(source.BunkCodes);
        }
        if (source.FloorName != null) {
            this.FloorName = new String(source.FloorName);
        }
        if (source.FloorId != null) {
            this.FloorId = new Long(source.FloorId);
        }
        if (source.BindNum != null) {
            this.BindNum = new Long(source.BindNum);
        }
        if (source.DebugNum != null) {
            this.DebugNum = new Long(source.DebugNum);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneType", this.ZoneType);
        this.setParamSimple(map, prefix + "BunkCodes", this.BunkCodes);
        this.setParamSimple(map, prefix + "FloorName", this.FloorName);
        this.setParamSimple(map, prefix + "FloorId", this.FloorId);
        this.setParamSimple(map, prefix + "BindNum", this.BindNum);
        this.setParamSimple(map, prefix + "DebugNum", this.DebugNum);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

