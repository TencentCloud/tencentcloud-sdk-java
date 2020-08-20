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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchMediaResponse extends AbstractModel{

    /**
    * 符合搜索条件的记录总数。
<li>最大值：5000。当命中记录数超过5000时，该字段将返回 5000，而非实际命中总数。</li>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 媒体文件信息列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaInfoSet")
    @Expose
    private MediaInfo [] MediaInfoSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合搜索条件的记录总数。
<li>最大值：5000。当命中记录数超过5000时，该字段将返回 5000，而非实际命中总数。</li> 
     * @return TotalCount 符合搜索条件的记录总数。
<li>最大值：5000。当命中记录数超过5000时，该字段将返回 5000，而非实际命中总数。</li>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合搜索条件的记录总数。
<li>最大值：5000。当命中记录数超过5000时，该字段将返回 5000，而非实际命中总数。</li>
     * @param TotalCount 符合搜索条件的记录总数。
<li>最大值：5000。当命中记录数超过5000时，该字段将返回 5000，而非实际命中总数。</li>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 媒体文件信息列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaInfoSet 媒体文件信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaInfo [] getMediaInfoSet() {
        return this.MediaInfoSet;
    }

    /**
     * Set 媒体文件信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaInfoSet 媒体文件信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaInfoSet(MediaInfo [] MediaInfoSet) {
        this.MediaInfoSet = MediaInfoSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "MediaInfoSet.", this.MediaInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

