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

public class ManualReviewData extends AbstractModel{

    /**
    * 人审内容批次号
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 人审内容ID
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
     * Get 人审内容批次号 
     * @return BatchId 人审内容批次号
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 人审内容批次号
     * @param BatchId 人审内容批次号
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 人审内容ID 
     * @return ContentId 人审内容ID
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set 人审内容ID
     * @param ContentId 人审内容ID
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    public ManualReviewData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManualReviewData(ManualReviewData source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.ContentId != null) {
            this.ContentId = new String(source.ContentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);

    }
}

