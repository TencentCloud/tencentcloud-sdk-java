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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Configuration extends AbstractModel{

    /**
    * 配置文件名，支持SPARK、HIVE、HDFS、YARN的部分配置文件自定义。
    */
    @SerializedName("Classification")
    @Expose
    private String Classification;

    /**
    * 配置参数通过KV的形式传入，部分文件支持自定义，可以通过特殊的键"content"传入所有内容。
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
     * Get 配置文件名，支持SPARK、HIVE、HDFS、YARN的部分配置文件自定义。 
     * @return Classification 配置文件名，支持SPARK、HIVE、HDFS、YARN的部分配置文件自定义。
     */
    public String getClassification() {
        return this.Classification;
    }

    /**
     * Set 配置文件名，支持SPARK、HIVE、HDFS、YARN的部分配置文件自定义。
     * @param Classification 配置文件名，支持SPARK、HIVE、HDFS、YARN的部分配置文件自定义。
     */
    public void setClassification(String Classification) {
        this.Classification = Classification;
    }

    /**
     * Get 配置参数通过KV的形式传入，部分文件支持自定义，可以通过特殊的键"content"传入所有内容。 
     * @return Properties 配置参数通过KV的形式传入，部分文件支持自定义，可以通过特殊的键"content"传入所有内容。
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set 配置参数通过KV的形式传入，部分文件支持自定义，可以通过特殊的键"content"传入所有内容。
     * @param Properties 配置参数通过KV的形式传入，部分文件支持自定义，可以通过特殊的键"content"传入所有内容。
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    public Configuration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Configuration(Configuration source) {
        if (source.Classification != null) {
            this.Classification = new String(source.Classification);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Classification", this.Classification);
        this.setParamSimple(map, prefix + "Properties", this.Properties);

    }
}

