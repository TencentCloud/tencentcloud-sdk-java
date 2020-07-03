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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogoDetail extends AbstractModel{

    /**
    * 命中的Applogo详情
    */
    @SerializedName("AppLogoDetail")
    @Expose
    private Logo [] AppLogoDetail;

    /**
     * Get 命中的Applogo详情 
     * @return AppLogoDetail 命中的Applogo详情
     */
    public Logo [] getAppLogoDetail() {
        return this.AppLogoDetail;
    }

    /**
     * Set 命中的Applogo详情
     * @param AppLogoDetail 命中的Applogo详情
     */
    public void setAppLogoDetail(Logo [] AppLogoDetail) {
        this.AppLogoDetail = AppLogoDetail;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AppLogoDetail.", this.AppLogoDetail);

    }
}

