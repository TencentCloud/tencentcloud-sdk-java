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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CriticalInfo extends AbstractModel {

    /**
    * 危急重症类型 0:文字描述类 1:数值检查类
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 提示
    */
    @SerializedName("Tips")
    @Expose
    private String Tips;

    /**
     * Get 危急重症类型 0:文字描述类 1:数值检查类 
     * @return Type 危急重症类型 0:文字描述类 1:数值检查类
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 危急重症类型 0:文字描述类 1:数值检查类
     * @param Type 危急重症类型 0:文字描述类 1:数值检查类
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 提示 
     * @return Tips 提示
     */
    public String getTips() {
        return this.Tips;
    }

    /**
     * Set 提示
     * @param Tips 提示
     */
    public void setTips(String Tips) {
        this.Tips = Tips;
    }

    public CriticalInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CriticalInfo(CriticalInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Tips != null) {
            this.Tips = new String(source.Tips);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Tips", this.Tips);

    }
}

