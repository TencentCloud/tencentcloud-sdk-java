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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataTemplate  extends AbstractModel{

    /**
    * 数字类型
    */
    @SerializedName("Number")
    @Expose
    private NumberData Number;

    /**
    * 字符串类型
    */
    @SerializedName("String")
    @Expose
    private StringData String;

    /**
    * 枚举类型
    */
    @SerializedName("Enum")
    @Expose
    private EnumData Enum;

    /**
    * 布尔类型
    */
    @SerializedName("Bool")
    @Expose
    private BoolData Bool;

    /**
     * 获取数字类型
     * @return Number 数字类型
     */
    public NumberData getNumber() {
        return this.Number;
    }

    /**
     * 设置数字类型
     * @param Number 数字类型
     */
    public void setNumber(NumberData Number) {
        this.Number = Number;
    }

    /**
     * 获取字符串类型
     * @return String 字符串类型
     */
    public StringData getString() {
        return this.String;
    }

    /**
     * 设置字符串类型
     * @param String 字符串类型
     */
    public void setString(StringData String) {
        this.String = String;
    }

    /**
     * 获取枚举类型
     * @return Enum 枚举类型
     */
    public EnumData getEnum() {
        return this.Enum;
    }

    /**
     * 设置枚举类型
     * @param Enum 枚举类型
     */
    public void setEnum(EnumData Enum) {
        this.Enum = Enum;
    }

    /**
     * 获取布尔类型
     * @return Bool 布尔类型
     */
    public BoolData getBool() {
        return this.Bool;
    }

    /**
     * 设置布尔类型
     * @param Bool 布尔类型
     */
    public void setBool(BoolData Bool) {
        this.Bool = Bool;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Number.", this.Number);
        this.setParamObj(map, prefix + "String.", this.String);
        this.setParamObj(map, prefix + "Enum.", this.Enum);
        this.setParamObj(map, prefix + "Bool.", this.Bool);

    }
}

