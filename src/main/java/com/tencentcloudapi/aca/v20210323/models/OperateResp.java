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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperateResp extends AbstractModel {

    /**
    * 操作结果
    */
    @SerializedName("Dummy")
    @Expose
    private Boolean Dummy;

    /**
     * Get 操作结果 
     * @return Dummy 操作结果
     */
    public Boolean getDummy() {
        return this.Dummy;
    }

    /**
     * Set 操作结果
     * @param Dummy 操作结果
     */
    public void setDummy(Boolean Dummy) {
        this.Dummy = Dummy;
    }

    public OperateResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateResp(OperateResp source) {
        if (source.Dummy != null) {
            this.Dummy = new Boolean(source.Dummy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Dummy", this.Dummy);

    }
}

