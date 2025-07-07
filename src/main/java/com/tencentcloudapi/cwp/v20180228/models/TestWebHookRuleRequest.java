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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TestWebHookRuleRequest extends AbstractModel {

    /**
    * 规则Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 测试内容
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get 规则Id 
     * @return Id 规则Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则Id
     * @param Id 规则Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 测试内容 
     * @return Data 测试内容
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 测试内容
     * @param Data 测试内容
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public TestWebHookRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TestWebHookRuleRequest(TestWebHookRuleRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

