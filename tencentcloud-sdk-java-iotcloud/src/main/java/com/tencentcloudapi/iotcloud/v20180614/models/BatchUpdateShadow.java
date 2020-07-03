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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchUpdateShadow extends AbstractModel{

    /**
    * 设备影子的期望状态，格式为 Json 对象序列化之后的字符串
    */
    @SerializedName("Desired")
    @Expose
    private String Desired;

    /**
     * Get 设备影子的期望状态，格式为 Json 对象序列化之后的字符串 
     * @return Desired 设备影子的期望状态，格式为 Json 对象序列化之后的字符串
     */
    public String getDesired() {
        return this.Desired;
    }

    /**
     * Set 设备影子的期望状态，格式为 Json 对象序列化之后的字符串
     * @param Desired 设备影子的期望状态，格式为 Json 对象序列化之后的字符串
     */
    public void setDesired(String Desired) {
        this.Desired = Desired;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Desired", this.Desired);

    }
}

