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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VipEntity extends AbstractModel{

    /**
    * 虚拟IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 虚拟端口
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
     * Get 虚拟IP 
     * @return Vip 虚拟IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 虚拟IP
     * @param Vip 虚拟IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 虚拟端口 
     * @return Vport 虚拟端口
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set 虚拟端口
     * @param Vport 虚拟端口
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

