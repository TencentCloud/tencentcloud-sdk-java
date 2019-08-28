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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NumberFormat  extends AbstractModel{

    /**
    * `{number}`变量的起始值，默认为0。
    */
    @SerializedName("InitialValue")
    @Expose
    private Long InitialValue;

    /**
    * `{number}`变量的增长步长，默认为1。
    */
    @SerializedName("Increment")
    @Expose
    private Long Increment;

    /**
    * `{number}`变量的最小长度，不足时补占位符。默认为1。
    */
    @SerializedName("MinLength")
    @Expose
    private Long MinLength;

    /**
    * `{number}`变量的长度不足时，补充的占位符。默认为"0"。
    */
    @SerializedName("PlaceHolder")
    @Expose
    private String PlaceHolder;

    /**
     * 获取`{number}`变量的起始值，默认为0。
     * @return InitialValue `{number}`变量的起始值，默认为0。
     */
    public Long getInitialValue() {
        return this.InitialValue;
    }

    /**
     * 设置`{number}`变量的起始值，默认为0。
     * @param InitialValue `{number}`变量的起始值，默认为0。
     */
    public void setInitialValue(Long InitialValue) {
        this.InitialValue = InitialValue;
    }

    /**
     * 获取`{number}`变量的增长步长，默认为1。
     * @return Increment `{number}`变量的增长步长，默认为1。
     */
    public Long getIncrement() {
        return this.Increment;
    }

    /**
     * 设置`{number}`变量的增长步长，默认为1。
     * @param Increment `{number}`变量的增长步长，默认为1。
     */
    public void setIncrement(Long Increment) {
        this.Increment = Increment;
    }

    /**
     * 获取`{number}`变量的最小长度，不足时补占位符。默认为1。
     * @return MinLength `{number}`变量的最小长度，不足时补占位符。默认为1。
     */
    public Long getMinLength() {
        return this.MinLength;
    }

    /**
     * 设置`{number}`变量的最小长度，不足时补占位符。默认为1。
     * @param MinLength `{number}`变量的最小长度，不足时补占位符。默认为1。
     */
    public void setMinLength(Long MinLength) {
        this.MinLength = MinLength;
    }

    /**
     * 获取`{number}`变量的长度不足时，补充的占位符。默认为"0"。
     * @return PlaceHolder `{number}`变量的长度不足时，补充的占位符。默认为"0"。
     */
    public String getPlaceHolder() {
        return this.PlaceHolder;
    }

    /**
     * 设置`{number}`变量的长度不足时，补充的占位符。默认为"0"。
     * @param PlaceHolder `{number}`变量的长度不足时，补充的占位符。默认为"0"。
     */
    public void setPlaceHolder(String PlaceHolder) {
        this.PlaceHolder = PlaceHolder;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InitialValue", this.InitialValue);
        this.setParamSimple(map, prefix + "Increment", this.Increment);
        this.setParamSimple(map, prefix + "MinLength", this.MinLength);
        this.setParamSimple(map, prefix + "PlaceHolder", this.PlaceHolder);

    }
}

