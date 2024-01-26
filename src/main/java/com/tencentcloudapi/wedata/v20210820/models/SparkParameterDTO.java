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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SparkParameterDTO extends AbstractModel {

    /**
    * SparkSQL或者PySpark任务批量修改任务参数
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
     * Get SparkSQL或者PySpark任务批量修改任务参数 
     * @return Properties SparkSQL或者PySpark任务批量修改任务参数
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set SparkSQL或者PySpark任务批量修改任务参数
     * @param Properties SparkSQL或者PySpark任务批量修改任务参数
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    public SparkParameterDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparkParameterDTO(SparkParameterDTO source) {
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Properties", this.Properties);

    }
}

