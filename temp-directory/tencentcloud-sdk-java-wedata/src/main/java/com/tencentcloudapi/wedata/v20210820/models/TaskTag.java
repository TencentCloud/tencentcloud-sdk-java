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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskTag extends AbstractModel {

    /**
    * 标签名称
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 标签值列表
    */
    @SerializedName("TagValues")
    @Expose
    private String [] TagValues;

    /**
     * Get 标签名称 
     * @return TagName 标签名称
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 标签名称
     * @param TagName 标签名称
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 标签值列表 
     * @return TagValues 标签值列表
     */
    public String [] getTagValues() {
        return this.TagValues;
    }

    /**
     * Set 标签值列表
     * @param TagValues 标签值列表
     */
    public void setTagValues(String [] TagValues) {
        this.TagValues = TagValues;
    }

    public TaskTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskTag(TaskTag source) {
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.TagValues != null) {
            this.TagValues = new String[source.TagValues.length];
            for (int i = 0; i < source.TagValues.length; i++) {
                this.TagValues[i] = new String(source.TagValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamArraySimple(map, prefix + "TagValues.", this.TagValues);

    }
}

