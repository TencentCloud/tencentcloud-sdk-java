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

public class ModifyItemSwitchStatusRequest extends AbstractModel{

    /**
    * id值
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 状态值，0: 关闭 ,1:开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 0: 互联网边界边界防火墙开关，1：vpc防火墙开关
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get id值 
     * @return Id id值
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id值
     * @param Id id值
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 状态值，0: 关闭 ,1:开启 
     * @return Status 状态值，0: 关闭 ,1:开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态值，0: 关闭 ,1:开启
     * @param Status 状态值，0: 关闭 ,1:开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 0: 互联网边界边界防火墙开关，1：vpc防火墙开关 
     * @return Type 0: 互联网边界边界防火墙开关，1：vpc防火墙开关
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0: 互联网边界边界防火墙开关，1：vpc防火墙开关
     * @param Type 0: 互联网边界边界防火墙开关，1：vpc防火墙开关
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ModifyItemSwitchStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyItemSwitchStatusRequest(ModifyItemSwitchStatusRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

