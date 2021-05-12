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
package com.tencentcloudapi.apcas.v20201127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallDetailItem extends AbstractModel{

    /**
    * 数据类型 0 imei 1 qimei 2 qq 3 phone 7:IDFA 8:MD5(imei)
    */
    @SerializedName("DataType")
    @Expose
    private Long DataType;

    /**
    * 有效数据量
    */
    @SerializedName("ValidAmount")
    @Expose
    private Long ValidAmount;

    /**
    * 调用时间
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get 数据类型 0 imei 1 qimei 2 qq 3 phone 7:IDFA 8:MD5(imei) 
     * @return DataType 数据类型 0 imei 1 qimei 2 qq 3 phone 7:IDFA 8:MD5(imei)
     */
    public Long getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据类型 0 imei 1 qimei 2 qq 3 phone 7:IDFA 8:MD5(imei)
     * @param DataType 数据类型 0 imei 1 qimei 2 qq 3 phone 7:IDFA 8:MD5(imei)
     */
    public void setDataType(Long DataType) {
        this.DataType = DataType;
    }

    /**
     * Get 有效数据量 
     * @return ValidAmount 有效数据量
     */
    public Long getValidAmount() {
        return this.ValidAmount;
    }

    /**
     * Set 有效数据量
     * @param ValidAmount 有效数据量
     */
    public void setValidAmount(Long ValidAmount) {
        this.ValidAmount = ValidAmount;
    }

    /**
     * Get 调用时间 
     * @return Date 调用时间
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 调用时间
     * @param Date 调用时间
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public CallDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallDetailItem(CallDetailItem source) {
        if (source.DataType != null) {
            this.DataType = new Long(source.DataType);
        }
        if (source.ValidAmount != null) {
            this.ValidAmount = new Long(source.ValidAmount);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "ValidAmount", this.ValidAmount);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

