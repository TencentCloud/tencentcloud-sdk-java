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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RepositoryList extends AbstractModel {

    /**
    * 仓库总量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 仓库信息列表
    */
    @SerializedName("Content")
    @Expose
    private RepositoryInfo [] Content;

    /**
     * Get 仓库总量 
     * @return TotalCount 仓库总量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 仓库总量
     * @param TotalCount 仓库总量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 仓库信息列表 
     * @return Content 仓库信息列表
     */
    public RepositoryInfo [] getContent() {
        return this.Content;
    }

    /**
     * Set 仓库信息列表
     * @param Content 仓库信息列表
     */
    public void setContent(RepositoryInfo [] Content) {
        this.Content = Content;
    }

    public RepositoryList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepositoryList(RepositoryList source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Content != null) {
            this.Content = new RepositoryInfo[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new RepositoryInfo(source.Content[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);

    }
}

