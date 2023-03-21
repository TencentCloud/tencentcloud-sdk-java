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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScfParam extends AbstractModel{

    /**
    * SCF云函数函数名
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * SCF云函数命名空间, 默认为default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * SCF云函数版本及别名, 默认为$DEFAULT
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 每批最大发送消息数, 默认为1000
    */
    @SerializedName("BatchSize")
    @Expose
    private Long BatchSize;

    /**
    * SCF调用失败后重试次数, 默认为5
    */
    @SerializedName("MaxRetries")
    @Expose
    private Long MaxRetries;

    /**
     * Get SCF云函数函数名 
     * @return FunctionName SCF云函数函数名
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set SCF云函数函数名
     * @param FunctionName SCF云函数函数名
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get SCF云函数命名空间, 默认为default 
     * @return Namespace SCF云函数命名空间, 默认为default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set SCF云函数命名空间, 默认为default
     * @param Namespace SCF云函数命名空间, 默认为default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get SCF云函数版本及别名, 默认为$DEFAULT 
     * @return Qualifier SCF云函数版本及别名, 默认为$DEFAULT
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set SCF云函数版本及别名, 默认为$DEFAULT
     * @param Qualifier SCF云函数版本及别名, 默认为$DEFAULT
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 每批最大发送消息数, 默认为1000 
     * @return BatchSize 每批最大发送消息数, 默认为1000
     */
    public Long getBatchSize() {
        return this.BatchSize;
    }

    /**
     * Set 每批最大发送消息数, 默认为1000
     * @param BatchSize 每批最大发送消息数, 默认为1000
     */
    public void setBatchSize(Long BatchSize) {
        this.BatchSize = BatchSize;
    }

    /**
     * Get SCF调用失败后重试次数, 默认为5 
     * @return MaxRetries SCF调用失败后重试次数, 默认为5
     */
    public Long getMaxRetries() {
        return this.MaxRetries;
    }

    /**
     * Set SCF调用失败后重试次数, 默认为5
     * @param MaxRetries SCF调用失败后重试次数, 默认为5
     */
    public void setMaxRetries(Long MaxRetries) {
        this.MaxRetries = MaxRetries;
    }

    public ScfParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScfParam(ScfParam source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.BatchSize != null) {
            this.BatchSize = new Long(source.BatchSize);
        }
        if (source.MaxRetries != null) {
            this.MaxRetries = new Long(source.MaxRetries);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "BatchSize", this.BatchSize);
        this.setParamSimple(map, prefix + "MaxRetries", this.MaxRetries);

    }
}

