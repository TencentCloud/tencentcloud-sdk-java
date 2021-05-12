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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlightInvoiceInfo extends AbstractModel{

    /**
    * 识别出的字段名称(关键字)，支持以下字段：
票价、合计金额、填开日期、有效身份证件号码、电子客票号码、验证码、旅客姓名、填开单位、其他税费、燃油附加费、民航发展基金、保险费、销售单位代号、始发地、目的地、航班号、时间、日期、座位等级、承运人、发票消费类型、国内国际标签、印刷序号、客票级别/类别、客票生效日期、有效期截止日期、免费行李。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 识别出的字段名称对应的值，也就是字段 Name 对应的字符串结果。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 多个行程的字段所在行号，下标从0开始，非行字段或未能识别行号的该值返回-1。
    */
    @SerializedName("Row")
    @Expose
    private Long Row;

    /**
     * Get 识别出的字段名称(关键字)，支持以下字段：
票价、合计金额、填开日期、有效身份证件号码、电子客票号码、验证码、旅客姓名、填开单位、其他税费、燃油附加费、民航发展基金、保险费、销售单位代号、始发地、目的地、航班号、时间、日期、座位等级、承运人、发票消费类型、国内国际标签、印刷序号、客票级别/类别、客票生效日期、有效期截止日期、免费行李。 
     * @return Name 识别出的字段名称(关键字)，支持以下字段：
票价、合计金额、填开日期、有效身份证件号码、电子客票号码、验证码、旅客姓名、填开单位、其他税费、燃油附加费、民航发展基金、保险费、销售单位代号、始发地、目的地、航班号、时间、日期、座位等级、承运人、发票消费类型、国内国际标签、印刷序号、客票级别/类别、客票生效日期、有效期截止日期、免费行李。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 识别出的字段名称(关键字)，支持以下字段：
票价、合计金额、填开日期、有效身份证件号码、电子客票号码、验证码、旅客姓名、填开单位、其他税费、燃油附加费、民航发展基金、保险费、销售单位代号、始发地、目的地、航班号、时间、日期、座位等级、承运人、发票消费类型、国内国际标签、印刷序号、客票级别/类别、客票生效日期、有效期截止日期、免费行李。
     * @param Name 识别出的字段名称(关键字)，支持以下字段：
票价、合计金额、填开日期、有效身份证件号码、电子客票号码、验证码、旅客姓名、填开单位、其他税费、燃油附加费、民航发展基金、保险费、销售单位代号、始发地、目的地、航班号、时间、日期、座位等级、承运人、发票消费类型、国内国际标签、印刷序号、客票级别/类别、客票生效日期、有效期截止日期、免费行李。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 识别出的字段名称对应的值，也就是字段 Name 对应的字符串结果。 
     * @return Value 识别出的字段名称对应的值，也就是字段 Name 对应的字符串结果。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 识别出的字段名称对应的值，也就是字段 Name 对应的字符串结果。
     * @param Value 识别出的字段名称对应的值，也就是字段 Name 对应的字符串结果。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 多个行程的字段所在行号，下标从0开始，非行字段或未能识别行号的该值返回-1。 
     * @return Row 多个行程的字段所在行号，下标从0开始，非行字段或未能识别行号的该值返回-1。
     */
    public Long getRow() {
        return this.Row;
    }

    /**
     * Set 多个行程的字段所在行号，下标从0开始，非行字段或未能识别行号的该值返回-1。
     * @param Row 多个行程的字段所在行号，下标从0开始，非行字段或未能识别行号的该值返回-1。
     */
    public void setRow(Long Row) {
        this.Row = Row;
    }

    public FlightInvoiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlightInvoiceInfo(FlightInvoiceInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Row != null) {
            this.Row = new Long(source.Row);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Row", this.Row);

    }
}

