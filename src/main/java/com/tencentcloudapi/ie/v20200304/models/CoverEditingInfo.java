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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CoverEditingInfo extends AbstractModel{

    /**
    * 是否开启智能封面。0为关闭，1为开启。其他非0非1值默认为0。
    */
    @SerializedName("Switch")
    @Expose
    private Long Switch;

    /**
    * 额外定制化服务参数。参数为序列化的Json字符串，例如：{"k1":"v1"}。
    */
    @SerializedName("CustomInfo")
    @Expose
    private String CustomInfo;

    /**
     * Get 是否开启智能封面。0为关闭，1为开启。其他非0非1值默认为0。 
     * @return Switch 是否开启智能封面。0为关闭，1为开启。其他非0非1值默认为0。
     */
    public Long getSwitch() {
        return this.Switch;
    }

    /**
     * Set 是否开启智能封面。0为关闭，1为开启。其他非0非1值默认为0。
     * @param Switch 是否开启智能封面。0为关闭，1为开启。其他非0非1值默认为0。
     */
    public void setSwitch(Long Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 额外定制化服务参数。参数为序列化的Json字符串，例如：{"k1":"v1"}。 
     * @return CustomInfo 额外定制化服务参数。参数为序列化的Json字符串，例如：{"k1":"v1"}。
     */
    public String getCustomInfo() {
        return this.CustomInfo;
    }

    /**
     * Set 额外定制化服务参数。参数为序列化的Json字符串，例如：{"k1":"v1"}。
     * @param CustomInfo 额外定制化服务参数。参数为序列化的Json字符串，例如：{"k1":"v1"}。
     */
    public void setCustomInfo(String CustomInfo) {
        this.CustomInfo = CustomInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "CustomInfo", this.CustomInfo);

    }
}

