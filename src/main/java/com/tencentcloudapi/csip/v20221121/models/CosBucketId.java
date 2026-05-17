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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosBucketId extends AbstractModel {

    /**
    * appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * bucket id集合
    */
    @SerializedName("BucketIdSet")
    @Expose
    private String [] BucketIdSet;

    /**
     * Get appid 
     * @return AppId appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
     * @param AppId appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get bucket id集合 
     * @return BucketIdSet bucket id集合
     */
    public String [] getBucketIdSet() {
        return this.BucketIdSet;
    }

    /**
     * Set bucket id集合
     * @param BucketIdSet bucket id集合
     */
    public void setBucketIdSet(String [] BucketIdSet) {
        this.BucketIdSet = BucketIdSet;
    }

    public CosBucketId() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosBucketId(CosBucketId source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.BucketIdSet != null) {
            this.BucketIdSet = new String[source.BucketIdSet.length];
            for (int i = 0; i < source.BucketIdSet.length; i++) {
                this.BucketIdSet[i] = new String(source.BucketIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArraySimple(map, prefix + "BucketIdSet.", this.BucketIdSet);

    }
}

