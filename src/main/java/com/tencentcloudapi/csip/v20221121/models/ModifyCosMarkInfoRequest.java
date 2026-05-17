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

public class ModifyCosMarkInfoRequest extends AbstractModel {

    /**
    * 需要修改的存储桶列表
    */
    @SerializedName("BucketNameSet")
    @Expose
    private CosBucketInfo [] BucketNameSet;

    /**
    * 备注信息
    */
    @SerializedName("MarkInfo")
    @Expose
    private String MarkInfo;

    /**
     * Get 需要修改的存储桶列表 
     * @return BucketNameSet 需要修改的存储桶列表
     */
    public CosBucketInfo [] getBucketNameSet() {
        return this.BucketNameSet;
    }

    /**
     * Set 需要修改的存储桶列表
     * @param BucketNameSet 需要修改的存储桶列表
     */
    public void setBucketNameSet(CosBucketInfo [] BucketNameSet) {
        this.BucketNameSet = BucketNameSet;
    }

    /**
     * Get 备注信息 
     * @return MarkInfo 备注信息
     */
    public String getMarkInfo() {
        return this.MarkInfo;
    }

    /**
     * Set 备注信息
     * @param MarkInfo 备注信息
     */
    public void setMarkInfo(String MarkInfo) {
        this.MarkInfo = MarkInfo;
    }

    public ModifyCosMarkInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCosMarkInfoRequest(ModifyCosMarkInfoRequest source) {
        if (source.BucketNameSet != null) {
            this.BucketNameSet = new CosBucketInfo[source.BucketNameSet.length];
            for (int i = 0; i < source.BucketNameSet.length; i++) {
                this.BucketNameSet[i] = new CosBucketInfo(source.BucketNameSet[i]);
            }
        }
        if (source.MarkInfo != null) {
            this.MarkInfo = new String(source.MarkInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BucketNameSet.", this.BucketNameSet);
        this.setParamSimple(map, prefix + "MarkInfo", this.MarkInfo);

    }
}

