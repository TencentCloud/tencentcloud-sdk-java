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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCheckSimilarPersonJobIdListRequest extends AbstractModel{

    /**
    * 起始序号，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认值为10，最大值为1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 起始序号，默认值为0。 
     * @return Offset 起始序号，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始序号，默认值为0。
     * @param Offset 起始序号，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认值为10，最大值为1000。 
     * @return Limit 返回数量，默认值为10，最大值为1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认值为10，最大值为1000。
     * @param Limit 返回数量，默认值为10，最大值为1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

