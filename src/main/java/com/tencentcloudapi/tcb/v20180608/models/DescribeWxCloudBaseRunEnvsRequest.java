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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWxCloudBaseRunEnvsRequest extends AbstractModel {

    /**
    * wx应用Id
    */
    @SerializedName("WxAppId")
    @Expose
    private String WxAppId;

    /**
    * 是否查询全地域
    */
    @SerializedName("AllRegions")
    @Expose
    private Boolean AllRegions;

    /**
     * Get wx应用Id 
     * @return WxAppId wx应用Id
     */
    public String getWxAppId() {
        return this.WxAppId;
    }

    /**
     * Set wx应用Id
     * @param WxAppId wx应用Id
     */
    public void setWxAppId(String WxAppId) {
        this.WxAppId = WxAppId;
    }

    /**
     * Get 是否查询全地域 
     * @return AllRegions 是否查询全地域
     */
    public Boolean getAllRegions() {
        return this.AllRegions;
    }

    /**
     * Set 是否查询全地域
     * @param AllRegions 是否查询全地域
     */
    public void setAllRegions(Boolean AllRegions) {
        this.AllRegions = AllRegions;
    }

    public DescribeWxCloudBaseRunEnvsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWxCloudBaseRunEnvsRequest(DescribeWxCloudBaseRunEnvsRequest source) {
        if (source.WxAppId != null) {
            this.WxAppId = new String(source.WxAppId);
        }
        if (source.AllRegions != null) {
            this.AllRegions = new Boolean(source.AllRegions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WxAppId", this.WxAppId);
        this.setParamSimple(map, prefix + "AllRegions", this.AllRegions);

    }
}

