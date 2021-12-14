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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Advice extends AbstractModel{

    /**
    * 问题描述。
    */
    @SerializedName("Problem")
    @Expose
    private String Problem;

    /**
    * 问题详情。
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 建议解决方案。
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
     * Get 问题描述。 
     * @return Problem 问题描述。
     */
    public String getProblem() {
        return this.Problem;
    }

    /**
     * Set 问题描述。
     * @param Problem 问题描述。
     */
    public void setProblem(String Problem) {
        this.Problem = Problem;
    }

    /**
     * Get 问题详情。 
     * @return Detail 问题详情。
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 问题详情。
     * @param Detail 问题详情。
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 建议解决方案。 
     * @return Solution 建议解决方案。
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set 建议解决方案。
     * @param Solution 建议解决方案。
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    public Advice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Advice(Advice source) {
        if (source.Problem != null) {
            this.Problem = new String(source.Problem);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Problem", this.Problem);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Solution", this.Solution);

    }
}

