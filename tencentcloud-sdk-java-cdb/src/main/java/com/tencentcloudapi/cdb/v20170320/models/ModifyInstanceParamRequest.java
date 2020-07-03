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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceParamRequest extends AbstractModel{

    /**
    * 实例短 ID 列表。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改成的值。
    */
    @SerializedName("ParamList")
    @Expose
    private Parameter [] ParamList;

    /**
     * Get 实例短 ID 列表。 
     * @return InstanceIds 实例短 ID 列表。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例短 ID 列表。
     * @param InstanceIds 实例短 ID 列表。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改成的值。 
     * @return ParamList 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改成的值。
     */
    public Parameter [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改成的值。
     * @param ParamList 要修改的参数列表。每一个元素是 Name 和 CurrentValue 的组合。Name 是参数名，CurrentValue 是要修改成的值。
     */
    public void setParamList(Parameter [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);

    }
}

