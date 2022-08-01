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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckSummary extends AbstractModel{

    /**
    * 检查点名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 检查点所在步骤名字
    */
    @SerializedName("Step")
    @Expose
    private String Step;

    /**
    * 检查点成功次数
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 检查失败次数
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * 错误比例
    */
    @SerializedName("ErrorRate")
    @Expose
    private Float ErrorRate;

    /**
     * Get 检查点名字 
     * @return Name 检查点名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 检查点名字
     * @param Name 检查点名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 检查点所在步骤名字 
     * @return Step 检查点所在步骤名字
     */
    public String getStep() {
        return this.Step;
    }

    /**
     * Set 检查点所在步骤名字
     * @param Step 检查点所在步骤名字
     */
    public void setStep(String Step) {
        this.Step = Step;
    }

    /**
     * Get 检查点成功次数 
     * @return SuccessCount 检查点成功次数
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 检查点成功次数
     * @param SuccessCount 检查点成功次数
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 检查失败次数 
     * @return FailCount 检查失败次数
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set 检查失败次数
     * @param FailCount 检查失败次数
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get 错误比例 
     * @return ErrorRate 错误比例
     */
    public Float getErrorRate() {
        return this.ErrorRate;
    }

    /**
     * Set 错误比例
     * @param ErrorRate 错误比例
     */
    public void setErrorRate(Float ErrorRate) {
        this.ErrorRate = ErrorRate;
    }

    public CheckSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckSummary(CheckSummary source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Step != null) {
            this.Step = new String(source.Step);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.ErrorRate != null) {
            this.ErrorRate = new Float(source.ErrorRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Step", this.Step);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "ErrorRate", this.ErrorRate);

    }
}

