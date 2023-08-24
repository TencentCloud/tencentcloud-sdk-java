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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRegisterCodesRequest extends AbstractModel{

    /**
    * 注册码ID列表。限制输入的注册码ID数量大于0小于100。
    */
    @SerializedName("RegisterCodeIds")
    @Expose
    private String [] RegisterCodeIds;

    /**
     * Get 注册码ID列表。限制输入的注册码ID数量大于0小于100。 
     * @return RegisterCodeIds 注册码ID列表。限制输入的注册码ID数量大于0小于100。
     */
    public String [] getRegisterCodeIds() {
        return this.RegisterCodeIds;
    }

    /**
     * Set 注册码ID列表。限制输入的注册码ID数量大于0小于100。
     * @param RegisterCodeIds 注册码ID列表。限制输入的注册码ID数量大于0小于100。
     */
    public void setRegisterCodeIds(String [] RegisterCodeIds) {
        this.RegisterCodeIds = RegisterCodeIds;
    }

    public DeleteRegisterCodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRegisterCodesRequest(DeleteRegisterCodesRequest source) {
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

