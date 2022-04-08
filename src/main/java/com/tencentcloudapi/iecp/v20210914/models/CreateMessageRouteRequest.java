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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMessageRouteRequest extends AbstractModel{

    /**
    * 路由名称
    */
    @SerializedName("RouteName")
    @Expose
    private String RouteName;

    /**
    * 路由备注
    */
    @SerializedName("Descript")
    @Expose
    private String Descript;

    /**
     * Get 路由名称 
     * @return RouteName 路由名称
     */
    public String getRouteName() {
        return this.RouteName;
    }

    /**
     * Set 路由名称
     * @param RouteName 路由名称
     */
    public void setRouteName(String RouteName) {
        this.RouteName = RouteName;
    }

    /**
     * Get 路由备注 
     * @return Descript 路由备注
     */
    public String getDescript() {
        return this.Descript;
    }

    /**
     * Set 路由备注
     * @param Descript 路由备注
     */
    public void setDescript(String Descript) {
        this.Descript = Descript;
    }

    public CreateMessageRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMessageRouteRequest(CreateMessageRouteRequest source) {
        if (source.RouteName != null) {
            this.RouteName = new String(source.RouteName);
        }
        if (source.Descript != null) {
            this.Descript = new String(source.Descript);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteName", this.RouteName);
        this.setParamSimple(map, prefix + "Descript", this.Descript);

    }
}

