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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecConfig extends AbstractModel{

    /**
    * 规格机型
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * 规格列表
    */
    @SerializedName("SpecConfigInfos")
    @Expose
    private SpecConfigInfo [] SpecConfigInfos;

    /**
     * Get 规格机型 
     * @return Machine 规格机型
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * Set 规格机型
     * @param Machine 规格机型
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
    }

    /**
     * Get 规格列表 
     * @return SpecConfigInfos 规格列表
     */
    public SpecConfigInfo [] getSpecConfigInfos() {
        return this.SpecConfigInfos;
    }

    /**
     * Set 规格列表
     * @param SpecConfigInfos 规格列表
     */
    public void setSpecConfigInfos(SpecConfigInfo [] SpecConfigInfos) {
        this.SpecConfigInfos = SpecConfigInfos;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Machine", this.Machine);
        this.setParamArrayObj(map, prefix + "SpecConfigInfos.", this.SpecConfigInfos);

    }
}

