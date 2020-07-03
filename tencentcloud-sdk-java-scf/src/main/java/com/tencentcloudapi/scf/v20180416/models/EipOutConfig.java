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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EipOutConfig extends AbstractModel{

    /**
    * 是否是固定IP，["TRUE","FALSE"]
    */
    @SerializedName("EipFixed")
    @Expose
    private String EipFixed;

    /**
    * IP列表
    */
    @SerializedName("Eips")
    @Expose
    private String [] Eips;

    /**
     * Get 是否是固定IP，["TRUE","FALSE"] 
     * @return EipFixed 是否是固定IP，["TRUE","FALSE"]
     */
    public String getEipFixed() {
        return this.EipFixed;
    }

    /**
     * Set 是否是固定IP，["TRUE","FALSE"]
     * @param EipFixed 是否是固定IP，["TRUE","FALSE"]
     */
    public void setEipFixed(String EipFixed) {
        this.EipFixed = EipFixed;
    }

    /**
     * Get IP列表 
     * @return Eips IP列表
     */
    public String [] getEips() {
        return this.Eips;
    }

    /**
     * Set IP列表
     * @param Eips IP列表
     */
    public void setEips(String [] Eips) {
        this.Eips = Eips;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EipFixed", this.EipFixed);
        this.setParamArraySimple(map, prefix + "Eips.", this.Eips);

    }
}

