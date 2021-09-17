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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEKSContainerInstanceEventRequest extends AbstractModel{

    /**
    * 容器实例id
    */
    @SerializedName("EksCiId")
    @Expose
    private String EksCiId;

    /**
    * 最大事件数量。默认为50，最大取值100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 容器实例id 
     * @return EksCiId 容器实例id
     */
    public String getEksCiId() {
        return this.EksCiId;
    }

    /**
     * Set 容器实例id
     * @param EksCiId 容器实例id
     */
    public void setEksCiId(String EksCiId) {
        this.EksCiId = EksCiId;
    }

    /**
     * Get 最大事件数量。默认为50，最大取值100。 
     * @return Limit 最大事件数量。默认为50，最大取值100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大事件数量。默认为50，最大取值100。
     * @param Limit 最大事件数量。默认为50，最大取值100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeEKSContainerInstanceEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEKSContainerInstanceEventRequest(DescribeEKSContainerInstanceEventRequest source) {
        if (source.EksCiId != null) {
            this.EksCiId = new String(source.EksCiId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EksCiId", this.EksCiId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

