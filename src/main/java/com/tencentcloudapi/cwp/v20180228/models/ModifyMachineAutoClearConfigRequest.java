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

public class ModifyMachineAutoClearConfigRequest extends AbstractModel {

    /**
    * 清理规则时间, 0 表示关闭, 单位为天, 最大为 30天
    */
    @SerializedName("ClearRule")
    @Expose
    private Long ClearRule;

    /**
     * Get 清理规则时间, 0 表示关闭, 单位为天, 最大为 30天 
     * @return ClearRule 清理规则时间, 0 表示关闭, 单位为天, 最大为 30天
     */
    public Long getClearRule() {
        return this.ClearRule;
    }

    /**
     * Set 清理规则时间, 0 表示关闭, 单位为天, 最大为 30天
     * @param ClearRule 清理规则时间, 0 表示关闭, 单位为天, 最大为 30天
     */
    public void setClearRule(Long ClearRule) {
        this.ClearRule = ClearRule;
    }

    public ModifyMachineAutoClearConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMachineAutoClearConfigRequest(ModifyMachineAutoClearConfigRequest source) {
        if (source.ClearRule != null) {
            this.ClearRule = new Long(source.ClearRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClearRule", this.ClearRule);

    }
}

