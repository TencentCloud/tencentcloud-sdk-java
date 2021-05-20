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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteNonlocalLoginPlacesRequest extends AbstractModel{

    /**
    * 删除异地登录事件的方式，可选值："Ids"、"Ip"、"All"，默认为Ids
    */
    @SerializedName("DelType")
    @Expose
    private String DelType;

    /**
    * 异地登录事件ID数组。DelType为Ids或DelType未填时此项必填
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 异地登录事件的Ip。DelType为Ip时必填
    */
    @SerializedName("Ip")
    @Expose
    private String [] Ip;

    /**
    * 主机Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get 删除异地登录事件的方式，可选值："Ids"、"Ip"、"All"，默认为Ids 
     * @return DelType 删除异地登录事件的方式，可选值："Ids"、"Ip"、"All"，默认为Ids
     */
    public String getDelType() {
        return this.DelType;
    }

    /**
     * Set 删除异地登录事件的方式，可选值："Ids"、"Ip"、"All"，默认为Ids
     * @param DelType 删除异地登录事件的方式，可选值："Ids"、"Ip"、"All"，默认为Ids
     */
    public void setDelType(String DelType) {
        this.DelType = DelType;
    }

    /**
     * Get 异地登录事件ID数组。DelType为Ids或DelType未填时此项必填 
     * @return Ids 异地登录事件ID数组。DelType为Ids或DelType未填时此项必填
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 异地登录事件ID数组。DelType为Ids或DelType未填时此项必填
     * @param Ids 异地登录事件ID数组。DelType为Ids或DelType未填时此项必填
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 异地登录事件的Ip。DelType为Ip时必填 
     * @return Ip 异地登录事件的Ip。DelType为Ip时必填
     */
    public String [] getIp() {
        return this.Ip;
    }

    /**
     * Set 异地登录事件的Ip。DelType为Ip时必填
     * @param Ip 异地登录事件的Ip。DelType为Ip时必填
     */
    public void setIp(String [] Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 主机Uuid 
     * @return Uuid 主机Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机Uuid
     * @param Uuid 主机Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public DeleteNonlocalLoginPlacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNonlocalLoginPlacesRequest(DeleteNonlocalLoginPlacesRequest source) {
        if (source.DelType != null) {
            this.DelType = new String(source.DelType);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.Ip != null) {
            this.Ip = new String[source.Ip.length];
            for (int i = 0; i < source.Ip.length; i++) {
                this.Ip[i] = new String(source.Ip[i]);
            }
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DelType", this.DelType);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamArraySimple(map, prefix + "Ip.", this.Ip);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

