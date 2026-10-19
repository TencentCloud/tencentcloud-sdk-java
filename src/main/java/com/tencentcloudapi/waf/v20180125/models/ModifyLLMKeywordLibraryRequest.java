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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLLMKeywordLibraryRequest extends AbstractModel {

    /**
    * 新增的关键词库列表
    */
    @SerializedName("LibList")
    @Expose
    private LLMKeywordLibrary [] LibList;

    /**
     * Get 新增的关键词库列表 
     * @return LibList 新增的关键词库列表
     */
    public LLMKeywordLibrary [] getLibList() {
        return this.LibList;
    }

    /**
     * Set 新增的关键词库列表
     * @param LibList 新增的关键词库列表
     */
    public void setLibList(LLMKeywordLibrary [] LibList) {
        this.LibList = LibList;
    }

    public ModifyLLMKeywordLibraryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLLMKeywordLibraryRequest(ModifyLLMKeywordLibraryRequest source) {
        if (source.LibList != null) {
            this.LibList = new LLMKeywordLibrary[source.LibList.length];
            for (int i = 0; i < source.LibList.length; i++) {
                this.LibList[i] = new LLMKeywordLibrary(source.LibList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LibList.", this.LibList);

    }
}

