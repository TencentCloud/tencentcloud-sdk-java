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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoCloudRecordRes extends AbstractModel {

    /**
    * 录像信息总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 录像信息列表
    */
    @SerializedName("RecordSet")
    @Expose
    private RecordInfo [] RecordSet;

    /**
     * Get 录像信息总数 
     * @return TotalCount 录像信息总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 录像信息总数
     * @param TotalCount 录像信息总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 录像信息列表 
     * @return RecordSet 录像信息列表
     */
    public RecordInfo [] getRecordSet() {
        return this.RecordSet;
    }

    /**
     * Set 录像信息列表
     * @param RecordSet 录像信息列表
     */
    public void setRecordSet(RecordInfo [] RecordSet) {
        this.RecordSet = RecordSet;
    }

    public VideoCloudRecordRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoCloudRecordRes(VideoCloudRecordRes source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RecordSet != null) {
            this.RecordSet = new RecordInfo[source.RecordSet.length];
            for (int i = 0; i < source.RecordSet.length; i++) {
                this.RecordSet[i] = new RecordInfo(source.RecordSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RecordSet.", this.RecordSet);

    }
}

