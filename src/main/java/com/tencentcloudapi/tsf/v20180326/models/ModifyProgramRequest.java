/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class ModifyProgramRequest extends AbstractModel {

    /**
    * 数据集ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)查询接口会返回数据集信息，包括programId
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
    * 数据集名称，不传入时不更新
    */
    @SerializedName("ProgramName")
    @Expose
    private String ProgramName;

    /**
    * 数据集描述，不传入时不更新
    */
    @SerializedName("ProgramDesc")
    @Expose
    private String ProgramDesc;

    /**
    * 数据项列表，传入null不更新，传入空数组全量删除
    */
    @SerializedName("ProgramItemList")
    @Expose
    private ProgramItem [] ProgramItemList;

    /**
    * ProgramItemList是否是空数组
    */
    @SerializedName("EmptyProgramItemList")
    @Expose
    private Boolean EmptyProgramItemList;

    /**
     * Get 数据集ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)查询接口会返回数据集信息，包括programId 
     * @return ProgramId 数据集ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)查询接口会返回数据集信息，包括programId
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set 数据集ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)查询接口会返回数据集信息，包括programId
     * @param ProgramId 数据集ID，调用[DescribePrograms](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program)查询接口会返回数据集信息，包括programId
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    /**
     * Get 数据集名称，不传入时不更新 
     * @return ProgramName 数据集名称，不传入时不更新
     */
    public String getProgramName() {
        return this.ProgramName;
    }

    /**
     * Set 数据集名称，不传入时不更新
     * @param ProgramName 数据集名称，不传入时不更新
     */
    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    /**
     * Get 数据集描述，不传入时不更新 
     * @return ProgramDesc 数据集描述，不传入时不更新
     */
    public String getProgramDesc() {
        return this.ProgramDesc;
    }

    /**
     * Set 数据集描述，不传入时不更新
     * @param ProgramDesc 数据集描述，不传入时不更新
     */
    public void setProgramDesc(String ProgramDesc) {
        this.ProgramDesc = ProgramDesc;
    }

    /**
     * Get 数据项列表，传入null不更新，传入空数组全量删除 
     * @return ProgramItemList 数据项列表，传入null不更新，传入空数组全量删除
     */
    public ProgramItem [] getProgramItemList() {
        return this.ProgramItemList;
    }

    /**
     * Set 数据项列表，传入null不更新，传入空数组全量删除
     * @param ProgramItemList 数据项列表，传入null不更新，传入空数组全量删除
     */
    public void setProgramItemList(ProgramItem [] ProgramItemList) {
        this.ProgramItemList = ProgramItemList;
    }

    /**
     * Get ProgramItemList是否是空数组 
     * @return EmptyProgramItemList ProgramItemList是否是空数组
     */
    public Boolean getEmptyProgramItemList() {
        return this.EmptyProgramItemList;
    }

    /**
     * Set ProgramItemList是否是空数组
     * @param EmptyProgramItemList ProgramItemList是否是空数组
     */
    public void setEmptyProgramItemList(Boolean EmptyProgramItemList) {
        this.EmptyProgramItemList = EmptyProgramItemList;
    }

    public ModifyProgramRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProgramRequest(ModifyProgramRequest source) {
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
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
        if (source.EmptyProgramItemList != null) {
            this.EmptyProgramItemList = new Boolean(source.EmptyProgramItemList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);
        this.setParamSimple(map, prefix + "ProgramName", this.ProgramName);
        this.setParamSimple(map, prefix + "ProgramDesc", this.ProgramDesc);
        this.setParamArrayObj(map, prefix + "ProgramItemList.", this.ProgramItemList);
        this.setParamSimple(map, prefix + "EmptyProgramItemList", this.EmptyProgramItemList);

    }
}

