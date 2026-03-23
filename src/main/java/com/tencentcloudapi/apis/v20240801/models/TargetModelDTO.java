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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetModelDTO extends AbstractModel {

    /**
    * 模型ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 匹配名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 权重
    */
    @SerializedName("Rank")
    @Expose
    private Long Rank;

    /**
     * Get 模型ID 
     * @return ID 模型ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 模型ID
     * @param ID 模型ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 匹配名称 
     * @return Name 匹配名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 匹配名称
     * @param Name 匹配名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 权重 
     * @return Rank 权重
     */
    public Long getRank() {
        return this.Rank;
    }

    /**
     * Set 权重
     * @param Rank 权重
     */
    public void setRank(Long Rank) {
        this.Rank = Rank;
    }

    public TargetModelDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetModelDTO(TargetModelDTO source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rank != null) {
            this.Rank = new Long(source.Rank);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Rank", this.Rank);

    }
}

