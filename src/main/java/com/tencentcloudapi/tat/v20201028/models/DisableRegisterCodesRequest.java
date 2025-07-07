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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisableRegisterCodesRequest extends AbstractModel {

    /**
    * 注册码ID。

可通过 [DescribeRegisterCodes(查询注册码)](https://cloud.tencent.com/document/api/1340/96925) 接口获取。
    */
    @SerializedName("RegisterCodeIds")
    @Expose
    private String [] RegisterCodeIds;

    /**
     * Get 注册码ID。

可通过 [DescribeRegisterCodes(查询注册码)](https://cloud.tencent.com/document/api/1340/96925) 接口获取。 
     * @return RegisterCodeIds 注册码ID。

可通过 [DescribeRegisterCodes(查询注册码)](https://cloud.tencent.com/document/api/1340/96925) 接口获取。
     */
    public String [] getRegisterCodeIds() {
        return this.RegisterCodeIds;
    }

    /**
     * Set 注册码ID。

可通过 [DescribeRegisterCodes(查询注册码)](https://cloud.tencent.com/document/api/1340/96925) 接口获取。
     * @param RegisterCodeIds 注册码ID。

可通过 [DescribeRegisterCodes(查询注册码)](https://cloud.tencent.com/document/api/1340/96925) 接口获取。
     */
    public void setRegisterCodeIds(String [] RegisterCodeIds) {
        this.RegisterCodeIds = RegisterCodeIds;
    }

    public DisableRegisterCodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisableRegisterCodesRequest(DisableRegisterCodesRequest source) {
        if (source.RegisterCodeIds != null) {
            this.RegisterCodeIds = new String[source.RegisterCodeIds.length];
            for (int i = 0; i < source.RegisterCodeIds.length; i++) {
                this.RegisterCodeIds[i] = new String(source.RegisterCodeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RegisterCodeIds.", this.RegisterCodeIds);

    }
}

