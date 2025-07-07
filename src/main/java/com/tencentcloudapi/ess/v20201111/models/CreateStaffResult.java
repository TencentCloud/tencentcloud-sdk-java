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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStaffResult extends AbstractModel {

    /**
    * 创建员工的成功列表
    */
    @SerializedName("SuccessEmployeeData")
    @Expose
    private SuccessCreateStaffData [] SuccessEmployeeData;

    /**
    * 创建员工的失败列表
    */
    @SerializedName("FailedEmployeeData")
    @Expose
    private FailedCreateStaffData [] FailedEmployeeData;

    /**
     * Get 创建员工的成功列表 
     * @return SuccessEmployeeData 创建员工的成功列表
     */
    public SuccessCreateStaffData [] getSuccessEmployeeData() {
        return this.SuccessEmployeeData;
    }

    /**
     * Set 创建员工的成功列表
     * @param SuccessEmployeeData 创建员工的成功列表
     */
    public void setSuccessEmployeeData(SuccessCreateStaffData [] SuccessEmployeeData) {
        this.SuccessEmployeeData = SuccessEmployeeData;
    }

    /**
     * Get 创建员工的失败列表 
     * @return FailedEmployeeData 创建员工的失败列表
     */
    public FailedCreateStaffData [] getFailedEmployeeData() {
        return this.FailedEmployeeData;
    }

    /**
     * Set 创建员工的失败列表
     * @param FailedEmployeeData 创建员工的失败列表
     */
    public void setFailedEmployeeData(FailedCreateStaffData [] FailedEmployeeData) {
        this.FailedEmployeeData = FailedEmployeeData;
    }

    public CreateStaffResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStaffResult(CreateStaffResult source) {
        if (source.SuccessEmployeeData != null) {
            this.SuccessEmployeeData = new SuccessCreateStaffData[source.SuccessEmployeeData.length];
            for (int i = 0; i < source.SuccessEmployeeData.length; i++) {
                this.SuccessEmployeeData[i] = new SuccessCreateStaffData(source.SuccessEmployeeData[i]);
            }
        }
        if (source.FailedEmployeeData != null) {
            this.FailedEmployeeData = new FailedCreateStaffData[source.FailedEmployeeData.length];
            for (int i = 0; i < source.FailedEmployeeData.length; i++) {
                this.FailedEmployeeData[i] = new FailedCreateStaffData(source.FailedEmployeeData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SuccessEmployeeData.", this.SuccessEmployeeData);
        this.setParamArrayObj(map, prefix + "FailedEmployeeData.", this.FailedEmployeeData);

    }
}

