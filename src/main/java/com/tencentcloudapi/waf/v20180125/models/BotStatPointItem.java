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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotStatPointItem extends AbstractModel{

    /**
    * 横坐标
    */
    @SerializedName("TimeStamp")
    @Expose
    private String TimeStamp;

    /**
    * value的所属对象
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 纵列表
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * Key对应的页面展示内容
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get 横坐标 
     * @return TimeStamp 横坐标
     */
    public String getTimeStamp() {
        return this.TimeStamp;
    }

    /**
     * Set 横坐标
     * @param TimeStamp 横坐标
     */
    public void setTimeStamp(String TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    /**
     * Get value的所属对象 
     * @return Key value的所属对象
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set value的所属对象
     * @param Key value的所属对象
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 纵列表 
     * @return Value 纵列表
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 纵列表
     * @param Value 纵列表
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get Key对应的页面展示内容 
     * @return Label Key对应的页面展示内容
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Key对应的页面展示内容
     * @param Label Key对应的页面展示内容
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    public BotStatPointItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotStatPointItem(BotStatPointItem source) {
        if (source.TimeStamp != null) {
            this.TimeStamp = new String(source.TimeStamp);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeStamp", this.TimeStamp);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

