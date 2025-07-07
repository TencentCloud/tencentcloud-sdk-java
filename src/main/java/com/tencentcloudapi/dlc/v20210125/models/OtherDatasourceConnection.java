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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtherDatasourceConnection extends AbstractModel {

    /**
    * 网络参数
    */
    @SerializedName("Location")
    @Expose
    private DatasourceConnectionLocation Location;

    /**
     * Get 网络参数 
     * @return Location 网络参数
     */
    public DatasourceConnectionLocation getLocation() {
        return this.Location;
    }

    /**
     * Set 网络参数
     * @param Location 网络参数
     */
    public void setLocation(DatasourceConnectionLocation Location) {
        this.Location = Location;
    }

    public OtherDatasourceConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtherDatasourceConnection(OtherDatasourceConnection source) {
        if (source.Location != null) {
            this.Location = new DatasourceConnectionLocation(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Location.", this.Location);

    }
}

