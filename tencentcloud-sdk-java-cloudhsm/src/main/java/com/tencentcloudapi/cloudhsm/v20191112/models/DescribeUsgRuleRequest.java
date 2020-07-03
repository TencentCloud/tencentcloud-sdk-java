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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsgRuleRequest extends AbstractModel{

    /**
    * 根据安全组Id获取安全组详情
    */
    @SerializedName("SgIds")
    @Expose
    private String [] SgIds;

    /**
     * Get 根据安全组Id获取安全组详情 
     * @return SgIds 根据安全组Id获取安全组详情
     */
    public String [] getSgIds() {
        return this.SgIds;
    }

    /**
     * Set 根据安全组Id获取安全组详情
     * @param SgIds 根据安全组Id获取安全组详情
     */
    public void setSgIds(String [] SgIds) {
        this.SgIds = SgIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SgIds.", this.SgIds);

    }
}

