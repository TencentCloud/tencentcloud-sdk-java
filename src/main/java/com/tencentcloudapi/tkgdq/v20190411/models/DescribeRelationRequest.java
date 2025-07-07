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
package com.tencentcloudapi.tkgdq.v20190411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRelationRequest extends AbstractModel {

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

    public DescribeRelationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRelationRequest(DescribeRelationRequest source) {
        if (source.LeftEntityName != null) {
            this.LeftEntityName = new String(source.LeftEntityName);
        }
        if (source.RightEntityName != null) {
            this.RightEntityName = new String(source.RightEntityName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LeftEntityName", this.LeftEntityName);
        this.setParamSimple(map, prefix + "RightEntityName", this.RightEntityName);

    }
}

