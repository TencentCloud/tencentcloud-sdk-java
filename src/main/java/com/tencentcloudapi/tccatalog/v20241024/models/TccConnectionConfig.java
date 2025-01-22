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
package com.tencentcloudapi.tccatalog.v20241024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TccConnectionConfig extends AbstractModel {

    /**
    * Tcc数据目录连接配置
    */
    @SerializedName("TccHive")
    @Expose
    private TccConnection TccHive;

    /**
     * Get Tcc数据目录连接配置 
     * @return TccHive Tcc数据目录连接配置
     */
    public TccConnection getTccHive() {
        return this.TccHive;
    }

    /**
     * Set Tcc数据目录连接配置
     * @param TccHive Tcc数据目录连接配置
     */
    public void setTccHive(TccConnection TccHive) {
        this.TccHive = TccHive;
    }

    public TccConnectionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TccConnectionConfig(TccConnectionConfig source) {
        if (source.TccHive != null) {
            this.TccHive = new TccConnection(source.TccHive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TccHive.", this.TccHive);

    }
}

