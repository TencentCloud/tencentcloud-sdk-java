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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatewayAllGroupApisRequest extends AbstractModel{

    /**
    * 网关部署组ID
    */
    @SerializedName("GatewayDeployGroupId")
    @Expose
    private String GatewayDeployGroupId;

    /**
    * 搜索关键字，支持分组名称或API Path
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get 网关部署组ID 
     * @return GatewayDeployGroupId 网关部署组ID
     */
    public String getGatewayDeployGroupId() {
        return this.GatewayDeployGroupId;
    }

    /**
     * Set 网关部署组ID
     * @param GatewayDeployGroupId 网关部署组ID
     */
    public void setGatewayDeployGroupId(String GatewayDeployGroupId) {
        this.GatewayDeployGroupId = GatewayDeployGroupId;
    }

    /**
     * Get 搜索关键字，支持分组名称或API Path 
     * @return SearchWord 搜索关键字，支持分组名称或API Path
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索关键字，支持分组名称或API Path
     * @param SearchWord 搜索关键字，支持分组名称或API Path
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    public DescribeGatewayAllGroupApisRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayAllGroupApisRequest(DescribeGatewayAllGroupApisRequest source) {
        if (source.GatewayDeployGroupId != null) {
            this.GatewayDeployGroupId = new String(source.GatewayDeployGroupId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayDeployGroupId", this.GatewayDeployGroupId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}

