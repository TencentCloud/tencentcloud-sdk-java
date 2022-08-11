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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserMicStatus extends AbstractModel{

    /**
    * 用户ID
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * 是否开麦 。1闭麦  2开麦
    */
    @SerializedName("EnableMic")
    @Expose
    private Long EnableMic;

    /**
     * Get 用户ID 
     * @return Uid 用户ID
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set 用户ID
     * @param Uid 用户ID
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 是否开麦 。1闭麦  2开麦 
     * @return EnableMic 是否开麦 。1闭麦  2开麦
     */
    public Long getEnableMic() {
        return this.EnableMic;
    }

    /**
     * Set 是否开麦 。1闭麦  2开麦
     * @param EnableMic 是否开麦 。1闭麦  2开麦
     */
    public void setEnableMic(Long EnableMic) {
        this.EnableMic = EnableMic;
    }

    public UserMicStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserMicStatus(UserMicStatus source) {
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.EnableMic != null) {
            this.EnableMic = new Long(source.EnableMic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "EnableMic", this.EnableMic);

    }
}

