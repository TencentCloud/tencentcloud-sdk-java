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

public class ModifyAllSwitchStatusRequest extends AbstractModel{

    /**
    * 状态，0：关闭，1：开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 0: 互联网边界防火墙开关，1：vpc防火墙开关
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 选中的防火墙开关Id
    */
    @SerializedName("Ids")
    @Expose
    private String [] Ids;

    /**
    * NAT开关切换类型，1,单个子网，2，同开同关，3，全部
    */
    @SerializedName("ChangeType")
    @Expose
    private Long ChangeType;

    /**
    * NAT实例所在地域
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 状态，0：关闭，1：开启 
     * @return Status 状态，0：关闭，1：开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，0：关闭，1：开启
     * @param Status 状态，0：关闭，1：开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 0: 互联网边界防火墙开关，1：vpc防火墙开关 
     * @return Type 0: 互联网边界防火墙开关，1：vpc防火墙开关
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0: 互联网边界防火墙开关，1：vpc防火墙开关
     * @param Type 0: 互联网边界防火墙开关，1：vpc防火墙开关
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 选中的防火墙开关Id 
     * @return Ids 选中的防火墙开关Id
     */
    public String [] getIds() {
        return this.Ids;
    }

    /**
     * Set 选中的防火墙开关Id
     * @param Ids 选中的防火墙开关Id
     */
    public void setIds(String [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get NAT开关切换类型，1,单个子网，2，同开同关，3，全部 
     * @return ChangeType NAT开关切换类型，1,单个子网，2，同开同关，3，全部
     */
    public Long getChangeType() {
        return this.ChangeType;
    }

    /**
     * Set NAT开关切换类型，1,单个子网，2，同开同关，3，全部
     * @param ChangeType NAT开关切换类型，1,单个子网，2，同开同关，3，全部
     */
    public void setChangeType(Long ChangeType) {
        this.ChangeType = ChangeType;
    }

    /**
     * Get NAT实例所在地域 
     * @return Area NAT实例所在地域
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set NAT实例所在地域
     * @param Area NAT实例所在地域
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public ModifyAllSwitchStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAllSwitchStatusRequest(ModifyAllSwitchStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Ids != null) {
            this.Ids = new String[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new String(source.Ids[i]);
            }
        }
        if (source.ChangeType != null) {
            this.ChangeType = new Long(source.ChangeType);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "ChangeType", this.ChangeType);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

