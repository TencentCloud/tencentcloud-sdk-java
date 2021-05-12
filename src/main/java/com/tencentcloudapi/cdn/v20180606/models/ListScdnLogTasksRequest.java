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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListScdnLogTasksRequest extends AbstractModel{

    /**
    * 产品来源 cdn/ecdn
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 地域：mainland 或 overseas 为空表示查询所有地域
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 产品来源 cdn/ecdn 
     * @return Source 产品来源 cdn/ecdn
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 产品来源 cdn/ecdn
     * @param Source 产品来源 cdn/ecdn
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 地域：mainland 或 overseas 为空表示查询所有地域 
     * @return Area 地域：mainland 或 overseas 为空表示查询所有地域
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域：mainland 或 overseas 为空表示查询所有地域
     * @param Area 地域：mainland 或 overseas 为空表示查询所有地域
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public ListScdnLogTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListScdnLogTasksRequest(ListScdnLogTasksRequest source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

