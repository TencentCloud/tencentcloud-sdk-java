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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceQpsLimitRequest extends AbstractModel{

    /**
    * 套餐实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * qps上限
    */
    @SerializedName("QpsLimit")
    @Expose
    private Long QpsLimit;

    /**
     * Get 套餐实例id 
     * @return InstanceId 套餐实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 套餐实例id
     * @param InstanceId 套餐实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get qps上限 
     * @return QpsLimit qps上限
     */
    public Long getQpsLimit() {
        return this.QpsLimit;
    }

    /**
     * Set qps上限
     * @param QpsLimit qps上限
     */
    public void setQpsLimit(Long QpsLimit) {
        this.QpsLimit = QpsLimit;
    }

    public ModifyInstanceQpsLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceQpsLimitRequest(ModifyInstanceQpsLimitRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.QpsLimit != null) {
            this.QpsLimit = new Long(source.QpsLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "QpsLimit", this.QpsLimit);

    }
}

