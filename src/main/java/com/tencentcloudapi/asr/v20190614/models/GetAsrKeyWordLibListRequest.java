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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAsrKeyWordLibListRequest extends AbstractModel {

    /**
    * 分页Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 词库名称或者UIN检索
    */
    @SerializedName("SpecifyNames")
    @Expose
    private String [] SpecifyNames;

    /**
    * 只看用户自己创建的
    */
    @SerializedName("OnlySelf")
    @Expose
    private Boolean OnlySelf;

    /**
     * Get 分页Offset 
     * @return Offset 分页Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Offset
     * @param Offset 分页Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页Limit 
     * @return Limit 分页Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页Limit
     * @param Limit 分页Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 词库名称或者UIN检索 
     * @return SpecifyNames 词库名称或者UIN检索
     */
    public String [] getSpecifyNames() {
        return this.SpecifyNames;
    }

    /**
     * Set 词库名称或者UIN检索
     * @param SpecifyNames 词库名称或者UIN检索
     */
    public void setSpecifyNames(String [] SpecifyNames) {
        this.SpecifyNames = SpecifyNames;
    }

    /**
     * Get 只看用户自己创建的 
     * @return OnlySelf 只看用户自己创建的
     */
    public Boolean getOnlySelf() {
        return this.OnlySelf;
    }

    /**
     * Set 只看用户自己创建的
     * @param OnlySelf 只看用户自己创建的
     */
    public void setOnlySelf(Boolean OnlySelf) {
        this.OnlySelf = OnlySelf;
    }

    public GetAsrKeyWordLibListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAsrKeyWordLibListRequest(GetAsrKeyWordLibListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SpecifyNames != null) {
            this.SpecifyNames = new String[source.SpecifyNames.length];
            for (int i = 0; i < source.SpecifyNames.length; i++) {
                this.SpecifyNames[i] = new String(source.SpecifyNames[i]);
            }
        }
        if (source.OnlySelf != null) {
            this.OnlySelf = new Boolean(source.OnlySelf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "SpecifyNames.", this.SpecifyNames);
        this.setParamSimple(map, prefix + "OnlySelf", this.OnlySelf);

    }
}

