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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineBasicInfo extends AbstractModel {

    /**
    * 基线名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 基线id
    */
    @SerializedName("BaselineId")
    @Expose
    private Long BaselineId;

    /**
    * 父级id
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
     * Get 基线名称 
     * @return Name 基线名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 基线名称
     * @param Name 基线名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 基线id 
     * @return BaselineId 基线id
     */
    public Long getBaselineId() {
        return this.BaselineId;
    }

    /**
     * Set 基线id
     * @param BaselineId 基线id
     */
    public void setBaselineId(Long BaselineId) {
        this.BaselineId = BaselineId;
    }

    /**
     * Get 父级id 
     * @return ParentId 父级id
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父级id
     * @param ParentId 父级id
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    public BaselineBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineBasicInfo(BaselineBasicInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BaselineId != null) {
            this.BaselineId = new Long(source.BaselineId);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BaselineId", this.BaselineId);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);

    }
}

