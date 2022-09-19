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

public class CtsdbParam extends AbstractModel{

    /**
    * 连接管理实例资源
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Ctsdb的metric
    */
    @SerializedName("CtsdbMetric")
    @Expose
    private String CtsdbMetric;

    /**
     * Get 连接管理实例资源 
     * @return Resource 连接管理实例资源
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 连接管理实例资源
     * @param Resource 连接管理实例资源
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Ctsdb的metric 
     * @return CtsdbMetric Ctsdb的metric
     */
    public String getCtsdbMetric() {
        return this.CtsdbMetric;
    }

    /**
     * Set Ctsdb的metric
     * @param CtsdbMetric Ctsdb的metric
     */
    public void setCtsdbMetric(String CtsdbMetric) {
        this.CtsdbMetric = CtsdbMetric;
    }

    public CtsdbParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CtsdbParam(CtsdbParam source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.CtsdbMetric != null) {
            this.CtsdbMetric = new String(source.CtsdbMetric);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "CtsdbMetric", this.CtsdbMetric);

    }
}

