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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchBashRulesRequest  extends AbstractModel{

    /**
    * 规则ID
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 是否禁用
    */
    @SerializedName("Disabled")
    @Expose
    private Integer Disabled;

    /**
     * 获取规则ID
     * @return Id 规则ID
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置规则ID
     * @param Id 规则ID
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取是否禁用
     * @return Disabled 是否禁用
     */
    public Integer getDisabled() {
        return this.Disabled;
    }

    /**
     * 设置是否禁用
     * @param Disabled 是否禁用
     */
    public void setDisabled(Integer Disabled) {
        this.Disabled = Disabled;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);

    }
}

