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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliverRule extends AbstractModel {

    /**
    * <p>数据投递范围。</p><p>枚举值：</p><ul><li>1： 历史+新增数据</li><li>2： 自定义时间范围</li><li>3： 仅新增</li></ul><p>本次仅支持3新增数据。后续支持： 2自定义时间范围和1历史+新增数据</p>
    */
    @SerializedName("DataScope")
    @Expose
    private Long DataScope;

    /**
     * Get <p>数据投递范围。</p><p>枚举值：</p><ul><li>1： 历史+新增数据</li><li>2： 自定义时间范围</li><li>3： 仅新增</li></ul><p>本次仅支持3新增数据。后续支持： 2自定义时间范围和1历史+新增数据</p> 
     * @return DataScope <p>数据投递范围。</p><p>枚举值：</p><ul><li>1： 历史+新增数据</li><li>2： 自定义时间范围</li><li>3： 仅新增</li></ul><p>本次仅支持3新增数据。后续支持： 2自定义时间范围和1历史+新增数据</p>
     */
    public Long getDataScope() {
        return this.DataScope;
    }

    /**
     * Set <p>数据投递范围。</p><p>枚举值：</p><ul><li>1： 历史+新增数据</li><li>2： 自定义时间范围</li><li>3： 仅新增</li></ul><p>本次仅支持3新增数据。后续支持： 2自定义时间范围和1历史+新增数据</p>
     * @param DataScope <p>数据投递范围。</p><p>枚举值：</p><ul><li>1： 历史+新增数据</li><li>2： 自定义时间范围</li><li>3： 仅新增</li></ul><p>本次仅支持3新增数据。后续支持： 2自定义时间范围和1历史+新增数据</p>
     */
    public void setDataScope(Long DataScope) {
        this.DataScope = DataScope;
    }

    public DeliverRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliverRule(DeliverRule source) {
        if (source.DataScope != null) {
            this.DataScope = new Long(source.DataScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataScope", this.DataScope);

    }
}

