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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CovidItem extends AbstractModel {

    /**
    * 采样时间
    */
    @SerializedName("SampleTime")
    @Expose
    private BaseItem SampleTime;

    /**
    * 检测时间
    */
    @SerializedName("TestTime")
    @Expose
    private BaseItem TestTime;

    /**
    * 检测机构
    */
    @SerializedName("TestOrganization")
    @Expose
    private BaseItem TestOrganization;

    /**
    * 检测结果
    */
    @SerializedName("TestResult")
    @Expose
    private BaseItem TestResult;

    /**
    * 健康码颜色
    */
    @SerializedName("CodeColor")
    @Expose
    private BaseItem CodeColor;

    /**
     * Get 采样时间 
     * @return SampleTime 采样时间
     */
    public BaseItem getSampleTime() {
        return this.SampleTime;
    }

    /**
     * Set 采样时间
     * @param SampleTime 采样时间
     */
    public void setSampleTime(BaseItem SampleTime) {
        this.SampleTime = SampleTime;
    }

    /**
     * Get 检测时间 
     * @return TestTime 检测时间
     */
    public BaseItem getTestTime() {
        return this.TestTime;
    }

    /**
     * Set 检测时间
     * @param TestTime 检测时间
     */
    public void setTestTime(BaseItem TestTime) {
        this.TestTime = TestTime;
    }

    /**
     * Get 检测机构 
     * @return TestOrganization 检测机构
     */
    public BaseItem getTestOrganization() {
        return this.TestOrganization;
    }

    /**
     * Set 检测机构
     * @param TestOrganization 检测机构
     */
    public void setTestOrganization(BaseItem TestOrganization) {
        this.TestOrganization = TestOrganization;
    }

    /**
     * Get 检测结果 
     * @return TestResult 检测结果
     */
    public BaseItem getTestResult() {
        return this.TestResult;
    }

    /**
     * Set 检测结果
     * @param TestResult 检测结果
     */
    public void setTestResult(BaseItem TestResult) {
        this.TestResult = TestResult;
    }

    /**
     * Get 健康码颜色 
     * @return CodeColor 健康码颜色
     */
    public BaseItem getCodeColor() {
        return this.CodeColor;
    }

    /**
     * Set 健康码颜色
     * @param CodeColor 健康码颜色
     */
    public void setCodeColor(BaseItem CodeColor) {
        this.CodeColor = CodeColor;
    }

    public CovidItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CovidItem(CovidItem source) {
        if (source.SampleTime != null) {
            this.SampleTime = new BaseItem(source.SampleTime);
        }
        if (source.TestTime != null) {
            this.TestTime = new BaseItem(source.TestTime);
        }
        if (source.TestOrganization != null) {
            this.TestOrganization = new BaseItem(source.TestOrganization);
        }
        if (source.TestResult != null) {
            this.TestResult = new BaseItem(source.TestResult);
        }
        if (source.CodeColor != null) {
            this.CodeColor = new BaseItem(source.CodeColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SampleTime.", this.SampleTime);
        this.setParamObj(map, prefix + "TestTime.", this.TestTime);
        this.setParamObj(map, prefix + "TestOrganization.", this.TestOrganization);
        this.setParamObj(map, prefix + "TestResult.", this.TestResult);
        this.setParamObj(map, prefix + "CodeColor.", this.CodeColor);

    }
}

