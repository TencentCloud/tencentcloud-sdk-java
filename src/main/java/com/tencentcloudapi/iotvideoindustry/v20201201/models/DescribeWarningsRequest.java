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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWarningsRequest extends AbstractModel{

    /**
    * 1:创建时间倒序 2：创建时间升序 3：level倒序 4：leve升序
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 可选设备id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 如果不传则查询所有，取值参见配置
    */
    @SerializedName("WarnLevelArray")
    @Expose
    private Long [] WarnLevelArray;

    /**
    * 如果不传则查询所有，取值参见配置
    */
    @SerializedName("WarnModeArray")
    @Expose
    private Long [] WarnModeArray;

    /**
    * 不传认为是0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 不传认为是20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 形似：2021-05-21 00:00:00 .取值在当前日前30天内，不传默认是当前日前30天日期
    */
    @SerializedName("DateBegin")
    @Expose
    private String DateBegin;

    /**
    * 形似：2021-05-21 23:59:59 .取值在当前日前30天内，不传默认是当前日前30天日期
    */
    @SerializedName("DateEnd")
    @Expose
    private String DateEnd;

    /**
     * Get 1:创建时间倒序 2：创建时间升序 3：level倒序 4：leve升序 
     * @return OrderType 1:创建时间倒序 2：创建时间升序 3：level倒序 4：leve升序
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 1:创建时间倒序 2：创建时间升序 3：level倒序 4：leve升序
     * @param OrderType 1:创建时间倒序 2：创建时间升序 3：level倒序 4：leve升序
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 可选设备id 
     * @return DeviceId 可选设备id
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 可选设备id
     * @param DeviceId 可选设备id
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 如果不传则查询所有，取值参见配置 
     * @return WarnLevelArray 如果不传则查询所有，取值参见配置
     */
    public Long [] getWarnLevelArray() {
        return this.WarnLevelArray;
    }

    /**
     * Set 如果不传则查询所有，取值参见配置
     * @param WarnLevelArray 如果不传则查询所有，取值参见配置
     */
    public void setWarnLevelArray(Long [] WarnLevelArray) {
        this.WarnLevelArray = WarnLevelArray;
    }

    /**
     * Get 如果不传则查询所有，取值参见配置 
     * @return WarnModeArray 如果不传则查询所有，取值参见配置
     */
    public Long [] getWarnModeArray() {
        return this.WarnModeArray;
    }

    /**
     * Set 如果不传则查询所有，取值参见配置
     * @param WarnModeArray 如果不传则查询所有，取值参见配置
     */
    public void setWarnModeArray(Long [] WarnModeArray) {
        this.WarnModeArray = WarnModeArray;
    }

    /**
     * Get 不传认为是0 
     * @return Offset 不传认为是0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 不传认为是0
     * @param Offset 不传认为是0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 不传认为是20 
     * @return Limit 不传认为是20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 不传认为是20
     * @param Limit 不传认为是20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 形似：2021-05-21 00:00:00 .取值在当前日前30天内，不传默认是当前日前30天日期 
     * @return DateBegin 形似：2021-05-21 00:00:00 .取值在当前日前30天内，不传默认是当前日前30天日期
     */
    public String getDateBegin() {
        return this.DateBegin;
    }

    /**
     * Set 形似：2021-05-21 00:00:00 .取值在当前日前30天内，不传默认是当前日前30天日期
     * @param DateBegin 形似：2021-05-21 00:00:00 .取值在当前日前30天内，不传默认是当前日前30天日期
     */
    public void setDateBegin(String DateBegin) {
        this.DateBegin = DateBegin;
    }

    /**
     * Get 形似：2021-05-21 23:59:59 .取值在当前日前30天内，不传默认是当前日前30天日期 
     * @return DateEnd 形似：2021-05-21 23:59:59 .取值在当前日前30天内，不传默认是当前日前30天日期
     */
    public String getDateEnd() {
        return this.DateEnd;
    }

    /**
     * Set 形似：2021-05-21 23:59:59 .取值在当前日前30天内，不传默认是当前日前30天日期
     * @param DateEnd 形似：2021-05-21 23:59:59 .取值在当前日前30天内，不传默认是当前日前30天日期
     */
    public void setDateEnd(String DateEnd) {
        this.DateEnd = DateEnd;
    }

    public DescribeWarningsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWarningsRequest(DescribeWarningsRequest source) {
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.WarnLevelArray != null) {
            this.WarnLevelArray = new Long[source.WarnLevelArray.length];
            for (int i = 0; i < source.WarnLevelArray.length; i++) {
                this.WarnLevelArray[i] = new Long(source.WarnLevelArray[i]);
            }
        }
        if (source.WarnModeArray != null) {
            this.WarnModeArray = new Long[source.WarnModeArray.length];
            for (int i = 0; i < source.WarnModeArray.length; i++) {
                this.WarnModeArray[i] = new Long(source.WarnModeArray[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DateBegin != null) {
            this.DateBegin = new String(source.DateBegin);
        }
        if (source.DateEnd != null) {
            this.DateEnd = new String(source.DateEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamArraySimple(map, prefix + "WarnLevelArray.", this.WarnLevelArray);
        this.setParamArraySimple(map, prefix + "WarnModeArray.", this.WarnModeArray);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DateBegin", this.DateBegin);
        this.setParamSimple(map, prefix + "DateEnd", this.DateEnd);

    }
}

