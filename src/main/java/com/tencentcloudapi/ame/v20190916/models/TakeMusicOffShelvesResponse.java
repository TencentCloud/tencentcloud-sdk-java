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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TakeMusicOffShelvesResponse extends AbstractModel{

    /**
    * 返回成功数量
    */
    @SerializedName("SuccessNum")
    @Expose
    private Long SuccessNum;

    /**
    * 返回失败数量
    */
    @SerializedName("FailedNum")
    @Expose
    private Long FailedNum;

    /**
    * 返回失败歌曲musicId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedMusicIds")
    @Expose
    private String [] FailedMusicIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回成功数量 
     * @return SuccessNum 返回成功数量
     */
    public Long getSuccessNum() {
        return this.SuccessNum;
    }

    /**
     * Set 返回成功数量
     * @param SuccessNum 返回成功数量
     */
    public void setSuccessNum(Long SuccessNum) {
        this.SuccessNum = SuccessNum;
    }

    /**
     * Get 返回失败数量 
     * @return FailedNum 返回失败数量
     */
    public Long getFailedNum() {
        return this.FailedNum;
    }

    /**
     * Set 返回失败数量
     * @param FailedNum 返回失败数量
     */
    public void setFailedNum(Long FailedNum) {
        this.FailedNum = FailedNum;
    }

    /**
     * Get 返回失败歌曲musicId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedMusicIds 返回失败歌曲musicId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFailedMusicIds() {
        return this.FailedMusicIds;
    }

    /**
     * Set 返回失败歌曲musicId
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedMusicIds 返回失败歌曲musicId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedMusicIds(String [] FailedMusicIds) {
        this.FailedMusicIds = FailedMusicIds;
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

    public TakeMusicOffShelvesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TakeMusicOffShelvesResponse(TakeMusicOffShelvesResponse source) {
        if (source.SuccessNum != null) {
            this.SuccessNum = new Long(source.SuccessNum);
        }
        if (source.FailedNum != null) {
            this.FailedNum = new Long(source.FailedNum);
        }
        if (source.FailedMusicIds != null) {
            this.FailedMusicIds = new String[source.FailedMusicIds.length];
            for (int i = 0; i < source.FailedMusicIds.length; i++) {
                this.FailedMusicIds[i] = new String(source.FailedMusicIds[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SuccessNum", this.SuccessNum);
        this.setParamSimple(map, prefix + "FailedNum", this.FailedNum);
        this.setParamArraySimple(map, prefix + "FailedMusicIds.", this.FailedMusicIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

