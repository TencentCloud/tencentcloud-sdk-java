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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExampleTag extends AbstractModel {

    /**
    * <p>案例标签名称</p>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>标签数量</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get <p>案例标签名称</p> 
     * @return Tag <p>案例标签名称</p>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>案例标签名称</p>
     * @param Tag <p>案例标签名称</p>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>标签数量</p> 
     * @return Count <p>标签数量</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>标签数量</p>
     * @param Count <p>标签数量</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public ExampleTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExampleTag(ExampleTag source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

