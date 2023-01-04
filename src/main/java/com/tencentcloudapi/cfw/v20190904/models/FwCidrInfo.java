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

public class FwCidrInfo extends AbstractModel{

    /**
    * 防火墙使用的网段类型，值VpcSelf/Assis/Custom分别代表自有网段优先/扩展网段优先/自定义
    */
    @SerializedName("FwCidrType")
    @Expose
    private String FwCidrType;

    /**
    * 为每个vpc指定防火墙的网段
    */
    @SerializedName("FwCidrLst")
    @Expose
    private FwVpcCidr [] FwCidrLst;

    /**
    * 其他防火墙占用网段，一般是防火墙需要独占vpc时指定的网段
    */
    @SerializedName("ComFwCidr")
    @Expose
    private String ComFwCidr;

    /**
     * Get 防火墙使用的网段类型，值VpcSelf/Assis/Custom分别代表自有网段优先/扩展网段优先/自定义 
     * @return FwCidrType 防火墙使用的网段类型，值VpcSelf/Assis/Custom分别代表自有网段优先/扩展网段优先/自定义
     */
    public String getFwCidrType() {
        return this.FwCidrType;
    }

    /**
     * Set 防火墙使用的网段类型，值VpcSelf/Assis/Custom分别代表自有网段优先/扩展网段优先/自定义
     * @param FwCidrType 防火墙使用的网段类型，值VpcSelf/Assis/Custom分别代表自有网段优先/扩展网段优先/自定义
     */
    public void setFwCidrType(String FwCidrType) {
        this.FwCidrType = FwCidrType;
    }

    /**
     * Get 为每个vpc指定防火墙的网段 
     * @return FwCidrLst 为每个vpc指定防火墙的网段
     */
    public FwVpcCidr [] getFwCidrLst() {
        return this.FwCidrLst;
    }

    /**
     * Set 为每个vpc指定防火墙的网段
     * @param FwCidrLst 为每个vpc指定防火墙的网段
     */
    public void setFwCidrLst(FwVpcCidr [] FwCidrLst) {
        this.FwCidrLst = FwCidrLst;
    }

    /**
     * Get 其他防火墙占用网段，一般是防火墙需要独占vpc时指定的网段 
     * @return ComFwCidr 其他防火墙占用网段，一般是防火墙需要独占vpc时指定的网段
     */
    public String getComFwCidr() {
        return this.ComFwCidr;
    }

    /**
     * Set 其他防火墙占用网段，一般是防火墙需要独占vpc时指定的网段
     * @param ComFwCidr 其他防火墙占用网段，一般是防火墙需要独占vpc时指定的网段
     */
    public void setComFwCidr(String ComFwCidr) {
        this.ComFwCidr = ComFwCidr;
    }

    public FwCidrInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FwCidrInfo(FwCidrInfo source) {
        if (source.FwCidrType != null) {
            this.FwCidrType = new String(source.FwCidrType);
        }
        if (source.FwCidrLst != null) {
            this.FwCidrLst = new FwVpcCidr[source.FwCidrLst.length];
            for (int i = 0; i < source.FwCidrLst.length; i++) {
                this.FwCidrLst[i] = new FwVpcCidr(source.FwCidrLst[i]);
            }
        }
        if (source.ComFwCidr != null) {
            this.ComFwCidr = new String(source.ComFwCidr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FwCidrType", this.FwCidrType);
        this.setParamArrayObj(map, prefix + "FwCidrLst.", this.FwCidrLst);
        this.setParamSimple(map, prefix + "ComFwCidr", this.ComFwCidr);

    }
}

