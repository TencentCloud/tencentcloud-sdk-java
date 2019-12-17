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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteScanInstancesRequest extends AbstractModel{

    /**
    * 删除一个或多个扫描的app，最大支持20个
    */
    @SerializedName("AppSids")
    @Expose
    private String [] AppSids;

    /**
     * Get 删除一个或多个扫描的app，最大支持20个 
     * @return AppSids 删除一个或多个扫描的app，最大支持20个
     */
    public String [] getAppSids() {
        return this.AppSids;
    }

    /**
     * Set 删除一个或多个扫描的app，最大支持20个
     * @param AppSids 删除一个或多个扫描的app，最大支持20个
     */
    public void setAppSids(String [] AppSids) {
        this.AppSids = AppSids;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AppSids.", this.AppSids);

    }
}

