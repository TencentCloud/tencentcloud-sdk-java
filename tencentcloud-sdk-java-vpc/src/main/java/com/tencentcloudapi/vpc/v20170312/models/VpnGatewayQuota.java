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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpnGatewayQuota extends AbstractModel{

    /**
    * 带宽配额
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 配额中文名称
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 配额英文名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 带宽配额 
     * @return Bandwidth 带宽配额
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽配额
     * @param Bandwidth 带宽配额
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 配额中文名称 
     * @return Cname 配额中文名称
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set 配额中文名称
     * @param Cname 配额中文名称
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 配额英文名称 
     * @return Name 配额英文名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配额英文名称
     * @param Name 配额英文名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

