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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectInfoRequest extends AbstractModel {

    /**
    * <p>项目Id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>默认看板</p><p>枚举值：</p><ul><li>1： 项目看板</li><li>2： 我的看板</li></ul>
    */
    @SerializedName("DefaultPanelType")
    @Expose
    private Long DefaultPanelType;

    /**
     * Get <p>项目Id</p> 
     * @return Id <p>项目Id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>项目Id</p>
     * @param Id <p>项目Id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>默认看板</p><p>枚举值：</p><ul><li>1： 项目看板</li><li>2： 我的看板</li></ul> 
     * @return DefaultPanelType <p>默认看板</p><p>枚举值：</p><ul><li>1： 项目看板</li><li>2： 我的看板</li></ul>
     */
    public Long getDefaultPanelType() {
        return this.DefaultPanelType;
    }

    /**
     * Set <p>默认看板</p><p>枚举值：</p><ul><li>1： 项目看板</li><li>2： 我的看板</li></ul>
     * @param DefaultPanelType <p>默认看板</p><p>枚举值：</p><ul><li>1： 项目看板</li><li>2： 我的看板</li></ul>
     */
    public void setDefaultPanelType(Long DefaultPanelType) {
        this.DefaultPanelType = DefaultPanelType;
    }

    public DescribeProjectInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectInfoRequest(DescribeProjectInfoRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DefaultPanelType != null) {
            this.DefaultPanelType = new Long(source.DefaultPanelType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DefaultPanelType", this.DefaultPanelType);

    }
}

