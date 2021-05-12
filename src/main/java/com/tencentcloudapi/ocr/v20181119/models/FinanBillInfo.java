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

public class FinanBillInfo extends AbstractModel{

    /**
    * 识别出的字段名称(关键字)，支持以下字段：
【进账单】
日期、出票全称、出票账号、出票开户行、收款人全称、收款人账号、收款开户行、大写金额、小写金额、票据种类、票据张数、票据号码；
【支票】
开户银行、支票种类、凭证号码2、日期、大写金额、小写金额、付款行编号、密码、凭证号码1；
【银行承兑汇票】或【商业承兑汇票】
出票日期、行号1、行号2、出票人全称、出票人账号、付款行全称、收款人全称、收款人账号、收款人开户行、出票金额大写、出票金额小写、汇票到期日、付款行行号、付款行地址。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 识别出的字段名称对应的值，也就是字段Name对应的字符串结果。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 识别出的字段名称(关键字)，支持以下字段：
【进账单】
日期、出票全称、出票账号、出票开户行、收款人全称、收款人账号、收款开户行、大写金额、小写金额、票据种类、票据张数、票据号码；
【支票】
开户银行、支票种类、凭证号码2、日期、大写金额、小写金额、付款行编号、密码、凭证号码1；
【银行承兑汇票】或【商业承兑汇票】
出票日期、行号1、行号2、出票人全称、出票人账号、付款行全称、收款人全称、收款人账号、收款人开户行、出票金额大写、出票金额小写、汇票到期日、付款行行号、付款行地址。 
     * @return Name 识别出的字段名称(关键字)，支持以下字段：
【进账单】
日期、出票全称、出票账号、出票开户行、收款人全称、收款人账号、收款开户行、大写金额、小写金额、票据种类、票据张数、票据号码；
【支票】
开户银行、支票种类、凭证号码2、日期、大写金额、小写金额、付款行编号、密码、凭证号码1；
【银行承兑汇票】或【商业承兑汇票】
出票日期、行号1、行号2、出票人全称、出票人账号、付款行全称、收款人全称、收款人账号、收款人开户行、出票金额大写、出票金额小写、汇票到期日、付款行行号、付款行地址。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 识别出的字段名称(关键字)，支持以下字段：
【进账单】
日期、出票全称、出票账号、出票开户行、收款人全称、收款人账号、收款开户行、大写金额、小写金额、票据种类、票据张数、票据号码；
【支票】
开户银行、支票种类、凭证号码2、日期、大写金额、小写金额、付款行编号、密码、凭证号码1；
【银行承兑汇票】或【商业承兑汇票】
出票日期、行号1、行号2、出票人全称、出票人账号、付款行全称、收款人全称、收款人账号、收款人开户行、出票金额大写、出票金额小写、汇票到期日、付款行行号、付款行地址。
     * @param Name 识别出的字段名称(关键字)，支持以下字段：
【进账单】
日期、出票全称、出票账号、出票开户行、收款人全称、收款人账号、收款开户行、大写金额、小写金额、票据种类、票据张数、票据号码；
【支票】
开户银行、支票种类、凭证号码2、日期、大写金额、小写金额、付款行编号、密码、凭证号码1；
【银行承兑汇票】或【商业承兑汇票】
出票日期、行号1、行号2、出票人全称、出票人账号、付款行全称、收款人全称、收款人账号、收款人开户行、出票金额大写、出票金额小写、汇票到期日、付款行行号、付款行地址。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 识别出的字段名称对应的值，也就是字段Name对应的字符串结果。 
     * @return Value 识别出的字段名称对应的值，也就是字段Name对应的字符串结果。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 识别出的字段名称对应的值，也就是字段Name对应的字符串结果。
     * @param Value 识别出的字段名称对应的值，也就是字段Name对应的字符串结果。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public FinanBillInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FinanBillInfo(FinanBillInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

