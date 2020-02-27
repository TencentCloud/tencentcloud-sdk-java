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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetVocabStateRequest extends AbstractModel{

    /**
    * 热词表ID。
    */
    @SerializedName("VocabId")
    @Expose
    private String VocabId;

    /**
    * 热词表状态，1：设为默认状态；0：设为非默认状态。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
     * Get 热词表ID。 
     * @return VocabId 热词表ID。
     */
    public String getVocabId() {
        return this.VocabId;
    }

    /**
     * Set 热词表ID。
     * @param VocabId 热词表ID。
     */
    public void setVocabId(String VocabId) {
        this.VocabId = VocabId;
    }

    /**
     * Get 热词表状态，1：设为默认状态；0：设为非默认状态。 
     * @return State 热词表状态，1：设为默认状态；0：设为非默认状态。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 热词表状态，1：设为默认状态；0：设为非默认状态。
     * @param State 热词表状态，1：设为默认状态；0：设为非默认状态。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VocabId", this.VocabId);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

