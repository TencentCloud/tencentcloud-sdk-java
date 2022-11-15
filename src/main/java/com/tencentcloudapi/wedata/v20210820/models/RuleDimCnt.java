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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleDimCnt extends AbstractModel{

    /**
    * 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
    */
    @SerializedName("Dim")
    @Expose
    private Long Dim;

    /**
    * count 数
    */
    @SerializedName("Cnt")
    @Expose
    private Long Cnt;

    /**
     * Get 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性 
     * @return Dim 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
     */
    public Long getDim() {
        return this.Dim;
    }

    /**
     * Set 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
     * @param Dim 1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性
     */
    public void setDim(Long Dim) {
        this.Dim = Dim;
    }

    /**
     * Get count 数 
     * @return Cnt count 数
     */
    public Long getCnt() {
        return this.Cnt;
    }

    /**
     * Set count 数
     * @param Cnt count 数
     */
    public void setCnt(Long Cnt) {
        this.Cnt = Cnt;
    }

    public RuleDimCnt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleDimCnt(RuleDimCnt source) {
        if (source.Dim != null) {
            this.Dim = new Long(source.Dim);
        }
        if (source.Cnt != null) {
            this.Cnt = new Long(source.Cnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Dim", this.Dim);
        this.setParamSimple(map, prefix + "Cnt", this.Cnt);

    }
}

