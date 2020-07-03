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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIotDataTypeRequest extends AbstractModel{

    /**
    * 用户自定义数据类型，json格式的字符串
    */
    @SerializedName("IotDataType")
    @Expose
    private String IotDataType;

    /**
     * Get 用户自定义数据类型，json格式的字符串 
     * @return IotDataType 用户自定义数据类型，json格式的字符串
     */
    public String getIotDataType() {
        return this.IotDataType;
    }

    /**
     * Set 用户自定义数据类型，json格式的字符串
     * @param IotDataType 用户自定义数据类型，json格式的字符串
     */
    public void setIotDataType(String IotDataType) {
        this.IotDataType = IotDataType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IotDataType", this.IotDataType);

    }
}

