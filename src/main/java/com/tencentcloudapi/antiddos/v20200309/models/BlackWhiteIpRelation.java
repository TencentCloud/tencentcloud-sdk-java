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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BlackWhiteIpRelation extends AbstractModel{

    /**
    * IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * IP类型，取值[black(黑IP)，white(白IP)]
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 黑白IP所属的实例
    */
    @SerializedName("InstanceDetailList")
    @Expose
    private InstanceRelation [] InstanceDetailList;

    /**
    * ip掩码，0表示32位完整ip
    */
    @SerializedName("Mask")
    @Expose
    private Long Mask;

    /**
     * Get IP地址 
     * @return Ip IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
     * @param Ip IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get IP类型，取值[black(黑IP)，white(白IP)] 
     * @return Type IP类型，取值[black(黑IP)，white(白IP)]
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set IP类型，取值[black(黑IP)，white(白IP)]
     * @param Type IP类型，取值[black(黑IP)，white(白IP)]
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 黑白IP所属的实例 
     * @return InstanceDetailList 黑白IP所属的实例
     */
    public InstanceRelation [] getInstanceDetailList() {
        return this.InstanceDetailList;
    }

    /**
     * Set 黑白IP所属的实例
     * @param InstanceDetailList 黑白IP所属的实例
     */
    public void setInstanceDetailList(InstanceRelation [] InstanceDetailList) {
        this.InstanceDetailList = InstanceDetailList;
    }

    /**
     * Get ip掩码，0表示32位完整ip 
     * @return Mask ip掩码，0表示32位完整ip
     */
    public Long getMask() {
        return this.Mask;
    }

    /**
     * Set ip掩码，0表示32位完整ip
     * @param Mask ip掩码，0表示32位完整ip
     */
    public void setMask(Long Mask) {
        this.Mask = Mask;
    }

    public BlackWhiteIpRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlackWhiteIpRelation(BlackWhiteIpRelation source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InstanceDetailList != null) {
            this.InstanceDetailList = new InstanceRelation[source.InstanceDetailList.length];
            for (int i = 0; i < source.InstanceDetailList.length; i++) {
                this.InstanceDetailList[i] = new InstanceRelation(source.InstanceDetailList[i]);
            }
        }
        if (source.Mask != null) {
            this.Mask = new Long(source.Mask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "InstanceDetailList.", this.InstanceDetailList);
        this.setParamSimple(map, prefix + "Mask", this.Mask);

    }
}

