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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImportTaskRequest extends AbstractModel{

    /**
    * 数据来源，cos
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * 输入配置
    */
    @SerializedName("InputConf")
    @Expose
    private KVPair [] InputConf;

    /**
    * 输出配置
    */
    @SerializedName("OutputConf")
    @Expose
    private KVPair [] OutputConf;

    /**
    * 目标数据源的类型，目前支持导入到托管存储，即lakefsStorage
    */
    @SerializedName("OutputType")
    @Expose
    private String OutputType;

    /**
     * Get 数据来源，cos 
     * @return InputType 数据来源，cos
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set 数据来源，cos
     * @param InputType 数据来源，cos
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get 输入配置 
     * @return InputConf 输入配置
     */
    public KVPair [] getInputConf() {
        return this.InputConf;
    }

    /**
     * Set 输入配置
     * @param InputConf 输入配置
     */
    public void setInputConf(KVPair [] InputConf) {
        this.InputConf = InputConf;
    }

    /**
     * Get 输出配置 
     * @return OutputConf 输出配置
     */
    public KVPair [] getOutputConf() {
        return this.OutputConf;
    }

    /**
     * Set 输出配置
     * @param OutputConf 输出配置
     */
    public void setOutputConf(KVPair [] OutputConf) {
        this.OutputConf = OutputConf;
    }

    /**
     * Get 目标数据源的类型，目前支持导入到托管存储，即lakefsStorage 
     * @return OutputType 目标数据源的类型，目前支持导入到托管存储，即lakefsStorage
     */
    public String getOutputType() {
        return this.OutputType;
    }

    /**
     * Set 目标数据源的类型，目前支持导入到托管存储，即lakefsStorage
     * @param OutputType 目标数据源的类型，目前支持导入到托管存储，即lakefsStorage
     */
    public void setOutputType(String OutputType) {
        this.OutputType = OutputType;
    }

    public CreateImportTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImportTaskRequest(CreateImportTaskRequest source) {
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.InputConf != null) {
            this.InputConf = new KVPair[source.InputConf.length];
            for (int i = 0; i < source.InputConf.length; i++) {
                this.InputConf[i] = new KVPair(source.InputConf[i]);
            }
        }
        if (source.OutputConf != null) {
            this.OutputConf = new KVPair[source.OutputConf.length];
            for (int i = 0; i < source.OutputConf.length; i++) {
                this.OutputConf[i] = new KVPair(source.OutputConf[i]);
            }
        }
        if (source.OutputType != null) {
            this.OutputType = new String(source.OutputType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamArrayObj(map, prefix + "InputConf.", this.InputConf);
        this.setParamArrayObj(map, prefix + "OutputConf.", this.OutputConf);
        this.setParamSimple(map, prefix + "OutputType", this.OutputType);

    }
}

