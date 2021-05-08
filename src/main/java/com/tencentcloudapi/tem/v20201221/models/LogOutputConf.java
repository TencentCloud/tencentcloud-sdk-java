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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogOutputConf extends AbstractModel{

    /**
    * 日志消费端类型
    */
    @SerializedName("OutputType")
    @Expose
    private String OutputType;

    /**
    * cls日志集
    */
    @SerializedName("ClsLogsetName")
    @Expose
    private String ClsLogsetName;

    /**
    * cls日志主题
    */
    @SerializedName("ClsLogTopicId")
    @Expose
    private String ClsLogTopicId;

    /**
     * Get 日志消费端类型 
     * @return OutputType 日志消费端类型
     */
    public String getOutputType() {
        return this.OutputType;
    }

    /**
     * Set 日志消费端类型
     * @param OutputType 日志消费端类型
     */
    public void setOutputType(String OutputType) {
        this.OutputType = OutputType;
    }

    /**
     * Get cls日志集 
     * @return ClsLogsetName cls日志集
     */
    public String getClsLogsetName() {
        return this.ClsLogsetName;
    }

    /**
     * Set cls日志集
     * @param ClsLogsetName cls日志集
     */
    public void setClsLogsetName(String ClsLogsetName) {
        this.ClsLogsetName = ClsLogsetName;
    }

    /**
     * Get cls日志主题 
     * @return ClsLogTopicId cls日志主题
     */
    public String getClsLogTopicId() {
        return this.ClsLogTopicId;
    }

    /**
     * Set cls日志主题
     * @param ClsLogTopicId cls日志主题
     */
    public void setClsLogTopicId(String ClsLogTopicId) {
        this.ClsLogTopicId = ClsLogTopicId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputType", this.OutputType);
        this.setParamSimple(map, prefix + "ClsLogsetName", this.ClsLogsetName);
        this.setParamSimple(map, prefix + "ClsLogTopicId", this.ClsLogTopicId);

    }
}

