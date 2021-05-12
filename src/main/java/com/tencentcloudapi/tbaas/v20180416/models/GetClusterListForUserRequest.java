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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetClusterListForUserRequest extends AbstractModel{

    /**
    * 模块名，本接口取值：cluster_mng
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，本接口取值：cluster_list_for_user
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 返回数据项数，本接口默认取值：10，上限取值：20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 返回数据起始偏移，本接口默认取值：0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 模块名，本接口取值：cluster_mng 
     * @return Module 模块名，本接口取值：cluster_mng
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，本接口取值：cluster_mng
     * @param Module 模块名，本接口取值：cluster_mng
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，本接口取值：cluster_list_for_user 
     * @return Operation 操作名，本接口取值：cluster_list_for_user
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，本接口取值：cluster_list_for_user
     * @param Operation 操作名，本接口取值：cluster_list_for_user
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 返回数据项数，本接口默认取值：10，上限取值：20 
     * @return Limit 返回数据项数，本接口默认取值：10，上限取值：20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数据项数，本接口默认取值：10，上限取值：20
     * @param Limit 返回数据项数，本接口默认取值：10，上限取值：20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 返回数据起始偏移，本接口默认取值：0 
     * @return Offset 返回数据起始偏移，本接口默认取值：0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回数据起始偏移，本接口默认取值：0
     * @param Offset 返回数据起始偏移，本接口默认取值：0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public GetClusterListForUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetClusterListForUserRequest(GetClusterListForUserRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

