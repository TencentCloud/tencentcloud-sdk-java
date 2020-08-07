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
package com.tencentcloudapi.rkp.v20191209.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryDevAndRiskResponse extends AbstractModel{

    /**
    * 是否查得
    */
    @SerializedName("Found")
    @Expose
    private Long Found;

    /**
    * 匹配数量级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllCnt")
    @Expose
    private Long AllCnt;

    /**
    * 匹配到的设备信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Matches")
    @Expose
    private DevInfoQ [] Matches;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否查得 
     * @return Found 是否查得
     */
    public Long getFound() {
        return this.Found;
    }

    /**
     * Set 是否查得
     * @param Found 是否查得
     */
    public void setFound(Long Found) {
        this.Found = Found;
    }

    /**
     * Get 匹配数量级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllCnt 匹配数量级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAllCnt() {
        return this.AllCnt;
    }

    /**
     * Set 匹配数量级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllCnt 匹配数量级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllCnt(Long AllCnt) {
        this.AllCnt = AllCnt;
    }

    /**
     * Get 匹配到的设备信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Matches 匹配到的设备信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DevInfoQ [] getMatches() {
        return this.Matches;
    }

    /**
     * Set 匹配到的设备信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Matches 匹配到的设备信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatches(DevInfoQ [] Matches) {
        this.Matches = Matches;
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
        this.setParamSimple(map, prefix + "Found", this.Found);
        this.setParamSimple(map, prefix + "AllCnt", this.AllCnt);
        this.setParamArrayObj(map, prefix + "Matches.", this.Matches);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

