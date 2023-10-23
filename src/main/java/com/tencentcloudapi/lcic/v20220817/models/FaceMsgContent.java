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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceMsgContent extends AbstractModel {

    /**
    * 表情索引，用户自定义。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 额外数据。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get 表情索引，用户自定义。 
     * @return Index 表情索引，用户自定义。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 表情索引，用户自定义。
     * @param Index 表情索引，用户自定义。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 额外数据。 
     * @return Data 额外数据。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 额外数据。
     * @param Data 额外数据。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public FaceMsgContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceMsgContent(FaceMsgContent source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

