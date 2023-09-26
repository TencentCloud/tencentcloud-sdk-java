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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteProjectRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 随机数
    */
    @SerializedName("Seed")
    @Expose
    private String Seed;

    /**
    * 默认看板
    */
    @SerializedName("DefaultPanelType")
    @Expose
    private Long DefaultPanelType;

    /**
     * Get 项目ID 
     * @return Id 项目ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 项目ID
     * @param Id 项目ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 随机数 
     * @return Seed 随机数
     */
    public String getSeed() {
        return this.Seed;
    }

    /**
     * Set 随机数
     * @param Seed 随机数
     */
    public void setSeed(String Seed) {
        this.Seed = Seed;
    }

    /**
     * Get 默认看板 
     * @return DefaultPanelType 默认看板
     */
    public Long getDefaultPanelType() {
        return this.DefaultPanelType;
    }

    /**
     * Set 默认看板
     * @param DefaultPanelType 默认看板
     */
    public void setDefaultPanelType(Long DefaultPanelType) {
        this.DefaultPanelType = DefaultPanelType;
    }

    public DeleteProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteProjectRequest(DeleteProjectRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Seed != null) {
            this.Seed = new String(source.Seed);
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
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "DefaultPanelType", this.DefaultPanelType);

    }
}

