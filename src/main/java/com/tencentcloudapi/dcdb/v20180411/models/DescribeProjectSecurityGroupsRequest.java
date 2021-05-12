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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectSecurityGroupsRequest extends AbstractModel{

    /**
    * 数据库引擎名称，本接口取值：dcdb。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get 数据库引擎名称，本接口取值：dcdb。 
     * @return Product 数据库引擎名称，本接口取值：dcdb。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 数据库引擎名称，本接口取值：dcdb。
     * @param Product 数据库引擎名称，本接口取值：dcdb。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 项目ID。 
     * @return ProjectId 项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DescribeProjectSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectSecurityGroupsRequest(DescribeProjectSecurityGroupsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

