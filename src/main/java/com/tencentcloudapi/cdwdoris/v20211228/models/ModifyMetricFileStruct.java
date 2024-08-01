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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMetricFileStruct extends AbstractModel {

    /**
    * 唯一id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 是否关注
    */
    @SerializedName("IfAttention")
    @Expose
    private String IfAttention;

    /**
     * Get 唯一id 
     * @return Id 唯一id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 唯一id
     * @param Id 唯一id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 是否关注 
     * @return IfAttention 是否关注
     */
    public String getIfAttention() {
        return this.IfAttention;
    }

    /**
     * Set 是否关注
     * @param IfAttention 是否关注
     */
    public void setIfAttention(String IfAttention) {
        this.IfAttention = IfAttention;
    }

    public ModifyMetricFileStruct() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMetricFileStruct(ModifyMetricFileStruct source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.IfAttention != null) {
            this.IfAttention = new String(source.IfAttention);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IfAttention", this.IfAttention);

    }
}

