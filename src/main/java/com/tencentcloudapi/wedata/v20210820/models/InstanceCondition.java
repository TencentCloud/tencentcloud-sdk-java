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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceCondition extends AbstractModel{

    /**
    * 执行类型
    */
    @SerializedName("ExecutionSpace")
    @Expose
    private String ExecutionSpace;

    /**
    * 任务产品类型
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
     * Get 执行类型 
     * @return ExecutionSpace 执行类型
     */
    public String getExecutionSpace() {
        return this.ExecutionSpace;
    }

    /**
     * Set 执行类型
     * @param ExecutionSpace 执行类型
     */
    public void setExecutionSpace(String ExecutionSpace) {
        this.ExecutionSpace = ExecutionSpace;
    }

    /**
     * Get 任务产品类型 
     * @return ProductName 任务产品类型
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 任务产品类型
     * @param ProductName 任务产品类型
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public InstanceCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceCondition(InstanceCondition source) {
        if (source.ExecutionSpace != null) {
            this.ExecutionSpace = new String(source.ExecutionSpace);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionSpace", this.ExecutionSpace);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);

    }
}

