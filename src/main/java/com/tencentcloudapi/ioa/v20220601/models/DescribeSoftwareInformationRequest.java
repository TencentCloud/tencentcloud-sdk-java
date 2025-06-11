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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSoftwareInformationRequest extends AbstractModel {

    /**
    * 终端唯一标识Mid
    */
    @SerializedName("Mid")
    @Expose
    private String Mid;

    /**
    * 过滤条件、分页参数
<li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li>
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
     * Get 终端唯一标识Mid 
     * @return Mid 终端唯一标识Mid
     */
    public String getMid() {
        return this.Mid;
    }

    /**
     * Set 终端唯一标识Mid
     * @param Mid 终端唯一标识Mid
     */
    public void setMid(String Mid) {
        this.Mid = Mid;
    }

    /**
     * Get 过滤条件、分页参数
<li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li> 
     * @return Condition 过滤条件、分页参数
<li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li>
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set 过滤条件、分页参数
<li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li>
     * @param Condition 过滤条件、分页参数
<li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li>
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    public DescribeSoftwareInformationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSoftwareInformationRequest(DescribeSoftwareInformationRequest source) {
        if (source.Mid != null) {
            this.Mid = new String(source.Mid);
        }
        if (source.Condition != null) {
            this.Condition = new Condition(source.Condition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mid", this.Mid);
        this.setParamObj(map, prefix + "Condition.", this.Condition);

    }
}

