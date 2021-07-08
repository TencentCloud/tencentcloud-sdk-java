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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpStatic extends AbstractModel{

    /**
    * 值
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 折线图横坐标时间
    */
    @SerializedName("StatTime")
    @Expose
    private String StatTime;

    /**
     * Get 值 
     * @return Num 值
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 值
     * @param Num 值
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 折线图横坐标时间 
     * @return StatTime 折线图横坐标时间
     */
    public String getStatTime() {
        return this.StatTime;
    }

    /**
     * Set 折线图横坐标时间
     * @param StatTime 折线图横坐标时间
     */
    public void setStatTime(String StatTime) {
        this.StatTime = StatTime;
    }

    public IpStatic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpStatic(IpStatic source) {
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.StatTime != null) {
            this.StatTime = new String(source.StatTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "StatTime", this.StatTime);

    }
}

