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
package com.tencentcloudapi.tkgdq.v20190411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRelationRequest extends AbstractModel{

    /**
    * 输入第一个实体
    */
    @SerializedName("LeftEntityName")
    @Expose
    private String LeftEntityName;

    /**
    * 输入第二个实体
    */
    @SerializedName("RightEntityName")
    @Expose
    private String RightEntityName;

    /**
     * Get 输入第一个实体 
     * @return LeftEntityName 输入第一个实体
     */
    public String getLeftEntityName() {
        return this.LeftEntityName;
    }

    /**
     * Set 输入第一个实体
     * @param LeftEntityName 输入第一个实体
     */
    public void setLeftEntityName(String LeftEntityName) {
        this.LeftEntityName = LeftEntityName;
    }

    /**
     * Get 输入第二个实体 
     * @return RightEntityName 输入第二个实体
     */
    public String getRightEntityName() {
        return this.RightEntityName;
    }

    /**
     * Set 输入第二个实体
     * @param RightEntityName 输入第二个实体
     */
    public void setRightEntityName(String RightEntityName) {
        this.RightEntityName = RightEntityName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LeftEntityName", this.LeftEntityName);
        this.setParamSimple(map, prefix + "RightEntityName", this.RightEntityName);

    }
}

