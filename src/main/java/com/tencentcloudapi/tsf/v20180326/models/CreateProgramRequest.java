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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProgramRequest extends AbstractModel {

    /**
    * 数据集名称
    */
    @SerializedName("ProgramName")
    @Expose
    private String ProgramName;

    /**
    * 数据集描述
    */
    @SerializedName("ProgramDesc")
    @Expose
    private String ProgramDesc;

    /**
    * 数据项列表，传入null或空数组时不新增
    */
    @SerializedName("ProgramItemList")
    @Expose
    private ProgramItem [] ProgramItemList;

    /**
     * Get 数据集名称 
     * @return ProgramName 数据集名称
     */
    public String getProgramName() {
        return this.ProgramName;
    }

    /**
     * Set 数据集名称
     * @param ProgramName 数据集名称
     */
    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    /**
     * Get 数据集描述 
     * @return ProgramDesc 数据集描述
     */
    public String getProgramDesc() {
        return this.ProgramDesc;
    }

    /**
     * Set 数据集描述
     * @param ProgramDesc 数据集描述
     */
    public void setProgramDesc(String ProgramDesc) {
        this.ProgramDesc = ProgramDesc;
    }

    /**
     * Get 数据项列表，传入null或空数组时不新增 
     * @return ProgramItemList 数据项列表，传入null或空数组时不新增
     */
    public ProgramItem [] getProgramItemList() {
        return this.ProgramItemList;
    }

    /**
     * Set 数据项列表，传入null或空数组时不新增
     * @param ProgramItemList 数据项列表，传入null或空数组时不新增
     */
    public void setProgramItemList(ProgramItem [] ProgramItemList) {
        this.ProgramItemList = ProgramItemList;
    }

    public CreateProgramRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProgramRequest(CreateProgramRequest source) {
        if (source.ProgramName != null) {
            this.ProgramName = new String(source.ProgramName);
        }
        if (source.ProgramDesc != null) {
            this.ProgramDesc = new String(source.ProgramDesc);
        }
        if (source.ProgramItemList != null) {
            this.ProgramItemList = new ProgramItem[source.ProgramItemList.length];
            for (int i = 0; i < source.ProgramItemList.length; i++) {
                this.ProgramItemList[i] = new ProgramItem(source.ProgramItemList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProgramName", this.ProgramName);
        this.setParamSimple(map, prefix + "ProgramDesc", this.ProgramDesc);
        this.setParamArrayObj(map, prefix + "ProgramItemList.", this.ProgramItemList);

    }
}

