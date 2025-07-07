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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindSceneChannelsRequest extends AbstractModel {

    /**
    * 条数限制最大不能超过1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 场景ID
    */
    @SerializedName("SceneId")
    @Expose
    private Long SceneId;

    /**
    * 偏移值
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 条数限制最大不能超过1000 
     * @return Limit 条数限制最大不能超过1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 条数限制最大不能超过1000
     * @param Limit 条数限制最大不能超过1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 场景ID 
     * @return SceneId 场景ID
     */
    public Long getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 场景ID
     * @param SceneId 场景ID
     */
    public void setSceneId(Long SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 偏移值 
     * @return Offset 偏移值
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移值
     * @param Offset 偏移值
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeBindSceneChannelsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBindSceneChannelsRequest(DescribeBindSceneChannelsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SceneId != null) {
            this.SceneId = new Long(source.SceneId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

