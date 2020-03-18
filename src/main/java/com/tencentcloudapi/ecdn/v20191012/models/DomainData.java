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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainData extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 结果详情
    */
    @SerializedName("DetailData")
    @Expose
    private DetailData [] DetailData;

    /**
     * Get 域名 
     * @return Resource 域名
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 域名
     * @param Resource 域名
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 结果详情 
     * @return DetailData 结果详情
     */
    public DetailData [] getDetailData() {
        return this.DetailData;
    }

    /**
     * Set 结果详情
     * @param DetailData 结果详情
     */
    public void setDetailData(DetailData [] DetailData) {
        this.DetailData = DetailData;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamArrayObj(map, prefix + "DetailData.", this.DetailData);

    }
}

