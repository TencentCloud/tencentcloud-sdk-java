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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetVocabStateV3Request extends AbstractModel {

    /**
    * <p>词表 id</p>
    */
    @SerializedName("VocabId")
    @Expose
    private String VocabId;

    /**
    * <p>是否设置为默认词表</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>客户维度唯一标识</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
     * Get <p>词表 id</p> 
     * @return VocabId <p>词表 id</p>
     */
    public String getVocabId() {
        return this.VocabId;
    }

    /**
     * Set <p>词表 id</p>
     * @param VocabId <p>词表 id</p>
     */
    public void setVocabId(String VocabId) {
        this.VocabId = VocabId;
    }

    /**
     * Get <p>是否设置为默认词表</p> 
     * @return State <p>是否设置为默认词表</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>是否设置为默认词表</p>
     * @param State <p>是否设置为默认词表</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>客户维度唯一标识</p> 
     * @return SdkAppId <p>客户维度唯一标识</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>客户维度唯一标识</p>
     * @param SdkAppId <p>客户维度唯一标识</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    public SetVocabStateV3Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetVocabStateV3Request(SetVocabStateV3Request source) {
        if (source.VocabId != null) {
            this.VocabId = new String(source.VocabId);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VocabId", this.VocabId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);

    }
}

