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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceExpressStatistic extends AbstractModel{

    /**
    * 人员唯一标识符
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 表情统计结果
    */
    @SerializedName("ExpressRatio")
    @Expose
    private ExpressRatioStatistic [] ExpressRatio;

    /**
     * Get 人员唯一标识符 
     * @return PersonId 人员唯一标识符
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员唯一标识符
     * @param PersonId 人员唯一标识符
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 表情统计结果 
     * @return ExpressRatio 表情统计结果
     */
    public ExpressRatioStatistic [] getExpressRatio() {
        return this.ExpressRatio;
    }

    /**
     * Set 表情统计结果
     * @param ExpressRatio 表情统计结果
     */
    public void setExpressRatio(ExpressRatioStatistic [] ExpressRatio) {
        this.ExpressRatio = ExpressRatio;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamArrayObj(map, prefix + "ExpressRatio.", this.ExpressRatio);

    }
}

